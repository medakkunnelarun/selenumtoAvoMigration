package com.unity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.unity.constants.AppConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityGridElement;
import com.unity.customelements.UnityWebElement;

public class SelectClientPage extends BaseTestPage {

	WebDriver driver;

	public SelectClientPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}

	@FindBy(xpath = "//*[normalize-space(text())='Access Recent Clients']")
	public UnityWebElement tabAccessRecentClients;

	@FindBy(xpath = "//*[normalize-space(text())='Search Clients']")
	public UnityWebElement tabSearchClients;

	@FindBy(xpath = "(//div[@role='grid'])[2]")
	public UnityGridElement gridSearchClients;

	@FindBy(xpath = "//button[*[normalize-space(text())='Cancel']]")
	public UnityWebElement buttonCancel;

	@Override
	public void waitForPageToLoad() {
		startTime = System.currentTimeMillis();
		if (!super.isPageLoaded(driver))
			Assert.fail("Timed out after " + AppConstants.PAGE_LOAD_TIMEOUT + " seconds\n");
	}

}
