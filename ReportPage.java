package com.unity.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.unity.constants.AppConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityGridElement;
import com.unity.customelements.UnityTableElement;
import com.unity.customelements.UnityWebElement;
import com.unity.utilities.ExcelUtilities;
import com.unity.utilities.UnityUtils;

public class ReportPage extends BaseTestPage {

	WebDriver driver;

	// **************************
	@FindBy(xpath = "//span[normalize-space(text())='Add New']")
	public UnityWebElement buttonAddNew;
	
	@FindBy(xpath = "//mat-select[@name='transactionType']/div/div[2]/div")
	public UnityWebElement drpDwnTransactionType;

	// Report page tabs
	@FindBy(xpath = "//button[*[normalize-space(text())='Completed']]")
	public UnityWebElement tabCompleted;
	
	@FindBy(xpath = "//mat-panel-title//span[contains(text(),'Report Criteria')]")
	public UnityWebElement panelReportCriteria;

	@FindBy(xpath = "//button[*[normalize-space(text())='Scheduled']]")
	public UnityWebElement tabScheduled;

	@FindBy(xpath = "//button[*[normalize-space(text())='Templates']]")
	public UnityWebElement tabTemplates;
	
	@FindBy(xpath = "//input[@name='accountGref']")
	public UnityWebElement lookupAccount;
	
	@FindBy(xpath = "//input[@name='toDateTimePeriod']")
	public UnityWebElement lookupReportType;
	
	@FindBy(xpath = "//mat-radio-group[@aria-labelledby='Delivery Type']//mat-radio-button[@value='D']")
	public UnityWebElement radioDaytime;
	
	@FindBy(xpath = "//mat-radio-group[@aria-labelledby='Delivery Type']//mat-radio-button[@value='N']")
	public UnityWebElement radioOvernight;
	
	@FindBy(xpath = "//recipient-report-type-filter//mat-icon")
	public UnityWebElement dropdownSelectAll;
	
	@FindBy(xpath = "//mat-checkbox//span[text()=' Interim 1 Recipients ']/preceding-sibling::div//input")
	public UnityWebElement checkboxInterim1;
	
	@FindBy(xpath = "//mat-checkbox//span[text()=' Interim 2 Recipients ']/preceding-sibling::div//input")
	public UnityWebElement checkboxInterim2;
	
	@FindBy(xpath = "//mat-checkbox//span[text()=' Annual Recipients ']/preceding-sibling::div//input")
	public UnityWebElement checkboxAnnual;

	// Report grid controls
	@FindBy(xpath = "//span[normalize-space(text())='Search']")
	public UnityWebElement buttonSearch;

	@FindBy(xpath = "(//span[normalize-space(text())='Search'])[2]")
	public UnityWebElement buttonSearchRelationship;

	@FindBy(xpath = "(//span[normalize-space(text())='Search'])[3]")
	public UnityWebElement buttonSearchBank;

	@FindBy(xpath = "(//span[normalize-space(text())='Search'])[last()]")
	public UnityWebElement buttonSearchBranch;
	
	@FindBy(xpath = "(//ag-header-checkbox//mat-checkbox)[last()]")
	public UnityWebElement checkboxBranchSelectall;

	@FindBy(xpath = "//div[@class='flexDisplay']//input[not(@disabled)]")
	public UnityWebElement textboxSearch;

	@FindBy(xpath = "//div[@class='flexDisplay']//i")
	public UnityWebElement textboxSearchIcon;

	@FindBy(xpath = ".//*[normalize-space(text())='Delete']")
	public UnityWebElement linkDelete;

	@FindBy(xpath = "//button[*[normalize-space(text())='Delete']]")
	public UnityWebElement buttonDelete;

	// ******** Create a Report screen starts here ********
	//@FindBy(xpath = "//span[contains(text(),'Category')]/mat-icon")
	//following::mat-icon")
	@FindBy(xpath = "//span[contains(text(),'Category')]//following::mat-icon")
	public UnityWebElement dropdownCategory;

	@FindBy(xpath = "//div[normalize-space(text())='Category']/following-sibling::div")
	public UnityWebElement labelCategoryValue;

	// Dropdown options
	@FindBy(xpath = "//button//span[normalize-space(text())='Premium Report']")
	public UnityWebElement optionPremiumReport;
	
	@FindBy(xpath = "//button//span[normalize-space(text())='AddVantage Report']")
	public UnityWebElement optionAddVantageReport;

	@FindBy(xpath = "//button//span[normalize-space(text())='Standard Report']")
	public UnityWebElement optionStandardReport;

	@FindBy(xpath = "//button//span[normalize-space(text())='Saved Template']")
	public UnityWebElement optionSavedTemplate;

	@FindBy(xpath = "//button//span[normalize-space(text())='Vision Report']")
	public UnityWebElement optionVisionReport;
	
	@FindBy(xpath = "//button//span[normalize-space(text())='TrustDesk Report']")
	public UnityWebElement optionTrustDeskReport;
	
	@FindBy(xpath = "//button//span[normalize-space(text())='Statements']")
	public UnityWebElement optionStatements;
	
	@FindBy(xpath = "//button//span[normalize-space(text())='To Date Requests']")
	public UnityWebElement optionToDateRequests;
	
	@FindBy(xpath = "//button//span[normalize-space(text())='Previously Printed']")
	public UnityWebElement optionPreviouslyPrinted;
	
	//addv report
	@FindBy(xpath = "//button//span[normalize-space(text())='Administrative']")
	public UnityWebElement optionAdministrative;
	
	@FindBy(xpath = "//button//span[normalize-space(text())='Bank Secrecy Act (BSA) Report']")
	public UnityWebElement optionBSA;
	
	@FindBy(xpath = "//button//span[normalize-space(text())='Transactions']")
	public UnityWebElement optionADDVTransactions;
	
	@FindBy(xpath = "//button//span[normalize-space(text())='Transactions and Balances Report']")
	public UnityWebElement optionADDVTNB;
	
	@FindBy(xpath = "//button//span[normalize-space(text())='Remittance List Details Report']")
	public UnityWebElement optionADDVRLD;
	
	@FindBy(xpath = "//button//span[normalize-space(text())='Investments']")
	public UnityWebElement optionInvestments;
	
