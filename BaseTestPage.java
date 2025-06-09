package com.unity.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.unity.constants.AppConstants;

public abstract class BaseTestPage {

	/**
	 * This method waits for JavaScript to properly load within a given
	 * PageLoadTimeout. Additionally, it calls waitUntilAngularReady method to check
	 * if Angular is ready.
	 * 
	 * @author e5562312 neerajM
	 * @param driver
	 * @return
	 */
	protected boolean isPageLoaded(WebDriver driver) {
		boolean isPageLoaded = waitforAjaxtoComplete(driver);
		waitUntilAngularReady(driver);
		waitForLoadingSpinner(driver);
		//System.out.println("isPageLoaded: "+isPageLoaded );
		return isPageLoaded;
	}

	/**
	 * This method waits for Angular to be ready within a given scriptTimeout by
	 * checking that there are no pending http requests in the queue.
	 * 
	 * @author e5562312 neerajM
	 * @param driver
	 */
	protected void waitUntilAngularReady(WebDriver driver) {
		try {
			if (!(Boolean) ((JavascriptExecutor) driver)
					.executeScript("return angular.element(document).injector(['ng']) === undefined")) {
				new WebDriverWait(driver, Duration.ofSeconds(AppConstants.SCRIPT_TIMEOUT))
						.until(webDriver -> ((JavascriptExecutor) webDriver)
								.executeScript("return angular.injector(['ng']).get('$http').pendingRequests.length"))
						.equals(0);
			}
		} catch (Exception e) {
			// Do nothing if angular is not defined on page
		}
	}

	protected boolean waitforAjaxtoComplete(WebDriver driver) {
		return new WebDriverWait(driver, Duration.ofSeconds(AppConstants.PAGE_LOAD_TIMEOUT))
				.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState")
						.equals("complete"));
	}

	protected void waitForLoadingSpinner(WebDriver driver) {
		// Unity loading spinner after login
		List<WebElement> loadingSpinner = driver.findElements(By.xpath("//div[@class='loader']"));
		if (!loadingSpinner.isEmpty()) {
			new WebDriverWait(driver, Duration.ofSeconds(AppConstants.PAGE_LOAD_TIMEOUT))
					.until(ExpectedConditions.invisibilityOf(loadingSpinner.get(0)));
		}
		/*loadingSpinner = driver.findElements(By.xpath("//unity-loader/*"));
		if (!loadingSpinner.isEmpty()) {
			new WebDriverWait(driver, AppConstants.PAGE_LOAD_TIMEOUT)
					.until(ExpectedConditions.invisibilityOf(loadingSpinner.get(0)));
		} */
		loadingSpinner = driver.findElements(By.xpath("//div[contains(@class,'load-spinner')]"));
		if (!loadingSpinner.isEmpty()) {
			new WebDriverWait(driver, Duration.ofSeconds(AppConstants.PAGE_LOAD_TIMEOUT))
					.until(ExpectedConditions.invisibilityOf(loadingSpinner.get(0)));
		}
		loadingSpinner = driver.findElements(By.xpath("//div[@id='ctlProcessingMessage']"));
		if (!loadingSpinner.isEmpty()) {
			new WebDriverWait(driver, Duration.ofSeconds(AppConstants.PAGE_LOAD_TIMEOUT))
					.until(ExpectedConditions.invisibilityOf(loadingSpinner.get(0)));
		}
		// Doashboard widget spinner
		loadingSpinner = driver.findElements(By.xpath("//mat-progress-spinner"));
		if (!loadingSpinner.isEmpty()) {
			new WebDriverWait(driver, Duration.ofSeconds(AppConstants.PAGE_LOAD_TIMEOUT))
					.until(ExpectedConditions.invisibilityOfAllElements(loadingSpinner));
		}
		//Loading text inside grid
		loadingSpinner = driver.findElements(By.xpath("//span[normalize-space(text())='Loading']"));
		if (!loadingSpinner.isEmpty()) {
			new WebDriverWait(driver, Duration.ofSeconds(AppConstants.PAGE_LOAD_TIMEOUT))
					.until(ExpectedConditions.invisibilityOfAllElements(loadingSpinner));
		}
	}

	protected long startTime = 0;
	protected long endTime = 0;
	protected long pageLoadTime = 0;

	public abstract void waitForPageToLoad();
}
