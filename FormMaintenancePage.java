package com.unity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.unity.constants.AppConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityGridElement;
import com.unity.customelements.UnityWebElement;

public class FormMaintenancePage extends BaseTestPage {

	WebDriver driver;

	public FormMaintenancePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}

	@FindBy(xpath = "//div[@role='grid']")
	public UnityGridElement gridCurrentForms;

	@FindBy(xpath = "//*[normalize-space(text())='Tools']")
	public UnityWebElement headerTools;

	@FindBy(xpath = "//mat-select[@role='listbox']")
	public UnityWebElement dropdownDepartments;

	@FindBy(xpath = "//span[normalize-space(text())='sales']")
	public UnityWebElement optionSales;

	@FindBy(css = "div[role='grid']")
	public UnityGridElement gridRules;

	@FindBy(xpath = "//*[normalize-space(text())='Edit Rule']")
	public UnityWebElement headerEditRule;

	@Override
	public void waitForPageToLoad() {
		startTime = System.currentTimeMillis();
		if (!super.isPageLoaded(driver))
			Assert.fail("Timed out after " + AppConstants.PAGE_LOAD_TIMEOUT + " seconds\n");
	}
}
