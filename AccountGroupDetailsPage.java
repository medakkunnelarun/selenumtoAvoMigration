package com.unity.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.unity.constants.AppConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityGridElement;
import com.unity.customelements.UnityTableElement;
import com.unity.customelements.UnityWebElement;

public class AccountGroupDetailsPage extends BaseTestPage {
	WebDriver driver;

	public AccountGroupDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}
	
	@FindBy(xpath = "//div[span[text()='Affiliation Name']]")
	public UnityWebElement headerAffiliationName;
	
	@FindBy(xpath = "//div[span[text()='Affiliation Name']]/preceding-sibling::span/*")
	public UnityWebElement menuFeeGroup;

	@FindBy(xpath = "//ruf-page-header-title")
	public UnityWebElement labelAccountGroupNameHeader;

	@FindBy(xpath = "//*[normalize-space(text())='Asset Allocation']/ancestor::mat-card//button[@aria-label]")
	public UnityWebElement panelAssetAllocation;

	@FindBy(xpath = "//h2/following-sibling::small")
	public List<WebElement> labelheaderKeys;

	@FindBy(xpath = "//div/h2")
	public List<WebElement> labelheaderValues;

	@FindBy(xpath = "//button[following-sibling::mat-menu[@id='entity-information-select-menu']]")
	public UnityWebElement labelViewBy;

	@FindBy(xpath = "//button[span[normalize-space(text())='Minor Security']]")
	public UnityWebElement linkMinorSecurity;

	@FindBy(xpath = "//button[span[normalize-space(text())='Major Security']]")
	public UnityWebElement linkMajorSecurity;

	@FindBy(xpath = "//div[contains(@class,'asset-allocation')]//table")
	public UnityTableElement tableAssetAllocation;

	// Account group grid header
	@FindBy(xpath = "(//div[@role='grid'])[0]")
	public UnityGridElement gridAccountGroupInformation;

	@FindBy(xpath = "//span[normalize-space(text())='Portfolio Number']")
	public UnityWebElement headerAccountGroupPortfolionumber;

	@FindBy(xpath = "//span[normalize-space(text())='Portfolio Name']")
	public UnityWebElement headerAccountGroupPortfolioname;

	@FindBy(xpath = "//span[normalize-space(text())='Portfolio Currency']")
	public UnityWebElement headerAccountGroupPortfoliocurrency;

	@FindBy(xpath = "//span[normalize-space(text())='Account Number']")
	public UnityWebElement headerAccountGroupAccountNumber;
	                       
	@FindBy(xpath = "//span[normalize-space(text())='Base Currency']")
	public UnityWebElement headerAccountGroupBasecurrency;

	// Account group filter
	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Portfolio Name']]//input")
	public UnityWebElement checkboxPortfolioname;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Account Number']]//input")
	public UnityWebElement checkboxAccountnumber;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Base Currency']]//input")
	public UnityWebElement checkboxBaseCurrency;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Portfolio Currency']]//input")
	public UnityWebElement checkboxPortfoliocurrency;

	@FindBy(xpath = "//*[@aria-label='Export to CSV']")
	public UnityWebElement buttonExportToCSV;

	@FindBy(xpath = "//unity-print-upgrade/button")
	public UnityWebElement buttonPrint;

	@FindBy(xpath = "//button[normalize-space(text())='Print Current Page']")
	public UnityWebElement buttonPrintCurrentPage;

	@FindBy(xpath = "//span[normalize-space(text())='✕']")
	public UnityWebElement buttonFilterClose;

	@FindBy(xpath = "//*[contains(text(),'Total Market Value')]")
	public UnityWebElement labelTotalMarketValue;

	@FindBy(xpath = "//*[contains(text(),'Cash Value')]")
	public UnityWebElement labelCashValue;

	@FindBy(xpath = "//*[contains(text(),'Net Annualized Return')]")
	public UnityWebElement labelNetAnnualizedReturn;
	
    @FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Account Name']]//input")
    public UnityWebElement checkboxAccountName;

    @Override
	public void waitForPageToLoad() {
		startTime = System.currentTimeMillis();
		if (super.isPageLoaded(driver))
			try {
				panelAssetAllocation.waitforVisible(AppConstants.PAGE_LOAD_TIMEOUT);
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