	@FindBy(xpath = "//button//span[normalize-space(text())='Pledge Holdings Report']")
	public UnityWebElement optionADDVPH;
	
	@FindBy(xpath = "//button//span[normalize-space(text())='Remittance List Summary Report']")
	public UnityWebElement optionADDVRLS;
	
	@FindBy(xpath = "//button//span[normalize-space(text())='Recurring Cash Receipt Report']")
	public UnityWebElement optionADDVRCR;
	
	@FindBy(xpath = "//button//span[normalize-space(text())='STN Equity Trades Report']")
	public UnityWebElement optionADDVSTNET;
	
	@FindBy(xpath = "//button//span[normalize-space(text())='Balancing']")
	public UnityWebElement optionADDVBalancing;
	
	@FindBy(xpath = "//button//span[normalize-space(text())='Balancing Journal Report']")
	public UnityWebElement optionADDVBJ;
	
	@FindBy(xpath = "//button//span[normalize-space(text())='Balancing Summary Report']")
	public UnityWebElement optionADDVBS;
	
	@FindBy(xpath = "//button//span[normalize-space(text())='Location Table Report']")
	public UnityWebElement optionADDVLT;
	
	@FindBy(xpath = "//button//span[normalize-space(text())='Gain/Loss with Pending Trades Report']")
	public UnityWebElement optionADDVGLPT;
	
	@FindBy(xpath = "//button//span[normalize-space(text())='Federal Estimated Tax Report']")
	public UnityWebElement optionADDVFET;
	
	@FindBy(xpath = "//button//span[normalize-space(text())='Investment Review Report']")
	public UnityWebElement optionADDVIR;
	
	@FindBy(xpath = "//input[@name='investmentReviewFormat']")
	public UnityWebElement lookUpInvestmentReviewFormat;

	// Dropdown sub-options level 1 - Premium Report
	@FindBy(xpath = "//button//span[normalize-space(text())='Accounts']")
	public UnityWebElement optionPremiumAccounts;

	@FindBy(xpath = "//button//span[normalize-space(text())='Cash/Holdings']")
	public UnityWebElement optionPremiumCashHoldings;

	@FindBy(xpath = "//button//span[normalize-space(text())='Holdings']")
	public UnityWebElement optionPremiumHoldings;

	@FindBy(xpath = "//button//span[normalize-space(text())='Transactions']")
	public UnityWebElement optionPremiumTransactions;

	@FindBy(xpath = "//button//span[normalize-space(text())='User Information']")
	public UnityWebElement optionPremiumUserInformation;

	// Dropdown sub-options level 1 - Standard Report
	@FindBy(xpath = "//button//span[normalize-space(text())='Accounts']")
	public UnityWebElement optionStandardAccounts;

	@FindBy(xpath = "//button//span[normalize-space(text())='Events']")
	public UnityWebElement optionStandardEvents;

	@FindBy(xpath = "//button//span[normalize-space(text())='Fees']")
	public UnityWebElement optionStandardFees;

	@FindBy(xpath = "(//button//span[normalize-space(text())='Holdings'])[1]")
	public UnityWebElement optionStandardHoldings;

	@FindBy(xpath = "//button//span[normalize-space(text())='Transactions']")
	public UnityWebElement optionStandardTransactions;

	// Dropdown sub-options level 1 - Vision Report
	@FindBy(xpath = "//button//span[normalize-space(text())='Cash/Holdings']")
	public UnityWebElement optionVisionCashHoldings;

	@FindBy(xpath = "//button//span[normalize-space(text())='Cash Details']")
	public UnityWebElement optionCashDetailsReport;
	
	@FindBy(xpath = "//button//span[normalize-space(text())='Cash']")
	public UnityWebElement optionCash;
	
	@FindBy(xpath = "//button//span[normalize-space(text())='Fees']")
	public UnityWebElement optionFees;
	
	@FindBy(xpath = "//button//span[normalize-space(text())='Variable Note Accrual Report']")
	public UnityWebElement optionVariableNoteAccrualReport;
	
	@FindBy(xpath = "//button//span[normalize-space(text())='Security Tax Details (PTR 154)']")
	public UnityWebElement optionSecurityTaxDetails;
	
	@FindBy(xpath = "//button//span[normalize-space(text())='Pledged Cash Report (PTR 200)']")
	public UnityWebElement optionPledgedCashReport;
	
	@FindBy(xpath = "//button//span[normalize-space(text())='Fees by Line of Business Report']")
	public UnityWebElement optionFeesByLineOfBusinessReport;
	
	@FindBy(xpath = "//button//span[normalize-space(text())='Aged Fee Receivables Report']")
	public UnityWebElement optionAgedFeeReceivablesReport;
	
	@FindBy(xpath = "//button//span[normalize-space(text())='Co-Fiduciary Fee Trial Calculation By Block Report']")
	public UnityWebElement optionCoFiduciaryFeeTrialCalculationByBlockReport;
	
	@FindBy(xpath = "//button//span[normalize-space(text())='Co-Fiduciary Fee Trial Calculation By Schedule Report']")
	public UnityWebElement optionCoFiduciaryFeeTrialCalculationByScheduleReport;
	
	@FindBy(xpath = "//button//span[normalize-space(text())='Fee Bucket List Report']")
	public UnityWebElement optionFeeBucketListReport;

	@FindBy(xpath = "//button//span[normalize-space(text())='Transactions']")
	public UnityWebElement optionVisionTransactions;

	@FindBy(xpath = "//button//span[normalize-space(text())='Mini Ledger Report']")
	public UnityWebElement optionMiniLedgerReport;

	@FindBy(xpath = "//div[.//span[normalize-space(text())='Current Business Day Only']]/div[@class='mat-select-arrow-wrapper']")
	public UnityWebElement dropdownCurrentBusinessDayOnly;

	@FindBy(xpath = "//a[normalize-space(text())='Download']")
	public UnityWebElement linkDownload;

	// Dropdown sub-options level 2
	@FindBy(xpath = "//button//span[contains(text(),'Foreign Accounts')]")
	public UnityWebElement optionForeignAccounts;

