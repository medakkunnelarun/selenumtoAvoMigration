package com.unity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.unity.constants.AppConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityWebElement;

public class PendingActivityPage extends BaseTestPage {

	WebDriver driver;

	public PendingActivityPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}

	@FindBy(xpath = "//button[div[normalize-space(text())='Pending Fund Orders']]")
	public UnityWebElement tabPendingOrders;

	@FindBy(xpath = "//button[div[normalize-space(text())='Pending Frees']]")
	public UnityWebElement tabPendingFrees;

	@FindBy(xpath = "//button[div[normalize-space(text())='Pending Trade Executions']]")
	public UnityWebElement tabPendingTrades;

	@Override
	public void waitForPageToLoad() {
		startTime = System.currentTimeMillis();
		if (super.isPageLoaded(driver))
			try {
				endTime = System.currentTimeMillis();
				pageLoadTime = (endTime - startTime) / 1000;
			} catch (Exception e) {
				Assert.fail("Expected page did not load\n");
			}
		else {
			Assert.fail("Timed out after " + AppConstants.PAGE_LOAD_TIMEOUT + " seconds\n");
		}
	}
}
