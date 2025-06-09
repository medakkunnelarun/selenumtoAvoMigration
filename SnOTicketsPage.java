package com.unity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.unity.constants.AppConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityTableElement;
import com.unity.customelements.UnityWebElement;
import com.unity.utilities.UnityUtils;

public class SnOTicketsPage extends BaseTestPage {

	WebDriver driver;

	public SnOTicketsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}

	// header
	@FindBy(xpath = "//ruf-page-header-title")
	public UnityWebElement headerAccountName;

	@FindBy(xpath = "//mat-select[@aria-label='View by']")
	public UnityWebElement dropdownSelect;

	@FindBy(xpath = "//mat-option[span[normalize-space(text())='Cash']]")
	public UnityWebElement optionCash;

	@FindBy(xpath = "//mat-option[span[normalize-space(text())='Securities']]")
	public UnityWebElement optionSecurities;

	@FindBy(xpath = "//mat-option[span[normalize-space(text())='Transfer all']]")
	public UnityWebElement optionTransferAll;

	// Go screen frames
	@FindBy(xpath = "//iframe[contains(@src,'cashtickets')]")
	public UnityWebElement frameCashTickets;

	@FindBy(xpath = "//iframe[contains(@src,'securitytickets')]")
	public UnityWebElement frameSecurityTickets;

	@FindBy(xpath = "//iframe[contains(@src,'PortfolioTradeHoldings')]")
	public UnityWebElement frameHoldings;

	@FindBy(xpath = "//iframe[contains(@src,'DepartmentalRequest')]")
	public UnityWebElement frameDepartmentalRequest;

	@FindBy(xpath = "//iframe[contains(@src,'UploadDocument')]")
	public UnityWebElement frameDocumentUpload;

	// GO screen elements
	@FindBy(xpath = "//select[contains(@id,'MultipleCashTicket_ctlLPTicketSummaryTop_ctlCurrencyList')]")
	public UnityWebElement dropdownCurrencyCash;

	@FindBy(xpath = "//select[contains(@id,'MultipleCashTicket_ctlLPTicketSummaryTop_ctlCurrencyList')]/option")
	public UnityWebElement optionsCurrencyCash;

	@FindBy(xpath = "//select[contains(@id,'MultipleCashTicket_ctlLPTicketSummaryTop_ctlCurrencyList')]/option[normalize-space(text())='USD']")
	public UnityWebElement optionCurrencyUSDCash;

	@FindBy(xpath = "//select[contains(@id,'AccountClientMaster_ctlMultipleCashTicket_ctlLPTicketSummaryTop_ctlLegalEntityList')]")
	public UnityWebElement dropdownLegalEntityCash;

	@FindBy(xpath = "//select[contains(@id,'MultipleFreeTickets_ctlLPTicketSummaryTop_ctlLegalEntityList')]")
	public UnityWebElement dropdownLegalEntity;

	@FindBy(xpath = "//select[contains(@id,'MultipleCashTicket_ctlLPTicketSummaryTop_ctlLegalEntityList')]/option[normalize-space(text())='WPTUMB']")
	public UnityWebElement optionLegalEntityWPTUMBCash;

	@FindBy(xpath = "//select[contains(@id,'MultipleFreeTickets_ctlLPTicketSummaryTop_ctlLegalEntityList')]/option[normalize-space(text())='NTC']")
	public UnityWebElement optionLegalEntityNTC;

	@FindBy(xpath = "//select[contains(@id,'MultipleFreeTickets_ctlLPTicketSummaryTop_ctlLegalEntityList')]")
	public UnityWebElement dropdownLegalEntitySecurities;

	@FindBy(xpath = "//select[contains(@id,'MultipleFreeTickets_ctlLPTicketSummaryTop_ctlLegalEntityList')]/option[normalize-space(text())='BTC']")
	public UnityWebElement optionLegalEntityBTCSecurities;

	@FindBy(xpath = "//input[contains(@id,'ctlLPDisbursementByCheckAdd_ctlAmount')]")
	public UnityWebElement textboxAmountCash;

	@FindBy(xpath = "//input[contains(@id,'CheckAdd_ctlAccount_ctlAccountLookup_ctlAccountRadComboBox_Input')]")
	public UnityWebElement dropdownAccountCash;

	@FindBy(xpath = "//div[contains(@id,'CheckAdd_ctlAccount_ctlAccountLookup_ctlAccountRadComboBox_DropDown')]")
	public UnityWebElement optionsAccountCash;

	@FindBy(xpath = "//input[contains(@name,'PPendingFreeDeliverOfSecurity$ctlAccount$ctlAccountLookup$ctlAccountRadComboBox')]")
	public UnityWebElement dropdownAccountSecurities;

	@FindBy(xpath = "//div[contains(@id,'PendingFreeDeliverOfSecurity_ctlAccount_ctlAccountLookup_ctlAccountRadComboBox_DropDown')]")
	public UnityWebElement optionsAccountSecurities;

	@FindBy(xpath = "//input[contains(@id,'DisbursementByCheckAdd_ctlSourcePortfolio_ctlPortfolioLookup_ctlPortfolioRadComboBox_Input')]")
	public UnityWebElement dropdownPortfolioCash;

	@FindBy(xpath = "//div[contains(@id,'DisbursementByCheckAdd_ctlSourcePortfolio_ctlPortfolioLookup_ctlPortfolioRadComboBox_DropDown')]")
	public UnityWebElement optionsPortfolioCash;

	@FindBy(xpath = "//input[contains(@id,'Add_C_ctlLPPendingFreeDeliverOfSecurity_ctlSourcePortfolio_ctlPortfolioLookup_ctlPortfolioRadComboBox_Input')]")
	public UnityWebElement dropdownSecurityPortfolioCash;

	@FindBy(xpath = "//div[contains(@id,'PPendingFreeDeliverOfSecurity_ctlSourcePortfolio_ctlPortfolioLookup_ctlPortfolioRadComboBox_DropDown')]")
	public UnityWebElement optionsSecurityPortfolioCash;

	@FindBy(xpath = "//input[contains(@id,'CheckAdd_ctlClientLookup_ctlClientRadComboBox_ctlClientRadComboBox_Input')]")
	public UnityWebElement dropdownPayToCash;

	@FindBy(xpath = "//div[contains(@id,'CheckAdd_ctlClientLookup_ctlClientRadComboBox_ctlClientRadComboBox_DropDown')]")
	public UnityWebElement optionsPayToCash;

	@FindBy(xpath = "//input[contains(@id,'AccountClientMaster_ctlMultipleCashTicket_ctlDockAdd_C_ctlAddDisbByCheck')]")
	public UnityWebElement buttonAddCash;

	@FindBy(xpath = "//input[@value='Submit Work Ticket']")
	public UnityWebElement buttonSubmitWorkTicketCash;

	@FindBy(xpath = "//input[contains(@name,'Add$C$ctlLPPendingFreeDeliverOfSecurity$ctlHoldingSearchLookup$ctlSearchLookup$ctlSearchText')]")
	public UnityWebElement textBoxHolding;

	@FindBy(xpath = "//input[contains(@id,'MultipleFreeTickets_ctlDockAdd_C_ctlLPPendingFreeDeliverOfSecurity_ctlUnitsText')]")
	public UnityWebElement textBoxUnits;

	@FindBy(xpath = "//input[contains(@id,'PPendingFreeDeliverOfSecurity_ctlBroker_ctlBrokerControl_ctlBrokerOfficeLookup_ctlBrokerOfficeRadComboBox_Input')]")
	public UnityWebElement dropdownBrokerID;

	@FindBy(xpath = "//div[contains(@id,'PPendingFreeDeliverOfSecurity_ctlBroker_ctlBrokerControl_ctlBrokerOfficeLookup_ctlBrokerOfficeRadComboBox_DropDown')]")
	public UnityWebElement optionsBrokerID;

	@FindBy(xpath = "//input[@type='image']")
	public UnityWebElement iconImage;

	@FindBy(xpath = "//td[normalize-space(text())='Nik Common Stock']/preceding-sibling::td/input")
	public UnityWebElement radioButtonNikCommonStock;

	@FindBy(xpath = "//td[normalize-space(text())='Cede & Co.']/preceding-sibling::td/input")
	public UnityWebElement radioButtonEntitlementSummary;

	@FindBy(xpath = "//input[@id='ctlSelect']")
	public UnityWebElement buttonSelect;

	@FindBy(xpath = "//input[contains(@id,'MultipleFreeTickets_ctlDockAdd_C_ctlAddPendingFreeDeliver')]")
	public UnityWebElement linkAdd;

	@FindBy(xpath = "//table[@class='rgMasterTable']")
	public UnityTableElement tableSecurity;

	@FindBy(xpath = "//a[contains(@id,'ctlComments_ctlCommentsControl_ctlAddComments')]")
	public UnityWebElement linkAddComment;

	@FindBy(xpath = "//div[@class='alertWindow']//div[@class='titleBar']")
	public UnityWebElement labelTicketHeader;

	@FindBy(xpath = "//div[@class='alertWindow']//div[@class='contentArea']")
	public UnityWebElement labelTicketDescription;

	@FindBy(xpath = "//div[@class='buttonArea']//input[@class='primaryButton']")
	public UnityWebElement buttonYes;

	@FindBy(xpath = "//div[@class='buttonArea']//input[@class='transactionButton']")
	public UnityWebElement buttonNo;

	@FindBy(xpath = "//mat-option[span[normalize-space(text())='Departmental request']]")
	public UnityWebElement optionDepartmentalRequest;

	@FindBy(xpath = "//textarea[contains(@id,'GeneralInquiry_ctlComments')]")
	public UnityWebElement textGeneralEnquiry;

	@FindBy(xpath = "//input[@value='Save']")
	public UnityWebElement buttonSave;

	@FindBy(xpath = "//input[contains(@id,'AttachDocumentList_ctlDockDocumentInfo1_C_ctlAttachDocument_ctlDocCatType_Input')]")
	public UnityWebElement dropdownDocumentCategory;

	@FindBy(xpath = "//li[normalize-space(text())='Contractual']")
	public UnityWebElement optionContractual;

	@FindBy(xpath = "//label[normalize-space(text())='test']/preceding-sibling::input")
	public UnityWebElement checkboxTest;

	@FindBy(xpath = "//label[normalize-space(text())='Passport']/preceding-sibling::input")
	public UnityWebElement checkboxPassport;

	@FindBy(xpath = "//input[@value='Upload']")
	public UnityWebElement buttonUpload;

	@FindBy(xpath = "//input[contains(@id,'DocumentUpload_ctlDocumentName')]")
	public UnityWebElement textboxDocumentName;

	@FindBy(xpath = "//textarea[contains(@id,'DocumentUpload_ctlDocumentDescription')]")
	public UnityWebElement textboxDocumentDescription;

	@FindBy(xpath = "//input[contains(@id,'ctlDocumentUpload_ctlUploadBtn')]")
	public UnityWebElement buttonDocumentUpload;

	@FindBy(xpath = "//table[contains(@id,'Documents_ctlDocuments_ctlGenericGrid_ctl00')]")
	public UnityTableElement tableDocuments;

	@FindBy(xpath = "//th[normalize-space(text())='Document Description']")
	public UnityWebElement labelDocumentName;

	// Loading spinner
	@FindBy(xpath = "//div[@id='ctlProcessingMessage']")
	public UnityWebElement ajaxSpinner;

	@FindBy(xpath = "//*[@id=FxTransactionsContentPlaceHolder_ctlDisbursementByCheck_ctlDockAdditInfo_C_ctlClassification_ctlClassificationControl_ctlIRSDistribCode_ctlCodeFile_LoadingDiv]")
	public UnityWebElement labelLoading;

	// transfer All
	@FindBy(xpath = "//input[contains(@id,'ctlTransferFromPortfolio_ctlPortfolioLookup_ctlPortfolioRadComboBox_Input')]")
	public UnityWebElement dropdownSourcePortfolio;

	@FindBy(xpath = "//div[contains(@id,'ctlTransferFromPortfolio_ctlPortfolioLookup_ctlPortfolioRadComboBox_DropDown')]")
	public UnityWebElement optionsSourcePortfolio;

	@FindBy(xpath = "//input[contains(@id,'ctlTransferTo_ctlDockPortfolio_C_ctlAccountLookup_ctlAccountLookup_ctlAccountRadComboBox_Input')]")
	public UnityWebElement dropdownDestinationAccount;

	@FindBy(xpath = "//div[contains(@id,'ctlTransferTo_ctlDockPortfolio_C_ctlAccountLookup_ctlAccountLookup_ctlAccountRadComboBox_DropDown')]")
	public UnityWebElement optionsDestinationAccount;

	@FindBy(xpath = "//input[contains(@id,'ctlTransferTo_ctlDockPortfolio_C_ctlTransferToPortfolio_ctlPortfolioLookup_ctlPortfolioRadComboBox_Input')]")
	public UnityWebElement dropdownDestinationPortfolio;

	@FindBy(xpath = "//div[contains(@id,'ctlTransferTo_ctlDockPortfolio_C_ctlTransferToPortfolio_ctlPortfolioLookup_ctlPortfolioRadComboBox_DropDown')]")
	public UnityWebElement optionsDestinationPortfolio;

	@FindBy(xpath = "//td[normalize-space(text())='American Express Co. ip`test']/preceding-sibling::td[1]//input")
	public UnityWebElement checkboxAmericanExpHolding;

	@FindBy(xpath = "//input[@value='Submit Ticket']")
	public UnityWebElement buttonSubmitTicket;

	@FindBy(xpath = "//input[@value='Submit']")
	public UnityWebElement buttonSubmitDepartmentalTicket;

	@FindBy(xpath = "//iframe[contains(@src,'TransferAll')]")
	public UnityWebElement frameTransferAll;

	@FindBy(xpath = "//input[@name='ctl01$FxTransactionsContentPlaceHolder$ctlOrderToBuy$ctlDockTxIdent$C$ctlSecurityProcessing$ctlSecurityProcessing$ctlPortfolioLookup$ctlPortfolioRadComboBox']")
	public UnityWebElement textBoxSourcePortfolio;

	@FindBy(xpath = "//div[contains(@id,'ctlSecurityProcessing_ctlPortfolioLookup_ctlPortfolioRadComboBox_DropDown')]")
	public UnityWebElement dropdownSourcePortfolioOrderToBuy;

	@FindBy(xpath = "//input[contains(@id,'ctlSecurityProcessing_ctlSecurityProcessing_ctlSecurityLookup_ctlSecurityRadComboBox_Input')]")
	public UnityWebElement textBoxSecurity;

	@FindBy(xpath = "//div[contains(@id,'ctlSecurityProcessing_ctlSecurityProcessing_ctlSecurityLookup_ctlSecurityRadComboBox_DropDown')]")
	public UnityWebElement dropdownSecurity;

	@FindBy(xpath = "//input[contains(@name,'ctlOrderToBuy$ctlDockOrderDetails$C$ctlOrderDetails$ctlUnits')]")
	public UnityWebElement textBoxOrderToBuyUnits;

	@FindBy(xpath = "//input[@value='Submit' and @type='button']")
	public UnityWebElement buttonSubmit;

	@Override
	public void waitForPageToLoad() {
		startTime = System.currentTimeMillis();
		if (super.isPageLoaded(driver))
			try {
				headerAccountName.waitforVisible(AppConstants.PAGE_LOAD_TIMEOUT);
				endTime = System.currentTimeMillis();
				pageLoadTime = (endTime - startTime) / 1000;
			} catch (Exception e) {
				Assert.fail("Expected page did not load\n");
			}
		else {
			Assert.fail("Timed out after " + AppConstants.PAGE_LOAD_TIMEOUT + " seconds\n");
		}
	}

	public void waitForLoading(WebDriver driver) {
		super.waitforAjaxtoComplete(driver);
		UnityUtils.wait(2000);
		ajaxSpinner.waitforInvisible();
		labelLoading.waitforInvisible();
	}
}