	@FindBy(xpath = "//button//span[contains(text(),'Portfolio Summary')]")
	public UnityWebElement optionPortfolioSummary;

	@FindBy(xpath = "//button//span[contains(text(),'Cash Report')]")
	public UnityWebElement optionCashReport;

	@FindBy(xpath = "//button//span[contains(text(),'Asset Diversification by Period')]")
	public UnityWebElement optionAssetDiversificationByPeriod;

	@FindBy(xpath = "//button//span[contains(text(),'Asset Mix - Comparative')]")
	public UnityWebElement optionAssetMixComparative;

	@FindBy(xpath = "//button//span[contains(text(),'Asset Mix - Relationship/Combined Accounts')]")
	public UnityWebElement optionAssetMixRelationshipCombinedAccounts;

	@FindBy(xpath = "//button//span[contains(text(),'Holdings - Basic')]")
	public UnityWebElement optionHoldingsBasic;

	@FindBy(xpath = "//button//span[contains(text(),'Holdings Report')]")
	public UnityWebElement optionHoldingsReport;

	@FindBy(xpath = "//button//span[contains(text(),'Security List of Holders')]")
	public UnityWebElement optionSecurityListOfHolders;

	@FindBy(xpath = "//button//span[contains(text(),'Taxlot Holdings')]")
	public UnityWebElement optionTaxLotHoldings;

	@FindBy(xpath = "//button//span[contains(text(),'Top 20 Accounts by Size')]")
	public UnityWebElement optionTop20AccountsBySize;

	@FindBy(xpath = "//button//span[contains(text(),'Top 20 Holdings')]")
	public UnityWebElement optionTop20Holdings;

	@FindBy(xpath = "//button//span[contains(text(),'Top 20 Relationships by Size')]")
	public UnityWebElement optionTop20RelationshipBySize;

	@FindBy(xpath = "//button//span[contains(text(),'Unrealized Gain/Loss by Account')]")
	public UnityWebElement optionUnrealizedGainLossByAccount;

	@FindBy(xpath = "//button//span[normalize-space(text())='Pending Purchases and Sales']")
	public UnityWebElement optionPendingPurchasesAndSales;

	@FindBy(xpath = "//button//span[normalize-space(text())='Purchases and Sales']")
	public UnityWebElement optionPurchasesAndSales;

	@FindBy(xpath = "//button//span[normalize-space(text())='Transaction Detail Report']")
	public UnityWebElement optionTransactionDetailReport;

	@FindBy(xpath = "(//button//span[normalize-space(text())='Holdings'])[2]")
	public UnityWebElement optionHoldingsSubOption;

	@FindBy(xpath = "(//button//span[normalize-space(text())='Usage Report by ID'])")
	public UnityWebElement optionUsageReportbyIDSubOption;

	@FindBy(xpath = "//button//span[normalize-space(text())='Account Affiliations']")
	public UnityWebElement optionAccountAffiliation;

	@FindBy(xpath = "//button//span[normalize-space(text())='Account Information']")
	public UnityWebElement optionAccountInformation;

	@FindBy(xpath = "//button//span[normalize-space(text())='Account Summary Information']")
	public UnityWebElement optionAccountSummaryInformation;

	@FindBy(xpath = "//button//span[normalize-space(text())='Event (Disbursement)']")
	public UnityWebElement optionEventDisbursement;

	@FindBy(xpath = "//button//span[normalize-space(text())='Event (Memo)']")
	public UnityWebElement optionEventMemo;

	@FindBy(xpath = "//button//span[normalize-space(text())='Event (Transfer Recipient)']")
	public UnityWebElement optionEventTransferRecipient;

	@FindBy(xpath = "(//button//span[normalize-space(text())='Events'])[2]")
	public UnityWebElement optionEvents;

	@FindBy(xpath = "//button//span[normalize-space(text())='Fees Earned']")
	public UnityWebElement optionFeesEarned;

	@FindBy(xpath = "(//button//span[normalize-space(text())='Holdings'])[2]")
	public UnityWebElement optionHoldings;

	@FindBy(xpath = "//button//span[normalize-space(text())='Tax Lots']")
	public UnityWebElement optionTaxlots;

	@FindBy(xpath = "(//button//span[normalize-space(text())='Transactions'])[2]")
	public UnityWebElement optionTransactions;

	@FindBy(xpath = "//button[*[normalize-space(text())='Next']]")
	public UnityWebElement buttonNext;
	
	@FindBy(xpath = "//button[*[normalize-space(text())='Back']]")
	public UnityWebElement buttonBack;

	// ******** Create a Report screen ends here ********

	// ******** Build report screen starts here ********

	@FindBy(xpath = "//select/option")
	public List<WebElement> selectMulitpleFields;

	@FindBy(xpath = "//a[contains(text(),'Add All')]")
	public UnityWebElement linkAddAll;

	@FindBy(xpath = "//div[@class='sort-item-text']")
	public List<WebElement> listFieldsAdded;

	@FindBy(xpath = ".//option[normalize-space(text())='Branch Code']")
	public UnityWebElement optionBranchCode;

	@FindBy(xpath = ".//option[normalize-space(text())='Branch Name']")
	public UnityWebElement optionBranchName;

	@FindBy(xpath = "//*[normalize-space(text())='Create a Report']")
	public UnityWebElement labelCreateAreport;

	@FindBy(xpath = "//div[.//span[normalize-space(text())='Prior Date']]/div[@class='mat-select-arrow-wrapper']")
	public UnityWebElement dropdownPriorDate;

	@FindBy(xpath = "//mat-select[@aria-label='first date']")
	public UnityWebElement dropdownSelectDate;

	@FindBy(xpath = "//mat-option[*[normalize-space(text())='Current Quarter Fee']]")
	public UnityWebElement optionCurrentQuarterFee;

	@FindBy(xpath = "//div[contains(@class , 'show-container')]//table")
	public UnityTableElement reportTable;

	@FindBy(xpath = "//mat-select[contains(@aria-label,'first date')]")
	public UnityWebElement dropdownStartDate;
	
	@FindBy(xpath = "//mat-form-field//input[@name='asOfDate']")
	public UnityWebElement inputAsOfDate;
	
