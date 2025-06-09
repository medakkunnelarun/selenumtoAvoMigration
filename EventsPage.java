package com.unity.pages;

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
import com.unity.utilities.UnityUtils;

public class EventsPage extends BaseTestPage {
	WebDriver driver;

	public EventsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}

	// header details
	@FindBy(xpath = "//small[@class='ng-star-inserted']")
	public UnityWebElement labelAccountName;

	@FindBy(xpath = "//span[contains(@class,'account-value-description')]") // need to check
	public List<WebElement> labelheaderKeys;

	@FindBy(xpath = "//span[@class='account-value']") // need to check
	public List<WebElement> labelheaderValues;
	
	@FindBy(xpath = "//span[@class='sg-property-name']")
	public List<WebElement> listFeeEventKeys;
	
	@FindBy(xpath = "//div[span[text()='Event Category']]")
    public UnityWebElement columnEventCategory;

	@FindBy(xpath = "//div[span[text()='Event Category']]/preceding-sibling::span/*")
    public UnityWebElement menuEventCategory;

	@FindBy(xpath = "//div[span[text()='Requires Acknowledgement']]/preceding-sibling::span/*")
    public UnityWebElement menuRequiresAcknowledgement;
    
    @FindBy(xpath = "//div[span[text()='Memo Text']]/preceding-sibling::span/*")
    public UnityWebElement menuMemoText;
    
    
    @FindBy(xpath = "//div[span[text()='Requires Acknowledgement']]")
    public UnityWebElement columnRequiresAcknowledgement;

    @FindBy(xpath = "//div[@class='ag-filter-body']//div[@role='presentation']//div[@role='presentation']//input[@type='text']")
    public UnityWebElement menuFilterTextBox1;
    
    @FindBy(xpath = "//button[@class='fis-icon-filter-remove-alt mat-focus-indicator mat-tooltip-trigger mat-icon-button mat-button-base mat-accent ng-star-inserted']")
    public UnityWebElement buttonClearAllGridFilter;


	// tabs
	@FindBy(xpath = "//button//div[normalize-space(text())='Cash']")
	public UnityWebElement tabCash;

	@FindBy(xpath = "//button//div[normalize-space(text())='Statements']")
	public UnityWebElement tabStatements;
	
	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Interested Party Number']]//input")
    public UnityWebElement checkboxInterestedPartyNumber;

	@FindBy(xpath = "//button//div[normalize-space(text())='Fees']")
	public UnityWebElement tabFees;

	@FindBy(xpath = "//button//div[normalize-space(text())='Memos']")
	public UnityWebElement tabMemos;

	@FindBy(xpath = "//button//div[normalize-space(text())='Other']")
	public UnityWebElement tabOther;

	// Cash Tab items
	@FindBy(xpath = "//span[contains(@role,'columnheader')]")
	public List<WebElement> gridHeaders;

	@FindBy(xpath = "//*[contains(@class,'disclaimer')]") // need to check
	public UnityWebElement labelDisclaimer;

	@FindBy(xpath = "//div[@class='mat-checkbox-inner-container']")
	public UnityWebElement checkboxIncludeExpiredEvents;

	@FindBy(xpath = "//mat-icon[@fisicon='table']")
	public UnityWebElement linkFilterGrid;

	@FindBy(xpath = "//button[span[normalize-space(text())='Save']]")
	public UnityWebElement buttonSaveFilterGrid;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Account Number']]//input")
	public UnityWebElement checkboxAccountNumber;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Recipient Name']]//input")
	public UnityWebElement checkboxRecipientName;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Recipient Identifier']]//input")
	public UnityWebElement checkboxRecipientIdentifier;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Address']]//input")
	public UnityWebElement checkboxAddress;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Portfolio Number']]//input")
	public UnityWebElement checkboxPortfolioNumber;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Portfolio Name']]//input")
	public UnityWebElement checkboxPortfolioName;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Frequency']]//input")
	public UnityWebElement checkboxFrequency;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Event Name']]//input")
	public UnityWebElement checkboxEventName;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Next Scheduled Execution']]//input")
	public UnityWebElement checkboxNextScheduledExecution;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Distribution Amount']]//input")
	public UnityWebElement checkboxDistributionAmount;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Event Type']]//input")
	public UnityWebElement checkboxEventType;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Client Name']]//input")
	public UnityWebElement checkboxClientName;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Event type']]//input")
	public UnityWebElement checkboxClientReminderEventType;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Allow Advance Payment']]//input")
	public UnityWebElement checkboxAllowAdvancePayment;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='As of']]//input")
	public UnityWebElement checkboxAsof;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Date Last Processed']]//input")
	public UnityWebElement checkboxDateLastProcessed;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Date Stop']]//input")
	public UnityWebElement checkboxDateStop;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Display Type Number']]//input")
	public UnityWebElement checkboxDisplayTypeNumber;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Event id']]//input")
	public UnityWebElement checkboxEventId;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Event Type Code']]//input")
	public UnityWebElement checkboxEventTypeCode;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='External Reference']]//input")
	public UnityWebElement checkboxExternalReference;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Memo Text']]//input")
	public UnityWebElement checkboxMemoText;

	@FindBy(xpath = "//div[@role='listbox']")
	public UnityWebElement panelPortfolioOptions;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Distribution Details']]")
	public UnityWebElement panelDistributionDetails;

	@FindBy(xpath = "//ag-grid-angular")
	public UnityGridElement gridCashEvents;

	@FindBy(css = "div[role='grid']")
	public UnityGridElement gridPayees;

	@FindBy(xpath = "//span[@class='md-select-icon ng-scope']")
	public UnityWebElement dropdownPayees;

	@FindBy(xpath = "(//md-menu-item//span[normalize-space(text())='Delete'])[2]")
	public UnityWebElement labelDelete;

	@FindBy(xpath = "//h2[normalize-space(text())='Delete disbursement event payee']")
	public UnityWebElement labelDeleteDisbursementEventPayee;

	@FindBy(xpath = "//iframe[contains(@src,'DisbEventPayeeDelete')]")
	public UnityWebElement frameDeleteDisbursementEvent;

	@FindBy(xpath = "//input[@name='ctlSubmit']")
	public UnityWebElement buttonSubmit;

	@FindBy(xpath = "//button[@id='unity-add-new-for-type-cancel']") // need to check
	public UnityWebElement buttonCancel;

	@FindBy(xpath = "//mat-icon[@aria-label='Close']")
	public UnityWebElement buttonFilterClose;

	@FindBy(xpath = "//p/span/span[1]")
	public UnityWebElement labelAccountNameValue;

	@FindBy(xpath = "//p/span/span[2]")
	public UnityWebElement labelAccountNumberValue;

	@FindBy(xpath = "//a[normalize-space(text())='constant amt pymnt-position related']")
	public UnityWebElement linkConstantAmtPymntPositionRelated;

	@FindBy(xpath = "(//a[contains(text(),'ask op disbursement-position related')])[1]")
	public UnityWebElement linkAskOpDisbursementPositionRelated;

	@FindBy(xpath = "//button[@aria-label='Add New']")
	public UnityWebElement buttonAddNew;

	@FindBy(xpath = "//button[@aria-label='select']")
	public UnityWebElement buttonAddNewEvent;

	@FindBy(xpath = "//button[@id='unity-add-new-for-type-select' or @id='select']")
	public UnityWebElement buttonSelect;

	// frame add event
	@FindBy(xpath = "//iframe[contains(@src,'EventAdd')]")
	public UnityWebElement frameAddEvent;

	@FindBy(xpath = "//form[contains(@action,'statement')]//lable[@id='MessageLable']")
	public UnityWebElement labelMessage;

	@FindBy(xpath = "//input[@value='Cancel']")
	public UnityWebElement buttonCancelEvent;

	@FindBy(xpath = "//input[@name='ctl00$ctlSubmit']")
	public UnityWebElement buttonSubmitEvent;

	@FindBy(xpath = "//input[@id='ctl00_ctlRadComboEvents_Input']")
	public UnityWebElement dropdownEvents;

	@FindBy(xpath = "//div[@id='ctl00_ctlRadComboEvents_DropDown']//ul[@class='rcbList']")
	public UnityWebElement optionsEvents;

	@FindBy(xpath = "//a[normalize-space(text())='Select']")
	public UnityWebElement linkModelStatement;

	@FindBy(xpath = "//iframe[contains(@src,'ModelStatement')]")
	public UnityWebElement frameModelStatement;

	@FindBy(xpath = "//a[contains(@id,'ctlStatementList_ctlGridPager_ctlLast')]")
	public UnityWebElement linkLastPage;

	@FindBy(xpath = "//table[contains(@id,'StatementList_ctlGenericGrid')]//tr[@class='rgRow rgSelectedRow']")
	public UnityWebElement rowFirstModelStatement;

	@FindBy(xpath = "//input[contains(@id,'ctlClientLookup_ctlClientRadComboBox_Input')]")
	public UnityWebElement textboxClient;

	@FindBy(xpath = "//input[contains(@id,'ctlEventIdentification_ctlTypeLookup_ctlCodeFile_ctlCodeFile_Input')]")
	public UnityWebElement textboxType;

	@FindBy(xpath = "//div[contains(@id,'ctlEventIdentification_ctlTypeLookup_ctlCodeFile_ctlCodeFile_DropDown')]")
	public UnityWebElement optionsType;

	@FindBy(xpath = "//span[contains(@id,'ctlAsOfDatePicker_dateInput_wrapper')]/input[1]")
	public UnityWebElement textboxAsOfDate;

	@FindBy(xpath = "//span[contains(@id,'ctlDateNextPicker_dateInput')]/input[1]")
	public UnityWebElement textboxDateNext;

	@FindBy(xpath = "//input[contains(@id,'ctlFrequencyLookup_ctlCodeFile_Input')]")
	public UnityWebElement textboxFrequency;

	@FindBy(xpath = "//div[contains(@id,'ctlFrequencyLookup_ctlCodeFile_DropDown')]")
	public UnityWebElement optionsFrequency;

	@FindBy(xpath = "//input[contains(@id,'ctlPayorLookup_ctlClientRadComboBox_ctlClientRadComboBox_Input')]")
	public UnityWebElement textboxPayor;

	@FindBy(xpath = "//div[contains(@id,'ctlClientRadComboBox_ctlClientRadComboBox_DropDown')]")
	public UnityWebElement optionsPayor;

	@FindBy(xpath = "//a[normalize-space(text())='Add New']")
	public UnityWebElement linkAddNewDocument;

	@FindBy(xpath = "//iframe[@name='DocAdd']")
	public UnityWebElement frameDocumentAdd;

	@FindBy(xpath = "//iframe[@name='DocEdit']")
	public UnityWebElement frameDocumentEdit;

	@FindBy(xpath = "//input[contains(@id,'EmployeeLookupRadComboBox_Input')]")
	public UnityWebElement textboxResponsibleEmployee;

	@FindBy(xpath = "//input[contains(@id,'DockDisbursementPayeeDetails_C_ctlOutputDevice_ctlCodeFile_Input')]")
	public UnityWebElement textboxDocumentDestination;

	@FindBy(xpath = "//div[contains(@id,'OutputDevice_ctlCodeFile_DropDown')]")
	public UnityWebElement optionsDocumentDestination;

	@FindBy(xpath = "//input[contains(@id,'ctlDocUpload_ctlDocumentName')]")
	public UnityWebElement textboxDocumentName;

	@FindBy(xpath = "//textarea[contains(@name,'ctlDocumentDescription')] ")
	public UnityWebElement textboxDocumentDescription;

	@FindBy(xpath = "//input[contains(@id,'ctlDocUpload_ctlDocCatType_Input')]")
	public UnityWebElement textboxDocumentCategory;

	@FindBy(xpath = "//div[@id='ContentPlaceHolderPage_ctlDocUpload_ctlDocCatType_DropDown']")
	public UnityWebElement optionsDocumentCategory;

	@FindBy(xpath = "//input[contains(@id,'ctlDocUpload_ctlDocTypeCombo_Input')]")
	public UnityWebElement textboxDocumentType;

	@FindBy(xpath = "//div[@id='ContentPlaceHolderPage_ctlDocUpload_ctlDocTypeCombo_DropDown']")
	public UnityWebElement optionsDocumentType;

	@FindBy(xpath = "//textarea[contains(@id,'DockSaleInformation_C_ctlMemoEventDetail_ctlText')]")
	public UnityWebElement textboxMemoEventDetailText;

	@FindBy(xpath = "//input[contains(@id,'ContentPlaceHolderPage_ctlDocUpload_ctlRadUploadfile0')]")
	public UnityWebElement buttonFilePath;

	@FindBy(xpath = "//input[contains(@id,'ctlDocUpload_ctlUploadBtn')]")
	public UnityWebElement buttonUpload;

	@FindBy(xpath = "//a[normalize-space(text())='Edit']")
	public UnityWebElement linkEditDocument;

	@FindBy(xpath = ".//a[normalize-space(text())='Delete']")
	public UnityWebElement linkDeleteDocument;

	@FindBy(xpath = "//iframe[contains(@src,'EventTypeNm=askOperator&TRANS=PayEvent')]")
	public UnityWebElement framePayCash;

	@FindBy(xpath = "//h2[normalize-space(text())='Advance Payment']")
	public UnityWebElement headerAdvancePayment;

	@FindBy(xpath = "//input[@id='ctlAdvancedPayment_ctlDockTxIdent_C_ctlAmountText']")
	public UnityWebElement textboxAmount;

	// Event details key labels

	@FindBy(xpath = "//p[@id='event-type-description']//strong")
	public UnityWebElement labelEvent;

	@FindBy(xpath = "//p[@id='account-portfolio']//strong")
	public UnityWebElement labelAccountPortfolioAddvantage;

	@FindBy(xpath = "//a[contains(text(),'Events')]")
	public UnityWebElement linkBackToEvents;

	@FindBy(xpath = "//p[@id='account-portfolio-details' or @id='account-portfolio']//span")
	public UnityWebElement labelEventAccountName;

	@FindBy(xpath = "//p[@id='event-type-description']")
	public UnityWebElement labelEventTypeDescription;

	@FindBy(xpath = "//span[normalize-space(text())='As of Date']")
	public UnityWebElement labelAsOfDateKey;

	@FindBy(xpath = "//span[normalize-space(text())='Date Last Processed']")
	public UnityWebElement labelDateLastProcessedKey;

	@FindBy(xpath = "//span[normalize-space(text())='Account Number']")
	public UnityWebElement labelAccountNumberKey;

	@FindBy(xpath = "//span[normalize-space(text())='Security']")
	public UnityWebElement labelSecurityKey;

	@FindBy(xpath = "//span[normalize-space(text())='Date Stop']")
	public UnityWebElement labelDateStopKey;
	
	@FindBy(xpath = "//mat-expansion-panel[3]/div[1]/div[1]/div[1]/unity-detail-view[1]/div[1]/div[1]/ol[1]/li[1]/span[1]")
	public UnityWebElement labelBlockNumber;
	
	@FindBy(xpath = "//mat-expansion-panel[3]/div[1]/div[1]/div[1]/unity-detail-view[1]/div[1]/div[1]/ol[1]/li[2]/span[1]")
	public UnityWebElement labelAccountNumber;
	
	@FindBy(xpath = "//li//span[normalize-space(text())='Fee Date']")
	public UnityWebElement labelFeeDate;
	
	@FindBy(xpath = "//li//span[normalize-space(text())='Fee Expiration Date']")
	public UnityWebElement labelFeeExpirationDate;
	
	@FindBy(xpath = "//mat-expansion-panel[3]/div[1]/div[1]/div[1]/unity-detail-view[1]/div[1]/div[1]/ol[1]/li[5]/span[1]")
	public UnityWebElement labelParticipantsFeeDetailAccountName;
	
	@FindBy(xpath = "//li//span[normalize-space(text())='Use First Fee Date']")
	public UnityWebElement labelUseFirstFeeDate;
	
	@FindBy(xpath = "//li//span[normalize-space(text())='Disbursement Code']")
	public UnityWebElement labelDisbursementCode;
	
	@FindBy(xpath = "//li//span[normalize-space(text())='Percent Fee from Principal']")
	public UnityWebElement labelPercentFeefromPrincipal;
	
	
	@FindBy(xpath = "//li//span[normalize-space(text())='Period Description']")
	public UnityWebElement labelPeriodDescription;
	
	@FindBy(xpath = "//li//span[normalize-space(text())='Tax Code']")
	public UnityWebElement labelTaxCode;
	
	@FindBy(xpath = "//li//span[normalize-space(text())='Account to Bill or Charge']")
	public UnityWebElement labelAccounttoBillorCharge;
	
	@FindBy(xpath = "//li//span[normalize-space(text())='Number of Days to Offset Fee']")
	public UnityWebElement labelNumberofDaystoOffsetFee;
	
	
	@FindBy(xpath = "//li//span[normalize-space(text())='Fee Billed']")
	public UnityWebElement labelFeeBilled;
	
	@FindBy(xpath = "//li//span[normalize-space(text())='Fee Control Account Number']")
	public UnityWebElement labelFeeControlAccountNumber;
	
	@FindBy(xpath = "//li//span[normalize-space(text())='Secondary Fee Control Account Number']")
	public UnityWebElement labelSecondaryFeeControlAccountNumber;
	
	@FindBy(xpath = "//li//span[normalize-space(text())='Fee Schedule']")
	public UnityWebElement labelFeeSchedule;
	
	@FindBy(xpath = "//li//span[normalize-space(text())='Print Advice for Charged Fee']")
	public UnityWebElement labelPrintAdviceforChargedFee;
	
	@FindBy(xpath = "//li//span[normalize-space(text())='Flat Fee']")
	public UnityWebElement labelFlatFee;
	
	@FindBy(xpath = "//mat-expansion-panel[3]/div[1]/div[1]/div[1]/unity-detail-view[1]/div[1]/div[1]/ol[1]/li[19]/span[1]")
	public UnityWebElement labelParticipantsFeeDetailPrintChargedFeeInvoice;
	
	@FindBy(xpath = "//li//span[normalize-space(text())='Include in Account Level Minimum']")
	public UnityWebElement labelIncludeinAccountLevelMinimum;
	
	@FindBy(xpath = "//li//span[normalize-space(text())='Minimum Fee']")
	public UnityWebElement labelMinimumFee;
	
	@FindBy(xpath = "//li//span[normalize-space(text())='Fee Bill Via ACH Debit']")
	public UnityWebElement labelFeeBillViaACHDebit;
	
	@FindBy(xpath = "//li//span[normalize-space(text())='Components to Exclude']")
	public UnityWebElement labelComponentstoExclude;
	
	@FindBy(xpath = "//li//span[normalize-space(text())='Maximum Fee']")
	public UnityWebElement labelMaximumFee;
	
	@FindBy(xpath = "//li//span[normalize-space(text())='Reporting Method for Fee Components']")
	public UnityWebElement labelReportingMethodforFeeComponents;
	
	@FindBy(xpath = "//li//span[normalize-space(text())='Apply Fund Rebate']")
	public UnityWebElement labelApplyFundRebate;
	
	@FindBy(xpath = "//li//span[normalize-space(text())='Fee Discount']")
	public UnityWebElement labelFeeDiscount;
	
	@FindBy(xpath = "//li//span[normalize-space(text())='Fee Reserve']")
	public UnityWebElement labelFeeReserve;
	
	@FindBy(xpath = "//li//span[normalize-space(text())='Min Max and Step Cycle']")
	public UnityWebElement labelMinMaxandStepCycle;
	
	@FindBy(xpath = "//li//span[normalize-space(text())='Prorate Account Level Minimum']")
	public UnityWebElement labelProrateAccountLevelMinimum;
	
	@FindBy(xpath = "//li//span[normalize-space(text())='Basis for Fee Proration']")
	public UnityWebElement labelBasisforFeeProration;
	
	@FindBy(xpath = "//li//span[normalize-space(text())='To Whom Paid or Credit To']")
	public UnityWebElement labelToWhomPaidorCreditTo;
	
	@FindBy(xpath = "//li//span[normalize-space(text())='Portfolio']")
	public UnityWebElement labelPortfolio;
	
	@FindBy(xpath = "//li//span[normalize-space(text())='Register for Fee Payment']")
	public UnityWebElement labelRegisterforFeePayment;
	
	@FindBy(xpath = "//li//span[normalize-space(text())='Funds Code']")
	public UnityWebElement labelFundsCode;
	
	@FindBy(xpath = "//li//span[normalize-space(text())='Payment Type']")
	public UnityWebElement labelPaymentType;
	
	@FindBy(xpath = "//li//span[normalize-space(text())='Wire Transfer Repeat Code']")
	public UnityWebElement labelWireTransferRepeatCode;
	
	@FindBy(xpath = "//li//span[normalize-space(text())='Transit Routing Number']")
	public UnityWebElement labelTransitRoutingNumber;
	
	@FindBy(xpath = "//li//span[normalize-space(text())='Receiving Bank Name']")
	public UnityWebElement labelReceivingBankName;
	
	@FindBy(xpath = "//li//span[normalize-space(text())='Receiving Account Type']")
	public UnityWebElement labelReceivingAccountType;
	
	@FindBy(xpath = "//li//span[normalize-space(text())='Account Number for Debit']")
	public UnityWebElement labelAccountNumberforDebit;
	
	@FindBy(xpath = "//li//span[normalize-space(text())='Suppress Memo for ACH Debit']")
	public UnityWebElement labelSuppressMemoforACHDebit;
	
	@FindBy(xpath = "//li//span[normalize-space(text())='Disposition']")
	public UnityWebElement labelDisposition;
	
	@FindBy(xpath = "//li//span[normalize-space(text())='Use Control Account for Fee Calculation']")
	public UnityWebElement labelUseControlAccountforFeeCalculation;
	
	@FindBy(xpath = "//li//span[normalize-space(text())='First Fee Start Date']")
	public UnityWebElement labelFirstFeeStartDate;
	
	@FindBy(xpath = "//li//span[normalize-space(text())='Override FPBR Payee Table']")
	public UnityWebElement labelOverrideFPBRPayeeTable;
	
	@FindBy(xpath = "//li//span[normalize-space(text())='Include Central Account Fees']")
	public UnityWebElement labelIncludeCentralAccountFees;
	

	@FindBy(xpath = "//span[normalize-space(text())='Name/Address']")
	public UnityWebElement labelNameAddressKey;

	@FindBy(xpath = "//*[normalize-space(text())='More Details']")
	public UnityWebElement linkMoreDetails;

	@FindBy(xpath = "//span[normalize-space(text())='Event Class']")
	public UnityWebElement labelEventClassKey;

	@FindBy(xpath = "//span[normalize-space(text())='Event Name']")
	public UnityWebElement labelEventNameKey;

	@FindBy(xpath = "//span[normalize-space(text())='Event Number']")
	public UnityWebElement labelEventNumberKey;

	@FindBy(xpath = "//span[normalize-space(text())='Event Type']")
	public UnityWebElement labelEventTypeKey;

	@FindBy(xpath = "//span[normalize-space(text())='Department']")
	public UnityWebElement labelDepartment;

	@FindBy(xpath = "//span[normalize-space(text())='Frequency']")
	public UnityWebElement labelFrequencyKey;

	@FindBy(xpath = "//span[normalize-space(text())='Holiday Rule']")
	public UnityWebElement labelHolidayRuleKey;

	@FindBy(xpath = "//span[normalize-space(text())='Next Scheduled Execution']")
	public UnityWebElement labelNextScheduledExecutionKey;

	@FindBy(xpath = "//span[normalize-space(text())='Client Name']")
	public UnityWebElement labelClientNameKey;

	@FindBy(xpath = "//span[normalize-space(text())='Responsible Employee']")
	public UnityWebElement labelResponsibleEmployeeKey;

	@FindBy(xpath = "//span[normalize-space(text())='Start of Business']")
	public UnityWebElement labelStartOfBusinessKey;

	@FindBy(xpath = "//span[normalize-space(text())='Weekend Rule']")
	public UnityWebElement labelWeekendRuleKey;

	@FindBy(xpath = "//span[normalize-space(text())='Combine Payments']")
	public UnityWebElement labelCombinePaymentsKey;

	@FindBy(xpath = "//span[normalize-space(text())='Disbursement Funds Location Abbrev']")
	public UnityWebElement labelDisbursementFundsLocationAbbrevKey;

	@FindBy(xpath = "//span[normalize-space(text())='Disbursement Funds Location Meaning']")
	public UnityWebElement labelDisbursementFundsLocationMeaningKey;

	@FindBy(xpath = "//span[normalize-space(text())='Cash Amount']")
	public UnityWebElement labelCashAmountKey;

	@FindBy(xpath = "//span[normalize-space(text())='IRS Distribution Abbrev']")
	public UnityWebElement labelIRSdistributionAbbrevKey;

	@FindBy(xpath = "//span[normalize-space(text())='IRS Distribution']")
	public UnityWebElement labelIRSDistributionKey;

	@FindBy(xpath = "//span[normalize-space(text())='Pay for Name']")
	public UnityWebElement labelPayForNameKey;

	@FindBy(xpath = "//span[normalize-space(text())='Pay to Name']")
	public UnityWebElement labelPayToNameKey;

	@FindBy(xpath = "//span[normalize-space(text())='Pay to Account Number']")
	public UnityWebElement labelPayToAccountNumberKey;

	@FindBy(xpath = "//span[normalize-space(text())='Pay to Routing Number']")
	public UnityWebElement labelPayToRoutingNumberKey;

	@FindBy(xpath = "//span[normalize-space(text())='Remittance Form']")
	public UnityWebElement labelRemittanceFormKey;

	@FindBy(xpath = "//span[normalize-space(text())='Remittance Form Number']")
	public UnityWebElement labelRemittanceFormNumberKey;

	@FindBy(xpath = "//span[contains(@class,'sg-property-name')]")
	public List<WebElement> labelEventDetailsKeys;

	@FindBy(xpath = "//span[@class='sg-property-value ng-star-inserted']")
	public List<WebElement> labelEventDetailsValues;

	@FindBy(xpath = "//span[normalize-space(text())='Event Identifier']")
	public UnityWebElement labelEventIdentifierKey;

	@FindBy(xpath = "//span[normalize-space(text())='Block Number']")
	public UnityWebElement labelBlockNumberKey;

	@FindBy(xpath = "//span[normalize-space(text())='Effective Date Offset']")
	public UnityWebElement labelEffectivedateoffsetKey;

	@FindBy(xpath = "//span[normalize-space(text())='Payee Party Number']")
	public UnityWebElement labelPayeePartyNumberKey;

	// Event Details Participants
	@FindBy(xpath = "//span[normalize-space(text())='Payee']")
	public UnityWebElement labelPayeeKey;

	@FindBy(xpath = "//span[normalize-space(text())='Tax ID No']")
	public UnityWebElement labelTaxIDNoKey;

	@FindBy(xpath = "//span[normalize-space(text())='ACH Bank Routing Number']")
	public UnityWebElement labelAchBankRoutingNumberKey;

	@FindBy(xpath = "//mat-expansion-panel[@id='event-participants-expansion-panel']//span[normalize-space(text())='Payment Type']")
	public UnityWebElement labelPaymentTypeEventParticipantKey;

	@FindBy(xpath = "//span[normalize-space(text())='Dollar or Percent Payment']")
	public UnityWebElement labelDollarorPercentPaymentKey;

	@FindBy(xpath = "//span[normalize-space(text())='ACH Account Number']")
	public UnityWebElement labelACHAccountNumberKey;

	@FindBy(xpath = "//span[normalize-space(text())='Recipient Name']")
	public UnityWebElement labelRecipientNameKey;

	@FindBy(xpath = "//span[normalize-space(text())='Net Amount']")
	public UnityWebElement labelNetAmountKey;

	@FindBy(xpath = "//span[normalize-space(text())='ACH Account Type']")
	public UnityWebElement labelACHAccountTypeKey;

	@FindBy(xpath = "//span[normalize-space(text())='Recipient Number']")
	public UnityWebElement labelRecipientNumberKey;

	@FindBy(xpath = "//span[normalize-space(text())='Name Address Key']")
	public UnityWebElement labelNameAddressKeyKey;

	@FindBy(xpath = "//span[normalize-space(text())='Address Type']")
	public UnityWebElement labelAddressTypeKey;

	@FindBy(xpath = "//span[normalize-space(text())='Telephone – Home']")
	public UnityWebElement labelTelephoneHomeKey;

	@FindBy(xpath = "//span[normalize-space(text())='Income Cash Amount']")
	public UnityWebElement labelIncomeCashAmountKey;

	@FindBy(xpath = "//span[normalize-space(text())='Address']")
	public UnityWebElement labelAddressKey;

	@FindBy(xpath = "//span[normalize-space(text())='Telephone – Cell']")
	public UnityWebElement labelTelephoneCellKey;

	@FindBy(xpath = "//span[normalize-space(text())='Principal Cash Amount']")
	public UnityWebElement labelPrincipalCashAmountKey;

	@FindBy(xpath = "//span[normalize-space(text())='Telephone – Work']")
	public UnityWebElement labelTelephoneWorkKey;

	@FindBy(xpath = "//span[normalize-space(text())='Telephone – Fax']")
	public UnityWebElement labelTelephoneFaxKey;

	@FindBy(xpath = "//span[normalize-space(text())='Telephone – Other']")
	public UnityWebElement labelTelephoneOtherKey;

	@FindBy(xpath = "//span[normalize-space(text())='Disposition Code']")
	public UnityWebElement labelDispositionCodeKey;

	@FindBy(xpath = "//span[normalize-space(text())='Receiving Bank Name']")
	public UnityWebElement labelReceivingBankNameKey;

	@FindBy(xpath = "//span[normalize-space(text())='Income Amount']")
	public UnityWebElement labelIncomeAmountKey;

	@FindBy(xpath = "//span[normalize-space(text())='ACH Transit Routing Description']")
	public UnityWebElement labelACHTransitRoutingDescriptionKey;

	@FindBy(xpath = "//span[normalize-space(text())='Principal Amount']")
	public UnityWebElement labelPrincipalAmountKey;

	@FindBy(xpath = "//span[normalize-space(text())='Tax Code']")
	public UnityWebElement labelTaxCodeKey;

	@FindBy(xpath = "//span[normalize-space(text())='Deposit Account Number']")
	public UnityWebElement labelDepositAccountNumberKey;

	@FindBy(xpath = "//span[normalize-space(text())='Wire Transfer Repeat Code']")
	public UnityWebElement labelWireTransferRepeatCodeKey;

	@FindBy(xpath = "//span[normalize-space(text())='Mail to']")
	public UnityWebElement labelMailToKey;

	@FindBy(xpath = "//span[normalize-space(text())='Received ACH Account Type Description']")
	public UnityWebElement labelReceivedACHAccountTypeDescriptionKey;

	@FindBy(xpath = "//span[normalize-space(text())='Other Account Portfolio']")
	public UnityWebElement labelOtherAccountPortfolioKey;

	@FindBy(xpath = "//span[normalize-space(text())='Event Description']")
	public UnityWebElement labelEventDescriptionKey;

	@FindBy(xpath = "//span[normalize-space(text())='Transaction Description']")
	public UnityWebElement labelTransactionDescriptionKey;

	@FindBy(xpath = "//span[normalize-space(text())='Voucher Receipt Description']")
	public UnityWebElement labelVoucherReceiptDescriptionKey;

	// IRA Distribution
	@FindBy(xpath = "//mat-expansion-panel[@id='ira-distribution-details-expansion-panel']//span[normalize-space(text())='Payment Type']")
	public UnityWebElement labelPaymentTypeIRADistributionKey;

	@FindBy(xpath = "//span[normalize-space(text())='Federal Marital Status']")
	public UnityWebElement labelFederalMaritalStatusKey;

	@FindBy(xpath = "//span[normalize-space(text())='State Marital Status']")
	public UnityWebElement labelStateMaritalStatusKey;

	@FindBy(xpath = "//span[normalize-space(text())='Payment Status']")
	public UnityWebElement labelPaymentStatusKey;

	@FindBy(xpath = "//span[normalize-space(text())='Federal Number of Exemptions']")
	public UnityWebElement labelFederalNumberofExemptionsKey;

	@FindBy(xpath = "//span[normalize-space(text())='State Number of Exemptions']")
	public UnityWebElement labelStateNumberofExemptionsKey;

	@FindBy(xpath = "//span[normalize-space(text())='Tax Form Indicator']")
	public UnityWebElement labelTaxFormIndicatorKey;

	@FindBy(xpath = "//span[normalize-space(text())='Additional State Exemptions']")
	public UnityWebElement labelAdditionalStateExemptionsKey;

	@FindBy(xpath = "//span[normalize-space(text())='IRA/SEP/SIMPLE Distribution']")
	public UnityWebElement labelIRASEPSIMPLEDistributionKey;

	@FindBy(xpath = "//span[normalize-space(text())='State Tax Exempt Indicator']")
	public UnityWebElement labelStateTaxExemptIndicatorKey;

	@FindBy(xpath = "//span[normalize-space(text())='Retirement Date']")
	public UnityWebElement labelRetirementDateKey;

	@FindBy(xpath = "//span[normalize-space(text())='Federal Exempt Amount']")
	public UnityWebElement labelFederalExemptAmountKey;

	@FindBy(xpath = "//span[normalize-space(text())='State Exempt Amount']")
	public UnityWebElement labelStateExemptAmountKey;

	@FindBy(xpath = "//span[normalize-space(text())='Residency Code']")
	public UnityWebElement labelResidencyCodeKey;

	@FindBy(xpath = "//span[normalize-space(text())='Automatically Calc Federal Withholding']")
	public UnityWebElement labelAutomaticallyCalcFederalWithholdingKey;

	@FindBy(xpath = "//span[normalize-space(text())='Automatically Calc State Withholding']")
	public UnityWebElement labelAutomaticallyCalcStateWithholdingKey;

	@FindBy(xpath = "//span[normalize-space(text())='Tax Method']")
	public UnityWebElement labelTaxMethodKey;

	@FindBy(xpath = "//span[normalize-space(text())='Additional Federal Withholding']")
	public UnityWebElement labelAdditionalFederalWithholdingKey;

	@FindBy(xpath = "//span[normalize-space(text())='Additional State Withholding']")
	public UnityWebElement labelAdditionalStateWithholdingKey;

	@FindBy(xpath = "//span[normalize-space(text())='Tax Formula Type']")
	public UnityWebElement labelTaxFormulaTypeKey;

	@FindBy(xpath = "//span[normalize-space(text())='Produce Credit Advice']")
	public UnityWebElement labelProduceCreditAdviceKey;

	@FindBy(xpath = "//span[normalize-space(text())='Tax Filing State Code']")
	public UnityWebElement labelTaxFilingStateCodeKey;

	@FindBy(xpath = "//span[normalize-space(text())='Distribution Code 1']")
	public UnityWebElement labelDistributionCode1Key;

	@FindBy(xpath = "//span[normalize-space(text())='Initial Payment Date']")
	public UnityWebElement labelInitialPaymentDateKey;

	@FindBy(xpath = "//span[normalize-space(text())='Gross Payment']")
	public UnityWebElement labelGrossPaymentKey;

	@FindBy(xpath = "//span[normalize-space(text())='Distribution Code 2']")
	public UnityWebElement labelDistributionCode2Key;

	@FindBy(xpath = "//span[normalize-space(text())='Distribution Codes']")
	public UnityWebElement labelDistributionCodesKey;

	@FindBy(xpath = "//span[normalize-space(text())='Initial Installment Indicator']")
	public UnityWebElement labelInitialInstallmentIndicatorKey;

	@FindBy(xpath = "//span[normalize-space(text())='Designated Roth Contribution Date']")
	public UnityWebElement labelDesignatedRothContributionDateKey;

	@FindBy(xpath = "//span[normalize-space(text())='Deduction Code 1']")
	public UnityWebElement labelDeductionCode1Key;

	@FindBy(xpath = "//span[normalize-space(text())='First Lump Sum Payment Date']")
	public UnityWebElement labelFirstLumpSumPaymentDateKey;

	@FindBy(xpath = "//span[normalize-space(text())='Special Gross Lump Sum Payment']")
	public UnityWebElement labelSpecialGrossLumpSumPaymentKey;

	@FindBy(xpath = "//span[normalize-space(text())='Special Payment Deduction Code 1']")
	public UnityWebElement labelSpecialPaymentDeductionCode1Key;

	@FindBy(xpath = "//span[normalize-space(text())='Special Payment Deduction Amount 1']")
	public UnityWebElement labelSpecialPaymentDeductionAmount1Key;

	@FindBy(xpath = "//span[normalize-space(text())='Future Effective Date 1']")
	public UnityWebElement labelFutureEffectiveDate1Key;

	@FindBy(xpath = "//span[normalize-space(text())='Future Deduction Code 1']")
	public UnityWebElement labelFutureDeductionCode1Key;

	// Statements tab items
	@FindBy(css = "div[role='grid']")
	public UnityGridElement gridStatementsEvents;

	@FindBy(xpath = "//*[@id='icon' or @class='filter-text']") // div[@fxlayoutalign='start
																// center']//mat-icon[@fisicon='chevron']
	public UnityWebElement dropdownViewBy;

	@FindBy(xpath = "(//span[normalize-space(text())='All'])[2]") // need to check
	public UnityWebElement dropdownPortfolioPanel;

	@FindBy(xpath = "//div[@role='listbox']")
	public UnityWebElement listPortfolioSuggestions;

	@FindBy(xpath = "//mat-radio-button[.//*[normalize-space(text())='Account']]//input")
	public UnityWebElement radioButtonAccount;

	@FindBy(xpath = "//mat-radio-button[.//*[normalize-space(text())='Portfolio']]//input")
	public UnityWebElement radioButtonPortfolio;

	@FindBy(xpath = "//input[@placeholder='Search']")
	public UnityWebElement textboxSearch;

	@FindBy(xpath = "//mat-radio-button[.//*[normalize-space(text())='All']]//input")
	public UnityWebElement radioButtonAll;

	@FindBy(xpath = "//mat-radio-button[.//*[normalize-space(text())='Account Relationships']]//input")
	public UnityWebElement radioButtonAccountRelationships;

	@FindBy(xpath = "//mat-radio-button[.//*[normalize-space(text())='Portfolio Relationships']]//input")
	public UnityWebElement radioButtonPortfolioRelationships;

	@FindBy(xpath = "//div[@class='md-virtual-repeat-offsetter']/ul/li[1]")
	public UnityWebElement textPortfolioNumber;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Event Details']]")
	public UnityWebElement panelEventDetails;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Event Participants']]")
	public UnityWebElement panelEventParticipants;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='IRA Distribution']]")
	public UnityWebElement panelIRADistribution;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Payees']]")
	public UnityWebElement panelPayees;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Statement Details']]")
	public UnityWebElement panelStatementDetails;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Statement Affiliations']]")
	public UnityWebElement panelStatementAffiliations;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Statement Recipients']]")
	public UnityWebElement panelStatementRecipients;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Recipients']]")
	public UnityWebElement panelRecipients;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Statement Participants']]")
	public UnityWebElement panelStatementParticipants;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Participants']]")
	public UnityWebElement panelParticipants;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Recipients']]")
	public UnityWebElement panelFeesRecipients;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Participants']]")
	public UnityWebElement panelFeesParticipants;
	
	@FindBy(xpath = "//mat-panel-title[contains(text(),'Participants - Fee Detail')]")
	public UnityWebElement panelFeesParticipantsFeeDetail;

	@FindBy(xpath = "//ag-grid-angular[@id='stmtRecipients']//div[@role='grid']")
	public UnityGridElement gridStatementRecipients;

	@FindBy(css = "ag-grid-angular[id='recipients'] div[role='grid']")
	public UnityGridElement gridRecipients;

	@FindBy(css = "ag-grid-angular[id='participants'] div[role='grid']")
	public UnityGridElement gridParticipants;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Statement Recipients']]/..//unity-upgrade-column-filter")
	public UnityWebElement buttonColumnSettingsStatementRecipientsGrid;

	@FindBy(css = "ag-grid-angular[id='statementParticipants'] div[role='grid']")
	public UnityGridElement gridStatementParticipants;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Statement Participants']]/..//unity-upgrade-column-filter")
	public UnityWebElement buttonColumnSettingsStatementParticipantsGrid;

	@FindBy(xpath = "//iframe[@id='iFrame']")
	public UnityWebElement frameEditEvent;

	@FindBy(xpath = "//mat-dialog-container//h2[normalize-space(normalize-space(text())='Edit Event')]")
	public UnityWebElement frameHeaderEditEvent;

	@FindBy(xpath = "//iframe[@id='iFrame']")
	public UnityWebElement frameEditRecipient;

	@FindBy(xpath = "//iframe[@id='iFrame']")
	public UnityWebElement frameDeleteRecipient;

	@FindBy(xpath = "//iframe[@id='iFrame']")
	public UnityWebElement frameDeleteEvent;

	@FindBy(xpath = "//iframe[@id='iFrame']")
	public UnityWebElement frameDeleteParticipant;

	@FindBy(xpath = "//edit-info-go-page//h2[normalize-space(normalize-space(text())='Edit Recipient')]")
	public UnityWebElement headerEditRecipient;

	@FindBy(xpath = "//edit-info-go-page//h2[normalize-space(normalize-space(text())='Delete Recipient')]")
	public UnityWebElement headerDeleteRecipient;

	@FindBy(xpath = "//h2[normalize-space(normalize-space(text())='Edit Participant')]")
	public UnityWebElement headerEditParticipant;

	@FindBy(xpath = "//edit-info-go-page//h2[normalize-space(normalize-space(text())='Delete Participant')]")
	public UnityWebElement headerDeleteParticipant;

	@FindBy(xpath = "//div[contains(@style,'visible')]//button[@id='unity-account-edit-info-add-new']")
	public UnityWebElement buttonAddnewRecipients;

	@FindBy(xpath = "(//span[contains(normalize-space(text()),'Add New')])[2]")
	public UnityWebElement buttonAddNewParticipants;

	@FindBy(xpath = "//iframe[contains(@src,'statement')]")
	public UnityWebElement frameAddStatementRecipient;

	@FindBy(xpath = "//iframe[contains(@src,'statement')]")
	public UnityWebElement frameAddStatementParticipant;

	@FindBy(xpath = "//input[contains(@id,'ctlClientRadComboBox_ctlClientRadComboBox_Input')]")
	public UnityWebElement dropdownClient;

	@FindBy(xpath = "//div[contains(@id,'ClientRadComboBox_DropDown')]")
	public UnityWebElement optionsClient;

	@FindBy(xpath = "//input[contains(@id,'AccountRadComboBox_Input')]")
	public UnityWebElement dropdownAccount;

	@FindBy(xpath = "//div[contains(@id,'AccountRadComboBox_DropDown')]")
	public UnityWebElement optionsAccount;

	@FindBy(xpath = "//input[contains(@id,'ctlNumberofCopiesText')]")
	public UnityWebElement textboxNumberOfCopies;

	@FindBy(xpath = "//input[@id='ctlSubmitAndClose']")
	public UnityWebElement buttonSubmitStatement;

	@FindBy(xpath = "//input[@id='ctlSubmit']")
	public UnityWebElement buttonSubmitRecipient;

	@FindBy(xpath = "//input[@id='ctlSubmit']")
	public UnityWebElement buttonSubmitParticipant;

	@FindBy(xpath = "//input[contains(@id,'PortfolioRadComboBox_Input')]")
	public UnityWebElement dropdownPortfolioStatement;

	@FindBy(xpath = "//div[contains(@id,'PortfolioRadComboBox_DropDown')]")
	public UnityWebElement optionsPortfolioStatement;

	@FindBy(xpath = "//add-new-for-type-dialog//div//button[contains(normalize-space(@class),'mat-focus-indicator mat-icon')]")
	public UnityWebElement buttonCloseFrame;

	@FindBy(xpath = "//mat-checkbox[.//*[normalize-space(text())='IRS Distribution']]//input")
	public UnityWebElement checkboxIRSDistribution;

	@FindBy(xpath = "//mat-checkbox[.//*[normalize-space(text())='IRS Distribution Abbrev']]//input")
	public UnityWebElement checkboxIRSDistributionAbbrev;

	@FindBy(xpath = "//mat-checkbox[.//*[normalize-space(text())='Pay To Account Number']]//input")
	public UnityWebElement checkboxPayToAccountNumber;

	@FindBy(xpath = "//mat-checkbox[.//*[normalize-space(text())='Pay To Routing Number']]//input")
	public UnityWebElement checkboxPayToRoutingNumber;

	// Fees tab items
	@FindBy(css = "div[role='grid']")
	public UnityGridElement gridFeesEvents;

	@FindBy(xpath = "//*[normalize-space(text())='Account/Portfolio:']/following-sibling::span/span[1]")
	public UnityWebElement labelPortfolioName;

	@FindBy(xpath = "//*[normalize-space(text())='Account/Portfolio:']/following-sibling::span/span[2]")
	public UnityWebElement labelPortfolioNumber;

	@FindBy(xpath = "//*[normalize-space(text())='Fee Agreement Type']")
	public UnityWebElement labelFeeAgreementTypeKey;

	@FindBy(xpath = "//*[normalize-space(text())='Date of Fee Agreement']")
	public UnityWebElement labelDateOfFeeAgreementKey;

	@FindBy(xpath = "//*[normalize-space(text())='Date of Fee Agreement Expiration']")
	public UnityWebElement labelDateOfFeeAgreemenExpirationtKey;

	@FindBy(xpath = "//*[normalize-space(text())='Date of Last Fee Review']")
	public UnityWebElement labelDateOfLastFeeReviewKey;

	@FindBy(xpath = "//*[normalize-space(text())='Fee Relationship Group']")
	public UnityWebElement labelFeeRelationshipGroupKey;

	@FindBy(xpath = "//*[normalize-space(text())='Fee Relationship Minimum']")
	public UnityWebElement labelFeeRelationshipMinimumKey;

	@FindBy(xpath = "//*[normalize-space(text())='Responsibility Center']")
	public UnityWebElement labelResponsibilityCenterKey;

	@FindBy(xpath = "//*[normalize-space(text())='Sharing Responsibility Center']")
	public UnityWebElement labelSharingResponsibilityCenterKey;

	@FindBy(xpath = "//*[normalize-space(text())='Sharing Responsibility Percent']")
	public UnityWebElement labelSharingResponsibilityPercentKey;

	@FindBy(xpath = "//*[normalize-space(text())='Prior Year Fees']")
	public UnityWebElement labelPriorYearFeesKey;

	@FindBy(xpath = "//*[normalize-space(text())='Current Year-To-Date (YTD)']")
	public UnityWebElement labelCurrentYearToDateYTDKey;

	@FindBy(xpath = "//*[normalize-space(text())='Prior Quarter']")
	public UnityWebElement labelPriorQuarterKey;

	@FindBy(xpath = "//*[normalize-space(text())='Account Fee Detail']")
	public UnityWebElement labelAccountFeeDetail;

	@FindBy(xpath = "//span[@class='sg-property-name']")
	public List<WebElement> labelAccountFeeDetailKeys;

	@FindBy(xpath = "//span[@class='sg-property-value ng-star-inserted']")
	public List<WebElement> labelAccountFeeDetailValues;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Fee Calculation/Charge']]")
	public UnityWebElement panelFeeCalculationCharge;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Fee Event Detail']]")
	public UnityWebElement panelFeeEventDetail;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Fee Maximum/Minimum']]")
	public UnityWebElement panelFeeMaximumMinimum;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Fee Premium/Discount']]")
	public UnityWebElement panelFeePremiumDiscount;

	@FindBy(xpath = "(.//div[normalize-space(text())='Fee Calculation Formula'])[1]")
	public UnityWebElement labelFeeCalculationFormulaKey;

	@FindBy(xpath = "(.//div[normalize-space(text())='Calculation Basis'])[1]")
	public UnityWebElement labelCalculationBasisKey;

	@FindBy(xpath = "(.//div[normalize-space(text())='Calculation Method'])[1]")
	public UnityWebElement labelCalculationMethodKey;

	@FindBy(xpath = "(.//div[normalize-space(text())='Charge Qualifier'])[1]")
	public UnityWebElement labelChargeQualifierKey;

	@FindBy(xpath = "(//strong[normalize-space(text())='Charge Rate'])[1]")
	public UnityWebElement labelChargeRateKey;

	@FindBy(xpath = "(//strong[normalize-space(text())='Charge Breakpoints'])[1]")
	public UnityWebElement labelChargeBreakpointsKey;

	@FindBy(xpath = "//div[@class='sg-property-name']")
	public List<WebElement> labelFeeCalculationChargeKeys;

	@FindBy(xpath = "//div[contains(@class,'sg-property-value')]")
	public List<WebElement> labelFeeCalculationChargeValues;

	@FindBy(xpath = "//h3[normalize-space(text())='Additional fee qualifiers']")
	public UnityWebElement headerAdditionalFeeQualifiers;

	@FindBy(xpath = "//div[@class='pagination-container']/div")
	public UnityWebElement labelAdditionalFeeQualifiers;

	@FindBy(xpath = "(//div[@class='charge-rates'])[1]")
	public UnityWebElement tableChargeRate;

	@FindBy(xpath = "(//div[@class='charge-breakpoints'])[1]")
	public UnityWebElement tableChargeBreakpoints;

	// Memos tab items
	@FindBy(css = "div[role='grid']")
	public UnityGridElement gridMemosEvents;

	@FindBy(xpath = "//span[contains(text(),'Text')]")
	public UnityWebElement labelTextKey;

	@FindBy(xpath = "//div[@id='cdk-accordion-child-9']//span[@class='sg-property-name']")
	public List<WebElement> labelMemosEventKeys;

	@FindBy(xpath = "//div[@id='cdk-accordion-child-9']//span[@class='sg-property-value ng-star-inserted']")
	public List<WebElement> labelMemosEventValues;

	// Other tab items
	@FindBy(xpath = "//div[@role='grid']")
	public UnityGridElement gridOtherEvents;

	@FindBy(xpath = "//button[span[normalize-space(text())='Cancel']]")
	public UnityWebElement buttonViewByCancel;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Account Name']]//input")
	public UnityWebElement checkboxAccountName;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Account/Portfolio Number']]//input")
	public UnityWebElement checkboxAccountOrPortfolioNumber;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Additional Information']]//input")
	public UnityWebElement checkboxAdditionalInformation;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Additional Information Extended']]//input")
	public UnityWebElement checkboxAdditionalInformationExtended;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='As of Date']]//input")
	public UnityWebElement checkboxAsOfDate;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Cash Amount']]//input")
	public UnityWebElement checkboxCashAmount;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Event Category']]//input")
	public UnityWebElement checkboxEventCategory;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Event Class']]//input")
	public UnityWebElement checkboxEventClass;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Event Class Code']]//input")
	public UnityWebElement checkboxEventClassCode;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Event Class Description']]//input")
	public UnityWebElement checkboxEventClassDescription;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Event Class Description Code']]//input")
	public UnityWebElement checkboxEventClassDescriptionCode;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Event Description']]//input")
	public UnityWebElement checkboxEventDescription;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Event Number']]//input")
	public UnityWebElement checkboxEventNumber;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Last Scheduled Execution']]//input")
	public UnityWebElement checkboxLastScheduledExecution;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Responsible Employee']]//input")
	public UnityWebElement checkboxResponsibleEmployee;

	@FindBy(xpath = "//span[normalize-space(text())='From Close of Business']")
	public UnityWebElement labelFromCloseOfBusinessKey;

	@FindBy(xpath = "//span[normalize-space(text())='Report Package Number']")
	public UnityWebElement labelReportPackageNumber;

	@FindBy(xpath = "//span[normalize-space(text())='Report Package']")
	public UnityWebElement labelReportPackage;

	@FindBy(xpath = "//span[normalize-space(text())='Await Release']")
	public UnityWebElement labelAwaitRelease;

	@FindBy(xpath = "//span[normalize-space(text())='Report Package Contents']")
	public UnityWebElement labelReportPackageContentsKey;

	@FindBy(xpath = "//span[normalize-space(text())='Report Package']")
	public UnityWebElement labelReportPackageKey;

	@FindBy(xpath = "//ag-grid-angular[@id='statementRelationship']//div[@role='grid']")
	public UnityGridElement gridStatementAffiliations;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Statement Affiliations']]/..//unity-upgrade-column-filter")
	public UnityWebElement buttonColumnSettingsStatementAffiliationsGrid;

	@FindBy(xpath = "//*[normalize-space(text())='Fee Account Group']")
	public UnityWebElement labelFeeAccountGroupKey;

	@FindBy(xpath = "//span[normalize-space(text())='Count of Participants']")
	public UnityWebElement labelCountOfParticipantsKey;

	@FindBy(xpath = "//span[normalize-space(text())='Count of Recipients']")
	public UnityWebElement labelCountOfRecipientsKey;

	@FindBy(xpath = "//span[normalize-space(text())='End Date of Fee Period']")
	public UnityWebElement labelEndDateOfFeePeriodKey;

	@FindBy(xpath = "//span[normalize-space(text())='Anniversary Date']")
	public UnityWebElement labelAnniversaryDateKey;

	@FindBy(xpath = "//span[normalize-space(text())='Date of Fee Schedule Change']")
	public UnityWebElement labelDateOfFeeScheduleChangeKey;

	@FindBy(xpath = "//span[normalize-space(text())='Start Date of Fee Period']")
	public UnityWebElement labelStartDateOfFeePeriodKey;

	@FindBy(xpath = "//span[normalize-space(text())='Currency']")
	public UnityWebElement labelCurrencyKey;

	@FindBy(xpath = "//span[normalize-space(text())='Event Allocation Method']")
	public UnityWebElement labelEventAllocationMethodKey;

	@FindBy(xpath = "//span[normalize-space(text())='Effective Fee Schedule']")
	public UnityWebElement labelEffectiveFeeScheduleKey;

	@FindBy(xpath = "//span[normalize-space(text())='Fees YTD Year 1']")
	public UnityWebElement labelFeesYTDYear1Key;

	@FindBy(xpath = "//span[normalize-space(text())='Fees YTD Year 2']")
	public UnityWebElement labelFeesYTDYear2Key;

	@FindBy(xpath = "//span[normalize-space(text())='Previous Fee Schedule']")
	public UnityWebElement labelPreviousFeeScheduleKey;

	@FindBy(xpath = "//span[normalize-space(text())='Prorated Fee Computation']")
	public UnityWebElement labelProratedFeeComputationKey;

	@FindBy(xpath = "//span[normalize-space(text())='Non-Fee Schedule Activity Charges']")
	public UnityWebElement labelNonFeeScheduleActivityChargesKey;

	@FindBy(xpath = "//span[normalize-space(text())='Fees YTD Year 1 Amount']")
	public UnityWebElement labelFeesYTDYear1AmountKey;

	@FindBy(xpath = "//span[normalize-space(text())='Fees YTD Year 2 Amount']")
	public UnityWebElement labelFeesYTDYear2AmountKey;

	@FindBy(xpath = "//span[normalize-space(text())='Override Fee Schedule Annual Min']")
	public UnityWebElement labelOverrideFeeScheduleAnnualMinKey;

	@FindBy(xpath = "//span[normalize-space(text())='Fee Schedule Min Application Rule']")
	public UnityWebElement labelFeeScheduleMinApplicationRuleKey;

	@FindBy(xpath = "//span[normalize-space(text())='Minimum Fee Calculation Formula']")
	public UnityWebElement labelMinimumFeeCalculationFormulaKey;

	@FindBy(xpath = "//span[normalize-space(text())='Fee Event Maximum']")
	public UnityWebElement labelFeeEventMaximumKey;

	@FindBy(xpath = "//span[normalize-space(text())='Event Fee Min Application Rule']")
	public UnityWebElement labelEventFeeMinApplicationRuleKey;

	@FindBy(xpath = "//span[normalize-space(text())='Annual Override Minimum']")
	public UnityWebElement labelAnnualOverrideMinimumKey;

	@FindBy(xpath = "//span[normalize-space(text())='Maximum Tolerance']")
	public UnityWebElement labelMaximumToleranceKey;

	@FindBy(xpath = "//span[normalize-space(text())='Discount Override Amount']")
	public UnityWebElement labelDiscountOverrideAmountKey;

	@FindBy(xpath = "//span[normalize-space(text())='Discount Percentage']")
	public UnityWebElement labelDiscountPercentageKey;

	@FindBy(xpath = "//span[normalize-space(text())='Premium Override Amount']")
	public UnityWebElement labelPremiumOverrideAmountKey;

	@FindBy(xpath = "//span[normalize-space(text())='Premium Percentage']")
	public UnityWebElement labelPremiumPercentageKey;

	@FindBy(xpath = "//span[normalize-space(text())='Discount Never Below Minimum?']")
	public UnityWebElement labelDiscountNeverBelowMinimumKey;

	@FindBy(xpath = "//div[@id='participants']//div[@role='grid']")
	public UnityGridElement gridFeesParticipants;

	@FindBy(xpath = "//div[@id='recipients']//div[@role='grid']")
	public UnityGridElement gridFeesRecipients;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Memo Text']]")
	public UnityWebElement panelMemoText;

	@FindBy(xpath = "//span[normalize-space(text())='Memo Text']")
	public UnityWebElement labelMemoTextKey;

	@FindBy(xpath = "(//span[@class='glyphicons glyphicons-print print-icon-size'])[2]")
	public UnityWebElement buttonPrint1;

	@FindBy(xpath = "(//span[contains(normalize-space(text()),'Add New')])[1]")
	public UnityWebElement buttonAddNewReciepients;

	@FindBy(xpath = "//input[@value='Cancel']")
	public UnityWebElement buttonEditEventCancel;

	@FindBy(xpath = "(//div[@class='charge-rates'])[1]/div[position()>1]")
	public UnityGridElement gridChargeRate;

	// Client Events
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Add New')]")
	public UnityWebElement buttonAddNewClientReminder;

	@FindBy(xpath = "//span[@class='glyphicons glyphicons-file-export']")
	public UnityWebElement buttonExportToCSV;

	@FindBy(xpath = "//h2[contains(normalize-space(text()),'Add New Client Reminder')]")
	public UnityWebElement labelAddNewReminder;

	@FindBy(xpath = "//iframe[contains(@src,'TRANS=EventAdd')]")
	public UnityWebElement frameAddReminder;

	@FindBy(xpath = "//textarea[contains(@id,'ctlMemoEventDetail_ctlText')]")
	public UnityWebElement textboxText;

	@FindBy(xpath = "//input[@value='Submit']")
	public UnityWebElement buttonSubmitClientReminder;

	@FindBy(xpath = "//*[@id='ctl00_ctlDockDocuments_C_ctlDocuments_ctlDocsGrid']")
	public UnityWebElement tableDocuments;

	@FindBy(xpath = "//*[@id='ctl00_ctlDockComments_C_ctlComments_ctlCommentsControl_ctlAddComments']")
	public UnityWebElement linkAddComments;

	@FindBy(xpath = "//*[@id='ctl00_ctlDockComments_C_ctlComments_ctlCommentsControl_ctlEnterComments']")
	public UnityWebElement textareaComments;

	@FindBy(xpath = "//*[@value='Save']")
	public UnityWebElement buttonSaveComments;

	// Add Event Payee
	@FindBy(xpath = "//span[normalize-space(text())='Add New']")
	public UnityWebElement buttonAddEventPayee;

	@FindBy(xpath = "//h2[contains(normalize-space(text()),'Add Disbursement Event Payee')]")
	public UnityWebElement labelAddNewEventPayee;

	@FindBy(xpath = "//iframe[contains(@src,'TRANS=DisbEventPayeeAdd')]")
	public UnityWebElement frameAddEventPayee;

	@FindBy(xpath = "//input[contains(@id,'PaidForLookup_ctlClientRadComboBox_ctlClientRadComboBox_Input')]")
	public UnityWebElement textboxPaidFor;

	@FindBy(xpath = "//div[contains(@id,'PaidForLookup_ctlClientRadComboBox_ctlClientRadComboBox_DropDown')]")
	public UnityWebElement optionsPaidFor;

	@FindBy(xpath = "//input[contains(@id,'DockDisbursementPayeeDetails_C_ctlPercentageText')]")
	public UnityWebElement textboxPercentage;

	@FindBy(xpath = "//input[contains(@id,'DockDisbursementPayeeDetails_C_ctlRoutingSymbolText')]")
	public UnityWebElement textboxRoutingSymbol;

	@FindBy(xpath = "//input[contains(@id,'DockDisbursementPayeeDetails_C_ctlAcctReferenceText')]")
	public UnityWebElement textboxAcctReference;

	@FindBy(xpath = "//input[contains(@id,'PaidToLookup_ctlClientRadComboBox_ctlClientRadComboBox_Input')]")
	public UnityWebElement textboxPaidTo;

	@FindBy(xpath = "//div[contains(@id,'PaidToLookup_ctlClientRadComboBox_ctlClientRadComboBox_DropDown')]")
	public UnityWebElement optionsPaidTo;

	////button//mat-icon[contains(@class,'mat-icon notranslate fisfont fis-icon-close')]
	@FindBy(xpath = "//button[@aria-label='close']")
	public UnityWebElement buttonClose;

	@FindBy(xpath = "//li[normalize-space(text())='Memo Event']")
	public UnityWebElement optionMemoEvent;

	@FindBy(xpath = "//span[normalize-space(text())='Delete']")
	public UnityWebElement optionDelete;

	@FindBy(xpath = "//span[normalize-space(text())='Edit']")
	public UnityWebElement optionEdit;

	@FindBy(xpath = "//span[normalize-space(text())='Pay']")
	public UnityWebElement optionPay;

	// Participant Details
	@FindBy(xpath = "//*[normalize-space(text())='Participant Number:']")
	public UnityWebElement labelParticipantNumberKey;

	@FindBy(xpath = "//*[normalize-space(text())='Participant Number:']/following-sibling::span")
	public UnityWebElement labelParticipantNumberValue;

	@FindBy(xpath = "//*[normalize-space(text())=\"Recipient's Routing Symbol\"]")
	public UnityWebElement labelRecipientsRoutingSymbolKey;

	@FindBy(xpath = "//*[normalize-space(text())=\"Recipient's Account Reference\"]")
	public UnityWebElement labelRecipientsAccountReferenceKey;

	@FindBy(xpath = "//*[normalize-space(text())='Description Code']")
	public UnityWebElement labelDescriptionCodeKey;

	@FindBy(xpath = "//*[normalize-space(text())='Portfolio Allocation Percent']")
	public UnityWebElement labelPortfolioAllocationPercentKey;

	@FindBy(xpath = "//*[normalize-space(text())='Invoice Recipient']")
	public UnityWebElement labelInvoiceRecipientKey;

	@FindBy(xpath = "//*[normalize-space(text())='Collection Method']")
	public UnityWebElement labelCollectionMethodKey;

	@FindBy(xpath = "//*[normalize-space(text())='Remit Portfolio Name']")
	public UnityWebElement labelRemitPortfolioNameKey;

	@FindBy(xpath = "//*[normalize-space(text())='Remitting Portfolio']")
	public UnityWebElement labelRemittingPortfolioKey;

	@FindBy(xpath = "//*[normalize-space(text())='Sharing Responsibility Center Percent']")
	public UnityWebElement labelSharingResponsibilityCenterPercentKey;

	@FindBy(xpath = "//*[normalize-space(text())='Fee Allocation Method Abbreviation']")
	public UnityWebElement labelFeeAllocationMethodAbbreviationKey;

	@FindBy(xpath = "//*[normalize-space(text())='Fee Allocation Method Code']")
	public UnityWebElement labelFeeAllocationMethodCodeKey;

	@FindBy(xpath = "//*[normalize-space(text())='Fee Coll Method Abbreviation']")
	public UnityWebElement labelFeeCollMethodAbbreviationKey;

	@FindBy(xpath = "//*[normalize-space(text())='Fee Coll Method Code']")
	public UnityWebElement labelFeeCollMethodCodeKey;

	@FindBy(xpath = "//*[normalize-space(text())='Remit Portfolio GREF']")
	public UnityWebElement labelRemitPortfolioGrefKey;

	@FindBy(xpath = "//*[normalize-space(text())='Responsibility Center Abbreviation']")
	public UnityWebElement labelResponsibilityCenterAbbreviationKey;

	@FindBy(xpath = "//*[normalize-space(text())='Responsibility Center Code']")
	public UnityWebElement labelResponsibilityCenterCodeKey;

	@FindBy(xpath = "//*[normalize-space(text())='Memo Number']")
	public UnityWebElement labelMemoNumberKey;

	@FindBy(xpath = "//*[normalize-space(text())='Primary Description']")
	public UnityWebElement labelPrimaryDescriptionKey;

	@FindBy(xpath = "//*[normalize-space(text())='Private Description']")
	public UnityWebElement labelPrivateDescriptionKey;

	@FindBy(xpath = "//*[normalize-space(text())='Secondary Contact']")
	public UnityWebElement labelSecondaryContactKey;

	@FindBy(xpath = "//*[normalize-space(text())='Sharing Responsibility Control Abbrv']")
	public UnityWebElement labelSharingResponsibilityControlAbbrvKey;

	@FindBy(xpath = "//*[normalize-space(text())='Sharing Responsibility Control Number']")
	public UnityWebElement labelSharingResponsibilityControlNumberKey;

	@FindBy(xpath = "//*[normalize-space(text())='Primary Contact']")
	public UnityWebElement labelPrimaryContactKey;

	@FindBy(xpath = "//*[normalize-space(text())='Email Notification (Primary Contact)']")
	public UnityWebElement labelEmailNotificationPrimaryContactKey;

	@FindBy(xpath = "//*[normalize-space(text())='Email Notification (Secondary Contact)']")
	public UnityWebElement labelEmailNotificationSecondaryContactKey;

	@FindBy(xpath = "//*[normalize-space(text())='Date Start']")
	public UnityWebElement labelDateStartKey;

	@FindBy(xpath = "//span[@class='sg-property-name']")
	public List<WebElement> listFeeEventParticipantDetailKeys;

	@FindBy(xpath = "//span[contains(@class,'sg-property-value')]")
	public List<WebElement> listFeeEventParticipantDetailValues;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Block Number']]//input")
	public UnityWebElement checkboxBlockNumber;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Memo Number']]//input")
	public UnityWebElement checkboxMemoNumber;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Subject']]//input")
	public UnityWebElement checkboxSubject;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Email']]//input")
	public UnityWebElement checkboxEmail;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Primary Contact']]//input")
	public UnityWebElement checkboxPrimaryContact;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Primary Description']]//input")
	public UnityWebElement checkboxPrimaryDescription;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Actions']]//input")
	public UnityWebElement checkboxActions;

	@FindBy(xpath = "//mat-panel-title[normalize-space(text())='Event Details']//ancestor::mat-expansion-panel//span[@class='sg-property-name']")
	public List<WebElement> listFeeEventDetailKeys;

	@FindBy(xpath = "//mat-panel-title[normalize-space(text())='Event Details']//ancestor::mat-expansion-panel//span[contains(@class,'sg-property-value')]")
	public List<WebElement> listFeeEventDetailValues;

	@FindBy(xpath = "//mat-panel-title[normalize-space(text())='Participants']//ancestor::mat-expansion-panel//span[normalize-space(text())='Account Number']")
	public UnityWebElement labelParticipantsAccountNumber;

	@FindBy(xpath = "//mat-panel-title[normalize-space(text())='Participants']//ancestor::mat-expansion-panel//span[normalize-space(text())='Account Name']")
	public UnityWebElement labelParticipantsAccountName;

	@FindBy(xpath = "//mat-panel-title[normalize-space(text())='Participants']//ancestor::mat-expansion-panel//span[@class='sg-property-name']")
	public List<WebElement> listParticipantsKeys;

	@FindBy(xpath = "//mat-panel-title[normalize-space(text())='Participants']//ancestor::mat-expansion-panel//span[contains(@class,'sg-property-value')]")
	public List<WebElement> listParticipantsValues;

	@FindBy(xpath = "//span[normalize-space(text())='Disposition']")
	public UnityWebElement labelDispositionKey;

	@FindBy(xpath = "//span[normalize-space(text())='Print for INV Officer']")
	public UnityWebElement labelPrintForINVOfficerKey;

	@FindBy(xpath = "//span[normalize-space(text())='Print for PB Officer']")
	public UnityWebElement labelPrintForPBOfficerKey;

	@FindBy(xpath = "//span[normalize-space(text())='Print for Other Officer']")
	public UnityWebElement labelPrintForOtherOfficerKey;

	@FindBy(xpath = "//span[normalize-space(text())='Interested Party']")
	public UnityWebElement labelInterestedPartyKey;

	@FindBy(xpath = "(//span[text()='Block Number'])[1]")
	public UnityWebElement labelEventDeatilsBlockNumberKey;

	@FindBy(xpath = "(//*[normalize-space(text())='Statement Details']//parent::span/following::div//span[text()='Block Number']")
	public UnityWebElement labelStatementDetailsBlockNumberKey;

	@FindBy(xpath = "//span[normalize-space(text())='Recipient Identifier']")
	public UnityWebElement labelRecipientIdentifierKey;

	@FindBy(xpath = "//span[normalize-space(text())='Block Relationship']")
	public UnityWebElement labelBlockRelationshipKey;

	@FindBy(xpath = "//span[normalize-space(text())='Block Statement Date']")
	public UnityWebElement labelBlockStatementDateKey;

	@FindBy(xpath = "//span[normalize-space(text())='Block Statement Type']")
	public UnityWebElement labelBlockStatementTypeKey;

	@FindBy(xpath = "//span[normalize-space(text())='Block Disposition']")
	public UnityWebElement labelBlockDispositionKey;

	@FindBy(xpath = "//span[normalize-space(text())='Block Expiration Date']")
	public UnityWebElement labelBlockExpirationDateKey;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Disposition']]//input")
	public UnityWebElement checkboxDisposition;

	@FindBy(xpath = "//span[text()='Print Charged Fee Invoice']")
	public UnityWebElement labelPrintChargedFeeInvoice;

	@FindBy(xpath = "//span[text()='Consolidated Master Fee Invoice']")
	public UnityWebElement labelConsolidatedMasterFeeInvoice;

	@FindBy(xpath = "//span[text()='Participant Name']")
	public UnityWebElement labelParticipantName;

	@FindBy(xpath = "//span[text()='Participant Number']")
	public UnityWebElement labelParticipantNumber;

	@FindBy(xpath = "//span[text()='Fee Billing Address']")
	public UnityWebElement labelFeeBillingAddress;

	@FindBy(xpath = "//span[@class='sg-property-name']")
	public List<WebElement> listRecipientsKeys;

	@FindBy(xpath = "//span[contains(@class,'sg-property-value')]")
	public List<WebElement> listRecipientsValues;

	@FindBy(xpath = "//div[span[text()='Event Name']]/preceding-sibling::span/*")
	public UnityWebElement menuEventName;

	@FindBy(xpath = "//div[@class='ag-theme-balham ag-popup']//div[@ref='eHeader']//span[@class='ag-icon ag-icon-filter']")
	public UnityWebElement menuFilter;

	@FindBy(xpath = "//div[@role='presentation' and @ref='eOptions1']/*[@ref='eWrapper']")
	public UnityWebElement menuFilterDropdown;

	@FindBy(xpath = "//*[text()='Contains']")
	public UnityWebElement menuFilterContains;

	@FindBy(xpath = "//*[text()='Not contains']")
	public UnityWebElement menuFilterNotContains;

	@FindBy(xpath = "//*[text()='Equals']")
	public UnityWebElement menuFilterEquals;
	
	@FindBy(xpath = "//*[text()='Not Equal']")
    public UnityWebElement menuFilterNotEqual;


	@FindBy(xpath = "//*[text()='Starts with']")
	public UnityWebElement menuFilterStartsWith;

	@FindBy(xpath = "//*[text()='Ends with']")
	public UnityWebElement menuFilterEndsWith;

	@FindBy(xpath = "(//div[@ref='eWrapper']/input[@ref='eInput' and @type='text'])[1]")
	public UnityWebElement menuFilterTextBox;

	@FindBy(xpath = "(//div[@ref='eWrapper']/input[@ref='eInput' and @type='date'])[1]")
	public UnityWebElement menuFilterDateBox;

	@FindBy(xpath = "//button[normalize-space(text())='Clear Filter']")
	public UnityWebElement buttonClearFilter;

	@FindBy(xpath = "//div[span[text()='Event Number']]")
	public UnityWebElement columnEventNumber;
	
	@FindBy(xpath = "//div[span[text()='Interested Party Number']]")
	public UnityWebElement columnIntrestedPartyNumber;
	
	@FindBy(xpath = "//div[span[text()='Interested Party Number']]/preceding-sibling::span/*")
	public UnityWebElement menuIntrestedPartyNumber;
	
	@FindBy(xpath = "//div[span[text()='Event Description']]")
	public UnityWebElement columnEventDescription;
	
	@FindBy(xpath = "//div[span[text()='Event Description']]/preceding-sibling::span/*")
	public UnityWebElement menuEventDescription;
	
	@FindBy(xpath = "//div[span[text()='Frequency']]")
	public UnityWebElement columnFrequency;
	
	@FindBy(xpath = "//div[span[text()='Frequency']]/preceding-sibling::span/*")
	public UnityWebElement menuFrequency;
	
	@FindBy(xpath = "//div[span[text()='Responsible Employee']]")
	public UnityWebElement columnResponsibleEmployee;
	
	@FindBy(xpath = "//div[span[text()='Responsible Employee']]/preceding-sibling::span/*")
	public UnityWebElement menuResponsibleEmployee;
	
	@FindBy(xpath = "//div[span[text()='Address']]")
	public UnityWebElement columnAddress;
	
	@FindBy(xpath = "//div[span[text()='Address']]/preceding-sibling::span/*")
	public UnityWebElement menuAddress;
	
	@FindBy(xpath = "//div[span[text()='Recipient Identifier']]")
	public UnityWebElement columnRecipientIdentifier;
	
	@FindBy(xpath = "//div[span[text()='Recipient Identifier']]/preceding-sibling::span/*")
	public UnityWebElement menuRecipientIdentifier;
	
	@FindBy(xpath = "//div[span[text()='Recipient Name']]")
	public UnityWebElement columnRecipientName;
	
	@FindBy(xpath = "//div[span[text()='Recipient Name']]/preceding-sibling::span/*")
	public UnityWebElement menuRecipientName;
	
	@FindBy(xpath = "//div[span[text()='Account Name']]")
	public UnityWebElement columnAccountName;
	
	@FindBy(xpath = "//div[span[text()='Account Name']]/preceding-sibling::span/*")
	public UnityWebElement menuAccountName;
	
	@FindBy(xpath = "//div[span[text()='Account Number']]")
	public UnityWebElement columnAccountNumber;
	
	@FindBy(xpath = "//div[span[text()='Account Number']]/preceding-sibling::span/*")
	public UnityWebElement menuAccountNumber;
	
	@FindBy(xpath = "//div[span[text()='Block Number']]")
	public UnityWebElement columnBlockNumber;
	
	@FindBy(xpath = "//div[span[text()='Block Number']]/preceding-sibling::span/*")
	public UnityWebElement menuBlockNumber;
	
	@FindBy(xpath = "//div[span[text()='Event Type']]")
	public UnityWebElement columnEventType;
	
	@FindBy(xpath = "//div[span[text()='Event Type']]/preceding-sibling::span/*")
	public UnityWebElement menuEventType;

	@FindBy(xpath = "//div[span[text()='Event Number']]/preceding-sibling::span/*")
	public UnityWebElement menuEventNumber;

	@FindBy(xpath = "//div[span[text()='As of Date']]/preceding-sibling::span/*")
	public UnityWebElement menuAsOfDate;

	@FindBy(xpath = "//div[span[text()='Last Scheduled Execution']]/preceding-sibling::span/*")
	public UnityWebElement menuLastScheduledExecution;

	@FindBy(xpath = "//div[span[text()='Next Scheduled Execution']]/preceding-sibling::span/*")
	public UnityWebElement menuNextScheduledExecution;

	@FindBy(xpath = "//div[span[text()='As of Date']]")
	public UnityWebElement columnAsOfDate;

	@FindBy(xpath = "//div[span[text()='Last Scheduled Execution']]")
	public UnityWebElement columnLastScheduledExecution;

	@FindBy(xpath = "//div[span[text()='Next Scheduled Execution']]")
	public UnityWebElement columnNextScheduledExecution;

	@FindBy(xpath = "//*[text()='Greater than']")
	public UnityWebElement menuFilterGreaterThan;

	@FindBy(xpath = "//*[text()='Less than']")
	public UnityWebElement menuFilterLessThan;

	@FindBy(xpath = "//*[text()='Not equal']")
	public UnityWebElement menuFilterNotEquals;

	@FindBy(xpath = "//*[text()='In range']")
	public UnityWebElement menuFilterInRange;

	@FindBy(xpath = "(//div[@ref='eWrapper'][input[@ref='eInput' and @type='date']])[1]")
	public UnityWebElement menuFilterDateTextBox1;

	@FindBy(xpath = "(//div[@ref='eWrapper']/input[@ref='eInput' and @type='date'])[1]")
	public UnityWebElement menuFilterDate1;

	@FindBy(xpath = "(//div[@ref='eWrapper']/input[@ref='eInput' and @type='date'])[2]")
	public UnityWebElement menuFilterDateBox2;

	@FindBy(xpath = "//*[text()='Less than or equals']")
	public UnityWebElement menuFilterLessThanOrEqual;

	@FindBy(xpath = "//*[text()='Greater than or equals']")
	public UnityWebElement menuFilterGreaterThanOrEqual;

	@FindBy(xpath = "(//div[@ref='eWrapper']/input[@ref='eInput' and @type='number'])[1]")
	public UnityWebElement menuFilterNumberBox1;

	@FindBy(xpath = "(//div[@ref='eWrapper']/input[@ref='eInput' and @type='number'])[2]")
	public UnityWebElement menuFilterNumberBox2;

	@FindBy(xpath = "(//div[@ref='eWrapper']/input[@ref='eInput' and @type='number'])[3]")
	public UnityWebElement menuFilterNumberBox3;

	@FindBy(xpath = "//div[label[text()='OR']][div/input[@type='radio']]")
	public UnityWebElement menuFilterORRadioButton;

	@FindBy(xpath = "//div[span[text()='Cash Amount']]")
	public UnityWebElement columnCashAmount;

	@FindBy(xpath = "//div[label[text()='OR']][div/input[@type='radio']]")
	public UnityWebElement radioButtonOR;

	@FindBy(xpath = "//span[normalize-space(text())='Active E-Mail Address']")
	public UnityWebElement labelActiveEmailAddressKey;

	@FindBy(xpath = "//p[@id='account-portfolio-details']//strong")
	public UnityWebElement labelAccountPortfolio;

	@FindBy(xpath = "//div[span[text()='Cash Amount']]/preceding-sibling::span/*")
	public UnityWebElement menuCashAmount;

	@FindBy(xpath = "//div[@role='grid']")
	public UnityGridElement gridClientReminder;

	@FindBy(xpath = "//span[contains(text(),'Event Name')]")
	public UnityWebElement columnEventName;
	
	@FindBy(xpath = "//div[@role='grid']")
	public UnityGridElement gridClientEvents;

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

	public void selectSourcePortfolio(String portfolio) {
		if (dropdownViewBy.isPresent()) {
			dropdownViewBy.click();
			UnityUtils.wait(2000);
		}

		if (radioButtonPortfolioRelationships.isPresent()) {
			radioButtonPortfolioRelationships.click();
			UnityUtils.wait(2000);
		}
		if (radioButtonPortfolio.isPresent()) {
			radioButtonPortfolio.click();
			UnityUtils.wait(2000);
		}
		if (dropdownPortfolioPanel.isPresent()) {
			dropdownPortfolioPanel.click();
			UnityUtils.wait(2000);
		}
		textboxSearch.click();
		panelPortfolioOptions.waitforVisible();
		panelPortfolioOptions.findElement(By.xpath(".//span[contains(text(),'" + portfolio + "')]")).click();
		if (buttonSelect.isPresent()) {
			buttonSelect.click();
			UnityUtils.wait(2000);
		}
	}

	public void selectClient(String client) {
		dropdownClient.click();
		dropdownClient.sendKeys(client);
		optionsClient.waitforVisible();
		UnityUtils.wait(5000);
		optionsClient.findElement(
				By.xpath("//div[contains(@id,'ClientRadComboBox_DropDown')]//li//tr[td[normalize-space(text())='"
						+ client + "']]"))
				.click();
	}

	public void selectAccount(String account) {
		dropdownAccount.click();
		dropdownAccount.sendKeys(account);
		UnityUtils.wait(5000);
		optionsAccount.waitforVisible();
		optionsAccount.findElement(By.xpath("//li[//td[normalize-space(text())='" + account + "']]")).click();
	}

	public void waitForGridToLoad(UnityGridElement grid) {
		super.isPageLoaded(driver);
		grid.waitforVisible();
	}

	public void verifyMultiplePayee() {
		List<WebElement> linkActions = gridPayees.findElements(By.xpath(".//span[normalize-space(text())='Actions']"));
		Assert.assertTrue(linkActions.size() > 1, "Multiple Payees are not present in grid");
		linkActions.get(0).click();
		List<WebElement> linkDelete = driver.findElements(By.xpath("//span[normalize-space(text())='Delete']"));
		Assert.assertTrue(!linkDelete.isEmpty(), "Delete option is not present");
		labelDelete.waitforVisible();
		linkDelete.get(linkDelete.size() - 1).click();

	}

	public List<String> selectColumnsInGrid(UnityWebElement... checkboxes) {
		List<String> chekedCheckboxes = new ArrayList<>();
		List<WebElement> checkboxList = driver.findElements(By.xpath("//md-checkbox"));
		int checkboxesSize = checkboxList.size();
		for (int i = 0; i < checkboxesSize; i++) {
			if (checkboxList.get(i).getAttribute("aria-checked").equalsIgnoreCase("true")) {
				checkboxList.get(i).click();
			}
		}

		List<String> expectedColumnNames = new ArrayList<>();
		for (UnityWebElement checkbox : checkboxes) {
			expectedColumnNames.add(checkbox.getAttribute("aria-label"));
		}

		List<String> actualColumnNames = new ArrayList<>();
		for (WebElement header : gridHeaders) {
			actualColumnNames.add(header.getText());
		}

		if (!actualColumnNames.containsAll(expectedColumnNames)) {
			for (String actual : expectedColumnNames) {
				if (driver.findElement(By.xpath("//md-checkbox[@aria-label='" + actual + "']"))
						.getAttribute("aria-checked").equalsIgnoreCase("false")) {
					driver.findElement(By.xpath("//md-checkbox[@aria-label='" + actual + "']")).click();
				}
			}
			chekedCheckboxes = getListOfCheckedCheckboxes();
			buttonSaveFilterGrid.click();
		}
		return chekedCheckboxes;
	}

	public void selectColumnInGrid(String checkboxName) {
		WebElement checkbox = driver.findElement(By.xpath(
				"//mat-checkbox//span[normalize-space(text())='" + checkboxName + "']//preceding-sibling::div/input"));
		if (checkbox.getAttribute("aria-checked").equalsIgnoreCase("false")) {
			checkbox.click();
		}
	}

	public List<String> getListOfCheckedCheckboxes() {
		List<WebElement> checkedCheckboxes = driver.findElements(By.xpath("//md-checkbox[@aria-checked='true']"));
		List<String> checkboxNames = new ArrayList<>();
		if (!checkedCheckboxes.isEmpty()) {
			for (WebElement checkbox : checkedCheckboxes) {
				checkboxNames.add(checkbox.getAttribute("aria-label"));
			}
		}
		return checkboxNames;
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

	public void selectEvent(String event) {
		dropdownEvents.waitforVisible();
		dropdownEvents.click();
		optionsEvents.waitforVisible();
		optionsEvents.findElement(By.xpath("//li[normalize-space(text())='" + event + "']")).click();
	}

}
