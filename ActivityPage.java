package com.unity.pages;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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
import com.unity.customelements.UnityTableElement;
import com.unity.customelements.UnityWebElement;
import com.unity.utilities.UnityUtils;

public class ActivityPage extends BaseTestPage {

	WebDriver driver;

	public ActivityPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}
	
	@FindBy(xpath = "//button[@id='activity-history-details-edit']")
	public UnityWebElement linkEditPencilIcon;
	
	@FindBy(xpath = "//span[text()=' Reverse transaction ']")
	public UnityWebElement linkReverseTransaction;
	
	@FindBy(xpath = "//span[text()='Submit']")
	public UnityWebElement buttonSubmit;
	
	@FindBy(xpath = "//div[normalize-space(text())='Last Quarter']")
	public UnityWebElement optionLastQuarter;
	
	@FindBy(xpath = "//div[normalize-space(text())='Last Month']")
  	 public UnityWebElement optionLastMonth;

	@FindBy(xpath = "//div[normalize-space(text())='Last Week']")	
  	 public UnityWebElement optionLastWeek;

	@FindBy(xpath = "//div[normalize-space(text())='Prior Year']")
 	  public UnityWebElement optionPriorYear;

	@FindBy(xpath = "//div[normalize-space(text())='Last 90 Days']")
	public UnityWebElement optionLast90Days;
	
	@FindBy(xpath = "//div[normalize-space(text())='Fiscal Year']")
	public UnityWebElement optionFiscalYear;

	@FindBy(xpath = "//div[normalize-space(text())='Prior Fiscal Year']")
		public UnityWebElement optionPriorFiscalYear;

	
	// Tab menus
	@FindBy(xpath = "//span[contains(text(),' History ')]//parent::button")
	public UnityWebElement tabHistory;

	@FindBy(xpath = "//span[contains(@class,'ag-header-cell-text')]")
	public List<WebElement> gridHeaders;

	@FindBy(xpath = "//button[div[normalize-space(text())='Year-To-Date Summary']]")
	public UnityWebElement tabYearToDateSummary;

	@FindBy(xpath = "//button[div[normalize-space(text())='Pending Orders']]")
	public UnityWebElement tabPendingOrders;

	@FindBy(xpath = "//button[div[normalize-space(text())='Pending Frees']]")
	public UnityWebElement tabPendingFrees;

	@FindBy(xpath = "//h2/following-sibling::small")
	public List<WebElement> labelheaderKeys;

	@FindBy(xpath = "//div/h2")
	public List<WebElement> labelheaderValues;

	@FindBy(xpath = "//mat-icon[contains(@fisicon,'table')]")
	public UnityWebElement linkFilterGrid;

	// Print icon
	@FindBy(xpath = "//unity-client-side-print-upgrade//mat-icon[@fisicon='print']")
	public UnityWebElement linkPrint;

	@FindBy(xpath = "//*[normalize-space(text())='Print All Pages']")
	public UnityWebElement buttonPrintAllPages;

	@FindBy(xpath = "//*[normalize-space(text())='Print Current Page']")
	public UnityWebElement buttonCurrentPage;

	// History filter grid
	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Ledger Cash (Base)']]//input")
	public UnityWebElement checkboxLedgerCashBase;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Portfolio Name']]//input")
	public UnityWebElement checkboxPortflioName;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Portfolio Number']]//input")
	public UnityWebElement checkboxPortflioNumber;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Action']]//input")
	public UnityWebElement checkboxAction;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Quantity']]//input")
	public UnityWebElement checkboxQuantity;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Entitlement Date']]//input")
	public UnityWebElement checkboxEntitlementdate;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Settlement Date']]//input")
	public UnityWebElement checkboxSettlementdate;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Security Description']]//input")
	public UnityWebElement checkboxSecurityDescription;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Units']]//input")
	public UnityWebElement checkboxUnits;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Tax Description']]//input")
	public UnityWebElement checkboxTaxDescription;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Transaction Type']]//input")
	public UnityWebElement checkboxTransactionType;

	@FindBy(xpath = "//button//span[normalize-space(text())='Save']")
	public UnityWebElement buttonSaveFilterGrid;

	// History tab items
	@FindBy(xpath = "//span[contains(@class,'selected-date')]")
	public UnityWebElement dropdownDate;

	@FindBy(xpath = "//div[normalize-space(text())='This Month']")
	public UnityWebElement optionThisMonth;

	@FindBy(xpath = "//div[normalize-space(text())='This Week']")
	public UnityWebElement optionThisWeek;

	@FindBy(xpath = "//div[normalize-space(text())='This Quarter']")
	public UnityWebElement optionThisQuarter;

	@FindBy(xpath = "//div[normalize-space(text())='Last 12 Months']")
	public UnityWebElement optionLast12Months;

	@FindBy(xpath = "//div[normalize-space(text())='Year to Date']")
	public UnityWebElement optionYearToDate;

	@FindBy(xpath = "//*[normalize-space(text())='Custom Date']")
	public UnityWebElement optionCustomDate;

	@FindBy(xpath = "//input[@placeholder='From']")
	public UnityWebElement textboxFromDate;

	@FindBy(xpath = "//input[@placeholder='To']")
	public UnityWebElement textboxToDate;

	@FindBy(xpath = "//button/span[normalize-space(text())='Cancel']")
	public UnityWebElement buttonCancel;

	@FindBy(xpath = "//button[contains(@class,'mat-focus-indicator')]//following-sibling::button//span")
	public UnityWebElement buttonGo;

	@FindBy(xpath = "//*[normalize-space(text())='Portfolio:']/../..//a[@class='filter-text']")
	public UnityWebElement dropdownPortfolio;

	@FindBy(xpath = "//input[@placeholder='Search']")
	public UnityWebElement textboxSearchPortfolio;

	@FindBy(xpath = "//span[@class='selectedYTD']//mat-select[@role='combobox']")
	public UnityWebElement dropdownQuickViews;

	@FindBy(xpath = "//mat-option[span[normalize-space(text())='Fees YTD']]")
	public UnityWebElement optionFeesYTD;

	@FindBy(xpath = "//mat-option[span[normalize-space(text())='Income YTD']]")
	public UnityWebElement optionIncomeYTD;

	@FindBy(xpath = "//mat-option[span[normalize-space(text())='Buy/Sell YTD']]")
	public UnityWebElement optionBuySellYTD;

	@FindBy(xpath = "//button[@aria-label='close']")
	public UnityWebElement buttonClosePortfolioList;

	@FindBy(xpath = "//mat-option[span[normalize-space(text())='Transaction description']]")
	public UnityWebElement optionTransactionDescription;

	@FindBy(xpath = "(//div[contains(@class,'ag-column-drop-list')])[1]")
	public UnityWebElement groupByBar;

	@FindBy(xpath = "//div[@title='Date Traded']")
	public UnityWebElement gridHeaderDateTraded;

	@FindBy(xpath = "//mat-option[span[normalize-space(text())='Reporting date']]")
	public UnityWebElement optionReportingDate;

	@FindBy(xpath = "//mat-option[span[normalize-space(text())='Date settled']]")
	public UnityWebElement optionDateSettled;

	@FindBy(xpath = "//mat-option[span[normalize-space(text())='Posting date']]")
	public UnityWebElement optionPostingDate;

	@FindBy(xpath = "//div[@role='grid']")
	public UnityGridElement gridActivityHistory;

	@FindBy(xpath = "//*[@aria-label='Export to CSV']")
	public UnityWebElement buttonExportToCSV;

	@FindBy(xpath = "(//a[normalize-space(text())='Miscellaneous Disbursement'])[2]")
	public UnityWebElement linkMiscellaneousDisbursement;

	@FindBy(xpath = "//button[@id='activity-history-details-edit-backdate']")
	public UnityWebElement optionBackdate;

	@FindBy(xpath = "//button[@id='activity-history-details-edit-modifyTransaction']")
	public UnityWebElement optionModifyTransaction;

	@FindBy(xpath = "//button[@id='activity-history-details-edit-reverseTransaction']")
	public UnityWebElement optionReverseTransaction;

	@FindBy(xpath = "//span[contains(@class,'page-text page-value')]")
	public UnityWebElement textPage1Of2;

	@FindBy(xpath = "//div[contains(@class,'sg-property-name')]")
	public List<WebElement> labelHeadersTransactionDetail;

	@FindBy(xpath = "//div[starts-with(@class,'sg-property-value')]")
	public List<WebElement> labelValuesTransactionDetail;

	@FindBy(xpath = "//*[normalize-space(text())='Collapse all' or normalize-space(text())='Collapse All']")
	public UnityWebElement linkCollapseAll;

	@FindBy(xpath = "//*[normalize-space(text())='Expand All']")
	public UnityWebElement linkExpandAll;

	@FindBy(xpath = "//table[@class='rgMasterTable']")
	public UnityTableElement tableDocuments;

	@FindBy(xpath = "//span[contains(@id,'ChangePageSizeLabel')]")
	public UnityWebElement labelPageSize;

	@FindBy(xpath = "//input[contains(@id,'PageSizeComboBox_Input')]")
	public UnityWebElement textBoxPageSizeNumber;

	@FindBy(xpath = "//span/*[normalize-space(text())='Documents']")
	public UnityWebElement panelDocuments;

	@FindBy(xpath = "//iframe[contains(@src,'Documents')]")
	public UnityWebElement frameDocuments;

	@FindBy(xpath = "//div[normalize-space(text())='No records to display.']")
	public UnityWebElement labelNorecordstodisplay;

	@FindBy(xpath = "//button[@id='activity-history-details-edit']")
	public UnityWebElement iconNarrativeEdit;

	@FindBy(xpath = "//span[normalize-space(text())='Backdate']")
	public UnityWebElement textBackDate;

	@FindBy(xpath = "//*[normalize-space(text())='Modify Transaction']")
	public UnityWebElement textModifyTransaction;

	@FindBy(xpath = "//*[normalize-space(text())='Reverse Transaction']")
	public UnityWebElement textReverseTransaction;

	// Backdate edit
	@FindBy(xpath = "//iframe[@id='global-office-portal']")
	public UnityWebElement frameBackdate;

	@FindBy(xpath = "//a[normalize-space(text())='Open the calendar popup.']")
	public UnityWebElement iconCalender;

	@FindBy(xpath = "//td[@class='rcMain']")
	public UnityWebElement windowCalender;

	@FindBy(xpath = "//input[@id='ctlBackdateTransaction_ctlRadDatePickerBackDate_dateInput']")
	public UnityWebElement textboxCalender;

	@FindBy(xpath = "//span[@class='rdCollapse']")
	public UnityWebElement iconCollapseComment;

	@FindBy(xpath = "//span[@class='rdExpand']")
	public UnityWebElement iconExpandComment;

	@FindBy(xpath = "//a[normalize-space(text())='Add Comments']")
	public UnityWebElement linkAddComments;

	@FindBy(xpath = "//textarea[contains(@id,'ctlEnterComments')]")
	public UnityWebElement textboxAddComments;

	@FindBy(xpath = "//input[@value='Save']")
	public UnityWebElement buttonSave;

	@FindBy(xpath = "//input[@name='ctlCancel']")
	public UnityWebElement buttonCancelBackdate;

	// Modify transaction edit
	@FindBy(xpath = "//em[normalize-space(text())='Tax Code']")
	public UnityWebElement labelTaxCode;

	@FindBy(xpath = "//span[normalize-space(text())='Transaction Description']")
	public UnityWebElement labelTransactionDescriptionEdit;

	@FindBy(xpath = "//span[normalize-space(text())='Investment Authority']")
	public UnityWebElement labelInvestmentAuthority;

	@FindBy(xpath = "//span[normalize-space(text())='External Reference']")
	public UnityWebElement labelExternalReference;

	@FindBy(xpath = "//span[normalize-space(text())='Explanation']")
	public UnityWebElement labelExplanation;

	@FindBy(xpath = "//div[@id='ctlModifyTransaction_ctlDockTxIdent_C_ctlRadAjaxPnlTaxCodes']/table")
	public UnityWebElement tableModifyTransaction;

	@FindBy(xpath = "//input[@name='ctlClearFields']")
	public UnityWebElement buttonCancelModifyTransaction;

	// Reverse transaction edit
	@FindBy(xpath = "//span[normalize-space(text())='Transaction GREF']")
	public UnityWebElement labelTransactionGREF;

	@FindBy(xpath = "//span[normalize-space(text())='Description']")
	public UnityWebElement labelDescription;

	@FindBy(xpath = "//span[normalize-space(text())='Transaction Date']")
	public UnityWebElement labelTransactionDate;

	// Transaction details popup
	@FindBy(xpath = "//h2[normalize-space(text())='Transaction Summary']")
	public UnityWebElement headerTransactionDetails;

	@FindBy(xpath = "//div[@class='transaction-details__print']//button")
	public UnityWebElement linkPrintTransactionDetail;

	@FindBy(xpath = "//button[@aria-label='Prev']")
	public UnityWebElement buttonPrevious;

	@FindBy(xpath = "//button[@aria-label='Next']")
	public UnityWebElement buttonNext;

	@FindBy(xpath = "//button[@aria-label='Prevdouble']")
	public UnityWebElement buttonPreviousDouble;

	@FindBy(xpath = "//button[@aria-label='Nextdouble']")
	public UnityWebElement buttonNextDouble;

	@FindBy(xpath = "//div[@class='show-more-container']/button")
	public UnityWebElement linkShowMoreDetails;

	@FindBy(xpath = "//p/a[normalize-space(text())='History']")
	public UnityWebElement linkHistory;

	@FindBy(xpath = "//button[@aria-label='menu']")
	public UnityWebElement buttonEditMenu;

	@FindBy(xpath = "//*[normalize-space(text())='Narrative']")
	public UnityWebElement panelNarrative;

	@FindBy(xpath = "//*[normalize-space(text())='Cash Details']")
	public UnityWebElement panelCashDetails;

	@FindBy(xpath = "//*[normalize-space(text())='Tax Details']")
	public UnityWebElement panelTaxDetails;

	@FindBy(xpath = "//*[normalize-space(text())='Transaction Information']")
	public UnityWebElement panelTransactionInformation;

	@FindBy(xpath = "//*[normalize-space(text())='Tax Code Details']")
	public UnityWebElement panelTaxCodeDetails;

	@FindBy(css = "#taxCodeDetails div[role='grid']")
	public UnityGridElement gridTaxCodeDetails;

	@FindBy(xpath = "//*[normalize-space(text())='Pay Record Details']")
	public UnityWebElement panelPayRecordDetails;

	@FindBy(xpath = "//*[normalize-space(text())='Gross to Net Details']")
	public UnityWebElement panelGrossToNetDetails;

	@FindBy(css = "#grossToNetDetails div[role='grid']")
	public UnityGridElement gridGrossToNetDetails;

	// labels in history subtab
	@FindBy(xpath = "//transaction-narrative[@display='narrativeText']//div")
	public List<WebElement> labelNarrativeValue;

	@FindBy(xpath = "//span[normalize-space(text())='Ref gref']")
	public UnityWebElement headerRefgref;

	@FindBy(xpath = "//div[normalize-space(text())='Portfolio Number']")
	public UnityWebElement labelPortfolioNumber;

	@FindBy(xpath = "//div[normalize-space(text())='Portfolio Name']")
	public UnityWebElement labelPortfolioName;

	@FindBy(xpath = "//div[normalize-space(text())='Local Currency']")
	public UnityWebElement labelLocalCurrency;

	@FindBy(xpath = "//ol//div[normalize-space(text())='Transaction Description']")
	public UnityWebElement labelTransactionDescription;

	@FindBy(xpath = "//div[normalize-space(text())='Transaction Type']")
	public UnityWebElement labelTransactionType;

	@FindBy(xpath = "//div[normalize-space(text())='Transaction Amount']")
	public UnityWebElement labelTransactionAmount;

	@FindBy(xpath = "//div[normalize-space(text())='Units']")
	public UnityWebElement labelUnits;

	@FindBy(xpath = "//div[normalize-space(text())='Date Posted']")
	public UnityWebElement labelDatePosted;

	@FindBy(xpath = "//div[normalize-space(text())='Date of Report']")
	public UnityWebElement labelDateOfReport;

	@FindBy(xpath = "//ol//div[normalize-space(text())='Date Traded']")
	public UnityWebElement labelDateTraded;

	@FindBy(xpath = "//ol//div[normalize-space(text())='Date Settled']")
	public UnityWebElement labelDateSettled;

	@FindBy(xpath = "//div[normalize-space(text())='Cusip']")
	public UnityWebElement labelCusip;

	@FindBy(xpath = "//div[normalize-space(text())='Security Description']")
	public UnityWebElement labelSecurityDescription;

	@FindBy(xpath = "//div[normalize-space(text())='Transaction GREF']")
	public UnityWebElement labelTransactionGrf;

	@FindBy(xpath = "//div[normalize-space(text())='Currency']")
	public UnityWebElement labelCurrency;

	@FindBy(xpath = "//div[normalize-space(text())='Reference Number']")
	public UnityWebElement labelReferenceNumber;

	@FindBy(xpath = "//div[normalize-space(text())='Net Amount Broker']")
	public UnityWebElement labelNetAmountBroker;

	@FindBy(xpath = "//div[normalize-space(text())='Gross Amount']")
	public UnityWebElement labelGrossAmount;

	@FindBy(xpath = "//*[normalize-space(text())='Gross cash' or normalize-space(text())='Gross Cash']")
	public UnityWebElement labelGrossCash;

	@FindBy(xpath = "//*[normalize-space(text())='Ledger cash (local)' or normalize-space(text())='Ledger Cash (Local)']")
	public UnityWebElement labelLedgerCashLocal;

	@FindBy(xpath = "//*[normalize-space(text())='Cash Payable (Local)']")
	public UnityWebElement labelCashPayableLocal;

	@FindBy(xpath = "//*[normalize-space(text())='Cash receivable (local)' or normalize-space(text())='Cash Receivable (Local)']")
	public UnityWebElement labelCashReceivableLocal;

	@FindBy(xpath = "//*[normalize-space(text())='Reporting cash' or normalize-space(text())='Reporting Cash']")
	public UnityWebElement labelReportingCash;

	@FindBy(xpath = "//div[normalize-space(text())='Tax Year for 1099']")
	public UnityWebElement labelTaxYearFor1099;

	@FindBy(xpath = "//div[normalize-space(text())='Withholding Rate']")
	public UnityWebElement labelWithholdingRate;

	@FindBy(xpath = "//div[normalize-space(text())='Withholding Amount at Source']")
	public UnityWebElement labelWithholdingAmountAtSource;

	@FindBy(xpath = "//div[normalize-space(text())='Withholding Amount by Us']")
	public UnityWebElement labelWithholdingAmountByUs;

	@FindBy(xpath = "//div[normalize-space(text())='Non-resident Alien Withholding Rate']")
	public UnityWebElement labelNonresidentAlienWithholdingRate;

	@FindBy(xpath = "//div[normalize-space(text())='Non-resident Alien Withholding Amount at Source']")
	public UnityWebElement labelNonresidentAlienWithholdingAmountAtSource;

	@FindBy(xpath = "//div[normalize-space(text())='Non-resident Alien Withholding Amount by Us']")
	public UnityWebElement labelNonresidentAlienWithholdingAmountByUs;

	@FindBy(xpath = "//div[normalize-space(text())='Withholding Description']")
	public UnityWebElement labelWithholdingDescription;

	@FindBy(xpath = "//div[normalize-space(text())='Non-resident Withholding Description']")
	public UnityWebElement labelNonresidentWithholdingDescription;

	@FindBy(xpath = "//div[normalize-space(text())='Non-resident Alien Tax Treatment Code']")
	public UnityWebElement labelNonresidentAlienTaxTreatmentCode;

	@FindBy(xpath = "//div[normalize-space(text())='Withholding Tax Treatment Code']")
	public UnityWebElement labelWithholdingTaxTreatmentCode;

	@FindBy(xpath = "//div[normalize-space(text())='Country']")
	public UnityWebElement labelCountry;

	@FindBy(xpath = "//div[normalize-space(text())='Non-resident Alien Withholding Description']")
	public UnityWebElement labelNonresidentAlienWithholdingDescription;

	@FindBy(xpath = "//*[normalize-space(text())='Check Amount']")
	public UnityWebElement labelCheckAmountKey;

	@FindBy(xpath = "//*[normalize-space(text())='Issue Date']")
	public UnityWebElement labelIssueDateKey;

	@FindBy(xpath = "//*[normalize-space(text())='Check Status']")
	public UnityWebElement labelCheckStatusKey;

	@FindBy(xpath = "//*[normalize-space(text())='Check Number']")
	public UnityWebElement labelCheckNumberKey;

	@FindBy(xpath = "//*[normalize-space(text())='Payment Type']")
	public UnityWebElement labelPaymentTypeKey;

	@FindBy(xpath = "//*[normalize-space(text())='Combined Payment Count']")
	public UnityWebElement labelCombinedPaymentCountKey;

	@FindBy(xpath = "//*[normalize-space(text())='Payee Name']")
	public UnityWebElement labelPayeeNameKey;

	@FindBy(xpath = "//*[normalize-space(text())='Payee Address']")
	public UnityWebElement labelPayeeAddressKey;

	// CheckBox option for Tax code details sub tab
	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Exchange Rate']]//input")
	public UnityWebElement checkboxExchangeRate;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Tax Treatment']]//input")
	public UnityWebElement checkboxTaxTreatment;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Tax Treatment Abrv']]//input")
	public UnityWebElement checkboxTaxTreatmentAbrv;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Tax Year']]//input")
	public UnityWebElement checkboxTaxYear;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Tax Amount (Local)']]//input")
	public UnityWebElement checkboxTaxAmountLocal;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Tax Amount (Base)']]//input")
	public UnityWebElement checkboxTaxAmountBase;

	// Export
	@FindBy(xpath = "//*[@aria-label='Export to CSV']")
	public UnityWebElement buttonExportTaxCodeDetails;

	// Advanced filters
	@FindBy(xpath = "//mat-expansion-panel-header//mat-panel-title[normalize-space(text())='Advanced Filters']")
	public UnityWebElement linkAdvancedFilters;

	@FindBy(xpath = "//mat-expansion-panel-header//mat-panel-title[normalize-space(text())='Advanced Filters']")
	public UnityWebElement panelAdvancedFilters;

	@FindBy(xpath = "//*[normalize-space(text())='Security:']/following-sibling::*//span")
	public UnityWebElement dropdownSecurity;

	@FindBy(xpath = "//input[@placeholder='Search']")
	public UnityWebElement textboxSearchSecurity;

	@FindBy(xpath = "//div[@role='listbox']")
	public UnityWebElement listSuggestions;

	@FindBy(xpath = "//*[normalize-space(text())='Transaction Categories:']/following-sibling::*//mat-select")
	public UnityWebElement dropdownTransactionCategories;

	@FindBy(xpath = "(//span[contains(text(),'Purchases')])")
	public UnityWebElement optionPurchases;

	@FindBy(xpath = "(//span[contains(text(),'Other Receipts')])")
	public UnityWebElement optionOtherReceipts;

	@FindBy(xpath = "//span[@class='mat-option-text']")
	public List<WebElement> advanceFilterDropdownCategoriesoption;

	@FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
	public UnityWebElement optionReceivables;

	@FindBy(xpath = "(//span[@class='mat-option-text'])[3]")
	public UnityWebElement optionSales;

	@FindBy(xpath = "//input[contains(@class,'cdk-text-field-autofill-monitored') and @placeholder='Search']")
	public UnityWebElement textboxSearchTransactionCatrgory;

	@FindBy(xpath = "//mat-option[.//span[normalize-space(text())='Fees']]")
	public UnityWebElement checkboxFees;

	@FindBy(xpath = "//*[normalize-space(text())='Transaction Description:']/following-sibling::*//mat-select")
	public UnityWebElement dropdownTransactionDescription;

	@FindBy(xpath = "//div[@class='ng-trigger ng-trigger-transformPanel ng-tns-c23-17 mat-select-panel mat-select-search-panel ng-star-inserted mat-select-panel-done-animating")
	public UnityWebElement dropdownTransactionDescriptionOption;

	@FindBy(xpath = "//input[contains(@class,'mat-select-search-input') and @placeholder='Search']")
	public UnityWebElement textboxTransactionDescriptionSearch;

	@FindBy(xpath = "//mat-option//span[normalize-space(text())='Miscellaneous Disbursement']")
	public UnityWebElement checkboxMiscellaneousDisbursement;

	@FindBy(xpath = "//mat-option//span[normalize-space(text())='Interest Payment']")
	public UnityWebElement checkboxInterestPayment;

	@FindBy(xpath = "//mat-option//span[normalize-space(text())='Interest']")
	public UnityWebElement checkboxInterest;

	@FindBy(xpath = "//mat-option//span[normalize-space(text())='Update Only']")
	public UnityWebElement checkboxUpdateOnly;

	@FindBy(xpath = "//button[@id='activity-advanced-filter-refresh']")
	public UnityWebElement buttonRefresh;

	@FindBy(xpath = "//input[@name='units']")
	public UnityWebElement textboxUnits;

	@FindBy(xpath = "//*[normalize-space(text())='Tax Description:']/following-sibling::*//mat-select")
	public UnityWebElement dropdownTaxDescription;

	@FindBy(xpath = "//span[normalize-space(text())='Purchase Security']")
	public UnityWebElement optionPurchaseSecurity;

	@FindBy(xpath = "//*[normalize-space(text())='Transaction Type:']/following-sibling::*//mat-select")
	public UnityWebElement dropdownTransactionType;

	@FindBy(xpath = "(//span[contains(text(),'Establish Receivables')])")
	public UnityWebElement optionEstablishReceivables;

	@FindBy(xpath = "(//span[contains(text(),'Cash Receipt')])")
	public UnityWebElement optionCashReceipt;

	@FindBy(xpath = "//input[@name='ledgerCash']")
	public UnityWebElement textboxLedgerCashLocal;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Reversed/Reversals']]//input")
	public UnityWebElement checkboxReversedReversals;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Rendered Statements']]//input")
	public UnityWebElement checkboxRenderedStatements;

	// Year-to-date summary tab links
	@FindBy(xpath = "//mat-panel-title//*[normalize-space(text())='Deposit Activity']")
	public UnityWebElement panelDepositActivity;

	@FindBy(xpath = "//mat-panel-title//*[normalize-space(text())='Withdrawal Activity']")
	public UnityWebElement panelWithdrawalActivity;

	@FindBy(xpath = "//mat-panel-title//*[normalize-space(text())='Trade Activity']")
	public UnityWebElement panelTradeActivity;

	// Pending Orders tab links
	@FindBy(css = "div[role='grid']")
	public UnityGridElement gridPendingOrders;

	@FindBy(xpath = "//strong[normalize-space(text())='Security:']")
	public UnityWebElement labelSecurity;

	@FindBy(xpath = "//unity-filter-component[@endpoint='OOSecurities']")
	public UnityWebElement dropdownSecurityPendingOrders;

	@FindBy(xpath = "//button[@aria-label='close']")
	public UnityWebElement buttonClose;

	@FindBy(xpath = "//span[normalize-space(text())='✕']")
	public UnityWebElement buttonFilterClose;

	@FindBy(xpath = "//h3[normalize-space(text())='Order Information']")
	public UnityWebElement labelOrderInformation;

	@FindBy(xpath = "//h3[normalize-space(text())='Cash Information']")
	public UnityWebElement labelCashInformation;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Type']]//input")
	public UnityWebElement checkboxType;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Cash Amount']]//input")
	public UnityWebElement checkboxCashAmount;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Filled']]//input")
	public UnityWebElement checkboxFilled;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Asset Name (Ticker)']]//input")
	public UnityWebElement checkboxAssetNameTicker;

	// Pending Frees
	@FindBy(css = "div[role='grid']")
	public UnityGridElement gridPendingFrees;

	@FindBy(xpath = "//h2[normalize-space(text())='Pending Free Detail']")
	public UnityWebElement headerPendingFreeDetail;

	@FindBy(xpath = "//h2[normalize-space(text())='Security Profile']")
	public UnityWebElement headerSecurityProfile;

	@FindBy(xpath = "//security-profile//span[@class='sg-property-name']")
	public List<WebElement> labelKeysSecurityDetail;

	@FindBy(xpath = "//security-profile//span[contains(@class,'sg-property-value')]")
	public List<WebElement> labelValuesSecurityDetail;

	@FindBy(xpath = "//pending-free-detail//span[@class='sg-property-name']")
	public List<WebElement> labelKeysPendingFreeDetail;

	@FindBy(xpath = "//pending-free-detail//span[contains(@class,'sg-property-value')]")
	public List<WebElement> labelValuesPendingFreeDetail;

	// Security Details
	@FindBy(xpath = "//h2[normalize-space(text())='Security Details']")
	public UnityWebElement headerSecurityDetails;

	@FindBy(xpath = "//*[normalize-space(text())='Security Identifier:']")
	public UnityWebElement labelSecurityIdentifierKey;

	@FindBy(xpath = "//span[@class='sg-property-name'][contains(normalize-space(text()),'Name')]")
	public UnityWebElement labelNameKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Price')]")
	public UnityWebElement labelPriceKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Price As of')]")
	public UnityWebElement labelPriceAsOfKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Pricing Source')]")
	public UnityWebElement labelPricingSourceKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Minor Security Type')]")
	public UnityWebElement labelMinorSecurityTypeKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Security Processing Class')]")
	public UnityWebElement labelSecurityProcessingClassKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Estimated Annual Income')]")
	public UnityWebElement labelEstimatedAnnualIncomeKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Estimated Annual Income Rate')]")
	public UnityWebElement labelEstimatedAnnualIncomeRateKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Dated Date')]")
	public UnityWebElement labelDatedDateKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Maturity Date')]")
	public UnityWebElement labelMaturityDateKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Series')]")
	public UnityWebElement labelSeriesKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Security Considered Worthless')]")
	public UnityWebElement labelSecurityConsideredWorthlessKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Pool Number')]")
	public UnityWebElement labelPoolNumberKey;

	// Order Detail value
	@FindBy(xpath = "//h2[normalize-space(text())='Order Detail']")
	public UnityWebElement headerOrderDetail;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Order Number')]")
	public UnityWebElement labelOrderNumberKey;

	@FindBy(xpath = "//div[contains(normalize-space(text()),'Portfolio')]")
	public UnityWebElement labelPortfolioKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Security Gref')]")
	public UnityWebElement labelSecurityGrefKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Security ID')]")
	public UnityWebElement labelSecurityIdKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Status')]")
	public UnityWebElement labelStatusKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Date to Execute')]")
	public UnityWebElement labelDateToExecuteKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Broker Office')]")
	public UnityWebElement labelBrokerOfficeKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Type')]")
	public UnityWebElement labelTypeKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Description')]")
	public UnityWebElement labelDescriptionKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Action')]")
	public UnityWebElement labelActionKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Lot Sale Method')]")
	public UnityWebElement labelLotSaleMethodKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Broker Firm')]")
	public UnityWebElement labelBrokerFirmKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Broker Salesman')]")
	public UnityWebElement labelBrokerSalesmanKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Cash Amount')]")
	public UnityWebElement labelCashAmountKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Cash Currency (ISO)')]")
	public UnityWebElement labelCashCurrencyISOKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Filled')]")
	public UnityWebElement labelFilledKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Stop Price')]")
	public UnityWebElement labelStopPriceKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Quantity')]")
	public UnityWebElement labelQuantityKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Remain')]")
	public UnityWebElement labelRemainKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Limit Price')]")
	public UnityWebElement labelLimitPriceKey;

	// Transaction Information elements
	@FindBy(xpath = "//div[@id='mat-tab-label-1-0']//div[@class='mat-tab-label-content']")
	public UnityWebElement tabTransactionInformation;

	@FindBy(xpath = "//*[normalize-space(text())='Portfolio Number']")
	public UnityWebElement labelPortfolioNumberKey;

	@FindBy(xpath = "//div[normalize-space(text())='Portfolio Number']")
	public UnityWebElement labelPortfolioNumberTransactionInformationPopUpKey;

	@FindBy(xpath = "//*[normalize-space(text())='Portfolio Name']")
	public UnityWebElement labelPortfolioNameKey;

	@FindBy(xpath = "//*[normalize-space(text())='Currency']")
	public UnityWebElement labelCurrencyKey;

	@FindBy(xpath = "//div[@class='sg-property-name'][normalize-space(text())='Transaction Description']")
	public UnityWebElement labelTransactionDescriptionPopUpKey;

	@FindBy(xpath = "//*[normalize-space(text())='Transaction Description']")
	public UnityWebElement labelTransactionDescriptionKey;

	@FindBy(xpath = "//div[@class='sg-property-name'][normalize-space(text())='Units']")
	public UnityWebElement labelUnitsTransactioInformationPopUpKey;

	@FindBy(xpath = "//*[normalize-space(text())='Units']")
	public UnityWebElement labelUnitsKey;

	@FindBy(xpath = "//*[normalize-space(text())='Posted Date']")
	public UnityWebElement labelPostedDateKey;

	@FindBy(xpath = "//*[normalize-space(text())='Date Reported']")
	public UnityWebElement labelDateReportedKey;

	@FindBy(xpath = "//*[normalize-space(text())='Date Traded']")
	public UnityWebElement labelDateTradedKey;

	@FindBy(xpath = "//*[normalize-space(text())='Date Settled']")
	public UnityWebElement labelDateSettledKey;

	@FindBy(xpath = "//*[normalize-space(text())='CUSIP']")
	public UnityWebElement labelCusipKey;

	@FindBy(xpath = "//*[normalize-space(text())='Security Description']")
	public UnityWebElement labelSecurityDescriptionKey;

	@FindBy(xpath = "//*[normalize-space(text())='Transaction GREF']")
	public UnityWebElement labelTransactionGrefKey;

	@FindBy(xpath = "//*[normalize-space(text())='Transaction GREF']")
	public UnityWebElement labelTransactionInformationPopUpGrefKey;

	@FindBy(xpath = "//*[normalize-space(text())='Transaction Amount']")
	public UnityWebElement labelTransactionAmountKey;

	@FindBy(xpath = "//*[normalize-space(text())='Gross Amount']")
	public UnityWebElement labelGrossAmountKey;

	@FindBy(xpath = "//div[@class='sg-property-name'][normalize-space(text())='Transaction Type']")
	public UnityWebElement labelTransactionTypePopUpKey;

	@FindBy(xpath = "//*[normalize-space(text())='Transaction Type']")
	public UnityWebElement labelTransactionTypeKey;

	@FindBy(xpath = "//li//span[normalize-space(text())='Tax Treatment']")
	public UnityWebElement labelTaxTreatmentKey;

	@FindBy(xpath = "//*[normalize-space(text())='Tax Treatment']")
	public UnityWebElement labelTransactionInformationPopUpTaxTreatmentKey;

	@FindBy(xpath = "//*[normalize-space(text())='Narrative']")
	public UnityWebElement labelNarrativeKey;

	@FindBy(xpath = "//span[normalize-space(text())='Local Currency']")
	public UnityWebElement labelLocalCurrencyKey;

	@FindBy(xpath = "//*[normalize-space(text())='Transaction description line 2'][not(@role)]")
	public UnityWebElement labelTransactionDescriptionLine2Key;

	@FindBy(xpath = "//*[normalize-space(text())='Date Posted']")
	public UnityWebElement labelDatePostedKey;

	@FindBy(xpath = "//*[normalize-space(text())='Date of Report'][not(@role)]")
	public UnityWebElement labelDateOfReportKey;

	@FindBy(xpath = "//*[normalize-space(text())='Base Currency'][not(@role)]")
	public UnityWebElement labelBaseCurrencyKey;

	@FindBy(xpath = "//*[normalize-space(text())='Reference Number']")
	public UnityWebElement labelReferenceNumberKey;

	@FindBy(xpath = "//*[normalize-space(text())='Net Amount Broker']")
	public UnityWebElement labelNetAmountBrokerKey;

	@FindBy(xpath = "//*[normalize-space(text())='Gross Cash']")
	public UnityWebElement labelGrossCashKey;

	@FindBy(xpath = "//*[normalize-space(text())='Ledger Cash (Local)']")
	public UnityWebElement labelLedgerCashLocalKey;

	@FindBy(xpath = "//*[normalize-space(text())='Cash Payable (Local)']")
	public UnityWebElement labelCashPayableLocalKey;

	@FindBy(xpath = "//*[normalize-space(text())='Cash Receivable (Local)']")
	public UnityWebElement labelCashReceivableLocalKey;

	@FindBy(xpath = "//*[normalize-space(text())='Reporting Cash']")
	public UnityWebElement labelReportingCashKey;

	@FindBy(xpath = "//*[normalize-space(text())='1099 Tax Year']")
	public UnityWebElement label1099TaxYearKey;

	@FindBy(xpath = "//*[normalize-space(text())='Withholding Rate']")
	public UnityWebElement labelWithholdingRateKey;

	@FindBy(xpath = "//*[normalize-space(text())='Withholding Amount at Source']")
	public UnityWebElement labelWithholdingAmountAtSourceKey;

	@FindBy(xpath = "//*[normalize-space(text())='Withholding Amount by Us']")
	public UnityWebElement labelWithholdingAmountByUsKey;

	@FindBy(xpath = "//*[normalize-space(text())='Non-Resident Alien Withholding Rate']")
	public UnityWebElement labelNonResidentAlienWithholdingRateKey;

	@FindBy(xpath = "//*[normalize-space(text())='Non-Resident Alien Withholding Amount at Source']")
	public UnityWebElement labelNonResidentAlienWithholdingAmountAtSourceKey;

	@FindBy(xpath = "//*[normalize-space(text())='Non-Resident Alien Withholding Amount by Us']")
	public UnityWebElement labelNonResidentAlienWithholdingAmountByUsKey;

	@FindBy(xpath = "//*[normalize-space(text())='Withholding Description']")
	public UnityWebElement labelWithholdingDescriptionKey;

	@FindBy(xpath = "//*[normalize-space(text())='Non-resident withholding description']")
	public UnityWebElement labelNonResidentWithholdingDescriptionKey;

	@FindBy(xpath = "//*[normalize-space(text())='Non-Resident alien tax treatment code']")
	public UnityWebElement labelNonResidentAlienTaxTreatmentCodeKey;

	@FindBy(xpath = "//*[normalize-space(text())='Withholding Tax Treatment Code']")
	public UnityWebElement labelWithholdingTaxTreatmentCodeKey;

	@FindBy(xpath = "//*[normalize-space(text())='Country']")
	public UnityWebElement labelCountryKey;

	@FindBy(xpath = "//*[normalize-space(text())='Non-Resident Alien Withholding Description']")
	public UnityWebElement labelNonResidentAlienWithholdingDescriptionKey;

	@FindBy(xpath = "//ol[@class='sg-property-list']//div[@class='sg-property-name']")
	public List<WebElement> labelKeysTransactionInformationPopUp;

	@FindBy(xpath = "//ol[@class='sg-property-list']//div[@class='sg-property-value']")
	public List<WebElement> labelValuesTransactionInformationPopUp;

	@FindBy(xpath = "//transaction-details//span[@class='glyphicons glyphicons-print print-icon-size']")
	public UnityWebElement iconPrintTransactionInformation;

	@FindBy(xpath = "//*[normalize-space(text())='Primary Broker']")
	public UnityWebElement labelPrimaryBokerKey;

	@FindBy(xpath = "//*[normalize-space(text())='Sequence Number']")
	public UnityWebElement labelSequenceNumberKey;

	@FindBy(xpath = "//*[@id='taxInfo']//span[@class='sg-property-name']")
	public List<WebElement> labelKeysTransactionInformation;

	@FindBy(xpath = "//*[@id='taxInfo']//span[@class='sg-property-value ng-star-inserted']")
	public List<WebElement> labelValuesTransactionInformation;

	@FindBy(xpath = "//*[@id='cashDetail']//span[@class='sg-property-name']")
	public List<WebElement> labelKeysTransactionHistorySubTabsCashDetails;

	@FindBy(xpath = "//*[@id='cashDetail']//span[@class='sg-property-value ng-star-inserted']")
	public List<WebElement> labelValuesTransactionHistorySubTabsCashDetails;

	@FindBy(xpath = "//*[@id='payRecordDetail']//span[@class='sg-property-name']")
	public List<WebElement> labelKeysTransactionHistorySubTabsPayRecordDetails;

	@FindBy(xpath = "//*[@id='payRecordDetail']//span[@class='sg-property-value ng-star-inserted']")
	public List<WebElement> labelValuesTransactionHistorySubTabsPayRecordDetails;

	@FindBy(xpath = "//*[normalize-space(text())='Acquisition Date']")
	public UnityWebElement labelAcquisitionDateKey;

	@FindBy(xpath = "//*[normalize-space(text())='Federal Short-Term Gain/Loss']")
	public UnityWebElement labelFederalShortTermGainKey;

	@FindBy(xpath = "//*[normalize-space(text())='Federal Short-Term Gain/Loss']")
	public UnityWebElement labelFederalShortTermGainLossKey;

	@FindBy(xpath = "//*[normalize-space(text())='Federal Long-Term Gain/Loss']")
	public UnityWebElement labelFederalLongTermGainLossKey;

	@FindBy(xpath = "//*[normalize-space(text())='Federal Long-Term Loss']")
	public UnityWebElement labelFederalLongTermLossKey;

	@FindBy(xpath = "//*[normalize-space(text())='Non-Resident Alien Withholding Tax Treatment Code']")
	public UnityWebElement labelNonResidentAlienWithholdingTaxTreatmentCodeKey;

	@FindBy(xpath = "//*[@id='taxDetail']//span[@class='sg-property-name']")
	public List<WebElement> labelKeysTransactionHistorySubTabsTaxDetails;

	@FindBy(xpath = "//*[@id='taxDetail']//span[@class='sg-property-value ng-star-inserted']")
	public List<WebElement> labelValuesTransactionHistorySubTabsTaxDetails;

	// Fee Calculation

	@FindBy(xpath = "//mat-panel-title[contains(normalize-space(text()),'Fee calculation')]")
	public UnityWebElement tabFeeCalculationFormulaDetail;

	@FindBy(xpath = "//div[@id='mat-tab-label-0-1']//div[@class='mat-tab-label-content']")
	public UnityWebElement panelFeeFormulaAndCalculationDetails;

	@FindBy(xpath = "//*[normalize-space(text())='Event Number']")
	public UnityWebElement labelEventNumberKey;

	@FindBy(xpath = "//*[normalize-space(text())='Fee Event Frequency']")
	public UnityWebElement labelFeeEventFrequencyKey;

	@FindBy(xpath = "//*[normalize-space(text())='Fee Schedule']")
	public UnityWebElement labelFeeScheduleKey;

	@FindBy(xpath = "//*[normalize-space(text())='Fee Schedule Name']")
	public UnityWebElement labelFeeScheduleNameKey;

	@FindBy(xpath = "//*[normalize-space(text())='Annual Minimum']")
	public UnityWebElement labelAnnualMinimumKey;

	@FindBy(xpath = "//*[normalize-space(text())='Annual Base Fee']")
	public UnityWebElement labelAnnualBaseFeeKey;

	@FindBy(xpath = "//*[normalize-space(text())='Discount %']")
	public UnityWebElement labelDiscountKey;

	@FindBy(xpath = "//*[normalize-space(text())='Discount Amount']")
	public UnityWebElement labelDiscountAmountKey;

	@FindBy(xpath = "//*[normalize-space(text())='Premium %']")
	public UnityWebElement labelPremiumKey;

	@FindBy(xpath = "//*[normalize-space(text())='Premium Amount']")
	public UnityWebElement labelPremiumAmountKey;

	@FindBy(xpath = "//*[normalize-space(text())='Default Allocation Method']")
	public UnityWebElement labelDefaultAllocationMethodKey;

	@FindBy(xpath = "//*[normalize-space(text())='Allocate by Account']")
	public UnityWebElement labelDefaultAllocateByAccountKey;

	@FindBy(xpath = "//*[normalize-space(text())='Include P T Inactive Period for Proration']")
	public UnityWebElement labelIncludeInactivePeriodPropationKey;

	@FindBy(xpath = "//*[normalize-space(text())='Portfolio Prorate Method']")
	public UnityWebElement labelPortfolioProrateMethodKey;

	@FindBy(xpath = "//*[normalize-space(text())='Minimum Application Rule']")
	public UnityWebElement labelMinimumApplicationRuleKey;

	@FindBy(xpath = "//*[normalize-space(text())='Fee Start Date']")
	public UnityWebElement labelFeeStartDateKey;

	@FindBy(xpath = "//*[normalize-space(text())='Fee End Date']")
	public UnityWebElement labelFeeEndDateKey;

	@FindBy(xpath = "//*[normalize-space(text())='Period Minimum']")
	public UnityWebElement labelPeriodMinimumKey;

	@FindBy(xpath = "//*[normalize-space(text())='Cumulative Fee Against Minimum']")
	public UnityWebElement labelCumulativeFeeAgainstMinimumKey;

	@FindBy(xpath = "//ol[@class='sg-property-list ng-star-inserted']//div[@class='sg-property-name']")
	public List<WebElement> labelKeysFeeFormulaDetail;

	@FindBy(xpath = "//ol[@class='sg-property-list ng-star-inserted']//div[@class='sg-property-value']")
	public List<WebElement> labelValuesFeeFormulaDetail;

	@FindBy(xpath = "//fee-formula-and-calculation-details//span[@class='glyphicons glyphicons-print print-icon-size']")
	public UnityWebElement iconPrintFeeFormulaAndCalculationDetails;

	@FindBy(xpath = "//*[normalize-space(text())='Fee Calculation Formula']")
	public UnityWebElement labelFeeCalculationFormulaKey;

	@FindBy(xpath = "//*[normalize-space(text())='Fee Amount']")
	public UnityWebElement labelFeeAmountKey;

	@FindBy(xpath = "//*[normalize-space(text())='Start Date']")
	public UnityWebElement labelStartDateKey;

	@FindBy(xpath = "//*[normalize-space(text())='End Date']")
	public UnityWebElement labelEndDateKey;

	@FindBy(xpath = "//*[normalize-space(text())='Qualifiers in Tiers']")
	public UnityWebElement labelQualifiersInTiersKey;

	@FindBy(xpath = "//*[normalize-space(text())='Breakpoint as Threshold']")
	public UnityWebElement labelBreakpointThresholdKey;

	@FindBy(xpath = "//*[normalize-space(text())='Charge Calculation Basis']")
	public UnityWebElement labelChargeCalculationBasisKey;

	@FindBy(xpath = "//*[normalize-space(text())='Prorated by Frequency']")
	public UnityWebElement labelProratedByFrequencyKey;

	@FindBy(xpath = "//*[normalize-space(text())='Prorated Amount']")
	public UnityWebElement labelProratedAmountKey;

	@FindBy(xpath = "//*[normalize-space(text())='Cumulative Fee Against Minimum']")
	public UnityWebElement labelCumulativeFeeAgainstMiniumKey;

	@FindBy(xpath = "//ol[@class='sg-property-list']//div[@class='sg-property-name']")
	public List<WebElement> labelKeysFeeCalculationDetail;

	@FindBy(xpath = "//ol[@class='sg-property-list']//div[@class='sg-property-value']")
	public List<WebElement> labelValuesFeeCalculationDetail;

	// Portfolio fee summary
	@FindBy(xpath = "//div[@id='mat-tab-label-1-2']//div[@class='mat-tab-label-content']")
	public UnityWebElement panelPortfolioFeeSummary;

	@FindBy(xpath = "//div[@class='ng-star-inserted']//*[normalize-space(text())='Paying Account/Portfolio Number']")
	public UnityWebElement labelPayingAccountPortfolioNumberKey;

	@FindBy(xpath = "//div[@class='ng-star-inserted']//*[normalize-space(text())='Paying Account/Portfolio Name']")
	public UnityWebElement labelPayingAccountPortfolioNameKey;

	@FindBy(xpath = "//div[@class='ng-star-inserted']//*[normalize-space(text())='Collection Method']")
	public UnityWebElement labelCollectionMethodKey;

	@FindBy(xpath = "//div[@class='ng-star-inserted']//*[normalize-space(text())='% of Total Fee Paid']")
	public UnityWebElement labelTotaFeePaidKey;

	@FindBy(xpath = "//div[@class='ng-star-inserted']//*[normalize-space(text())='Total Fee This Portfolio']")
	public UnityWebElement labelTotaFeeThisPortfolioKey;

	@FindBy(xpath = "//mat-panel-title[contains(normalize-space(text()),'fee Summary')]")
	public UnityWebElement tabAdditionalPortfolioFeeSummary;

	// Additional Portfolio fee summary

	@FindBy(xpath = "//div[@class='mat-expansion-panel-body']//*[normalize-space(text())='Paying Account/Portfolio Number']")
	public UnityWebElement labelAdditionalPayingAccountPortfolioNumberKey;

	@FindBy(xpath = "//div[@class='mat-expansion-panel-body']//*[normalize-space(text())='Paying Account/Portfolio Name']")
	public UnityWebElement labelAdditionalPayingAccountPortfolioNameKey;

	@FindBy(xpath = "//div[@class='mat-expansion-panel-body']//*[normalize-space(text())='Collection Method']")
	public UnityWebElement labelAdditionalCollectionMethodKey;

	@FindBy(xpath = "//div[@class='mat-expansion-panel-body']//*[normalize-space(text())='% of Total Fee Paid']")
	public UnityWebElement labelAdditionalTotaFeePaidKey;

	@FindBy(xpath = "//div[@class='mat-expansion-panel-body']//*[normalize-space(text())='Total Fee This Portfolio']")
	public UnityWebElement labelAdditionalTotaFeeThisPortfolioKey;

	@FindBy(xpath = "//portfolio-fee-summary//span[@class='glyphicons glyphicons-print print-icon-size']")
	public UnityWebElement iconPrintPortfolioFeeSummary;

	@FindBy(xpath = "//ol[@class='sg-property-list']//div[@class='sg-property-name']")
	public List<WebElement> labelKeysPortfolioFeeSummary;

	@FindBy(xpath = "//ol[@class='sg-property-list']//div[@class='sg-property-value']")
	public List<WebElement> labelValuesPortfolioFeeSummary;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Amended or Reversed']]")
	public UnityWebElement checkboxAmendedOrReversed;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Base Currency']]")
	public UnityWebElement checkboxBaseCurrency;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Cash Payable (Local)']]")
	public UnityWebElement checkboxCashPayableLocal;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Cash Receivable (Local)']]")
	public UnityWebElement checkboxCashReceivableLocal;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Client Name']]")
	public UnityWebElement checkboxClientName;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='CUSIP']]")
	public UnityWebElement checkboxCusip;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Date Posted']]")
	public UnityWebElement checkboxDatePosted;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Date Reported']]")
	public UnityWebElement checkboxDateReported;

	@FindBy(xpath = "//span[normalize-space(text())='Date Settled']/preceding-sibling::div/input")
	public UnityWebElement checkboxDateSettled;

	@FindBy(xpath = "//span[normalize-space(text())='Date Traded']/preceding-sibling::div/input")
	public UnityWebElement checkboxDateTraded;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Explanation']]")
	public UnityWebElement checkboxExplanation;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Federal Cost']]")
	public UnityWebElement checkboxFederalCost;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Federal Cost (Local)']]")
	public UnityWebElement checkboxFederalCostLocal;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Federal Cost (Base)']]")
	public UnityWebElement checkboxFederalCostBase;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Interest Rate']]")
	public UnityWebElement checkboxInterestRate;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Ledger Cash (Base)']]//input")
	public UnityWebElement checkboxLedgerCashBaseActivity;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Ledger Cash (Local)']]//input")
	public UnityWebElement checkboxLedgerCashLocal;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Local Currency']]")
	public UnityWebElement checkboxLocalCurrency;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Maturity Date']]")
	public UnityWebElement checkboxMaturityDate;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Portfolio Name']]")
	public UnityWebElement checkboxPortfolioName;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Portfolio Number']]//input")
	public UnityWebElement checkboxPortfolioNumber;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Primary Broker']]")
	public UnityWebElement checkboxPrimaryBroker;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Receivable Payable Cash']]")
	public UnityWebElement checkboxReceivablePayableCash;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Receivable Payable Ind']]")
	public UnityWebElement checkboxReceivablePayableInd;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Reversal Transaction ID']]")
	public UnityWebElement checkboxReversalTransactionId;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Security Description']]")
	public UnityWebElement checkboxSecurityDescriptionActivity;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Sequence Number']]//input")
	public UnityWebElement checkboxSequenceNo;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Tax Code']]")
	public UnityWebElement checkboxTaxCode;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Tax Description']]")
	public UnityWebElement checkboxTaxDescriptionActivity;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Transaction Abbreviation']]")
	public UnityWebElement checkboxTransactionAbbreviation;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Transaction Created By']]")
	public UnityWebElement checkboxTransactionCreatedBy;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Transaction Information']]")
	public UnityWebElement checkboxTransactionInformation;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Transaction Security/Client']]")
	public UnityWebElement checkboxTransactionSecurityClient;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Transaction Type']]//input")
	public UnityWebElement checkboxTransactionTypeActivity;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Transaction Type Code']]")
	public UnityWebElement checkboxTransactionTypeCode;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Units']]")
	public UnityWebElement checkboxUnitsActivity;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Portfolio Number')]")
	public UnityWebElement labelPortfolionumberKey;

	@FindBy(xpath = "//div[@class='sg-property-name'][normalize-space(text())='Units']")
	public UnityWebElement labelUnitsPopUpKey;

	@FindBy(xpath = "//div[@class='sg-property-name'][normalize-space(text())='Date Reported']")
	public UnityWebElement labelDateReportedPopUpKey;

	@FindBy(xpath = "//div[@class='sg-property-name'][normalize-space(text())='Date Posted']")
	public UnityWebElement labelDatePostedPopUpKey;

	@FindBy(xpath = "//div[@class='sg-property-name'][normalize-space(text())='Date Traded']")
	public UnityWebElement labelDateTradedPopUpKey;

	@FindBy(xpath = "//div[@class='sg-property-name'][normalize-space(text())='Net Amount Broker']")
	public UnityWebElement labelNetAmountBrokerPopUpKey;

	// Pending Free Detail

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Ac Internal')]")
	public UnityWebElement labelAcInternalKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Clearing Broker Firm')]")
	public UnityWebElement labelClearingBrokerFirmKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Clearing Broker Salesman')]")
	public UnityWebElement labelClearingBrokerSalesmanKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Disposal Method')]")
	public UnityWebElement labelDisposalMethodKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Entitlement Date')]")
	public UnityWebElement labelEntitlementDateKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Internal')]")
	public UnityWebElement labelInternalKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Location')]")
	public UnityWebElement labelLocationKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Portfolio Gref')]")
	public UnityWebElement labelPortfolioGrefKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Portfolio Number')]")
	public UnityWebElement labelPortfolioNumberPendingFreeKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Primary Broker Firm')]")
	public UnityWebElement labelPrimaryBrokerFirmKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Registration Abbreviation')]")
	public UnityWebElement labelRegistrationAbbreviationKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Symbol ID')]")
	public UnityWebElement labelSymbolIdKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Account Gref')]")
	public UnityWebElement labelAccountGrefKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Cost for Tax Purposes')]")
	public UnityWebElement labelCostForTaxPurposesKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Clearing Broker')]")
	public UnityWebElement labelClearingBrokerKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Disposal Market Value')]")
	public UnityWebElement labelDisposalMarketValueKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Disposal Method ID')]")
	public UnityWebElement labelDisposalMethodIdKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Ref Gref')]")
	public UnityWebElement labelRefGrefKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Is This Transaction Taxable')]")
	public UnityWebElement labelIsThisTransactionTaxableKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Location Abbreviation')]")
	public UnityWebElement labelLocationAbbreviationKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Portfolio Name')]")
	public UnityWebElement labelPortfolioNamePendingFreeKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Portfolio Number Sort')]")
	public UnityWebElement labelPortfolioNumberSortKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Primary Broker')]")
	public UnityWebElement labelPrimaryBrokerKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Portfolio Internal')]")
	public UnityWebElement labelPortfolioInternalKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Registration')]")
	public UnityWebElement labelRegistrationKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Settlement Date')]")
	public UnityWebElement labelSettlementDateKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Security Name')]")
	public UnityWebElement labelSecurityNameKey;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Limit Price']]//input")
	public UnityWebElement checkboxLimitPrice;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Remain']]//input")
	public UnityWebElement checkboxRemain;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Status']]//input")
	public UnityWebElement checkboxStatus;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Stop Price']]//input")
	public UnityWebElement checkboxStopPrice;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Ac Internal']]")
	public UnityWebElement checkboxAcInternal;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Internal']]")
	public UnityWebElement checkboxInternal;

	@FindBy(xpath = "//span[normalize-space(text())='Portfolio Name']/preceding-sibling::div/input")
	public UnityWebElement checkboxPortfolioNamePendingFrees;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Portfolio Number']]")
	public UnityWebElement checkboxPortfolioNumberPendingFrees;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Portfolio Number Sort']]")
	public UnityWebElement checkboxPortfolioNumberSort;

	@FindBy(xpath = "//td[normalize-space(text())='Deposit Activity']//ancestor::mat-expansion-panel//table[@class='table']")
	public UnityTableElement tableDepositActivity;

	@FindBy(xpath = "//a[normalize-space(text())='Other Receipts']")
	public UnityWebElement linkOtherReceipt;

	@FindBy(xpath = "//td[normalize-space(text())='Withdrawal Activity']//ancestor::mat-expansion-panel//table[@class='table']")
	public UnityTableElement tableWithdrawalActivity;

	@FindBy(xpath = "//a[normalize-space(text())='Other Disbursements']")
	public UnityWebElement linkOtherDisbursements;

	@FindBy(xpath = "//td[normalize-space(text())='Trade Activity']//ancestor::mat-expansion-panel//table[@class='table']")
	public UnityTableElement tableTradeActivity;

	@FindBy(xpath = "//a[normalize-space(text())='Purchases']")
	public UnityWebElement linkPurchases;

	@FindBy(xpath = "//span[normalize-space(text())='Ledger Cash (Base)']/preceding-sibling::div/input")
	public UnityWebElement checkboxLedgerCashBaseColumn;

	@FindBy(xpath = "//unity-upgrade-column-filter[@class='ng-star-inserted']")
	public UnityWebElement linkColumnFilter;

	@FindBy(xpath = "//div[@role='grid']")
	public UnityGridElement gridYTDSummary;

	// tool tip
	@FindBy(xpath = "//div[contains(@class,'mat-tooltip ng-trigger')]")
	public UnityWebElement labelToolTip;

	@FindBy(xpath = "//h2[normalize-space(text())='Transaction Summary']")
	public UnityWebElement labelTransactionSummary;

	@FindBy(xpath = "//*[normalize-space(text())='Transaction GREF']//following::div")
	public UnityWebElement labelTransactionGREFvalueInHistory;

	@FindBy(xpath = "//div[contains(@title,'Transaction GREF')]//following::div[1]")
	public UnityWebElement labelTransactionGREFvalueInSummary;

	@FindBy(xpath = "//div[contains(@title,'Transaction Amount')]//following::div[1]")
	public UnityWebElement labelTransactionAmountvalueInSummary;

	@FindBy(xpath = "//span[normalize-space(text())='Transaction Amount']//following::span[1]")
	public UnityWebElement labelTransactionAmountvalueInHistory;

	@FindBy(xpath = "//div[contains(@title,'Transaction Description')]//following::div[1]")
	public UnityWebElement labelTransactionDescriptionvalueInSummary;

	@FindBy(xpath = "//span[@role='columnheader' and text()='Portfolio Number']")
	public UnityWebElement columnHeaderPortfolioNumber;

	@FindBy(xpath = "//span[@ref='eValue' and text()='Total']//ancestor::div[@row-id='rowGroupFooter_ROOT_NODE_ID']")
	public UnityWebElement activityHistoryGridTotalRow;

	@FindBy(xpath = "//div[div[@col-id='ag-Grid-AutoColumn']]//span[@class='ag-group-expanded']")
	public UnityWebElement linkCollapsePanelArrow;

	@FindBy(xpath = "//span[@class='ag-column-drop-cell-button']")
	public List<WebElement> iconCloseGrouping;

	@FindBy(xpath = "//div[@row-id='rowGroupFooter_ROOT_NODE_ID' and @role='row']/div[1]")
	public UnityWebElement labelRowGroupTotal;

	@FindBy(xpath = "(//div[@col-id='baseLedgerCash'])[last()]")
	public UnityWebElement labelBaseLedgeCashTotal;

	@FindBy(xpath = "//div[div[span[span[contains(text(),'Subtotal')]]] and contains(@row-id,'rowGroupFooter')]//div[@col-id='principleCash' or @col-id='baseLedgerCash']")
	public UnityWebElement groupingSubTotalRow;

	@FindBy(xpath = "(//div[div[@col-id='ag-Grid-AutoColumn']and not(contains(@row-id,'rowGroupFooter')) and contains(@class,'level-0')]//span[@class='ag-group-contracted'])[1]")
	public UnityWebElement groupParentContractIcon;

	// locators for trust desk transaction information
	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Federal Long-Term Gain/Loss']]")
	public UnityWebElement checkboxFederalLongTermGainLossTrustDesk;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Federal Short-Term Gain/Loss']]")
	public UnityWebElement checkboxFederalShortTermGainLossTrustDesk;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Portfolio Type']]")
	public UnityWebElement checkboxPortfolioTypeTrustDesk;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Cash Payable']]")
	public UnityWebElement checkboxCashPayableTrustDesk;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Cash Receivable']]")
	public UnityWebElement checkboxCashReceivableTrustDesk;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Principal Cash']]")
	public UnityWebElement checkboxPrincipalCashTrustDesk;

	@FindBy(xpath = "(//div[@col-id='principleCash'])[last()]")
	public UnityWebElement labelPrincipleCashTotalTrustDesk;

	@FindBy(xpath = "//span[@role='columnheader' and text()='Portfolio Type']")
	public UnityWebElement columnHeaderPortfolioTypeTrustDesk;

	@FindBy(xpath = "//li//*[contains(normalize-space(text()),'Account Number')]")
	public UnityWebElement labelAccountNumberKeyTrustDesk;

	@FindBy(xpath = "//li//*[contains(normalize-space(text()),'Account Name')]")
	public UnityWebElement labelAccountNameKeyTrustDesk;

	@FindBy(xpath = "//li//*[contains(normalize-space(text()),'Record Entry Number')]")
	public UnityWebElement labelRecordEntryNumberKeyTrustDesk;

	@FindBy(xpath = "//li//*[contains(normalize-space(text()),'Transaction Description')]")
	public UnityWebElement labelTransactionDescriptionKeyTrustDesk;

	@FindBy(xpath = "//li//*[contains(normalize-space(text()),'Recipient Number')]")
	public UnityWebElement labelRecipientNumberKeyTrustDesk;

	@FindBy(xpath = "//li//*[contains(normalize-space(text()),'Original Face')]")
	public UnityWebElement labelTransactionReportingCodeKeyTrustDesk;

	@FindBy(xpath = "//li//*[contains(normalize-space(text()),'Accrual Basis Code')]")
	public UnityWebElement labelAccrualBasisCodeKeyTrustDesk;

	@FindBy(xpath = "//li//*[contains(normalize-space(text()),'Carry Value')]")
	public UnityWebElement labelCarryValueKeyTrustDesk;

	@FindBy(xpath = "//li//*[contains(normalize-space(text()),'Statement Print Code')]")
	public UnityWebElement labelStatementPrintCodeKeyTrustDesk;

	@FindBy(xpath = "//li//*[contains(normalize-space(text()),'Transaction Reporting Code')]")
	public UnityWebElement labelOriginalFaceKeyTrustDesk;

	@FindBy(xpath = "//li//*[contains(normalize-space(text()),'Tax Code')]")
	public UnityWebElement labelTaxCodeKeyTrustDesk;

	@FindBy(xpath = "//li//*[contains(normalize-space(text()),'Security Type')]")
	public UnityWebElement labelSecurityTypeKeyTrustDesk;

	// trust desk cash details
	@FindBy(xpath = "//li//*[contains(normalize-space(text()),'Principal Cash')]")
	public UnityWebElement labelPrincipalCashKeyTrustDesk;

	@FindBy(xpath = "//li//*[contains(normalize-space(text()),'Reporting Cash')]")
	public UnityWebElement labelReportingCashKeyTrustDesk;

	@FindBy(xpath = "//li//*[contains(normalize-space(text()),'Cash Payable')]")
	public UnityWebElement labelCashPayableKeyTrustDesk;

	@FindBy(xpath = "//li//*[contains(normalize-space(text()),'Income Cash')]")
	public UnityWebElement labelIncomeCashKeyTrustDesk;

	@FindBy(xpath = "//li//*[contains(normalize-space(text()),'Cash Receivable')]")
	public UnityWebElement labelCashReceivableKeyTrustDesk;

	// locators for trust desk tax code information
	@FindBy(xpath = "//li//*[contains(normalize-space(text()),'State Short-Term Gain/Loss')]")
	public UnityWebElement labelStateShortTermGainLossKeyTrustDesk;

	@FindBy(xpath = "//li//*[contains(normalize-space(text()),'State Long-Term Gain/Loss')]")
	public UnityWebElement labelStateLongTermGainLossKeyTrustDesk;

	@FindBy(xpath = "//li//*[contains(normalize-space(text()),'Disposition Date')]")
	public UnityWebElement labelDispositionDateKeyTrustDesk;

	@FindBy(xpath = "//li//*[contains(normalize-space(text()),'Prior Year Tax Transaction')]")
	public UnityWebElement labelPriorYearTaxTransactionKeyTrustDesk;

	@FindBy(xpath = "//mat-option[*[normalize-space(text())='CASH DISBURSEMENTS AND FEES']]")
	public UnityWebElement checkboxCashDisbursementFees;

	@FindBy(xpath = "//mat-progress-spinner")
	public UnityWebElement loadingSpinner;

	@FindBy(xpath = "//li//*[contains(normalize-space(text()),'Funds Code')]")
	public UnityWebElement labelFundsCode;

	@FindBy(xpath = "//span[@class='ag-group-contracted']//div")
	public UnityWebElement contractIconActivityGrid;

	@FindBy(xpath = "//span[@class='ag-group-expanded']//div")
	public UnityWebElement expandIconActivityGrid;

	@FindBy(xpath = "//span[@ref='lbRecordCount']")
	public UnityWebElement labelTotalTransaction;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Income Cash']]")
	public UnityWebElement checkboxIncomeCash;

	@FindBy(xpath = "//button[@id='activity-pending-frees-detail-close']")
	public UnityWebElement buttonCloseDialog;

	@FindBy(xpath = "//mat-pseudo-checkbox//following::span[normalize-space(text())='CASH DIVIDENDS']")
	public UnityWebElement checkboxCashDividends;

	@FindBy(xpath = "//mat-pseudo-checkbox//following::span[normalize-space(text())='Dividends']")
	public UnityWebElement checkboxDividends;

	@FindBy(xpath = "//mat-panel-title[normalize-space(text())='Foreign Trade Details']")
	public UnityWebElement panelForeignTradeDetails;

	@FindBy(xpath = "//div[@class='ag-root-wrapper ag-layout-normal ag-ltr']")
	public UnityGridElement gridForeignTradeDetails;

	@FindBy(xpath = "//div[contains(@class,'mat-autocomplete-panel')]")
	public UnityWebElement listPortfolios;

	@Override
	public void waitForPageToLoad() {
		startTime = System.currentTimeMillis();
		if (super.isPageLoaded(driver))
			try {
				loadingSpinner.waitforInvisible();
				endTime = System.currentTimeMillis();
				pageLoadTime = (endTime - startTime) / 1000;
			} catch (Exception e) {
				Assert.fail("Expected page did not load\n");
			}
		else {
			Assert.fail("Timed out after " + AppConstants.PAGE_LOAD_TIMEOUT + " seconds\n");
		}
	}

	public void waitForGridToLoad() {
		super.isPageLoaded(driver);
		gridActivityHistory.waitforVisible();
	}

	public void selectPortfolio(String portfolio) {
		dropdownPortfolio.click();
		listPortfolios.waitforVisible();
		List<WebElement> portfolioList = listPortfolios.findElements(By.xpath(".//span[@title='" + portfolio + "']"));
		if (!portfolioList.isEmpty())
			portfolioList.get(0).click();
		else {
			textboxSearchPortfolio.sendKeys(portfolio);
			listPortfolios.waitforVisible();
			listPortfolios.findElements(By.xpath("//span[normalize-space(text())='" + portfolio + "']")).get(0).click();
		}
	}

	public void selectSecurity(String security) {
		dropdownSecurity.click();
		UnityUtils.wait(2000);
		textboxSearchSecurity.waitforVisible();
		textboxSearchSecurity.sendKeys(security);
		listSuggestions.waitforVisible();
		List<WebElement> list = listSuggestions
				.findElements(By.xpath("//md-autocomplete-parent-scope[span[contains(@title,'" + security + "')]]"));
		UnityUtils.wait(1000);
		list.get(0).click();
	}

	public void selectLinkOnGrid(String link) {
		UnityUtils.wait(1000);
		List<WebElement> refgref = driver.findElements(By.xpath("//a[normalize-space(text())='" + link + "']"));
		if (refgref.size() > 1) {
			refgref.get(0).click();
		} else {
			driver.findElements(By.xpath("//a[normalize-space(text())='" + link + "']")).get(0).click();
		}
	}

	public List<String> getListOfFixedColumnNames() {
		List<WebElement> checkboxesList = driver.findElements(By.xpath("//md-checkbox"));
		List<String> columnNames = new ArrayList<>();
		int checkboxesSize = checkboxesList.size();
		for (int i = 0; i < checkboxesSize; i++) {
			if (checkboxesList.get(i).getAttribute("aria-checked").equalsIgnoreCase("true")) {
				checkboxesList.get(i).click();
			}
		}
		buttonSaveFilterGrid.click();
		List<WebElement> columns = driver
				.findElements(By.xpath("//span[@class='ui-grid-header-cell-label ng-binding']"));
		for (WebElement column : columns) {
			columnNames.add(column.getText());
		}
		return columnNames;
	}

	public String formatServiceUrl(String serviceUrl, String dateFilter, String asOfDate) {
		SimpleDateFormat sdfParse = new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat sdfFormat = new SimpleDateFormat("yyyy-MM-dd");
		Calendar calStart = Calendar.getInstance();
		Calendar calEnd = Calendar.getInstance();
		try {
			Date date = sdfParse.parse(asOfDate.trim());
			calStart.setTime(date);
			calEnd.setTime(date);

			switch (dateFilter) {
			case "This month":
				calStart.set(Calendar.DATE, calStart.getActualMinimum(Calendar.DATE));
				calEnd.set(Calendar.DATE, calEnd.getActualMaximum(Calendar.DATE));
				break;

			case "This week":
				calStart.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
				calEnd.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
				break;

			case "This quarter":
				calStart.set(Calendar.MONTH, calStart.get(Calendar.MONTH) / 3 * 3);
				calStart.set(Calendar.DATE, calStart.getActualMinimum(Calendar.DATE));
				calEnd.set(Calendar.MONTH, calEnd.get(Calendar.MONTH) / 3 * 3 + 2);
				calEnd.set(Calendar.DATE, calEnd.getActualMaximum(Calendar.DATE));
				break;

			case "Last 12 months":
				calStart.add(Calendar.YEAR, -1);
				break;

			case "Year to date":
				calStart.set(Calendar.DATE, calStart.getActualMinimum(Calendar.DATE));
				calStart.set(Calendar.MONTH, calStart.getActualMinimum(Calendar.MONTH));
				break;
			default:
				break;
			}
			serviceUrl = serviceUrl.replace("YYYY1-MM1-DD1", sdfFormat.format(calStart.getTime()));
			serviceUrl = serviceUrl.replace("YYYY2-MM2-DD2", sdfFormat.format(calEnd.getTime()));
		} catch (Exception e) {
			Assert.fail("", e.getCause());
		}
		return serviceUrl;
	}
}