	@FindBy(xpath = "//label[contains(@for,'Summary-input')]//parent::mat-radio-button")
	public UnityWebElement radioButtonSummary;
	
	@FindBy(xpath = "//label[contains(@for,'Detail-input')]//parent::mat-radio-button")
	public UnityWebElement radioButtonDetails;
	
	@FindBy(xpath = "//mat-form-field//input[@name ='startDate']")
	public UnityWebElement inputStartDate;
	
	@FindBy(xpath = "//mat-form-field//input[@name ='endDate']")
	public UnityWebElement inputEndDate;
	
	@FindBy(xpath = "//mat-form-field//input[@name ='interestedParty']")
	public UnityWebElement inputInterestedParty;
	
	@FindBy(xpath = "//mat-form-field//input[@name ='feeSchedule']")
	public UnityWebElement inputFeeSchedule;
	
	@FindBy(xpath = "//mat-form-field//mat-select[@name ='feeSchedule']")
	public UnityWebElement selectFeeSchedule;
	
	@FindBy(xpath = "//div[contains(@class,'mat-select-panel')]")
	public UnityWebElement dropdownFeeSchedule;
	
	@FindBy(xpath = "//mat-form-field//mat-select[@name ='blockNumber']")
	public UnityWebElement selectBlockNumber;
	
	@FindBy(xpath = "//div[contains(@class,'error-message')]")
	public UnityWebElement labelErrorMessage;
	
	@FindBy(xpath = "//mat-error")
	public UnityWebElement labelRequiredFieldError;

	@FindBy(xpath = "//mat-select[contains(@aria-label,'second date')]")
	public UnityWebElement dropdownEndDate;

	@FindBy(xpath = "//mat-option[*[normalize-space(text())='Prior Date']]")
	public UnityWebElement optionPreviousDate;

	@FindBy(xpath = "//mat-option[*[normalize-space(text())='Prior Month End']]")
	public UnityWebElement optionPriorMonthEnd;

	@FindBy(xpath = "//mat-option[*[normalize-space(text())='Prior Month End']]")
	public UnityWebElement optionPriorMonthEnd2;

	@FindBy(xpath = "//mat-option[*[normalize-space(text())='Specify Date']]")
	public UnityWebElement optionSpecifyDate;

	@FindBy(xpath = "//mat-select[@name='groupBy']")
	public UnityWebElement dropdownGroupBy;

	@FindBy(xpath = "//mat-option[*[normalize-space(text())='Country']]")
	public UnityWebElement optionGroupByCountry;

	@FindBy(xpath = "//mat-option[*[normalize-space(text())='Industry']]")
	public UnityWebElement optionGroupByIndustry;

	@FindBy(xpath = "//mat-option[*[normalize-space(text())='Percentage market value']]")
	public UnityWebElement optionGroupByPercentageMarketValue;

	@FindBy(xpath = "//mat-option[*[normalize-space(text())='Sector']]")
	public UnityWebElement optionGroupBySector;

	@FindBy(xpath = "//mat-option[*[normalize-space(text())='Prior Month Range']]")
	public UnityWebElement optionPriorMonthRange;

	@FindBy(xpath = "//mat-option[*[normalize-space(text())='Specify Date Range']]")
	public UnityWebElement optionSpecifyDateRange;

	@FindBy(xpath = "//input[@placeholder='From']")
	public UnityWebElement textboxFrom;

	@FindBy(xpath = "//input[@placeholder='To']")
	public UnityWebElement textboxTo;

	@FindBy(xpath = "//mat-select[contains(@name,'cusipBankSecurityTypeFilter')]")
	public UnityWebElement dropdownFilterBy;

	@FindBy(xpath = "//div[@id='mat-autocomplete-1']//mat-option")
	public UnityWebElement panelCusipOptions;
	
	@FindBy(xpath = "//mat-dialog-container/reports-notification-dialog")
	public UnityWebElement dailogNotification;

	@FindBy(xpath = "//mat-option[*[normalize-space(text())='Bank security number']]")
	public UnityWebElement optionBankSecurityNumber;

	@FindBy(xpath = "//mat-option[*[normalize-space(text())='Cusip']]")
	public UnityWebElement optionCusip;

	@FindBy(xpath = "//mat-option[*[normalize-space(text())='Ticker symbol']]")
	public UnityWebElement optionTickerSymbol;

	@FindBy(xpath = "//mat-option[*[normalize-space(text())='Sedol']]")
	public UnityWebElement optionSedol;

	@FindBy(xpath = "//mat-option[*[normalize-space(text())='ISIN']]")
	public UnityWebElement optionISIN;

	@FindBy(xpath = "//mat-select[@name='transactionType']")
	public UnityWebElement dropdownTransactionType;

	@FindBy(xpath = "//mat-select[contains(@ng-model,'additionalFilter')]")
	public UnityWebElement dropdownAdditionalFilter;

	@FindBy(xpath = "//div[contains(@id,'select_container') and @aria-hidden='false']//md-content")
	public UnityWebElement panelDropdownValues;

	@FindBy(xpath = "//mat-option[*[normalize-space(text())='Dividends']]")
	public UnityWebElement optionDividends;

	@FindBy(xpath = "//input[@type='text']")
	public UnityWebElement textBoxSearchAdditionalFilter;

	@FindBy(xpath = "//label[normalize-space(text())='Distribution']")
	public UnityWebElement checkboxDistribution;

	@FindBy(xpath = "//label[normalize-space(text())='Statement']")
	public UnityWebElement checkboxStatement;

	@FindBy(xpath = "//label[normalize-space(text())='Fee']")
	public UnityWebElement checkboxFee;

	@FindBy(xpath = "//label[normalize-space(text())='Memo']")
	public UnityWebElement checkboxMemo;

	@FindBy(xpath = "//label[normalize-space(text())='Other']")
	public UnityWebElement checkboxOther;

	@FindBy(xpath = "//input[@placeholder='Search: Bank Security Number']")
	public UnityWebElement textboxSearchBankSecurityNumber;

	@FindBy(xpath = "//div[@class='cdk-overlay-pane']")
	public UnityWebElement listSuggestionsSearchBankSecurityNumber;

	// ******** Build report screen ends here ********

	// ******** Select Accounts screen starts here ********

