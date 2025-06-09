package com.unity.utilities;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.print.DocFlavor.READER;

import org.json.JSONObject;
import org.testng.Assert;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import com.unity.constants.AppConstants;

import io.restassured.path.json.config.JsonPathConfig;
import io.restassured.response.Response;

public class ResponseHandler {

	private ResponseHandler() {
		// Utility Class
	}

	public static Map<String, String> getPlainResponseAsMap(Response response) {
		Map<String, String> responseMap = new HashMap<>();
		Object responseObject = response.jsonPath().get("value");
		if (responseObject instanceof ArrayList<?>) {
//		if (responseObject instanceof JSONObject) {
			System.out.println("insideif responseMap 1: "+responseMap);
			List<Object> valueList = response.jsonPath(new JsonPathConfig(JsonPathConfig.NumberReturnType.BIG_DECIMAL)).getList("value");
			Assert.assertFalse(valueList.isEmpty(), "Value attribute is blank in response\n" + response.asString());
				JsonElement elm = JsonParser.parseString(valueList.get(0).toString());
				System.out.println("elm: "+ elm);
				JsonObject jsonObject = elm.getAsJsonObject();
				for (String key : jsonObject.keySet()) {
						responseMap.put(key, jsonObject.get(key).getAsString());
//					}
				}
				return formatPlainResponseMap(responseMap);								
		}
		System.out.println("Outsideif responseMap 1: "+responseMap);
		responseMap = response.jsonPath(new JsonPathConfig(JsonPathConfig.NumberReturnType.BIG_DECIMAL))
				.getMap("value");
		System.out.println("Outsideif responseMap 2: "+responseMap);
		Assert.assertFalse(responseMap.isEmpty(), "Response is blank");
		return formatPlainResponseMap(responseMap);
	}

	// To get the reponse in a map
	public static Map<String, List<String>> getArrayResponseAsMap(Response response) {
		JsonElement elm = JsonParser.parseString(response.asString());
		JsonObject jsonObject = elm.getAsJsonObject();
		JsonElement valueElement = jsonObject.get("value");

		Map<String, List<String>> responseMap = new HashMap<>();
		Map<String, String> tempResposeMap = new HashMap<>();
		JsonArray valueArray = valueElement.getAsJsonArray();
		// add level 2 keys here in advance so that they can be mapped
		responseMap.put("affiliationDetails", new ArrayList<>());
		for (JsonElement jsonElement : valueArray) {
			JsonObject valueObject = jsonElement.getAsJsonObject();
			Set<String> attributeKeys = valueObject.keySet();
			// All level 2 values would go inside level 1 key, ignoring level 2 keys
			for (String attributeKey : attributeKeys) {
				if (attributeKey.equals("request")) {
					continue;
				}
				JsonElement attributeElement = valueObject.get(attributeKey);
				if (attributeElement.isJsonArray()) {
					JsonArray attributeArray = attributeElement.getAsJsonArray();
					List<String> values = new ArrayList<>();
					String value = "";
					for (JsonElement l2AttributeElement : attributeArray) {
						value = "";
						// Added if condition
						if (!l2AttributeElement.isJsonObject()) {
							tempResposeMap.put(attributeKey, l2AttributeElement.getAsString());
						} else {
							JsonObject l2attributeObject = l2AttributeElement.getAsJsonObject();
							Set<String> l2attributeKeys = l2attributeObject.keySet();
							for (String l2Key : l2attributeKeys) {
								// here we can ignore unwanted l2 keys, currently l2 is applicable for
								// Affiliations only
								if (AppConstants.APPLICATION_ENV.contains("ad")
										|| AppConstants.APPLICATION_ENV.contains("td")) {
									if (l2Key.equals("acPtNumber")) {
										value = l2attributeObject.get(l2Key).toString();
									}
								} else if (l2Key.equals("acPtNumber") || l2Key.equals("relTypeName")) {
									value += l2attributeObject.get(l2Key).toString();
								}
							}
							// Replacing double quotes which got generated due to String concatenation
							System.out.println("value:" +value);
							values.add(value.replace("\"\"", " ").replace("\"", ""));
							responseMap.get(attributeKey).addAll(values);
						}
					}

				} else {
					tempResposeMap.put(attributeKey, attributeElement.toString());
				}
			}
			String key;
			String value;
			ArrayList<String> tempList = new ArrayList<>();
			for (Map.Entry<String, String> entry : tempResposeMap.entrySet()) {
				key = entry.getKey();
				//System.out.println("value:"+entry.getValue());
				value = entry.getValue().replace("\"", "");
				if (value != null) {
					if (!responseMap.containsKey(entry.getKey())) {
						tempList.add(value.trim());
						responseMap.put(key, tempList);
						tempList = new ArrayList<>();
					} else {
						tempList.add(value.trim());
						responseMap.get(key).addAll(tempList);
						tempList = new ArrayList<>();
					}
				}
				value ="";
			}
		}
		return formatArrayResponseMap(responseMap);
	}

