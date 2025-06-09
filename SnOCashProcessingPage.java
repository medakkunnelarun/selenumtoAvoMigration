package com.unity.pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.unity.constants.AppConstants;
import com.unity.constants.DataConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityWebElement;
import com.unity.utilities.UnityUtils;

public class SnOCashProcessingPage extends BaseTestPage {

	WebDriver driver;

	public SnOCashProcessingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}

	// header
	@FindBy(xpath = "//ruf-page-header-title")
	public UnityWebElement headerAccountName;
	
	@FindBy(xpath = "//mat-option[span[normalize-space(text())='One-time payment']]")
    public UnityWebElement optionOnetimePayment;

	@FindBy(xpath = "//iframe[contains(@src,'onetimebillpay')]")
    public UnityWebElement frameonetimebillpay;

	@FindBy(xpath = "//input[contains(@id,'ctlAttachDocument_ctlDocCatType') and @type='text']")
    public UnityWebElement textDocumentCategory;
    
	@FindBy(xpath = "//*[contains(@id,'ctlAttachDocument_ctlDocCatType_DropDown')]")
    public UnityWebElement panelDocumentCategory;
    
	@FindBy(xpath = "//*[contains(@id,'ctlDockDocumentInfo1_C_ctlAttachDocument_ctl00_0')]")
    public UnityWebElement checkboxVendor;
    
	@FindBy(xpath = "//input[contains(@id,'ctlAttachDocument_ctlUpload') and @type='button']")
    public UnityWebElement btnUpload;
    
	@FindBy(xpath = "//iframe[contains(@id,'UploadDocument')]")
    public UnityWebElement frameDocumentType;

	@FindBy(xpath = "//input[contains(@id,'ctlDocumentUpload_ctlDocumentName')]")
    public UnityWebElement txtDocumentName;
    
	@FindBy(xpath = "//textarea[contains(@id,'ctlDocumentUpload_ctlDocumentDescription')]")
    public UnityWebElement txtDocumenttype;
    
	@FindBy(xpath = "//input[contains(@id,'ctlUploadDocument_ctlDocumentUpload_ctlRadUploadfile0')]")
    public UnityWebElement linkChooseFile;
    
	@FindBy(xpath = "//input[contains(@id,'ctlDocumentUpload_ctlUploadBtn') and @type='submit']")
    public UnityWebElement btnSubmit;
    
    
	@FindBy(xpath = "//mat-option[span[normalize-space(text())='Recurring - Ask operator']]")
    public UnityWebElement optionRecurringAskOperator;
    
    
	@FindBy(xpath = "//iframe[contains(@src,'askoperator')]")
    public UnityWebElement frameAskOperator;

	@FindBy(xpath = "//input[contains(@id,'ctlChangeAddresssRequest_ctlVendorChangeAddFormValue_1')]")
    public UnityWebElement radioButtonVendorChange;
    