	@FindBy(xpath = "//div//label")
	public UnityWebElement labelSelectAccountsNotification;

	// By Account Tab
	@FindBy(xpath = "//span[normalize-space(text())='By Account' or normalize-space(text())='By account']")
	public UnityWebElement tabByAccount;
	
	@FindBy(xpath = "//span[normalize-space(text())='By Account' or normalize-space(text())='By Recipient']")
	public UnityWebElement tabByRecipient;
	
	@FindBy(xpath = "//span[normalize-space(text())='By Region' or normalize-space(text())='By region']")
	public UnityWebElement tabByRegion;

	@FindBy(xpath = "//label[normalize-space(text())='Book of Business']")
	public UnityWebElement checkboxBookOfBusiness;

	@FindBy(xpath = "//a[normalize-space(text())='Select All']")
	public UnityWebElement linkSelectAll;
	
	@FindBy(xpath = "//select-branch//a[normalize-space(text())='Select All']")
	public UnityWebElement linkBranchSelectAll;
	
	@FindBy(xpath = "//a[normalize-space(text())='Unselect All']")
	public UnityWebElement linkUnselectAll;

	@FindBy(xpath = "//div[@class='mat-select-trigger']")
	public UnityWebElement listView;

	@FindBy(xpath = "//mat-option[.//span[normalize-space(text())='Accounts']]")
	public UnityWebElement checkboxAccounts;

	@FindBy(xpath = "//mat-option[.//span[normalize-space(text())='Account Groups']]")
	public UnityWebElement checkboxAccountGroups;

	@FindBy(xpath = "//div[@role='row']/div[@role='gridcell'][3]/div[normalize-space(text())='']")
	public UnityWebElement labelBlankAccountNumber;

	@FindBy(xpath = "//*[normalize-space(text())='No Results']")
	public UnityWebElement labelNoResult;

	@FindBy(xpath = "(//input[@class='ag-input-field-input ag-checkbox-input'])[last()]")
	public UnityWebElement checkboxfirstaccount;

	// By Relationship Tab
	@FindBy(xpath = "//span[normalize-space(text())='By Relationship' or normalize-space(text())='By relationship']")
	public UnityWebElement tabByRelationship;

	// By bank Tab
	@FindBy(xpath = "//span[normalize-space(text())='By Bank' or normalize-space(text())='By bank']")
	public UnityWebElement tabByBank;

	@FindBy(xpath = "//div[@role='gridcell']//input")
	public List<WebElement> radioButtonsByBank;

	// By bank Tab
	@FindBy(xpath = "//span[normalize-space(text())='By Branch' or normalize-space(text())= 'By branch']")
	public UnityWebElement tabByBranch;
	
	@FindBy(xpath = "//div[@role='listbox']")
	public UnityWebElement listIntrestedParty;

	//@FindBy(css = "div[role='grid']")
	@FindBy(xpath = "//ag-grid-angular")
	public UnityGridElement reportGrid;

	// ******** Select Accounts screen ends here ********

	// ******** Save & Schedule screen starts here ********

	@FindBy(xpath = "//label[normalize-space(text())='Save Report to Library']")
	public UnityWebElement checkboxSaveReportToLibrary;

	@FindBy(xpath = "//input[@placeholder='Report Name']")
	public UnityWebElement textboxReportName;

	@FindBy(xpath = "//div[normalize-space(text())='Wednesday']/../div")
	public UnityWebElement labelWednesday;

	@FindBy(xpath = "//div[normalize-space(text())='Saturday']/../div")
	public UnityWebElement labelSaturday;

	@FindBy(xpath = "//div[normalize-space(text())='Monday']/../div")
	public UnityWebElement labelMonday;

	@FindBy(xpath = "//div[contains(text(),'Start Date:')]")
	public UnityWebElement labelStartDate;

	@FindBy(xpath = "//div[contains(text(),'End Date:')]")
	public UnityWebElement labelEndDate;
	
	@FindBy(xpath = "//div[contains(text(),'nterested Party:')]")
	public UnityWebElement labelIntrestedPArty;
	
	@FindBy(xpath = "//div[contains(text(),'Fee Schedule:')]")
	public UnityWebElement labelFeeSchedule;
	
	@FindBy(xpath = "//div[contains(text(),'As of Date:')]")
	public UnityWebElement labelAsOfDate;

	//@FindBy(xpath = "//div[@class='save-as-template-container']//div[@class='mat-checkbox-inner-container']")
	//@FindBy(xpath = "//div[@class='save-as-template-container']//input")
//	/preceding-sibling::div//input
	@FindBy(xpath = "//label[normalize-space(text())='Save as Template']")
	public UnityWebElement checkboxSaveAsTemplate;

	@FindBy(xpath = "//input[@placeholder='Template Name']")
	public UnityWebElement textboxTemplateName;

	//@FindBy(xpath = "//mat-checkbox[@name='pdfCheckbox']//input")
	@FindBy(xpath = "//label[normalize-space(text())='PDF']")
	public UnityWebElement checkboxPDF;

	@FindBy(xpath = "//label[normalize-space(text())='XLSX']")
	public UnityWebElement checkboxXLSX;
	
	//@FindBy(xpath = "//mat-checkbox[@name='txtCheckbox']//input")
	@FindBy(xpath = "//label[normalize-space(text())='TXT']")
	public UnityWebElement checkboxTXT;

	//@FindBy(xpath = "//mat-select[@name='schedule']//div[@class='mat-select-arrow-wrapper']")
	@FindBy(xpath = "//mat-select[@name='schedule']")
	public UnityWebElement dropdownSchedule;

	@FindBy(xpath = "//span[normalize-space(text())='Run on Selected Days of the Week']")
	public UnityWebElement optionRunOnSelectedDaysOfTheWeek;

	@FindBy(xpath = "//span[normalize-space(text())='Run on Selected Days of the Month']")
	public UnityWebElement optionRunOnSelectedDaysOfTheMonth;

	@FindBy(xpath = "//span[normalize-space(text())='Run on Selected Dates']")
	public UnityWebElement optionRunOnSelectedDates;

	@FindBy(xpath = "//input[@placeholder='From']")
	public UnityWebElement textboxDateToAdd;

