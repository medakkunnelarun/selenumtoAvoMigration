package com.unity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.unity.constants.AppConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityGridElement;
import com.unity.customelements.UnityWebElement;

public class PerformanceReportsPage extends BaseTestPage {

	WebDriver driver;

	public PerformanceReportsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}

	@FindBy(xpath = "//a[@class='inlineFlexDisplay']")
	public UnityWebElement dropdownDate;

	@FindBy(xpath = "//input[@type='text']")
	public UnityWebElement textSearchBox;

	@FindBy(xpath = "//small[@class='ng-star-inserted']")
	public UnityWebElement elemEntityName;

	@FindBy(xpath = "//i[normalize-space(text())='expand_more']")
	public UnityWebElement linkExpandMore;

	@FindBy(xpath = "//span[normalize-space(text())='All Dates']/preceding-sibling::div/input")
	public UnityWebElement checkboxAllDates;

	@FindBy(xpath = "//button[@id='date-filter-go']")
	public UnityWebElement btnDateGo;

	@FindBy(xpath = "//button[@id='date-filter-cancel']")
	public UnityWebElement btnDateCancel;

	@FindBy(xpath = "//span[contains(@class,'text-search-alt')]")
	public UnityWebElement searchIcon;

	@FindBy(xpath = "//span[normalize-space(text())='Select accounts']")
	public UnityWebElement selectAccountIcon;

	@FindBy(xpath = "//div[normalize-space(text())='By Relationship']")
	public UnityWebElement tabByRelationship;
	
	@FindBy(xpath = "//div[normalize-space(text())='By Account']")
	public UnityWebElement tabByAccount;

	@FindBy(xpath = "(//div[@role='grid'])[2]")
	public UnityGridElement gridPerformanceResultsByAccount;

	@FindBy(xpath = "//button[@aria-label='Refresh']")
	public UnityWebElement btnRefresh;

	@FindBy(xpath = "//div[@class='grid-panel']")
	public UnityGridElement gridPerformanceReports;

	@FindBy(xpath = "//a[normalize-space(text())='< Performance']")
	public UnityWebElement linkPerformance;

	@FindBy(xpath = "//unity-grid-column-filter/button")
	public UnityWebElement buttonFilter;
	
	@FindBy(xpath = "//*[@aria-label='Export to CSV']")
	public UnityWebElement exportbutton;
	
	@FindBy(xpath = "(//unity-grid//text-search-button-component//input)[2]")
	public UnityWebElement textboxSearchAccount;
	
	@FindBy(xpath = "(//button[*[normalize-space(text())='Search']])[2]")
	public UnityWebElement iconSearchAccount;
	
	@FindBy(xpath = "//mat-checkbox[@aria-label='selectAll']")
	public UnityWebElement selectallcheckbox;

	@Override
	public void waitForPageToLoad() {
		startTime = System.currentTimeMillis();
		if (super.waitforAjaxtoComplete(driver))
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