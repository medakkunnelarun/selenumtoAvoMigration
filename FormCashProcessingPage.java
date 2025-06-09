package com.unity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.unity.constants.AppConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityWebElement;

public class FormCashProcessingPage extends BaseTestPage {
	WebDriver driver;

	public FormCashProcessingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}
	
	@FindBy(xpath = "//span[normalize-space(text())='Would you like to specify Special Instructions?']/ancestor::mat-checkbox")
    public UnityWebElement checkboxSpecialInstruction;
    
    @FindBy(xpath = "//textarea[@name='specialInstructions']")
    public UnityWebElement TextspecialInstruction;
	
	@FindBy(xpath = "//textarea[@name='accountLegalName']")
    public UnityWebElement textAccountlglName;
    
    @FindBy(xpath = "//input[@name='domicileStateAbbrev']")
    public UnityWebElement dropDowndomicile;
    
    @FindBy(xpath = "//input[@name='anticipatedMarketValueAtOpen']")
    public UnityWebElement textAnticipatemktVal;
    
    @FindBy(xpath = "//input[@name='socialCodeAbbrev']")
    public UnityWebElement dropDownsocialAbbrev;
    
    @FindBy(xpath = "//input[@name='capacityAbbrev']")
    public UnityWebElement dropDowncapacityAbbrev;
    
    @FindBy(xpath = "//input[@name='holdingDesc']")
    public UnityWebElement dropdownHolding;
	
	@FindBy(xpath = "//mat-select[@name='unitOrCashDisb']")
    public UnityWebElement dropDownunitOrCashDisb;
	
	@FindBy(xpath = "//mat-select[@name='disbursingPortfolio']")
	public UnityWebElement DropdownDisbursingPortfolio;
	
	@FindBy(xpath = "//input[@name='principalCashAmountDollar']")
	public UnityWebElement textboxPrincipalCashAmountDollar;

	@FindBy(xpath = ".//*[normalize-space(text())='Dollar']/ancestor::label[@class='mat-radio-label']//input")
	public UnityWebElement radioDollar;
	
	@FindBy(xpath = "//input[@name='recipientNumber']")
	public UnityWebElement lookupRecipientNumber;
	
	@FindBy(xpath = "//textarea[@name='standardDescription']")
	public UnityWebElement textboxStandardDescription;
	
	@FindBy(xpath = "//input[@name='payeeCheck']")
	public UnityWebElement checkboxPayeeCheck;
	
	@FindBy(xpath = "//input[@name='fundsLocationAbbrev']")
	public UnityWebElement lookupFundsLocationAbbrev;
	
	@FindBy(xpath = "//input[@name='name']")
	public UnityWebElement textboxName;
	
	@FindBy(xpath = "//input[@name='streetNumber']")
	public UnityWebElement textboxstreetNumber;
	
	@FindBy(xpath = "//input[@name='streetName']")
	public UnityWebElement textboxstreetName;
	
	@FindBy(xpath = "//input[@name='buildingUnit']")
	public UnityWebElement textboxbuildingUnit;
	
	@FindBy(xpath = "//input[@name='buildingName']")
	public UnityWebElement textboxbuildingName;
	
	@FindBy(xpath = "//input[@name='mailingInfo']")
	public UnityWebElement textboxmailingInfo;
	
	@FindBy(xpath = "//textarea[@name='additionalInfo']")
	public UnityWebElement textboxadditionalInfo;
	
	@FindBy(xpath = "//mat-select[@name='selectComponent']")
	public UnityWebElement dropdownSelectComponent;
	
	@FindBy(xpath = "//input[@name='componentValue']")
	public UnityWebElement textboxcomponentValue;
	
	@FindBy(xpath = "//input[@name='city']")
	public UnityWebElement textboxCity;
	
	@FindBy(xpath = "//input[@name='stateAbbrev']")
	public UnityWebElement lookupstateAbbrev;
	
	@FindBy(xpath = "//input[@name='postalCode']")
	public UnityWebElement textboxPostalCode;
	
	@FindBy(xpath = "//input[@name='countryAbbrev']")
	public UnityWebElement lookupCountryAbbrev;
	
	@FindBy(xpath = "//input[@name='accountType']")
	public UnityWebElement lookupAccountType;
	
	@FindBy(xpath = "//input[@name='routingSymbol']")
	public UnityWebElement lookupRoutingSymbol1;
	
	@FindBy(xpath = "//input[@name='accountReferenceNumber']")
	public UnityWebElement textboxAccountReferenceNumber;
	
	@FindBy(xpath = "//input[@name='txnDescriptionAbbrev']")
	public UnityWebElement lookupTxnDescriptionAbbrev;
	
	@FindBy(xpath = "//input[@name='taxCodeAbbrev']")
	public UnityWebElement lookupTaxCodeAbbrev;
	
	@FindBy(xpath = "//textarea[@name='explanation']")
	public UnityWebElement textboxExplanation;
	
	@FindBy(xpath = "//input[@name='taxLotSequenceNumber']")
	public UnityWebElement textboxTaxLotSequenceNumber;

	
	@FindBy(xpath = "//mat-select[@name = 'portfolio']")
	public UnityWebElement drpDwnPortfolio;

	@FindBy(xpath = "//input[@name='employerNum']")
	    public UnityWebElement lookupemployerNum;
	
	@FindBy(xpath = "//input[contains(@name,'transactionPostingDate')]")
	    public UnityWebElement textBoxTxnPostingDate;
	
	@FindBy(xpath = "//input[@name='commentLine3']")
    public UnityWebElement txtCommentLine3;
    
    @FindBy(xpath = "//input[@name='commentLine4']")
    public UnityWebElement txtCommentLine4;

	
	@FindBy(xpath = "//mat-select[@name='revOrAmendTrustAcc']")
	    public UnityWebElement dropDownrevOrAmendTrustAcc;
	
	@FindBy(xpath = "//input[@name='refCpiOnDatedDate']")
    public UnityWebElement Texturefcpi;
	
	@FindBy(xpath = "//input[@name='blockNumber']")
    public UnityWebElement Lookupblocknum;
      
      @FindBy(xpath = "//input[@name='formatNumber']")
    public UnityWebElement Lookupformatnum;
      
      @FindBy(xpath = "//input[@name='numberOfCopies']")
    public UnityWebElement Textnumberofcopies;
      
      @FindBy(xpath = "//input[@name='expirationDate']")
    public UnityWebElement Textexpdate;
      
      @FindBy(xpath = "//input[@name='disposition']")
    public UnityWebElement Lookupdisposition;
      
      @FindBy(xpath = "//input[@name='proofCopySchedules']")
    public UnityWebElement Textproofcopysch;
      
      @FindBy(xpath = "//input[@name='householdNumber']")
    public UnityWebElement Texthousenum;
      
      @FindBy(xpath = "//input[@name='monthsSuppressedFromPrinting']")
    public UnityWebElement Textmonthsuppprint;
	
	@FindBy(xpath = "//input[@name='routingSymbol']")
    public UnityWebElement lookupRoutingSymbol;

    @FindBy(xpath = "//input[@name='accountReferenceNumber']")
    public UnityWebElement TextDDAReferenceNubmer;

    @FindBy(xpath = "//input[@name='payeeGref']")
    public UnityWebElement lookupPayeeName;

    @FindBy(xpath = "//input[@name='depositAccountNumber']")
	public UnityWebElement textboxDepositAccountNumber;
	    
	@FindBy(xpath = "//input[@name='depositAccountType']")
	public UnityWebElement textboxDepositAccountType;
	
	
	@FindBy(xpath = "//input[@name='receivingNameAddress']")
	public UnityWebElement lookupReceivingNameAddress;
	
	@FindBy(xpath = "//input[@name='principalCashAmount']")
	public UnityWebElement textboxprincipalCashAmount;
	
	@FindBy(xpath = "//input[@name='holding']")
    public UnityWebElement lookupholding1;

	@FindBy(xpath = "//input[@name='entitlement']")
    public UnityWebElement lookupPositionEntitlement;
    
    @FindBy(xpath = "//input[@name='newRestriction']")
    public UnityWebElement lookupNewRestriction;

    
	//Received From
    @FindBy(xpath = "//input[@name='secondParty']")
    public UnityWebElement receivedFrom;

    @FindBy(xpath = "//input[@name='dateOfTransaction']")
    public UnityWebElement textBoxSelectDateForTransaction;
    
    @FindBy(xpath = "//input[@name='payorOnFileGref']")
    public UnityWebElement lookupSelectPayor;
    
	@FindBy(xpath = "//textarea[@name='additionalDescriptionPaydown']")
    public UnityWebElement textBoxAdditionalDescriptionPaydown;
	
	@FindBy(xpath = "//input[@name='transferType']")
    public UnityWebElement lookupTransferType;
    
    @FindBy(xpath = "//input[@name='transferAmount']")
    public UnityWebElement textBoxTransferAmount;

    @FindBy(xpath = "//textarea[@name='additionalDescription']")
    public UnityWebElement textBoxAdditionalDescription;
    
    @FindBy(xpath = "//input[@name='paymentFrequencyCode']")
    public UnityWebElement lookupPaymentFrequencyCode;
    
    @FindBy(xpath = "//input[@name='paymentFrequencyDay']")
    public UnityWebElement lookupPaymentFrequencyDay;
    
    @FindBy(xpath = "//textarea[@name='standardDescription']")
    public UnityWebElement textareaStandardDescription;
    
    @FindBy(xpath = "//input[@name='recipientNumberRecv']")
    public UnityWebElement lookuprecipientNumberRecv;
    
    @FindBy(xpath = "//input[@name='accountNumberRecv']")
    public UnityWebElement lookupRecvaccountNumber;

    @FindBy(xpath = ".//*[normalize-space(text())='Percent']/ancestor::label[@class='mat-radio-label']//input")
    public UnityWebElement radioPercent;
    
    @FindBy(xpath = "//input[@name='incomeCashAmountPercent']")
    public UnityWebElement textboxIncCashAmtPer;
    
    @FindBy(xpath = "//input[@name='principalCashAmountPercent']")
    public UnityWebElement textboxPreCashAmtPer;
   
    @FindBy(xpath = "//textarea[@name='standardDescription']")
    public UnityWebElement textBoxTransactionDescription;
  
	@FindBy(xpath = "//input[@name='disbursementAmount']")
    public UnityWebElement txtDisbAmount;
    
	@FindBy(xpath = "//input[@name='securityDesc']")
    public UnityWebElement lookupholding;

	@FindBy(xpath = "//input[@name='sourcePortfolio']")
	public UnityWebElement lookupSrcPortfolio;

	@FindBy(xpath = "//input[@name='amount']")
	public UnityWebElement textBoxAmount;
	
	@FindBy(xpath = "//mat-select[@name='receivingPortfolio']")
	public UnityWebElement drpDwnReceivingPortfolio;

	@FindBy(xpath = "//input[@name='sequenceNumber']")
	public UnityWebElement textBoxSequenceNumber;

	@FindBy(xpath = "//input[@name='registerNum']")
	public UnityWebElement lookUpRegisterNum;

	@FindBy(xpath = "//input[@name='disbursingPortfolio']")
	public UnityWebElement lookUpDisbursingPortfolio;

	@FindBy(xpath = "//mat-select[@name='suppressOnMasterStatement']")
	public UnityWebElement dropDownSuppressOnMasterStatement;

	@FindBy(xpath = "//input[@name='status']")
	public UnityWebElement lookupStatus;

	@FindBy(xpath = "//input[@name='receiptDate']")
	public UnityWebElement txtBoxReceiptDate;

	// niranjan
	@FindBy(xpath = "//input[@name='securityCusip']")
	public UnityWebElement lookupSecurity;

	@FindBy(xpath = "//input[@name='holdingTypeAbbrev']")
	public UnityWebElement lookupHolding;

	@FindBy(xpath = "//input[@name='capitalGainAbbrev']")
	public UnityWebElement lookupCapGain;

	@FindBy(xpath = "//input[@name='transactionDate']")
	public UnityWebElement textBoxTxnDate;

	@FindBy(xpath = "//input[@name='receivingPortfolio']")
	public UnityWebElement lookupRecPortfolio;

	@FindBy(xpath = "//input[@name='payorOnFileGref']")
	public UnityWebElement lookupPayorOnFile;

	@FindBy(xpath = "//textarea[@name='explanation']")
	public UnityWebElement textBoxExplanation;

	@FindBy(xpath = "//input[@name='accrualCheck']")
	public UnityWebElement checkboxAccrualCheck;

	// abhay
	@FindBy(xpath = "//input[@name='selectPayeeGref']")
	public UnityWebElement lookupPayeeOnFile;

	@FindBy(xpath = "//input[@name='beneficiaryName']")
	public UnityWebElement textBoxBeneName;

	@FindBy(xpath = "//input[@name='receivingBankNum']")
	public UnityWebElement lookupRecBankNum;

	@FindBy(xpath = "//input[@name='beneficiaryAccount']")
	public UnityWebElement textBoxBeneAccount;

	@FindBy(xpath = "//input[@name='originTypeAbbrev']")
	public UnityWebElement lookupOriginType;

	// **abhay
	@FindBy(xpath = "//input[@name='transferToAccount']")
	public UnityWebElement lookupTransferToAccount;

	@FindBy(xpath = "//mat-select[@name='disbursingPortfolio']")
	public UnityWebElement drpDwnDisbursingPortfolio;

	@FindBy(xpath = "//input[@name='disbursementDesc1']")
	public UnityWebElement txtDisbursementDesc1;

	@FindBy(xpath = "//input[@name='disbursementDesc2']")
	public UnityWebElement txtDisbursementDesc2;

	@FindBy(xpath = "//input[@name='receiptDesc1']")
	public UnityWebElement txtReceiptDesc1;

	@FindBy(xpath = "//input[@name='receiptDesc2']")
	public UnityWebElement txtReceiptDesc2;

	@FindBy(xpath = "//input[@name='voucherDescription1']")
	public UnityWebElement txtVoucherDescription1;

	@FindBy(xpath = "//input[@name='voucherDescription2']")
	public UnityWebElement txtVoucherDescription2;

	@FindBy(xpath = "//input[@name='commentLine1']")
	public UnityWebElement txtCommentLine1;

	@FindBy(xpath = "//input[@name='commentLine2']")
	public UnityWebElement txtCommentLine2;

	// **pooja**
	@FindBy(xpath = "//input[@name='documentDestinationAbbrev']")
	public UnityWebElement lookupDocDestination;

	@FindBy(xpath = "//input[@name='payeeGref']")
	public UnityWebElement lookupPayee;

	// **aprajita: TD Forms **
	@FindBy(xpath = "//input[@name='transactionCategory']")
	public UnityWebElement lookupTransactionCategory;

	@FindBy(xpath = "//input[@name='transactionActivity']")
	public UnityWebElement lookupTransactionActivity;

	@FindBy(xpath = "//input[@name='incomeDollar']")
	public UnityWebElement textBoxIncomeCashAmount;
	
	@FindBy(xpath = "//input[@name='incomeCashAmount']")
	public UnityWebElement textBoxIncomeCashAmount1;

	@FindBy(xpath = "//input[@name='principalDollar']")
	public UnityWebElement textBoxPrincipalCashAmount;
	
	@FindBy(xpath = "//input[@name='principalCashAmount']")
	public UnityWebElement textBoxPrincipalCashAmount1;

	@FindBy(xpath = "//input[@name='postingDate']")
	public UnityWebElement textBoxPostingDate;
	
	@FindBy(xpath = "//input[@name='tempPostingDate']")
	public UnityWebElement textBoxTempPostingDate;

	@FindBy(xpath = "//input[@name='transactionReportingCode']")
	public UnityWebElement lookupTransactionReportingCode;

	@FindBy(xpath = "//input[@name='securityNumber']")
	public UnityWebElement lookupSecurityNumber;

	@FindBy(xpath = "//input[@name='typeOfCheckOrFundsType']")
	public UnityWebElement lookupTypeOFCheckFundsType;

	@FindBy(xpath = "//textarea[@name='standardDescription']")
	public UnityWebElement textBoxStandardDescription;

	// **nick**
	@FindBy(xpath = "//mat-select[@name='portfolio']")
	public UnityWebElement dropDownPortfolio;

	@FindBy(xpath = "//input[@name='portfolio']")
	public UnityWebElement lookUpPortfolio;

	@FindBy(xpath = "//input[@name='registerNumber']")
	public UnityWebElement lookUpRegisterNumber;

	@FindBy(xpath = "//input[@name='payableDate']")
	public UnityWebElement textBoxPayableDate;

	@FindBy(xpath = "//input[@name='payee']")
	public UnityWebElement textBoxPayee;

	@FindBy(xpath = "//input[@name='creditTo']")
	public UnityWebElement textBoxCreditTo;

	@FindBy(xpath = "//input[@name='transitRoutingCode']")
	public UnityWebElement lookUpTransitRouting;

	@FindBy(xpath = "//input[@name='principalAmount']")
	public UnityWebElement textBoxPrinAmount;

	@FindBy(xpath = "//input[@name='incomeAmount']")
	public UnityWebElement textBoxIncomeAmount;

	@FindBy(xpath = "//input[@name='secondParty']")
	public UnityWebElement textBoxSecondParty;

	@FindBy(xpath = "//input[@name='disbursementCode']")
	public UnityWebElement lookUpDisbursementCode;

	@FindBy(xpath = "//input[@name='receivingAccount']")
	public UnityWebElement lookUpReceivingAccount;

	@FindBy(xpath = "//input[@name='receivingPortfolio']")
	public UnityWebElement lookUpReceivingPortfolio;

	@FindBy(xpath = "//mat-select[@name='suppressOnMasterStatement']")
	public UnityWebElement dropDownSuppressOnMaster;

	@FindBy(xpath = "//input[@name='effectiveDate']")
	public UnityWebElement textBoxEffectiveDate;

	// **Monika**
	// ACH Disbursement
	@FindBy(xpath = "//input[@name='fundsLocationAbbrev']")
	public UnityWebElement lookupFundsLocation;

	@FindBy(xpath = "//input[@name='payeeOnFileGref']")
	public UnityWebElement lookupSelectPayeeonFile;

	@FindBy(xpath = "//input[@name='accountType']")
	public UnityWebElement dropdownAccountType;

	@FindBy(xpath = "//input[@name='receivingBankABARoutingNumber']")
	public UnityWebElement lookupABARoutingnumber;

	@FindBy(xpath = "//input[@name='accountDDARefNumber']")
	public UnityWebElement textaccountDDARefNumber;

	// **rajat**
	@FindBy(xpath = "//input[@name='registerNumber']")
	public UnityWebElement lookupSrcRegisterNumber;

	@FindBy(xpath = "//input[@name='payableDate']")
	public UnityWebElement txtSrcpayableDate;

	@FindBy(xpath = "//mat-select[@name='portfolio']/div/div[2]/div")
	public UnityWebElement dropdownPortfolioIncome;

	@FindBy(xpath = "//input[@name='amount']")
	public UnityWebElement txtAmount;

	@FindBy(xpath = "//input[@name='creditToAccount']")
	public UnityWebElement txtSrccreditToAccount;

	@FindBy(xpath = "//input[@name='transitRoutingCode']")
	public UnityWebElement lookupSrctransitRoutingCode;

	@FindBy(xpath = "//mat-select[@name='receivingAccountType']/div/div[2]/div")
	public UnityWebElement dropdownreceivingAccountType;

	@FindBy(xpath = "//input[@name='payee']")
	public UnityWebElement txtPayee;

	@FindBy(xpath = "//input[@name='addressLine1']")
	public UnityWebElement txtAddLine1;

	@FindBy(xpath = "//mat-select[@name='feeBase']/div/div[2]/div")
	public UnityWebElement dropdownFeeBase;

	@FindBy(xpath = "//input[@name='disbursementCode']")
	public UnityWebElement lookupSrcDisbursementCode;

	@FindBy(xpath = "//input[@name='taxCode']")
	public UnityWebElement lookupSrctaxCode;

	@FindBy(xpath = "//input[@name='dispositionCode']")
	public UnityWebElement lookupSrcdispositionCode;

	@FindBy(xpath = "//input[@name='fundsCode']")
	public UnityWebElement lookupSrcfundsCode;

	@FindBy(xpath = "//input[@name='effectiveDate']")
	public UnityWebElement txtSrceffectiveDate;

	@FindBy(xpath = "//input[@name='addressTypeAbbrev']")
	public UnityWebElement lookupSrcAddressType;

	@FindBy(xpath = "//input[@name='cityName']")
	public UnityWebElement txtCity;

	@FindBy(xpath = "//input[@name='stateAbbrev']")
	public UnityWebElement lookupSrcstateAbbrev;

	@FindBy(xpath = "//input[@name='postalCode']")
	public UnityWebElement txtzipCode;

	@FindBy(xpath = "//input[@name='countryAbbrev']")
	public UnityWebElement lookupSrccountryAbbrev;

	// **rohini**
	// Scheduled ACH Receipt
	@FindBy(xpath = "//input[@name='checkGenerationDays']")
	public UnityWebElement txtBoxCheckGenerationDays;

	@FindBy(xpath = "//input[@name='bankRoutingNumber']")
	public UnityWebElement txtBoxBankRoutingNumber;

	@FindBy(xpath = "//input[@name='paymentGenerationDays']")
	public UnityWebElement txtBoxpaymentGenerationDays;

	@FindBy(xpath = "//input[@name='paymentDate']")
	public UnityWebElement txtBoxPaymentDate;

	@FindBy(xpath = "//input[@name='achAccountNumber']")
	public UnityWebElement txtBoxACHAccountNumber;

	// **pooja**
	@FindBy(xpath = "//label[contains(text(),'Portfolio Number')]")
	public UnityWebElement lookupPortfolioNumber;

	@FindBy(xpath = "//input[@name='principalAmount']")
	public UnityWebElement textboxPrincipalAmount;

	@FindBy(xpath = "//input[@name='payeeParty']")
	public UnityWebElement lookupPyeeParty;

	// AD_Note Mortgage Payment
	@FindBy(xpath = "//input[@name='cusip']")
	public UnityWebElement lookupCusip;

	@FindBy(xpath = "//mat-select[@name='suppressOnMasterStatements']")
	public UnityWebElement dropdownSuppressOnMasterStatements;

	// **monika**
	@FindBy(xpath = "//input[@name='incomeCashAmountDollar']")
	public UnityWebElement textboxIncCashAmount;

	@FindBy(xpath = "//input[@name='payeeClient']")
	public UnityWebElement lookupPayeeClient;

	@FindBy(xpath = "//input[@name='payeeNameAddressCode']")
	public UnityWebElement lookupPayeeNameAdd;

	@FindBy(xpath = "//*[@name='payeeDescription' and @readonly='true']")
	public UnityWebElement textAreaPayeeDescription;

	@FindBy(xpath = "//label[.//*[normalize-space(text())='Current Processing Date']]")
	public UnityWebElement labelCurrProcessDate;

	@FindBy(xpath = "//input[@name='payeeNameAddress']")
	public UnityWebElement lookupPayeeAddress;

	// **Praveena**
	// Pending transfer between two accounts
	@FindBy(xpath = "//input[@name='Dollar or Percent']")
	public UnityWebElement checkBoxDollarorPercent;

	@FindBy(xpath = "//input[contains(@id,'DOLLAR PAYMENT')]")
	public UnityWebElement checkBoxDollar;

	@FindBy(xpath = "//input[@name='incomeCashAmountDollar']")
	public UnityWebElement textBoxIncomeCashAmountDollar;

	@FindBy(xpath = "//input[@name='principalCashAmountDollar']")
	public UnityWebElement textBoxPrincipalCashAmountDollar;

	@FindBy(xpath = "//input[@name='accountNumberRecv']")
	public UnityWebElement lookupAccountNumberRecv;

	@FindBy(xpath = "//input[@name='cashTypeRecv']")
	public UnityWebElement lookupCashTypeRecv;
	
	@FindBy(xpath = "//input[@name='transactionReportingCode']")
	public UnityWebElement lookupTransactionReportingCodes;

	// **rohini**
	// Scheduled ACH Receipt
	@FindBy(xpath = "//input[@name='checkGenerationDays']")
	public UnityWebElement textBoxCheckGenerationDays;

	@FindBy(xpath = "//input[@name='bankRoutingNumber']")
	public UnityWebElement textBoxBankRoutingNumber;

	@FindBy(xpath = "//input[@name='paymentGenerationDays']")
	public UnityWebElement textBoxPaymentGenerationDays;

	@FindBy(xpath = "//input[@name='paymentDate']")
	public UnityWebElement textBoxPaymentDate;

	@FindBy(xpath = "//input[@name='department']")
	public UnityWebElement textBoxDepartment;

	@FindBy(xpath = "//input[@name='achAccountNumber']")
	public UnityWebElement textBoxACHAccountNumber;

	@FindBy(xpath = "//input[@name='achAccountType']")
	public UnityWebElement dropDownACHAccountType;
	
	@Override
	public void waitForPageToLoad() {
		startTime = System.currentTimeMillis();
		if (!super.isPageLoaded(driver))
			Assert.fail("Timed out after " + AppConstants.PAGE_LOAD_TIMEOUT + " seconds\n");
	}
}
