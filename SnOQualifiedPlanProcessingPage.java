package com.unity.pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.unity.constants.AppConstants;
import com.unity.constants.DataConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityTableElement;
import com.unity.customelements.UnityWebElement;
import com.unity.utilities.UnityUtils;

public class SnOQualifiedPlanProcessingPage extends BaseTestPage {

	WebDriver driver;

	public SnOQualifiedPlanProcessingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}

	// header
	@FindBy(xpath = "//ruf-page-header-title")
	public UnityWebElement headerAccountName;

	@FindBy(xpath = "//mat-select[@aria-label='View by']")
	public UnityWebElement dropdownSelect;

	@FindBy(xpath = "//mat-option[span[normalize-space(text())='Distribution by Check']]")
	public UnityWebElement optionDistributionByCheck;

	@FindBy(xpath = "//mat-option[span[normalize-space(text())='Distribution by Wire']]")
	public UnityWebElement optionDistributionByWire;

	@FindBy(xpath = "//mat-option[span[normalize-space(text())='Distribution by ACH']]")
	public UnityWebElement optionDistributionByACH;
	
	@FindBy(xpath = "//button[@id='mat-button-toggle-49-button']")
	public UnityWebElement optionDistribution;

	// Go screen frames
	@FindBy(xpath = "//iframe[contains(@src,'DistributionByCheck')]")
	public UnityWebElement frameDistributionByCheck;

	@FindBy(xpath = "//iframe[contains(@src,'DistributionByWire')]")
	public UnityWebElement frameDistributionByWire;

	@FindBy(xpath = "//iframe[contains(@src,'DistributionByACH')]")
	public UnityWebElement frameDistributionByACH;

	@FindBy(xpath = "//a[@title='Close']")
	public UnityWebElement buttonClose;

	@FindBy(xpath = "//iframe[@name='DocAdd']")
	public UnityWebElement frameAddDocument;

	// GO screen elements
	@FindBy(xpath = "//div[@id='ctl00_ctlCustomDockTepmlate_T']//a")
	public UnityWebElement linkExpandTransactionTemplates;

	@FindBy(xpath = "//div[contains(@id,'TransactionTemplates')]/table[contains(@id,'TransactionTemplates')]")
	public UnityTableElement tableTransactionTemplates;

	@FindBy(xpath = "//div[contains(@id,'TransactionTemplates')]/table[contains(@id,'TransactionTemplates')]//a[normalize-space(text())='Delete']")
	public List<WebElement> linksDeleteTransactionTemplate;

	@FindBy(xpath = "//div[contains(@id,'TransactionTemplates')]/table[contains(@id,'TransactionTemplates')]//*[normalize-space(text())='No records to display.']")
	public UnityWebElement labelNoRecordsToDisplay;

	@FindBy(xpath = "//div/*[normalize-space(text())='Transaction Identification']")
	public UnityWebElement labelTransactionIdentification;

	@FindBy(xpath = "//input[contains(@name,'SourcePortfolio') and @type='text']")
	public UnityWebElement textboxSourcePortfolio;

	@FindBy(xpath = "//a[contains(@id,'SourcePortfolio') and contains(@style,'overflow: hidden')]")
	public UnityWebElement dropdownSourcePortfolio;

	@FindBy(xpath = "//*[contains(@id,'ctlSourcePortfolio_ctlPortfolioRadComboBox_DropDown')]")
	public UnityWebElement panelSourcePortfolioOptions;

	@FindBy(xpath = "//input[contains(@name,'CashProcessingControl$ctlAmount') and @type='text']")
	public UnityWebElement textboxEnterAmount;

	@FindBy(xpath = "//input[contains(@name,'OriginType') and @type='text']")
	public UnityWebElement textboxOriginType;

	@FindBy(xpath = "//a[contains(@id,'OriginType') and contains(@style,'overflow: hidden')]")
	public UnityWebElement dropdownOriginType;

	@FindBy(xpath = "//*[contains(@id,'CashProcessing_ctlCashProcessingControl_ctlOriginType_ctlCodeFile_DropDown')]")
	public UnityWebElement panelOriginType;

	@FindBy(xpath = "//input[contains(@id,'CashProcessingControl_ctlTransactionDatePicker_dateInput') and @type='text']")
	public UnityWebElement textboxSelectDateForTransaction;

	@FindBy(xpath = "//input[contains(@id,'DockPayeeInfo_C_ctlPayeeInformation_ctlPayeeInformation_ctlClients_ctlClientRadComboBox_Input')]")
	public UnityWebElement textboxSelectPayeeOnFile;

	@FindBy(xpath = "//*[contains(@id,'DockPayeeInfo_C_ctlPayeeInformation_ctlPayeeInformation_ctlClients_ctlClientRadComboBox_Arrow')]")
	public UnityWebElement dropdownSelectPayeeOnFile;

	@FindBy(xpath = "//*[contains(@id,'DockPayeeInfo_C_ctlPayeeInformation_ctlPayeeInformation_ctlClients_ctlClientRadComboBox_DropDown')]")
	public UnityWebElement panelSelectPayeeOnFileOptions;

	@FindBy(xpath = "//input[contains(@id,'DockRoutingDetails_C_ctlAccountTypeoption_Input')]")
	public UnityWebElement textboxAccountType;

	@FindBy(xpath = "//*[contains(@id,'DockRoutingDetails_C_ctlAccountTypeoption_Arrow')]")
	public UnityWebElement dropdownAccountType;

	@FindBy(xpath = "//*[contains(@id,'DockPayeeInfo_C_ctlPayeeInformation_ctlPayeeInformation_ctlClients_ctlClientRadComboBox_DropDown')]")
	public UnityWebElement panelAccountType;

	@FindBy(xpath = "//*[contains(@id,'ClassificationControl_ctlBenefitYear')]")
	public UnityWebElement textboxBenefitYear;

	@FindBy(xpath = "//*[contains(@id,'lIRSDistribCode_ctlCodeFile_Input')]")
	public UnityWebElement textboxIrsDistributionCode;

	@FindBy(xpath = "//*[contains(@id,'IRSDistribCode_ctlCodeFile_Arrow')]")
	public UnityWebElement dropdownIrsDistributionCode;

	@FindBy(xpath = "//*[contains(@id,'IRSDistribCode_ctlCodeFile_DropDown')]")
	public UnityWebElement panelIrsDistributionCode;

	@FindBy(xpath = "//input[contains(@name,'BeneficiaryName') and @type='text']")
	public UnityWebElement textboxBeneficiaryName;

	@FindBy(xpath = "//input[contains(@id,'BeneficiaryAddressYes')]")
	public UnityWebElement radioButtonBeneficiaryAddressYes;

	@FindBy(xpath = "//input[contains(@id,'BeneficiaryAddressNo')]")
	public UnityWebElement radioButtonBeneficiaryAddressNo;

	@FindBy(xpath = "//input[contains(@name,'BeneficiaryAccountDDARefNumber') and @type='text']")
	public UnityWebElement textboxBeneficiaryAccountDDAReferenceNumber;

	@FindBy(xpath = "//*[contains(@id,'WireABALookup_ctlWireABARadComboBox_Input')]")
	public UnityWebElement textboxReceivingBankABARoutingNumber;

	@FindBy(xpath = "//*[contains(@id,'WireABALookup_ctlWireABARadComboBox_Arrow')]")
	public UnityWebElement dropdownReceivingBankABARoutingNumber;

	@FindBy(xpath = "//*[contains(@id,'WireABALookup_ctlWireABARadComboBox_DropDown')]")
	public UnityWebElement panelReceivingBankABARoutingNumber;

	@FindBy(xpath = "//*[@id='ctl00_ctlDockDocuments_C_ctlDocuments_ctlAddNew']")
	public UnityWebElement linkAddNewDocument;

	@FindBy(xpath = "//*[@id='ctlSubmit']")
	public UnityWebElement buttonSubmit;

	@FindBy(xpath = "//span[normalize-space(text())='Ticket Submitted']")
	public UnityWebElement labelTicketSubmitted;

	@FindBy(xpath = "//input[@value='Yes']")
	public UnityWebElement buttonYes;

	@FindBy(xpath = "//input[@value='No']")
	public UnityWebElement buttonNo;

	// Add document window links
	@FindBy(xpath = "//*[@id='ContentPlaceHolderPage_ctlDocUpload_ctlDocumentName']")
	public UnityWebElement textBoxDocumentName;

	@FindBy(xpath = "//*[@id='ContentPlaceHolderPage_ctlDocUpload_ctlDocumentDescription']")
	public UnityWebElement textAreaDocumentDescription;

	@FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolderPage_ctlDocUpload_ctlDocCatType_Input']")
	public UnityWebElement dropdownDocumentCategory;

	@FindBy(xpath = "//li[normalize-space(text())='Automation Test 1']")
	public UnityWebElement optionAutomationTest1;

	@FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolderPage_ctlDocUpload_ctlDocTypeCombo_Input']")
	public UnityWebElement dropdownDocumentType;

	@FindBy(xpath = "//li[normalize-space(text())='TXT']")
	public UnityWebElement optionTXT;

	@FindBy(xpath = "//*[@id='ContentPlaceHolderPage_ctlDocUpload_ctlRadUploadfile0']")
	public UnityWebElement buttonChooseFile;

	@FindBy(xpath = "//*[@id='ContentPlaceHolderPage_ctlDocUpload_ctlUploadBtn']")
	public UnityWebElement buttonUpload;

	@FindBy(xpath = "//*[@id='ctl00_ctlDockDocuments_C_ctlDocuments_ctlDocsGrid']")
	public UnityWebElement tableDocuments;

	// Add comment links
	@FindBy(xpath = "//*[@id='ctl00_ctlDockComments_C_ctlComments_ctlCommentsControl_ctlAddComments']")
	public UnityWebElement linkAddComments;

	@FindBy(xpath = "//*[@id='ctl00_ctlDockComments_C_ctlComments_ctlCommentsControl_ctlEnterComments']")
	public UnityWebElement textareaComments;

	@FindBy(xpath = "//*[@id='ctl00_ctlDockComments_C_ctlComments_ctlCommentsControl_btnSaveComment']")
	public UnityWebElement buttonSave;

	@FindBy(xpath = "//*[@id='ctl00_ctl00_ctlDockComments_C_ctlCommentsPanel']/table")
	public UnityTableElement tableComments;

	// Save template links
	@FindBy(xpath = "//input[@id='ctlTemplateName']")
	public UnityWebElement textboxTemplateName;

	@FindBy(xpath = "//a[@id='ctlSaveTemplateLink']")
	public UnityWebElement linkSave;

	@FindBy(xpath = "(//input[contains(@id,'PaymentCntrl_ctlDiscretionaryDatePicker_dateInput')])[1]")
	public UnityWebElement textboxApprovalDate;

	@FindBy(xpath = "//input[contains(@id,'DscrtnrPymntRefNr')]")
	public UnityWebElement textboxReferenceNumber;

	@FindBy(xpath = "//input[contains(@id,'CodeFile_ctlCodeFile_Input')]")
	public UnityWebElement textboxDocumentDestination;

	@FindBy(xpath = "//*[contains(@id,'OutputDevice_ctlCodeFile_ctlCodeFile_DropDown')]")
	public UnityWebElement panelSelectDocumentOnFileOptions;

	// Loading spinner
	@FindBy(xpath = "//div[@id='ctlProcessingMessage']")
	public UnityWebElement ajaxSpinner;

	@FindBy(xpath = "//*[@id=FxTransactionsContentPlaceHolder_ctlDisbursementByCheck_ctlDockAdditInfo_C_ctlClassification_ctlClassificationControl_ctlIRSDistribCode_ctlCodeFile_LoadingDiv]")
	public UnityWebElement labelLoading;

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

	public void fillFormDistributionByCheck(WebDriver driver, Map<String, String> data) {
		textboxSourcePortfolio.sendKeys(data.get(DataConstants.PORTFOLIO_NUMBER));
		panelSourcePortfolioOptions.waitforVisible();
		waitForLoading(driver);
		panelSourcePortfolioOptions
				.findElements(
						By.xpath(".//td[normalize-space(text())='" + data.get(DataConstants.PORTFOLIO_NUMBER) + "']"))
				.get(0).click();

		textboxEnterAmount.sendKeys(data.get(DataConstants.TRANSACTION_AMOUNT));

		textboxSelectPayeeOnFile.sendKeys(data.get(DataConstants.PAYEE_NAME));
		panelSelectPayeeOnFileOptions.waitforVisible();
		waitForLoading(driver);
		panelSelectPayeeOnFileOptions
				.findElements(By.xpath(".//td[normalize-space(text())='" + data.get(DataConstants.PAYEE_NAME) + "']"))
				.get(0).click();

		textboxIrsDistributionCode.sendKeys(data.get(DataConstants.IRS_DISTRIBUTION_CODE));
		panelIrsDistributionCode.waitforVisible();
		waitForLoading(driver);
		panelIrsDistributionCode
				.findElements(By.xpath(
						".//td[normalize-space(text())='" + data.get(DataConstants.IRS_DISTRIBUTION_CODE) + "']"))
				.get(0).click();
	}

	public void fillFormDistributionByWire(WebDriver driver, Map<String, String> data) {
		textboxSourcePortfolio.sendKeys(data.get(DataConstants.PORTFOLIO_NUMBER));
		panelSourcePortfolioOptions.waitforVisible();
		waitForLoading(driver);
		panelSourcePortfolioOptions
				.findElements(
						By.xpath(".//td[normalize-space(text())='" + data.get(DataConstants.PORTFOLIO_NUMBER) + "']"))
				.get(0).click();

		textboxEnterAmount.sendKeys(data.get(DataConstants.TRANSACTION_AMOUNT));

		textboxOriginType.sendKeys(data.get(DataConstants.ORIGIN_TYPE));
		panelOriginType.waitforVisible();
		waitForLoading(driver);
		panelOriginType
				.findElements(By.xpath(".//td[normalize-space(text())='" + data.get(DataConstants.ORIGIN_TYPE) + "']"))
				.get(0).click();

		textboxSelectPayeeOnFile.sendKeys(data.get(DataConstants.PAYEE_NAME));
		panelSelectPayeeOnFileOptions.waitforVisible();
		waitForLoading(driver);
		panelSelectPayeeOnFileOptions
				.findElements(By.xpath(".//td[normalize-space(text())='" + data.get(DataConstants.PAYEE_NAME) + "']"))
				.get(0).click();
		buttonClose.click();

		textboxBeneficiaryName.sendKeys(data.get(DataConstants.BENEFICIARY_NAME));
		radioButtonBeneficiaryAddressYes.click();
		textboxBeneficiaryAccountDDAReferenceNumber.sendKeys(data.get(DataConstants.BENEFICIARY_REFERENCE_NUMBER));

		textboxReceivingBankABARoutingNumber.sendKeys(data.get(DataConstants.RECEIVING_BANK_ABA_ROUTING_NUMBER));
		panelReceivingBankABARoutingNumber.waitforVisible();
		waitForLoading(driver);
		panelReceivingBankABARoutingNumber.findElements(By.xpath(
				".//td[normalize-space(text())='" + data.get(DataConstants.RECEIVING_BANK_ABA_ROUTING_NUMBER) + "']"))
				.get(0).click();

		textboxIrsDistributionCode.sendKeys(data.get(DataConstants.IRS_DISTRIBUTION_CODE));
		panelIrsDistributionCode.waitforVisible();
		waitForLoading(driver);
		panelIrsDistributionCode
				.findElements(By.xpath(
						".//td[normalize-space(text())='" + data.get(DataConstants.IRS_DISTRIBUTION_CODE) + "']"))
				.get(0).click();
	}

	public void fillFormDistributionByACH(WebDriver driver, Map<String, String> data) {
		textboxSourcePortfolio.sendKeys(data.get(DataConstants.PORTFOLIO_NUMBER));
		panelSourcePortfolioOptions.waitforVisible();
		waitForLoading(driver);
		panelSourcePortfolioOptions
				.findElements(
						By.xpath(".//td[normalize-space(text())='" + data.get(DataConstants.PORTFOLIO_NUMBER) + "']"))
				.get(0).click();

		textboxEnterAmount.sendKeys(data.get(DataConstants.TRANSACTION_AMOUNT));

		textboxSelectPayeeOnFile.sendKeys(data.get(DataConstants.PAYEE_NAME));
		panelSelectPayeeOnFileOptions.waitforVisible();
		waitForLoading(driver);
		panelSelectPayeeOnFileOptions
				.findElements(By.xpath(".//td[normalize-space(text())='" + data.get(DataConstants.PAYEE_NAME) + "']"))
				.get(0).click();

		textboxBeneficiaryAccountDDAReferenceNumber.sendKeys(data.get(DataConstants.BENEFICIARY_REFERENCE_NUMBER));
		textboxReceivingBankABARoutingNumber.sendKeys(data.get(DataConstants.RECEIVING_BANK_ABA_ROUTING_NUMBER));
		panelReceivingBankABARoutingNumber.waitforVisible();
		waitForLoading(driver);
		panelReceivingBankABARoutingNumber.findElements(By.xpath(
				".//td[normalize-space(text())='" + data.get(DataConstants.RECEIVING_BANK_ABA_ROUTING_NUMBER) + "']"))
				.get(0).click();

		textboxIrsDistributionCode.sendKeys(data.get(DataConstants.IRS_DISTRIBUTION_CODE));
		panelIrsDistributionCode.waitforVisible();
		waitForLoading(driver);
		panelIrsDistributionCode
				.findElements(By.xpath(
						".//td[normalize-space(text())='" + data.get(DataConstants.IRS_DISTRIBUTION_CODE) + "']"))
				.get(0).click();
	}

	public void waitForLoading(WebDriver driver) {
		super.waitforAjaxtoComplete(driver);
		UnityUtils.wait(10000);
		ajaxSpinner.waitforInvisible();
		labelLoading.waitforInvisible();
	}
}