//	@FindBy(xpath = "//span[contains(@id,'ctlSchedulingInformation_ctlDateStartPicker_dateInput_wrapper')]")
//    public UnityWebElement ;

	@FindBy(xpath = "//span[contains(@id,'ctlSchedulingInformation_ctlDateNextPicker_dateInput_wrapper')]")
    public UnityWebElement dateNextDate;              
    
	@FindBy(xpath = "//input[contains(@id,'ctlSchedulingInformation_ctlFrequencyLookup_ctlCodeFile_Input')]")
    public UnityWebElement textFrequency;
    
	@FindBy(xpath = "//div[contains(@id,'ctlSchedulingInformation_ctlFrequencyLookup_ctlCodeFile_DropDown')]")
    public UnityWebElement panelFrequency;
    
	@FindBy(xpath = "//input[contains(@id,'ctlPaidForLookup_ctlClientRadComboBox_Input')]")
    public UnityWebElement textPaidFor;
    
	@FindBy(xpath = "//div[contains(@id,'ctlPaidForLookup_ctlClientRadComboBox_DropDown')]")
    public UnityWebElement panelPaidFor;
    
	@FindBy(xpath = "//span[contains(@id,'ctlSchedulingInformation_ctlDateNextPicker_dateInput')]")
    public UnityWebElement dateNextDateInput;
    
	@FindBy(xpath = " //span[contains(@id,'ctlSchedulingInformation_ctlDateStartPicker_dateInput')]")
    public UnityWebElement dateStartDateInput;
	
	@FindBy(xpath = "//input[contains(@id,'ctlSourcePortfolioPayee_ctlPortfolioRadComboBox_Input') and @type='text']")
    public UnityWebElement textboxAskSourcePortfolio;
    
	@FindBy(xpath = "//div[contains(@id,'ctlSourcePortfolioPayee_ctlPortfolioRadComboBox_DropDown')]")
    public UnityWebElement panelAskSourcePortfolio;



	@FindBy(xpath = "//mat-select[@aria-label='View by']")
	public UnityWebElement dropdownSelect;

	// dropdown options
	@FindBy(xpath = "//mat-option[span[normalize-space(text())='Disbursement by check']]")
	public UnityWebElement optionDisbursementByCheck;

	@FindBy(xpath = "//mat-option[span[normalize-space(text())='Disbursement by wire']]")
	public UnityWebElement optionDisbursementByWire;

	@FindBy(xpath = "//mat-option[span[normalize-space(text())='Disbursement by ACH']]")
	public UnityWebElement optionDisbursementByACH;

	@FindBy(xpath = "//mat-option[span[normalize-space(text())='Disbursement by SWIFT']]")
	public UnityWebElement optionDisbursementBySWIFT;

	@FindBy(xpath = "//mat-option[span[normalize-space(text())='Disbursement by chips']]")
	public UnityWebElement optionDisbursementByChips;

	// Go screen frames
	@FindBy(xpath = "//iframe[contains(@src,'DisbursementByCheck')]")
	public UnityWebElement frameDisbursementByCheck;

	@FindBy(xpath = "//iframe[contains(@src,'DisbursementByWire')]")
	public UnityWebElement frameDisbursementByWire;

	@FindBy(xpath = "//iframe[contains(@src,'DisbursementByACH')]")
	public UnityWebElement frameDisbursementByACH;

	@FindBy(xpath = "//iframe[contains(@src,'DisbursementBySwift')]")
	public UnityWebElement frameDisbursementBySWIFT;

	@FindBy(xpath = "//iframe[contains(@src,'DisbursementByChips')]")
	public UnityWebElement frameDisbursementByChips;

	@FindBy(xpath = "//iframe[contains(@src,'TransferToAccount')]")
	public UnityWebElement frameTransferToAccount;

	@FindBy(xpath = "//iframe[@name='DocAdd']")
	public UnityWebElement frameAddDocument;
	
	@FindBy(xpath = "//input[@id='ctl01_FxTransactionsContentPlaceHolder_ctlDisbursementByWire_ctlDockRoutingDetails_C_ctlRoutingDetails_ctlRoutingDetails_ctlWireABALookup_ctlWireABARadComboBox_Input']")
	public UnityWebElement textBoxReceivingBankABARoutingNumberWIRE;
	
	@FindBy(xpath = "//div[@id='ctl01_FxTransactionsContentPlaceHolder_ctlDisbursementByWire_ctlDockRoutingDetails_C_ctlRoutingDetails_ctlRoutingDetails_ctlWireABALookup_ctlWireABARadComboBox_DropDown']")
	public UnityWebElement panelReceivingBankABARoutingWIRE;

	// Frame elements

	@FindBy(xpath = "//input[contains(@id,'DscrtnrPymntYes')]")
	public UnityWebElement radioButtonYesDiscretionaryPayment;

	@FindBy(xpath = "//input[contains(@id,'DscrtnrPymntNo')]")
	public UnityWebElement radioButtonNoDiscretionaryPayment;

	@FindBy(xpath = "//input[contains(@name,'SourcePortfolio') and @type='text']")
	public UnityWebElement textboxSourcePortfolio;

	@FindBy(xpath = "//a[contains(@id,'SourcePortfolio') and contains(@style,'overflow: hidden')]")
	public UnityWebElement dropdownSourcePortfolio;

	@FindBy(xpath = "//*[contains(@id,'ctlSourcePortfolio_ctlPortfolioRadComboBox_DropDown')]")
	public UnityWebElement panelSourcePortfolioOptions;

	@FindBy(xpath = "//input[contains(@name,'CashProcessingControl$ctlAmount') and @type='text']")
	public UnityWebElement textboxEnterAmount;

	@FindBy(xpath = "//input[contains(@id,'ctlCashProcessing_ctlCashProcessingControl_ctlOriginType_ctlCodeFile_Input')]")
	public UnityWebElement dropdownOriginType;

	@FindBy(xpath = "//div[contains(@id,'ctlCashProcessing_ctlCashProcessingControl_ctlOriginType_ctlCodeFile_DropDown')]")
	public UnityWebElement panelOriginType;

	@FindBy(xpath = "//input[contains(@id,'ctlOutputDevice_ctlCodeFile_ctlCodeFile') and @type='text']")
	public UnityWebElement textboxDocumentDestination;

	@FindBy(xpath = "//a[contains(@id,'ctlOutputDevice_ctlCodeFile_ctlCodeFile') and contains(@style,'overflow: hidden')]")
	public UnityWebElement dropdownDocumentDestination;

	@FindBy(xpath = "//*[contains(@id,'ctlOutputDevice_ctlCodeFile_ctlCodeFile_DropDown')]")
	public UnityWebElement panelDocumentDestinationOptions;

	@FindBy(xpath = "//input[contains(@id,'DockPayeeInfo_C_ctlPayeeInformation_ctlPayeeInformation_ctlClients_ctlClientRadComboBox_Input')]")
	public UnityWebElement textboxSelectPayeeOnFile;

	@FindBy(xpath = "//*[contains(@id,'DockPayeeInfo_C_ctlPayeeInformation_ctlPayeeInformation_ctlClients_ctlClientRadComboBox_DropDown')]")
	public UnityWebElement panelSelectPayeeOnFileOptions;

	@FindBy(xpath = "//span[normalize-space(text())='No records to display.']")
	public UnityWebElement labelNoRecordsToDisplay;

	@FindBy(xpath = "//a[@title='Close']")
	public UnityWebElement buttonClose;

	@FindBy(xpath = "//*[@id='ctlSubmit']")
	public UnityWebElement buttonSubmit;

	@FindBy(xpath = "//span[normalize-space(text())='Ticket Submitted']")
	public UnityWebElement labelTicketSubmitted;

	@FindBy(xpath = "//input[@value='Yes']")
	public UnityWebElement buttonYes;

	@FindBy(xpath = "//input[@value='No']")
	public UnityWebElement buttonNo;

	// Transfer Tab elements
	@FindBy(xpath = "//*[div[normalize-space(text())='Disbursement']]")
	public UnityWebElement tabDisbursement;

	@FindBy(xpath = "//button[@id='go-tile-Transfer to account']")
	public UnityWebElement optionTransferToAccount;

	@FindBy(xpath = "//input[contains(@id,'ctlDisbursementByACH_ctlDockRoutingDetails_C_ctlBeneficiaryAccountDDARefNumber')]")
	public UnityWebElement textBoxAccountDDAReferenceNumber;

	@FindBy(xpath = "//input[contains(@id,'_ctlWireABALookup_ctlWireABALookup_ctlWireABARadComboBox_Input')]")
	public UnityWebElement textBoxReceivingBankABARoutingNumber;

	@FindBy(xpath = "//div[contains(@id,'ctlWireABALookup_ctlWireABALookup_ctlWireABARadComboBox_DropDown')]")
	public UnityWebElement panelReceivingBankABARoutingNumber;

	@FindBy(xpath = "//*[contains(@id,'DockTransferToCashProcessing_C_ctlAccountLookup_ctlAccountLookup_ctlAccountRadComboBox_DropDown')]")
	public UnityWebElement panelTransferToAccountOptions;

	@FindBy(xpath = "//input[contains(@id,'_ctlDockRoutingDetails_C_ctlRoutingDetails_ctlRoutingDetails_ctlBeneficiaryNameText')]")
	public UnityWebElement textboxBeneficiaryName;
	
	@FindBy(xpath = "//input[@id='ctl01_FxTransactionsContentPlaceHolder_ctlDisbursementByWire_ctlDockRoutingDetails_C_ctlRoutingDetails_ctlRoutingDetails_ctlBeneficiaryAccountDDARefNumber']")
	public UnityWebElement textBoxBeneficiaryAccountDDAReferenceNumberWIRE;

	@FindBy(xpath = "//mat-select[@placeholder='Select']")
	public UnityWebElement dropdownTransfer;

	@FindBy(xpath = "//span[normalize-space(text())='Transfer to account']")
	public UnityWebElement optionTransfer;

	@FindBy(xpath = "//input[contains(@id,'ctlAccountLookup_ctlAccountLookup_ctlAccountRadComboBox_Input')]")
	public UnityWebElement dropdownTransferToAccount;

	@FindBy(xpath = "//div[contains(@id,'_ctlAccountLookup_ctlAccountLookup_ctlAccountRadComboBox_DropDown')]")
	public UnityWebElement panelTransferToAccount;

	@FindBy(xpath = "//input[@id='ctl01_FxTransactionsContentPlaceHolder_ctlTransferToTrustAccount_ctlDockTransferToCashProcessing_C_ctlTransferToPortfolio_ctlPortfolioLookup_ctlPortfolioRadComboBox_Input']")
	public UnityWebElement dropdownTransferToPortfolio;

	@FindBy(xpath = "//div[contains(@id,'ctlTransferToPortfolio_ctlPortfolioLookup_ctlPortfolioRadComboBox_DropDown')]")
	public UnityWebElement panleTransferToPortfolio;

	// Loading spinner
	@FindBy(xpath = "//div[@id='ctlProcessingMessage']")
	private UnityWebElement ajaxSpinner;

	@FindBy(xpath = "//*[@id=FxTransactionsContentPlaceHolder_ctlDisbursementByCheck_ctlDockAdditInfo_C_ctlClassification_ctlClassificationControl_ctlIRSDistribCode_ctlCodeFile_LoadingDiv]")
	private UnityWebElement labelLoading;

	@FindBy(xpath = "//*[@class='rcbLoading']")
	private UnityWebElement loadingList;

	@FindBy(xpath = "//em[normalize-space(text())='Account Identification']")
	public UnityWebElement lblAccountIdentification;

	@FindBy(xpath = "//*[div[normalize-space(text())='Transfer']]")
	public UnityWebElement tabTransfer;

	@FindBy(xpath = "//*[div[normalize-space(text())='Receipt']]")
	public UnityWebElement tabReceipt;

	@FindBy(xpath = "//mat-option[span[normalize-space(text())='Transfer to account']]")
	public UnityWebElement optionTransferAccount;

	@FindBy(xpath = "//mat-option[span[normalize-space(text())='Cash receipt']]")
	public UnityWebElement optionCashReceipt;

	@FindBy(xpath = "//iframe[contains(@src,'CashReceipt')]")
	public UnityWebElement frameCashReceipt;

	@FindBy(xpath = "//*[contains(@id,'OutputDevice_ctlCodeFile_ctlCodeFile_DropDown')]")
	public UnityWebElement panelSelectDocumentOnFileOptions;

	@FindBy(xpath = "//a//span[normalize-space(text())='Close']")
	public UnityWebElement buttonPopupClose;
	
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
		loadingList.waitforInvisible();
	}

	// public void fillFormDisbursementByCheck(WebDriver driver, Map<String, String>
	// data) {
	// radioButtonNoDiscretionaryPayment.click();
	//
	// textboxSourcePortfolio.sendKeys(data.get(DataConstants.PORTFOLIO_NUMBER));
	// panelSourcePortfolioOptions.waitforVisible();
	// waitForLoading(driver);
	// panelSourcePortfolioOptions
	// .findElements(By.xpath(".//td[normalize-space(text())='" +
	// data.get(DataConstants.PORTFOLIO_NUMBER) + "']")).get(0)
	// .click();
	//
	// textboxEnterAmount.sendKeys(data.get(DataConstants.TRANSACTION_AMOUNT));
	//
	// textboxDocumentDestination.scrollAndClick();
	// textboxDocumentDestination.sendKeys(data.get(DataConstants.DOCUMENT_DESTINATION));
	// waitForLoading(driver);
	// panelDocumentDestinationOptions.waitforVisible();
	// waitForLoading(driver);
	// panelDocumentDestinationOptions
	// .findElements(By.xpath(".//td[normalize-space(text())='" +
	// data.get(DataConstants.DOCUMENT_DESTINATION) + "']")).get(0)
	// .click();
	//
	// textboxSelectPayeeOnFile.sendKeys(data.get(DataConstants.PAYEE_NAME));
	// panelSelectPayeeOnFileOptions.waitforVisible();
	// waitForLoading(driver);
	// panelSelectPayeeOnFileOptions
	// .findElements(By.xpath(".//td[normalize-space(text())='" +
	// data.get(DataConstants.PAYEE_NAME)
	// + "']")).get(0).click();
	// }

	public void fillFormDisbursementByCheck(WebDriver driver, Map<String, String> data) {
		textboxSourcePortfolio.click();
		textboxSourcePortfolio.sendKeys(data.get(DataConstants.PORTFOLIO_NUMBER));
		panelSourcePortfolioOptions.waitforVisible();
		loadingList.waitforVisible();
		waitForLoading(driver);
		panelSourcePortfolioOptions
				.findElements(
						By.xpath(".//td[normalize-space(text())='" + data.get(DataConstants.PORTFOLIO_NUMBER) + "']"))
				.get(0).click();

		textboxEnterAmount.sendKeys(data.get(DataConstants.TRANSACTION_AMOUNT));

		textboxDocumentDestination.sendKeys(data.get(DataConstants.DOCUMENT_DESTINATION));
		panelSelectDocumentOnFileOptions.waitforVisible();
		loadingList.waitforVisible();
		waitForLoading(driver);
		panelSelectDocumentOnFileOptions
				.findElements(By
						.xpath(".//td[normalize-space(text())='" + data.get(DataConstants.DOCUMENT_DESTINATION) + "']"))
				.get(0).click();

		textboxSelectPayeeOnFile.sendKeys(data.get(DataConstants.PAYEE_NAME));
		panelSelectPayeeOnFileOptions.waitforVisible();
		//loadingList.waitforVisible();
		waitForLoading(driver);
		panelSelectPayeeOnFileOptions
				.findElements(By.xpath(".//td[normalize-space(text())='" + data.get(DataConstants.PAYEE_NAME) + "']"))
				.get(0).click();
	}
}
