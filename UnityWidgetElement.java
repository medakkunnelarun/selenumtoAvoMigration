package com.unity.customelements;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.unity.constants.AppConstants;
import com.unity.utilities.UnityUtils;

/**
 * UnityWidgetElement is a CustomWebElement developed to handle UI widget
 * functions with ease. It provides direct access to helper methods to perform
 * certain functions on widgets.
 * 
 * @author e5562312 neerajM
 *
 */
public class UnityWidgetElement extends CustomWebElement {

	protected Logger log = LogManager.getLogger();

	/**
	 * Constructor
	 *
	 * @param webDriver
	 *            The webDriver used to interact with the web browser.
	 * @param by
	 *            The locator used to identify the element(s) on the website.
	 **/
	public UnityWidgetElement(WebDriver webDriver, By by) {
		super(webDriver, by);
	}

	/**
	 * This method converts CustomWebElement and returns default WebElement
	 * 
	 * @return WebElement
	 */
	public WebElement getElement() {
		return getWebDriver().findElement(getBy());
	}

	/**
	 * Finds an element which uses the locator of this element as base.
	 *
	 * @return The found sub web element of this complex web element.
	 **/
	public WebElement findElement(By locator) {
		return getElement().findElement(locator);
	}

	/**
	 * Finds elements which uses the locator of this element as base.
	 *
	 * @return The found sub web elements of this complex web element.
	 **/
	public List<WebElement> findElements(By locator) {
		return getElement().findElements(locator);
	}

	/**
	 * Is this element displayed or not? This method avoids the problem of having to
	 * parse an element's "style" attribute.
	 *
	 * @return Whether or not the element is displayed
	 */
	public boolean isDisplayed() {
		return getElement().isDisplayed();
	}

	/**
	 * This method returns true or false based on the element is present in DOM or
	 * not. It avoids NoSuchElementException by not calling the isDisplayed() method
	 * on element.
	 *
	 * @return Whether or not the element is present in DOM
	 */
	public boolean isPresent() {
		return getWebDriver().findElements(getBy()).isEmpty() ? false : true;
	}

	/**
	 * This method verifies if a given element is visible on screen. If not, it will
	 * throw an AssertionError.
	 */
	public void assertVisible() {
		waitforVisible();
		Assert.assertTrue(getElement().isDisplayed(), "Widget is not visible on screen");
	}

	/**
	 * This method verifies if a given table is not visible on screen. If visible,
	 * it will throw an AssertionError.
	 */
	public void assertNotVisible() {
		boolean flag = false;
		try {
			getElement().isDisplayed();
		} catch (Exception e) {
			flag = true;
		}
		Assert.assertTrue(flag, "Unwanted widget is visible on screen");
	}