	//@FindBy(xpath = "//mat-select[@name='days of month']//div[@class='mat-select-arrow-wrapper']")
	@FindBy(xpath = "//mat-select[@name='days of month']")
	public UnityWebElement dropdownDaysOfTheMonthToRun;

	@FindBy(xpath = "//div[contains(@class,'mat-mdc-select-panel')]")
	public UnityWebElement listDaysOfTheMonthToRun;

	@FindBy(xpath = "//div[contains(@class,'mat-mdc-select-panel')]//mat-option/span")
	public List<WebElement> optionsDaysOfMonth;

	@FindBy(xpath = "(//div[@class='layout-column column2 ng-star-inserted'])[2]")
	public UnityWebElement optionDaysOfTheMonthToRunValue;

	@FindBy(xpath = "//div[@class='days-added-container ng-star-inserted']//div[@class='content-small-spacing']")
	public UnityWebElement optionDatesAddedValue;

	@FindBy(xpath = "//div[normalize-space(text())='Run on selected dates']")
	public UnityWebElement optionRunOnSelectedDated;

	@FindBy(xpath = "//label[normalize-space(text())='Sunday']")
	public UnityWebElement checkboxSunday;

	@FindBy(xpath = "//label[normalize-space(text())='Monday']")
	public UnityWebElement checkboxMonday;

	@FindBy(xpath = "//label[normalize-space(text())='Tuesday']")
	public UnityWebElement checkboxTuesday;

	@FindBy(xpath = "//label[normalize-space(text())='Wednesday']")
	public UnityWebElement checkboxWednesday;

	@FindBy(xpath = "//label[normalize-space(text())='Thursday']")
	public UnityWebElement checkboxThursday;

	@FindBy(xpath = "//label[normalize-space(text())='Friday']")
	public UnityWebElement checkboxFriday;

	@FindBy(xpath = "(//div[@class='days-added-container ng-star-inserted']//div[@class='content-small-spacing'])[1]")
	public UnityWebElement DateAdded1;

	@FindBy(xpath = "(//div[@class='days-added-container ng-star-inserted']//div[@class='content-small-spacing'])[2]")
	public UnityWebElement DateAdded2;

	@FindBy(xpath = "(//div[@class='days-added-container ng-star-inserted']//div[@class='content-small-spacing'])[3]")
	public UnityWebElement DateAdded3;

	@FindBy(xpath = "//label[normalize-space(text())='Saturday']")
	public UnityWebElement checkboxSaturday;

	@FindBy(xpath = "//label[normalize-space(text())='Specify Start Date and/or End Date']")
	public UnityWebElement checkboxSpecificStartDateAndOrEndDate;

	@FindBy(xpath = "//div[normalize-space(text())='Schedule']/following-sibling::div")
	public UnityWebElement labelSchedule;

	@FindBy(xpath = "(//button[@aria-label='Open calendar'])[1]")
	public UnityWebElement labelCalender;

	//@FindBy(xpath = "//div[contains(@class, 'mat-calendar-body-today')]")
	@FindBy(xpath = "//span[contains(@class, 'mat-calendar-body-today')]")
	public UnityWebElement labelTodaysDate;

	@FindBy(xpath = "//div[@class='time-control-container']//span[@class='hour ignore-click']")
	public UnityWebElement labelHour;

	@FindBy(xpath = "//div[@class='arrow-up ignore-click']")
	public UnityWebElement buttonArrowUp;

	@FindBy(xpath = "//div[@class='arrow-down ignore-click']")
	public UnityWebElement buttonArrowDown;

	@FindBy(xpath = "//span[@class='minute ignore-click']")
	public UnityWebElement labelMinute;

	@FindBy(xpath = "//span[@class='am-pm-container ignore-click']")
	public UnityWebElement labelPMOrAM;

	// ******** Save & Schedule screen ends here ********

	// ******** Review Selections screen starts here ********

	//@FindBy(xpath = "(//div[@role='grid'])[1]")
	@FindBy(xpath = "(//ag-grid-angular)[1]")
	public UnityGridElement byAccountGrid;
	
	@FindBy(xpath = "(//table[@role='grid'])[1]")
	public UnityTableElement byAccountTable;

	//@FindBy(xpath = "(//div[@role='grid'])[2]")
	@FindBy(xpath = "(//ag-grid-angular)[2]")
	public UnityGridElement byRelationshipGrid;
	
	@FindBy(xpath = "(//table[@role='grid'])[2]")
	public UnityTableElement byRelationshipTable;

	//@FindBy(xpath = "(//div[@role='grid'])[3]")
	@FindBy(xpath = "(//ag-grid-angular)[3]")
	public UnityGridElement byBankGrid;
	
	@FindBy(xpath = "(//table[@role='grid'])[3]")
	public UnityTableElement byBankTable;
	
	@FindBy(xpath = "//ag-grid-angular[@id='report-select-accounts-by-region']//div[@role='grid']")
	public UnityGridElement byRegionGrid;

	//@FindBy(xpath = "(//div[@role='grid'])[last()]")
	@FindBy(xpath = "(//ag-grid-angular)[last()]")
	public UnityGridElement byBranchGrid;
	
	@FindBy(xpath = "(//table[@role='grid'])[last()]")
	public UnityTableElement byBranchTable;

	@FindBy(xpath = "//span[normalize-space(text())='Date :']/following-sibling::span")
	public UnityWebElement labelDate;

	@FindBy(xpath = "//div[normalize-space(text())='Report Name']/following-sibling::div")
	public UnityWebElement labelReportName;

	@FindBy(xpath = "//div[normalize-space(text())='Template Name']/following-sibling::div")
	public UnityWebElement labelTemplateName;

	@FindBy(xpath = "//button[span[normalize-space(text())='Create']]")
	public UnityWebElement buttonCreateReport;

	@FindBy(xpath = "//a[contains(text(),'Reports')]")
	public UnityWebElement linkBackToReports;

	// ******** Review Selections screen ends here ********
	
	// ******** TD - Security Tax Details ********
	
	@FindBy(xpath = "//span//mat-label[text()='Account Prefix 1']//preceding::input")
	public UnityWebElement textboxAccountPrefix1;
	
