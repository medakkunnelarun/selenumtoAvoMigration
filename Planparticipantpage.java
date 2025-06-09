package com.unity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.unity.constants.AppConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityGridElement;
import com.unity.customelements.UnityWebElement;


public class Planparticipantpage extends BaseTestPage {

	WebDriver driver;

	public Planparticipantpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}

	@FindBy(css = "div[role='grid']")
	public UnityGridElement gridPlanParticipantList;
	
	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Address Line 1']]//input")
	public UnityWebElement checkboxAddressline1;
	
	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='City']]//input")
	public UnityWebElement checkboxCity;
	
	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Plan Number']]//input")
	public UnityWebElement checkboxPlanNumber;
	
	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Plan Short Name']]//input")
	public UnityWebElement checkboxPlanShortName;
	
	
	// header
	@FindBy(xpath = "//div[normalize-space(text())='Unity']")
	public UnityWebElement headerUnity;
	
	
	@Override
	public void waitForPageToLoad() {
		startTime = System.currentTimeMillis();
		if (super.isPageLoaded(driver))
			try {
				headerUnity.waitforVisible(AppConstants.PAGE_LOAD_TIMEOUT);
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
