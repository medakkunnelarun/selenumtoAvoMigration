package com.unity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.unity.constants.AppConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityWebElement;

public class PlanDetailsPage extends BaseTestPage {
	WebDriver driver;

	public PlanDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}
	
	@FindBy(xpath = "//*[normalize-space(text())='Plan Information']")
	public UnityWebElement tabPlanInfo;
	
	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Basic Information']]")
	public UnityWebElement panelBasicInformation;
	
	@FindBy(xpath = "//span[normalize-space(text())='Tax ID Number']")
	public UnityWebElement labelTaxIdKey;
	
	@FindBy(xpath = "//span[normalize-space(text())='State ID Number']")
	public UnityWebElement labelStateIdKey;
	
	@FindBy(xpath = "//span[normalize-space(text())='Tax ID Number']/following-sibling::span")
	public UnityWebElement labelTaxIdValue;
	
	@FindBy(xpath = "//span[normalize-space(text())='State ID Number']/following-sibling::span")
	public UnityWebElement labelStateIdValue;
	
	@Override
	public void waitForPageToLoad() {
		startTime = System.currentTimeMillis();
		if (super.isPageLoaded(driver))
			try {
				tabPlanInfo.waitforVisible(AppConstants.PAGE_LOAD_TIMEOUT);
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
