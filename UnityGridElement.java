package com.unity.customelements;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.unity.browsers.LocalDriverContext;
import com.unity.constants.AppConstants;
import com.unity.utilities.UnityUtils;
import com.unity.utilities.WebServicesHandler;

/**
 * UnityGridElement is a CustomWebElement developed to handle UI grid functions
 * with ease. It provides direct access to helper methods to perform certain
 * functions on grid.
 * 
 * @author e5562312 neerajM
 *
 */
public class UnityGridElement extends CustomWebElement {
	protected Logger log = LogManager.getLogger();

	/**
	 * Constructor
	 *
	 * @param webDriver
	 *            The webDriver used to interact with the web browser.
	 * @param by
	 *            The locator used to identify the element(s) on the website.
	 **/
	public UnityGridElement(WebDriver webDriver, By by) {
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

	public List<WebElement> getGridColumnHeaderWebElements() {
		return getElement().findElements(By.xpath(".//div[contains(@class,'ag-cell-label-container')]/div/span[1]"));
	}

	public List<String> getGridColumnHeaderNames() {
		return getGridColumnHeaderWebElements().stream().map(WebElement::getText).collect(Collectors.toList());
	}

	public List<WebElement> getGridColumnWebElements(String columnName) {
		List<WebElement> columnWebElements = new ArrayList<>();
		List<String> columnHeaders = getGridColumnHeaderNames();
		//int totalRow = Integer.valueOf(getElement().findElement(By.xpath("//div[@data-ref='gridBody']")).getAttribute("aria-rowcount"))-1;
		
		for (int i = 0; i < columnHeaders.size(); i++) {
			System.out.println("column header: "+columnHeaders.get(i).trim());
			if (columnHeaders.get(i).length() > 0 && columnHeaders.get(i).trim().equals(columnName)) {
				System.out.println("value of i:"+i);
				i++;
				if (!getElement()
						.findElements(By.xpath(
								".//div[@role='row']/div[@role='gridcell']//div[@class='ag-selection-checkbox']"))
						.isEmpty()) {
					i++;
				}
				System.out.println("value of i inside:"+i);
				columnWebElements = getElement()
						.findElements(By.xpath(".//div[@role='row']/div[@role='gridcell'][" + i + "]"));
				log.info("Captured elements of column : " + columnName+" and i:"+i);
				break;
				}
		}
		return columnWebElements;
	}

	public List<String> getGridColumnValues(String columnName) {
		waitforVisible();
		
		List<WebElement> columnWebElements = getGridColumnWebElements(columnName);
		List<String> columnUiValues = new ArrayList<>();
		String uiValue = null;
		String val1 = null;
		String val2 = null;
		for (WebElement element : columnWebElements) {
			val1 = element.getText().trim();
			System.out.println("val1:"+val1);
			val2 = element.getAttribute("title");
			System.out.println("val2:"+val2);
			if(val1.length() > 0) {
				uiValue = val1;
			}else {
				uiValue = val2;
			}
				System.out.println("uiValue: "+uiValue);
			if (!uiValue.equals(columnName) && uiValue.length() > 0) {
//				if ((!(columnName.contains("Name"))|| columnName.equalsIgnoreCase("Branch Name")) && !(columnName.equalsIgnoreCase("Transaction Information"))&& !(columnName.equalsIgnoreCase("Fee Schedule Description")) &&!(columnName.equalsIgnoreCase("Explanation"))) {
				if (!(columnName.contains("Name"))) {
//					System.out.println("in if of format function");
					uiValue = formatUiValue(uiValue);
				}
//				System.out.println("after format function: "+uiValue);
				columnUiValues.add(uiValue.trim());
			}
			
		}
		return columnUiValues;
	}
	
	public List<String> getGridColumnValueswithPages(String columnName) {
		waitforVisible();	
		List<String> columnUiValues = new ArrayList<>();
		String uiValue = null;
		String val1 = null;
		String val2 = null;
		String pages = getElement().findElement(By.xpath("//*[@data-ref='lbTotal']")).getText();
		for(int i=1;i<=Integer.valueOf(pages);i++) {
		List<WebElement> columnWebElements = getGridColumnWebElements(columnName);
		for (WebElement element : columnWebElements) {
			val1 = element.getText().trim();
			System.out.println("val1:"+val1);
			val2 = element.getAttribute("title");
			System.out.println("val2:"+val2);
			if(val1.length() > 0) {
				uiValue = val1;
			}else {
				uiValue = val2;
			}
				System.out.println("uiValue: "+uiValue);
			if (!uiValue.equals(columnName) && uiValue.length() > 0) {
//				if ((!(columnName.contains("Name"))|| columnName.equalsIgnoreCase("Branch Name")) && !(columnName.equalsIgnoreCase("Transaction Information"))&& !(columnName.equalsIgnoreCase("Fee Schedule Description")) &&!(columnName.equalsIgnoreCase("Explanation"))) {
				if (!(columnName.contains("Name"))) {
//					System.out.println("in if of format function");
					uiValue = formatUiValue(uiValue);
				}
//				System.out.println("after format function: "+uiValue);
				columnUiValues.add(uiValue.trim());
			}
			
		}				
		resetGrid();
		waitforVisible();
		
	}
		return columnUiValues;
	}
	
	

	public List<String> getExpandableGridColumnValues(String columnName) {
		List<WebElement> columnWebElements = getGridColumnWebElements(columnName);
		List<String> columnUiValues = new ArrayList<>();
		List<WebElement> firstColumnElements = getElement()
				.findElements(By.xpath(".//div[@role='row']/div[@role='gridcell'][1]"));
		String uiValue = null;
		for (int i = 0; i < columnWebElements.size(); i++) {
			uiValue = columnWebElements.get(i).getText().trim();
//			System.out.println("ui original:"+uiValue);
			if(!(columnName.equalsIgnoreCase("Percent")&& uiValue.equalsIgnoreCase("100.00"))) {
			if (!firstColumnElements.get(i).findElements(By.xpath(".//i")).isEmpty()) {
				continue;
			} else if (!uiValue.equals(columnName) && uiValue.length() > 0) {
				uiValue = uiValue.replace(",", "");
				
				uiValue = uiValue.replace("*", "").trim();
				if (uiValue.contains(".")) {
					try {
//						System.out.println("ui value before"+uiValue);
						BigDecimal decimal = new BigDecimal(uiValue).stripTrailingZeros();
						if(decimal.scale() > 2)
						{
							System.out.println("ui in decimal 2 places");
							decimal = decimal.setScale(2, RoundingMode.HALF_UP);
//							d = Math.round(d * 100);
//							d = d/100;
						}
//						value = decimal.toPlainString();
						uiValue = decimal.toPlainString();
//						System.out.println("ui value after"+uiValue);
					} catch (NumberFormatException e) {
					}
					uiValue = uiValue.replace(".00", "");
				}
				columnUiValues.add(uiValue);
			}
			}
		}
		System.out.println("Final ui value map: "+columnUiValues);
		return columnUiValues;
	}

	public Map<String, List<String>> getGridUiValuesMap() {
		Map<String, List<String>> uiValuesMap = new HashMap<>();
		List<String> headers = getGridColumnHeaderNames();
		for (String header : headers) {
			if (header.length() > 0) {
				uiValuesMap.put(header, getGridColumnValues(header));
			}
		}
		log.info("Got UI Values in map");
		return uiValuesMap;
	}
	public Map<String, List<String>> getGridUiValuesMapwithPages() {
		Map<String, List<String>> uiValuesMap = new HashMap<>();
		List<String> headers = getGridColumnHeaderNames();
		for (String header : headers) {
			if (header.length() > 0) {
				uiValuesMap.put(header, getGridColumnValueswithPages(header));
			}
		}
		log.info("Got UI Values in map");
		return uiValuesMap;
	}

	public Map<String, List<String>> getExpandableGridUiValuesMap() {
		Map<String, List<String>> uiValuesMap = new HashMap<>();
		List<String> headers = getGridColumnHeaderNames();
		for (String header : headers) {
			if (header.length() > 0) {
				uiValuesMap.put(header, getExpandableGridColumnValues(header));
			}
		}
		if (uiValuesMap.containsKey("Group By"))
			uiValuesMap.remove("Group By");
		return uiValuesMap;
	}

	public boolean IsElementPresentInGridByText(String text) {
		WebDriverWait wait = new WebDriverWait(getWebDriver(), Duration.ofSeconds(AppConstants.WAIT_TIMEOUT));
		List<WebElement> list = wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("(.//*[normalize-space(text())='" + text + "'])[1]")));
		return !list.isEmpty();
	}

	public void verifyElementPresentInGridByText(String text) {
		Assert.assertTrue(IsElementPresentInGridByText(text), "Account is not present in Grid");
	}

	public void clickElementInGridByText(String text) {
		WebDriverWait wait = new WebDriverWait(getWebDriver(), Duration.ofSeconds(AppConstants.WAIT_TIMEOUT));
		List<WebElement> list = wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath(".//*[normalize-space(text())='" + text + "']")));
		UnityUtils.jsClickWebElement(LocalDriverContext.getDriver(), list.get(0));
	}

	public WebElement waitforVisible() {
		WebDriverWait wait = new WebDriverWait(getWebDriver(), Duration.ofSeconds(AppConstants.WAIT_TIMEOUT));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(getBy()));
	}

	/**
	 * This method verifies if a given element is visible on screen. If not, it will
	 * throw an AssertionError.
	 */
	public void assertVisible() {
		waitforVisible();
		Assert.assertTrue(getElement().isDisplayed(), "Grid is not visible on screen");
	}

	/**
	 * This method verifies if a given element is not visible on screen. If visible,
	 * it will throw an AssertionError.
	 */
	public void assertNotVisible() {
		boolean flag = false;
		try {
			getElement().isDisplayed();
		} catch (Exception e) {
			flag = true;
		}
		Assert.assertTrue(flag, "Unwanted Grid is visible on screen");
	}
	
	public void resetGrid() {
		WebElement element = getElement().findElement(By.xpath("//div[@aria-label='Next Page']"));
		JavascriptExecutor executor = (JavascriptExecutor)LocalDriverContext.getDriver();
		executor.executeScript("arguments[0].click();", element);
	}

	private String formatUiValue(String uiValue) {
		if (uiValue.endsWith(".00"))
			uiValue = uiValue.replace(".00", "");
		if (uiValue.contains(","))
			uiValue = uiValue.replace(",", "");
//		if (uiValue.contains(" "))
//			uiValue = uiValue.replace(" ", "");
		if (uiValue.contains("≈≈≈")) {
			uiValue = uiValue.replace("≈≈≈", "").trim();
		}
		if (uiValue.contains("\"")) {
			//System.out.println("Inside the if format ui value");
			uiValue = uiValue.replace("\"", "");
		}
		if ((uiValue.contains("AM") || uiValue.contains("PM")) && uiValue.trim().contains(" ") && uiValue.trim().contains(":")) {
			uiValue = uiValue.substring(0, uiValue.indexOf(' '));
		}
		if (uiValue.contains(".")) {
			try {
				System.out.println("ui value before:"+ uiValue);
				BigDecimal decimal = new BigDecimal(uiValue).stripTrailingZeros();
				if(decimal.scale() > 2||decimal.scale()<2)
				{
					decimal = decimal.setScale(2, RoundingMode.HALF_UP);
				}
				uiValue = decimal.toPlainString();
				System.out.println("ui value after:"+ uiValue);
			} catch (NumberFormatException e) {
			}
		}
		return uiValue;
	}
}
