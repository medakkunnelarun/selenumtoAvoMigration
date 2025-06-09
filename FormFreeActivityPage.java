package com.unity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.unity.constants.AppConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityWebElement;

import junit.framework.Assert;

public class FormFreeActivityPage extends BaseTestPage {

	WebDriver driver;

	public FormFreeActivityPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}
	
	@FindBy(xpath = "//input[@name='commentLine2']")
	public UnityWebElement textBoxcommentLine2;
	
	@FindBy(xpath = "//input[@name='commentLine3']")
	public UnityWebElement textBoxcommentLine3;
	
	@FindBy(xpath = "//input[@name='commentLine4']")
	public UnityWebElement textBoxcommentLine4;
	
	@FindBy(xpath = "//input[@name='tradeDate']")
	public UnityWebElement textBoxtradeDate;
	
	@FindBy(xpath = "//input[@name='settlementDate']")
	public UnityWebElement textBoxsettlementDate;
	
	@FindBy(xpath = "//mat-select[@name='feeBase']")
	public UnityWebElement dropdownfeeBase;
	
	@FindBy(xpath = "//mat-select[@name='lotSelection']")
	public UnityWebElement dropdownlotSelection;
	
	@FindBy(xpath = "//mat-select[@name='settlementMethod']")
	public UnityWebElement dropdownsettlementMethod;
	
	@FindBy(xpath = "//input[@name='disbursementCode']")
	public UnityWebElement lookupdisbursementCode;
	
	@FindBy(xpath = "//input[@name='settlementLocation']")
	public UnityWebElement lookupsettlementLocation;
	
	@FindBy(xpath = "//input[@name='taxCode']")
	public UnityWebElement lookuptaxCode;
	
	@FindBy(xpath = "//input[@name='clearingBroker']")
	public UnityWebElement lookupclearingBroker;
	
	@FindBy(xpath = "//input[@name='taxParty']")
	public UnityWebElement lookuptaxParty;
	
	@FindBy(xpath = "//input[@name='howAcquired']")
	public UnityWebElement lookuphowAcquired;
	
	@FindBy(xpath = "//input[@name='feeBase']")
	public UnityWebElement lookupfeeBase;
	
	@FindBy(xpath = "//input[@name='fundsCode']")
	public UnityWebElement lookupfundsCode;
	
	@FindBy(xpath = "//input[@name='settlementMethod']")
	public UnityWebElement lookupsettlementMethod;
	
	@FindBy(xpath = "//input[@name='specialInstructions1']")
	public UnityWebElement textBoxspecialInstructions1;
	
	@FindBy(xpath = "//input[@name='commentLine1']")
	public UnityWebElement textBoxcommentLine1;
		
	@FindBy(xpath = "//input[@name='pricePerUnit']")
	public UnityWebElement textBoxpricePerUnit;


	// **nick**
	@FindBy(xpath = "//input[@name='sourcePortfolio']")
	public UnityWebElement lookupPortfolio;
	
	@FindBy(xpath = "//mat-select[@name='portfolio']")
	public UnityWebElement dropdownPortfolioAdv;

	@FindBy(xpath = "//input[@name='holding']")
	public UnityWebElement lookupHolding;

	@FindBy(xpath = "//mat-option[div[normalize-space(text())='Dreyfus Municipal Income Inc.']]")
	public UnityWebElement toClickHolding;

	@FindBy(xpath = "//input[@name='holdingTypeAbbrev']")
	public UnityWebElement lookupHoldingType;

	@FindBy(xpath = "//mat-option[div[normalize-space(text())='0']]")
	public UnityWebElement toClickHoldingType;

	@FindBy(xpath = "//input[@name='transactionDate']")
	public UnityWebElement textBoxTransactionDate;

	@FindBy(xpath = "//input[@name='units']")
	public UnityWebElement textBoxUnits;

	@FindBy(xpath = "//input[@name='entitlement']")
	public UnityWebElement textBoxEntitlement;

	@FindBy(xpath = "//mat-option[div[normalize-space(text())='Vault']]")
	public UnityWebElement toClickEntitlement;

	@FindBy(xpath = "//input[@class='mat-radio-input cdk-visually-hidden']") // name="unitsDeliveredRadio"
	public UnityWebElement radioButtonRecipient;

	@FindBy(xpath = "//input[@name='entitlementDate']")
	public UnityWebElement textBoxEntitlementDate;

	@FindBy(xpath = "//input[@name='registration']")
	public UnityWebElement textBoxRegistration;

	@FindBy(xpath = "//input[@name='location']")
	public UnityWebElement textBoxLocation;

	@FindBy(xpath = "//input[@name='payeeOnFileGref']")
	public UnityWebElement lookupSelectOnFilePayee;

	@FindBy(xpath = "//mat-option[div[normalize-space(text())='shweta GIIN']]")
	public UnityWebElement toClickPayee;

	@FindBy(xpath = "//input[@name='disposalMethodAbbrev']")
	public UnityWebElement lookupDisposalMethod;

	@FindBy(xpath = "//mat-option[div[normalize-space(text())='CONTRIBUTION']]")
	public UnityWebElement toClickDisposalMethod;

	@FindBy(xpath = "//input[@name='taxlotSaleMethodAbbrev']")
	public UnityWebElement lookupTaxLotSaleMethod;

	@FindBy(xpath = "//mat-option[div[normalize-space(text())='ASK_OPERATOR']]")
	public UnityWebElement toClickTaxLotSaleMethod;

	@FindBy(xpath = "//input[@name='dispositionRestrictonAbbrev']")
	public UnityWebElement lookupDispositionRestriction;

	@FindBy(xpath = "//mat-option[div[normalize-space(text())='ACCOUNT']]")
	public UnityWebElement toClickDispositionRestriction;

	@FindBy(xpath = "//mat-checkbox[@id='control1596472908107']")
	public UnityWebElement checkBoxSpecifyAdditional;

	@FindBy(xpath = "//input[@name='bookValue']")
	public UnityWebElement textBoxBookValue;

	@FindBy(xpath = "//input[@name='ebtCost']")
	public UnityWebElement textBoxEbtCost;

	@FindBy(xpath = "//input[@name='cost']")
	public UnityWebElement textBoxCost;

	@FindBy(xpath = "//input[@name='baseEBTCost']")
	public UnityWebElement textBoxBaseEBTCost;

	@FindBy(xpath = "//input[@name='baseCurrencyCost']")
	public UnityWebElement textBoxBaseCurrencyCost;

	@FindBy(xpath = "//input[@name='disposalValue']")
	public UnityWebElement textBoxDisposalValue;

	@FindBy(xpath = "//input[@name='stateCost']")
	public UnityWebElement textBoxStateCost;

	@FindBy(xpath = "//input[@name='baseDisposalValue']")
	public UnityWebElement textBoxBaseDisposalValue;

	@FindBy(xpath = "//mat-checkbox[@id='control1596472908112']")
	public UnityWebElement checkBoxTransactionTaxable;

	@FindBy(xpath = "//mat-radio-button[@id='control1596472908119/A Broker']")
	public UnityWebElement radioBtnABroker;

	// **rajat**
	@FindBy(xpath = "//input[@name='payorOnFileGref']")
	public UnityWebElement txtPayorOnFile;

	@FindBy(xpath = "//input[@name='security']")
	public UnityWebElement lookupSrcSecurity;

	@FindBy(xpath = "//input[@name='transactionDate']")
	public UnityWebElement textBoxSrcTransactionDate;

	@FindBy(xpath = "//input[@name='bookValue']")
	public UnityWebElement textBoxSrcBookValue;

	@FindBy(xpath = "//input[@name='cost']")
	public UnityWebElement textBoxSrcCost;

	@FindBy(xpath = "//input[@name='entitlementDate']")
	public UnityWebElement textBoxSrcEntitlementDate;

	@FindBy(xpath = "//input[@name='currentRegistrationAbbrev']")
	public UnityWebElement lookupSrcCurrentRegistrationAbbrev;

	@FindBy(xpath = "//input[@name='ownershipClassificationAbbrev']")
	public UnityWebElement lookupSrcOwnershipClassificationAbbrev;

	@FindBy(xpath = "//input[@name='incomeStartDate']")
	public UnityWebElement textBoxSrcIncomeStartDate;

	@FindBy(xpath = "//input[@name='howAcquiredAbbrev']")
	public UnityWebElement lookupSrcHowAcquiredAbbrev;

	@FindBy(xpath = "//input[@name='fedAcquisitionDate']")
	public UnityWebElement textBoxSrcFedAcquisitionDate;

	@FindBy(xpath = "//input[@name='settlementDate']")
	public UnityWebElement textBoxSrcSettlementDate;

	@FindBy(xpath = "//input[@name='receivedDate']")
	public UnityWebElement textBoxSrcReceivedDate;

	@FindBy(xpath = "//input[@name='payorOnFileGref']")
	public UnityWebElement lookupSrcPayorOnFileGref;

	@FindBy(xpath = "//input[@name='taxCodeAbbrev']")
	public UnityWebElement lookupSrcTaxCodeAbbrev;

	@FindBy(xpath = "//input[@name='expanation']")
	public UnityWebElement textBoxSrcExplanation;

	@FindBy(xpath = "//input[@name='newTaxYearEnd']")
	public UnityWebElement txtSrcnewTaxYearEnd;

	@FindBy(xpath = "//input[@name='memoText']")
	public UnityWebElement txtmemoText;

	// **niranjan**
	// Trade Order - Free Receipt
	@FindBy(xpath = "//input[@name='portfolio']")
	public UnityWebElement lookupPortfolioAdv;

	@FindBy(xpath = "//mat-select[@name='status']/div/div[2]/div")
	public UnityWebElement dropdownStatus;

	@FindBy(xpath = "//mat-select[@name='tradeType']/div/div[2]/div")
	public UnityWebElement dropdownTradeType;

	@FindBy(xpath = "//mat-select[@name='settlementMethod']/div/div[2]/div")
	public UnityWebElement dropdownSettlementMethod;

	@FindBy(xpath = "//input[@name='cusip']")
	public UnityWebElement lookupCusip;

	@FindBy(xpath = "//mat-select[@name='feeBase']/div/div[2]/div")
	public UnityWebElement dropdownFeeBase;

	@FindBy(xpath = "//input[@name='datePlaced']")
	public UnityWebElement textBoxDatePlaced;

	@FindBy(xpath = "//input[@name='timePlaced']")
	public UnityWebElement textBoxTimePlaced;

	@FindBy(xpath = "//input[@name='taxAcquisitionDate']")
	public UnityWebElement textBoxTaxAcquisitionDate;

	@FindBy(xpath = "//input[@name='effectiveDate']")
	public UnityWebElement textBoxEffectiveDate;

	@FindBy(xpath = "//input[@name='originalFace']")
	public UnityWebElement textBoxOriginalFace;

	@FindBy(xpath = "//input[@name='purchasePrice']")
	public UnityWebElement textBoxPurchasePrice;

	@FindBy(xpath = "//input[@name='highLimit']")
	public UnityWebElement textBoxHighLimit;

	@FindBy(xpath = "//input[@name='expirationDate']")
	public UnityWebElement textBoxExpirationDate;

	@FindBy(xpath = "//input[@name='marketValue']")
	public UnityWebElement textBoxMarketValue;

	@FindBy(xpath = "//input[@name='incomeCode']")
	public UnityWebElement lookupIncomeCode;

	@FindBy(xpath = "//input[@name='settlementLocation']")
	public UnityWebElement lookupSettlementLocation;

	@FindBy(xpath = "//input[@name='taxCode']")
	public UnityWebElement lookupTaxCode;

	@FindBy(xpath = "//input[@name='broker']")
	public UnityWebElement lookupBroker;

	@FindBy(xpath = "//input[@name='clearingBroker']")
	public UnityWebElement lookupClearingBroker;

	@FindBy(xpath = "//input[@name='taxParty']")
	public UnityWebElement lookupTaxParty;

	@FindBy(xpath = "//mat-select[@name='howAcquired']/div/div[2]/div")
	public UnityWebElement dropdownHowAcquired;

	@FindBy(xpath = "//input[@name='dateOfGiftInheritance']")
	public UnityWebElement textBoxDateOfGiftInheritance;

	@FindBy(xpath = "//input[@name='fmvOfGiftInheritance']")
	public UnityWebElement textBoxFMVOfGiftInheritance;

	@FindBy(xpath = "//mat-select[@name='coveredNonCovered']/div/div[2]/div")
	public UnityWebElement dropdownCoveredNonCovered;

	@FindBy(xpath = "//input[@name='originalCostBasis']")
	public UnityWebElement textBoxOriginalCostBasis;

	@FindBy(xpath = "//input[@name='amountHeldBack']")
	public UnityWebElement textBoxAmountHeldBack;

	@FindBy(xpath = "//input[@name='amoritizationToDate']")
	public UnityWebElement textBoxAmoritizationToDate;

	@FindBy(xpath = "//input[@name='accretionToDate']")
	public UnityWebElement textBoxAccretionToDate;

	@FindBy(xpath = "//input[@name='amrAcrBeginDate']")
	public UnityWebElement textBoxAmrAcrBeginDate;

	@FindBy(xpath = "//input[@name='disallowedLoss']")
	public UnityWebElement textBoxDisallowedLoss;

	@FindBy(xpath = "//input[@name='originalAcquisitionDate']")
	public UnityWebElement textBoxOriginalAcquisitionDate;

	@FindBy(xpath = "//input[@name='originator']")
	public UnityWebElement textBoxOriginator;

	@FindBy(xpath = "//input[@name='officerName']")
	public UnityWebElement textBoxOfficerName;

	@FindBy(xpath = "//input[@name='specialInstructions1']")
	public UnityWebElement textBoxSpecialInstructions1;

	@FindBy(xpath = "//input[@name='commentLine1']")
	public UnityWebElement textBoxCommentLine1;

	// *Monika*
	@FindBy(xpath = "//input[@name='sourcePortfolio']")
	public UnityWebElement lookupPortfolioField;

	// **abhay
	@FindBy(xpath = "//input[@name='amount']")
	public UnityWebElement txtAmount;

	@FindBy(xpath = "//input[@name='targetRegAbbrev']")
	public UnityWebElement lookupTargetRegistration;

	@FindBy(xpath = "//input[@name='finalStorageLocAbbrev']")
	public UnityWebElement lookupFinalRegistration;

	@FindBy(xpath = "//input[@name='fedCost']")
	public UnityWebElement textFedCost;

	@FindBy(xpath = "//input[@name='howHeldAbbrev']")
	public UnityWebElement lookupHowHeld;

	@FindBy(xpath = "//input[@name='dispositionRestAbbrev']")
	public UnityWebElement lookupDispRestriction;

	@FindBy(xpath = "//input[@name='localCost']")
	public UnityWebElement textLocalCost;

	@FindBy(xpath = "//input[@name='dateEntitlement']")
	public UnityWebElement dateEntitlement;

	@FindBy(xpath = "//input[@name='dateStartIncome']")
	public UnityWebElement dateStartIncome;

	@FindBy(xpath = "//input[@name='fedDate']")
	public UnityWebElement dateFedAcquisation;

	@FindBy(xpath = "//input[@name='selectPayeeGref']")
	public UnityWebElement txtpayeeOnFile;

	@Override
	public void waitForPageToLoad() {
		startTime = System.currentTimeMillis();
		if (!super.isPageLoaded(driver))
			Assert.fail("Timed out after " + AppConstants.PAGE_LOAD_TIMEOUT + " seconds\n");
	}
}