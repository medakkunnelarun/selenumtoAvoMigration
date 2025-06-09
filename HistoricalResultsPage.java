package com.unity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.unity.constants.AppConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityGridElement;
import com.unity.customelements.UnityWebElement;

public class HistoricalResultsPage extends BaseTestPage {

	WebDriver driver;

	public HistoricalResultsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}

	@FindBy(xpath = "//div[@role='grid']")
	public UnityGridElement gridHistoricalResults;

	@FindBy(xpath = "//button[@aria-label='Select accounts']")
	public UnityWebElement buttonSelectAccounts;

	@FindBy(xpath = "(//unity-grid//text-search-button-component//input)[2]")
	public UnityWebElement textboxSearchAccount;

	@FindBy(xpath = "//button[@aria-label='Refresh']")
	public UnityWebElement buttonRefresh;

	@FindBy(xpath = "(//div[@role='grid'])[2]")
	public UnityGridElement gridByAccount;

	@FindBy(xpath = "//mat-select[@aria-label='Date Filter']")
	public UnityWebElement dropdownDate;

	@FindBy(xpath = "//mat-option/*[contains(text(),'Prior Day')]")
	public UnityWebElement optionPriorDay;

	@FindBy(xpath = "//mat-option/*[contains(text(),'Prior Month')]")
	public UnityWebElement optionPriorMonth;

	@FindBy(xpath = "//span[contains(text(),'08/31/2019')]")
	public UnityWebElement dropdownDate08Aug19;

	@FindBy(xpath = "//span[@class='text-search-alt-text ng-star-inserted']/parent::button")
	public UnityWebElement iconSearchPerformanceResult;

	@FindBy(xpath = "//input[@type='text']")
	public UnityWebElement textboxSearchPerformanceResult;

	@FindBy(xpath = "//div[@class='grid-panel' and @id='statement-select-accounts-by-account']")
	public UnityGridElement gridHistoricalResultsByAccount;

	@FindBy(xpath = "//div[@class='grid-panel' and @id='statement-select-accounts-by-account']")
	public UnityGridElement gridHistoricalResultsByRelationship;

	@FindBy(xpath = "//div[normalize-space(text())='By Relationship']")
	public UnityWebElement tabByRelationship;

	@FindBy(xpath = "//div[normalize-space(text())='By Account']")
	public UnityWebElement tabByAccount;

	@FindBy(xpath = "(//button[mat-icon])[2]")
	public UnityWebElement iconSearchAccount;

	@FindBy(xpath = "(//input[@aria-label='selectAll'])[1]")
	public UnityWebElement selectallcheckbox;

	@FindBy(xpath = "//a[normalize-space(text())='< Back']")
	public UnityWebElement linkBack;

	@FindBy(xpath = "//a[normalize-space(text())='Historical results']")
	public UnityWebElement linkBackToHistoricalResult;

	@FindBy(xpath = "//*[@aria-label='Export to CSV']")
	public UnityWebElement exportbutton;

	@FindBy(xpath = "//strong[normalize-space(text())='Account Name']")
	public UnityWebElement labelAccountName;

	@FindBy(xpath = "//strong[normalize-space(text())='Account Number']")
	public UnityWebElement labelAccountNumber;

	@FindBy(xpath = "//strong[normalize-space(text())='Date']")
	public UnityWebElement labelDate;

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
			Assert.fail("Timed out after " + AppConstants.PAGE_LOAD_TIMEOUT + " seconds");
		}
	}
}
