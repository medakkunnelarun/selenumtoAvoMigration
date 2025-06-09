package com.unity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.unity.constants.AppConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityWebElement;

import junit.framework.Assert;

public class FormMiscellaneousProcessingPage extends BaseTestPage {

	WebDriver driver;

	public FormMiscellaneousProcessingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}
	
	@FindBy(xpath = "//input[@name='blockNumber']")
	public UnityWebElement lookupBlockNumber;
	
	@FindBy(xpath = "//input[@name='fromWhoReceived']")
	public UnityWebElement textBoxFromWhoReceived;
		
	@FindBy(xpath = "//mat-select[@name='dateOfReceipt@cycleDateMonths']")
	public UnityWebElement lookupDateMonths;
	
	@FindBy(xpath = "//mat-select[@name='dateOfReceipt@cycleDateDays']")
	public UnityWebElement lookupDateDays;
	
	@FindBy(xpath = "//mat-select[@name='dateOfReceipt@cycleDateYears']")
	public UnityWebElement lookupDateYears;
	
	@FindBy(xpath = "//mat-select[@name='dateOfReceipt@cycleDateMinusDays']")
	public UnityWebElement lookupDateMinusDays;
	
	@FindBy(xpath = "//input[@name='dateOfReceipt@cycleDateOccursEvery']")
	public UnityWebElement lookupDateOccursEvery;
	
	@FindBy(xpath = "//mat-select[@name='dateOfReceipt@cycleDateFrequency']")
	public UnityWebElement lookupDateFrequency;
	
	@FindBy(xpath = "//input[@name='principalAmount']")
	public UnityWebElement textboxprincipalAmount;
	
	@FindBy(xpath = "//input[@name='incomeAmount']")
	public UnityWebElement textBoxIncomeAmount;
	
	@FindBy(xpath = "//input[@name='cusipNum']")
	public UnityWebElement textboxCusipNum;
	
	@FindBy(xpath = "//input[@name='principalTaxCode']")
	public UnityWebElement lookupPrincipalTaxCode;
	
	@FindBy(xpath = "//input[@name='incomeTaxCode']")
	public UnityWebElement lookupIncomeTaxCode;
	
	@FindBy(xpath = "//input[@name='incomeCode']")
	public UnityWebElement lookupIncomeCode;
	
	@FindBy(xpath = "//input[@name='fundsCode']")
	public UnityWebElement lookupFundsCode1;
	
	@FindBy(xpath = "//input[@name='taxPartyNumber']")
	public UnityWebElement lookupTaxPartyNumber;
	
	@FindBy(xpath = "//input[@name='manualDescription']")
	public UnityWebElement textboxManualDescription;
	
	@FindBy(xpath = "//input[@name='rcComment1']")
	public UnityWebElement textboxRcComment1;
	
	@FindBy(xpath = "//input[@name='rcComment2']")
	public UnityWebElement textboxRcComment2;
	
	@FindBy(xpath = "//input[@name='rcComment3']")
	public UnityWebElement textboxRcComment3;
	
	@FindBy(xpath = "//input[@name='rcComment4']")
	public UnityWebElement textboxRcComment4;
	
	@FindBy(xpath = "//input[@name='achTransitRoutingCode']")
	public UnityWebElement lookupAchTransitRoutingCode;
	
	@FindBy(xpath = "//mat-select[@name='debitAchAccountType']")
	public UnityWebElement lookupDebitAchAccountType;
	
	@FindBy(xpath = "//mat-select[@name='receiptType']")
	public UnityWebElement lookupReceiptType;
	
	@FindBy(xpath = "//input[@role='switch']")
	public UnityWebElement checkboxClearCycleDate;
	
	@FindBy(xpath = "//mat-select[@name='portfolio']")
	public UnityWebElement dropdownPortfolio;
	
	@FindBy(xpath = "//input[@name='amount']")
	public UnityWebElement textBoxAmount;
	
	@FindBy(xpath = "//input[@name='interest']")
	public UnityWebElement textBoxInterest;
	
	@FindBy(xpath = "//input[@name='transactionDesc']")
	public UnityWebElement textBoxTransactionDesc;
	
	@FindBy(xpath = "//input[@name='payableDate']")
    public UnityWebElement dateNamePayableDate;
	
	@FindBy(xpath = "//input[@name='effectiveDate']")
    public UnityWebElement dateNameEffectiveDate;
	
	@FindBy(xpath = "//input[@name='taxCodeInterest']")
	public UnityWebElement lookupTaxCodeInterest;
	
	
	@FindBy(xpath = "//input[@name='commentLine1']")
	public UnityWebElement textBoxCommentLine1;
	
	@FindBy(xpath = "//input[@name='commentLine2']")
	public UnityWebElement textBoxCommentLine2;
	
	@FindBy(xpath = "//input[@name='commentLine3']")
	public UnityWebElement textBoxCommentLine3;
	
	@FindBy(xpath = "//input[@name='commentLine4']")
	public UnityWebElement textBoxCommentLine4;


	@FindBy(xpath = "//input[@name='holdingDesc']")
    public UnityWebElement lookupHolding;
	
	@FindBy(xpath = "//input[@name='securityGref']")
    public UnityWebElement lookupSecurity;
	
	@FindBy(xpath = "//input[@name='moodys']")
    public UnityWebElement lookupMoodys;
	
	@FindBy(xpath = "//input[@name='standardAndPoors']")
    public UnityWebElement lookupSandPs;
	
	@FindBy(xpath = "//input[@name='minimumDenomination']")
    public UnityWebElement textBoxMinDenom;
    
    @FindBy(xpath = "//input[@name='totalUnits']")
    public UnityWebElement lookupUnits;
    
    @FindBy(xpath = "//input[@name='minorSecurityTypeAbbrev']")
    public UnityWebElement lookUpMinorSecurityType;
    
    @FindBy(xpath = "//input[@name='bankNumber']")
    public UnityWebElement textBoxBankNumber;
    
    @FindBy(xpath = "//textarea[@name='shortDescription']")
    public UnityWebElement textBoxShortDescription;
    
    @FindBy(xpath = "//textarea[@name='longTitle1']")
    public UnityWebElement textBoxLongTitle1;
    
    @FindBy(xpath = "//input[@name='countryOfIssue']")
    public UnityWebElement lookUpCountryOfIssue;
    
    @FindBy(xpath = "//input[@name='countryOfExposure']")
    public UnityWebElement lookUpCountryOfExposure;
      
    @FindBy(xpath = "//input[@name='preferredSupplierAbbrev']Bond Buyer")
    public UnityWebElement lookUpPreferredSupplier;
    
    @FindBy(xpath = "//input[@name='eligibleDepositories1Abbrev']")
    public UnityWebElement lookUpEligibleDepositories1;
    
    @FindBy(xpath = "//input[@name='eligibleDepositories2Abbrev']")
    public UnityWebElement lookUpEligibleDepositories2;
    
    @FindBy(xpath = "//input[@name='eligibleDepositories2Abbrev']")
    public UnityWebElement lookUpEligibleDepositories3;
    
    @FindBy(xpath = "//input[@name='minimumDenomination']")
    public UnityWebElement textBoxMinimumDenomination;
    
    @FindBy(xpath = "//input[@name='requiredMultipleAbbrev']")
    public UnityWebElement lookUpRequiredShareMultiple;
    
    @FindBy(xpath = "//input[@name='payeeOnFileGref']")
    public UnityWebElement textpayeetName;
    
    @FindBy(xpath = "//input[@name='settlementDate']")
    public UnityWebElement dateNameSettlementDate;
    
    @FindBy(xpath = "//input[@name='transactionDate']")
    public UnityWebElement dateNameTransactiontDate;
    
    @FindBy(xpath = "//input[@name='sourcePortfolio']")
    public UnityWebElement lookupSrcPortfolio;


	@FindBy(xpath = "//input[@name='pledgeCode']")
	public UnityWebElement lookUpPledgeCode;

	@FindBy(xpath = "//mat-select[@name='pledgeOrUnpledge']")
	public UnityWebElement dropDownPledgeUnpledge;

	@FindBy(xpath = "//input[@name='unitsOrBook']")
	public UnityWebElement textBoxUnitsBook;
	
	@FindBy(xpath = "//input[@name='cusip']")
	public UnityWebElement lookUpCusip;

	@FindBy(xpath = "//input[@name='ratePerShare']")
	public UnityWebElement textBoxRatePerShare;
	
	@FindBy(xpath = "//input[@name='units']")
	public UnityWebElement textBoxUnits;
	
	@FindBy(xpath = "//input[@name='transactionPostingDate']")
	public UnityWebElement textBoxTransactionPostingDate;
	
	@FindBy(xpath = "//input[@name='sequenceNumber']")
	public UnityWebElement textBoxSequenceNumber;
	
	@FindBy(xpath = "//input[@name='cusip']")
	public UnityWebElement lookupCusip;
	
	@FindBy(xpath = "//input[@name='registration']")
	public UnityWebElement lookupRegistration;
	
	@FindBy(xpath = "//input[@name='taxCode']")
	public UnityWebElement lookupTaxCode;
	
	@FindBy(xpath = "//input[@name='fundsCode']")
	public UnityWebElement lookupFundsCode;
	
	@FindBy(xpath = "//mat-select[@name='portfolioHeldIn']")
	public UnityWebElement dropdownPortfolioHeldIn;
	
	@FindBy(xpath = "//mat-select[@name='portfolioPostedTo']")
	public UnityWebElement dropdownPortfolioPostedTo;
	
	@FindBy(xpath = "//mat-select[@name='feeBase']")
	public UnityWebElement drpDwnFeeBase;

	@FindBy(xpath = "//mat-select[@name='suppressRecordOfChangeFromClientState']")
	public UnityWebElement dropdownSuppressRecordOfChangeFromClientState;
	

	@Override
	public void waitForPageToLoad() {
		startTime = System.currentTimeMillis();
		if (!super.isPageLoaded(driver))
			Assert.fail("Timed out after " + AppConstants.PAGE_LOAD_TIMEOUT + " seconds\n");
	}
}
