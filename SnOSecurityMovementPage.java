package com.unity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.unity.constants.AppConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityWebElement;
import com.unity.utilities.UnityUtils;

public class SnOSecurityMovementPage extends BaseTestPage {

	WebDriver driver;

	public SnOSecurityMovementPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}

	// header
	@FindBy(xpath = "//ruf-page-header-title")
	public UnityWebElement headerAccountName;

	// Loading spinner
	@FindBy(xpath = "//div[@id='ctlProcessingMessage']")
	private UnityWebElement ajaxSpinner;

	@FindBy(xpath = "//*[@id=FxTransactionsContentPlaceHolder_ctlDisbursementByCheck_ctlDockAdditInfo_C_ctlClassification_ctlClassificationControl_ctlIRSDistribCode_ctlCodeFile_LoadingDiv]")
	private UnityWebElement labelLoading;

	@FindBy(xpath = "//mat-select[@aria-label='View by']")
	public UnityWebElement dropdownSelect;

	@FindBy(xpath = "//em[normalize-space(text())='Account Identification']")
	public UnityWebElement lblAccountIdentification;

	@FindBy(xpath = "//span[normalize-space(text())='Free delivery of security']")
	public UnityWebElement optionFreeDeliveryOfSecurity;

	// dropdown options
	@FindBy(xpath = "//mat-option[span[normalize-space(text())='Free delivery of security']]")
	public UnityWebElement optionFreeDeliverOfSecurity;

	@FindBy(xpath = "//mat-option[span[normalize-space(text())='Free receipt of security']]")
	public UnityWebElement optionFreeReceiptOfSecurity;

	@FindBy(xpath = "//mat-option[span[normalize-space(text())='Security distribution to account']]")
	public UnityWebElement optionSecurityDistributionToAccount;

	@FindBy(xpath = "//mat-option[span[normalize-space(text())='Pending free delivery of security']]")
	public UnityWebElement optionPendingFreeDeliverToSecurity;

	@FindBy(xpath = "//mat-option[span[normalize-space(text())='Pending free receipt of security']]")
	public UnityWebElement optionPendingReceiptToSecurity;

	@FindBy(xpath = "//iframe[contains(@src,'FreeDeliverSecurity')]")
	public UnityWebElement frameFreeDeliverSecurity;

	@FindBy(xpath = "//iframe[contains(@src,'FreeReceiveSecurity')]")
	public UnityWebElement frameFreeReceiveSecurity;

	@FindBy(xpath = "//input[contains(@id,'ctlSecurityProcessing_ctlPortfolioLookup') and @type='text']")
	public UnityWebElement textboxSourcePortfolio;

	@FindBy(xpath = "//*[contains(@id,'ctlSecurityProcessing_ctlPortfolioLookup_ctlPortfolioRadComboBox_DropDown')]")
	public UnityWebElement panelSourcePortfolioOptions;

	@FindBy(xpath = "//input[contains(@id,'ctlClients_ctlClientRadComboBox_Input')]")
	public UnityWebElement textboxSelectPayeeOnFile;

	@FindBy(xpath = "//div[contains(@id,'ctlClients_ctlClientRadComboBox_DropDown')]")
	public UnityWebElement panelSelectPayeeOnFileOptions;

	@FindBy(xpath = "//input[contains(@id,'ctlDockTxIdent_C_ctlSecurityProcessing_ctlSecurityLookup_ctlSecurityRadComboBox_Input')]")
	public UnityWebElement textboxSecurity;

	@FindBy(xpath = "//*[contains(@id,'ctlDockTxIdent_C_ctlSecurityProcessing_ctlSecurityLookup_ctlSecurityRadComboBox_DropDown')]")
	public UnityWebElement panelSecurityDropdown;

	@FindBy(xpath = "//input[contains(@id,'ctlDockDeliveryInformation_C_ctlReceiptInformation_ctlUnitsText')]")
	public UnityWebElement textboxUnit;

	@FindBy(xpath = "//input[contains(@id,'ctlDockDeliveryInformation_C_ctlReceiptInformation_ctlBookValueText')]")
	public UnityWebElement textboxBookValue;

	@FindBy(xpath = "//input[contains(@id,'ctlDockDeliveryInformation_C_ctlReceiptInformation_ctlCostText')]")
	public UnityWebElement textboxCost;

	@FindBy(xpath = "//input[contains(@id,'ctlCurrentRegistrationCodeFile_ctlCodeFile_Input')]")
	public UnityWebElement textboxCurrentRegistration;

	@FindBy(xpath = "//input[contains(@id,'ctlOwnershipClassificationCodeFile_ctlCodeFile_Input')]")
	public UnityWebElement textboxOwnershipClassification;

	@FindBy(xpath = "//div[contains(@id,'ctlCurrentRegistrationCodeFile_ctlCodeFile_DropDown')]")
	public UnityWebElement dropdownCurrentRegistration;

	@FindBy(xpath = "//div[contains(@id,'ctlReceiptInformation_ctlOwnershipClassificationCodeFile_ctlCodeFile_DropDown')]")
	public UnityWebElement dropdownOwnershipClassification;

	@FindBy(xpath = "//input[contains(@id,'ctlDockDeliveryInformation_C_ctlReceiptInformation_ctlEntitlementDatePicker_dateInput') and not(@type='hidden')]")
	public UnityWebElement textboxEntitlementDate;

	@FindBy(xpath = "//input[contains(@id,'ctlFreeReceiveSecurity_ctlFreeReceiveSecurity_ctlDockDeliveryInformation_C_ctlReceiptInformation_ctlFedAcquisitionDatePicker_dateInput') and not(@type='hidden')]")
	public UnityWebElement textboxFedAcquisitionDate;

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
