package com.unity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.unity.constants.AppConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityWebElement;

import junit.framework.Assert;

public class FormTradeActivityPage extends BaseTestPage {

	WebDriver driver;

	public FormTradeActivityPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}
	
	@FindBy(xpath = "//mat-select[@name='portfolio']")
	public UnityWebElement dropDownPortfolio;
	
	@FindBy(xpath = "//input[@name='oidPer1000FaceValue']")
	public UnityWebElement txtoidPer1000FaceValue;
	              
	@FindBy(xpath = "//input[@name='ratableDailyOidFirstPeriod']")
	 public UnityWebElement txtRatableDailyOidFirstPeriod;
	              
	@FindBy(xpath = "//input[@name='ratableDailyOidSecondPeriod']")
	 public UnityWebElement TxtRatableDailyOidSecondPeriod;
	
	@FindBy(xpath = "//input[@name='underlyingCusipNumber']")
	public UnityWebElement lookupUnderlyingCusipNumber;


	//@FindBy(xpath = "//mat-select[@name='feeBase']")
	//public UnityWebElement drpDwnFeeBase;
	
	@FindBy(xpath = "//input[@name='ratableDailyOidThirdPeriod']")
    public UnityWebElement ratableDailyOidThirdPeriod;
	
	@FindBy(xpath = "//mat-select[@name='variableNoteSecurity']/div/div[2]/div")
    public UnityWebElement dropdownVariableNote;
	
	@FindBy(xpath = "//input[@name='interest']")
    public UnityWebElement textboxInterest;
	
	@FindBy(xpath = "//input[@name='payableDate']")
	public UnityWebElement textBoxPayableDate;
	
	@FindBy(xpath = "//input[@name='numberOfSharesPerContract']")
    public UnityWebElement textboxNumberOfSharesPerContract;
	
	@FindBy(xpath = "//mat-select[@name='optionType']/div/div[2]/div")
    public UnityWebElement dropdownOptionType;
	
	@FindBy(xpath = "//input[@name='mbsCode']")
    public UnityWebElement textboxMbsCode;
	
	@FindBy(xpath = "//input[@name='currentFactor']")
    public UnityWebElement textboxCurrentFactor;
	
	@FindBy(xpath = "//input[@name='poolNumber']")
    public UnityWebElement textboxPoolNumber;
	
	@FindBy(xpath = "//input[@name='strikePrice']")
    public UnityWebElement strikePrice;
	
	@FindBy(xpath = "//mat-select[@name='putOrCall']/div/div[2]/div")
    public UnityWebElement dropdownPutOrCall;
	
	@FindBy(xpath = "//input[@name='holdingGref']")
	public UnityWebElement lookupHoldingGref;
	
	@FindBy(xpath = "//input[@name='amount']")
	public UnityWebElement lookupAmount;

	// *****nick******
	@FindBy(xpath = "//input[@name='sourcePortfolio']")
	public UnityWebElement lookupPortfolio;

	@FindBy(xpath = "//mat-option[div[normalize-space(text())='12345-00/9.1']]")
	public UnityWebElement toClickPortfolio;

	@FindBy(xpath = "//input[@name='holdingDesc']")
	public UnityWebElement lookupHolding;

	@FindBy(xpath = "//mat-option[div[normalize-space(text())='Dreyfus Municipal Income Inc.']]")
	public UnityWebElement toClickHolding;

	@FindBy(xpath = "//input[@name='units']")
	public UnityWebElement textBoxUnits;

	@FindBy(xpath = "//input[@name='price']")
	public UnityWebElement textBoxPrice;

	@FindBy(xpath = "//input[@name='contractualSettlementDate']")
	public UnityWebElement textBoxContractualSettlementDate;

	@FindBy(xpath = "//input[@name='brokerId']")
	public UnityWebElement lookupBrokerId;

	@FindBy(xpath = "//mat-option[div[normalize-space(text())='33101']]")
	public UnityWebElement toClickBrokerOptionSell;

	@FindBy(xpath = "//input[@name='traderAbbrev']")
	public UnityWebElement textBoxTrader;

	@FindBy(xpath = "//mat-option[div[normalize-space(text())='JMM']]")
	public UnityWebElement toClickTraderOption;

	@FindBy(xpath = "//input[@name='portfolio']")
	public UnityWebElement dropDownPortfolio1;

	@FindBy(xpath = "//input[@name='cusip']")
	public UnityWebElement lookUpCUSIP;

	@FindBy(xpath = "//input[@name='tradeDate']")
	public UnityWebElement textBoxTradeDate;

	@FindBy(xpath = "//input[@name='fundsCode']")
	public UnityWebElement lookUpFundsCode;

	@FindBy(xpath = "//input[@name='purchasePrice']")
	public UnityWebElement textBoxPurchasePrice;

	@FindBy(xpath = "//input[@id='control1596477132654-input']")
	public UnityWebElement checkBoxDoYouKnowGrossAnmount;

	@FindBy(xpath = "//input[@name='grossAmount']")
	public UnityWebElement textBoxGrossAmount;

	@FindBy(xpath = "//input[@id='control1596477132658-input']")
	public UnityWebElement checkBoxDoYouWantToEnterGrossDetails;

	@FindBy(xpath = "//input[@name='brokerPostage']")
	public UnityWebElement textBoxBrokerPostage;

	@FindBy(xpath = "//input[@name='commission']")
	public UnityWebElement textBoxCommission;

	@FindBy(xpath = "//input[@name='miscExpense']")
	public UnityWebElement textBoxMiscExpense;

	@FindBy(xpath = "//input[@name='secFee']")
	public UnityWebElement textBoxSecFee;

	@FindBy(xpath = "//input[@name='nyTransfer']")
	public UnityWebElement textBoxNYTransfer;

	@FindBy(xpath = "//input[@name='levyFees']")
	public UnityWebElement textBoxLevyFees;

	@FindBy(xpath = "//input[@id='control1600083481253-input']")
	public UnityWebElement checkBoxPostAsMemo;

	@FindBy(xpath = "//input[@name='netAmount']")
	public UnityWebElement textBoxNetAmt;

	@FindBy(xpath = "//input[@name='taxLotAbbrev']")
	public UnityWebElement textBoxTaxLot;

	@FindBy(xpath = "//input[@id='control1596477132668-input']")
	public UnityWebElement checkBoxClearingBroker;

	@FindBy(xpath = "//input[@name='clearingBrokerId']")
	public UnityWebElement lookupClearingBrokerId;

	@FindBy(xpath = "//mat-option[div[normalize-space(text())='4300']]")
	public UnityWebElement toClickClearingBrokerOptionSell;

	@FindBy(xpath = "//input[@id='control1596477132684-input']")
	public UnityWebElement checkBoxSpecialInstructions;

	@FindBy(xpath = "//input[@name='specialInstructions']")
	public UnityWebElement textBoxSpecialInstructions;

	@FindBy(xpath = "//input[@name='entitlement']")
	public UnityWebElement textBoxEntitlement;

	// **rohini** Security Buy
	@FindBy(xpath = "//input[@name='security']")
	public UnityWebElement lookupSecurity;

	// **abhay**
	@FindBy(xpath = "//input[@name='broker']")
	public UnityWebElement lookupBroker;

	@FindBy(xpath = "//mat-select[@name = 'feeBase']")
	public UnityWebElement drpDwnFeeBase;
	
	@FindBy(xpath = "//mat-select[@name = 'portfolio']")
	public UnityWebElement drpDwnPortfolio;
	
	@FindBy(xpath = "///input[@name='pricePerUnit']")
	public UnityWebElement lookupPricePerUnit;
	