	@FindBy(xpath = "//span//mat-label[text()='Account Prefix 2']//preceding::input")
	public UnityWebElement textboxAccountPrefix2;
	
	@FindBy(xpath = "//span//mat-label[text()='Account Prefix 3']//preceding::input")
	public UnityWebElement textboxAccountPrefix3;
	
	@FindBy(xpath = "//span//mat-label[text()='Account Prefix 4']//preceding::input")
	public UnityWebElement textboxAccountPrefix4;
	
	@FindBy(xpath = "//span//mat-label[text()='Account Prefix 5']//preceding::input")
	public UnityWebElement textboxAccountPrefix5;
	
	@FindBy(xpath = "//span//mat-label[text()='Account Prefix 6']//preceding::input")
	public UnityWebElement textboxAccountPrefix6;
	
	@FindBy(xpath = "//span//mat-label[text()='Account Prefix 7']//preceding::input")
	public UnityWebElement textboxAccountPrefix7;
	
	@FindBy(xpath = "//span//mat-label[text()='Account Prefix 8']//preceding::input")
	public UnityWebElement textboxAccountPrefix8;
	
	@FindBy(xpath = "//span//mat-label[text()='Account Prefix 9']//preceding::input")
	public UnityWebElement textboxAccountPrefix9;
	
	@FindBy(xpath = "//span//mat-label[text()='Account Prefix 10']//preceding::input")
	public UnityWebElement textboxAccountPrefix10;
	
	@FindBy(xpath = "//span//mat-label[text()='Account Prefix 11']//preceding::input")
	public UnityWebElement textboxAccountPrefix11;
	
	@FindBy(xpath = "//span//mat-label[text()='Account Prefix 12']//preceding::input")
	public UnityWebElement textboxAccountPrefix12;
	
	@FindBy(xpath = "//span//mat-label[text()='Account Prefix 13']//preceding::input")
	public UnityWebElement textboxAccountPrefix13;
	
	@FindBy(xpath = "//span//mat-label[text()='Account Prefix 14']//preceding::input")
	public UnityWebElement textboxAccountPrefix14;
	
	@FindBy(xpath = "//span//mat-label[text()='Account Prefix 15']//preceding::input")
	public UnityWebElement textboxAccountPrefix15;
	
	@FindBy(xpath = "//span//mat-label[text()='Account Prefix 16']//preceding::input")
	public UnityWebElement textboxAccountPrefix16;
	
	@FindBy(xpath = "//span//mat-label[text()='Account Prefix 17']//preceding::input")
	public UnityWebElement textboxAccountPrefix17;
	
	@FindBy(xpath = "//span//mat-label[text()='Account Prefix 18']//preceding::input")
	public UnityWebElement textboxAccountPrefix18;
	
	@FindBy(xpath = "//span//mat-label[text()='Account Prefix 19']//preceding::input")
	public UnityWebElement textboxAccountPrefix19;
	
	@FindBy(xpath = "//span//mat-label[text()='Account Prefix 20']//preceding::input")
	public UnityWebElement textboxAccountPrefix20;
	
	@FindBy(xpath = "//label")
	public UnityWebElement labelMessage;
	
	@FindBy(xpath = "//h3")
	public UnityWebElement labelSuccessMessage;
	

	// ******** TD - Security Tax Details ********

	@FindBy(xpath = "//button[span[normalize-space(text())='Ok']]")
	public UnityWebElement buttonOK;

	@FindBy(xpath = "//a[normalize-space(text())='Download PDF']")
	public UnityWebElement linkDownloadPDF;

	@FindBy(xpath = "//a[normalize-space(text())='Download XLSX']")
	public UnityWebElement linkDownloadXLSX;
	
	@FindBy(xpath = "//a[normalize-space(text())='Download TXT']")
	public UnityWebElement linkDownloadTXT;

	@FindBy(xpath = "//mat-dialog-content[normalize-space(text())='Report run successfully']")
	public UnityWebElement labelReportSuccessMessage;
	
	@FindBy(xpath = "//mat-dialog-container//div[contains(@class,'message-container')]")
	public UnityWebElement popupDownloadReportMessage;
	
	@FindBy(xpath = "//reports-notification-dialog")
	public UnityWebElement popupDeleteReport;

	@FindBy(xpath = "//div//option[contains(text(),'Transaction Price Per Share')]")
	public UnityWebElement optionTransactionPricePerShare;

	@FindBy(xpath = "//div//option[contains(text(),'Price')]")
	public UnityWebElement optionPrice;

	@FindBy(xpath = "(//div[starts-with(@class,'mat-menu-panel')])[2]//button")
	public List<WebElement> listSavedTemplate;

