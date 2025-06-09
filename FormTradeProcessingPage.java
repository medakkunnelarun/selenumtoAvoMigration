package com.unity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.unity.constants.AppConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityWebElement;

import junit.framework.Assert;

public class FormTradeProcessingPage extends BaseTestPage {

	WebDriver driver;

	public FormTradeProcessingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}
	
	@FindBy(xpath = "//input[@name='bookValue']")
	public UnityWebElement textBoxBookValue;
	
	@FindBy(xpath = "//input[@name='salesPrice']")
	public UnityWebElement textBoxSalePrice;
	              
	@FindBy(xpath = "//input[@name='commissions']")
	public UnityWebElement textCommissions;
	              
	@FindBy(xpath = "//input[@name='accruedInterest']")
	public UnityWebElement textAccruedInterest;

	// Locator created by Aprajita ***********
	@FindBy(xpath = "//input[@name='portfolio']")
	public UnityWebElement dropDownPortfolio1;
	
	@FindBy(xpath = "//mat-select[@name='portfolio']")
	public UnityWebElement dropDownPortfolio;
	
	@FindBy(xpath = "//mat-select[@name='portfolio']/div/div[2]/div")
	public UnityWebElement dropdowntblPortfolio;
	
	@FindBy(xpath = "//button//span[contains(text(),'Add Account')]")
	public UnityWebElement buttonAddAccount;
	
	@FindBy(xpath = "//input[@name='account']")
	public UnityWebElement textBoxAccount;
	
	@FindBy(xpath = "//mat-option")
	public UnityWebElement toClickOption;

	@FindBy(xpath = "//mat-option[div[normalize-space(text())='INCOME']]")
	public UnityWebElement toClickPortfolio;

	@FindBy(xpath = "//input[@name='cusip']")
	public UnityWebElement lookUpCUSIP;
	
	@FindBy(xpath = "//input[@name='portfolio']")
    public UnityWebElement lookUpPortfolio;
    
    @FindBy(xpath = "//input[@name='effectiveDate']")
    public UnityWebElement textBoxEffectiveDate;

	@FindBy(xpath = "//mat-option[div[normalize-space(text())='ABAG']]")
	public UnityWebElement toClickCUSIP;

	@FindBy(xpath = "//input[@name='tradeDate']")
	public UnityWebElement txtTradeDate;

	@FindBy(xpath = "//input[@name='fundsCode']")
	public UnityWebElement lookUpFundsCode;

	@FindBy(xpath = "//input[@name='purchasePrice']")
	public UnityWebElement txtPurchasePrice;

	@FindBy(xpath = "//input[@name='units']")
	public UnityWebElement txtUnits;
	
	@FindBy(xpath = "//table//input[@name='totalUnits']")
	public UnityWebElement txtTblTotalUnits;
	
	@FindBy(xpath = "//input[@name='unitsSold']")
	public UnityWebElement txtTblUnits;
	
	@FindBy(xpath = "//input[@name='units']")
	public UnityWebElement txtTblBuyUnits;
	
	@FindBy(xpath = "//input[@name='totalUnits']")
	public UnityWebElement txtTotalUnits;

	@FindBy(xpath = "//input[@name='settlementLocation']")
	public UnityWebElement lookUpSettlementLocation;

	@FindBy(xpath = "//input[@name='registration']")
	public UnityWebElement lookUpRegistration;

	@FindBy(xpath = "//input[@name='clearingBroker']")
	public UnityWebElement lookUpClearingBroker;

	@FindBy(xpath = "//input[@name= 'broker']")
	public UnityWebElement lookUpBroker;

	@FindBy(xpath = "//mat-select[@name='feeBase']/div/div[2]/div")
	public UnityWebElement dropdownFeeBase;

	@FindBy(xpath = "//mat-select[@name='settlementMethod']/div/div[2]/div")
	public UnityWebElement dropdownSettlementMethod;

	@FindBy(xpath = "//mat-select[@name='coveredNonCovered']/div/div[2]/div")
	public UnityWebElement dropdownCoveredNonCovered;

	@FindBy(xpath = "//input[@name='tradeService']")
	public UnityWebElement lookUpTradeService;

	@FindBy(xpath = "//input[@name='otherCharges']")
	public UnityWebElement textBoxOtherCharges;

	@FindBy(xpath = "//input[@name='settlementDate']")
	public UnityWebElement textBoxSettlementDate;

	@FindBy(xpath = "//input[@name='vaultTicketType']")
	public UnityWebElement lookUpVaultTicketType;

	@FindBy(xpath = "//input[@name='pricePerUnit']")
	public UnityWebElement textBoxPricePerUnit;

	@FindBy(xpath = "//input[@name='commissions']")
	public UnityWebElement textBoxCommissions;

	@FindBy(xpath = "//input[@name='specialInstructions1']")
	public UnityWebElement textBoxSpecialInstruction1;

	@FindBy(xpath = "//input[@name='specialInstructions3']")
	public UnityWebElement textBoxSpecialInstruction3;

	@FindBy(xpath = "//input[@name='commentLine2']")
	public UnityWebElement textBoxCommentLine2;

	@FindBy(xpath = "//input[@name='commentLine4']")
	public UnityWebElement textBoxCommentLine4;

	@FindBy(xpath = "//input[@name='proceeds']")
	public UnityWebElement textBoxProceeds;

	@FindBy(xpath = "//input[@name='feesAndPostage']")
	public UnityWebElement textBoxFeesAndPostage;

	@FindBy(xpath = "//input[@name='accruedInterest']")
	public UnityWebElement textBoxAccruedInterest;

	@FindBy(xpath = "//mat-select[@name='lotSelection']")
	public UnityWebElement dropdownLotSelection;

	@FindBy(xpath = "//input[@name='salesPrice']")
	public UnityWebElement textBoxSalesPrice;

	// Deposit
	@FindBy(xpath = "//mat-select[@name='openAccount']")
	public UnityWebElement dropDownOpenAccount;

	@FindBy(xpath = "//mat-select[@name='interestPortfolio']")
	public UnityWebElement dropDownInterestPortfolio;

	@Override
	public void waitForPageToLoad() {
		startTime = System.currentTimeMillis();
		if (!super.isPageLoaded(driver))
			Assert.fail("Timed out after " + AppConstants.PAGE_LOAD_TIMEOUT + " seconds\n");
	}
}