	// to format plainResponseMapValues
	public static Map<String, String> formatPlainResponseMap(Map<String, String> responseMap) {
		Map<String, String> formatRepsonseMap = new HashMap<>();
		String key = null;
		String value = null;
		try {
			for (Map.Entry<String, String> entry : responseMap.entrySet()) {
				key = entry.getKey();
				// Directly getting value will give integer to String cast exception
				value = entry.toString().substring(entry.toString().indexOf('=') + 1);
				System.out.println("original value:"+value);
				if(!(key.toLowerCase().contains("name"))) {
				if (value.endsWith(".00")) {
					value = value.replace(".00", "").trim();
				} else if (value.endsWith(".0")) {
					value = value.replace(".0", "").trim();
				} else if (value.equalsIgnoreCase("false")) {
					value = "No";
				} else if (value.equalsIgnoreCase("true")) {
					value = "Yes";
				} else if (value.contains(".")) {
					if(!(value.contains("E"))) {
					try {
						System.out.println("decimal value:"+value);
						BigDecimal decimal = new BigDecimal(value).stripTrailingZeros();
						value = decimal.toPlainString();
						System.out.println("after decimal value:"+value);
						
					} catch (NumberFormatException e) {
						// Do nothing if uivalue is not a number
					}
					}else {
						value =new BigDecimal(value).toPlainString();
					}
				} else if ((key.contains("date") || key.contains("Date") || key.toLowerCase().contains("asof"))
						&& value.contains("T") && !value.contains("&")&& !value.contains("Year")&& !value.contains("YearsAgo")) {
					value = value.substring(0, value.indexOf('T'));
					Date date = new SimpleDateFormat("yyyy-MM-dd").parse(value);
					SimpleDateFormat form = new SimpleDateFormat("MM/dd/yyyy");
					value = form.format(date);
					Calendar cal = Calendar.getInstance();
					cal.setTime(date);
					int year = cal.get(Calendar.YEAR);
					if (!(year < 9999 && year > 1900))
						value = "";
				}
				}
				formatRepsonseMap.put(key, value);
			
		}
			return formatRepsonseMap;
		} catch (ParseException e) {
			e.printStackTrace();
			Assert.fail("", e.getCause());
			return null;
		}
	}

	// to format responseMapValues, may be we can format individual values
	public static Map<String, List<String>> formatArrayResponseMap(Map<String, List<String>> responseMap) {
		Map<String, List<String>> formatRepsonseMap = new HashMap<>();
		String key = null;
		List<String> values = new ArrayList<>();
		try {
			for (Map.Entry<String, List<String>> entry : responseMap.entrySet()) {
				key = entry.getKey();
				for (String value : entry.getValue()) {
					if(!(key.toLowerCase().contains("name"))||(key.toLowerCase().contains("branchname"))) {
					if (value.endsWith(".00")) {
						value = value.replace(".00", "").trim();
					} else if (value.endsWith(".0")) {
						value = value.replace(".0", "").trim();
					} else if (value.equalsIgnoreCase("false")) {
						value = "No";
					} else if (value.equalsIgnoreCase("true")) {
						value = "Yes";
					} else if (value.contains("\\\"")) {
						//System.out.println("Inside the if format");
						value = value.replace("\\\"", "\"");
					}else if (value.contains(",")) {
							value = value.replace(",", "").trim();
					}
//					else if (value.endsWith(" ")) {
//						value = value.replace(" ", "").trim();
//				}
					else if (value.contains("\\")) {
						//System.out.println("Inside the if format");
						value = value.replace("\\", "");
					}else if ((key.toLowerCase().contains("date"))|| (key.toLowerCase().contains("asof")) ||((key.toLowerCase().contains("date")) && (value.contains("T")))) {
						if(key.toLowerCase().equals("startDateTime")||key.toLowerCase().equals("endDateTime")) {
							values.add(value);
							break;
						}
						//System.out.println("In thedate format area for:"+key.toLowerCase());
						try {
							String dateValue = value.substring(0, value.indexOf('T'));
							Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateValue);
							SimpleDateFormat form = new SimpleDateFormat("MM/dd/yyyy");
							dateValue = form.format(date);
							Calendar cal = Calendar.getInstance();
							cal.setTime(date);
							int year = cal.get(Calendar.YEAR);
//							if (!(year < 9999 && year > 1900)) {
//								dateValue = "";
//							}
							System.out.println("Previous value:"+value+" New value:"+dateValue);
							value = dateValue;
						} catch (Exception e) {
							System.out.println(e);
							// Do nothing if uivalue is not a date
						}
					} else if (value.contains(".")) {
						try {
							System.out.println("value before:"+ value);
							BigDecimal decimal = new BigDecimal(value).stripTrailingZeros();
//							decimal.round(null)
							
//							double d = Double.parseDouble(value);
							if(decimal.scale() > 2 || decimal.scale()<2)
							{
								System.out.println("in decimal 2 places");
								decimal = decimal.setScale(2, RoundingMode.HALF_UP);
//								d = Math.round(d * 100);
//								d = d/100;
							}
							value = decimal.toPlainString();
							System.out.println("value after:"+ value);
						} catch (NumberFormatException e) {
							// Do nothing if uivalue is not a number
						}
					}
					
					if (key.toLowerCase().equals("eventnumber") && value.contains("  ")){
//						System.out.println("Event number if value: "+value);
						value = value.replaceAll("  ", " ");
//						System.out.println("Event number replace value: "+value);
					}
					}
					values.add(value);
				}
				
				System.out.println("values list:"+values);
//				System.out.println("values list:"+Arrays.toString(values.toArray()));
				formatRepsonseMap.put(key, values);
				values = new ArrayList<>();
			}
			return formatRepsonseMap;
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("", e.getCause());
			return null;
		}
	}
}