	public ReportPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}

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

	public void waitForReportToGenerate() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(AppConstants.POPUP_TIMEOUT));
			wait.until(ExpectedConditions.visibilityOfElementLocated(buttonOK.getBy()));
		} catch (Exception e) {
			Assert.fail("Timed out after " + AppConstants.POPUP_TIMEOUT + " seconds");
		}
	}
	
	public void selectValueInGrid(String accountNumber, String tabName) {
//		waitForPageToLoad();
//		try {
//			if (buttonSearch.isDisplayed())
//				buttonSearch.click();
//			textboxSearch.sendKeys(accountNumber);
//		} catch (Exception e) {
//			textboxSearch.sendKeysJS(accountNumber);
//		}
		waitForPageToLoad();
		UnityUtils.wait(2000);
		UnityGridElement grid = null;
		UnityWebElement tabNameToClick = null;
		
		switch(tabName.toLowerCase()) {
		case "by account":
			grid = byRegionGrid;
			tabNameToClick = tabByAccount;
			break;
		case "by region":
			//tabByRegion.click();
			grid = byRegionGrid;
			tabNameToClick = tabByRegion;
			break;
		default:
			Assert.fail("Incorrect tab name");
			break;
		}
		tabNameToClick.click();
		
		grid.verifyElementPresentInGridByText(accountNumber);
		grid.findElements(By.xpath(".//*[normalize-space(text())='" + accountNumber
					+ "']/ancestor::div[@role='row']//input")).get(0).click();
		
		buttonNext.waitforVisible();
	}

	public void selectAccountInGrid(String accountNumber) {
		waitForPageToLoad();
		try {
			if (buttonSearch.isDisplayed())
				buttonSearch.click();
			textboxSearch.clearText();
			textboxSearch.sendKeys(accountNumber);
		} catch (Exception e) {
			textboxSearch.sendKeysJS(accountNumber);
		}
		waitForPageToLoad();
		UnityUtils.wait(2000);
		tabByAccount.click();
		byAccountGrid.verifyElementPresentInGridByText(accountNumber);
		byAccountGrid.findElements(By.xpath(".//*[normalize-space(text())='" + accountNumber
				+ "']/preceding::div//div[@class='ag-selection-checkbox']")).get(0).click();
		buttonNext.waitforVisible();
		UnityUtils.wait(2000);
	}
	
	public void selectAccountInGridRadioButton(String accountNumber) {
		waitForPageToLoad();
		try {
			if (buttonSearch.isDisplayed())
				buttonSearch.click();
			textboxSearch.sendKeys(accountNumber);
		} catch (Exception e) {
			textboxSearch.sendKeysJS(accountNumber);
		}
		waitForPageToLoad();
		UnityUtils.wait(2000);
		tabByAccount.click();
		byAccountGrid.verifyElementPresentInGridByText(accountNumber);
		byAccountGrid.findElements(
				By.xpath(".//*[normalize-space(text())='" + accountNumber + "']/ancestor::div[@role='row']//input"))
		.get(0).click();
		buttonNext.waitforVisible();
	}
	
	public void selectRecipientInGridRadioButton(String data) {
//		waitForPageToLoad();
//		try {
//			if (buttonSearch.isDisplayed()) {
//				buttonSearch.click();
//			textboxSearch.sendKeys(data);
//			}
//		} catch (Exception e) {
//			textboxSearch.sendKeysJS(data);
//		}
		waitForPageToLoad();
		UnityUtils.wait(2000);
		tabByRecipient.click();
		//byAccountGrid.verifyElementPresentInGridByText(accountNumber);
		byAccountGrid.findElements(
				By.xpath(".//*[normalize-space(text())='" + data + "']/ancestor::div[@role='row']//input"))
		.get(0).click();
		buttonNext.waitforVisible();
	}

	public void selectRelationshipInGrid(String affiliationType, String relationshipName) {
		waitForPageToLoad();
		if (buttonSearchRelationship.isDisplayed())
			buttonSearchRelationship.click();
		textboxSearch.sendKeys(relationshipName);
		waitForPageToLoad();
		UnityUtils.wait(3500);
		List<WebElement> list = byRelationshipGrid.findElements(
				By.xpath(".//*[*[normalize-space(text())='" + affiliationType + "'] and *[normalize-space(text())='"
						+ relationshipName + "']]//div[@class='ag-selection-checkbox']//input"));
//		list.get(0).click();
		UnityUtils.wait(5000);
//		if(!(list.get(0).isSelected())
		UnityUtils.scrollAndClick(list.get(0));
		buttonNext.waitforVisible();
	}

	public void selectBankInGrid(String bankName) {
		byBankGrid
				.findElements(
						By.xpath(".//*[normalize-space(text())='" + bankName + "']/ancestor::div[@role='row']//input"))
				.get(0).click();
		buttonNext.waitforVisible();
	}

	public void selectBranchInGrid(String bankName, String branchName) {
		buttonSearchBranch.click();
		UnityUtils.wait(2500);
		textboxSearch.sendKeys(branchName);
		UnityUtils.wait(3500);
		int ltSize =0;
		if(AppConstants.APPLICATION_ENV.toLowerCase().equals("tst191.td")) {
			List<WebElement> list = byBranchGrid.findElements(By.xpath("//*[normalize-space(text()='" + branchName + "')]//div[@class='ag-selection-checkbox']//input"));
			UnityUtils.wait(2000);
			Assert.assertFalse(list.isEmpty(), "Expected branch is not present in grid");
			UnityUtils.scrollAndClick(list.get(list.size()-1));
			//buttonNext.click();
		}else {
		List<WebElement> list = byBranchGrid.findElements(By.xpath(".//*[*[normalize-space(text())='" + bankName
				+ "'] and *[normalize-space(text())='" + branchName + "']]//div[@class='ag-selection-checkbox']//input"));
		UnityUtils.wait(2000);
		ltSize=list.size();
		Assert.assertFalse(list.isEmpty(), "Expected branch is not present in grid");
		UnityUtils.scrollAndClick(list.get(0));
		}
		if ((ltSize==1) && (!(checkboxBranchSelectall.getAttribute("class").contains("mat-checkbox-checked")))) {
			checkboxBranchSelectall.click();
		}
		
		buttonNext.waitforVisible();
	}

	public void selectValueInAdditionalFilter(String value) {
		dropdownAdditionalFilter.click();
		textBoxSearchAdditionalFilter.sendKeys(value);
		List<WebElement> searchResults = textBoxSearchAdditionalFilter
				.findElements(By.xpath(".//ancestor::md-select-header/following-sibling::md-option"));

		if (!searchResults.isEmpty()) {
			searchResults.get(0).click();
		}
	}

	public void verifyExportedExcelIsNotEmpty(String excelReportName) {
		UnityUtils.wait(5000);
		ExcelUtilities excelUtilities = new ExcelUtilities(
				System.getProperty("user.home") + "\\Downloads\\" + excelReportName + ".xlsx");
		Assert.assertFalse(excelUtilities.isExcelEmpty(), "Exported excel has no data");
	}

	public void searchReportAndClick(String searchParameter) {
		buttonSearch.click();
		textboxSearch.sendKeys(searchParameter);
		waitForPageToLoad();
		reportGrid.findElements(By.xpath(".//a[contains(text(),'" + searchParameter + "')]")).get(0).click();
	}

	public void selectDayOfTheMonthFromList(String day) {
		dropdownDaysOfTheMonthToRun.waitforVisible();
		dropdownDaysOfTheMonthToRun.click();
		listDaysOfTheMonthToRun.waitforVisible();
		for (WebElement webElement : optionsDaysOfMonth) {
			if (webElement.getText().trim().equals(day)) {
				UnityUtils.wait(1000);
				webElement.click();
				break;
			}
		}
	}
}