	public WebElement waitforVisible() {
		WebDriverWait wait = new WebDriverWait(getWebDriver(), Duration.ofSeconds(AppConstants.WAIT_TIMEOUT));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(getBy()));
	}
	
	public void widgetscroll() {
		UnityUtils.wait(2000);
		waitforVisible();
		JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
		js.executeScript("arguments[0].scrollIntoView();", getElement());
	}

	public List<WebElement> getWidgetHeaderWebElements() {
		return getElement().findElements(By.xpath(".//div[@class='table-header']/div/div"));
	}

	public List<String> getWidgetHeaderNames() {
		return getWidgetHeaderWebElements().stream().map(WebElement::getText).collect(Collectors.toList());
	}

	public List<WebElement> getWidgetColumnWebElements(String columnName) {
		List<WebElement> columnWebElements = new ArrayList<>();
		List<String> columnHeaders = getWidgetHeaderNames();
		for (int i = 0; i < columnHeaders.size(); i++) {
			if (columnHeaders.get(i).length() > 0 && columnHeaders.get(i).trim().equals(columnName)) {
				i++;
				columnWebElements = getElement()
						.findElements(By.xpath(".//div[@class='table-body']/div/div[" + i + "]"));
				log.info("Captured elements of column : " + columnName);
				break;
			}
		}
		return columnWebElements;
	}

	public List<String> getWidgetColumnValues(String columnName) {
		List<WebElement> columnWebElements = getWidgetColumnWebElements(columnName);
		List<String> columnUiValues = new ArrayList<>();
		String uiValue = null;
		for (WebElement element : columnWebElements) {
			uiValue = element.getText().trim();
			// remove this check after the defect is fixed
			if (uiValue.equals("End of List"))
				continue;
			if (!uiValue.equals(columnName)) {
				if(!(columnName.contains("Name"))) {
				if (uiValue.length() > 0 && (columnName.contains("Value") || (columnName.contains("Amount")))) {
					uiValue = element.getText().replaceAll(",", "");
					uiValue = uiValue.replace("$", "");
					uiValue = uiValue.replace("USD", "");
					uiValue = uiValue.replace("CAD", "");
					uiValue = uiValue.replace("£", "");
					uiValue = uiValue.replace("GBP", "");
					uiValue = uiValue.replace("¥", "");
					uiValue = uiValue.replace("JPY", "");
					uiValue = formatUiValue(uiValue.trim());
				} else {
					uiValue = formatUiValue(uiValue.trim());
				}
				}
				if (!uiValue.trim().isEmpty())
					columnUiValues.add(uiValue);
			}
		}
		return columnUiValues;
	}

	public Map<String, List<String>> getWidgetUiValuesMap() {
		Map<String, List<String>> uiValuesMap = new HashMap<>();
		List<String> headers = getWidgetHeaderNames();
		for (String header : headers) {
			if (header.length() > 0) {
				uiValuesMap.put(header, getWidgetColumnValues(header));
			}
		}
		log.info("Got UI Values in map");
		return uiValuesMap;
	}

	/**
	 * This method takes Ui values and their mapping to JSON attributes to form a
	 * Map, which can be compared with formated JSON response map for validation
	 * 
	 * @author e5562312 neerajM
	 * 
	 * @param uiMapToServiceAttrib
	 *            - Mapping of Ui values to JSON service attributes
	 * @param uiValuesMap
	 *            - Actual UI values map as seen on the page
	 * @return
	 */
	public Map<String, List<String>> getWidgetReponseMapper(Map<String, String> uiMapToServiceAttrib,
			Map<String, List<String>> uiValuesMap) {
		Map<String, List<String>> responseMapper = new HashMap<>();
		for (Map.Entry<String, String> entry : uiMapToServiceAttrib.entrySet()) {
			if (uiValuesMap.containsKey(entry.getKey())) {
				responseMapper.put(uiMapToServiceAttrib.get(entry.getKey()), uiValuesMap.get(entry.getValue()));
			}
		}
		return responseMapper;
	}

	public boolean isElementPresentInWidgetByText(String text) {
		WebDriverWait wait = new WebDriverWait(getWebDriver(), Duration.ofSeconds(AppConstants.WAIT_TIMEOUT));
		List<WebElement> list = wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath(".//*[normalize-space(text())='" + text + "']")));
		return !list.isEmpty();
	}

	private String formatUiValue(String uiValue) {
		if (uiValue.contains(".00"))
			uiValue = uiValue.replace(".00", "");
		if (uiValue.contains(","))
			uiValue = uiValue.replaceAll(",", "");
		if (uiValue.contains("%"))
			uiValue = uiValue.replaceAll("%", "");
		if (uiValue.contains(".")) {
			uiValue = uiValue.contains(".") ? uiValue.replaceAll("0*$","").replaceAll("\\.$","") : uiValue;
		}
//		if (uiValue.contains(".")) {
//			try {
//				BigDecimal decimal = new BigDecimal(uiValue).stripTrailingZeros();
//				uiValue = decimal.toPlainString();
//			} catch (NumberFormatException e) {
//			}
//		}
		if (uiValue.contains("/")) {
			try {
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yy");
				LocalDate date = LocalDate.parse(uiValue.trim(), dtf);
				dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
				uiValue = date.format(dtf);
			} catch (DateTimeParseException e) {
			}
		}
		return uiValue.trim();
	}
}