//		@FindBy(xpath = "//input[@name='cusip']")
//	public UnityWebElement lookUpCUSIP;
//	
	@FindBy(xpath = "//input[@name='portfolio']")
	public UnityWebElement lookUpPortfolio;
	
//		@FindBy(xpath = "//input[@name='tradeDate']")
//	public UnityWebElement textBoxTradeDate;
//	
//		@FindBy(xpath = "//input[@name='units']")
//	public UnityWebElement textBoxUnits;
	
		@FindBy(xpath = "//input[@name='registration']")
	public UnityWebElement lookUpRegistration;
		
	@FindBy(xpath = "//input[@name='salesPrice']")
	public UnityWebElement textBoxSalesPrice;
	
		@FindBy(xpath = "//input[@name='settlementDate']")
	public UnityWebElement textBoxSettlementDate;	
	
	@FindBy(xpath = "//input[@name='settlementLocation']")
	public UnityWebElement lookUpSettlementLocation;

	@FindBy(xpath = "//input[@name='Originator']")
	public UnityWebElement textBoxOriginator;

	@FindBy(xpath = "//mat-select[@name='receivingPortfolio']")
	public UnityWebElement drpDwnReceivingPortfolio;

	@FindBy(xpath = "//input[@name='sequenceNumber']")
	public UnityWebElement textBoxSequenceNumber;

	@FindBy(xpath = "//input[@name='registerNum']")
	public UnityWebElement lookUpRegisterNum;

	@FindBy(xpath = "//input[@name='disbursingPortfolio']")
	public UnityWebElement lookUpDisbursingPortfolio;
	

	@Override
	public void waitForPageToLoad() {
		startTime = System.currentTimeMillis();
		if (!super.isPageLoaded(driver))
			Assert.fail("Timed out after " + AppConstants.PAGE_LOAD_TIMEOUT + " seconds\n");
	}
}