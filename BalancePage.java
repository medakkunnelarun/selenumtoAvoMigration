package com.unity.pages;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.unity.constants.AppConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityGridElement;
import com.unity.customelements.UnityWebElement;

public class BalancePage extends BaseTestPage {

	WebDriver driver;

	public BalancePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}

	@FindBy(xpath = "//account-synopsis//mat-icon")
	public UnityWebElement buttonSynopsis;

	@FindBy(xpath = "//unity-print-v2")
	public UnityWebElement buttonPrint;

	@FindBy(xpath = "//*[normalize-space(text())='Print Current Page']")
	public UnityWebElement buttonPrintCurrentPage;

	@FindBy(xpath = "//*[normalize-space(text())='Search by Account']/ancestor::div/input")
	public UnityWebElement textBoxSearchFor;

	// header details
	@FindBy(xpath = "//ruf-page-header-title")
	public UnityWebElement labelAccountName;

	@FindBy(xpath = "//h2/following-sibling::small")
	public List<WebElement> labelheaderKeys;

	@FindBy(xpath = "//div/h2")
	public List<WebElement> labelheaderValues;

	@FindBy(xpath = "//*[normalize-space(text())='Cash Balance Detail']")
	public UnityWebElement tabCashBalanceDetail;

	@FindBy(xpath = "//*[normalize-space(text())='Cash Projections']")
	public UnityWebElement tabCashProjections;

	// grid controls
	@FindBy(xpath = "//ag-grid-angular")
	public UnityGridElement gridCashBalanceDetail;

	@FindBy(xpath = "//div[contains(@class,'ag-header-cell-label')]")
	public List<WebElement> gridHeaders;

	// Cash Balance Headers
	@FindBy(xpath = "//span[normalize-space(text())='Portfolio Number']")
	public UnityWebElement headerPortfolioNumber;

	@FindBy(xpath = "//span[normalize-space(text())='Portfolio Name']")
	public UnityWebElement headerPortfolioName;

	@FindBy(xpath = "//span[normalize-space(text())='Account Number']")
	public UnityWebElement headerAccountGroupAccountNumber;

	@FindBy(xpath = "//span[normalize-space(text())='Portfolio Number']")
	public UnityWebElement headerAccountGroupPortfolionumber;

	@FindBy(xpath = "//span[normalize-space(text())='Portfolio Name']")
	public UnityWebElement headerAccountGroupPortfolioname;

	@FindBy(xpath = "//span[normalize-space(text())='Uninvested Cash']")
	public UnityWebElement headerUninvested;

	@FindBy(xpath = "//span[normalize-space(text())='Invested Cash']")
	public UnityWebElement headerInvested;

	@FindBy(xpath = "//span[normalize-space(text())='Total Cash']")
	public UnityWebElement headerTotal;

	// Cash balance filter
	@FindBy(xpath = "//unity-upgrade-column-filter/button")
	public UnityWebElement linkFilterGrid;

	@FindBy(xpath = "//label[normalize-space(text())='Portfolio Name']/ancestor::mat-checkbox")
	public UnityWebElement accountGroupcheckboxPortfolioName;

	@FindBy(xpath = "//label[normalize-space(text())='Portfolio Number']/ancestor::mat-checkbox")
	public UnityWebElement accountGroupCheckboxPortfolioNumber;

	@FindBy(xpath = "//label[normalize-space(text())='Account Number']/ancestor::mat-checkbox")
	public UnityWebElement checkboxAccountNumber;

	@FindBy(xpath = "//label[normalize-space(text())='Uninvested Cash']/ancestor::mat-checkbox")
	public UnityWebElement checkboxUninvested;

	@FindBy(xpath = "//label[normalize-space(text())='Invested Cash']/ancestor::mat-checkbox")
	public UnityWebElement checkboxInvested;

	@FindBy(xpath = "//label[normalize-space(text())='Total Cash']/ancestor::mat-checkbox")
	public UnityWebElement checkboxTotal;

	@FindBy(xpath = "//label[normalize-space(text())='Net Available Funds']/ancestor::mat-checkbox")
	public UnityWebElement checkboxNetAvailableFunds;

	@FindBy(xpath = "//span[normalize-space(text())='Save']")
	public UnityWebElement buttonSave;

	@FindBy(xpath = "//span[normalize-space(text())='✕']")
	public UnityWebElement buttonFilterClose;

	// Balance Detail
	@FindBy(xpath = "//a[normalize-space(text())='Balance Detail']")
	public UnityWebElement linkBalanceDetail;

	@FindBy(xpath = "//mat-panel-title[normalize-space(text())='Cash Detail']")
	public UnityWebElement panelCashDetail;

	@FindBy(xpath = "//mat-panel-title[normalize-space(text())='Sweep Detail']")
	public UnityWebElement panelSweepDetail;

	@FindBy(xpath = "//mat-panel-title[normalize-space(text())='Sweep Holdings Summary']")
	public UnityWebElement panelSweepHoldingsSummary;

	@FindBy(xpath = "//mat-panel-title[normalize-space(text())='Payable Cash']")
	public UnityWebElement panelPayableCash;

	@FindBy(xpath = "//mat-panel-title[normalize-space(text())='Receivable Cash']")
	public UnityWebElement panelReceivableCash;

	@FindBy(xpath = "//mat-panel-title[normalize-space(text())='Sweep Holdings Summary']/ancestor::mat-expansion-panel//div[@role='grid']")
	public UnityGridElement gridSweepHoldingsSummary;

	@FindBy(xpath = "//mat-panel-title[normalize-space(text())='Payable Cash']/ancestor::mat-expansion-panel//div[@role='grid']")
	public UnityGridElement gridPortfolioPayableCash;

	@FindBy(xpath = "//mat-panel-title[normalize-space(text())='Receivable Cash']/ancestor::mat-expansion-panel//div[@role='grid']")
	public UnityGridElement gridPortfolioReceivableCash;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Amount Due']]//input")
	public UnityWebElement checkboxAmountDue;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Amount Received']]//input")
	public UnityWebElement checkboxAmountReceived;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Date Due']]//input")
	public UnityWebElement checkboxDateDue;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Receivable Type']]//input")
	public UnityWebElement checkboxReceivabletype;

	@FindBy(xpath = "//span[normalize-space(text())='Invested Income Balance']")
	public UnityWebElement labelInvestedIncomeBalanceKey;

	@FindBy(xpath = "//span[normalize-space(text())='Invested Principal Balance']")
	public UnityWebElement labelInvestedPrincipalBalanceKey;

	@FindBy(xpath = "//span[normalize-space(text())='Income ACM Balance']")
	public UnityWebElement labelIncomeACMBalanceKey;

	@FindBy(xpath = "//span[normalize-space(text())='Principal ACM Balance']")
	public UnityWebElement labelPrincipalACMBalanceKey;

	@FindBy(xpath = "//span[normalize-space(text())='Income Cash']")
	public UnityWebElement labelIncomeCashKey;

	@FindBy(xpath = "//span[normalize-space(text())='Principal Cash']")
	public UnityWebElement labelPrincipalCashKey;

	@FindBy(xpath = "//span[normalize-space(text())='Available Funds - Income']")
	public UnityWebElement labelAvailableFundsIncomeKey;

	@FindBy(xpath = "//span[normalize-space(text())='Available Funds - Principal']")
	public UnityWebElement labelAvailableFundsPrincipalKey;

	@FindBy(xpath = "//span[normalize-space(text())='Available Next Day Income Cash']")
	public UnityWebElement labelAvailableNextDayIncomeCashKey;

	@FindBy(xpath = "//span[normalize-space(text())='Available Next Day Principal Cash']")
	public UnityWebElement labelAvailableNextDayPrincipalCashKey;

	@FindBy(xpath = "//span[normalize-space(text())='Income Cash Hold Amount']")
	public UnityWebElement labelIncomeCashHoldAmountKey;

	@FindBy(xpath = "//span[normalize-space(text())='Principal Cash Hold Amount']")
	public UnityWebElement labelPrincipalCashHoldAmountKey;

	@FindBy(xpath = "//li/span[@class='sg-property-name']")
	public List<WebElement> labelCashDetailHeaderKeys;

	@FindBy(xpath = "//li/span[@class='sg-property-value ng-star-inserted']")
	public List<WebElement> labelCashDetailHeaderValues;

	// Cash projections tab items
	@FindBy(xpath = "//div[@class='date-menu-link mat-menu-trigger']/strong")
	public UnityWebElement labelDate;

	@FindBy(xpath = "//cash-projections-date-filter//a/span")
	public UnityWebElement dropdownDate;

	@FindBy(xpath = "//*[normalize-space(text())='1 Week']")
	public UnityWebElement radioButtonOneWeek;
	
	@FindBy(xpath = "//*[normalize-space(text())='1 Week']/ancestor::mat-radio-button")
	public UnityWebElement radioButtonOneWeekStatus;

	@FindBy(xpath = "//*[normalize-space(text())='30 Days']")
	public UnityWebElement radioButton30Days;
	
	//Rupali
	@FindBy(xpath = "//span[normalize-space(text())='Security Name']")
	public UnityWebElement headerSecurityName;
	//Rupali
	@FindBy(xpath = "//span[normalize-space(text())='Amount']")
	public UnityWebElement headerAmount;

	@FindBy(xpath = "//*[normalize-space(text())='60 Days']")
	public UnityWebElement radioButton60Days;

	@FindBy(xpath = "//*[normalize-space(text())='90 Days']")
	public UnityWebElement radioButton90Days;
	
	@FindBy(xpath = "//*[normalize-space(text())='90 Days']/ancestor::mat-radio-button")
	public UnityWebElement radioButton90DaysStatus;

	@FindBy(xpath = "//*[@name='toDate']//ancestor::div[@role='menuitem']//mat-radio-button")
	public UnityWebElement radioButtonChooseDate;
	
	@FindBy(xpath = "//security-identifier-details-dialog")
	public UnityWebElement dialogSecurityIdentifier;
	
	@FindBy(xpath = "//security-identifier-details-dialog//*[normalize-space(text())='Name']")
	public UnityWebElement dialogSecurityIdentifierlabelName;
	
	@FindBy(xpath = "//security-identifier-details-dialog//*[normalize-space(text())='Price']")
	public UnityWebElement dialogSecurityIdentifierlabelPrice;
	
	@FindBy(xpath = "//security-identifier-details-dialog//*[normalize-space(text())='Price as Of']")
	public UnityWebElement dialogSecurityIdentifierlabelPriceasOf;
	
	@FindBy(xpath = "//security-identifier-details-dialog//*[normalize-space(text())='Pricing Source']")
	public UnityWebElement dialogSecurityIdentifierlabelPricingSource;
	
	@FindBy(xpath = "//security-identifier-details-dialog//*[normalize-space(text())='Minor Security Type']")
	public UnityWebElement dialogSecurityIdentifierlabelMinorSecurityType;
	
	@FindBy(xpath = "//security-identifier-details-dialog//*[normalize-space(text())='Security Processing Class']")
	public UnityWebElement dialogSecurityIdentifierlabelSecurityProcessingClass;
	
	@FindBy(xpath = "//security-identifier-details-dialog//*[normalize-space(text())='Ticker']")
	public UnityWebElement dialogSecurityIdentifierlabelTicker;
	
	@FindBy(xpath = "//security-identifier-details-dialog//button")
	public UnityWebElement dialogSecurityIdentifierButtonClose;

	@FindBy(xpath = "//*[@name='toDate']")
	public UnityWebElement textboxChooseDate;

	@FindBy(xpath = "//div[@role='menu']//button[span[normalize-space(text())='Refresh']]")
	public UnityWebElement buttonDateRefresh;

	@FindBy(xpath = "//ag-grid-angular[@id='cashProjectionSummary']")
	public UnityGridElement gridCashProjectionSummary;

	@FindBy(xpath = "//ag-grid-angular[@id='cashProjectionGroupByCateogry']")
	public UnityGridElement gridCashProjectionSummaryGroupByCategory;

	@FindBy(xpath = "//div[@class='portfolio-filter-container ng-star-inserted']/strong")
	public UnityWebElement labelPortfolio;

	@FindBy(xpath = "//unity-filter-component//a")
	public UnityWebElement dropdownPortfolio;

	@FindBy(xpath = "//input[@placeholder='Search']")
	public UnityWebElement textboxSearchPortfolio;

	@FindBy(xpath = "//div[contains(@class,'mat-autocomplete-visible')]")
	public UnityWebElement listPortfolios;

	@FindBy(xpath = "//*[normalize-space(text())='More Details']")
	public UnityWebElement linkMoreDetails;

	@FindBy(xpath = "//span[normalize-space(text())='Institution Name']")
	public UnityWebElement labelInstitutionName;

	@FindBy(xpath = "//span[normalize-space(text())='Institution Name']/following-sibling::span")
	public UnityWebElement labelInstitutionNameValue;

	@FindBy(xpath = "//span[normalize-space(text())='Administrative Officer']")
	public UnityWebElement labelAdministrativeOfficer;

	@FindBy(xpath = "//span[normalize-space(text())='Administrative Officer']/following-sibling::span")
	public UnityWebElement labelAdministrativeOfficerValue;

	@FindBy(xpath = "//span[normalize-space(text())='Investment Officer']")
	public UnityWebElement labelInvestmentOfficer;

	@FindBy(xpath = "//span[normalize-space(text())='Investment Officer']/following-sibling::span")
	public UnityWebElement labelInvestmentOfficerValue;

	@FindBy(xpath = "//span[normalize-space(text())='Investment Authority']")
	public UnityWebElement labelInvestmentAuthority;

	@FindBy(xpath = "//span[normalize-space(text())='Investment Authority']/following-sibling::span")
	public UnityWebElement labelInvestmentAuthorityValue;

	@FindBy(xpath = "//span[normalize-space(text())='Investment Objective']")
	public UnityWebElement labelInvestmentObjective;

	@FindBy(xpath = "//span[normalize-space(text())='Investment Objective']/following-sibling::span")
	public UnityWebElement labelInvestmentObjectiveValue;

	@FindBy(xpath = "//li/span[@class='sg-property-name']")
	public List<WebElement> labelCashProjectionHeaderKeys;

	@FindBy(xpath = "//li/span[@class='sg-property-value ng-star-inserted']")
	public List<WebElement> labelCashProjectionHeaderValues;

	@FindBy(xpath = "//monthly//a")
	public UnityWebElement buttonExportMonthly;

	@FindBy(xpath = "//span[normalize-space(text())='Ok']")
	public UnityWebElement buttonExportOk;

	@FindBy(xpath = "//span[normalize-space(text())='Cancel']")
	public UnityWebElement buttonExportCancel;

	@FindBy(xpath = "//download-report-dialog//a")
	public UnityWebElement monthlyReportDownloadLink;

	@FindBy(xpath = "//*[@aria-label='Export to CSV']")
	public UnityWebElement buttonExportToCSV;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Asset Description']]//input")
	public UnityWebElement checkboxAssetDescription;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Currency']]//input")
	public UnityWebElement checkboxCurrency;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Income Balance']]//input")
	public UnityWebElement checkboxIncomeBalance;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Others Balance']]//input")
	public UnityWebElement checkboxOthersBalance;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Principal Balance']]//input")
	public UnityWebElement checkboxPrincipalBalance;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Total Balance']]//input")
	public UnityWebElement checkboxTotalBalance;

	// panel display settings
	@FindBy(xpath = "//monthly/a")
	public UnityWebElement buttonDownloadMonthlyReport;

	@FindBy(xpath = "//mat-panel-title[contains(text(),'Display Settings')]")
	public UnityWebElement panelDisplaySettings;

	@FindBy(xpath = "//strong[normalize-space(text())='Cash to Show']")
	public UnityWebElement labelCashToShow;

	@FindBy(xpath = "//input[@name='ledger']")
	public UnityWebElement radioButtonLedger;

	@FindBy(xpath = "//mat-radio-button[@name='ledger']//div[normalize-space(text())='All']")
	public UnityWebElement radioButtonLedgerAll;

	@FindBy(xpath = "//mat-radio-button[@name='ledger']//div[normalize-space(text())='Income']")
	public UnityWebElement radioButtonLedgerIncome;

	@FindBy(xpath = "//mat-radio-button[@name='ledger']//div[normalize-space(text())='Principal']")
	public UnityWebElement radioButtonLedgerPrincipal;

	@FindBy(xpath = "//mat-radio-group[@name='available']//mat-radio-button")
	public UnityWebElement radioButtonAvailable;

	@FindBy(xpath = "//label[normalize-space(text())='All']//ancestor::mat-radio-button[@name='availableChildRadio']//div[@class='mdc-radio']")
	public UnityWebElement radioButtonAvailableAll;

	@FindBy(xpath = "//label[normalize-space(text())='Income']//ancestor::mat-radio-button[@name='availableChildRadio']//div[@class='mdc-radio']")
	public UnityWebElement radioButtonAvailableIncome;

	@FindBy(xpath = "//label[normalize-space(text())='Principal']//ancestor::mat-radio-button[@name='availableChildRadio']//div[@class='mdc-radio']")
	public UnityWebElement radioButtonAvailablePrincipal;
	
	@FindBy(xpath = "//label[normalize-space(text())='All']//ancestor::mat-radio-button[@name='availableChildRadio']")
	public UnityWebElement radioButtonAvailableAllStatus;

	@FindBy(xpath = "//label[normalize-space(text())='Income']//ancestor::mat-radio-button[@name='availableChildRadio']")
	public UnityWebElement radioButtonAvailableIncomeStatus;

	@FindBy(xpath = "//label[normalize-space(text())='Principal']//ancestor::mat-radio-button[@name='availableChildRadio']")
	public UnityWebElement radioButtonAvailablePrincipalStatus;

	@FindBy(xpath = "//strong[normalize-space(text())='Display']")
	public UnityWebElement labelDisplay;

	@FindBy(xpath = "//label[normalize-space(text())='Daily']//ancestor::mat-radio-button[@name='displayType']//div[@class='mdc-radio']")
	public UnityWebElement radioButtonDaily;

	@FindBy(xpath = "//label[normalize-space(text())='Group by Category']//ancestor::mat-radio-button[@name='displayType']//div[@class='mdc-radio']")
	public UnityWebElement radioButtonGroupByCategory;
	
	@FindBy(xpath = "//label[normalize-space(text())='Daily']//ancestor::mat-radio-button[@name='displayType']")
	public UnityWebElement radioButtonDailyStatus;

	@FindBy(xpath = "//label[normalize-space(text())='Group by Category']//ancestor::mat-radio-button[@name='displayType']")
	public UnityWebElement radioButtonGroupByCategoryStatus;
	
	@FindBy(xpath = "(//*[@data-ref='lbRecordCount'])[1]")
	public UnityWebElement gridCashLiquidAssetSummaryTotalRow;
	
	@FindBy(xpath = "(//*[@data-ref='lbRecordCount'])[2]")
	public UnityWebElement gridCashProjectionSummaryTotalRow;
	
	@FindBy(xpath = "//a[normalize-space(text())='Cash Projections']")
	public UnityWebElement LinkBackToCashProjection;

	@FindBy(xpath = "//button/span[normalize-space(text())='Refresh']")
	public UnityWebElement buttonRefresh;

	@FindBy(xpath = "//span[@ref='eLoadingText']")
	public UnityWebElement labelLoding;

	// panel cash and liquid asset summary
	@FindBy(xpath = "//mat-panel-title[contains(text(),'Cash and Liquid Asset Summary')]")
	public UnityWebElement panelCashAndLiquidAssetSummary;

	@FindBy(xpath = "//ag-grid-angular[@id='cashLiquidAssetSummary']")
	public UnityGridElement gridCashAndLiquidAssetSummary;

	// Export option
	@FindBy(xpath = "(//*[@aria-label='Export to CSV'])[1]")
	public UnityWebElement buttonExportCashAndLiquidAssetSummay;

	@FindBy(xpath = "(//unity-print-v2/button)[1]")
	public UnityWebElement buttonPrintCashAndLiquidAssetSummay;

	// panel cash projection summary
	@FindBy(xpath = "//mat-panel-title[contains(text(),'Cash Projection Summary')]")
	public UnityWebElement panelCashProjectionSummary;

	@FindBy(xpath = "//label[normalize-space(text())='Scheduled Disbursements']/ancestor::mat-checkbox")
	public UnityWebElement checkboxScheduledDisbursements;

	@FindBy(xpath = "//label[normalize-space(text())='Scheduled Receipts']/ancestor::mat-checkbox")
	public UnityWebElement checkboxScheduledReceipts;

	@FindBy(xpath = "//label[normalize-space(text())='Fees']/ancestor::mat-checkbox")
	public UnityWebElement checkboxFees;

	@FindBy(xpath = "//div[@id='cashProjectionSummary']//div[@role='grid']//div[@ref='eBottom']")
	public UnityWebElement rowCashProjectionBottom;

	// Export Option cash projection summary
	@FindBy(xpath = "(//*[@aria-label='Export to CSV'])[2]")
	public UnityWebElement buttonExportCashProjectionSummay;

	@FindBy(xpath = "(//unity-print-v2/button)[2]")
	public UnityWebElement buttonPrintCashProjectionSummay;

	// Cash projections details screen
	@FindBy(xpath = "//a[normalize-space(text())='Cash Projections']")
	public UnityWebElement linkCashProjections;

	@FindBy(xpath = "//ag-grid-angular")
	public UnityGridElement gridCashProjectionDetail;

	// Balance Detail fields
	@FindBy(xpath = "(//span[normalize-space(text())='Available Cash'])[1]")
	public UnityWebElement labelAvailablePortfolioCashKey;

	@FindBy(xpath = "(//span[normalize-space(text())='Ledger Cash (Local)'])[1]")
	public UnityWebElement labelLedgerCashLocalPortfolioCashKey;

	@FindBy(xpath = "(//span[normalize-space(text())='Cash Payable (Local)'])[1]")
	public UnityWebElement labelCashPayableLocalPortfolioCashKey;

	@FindBy(xpath = "(//span[normalize-space(text())='Overdraft Limit'])[1]")
	public UnityWebElement labelOverdraftLimitPortfolioCashKey;

	@FindBy(xpath = "(//span[normalize-space(text())='Cash Receivable (Local)'])[1]")
	public UnityWebElement labelCashReceivableLocalPortfolioCashKey;

	@FindBy(xpath = "(//span[normalize-space(text())='Sweep Sum'])[1]")
	public UnityWebElement labelSweepSumPortfolioCashKey;

	@FindBy(xpath = "//span[normalize-space(text())='Portfolio Number']")
	public UnityWebElement labelPortfolioNumberKey;

	@FindBy(xpath = "//span[normalize-space(text())='Local Currency']")
	public UnityWebElement labelLocalCurrencyKey;

	@FindBy(xpath = "//span[normalize-space(text())='Portfolio Name']")
	public UnityWebElement labelPortfolioNameKey;

	@FindBy(xpath = "(//span[normalize-space(text())='Available Cash'])[2]")
	public UnityWebElement labelAvailablePortfolioSweep;

	@FindBy(xpath = "(//span[normalize-space(text())='Ledger Cash (Local)'])[2]")
	public UnityWebElement labelLedgerCashLocalPortfolioSweep;

	@FindBy(xpath = "(//span[normalize-space(text())='Cash Payable (Local)'])[2]")
	public UnityWebElement labelCashPayableLocalPortfolioSweep;

	@FindBy(xpath = "(//span[normalize-space(text())='Overdraft Limit'])[2]")
	public UnityWebElement labelOverdraftLimitPortfolioSweep;

	@FindBy(xpath = "(//span[normalize-space(text())='Cash Receivable (Local)'])[2]")
	public UnityWebElement labelCashReceivableLocalPortfolioSweep;

	@FindBy(xpath = "(//span[normalize-space(text())='Sweep Sum'])[2]")
	public UnityWebElement labelSweepSumPortfolioSweep;

	@FindBy(xpath = "//span[normalize-space(text())='Current Sweep Strategy Number']")
	public UnityWebElement labelCurrentSweepStrategyNumberKey;

	@FindBy(xpath = "//span[normalize-space(text())='Current Sweep Strategy Abbreviation']")
	public UnityWebElement labelCurrentSweepStrategyAbbreviationKey;

	@FindBy(xpath = "//span[normalize-space(text())='Current Sweep Strategy']")
	public UnityWebElement labelCurrentSweepStrategyKey;

	@FindBy(xpath = "//span[normalize-space(text())='Next Sweep Strategy Number']")
	public UnityWebElement labelNextSweepStrategyNumberKey;

	@FindBy(xpath = "//span[normalize-space(text())='Next Sweep Strategy Abbreviation']")
	public UnityWebElement labelNextSweepStrategyAbbreviationKey;

	@FindBy(xpath = "//span[normalize-space(text())='Next Sweep Strategy']")
	public UnityWebElement labelNextSweepStrategyKey;

	@FindBy(xpath = "//span[normalize-space(text())='Account Gref']")
	public UnityWebElement labelAccountGrefKey;

	@FindBy(xpath = "(//span[normalize-space(text())='Available Cash'])[3]")
	public UnityWebElement labelAvailablePortfolioSweep2;

	@FindBy(xpath = "//span[normalize-space(text())='Cash Payable']")
	public UnityWebElement labelCashPayableKey;

	@FindBy(xpath = "//span[normalize-space(text())='Cash Receivable']")
	public UnityWebElement labelCashReceivableKey;

	@FindBy(xpath = "//span[normalize-space(text())='Currency Decimal Places']")
	public UnityWebElement labelCurrencyDecimalPlacesKey;

	@FindBy(xpath = "//span[normalize-space(text())='Ledger Cash']")
	public UnityWebElement labelLedgerCashKey;

	@FindBy(xpath = "(//span[normalize-space(text())='Overdraft Limit'])[3]")
	public UnityWebElement labelOverdraftLimitPortfolioSweep2;

	@FindBy(xpath = "//span[normalize-space(text())='Portfolio Gref']")
	public UnityWebElement labelPortfolioGrefKey;

	@FindBy(xpath = "//span[normalize-space(text())='Portfolio Internal']")
	public UnityWebElement labelPortfolioInternalKey;

	@FindBy(xpath = "(//span[normalize-space(text())='Sweep Sum'])[3]")
	public UnityWebElement labelSweepSumPortfolioSweep2;

	// Account Details-Portfolio Information
	@FindBy(xpath = "//ag-grid-angular[@id='portfolio-list']//div[@role='grid']")
	public UnityGridElement gridPortfolioDetails;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Invested Cash']]//input")
	public UnityWebElement accountGroupcheckboxInvested;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Total Cash']]//input")
	public UnityWebElement accountGroupcheckboxTotal;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Uninvested Cash']]//input")
	public UnityWebElement accountGroupcheckboxUninvested;

	@FindBy(xpath = "//span[normalize-space(text())='Available Cash']//following::span")
	public UnityWebElement textAvailableCash;

	// Security identifier popup
	@FindBy(xpath = "//Strong[normalize-space(text())='Security Identifier:']")
	public UnityWebElement labelSecurityIdentifierKey;

	@FindBy(xpath = "//span[normalize-space(text())='Name']")
	public UnityWebElement labelNameKey;

	@FindBy(xpath = "//span[normalize-space(text())='Price']")
	public UnityWebElement labelPriceKey;

	@FindBy(xpath = "//span[normalize-space(text())='Price as Of']")
	public UnityWebElement labelPriceAsOfKey;

	@FindBy(xpath = "//span[normalize-space(text())='Pricing Source']")
	public UnityWebElement labelPricingSourceKey;

	@FindBy(xpath = "//span[normalize-space(text())='Minor Security Type']")
	public UnityWebElement labelMinorSecurityTypeKey;

	@FindBy(xpath = "//span[normalize-space(text())='Security Processing Class']")
	public UnityWebElement labelSecurityProcessingClassKey;

	@FindBy(xpath = "//span[normalize-space(text())='Estimated Annual Income Per Unit']")
	public UnityWebElement labelEstimatedAnnualIncomePerUnitKey;

	@FindBy(xpath = "//span[normalize-space(text())='Estimated Annual Income Rate']")
	public UnityWebElement labelEstimatedAnnualIncomeRateKey;

	@FindBy(xpath = "//span[normalize-space(text())='Dated Date']")
	public UnityWebElement labelDatedDateKey;

	@FindBy(xpath = "//span[normalize-space(text())='Maturity Date']")
	public UnityWebElement labelMaturityDateKey;

	@FindBy(xpath = "//span[normalize-space(text())='Series']")
	public UnityWebElement labelSeriesKey;

	@FindBy(xpath = "//span[normalize-space(text())='Pool Number']")
	public UnityWebElement labelPoolNumberKey;

	@FindBy(xpath = "//span[normalize-space(text())='Security Considered Worthless']")
	public UnityWebElement labelSecurityConsideredWorthlessKey;

	@FindBy(xpath = "//label[normalize-space(text())='Available Cash']/ancestor::mat-checkbox")
	public UnityWebElement checkboxAvailableCash;

	@FindBy(xpath = "//label[normalize-space(text())='Cash Reserves']/ancestor::mat-checkbox")
	public UnityWebElement checkboxCashReserves;

	@FindBy(xpath = "//label[normalize-space(text())='Lines of Credit']/ancestor::mat-checkbox")
	public UnityWebElement checkboxLinesOfCredit;

	@FindBy(xpath = "//span[normalize-space(text())='Lines of Credit']")
	public UnityWebElement headerLinesOfCredit;

	@FindBy(xpath = "//a[*[normalize-space(text())='Balance']]")
	public UnityWebElement linkBalance;

	@FindBy(xpath = "//span[normalize-space(text())='Cash Reserves']")
	public UnityWebElement labelCashReserves;

	@FindBy(xpath = "//span[normalize-space(text())='Lines of Credit']")
	public UnityWebElement labelLinesOfCredit;

	@FindBy(xpath = "//span[normalize-space(text())='Cash Management Vehicles']")
	public UnityWebElement labelCashManagement;

	@FindBy(xpath = "//span[normalize-space(text())='Good/Fed Funds']")
	public UnityWebElement labelGoodFedFunds;

	@FindBy(xpath = "//span[normalize-space(text())='Available Funds']")
	public UnityWebElement labelAvailableFunds;
	
	@FindBy(xpath = "//span[normalize-space(text())='Total Available Cash']")
	public UnityWebElement labelTotalAvailableCash;

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

	public void resetCashBalanceGrid() {
		List<String> expectedColumnNames = new ArrayList<>();
		// expectedColumnNames.add("Portfolio name");
		expectedColumnNames.add("Invested");
		expectedColumnNames.add("Uninvested");
		expectedColumnNames.add("Total");

		List<String> actualColumnNames = new ArrayList<>();
		for (WebElement header : gridHeaders) {
			actualColumnNames.add(header.getText());
		}

		if (!actualColumnNames.containsAll((expectedColumnNames))) {
			linkFilterGrid.click();
			// checkboxTotal.waitforVisible();
			for (String actual : expectedColumnNames) {
				if (driver
						.findElement(
								By.xpath("//mat-checkbox[.//span[normalize-space(text())='" + actual + "']]//input"))
						.getAttribute("aria-checked").equalsIgnoreCase("false")) {
					driver.findElement(
							By.xpath("//mat-checkbox[.//span[normalize-space(text())='" + actual + "']]//input"))
							.click();
				}
			}
			buttonSave.click();
		}
	}

	public String formatServiceUrl(String serviceUrl) {
		String date = dropdownDate.getText().split("-")[1].trim();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		serviceUrl = serviceUrl.replace("YYYY-MM-DD", LocalDate.parse(date, formatter).format(formatter2));
		return serviceUrl;
	}

	public String getDaysBetweenDates() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String firstString = dropdownDate.getText().split("-")[0].trim();
		String secondString = dropdownDate.getText().split("-")[1].trim();
		LocalDate firstDate = LocalDate.parse(firstString, formatter);
		LocalDate secondDate = LocalDate.parse(secondString, formatter);
		long days = ChronoUnit.DAYS.between(firstDate, secondDate) + 1; // added
																		// 1
																		// because,included
																		// business
																		// date
		System.out.println("days:"+ Long.toString(days));
		return Long.toString(days);
	}

}
