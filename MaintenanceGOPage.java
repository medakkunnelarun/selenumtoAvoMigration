package com.unity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.unity.constants.AppConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityWebElement;

public class MaintenanceGOPage extends BaseTestPage {

	WebDriver driver;

	public MaintenanceGOPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}

	@FindBy(xpath = "//mat-select[@role='listbox']")
	public UnityWebElement dropdownMaintenanceGo;
	
	@FindBy(xpath = "//div[contains(@class,'mat-select-panel mat-primary')]//mat-option")
	public UnityWebElement listMaintenanceGoDropdownOptions;
	
	@FindBy(xpath = "//span[normalize-space(text())='Document Categories']")
	public UnityWebElement optionDocumentCategories;
	
	
	@Override
	public void waitForPageToLoad() {
		startTime = System.currentTimeMillis();
		if (super.waitforAjaxtoComplete(driver))
			try {
				dropdownMaintenanceGo.waitforVisible(AppConstants.PAGE_LOAD_TIMEOUT);
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
