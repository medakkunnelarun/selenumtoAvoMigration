package com.unity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.unity.constants.AppConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityGridElement;
import com.unity.customelements.UnityWebElement;

public class FeeActivityPage extends BaseTestPage {

	WebDriver driver;

	public FeeActivityPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}

	@FindBy(xpath = "//ag-grid-angular")
	public UnityGridElement gridFeeActivity;
	
	@FindBy(xpath = "//book-of-business-checkbox//mat-select")
	public UnityWebElement dropDownBookOfBusiness;
	
	@FindBy(xpath = "(//book-of-business-checkbox//mat-select//div[2])")
	public UnityWebElement dropDownBookOfBusinessArrow;
	
	@FindBy(xpath = "//mat-option//span[text()='Reg 24.3']")
	public UnityWebElement optionDefaultBOB;
	
	@FindBy(xpath = "//mat-option//span[text()='new bob']")
	public UnityWebElement optionNewBob;
	
	@FindBy(xpath = "//mat-option//span[text()='test']")
	public UnityWebElement optionTest;
	
	@FindBy(xpath = "//transaction-details")
	public UnityWebElement panelTransactionSummary;
	
	@FindBy(xpath = "//transaction-detail-popup")
	public UnityWebElement panelTransactionDetail;
	
	@FindBy(xpath = "//transaction-detail-popup//button//span[text()=' ✕ ']")
	public UnityWebElement buttonClosePanelTransactionDetail;
	
	@FindBy(xpath = "//transaction-details//button//span[text()=' ✕ ']")
	public UnityWebElement buttonClosePanelTransactionSummary;
	
	@FindBy(xpath = "//transaction-details//button//span[text()=' Show More Details ']")
	public UnityWebElement buttonShowMoreDetailsPanelTransactionSummary;
	
	@FindBy(xpath = "//*[normalize-space(text())='Branch' and @role='menuitem']")
    public UnityWebElement optionBranch;
    
    @FindBy(xpath = "//*[normalize-space(text())='Transaction Description' and @role='menuitem']")
    public UnityWebElement optionTransactionDescription;
    
    @FindBy(xpath = "//*[normalize-space(text())='Reporting Date' and @role='menuitem']")
    public UnityWebElement optionReportingDate;
    
    @FindBy(xpath = "//div[normalize-space(text())='Fee Schedule Description' and @role='menuitem']")
    public UnityWebElement optionFeeScheduleDescription;
    
    @FindBy(xpath = "//div[normalize-space(text())='Administrator' and @role='menuitem']")
    public UnityWebElement optionAdministrator;
    
    @FindBy(xpath = "//span[normalize-space(text())='Transaction Description']")
    public UnityWebElement TransactionDescription;

	// History filter grid
	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Ledger Cash (Base)']]//input")
	public UnityWebElement checkboxLedgerCashBase;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Portfolio Name']]//input")
	public UnityWebElement checkboxPortflioName;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Portfolio Number']]//input")
	public UnityWebElement checkboxPortflioNumber;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Security Description']]//input")
	public UnityWebElement checkboxSecurityDescription;

	// History tab items
	//span[contains(@class,'selected-date')]
	@FindBy(xpath = "//span[@class='selected-date-value']")
	public UnityWebElement dropdownDate;

	@FindBy(xpath = "//*[normalize-space(text())='This Month']")
	public UnityWebElement optionThisMonth;

	@FindBy(xpath = "//*[normalize-space(text())='This Week']")
	public UnityWebElement optionThisWeek;

	@FindBy(xpath = "//*[normalize-space(text())='This Quarter']")
	public UnityWebElement optionThisQuarter;

	@FindBy(xpath = "//*[normalize-space(text())='Custom Date']")
	public UnityWebElement optionCustomDate;

	@FindBy(xpath = "//input[@placeholder='From']")
	public UnityWebElement textboxFromDate;

	@FindBy(xpath = "//input[@placeholder='To']")
	public UnityWebElement textboxToDate;

//	@FindBy(xpath = "//button/span[normalize-space(text())='Cancel']")
//	public UnityWebElement buttonCancel;

	@FindBy(xpath = "//div[contains(@class,'mat-menu-panel')]//span[normalize-space(text())='GO']")
	public UnityWebElement buttonGo;
	
	@FindBy(xpath = "//div[contains(@class,'mat-menu-panel')]//span[normalize-space(text())='Go']")
	public UnityWebElement buttonGoAZ;

	@FindBy(xpath = "//span[normalize-space(text())='Account Name']/preceding-sibling::div//input")
	public UnityWebElement checkboxAccountName;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Branch Number']]")
	public UnityWebElement checkboxBranchNumber;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Ledger Cash (Base)']]//input")
	public UnityWebElement checkboxLedgerCashBaseFeeActivity;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Portfolio Name']]")
	public UnityWebElement checkboxPortfolioName;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Receivable Amount (Base)']]")
	public UnityWebElement checkboxReceivableAmountBase;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Receivable Amount (Local)']]")
	public UnityWebElement checkboxReceivableAmountLocal;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Receivable Number']]")
	public UnityWebElement checkboxReceivableNumber;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Transaction Information']]")
	public UnityWebElement checkboxTransactionInformation;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Reversal Transaction ID']]")
	public UnityWebElement checkboxReversalTransactionID;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Reversed?']]")
	public UnityWebElement checkboxReversed;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Transaction Number']]")
	public UnityWebElement checkboxTransactionNumber;

	@FindBy(xpath = "//*[normalize-space(text())='None']")
	public UnityWebElement optionNone;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Book of Business']]//input")
	public UnityWebElement checkboxBookOfBusiness;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Favorites']]//input")
	public UnityWebElement checkboxFavorites;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Recent']]//input")
	public UnityWebElement checkboxRecent;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Exclude Reversed/Reversals']]//input")
	public UnityWebElement checkboxExcludeReversedReversals;

	@FindBy(xpath = "//span[contains(@class,'filter-link')]")
	public UnityWebElement dropdownGroupBy;

	@FindBy(xpath = "//input[contains(@id,'mat-input')]")
	public UnityWebElement textboxSearch;

	@FindBy(xpath = "//button//span[normalize-space(text())='Reset']")
	public UnityWebElement buttonClear;

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