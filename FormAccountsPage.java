package com.unity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.unity.constants.AppConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityWebElement;

public class FormAccountsPage extends BaseTestPage {
	WebDriver driver;

	public FormAccountsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}
	
	@FindBy(xpath = "//mat-select[@name='options']")
	public UnityWebElement dropdownOption;

	@FindBy(xpath="//input[@name='subjectToFatcaWithholding']")
	public UnityWebElement lookupSubjectToFATCAHolding;
	              
	@FindBy(xpath="//input[@name='dateW8BENEReceived']")
	public UnityWebElement textDateW8BENEReceived;
	              
	@FindBy(xpath="//input[@name='stockExchange']")
	public UnityWebElement lookupStockExchange;
	              
	@FindBy(xpath="//input[@name='affiliateName1']")
	public UnityWebElement textAffiliateName1;
	              
	@FindBy(xpath="//input[@name='dateW8ECIReceived']")
	public UnityWebElement textDateW8ECIReceived;
	              
	@FindBy(xpath="//input[@name='affiliateName2']")
	public UnityWebElement textAffiliateName2;
	              
	@FindBy(xpath="//input[@name='dateW8IMYReceived']")
	public UnityWebElement textDateW8IMYReceived;
	              
	@FindBy(xpath="//input[@name='affiliateName3']")
	public UnityWebElement textAffiliateName3;
	              
	@FindBy(xpath="//input[@name='dateW8ExpReceived']")
	public UnityWebElement textDateW8ExpReceived;
	              
	@FindBy(xpath="//input[@name='affiliateName4']")
	public UnityWebElement textAffiliateName4;
	              
	@FindBy(xpath="//input[@name='substantialUSOwner']")
	public UnityWebElement lookupSubstantialUSOwner;
	              
	@FindBy(xpath="//input[@name='usPowerOfAttorney']")
	public UnityWebElement lookupUsPowerOfAttorney;
	              
	@FindBy(xpath="//input[@name='ffiIndicator']")
	public UnityWebElement lookupffiIndicator;
	              
	@FindBy(xpath="//input[@name='ffiType']")
	public UnityWebElement lookupffiType;
	              
	@FindBy(xpath="//input[@name='nffeIndicator']")
	public UnityWebElement lookupnffeIndicator;
	              
	@FindBy(xpath="//input[@name='nffeType']")
	public UnityWebElement lookupnffeType;
	              
	@FindBy(xpath="//input[@name='countryOfOrganization']")
	public UnityWebElement lookupcountryOfOrganization;
	              
	@FindBy(xpath="//input[@name='recalcitrantAccount']")
	public UnityWebElement lookuprecalcitrantAccount;
	              
	@FindBy(xpath="//input[@name='standingUSTransInstruction']")
	public UnityWebElement lookupstandingUSTransInstruction;
	              
	@FindBy(xpath="//input[@name='formationDate']")
	public UnityWebElement textformationDate;
	              
	@FindBy(xpath="//input[@name='bankruptcyFilingDate']")
	public UnityWebElement textbankruptcyFilingDate;
	              
	@FindBy(xpath="//input[@name='gIIN']")
	public UnityWebElement textgIIN;
	              
	@FindBy(xpath="//input[@name='dateOfGIINAgreement']")
	public UnityWebElement textdateOfGIINAgreement;
	              
	@FindBy(xpath="//input[@name='expireDateOfGIINApp']")
	public UnityWebElement textexpireDateOfGIINApp;
	              
	@FindBy(xpath="//input[@name='foreignTaxID']")
	public UnityWebElement textforeignTaxID;
	
	@FindBy(xpath = "//mat-select[@name='suncardDailyParticipation']")
	public UnityWebElement dropdownSuncardDailyParticipation;
	
	@FindBy(xpath = "//mat-select[@name='valuationDateAndCycle@cycleDateMonths']")
	public UnityWebElement dropdownValuationDateAndCycleDateMonths;
	
	@FindBy(xpath = "//mat-select[@name='valuationDateAndCycle@cycleDateDays']")
	public UnityWebElement dropdownValuationDateAndCycleDateDays;
	
	@FindBy(xpath = "//mat-select[@name='valuationDateAndCycle@cycleDateYears']")
	public UnityWebElement dropdownValuationDateAndCycleDateYears;
	
	@FindBy(xpath = "//input[@name='valuationDateAndCycle@cycleDateOccursEvery']")
	public UnityWebElement textboxValuationDateAndCycleDateOccursEvery;
	
	@FindBy(xpath = "//mat-select[@name='valuationDateAndCycle@cycleDateFrequency']")
	public UnityWebElement dropdownValuationDateAndCycleDateFrequency;
	
	@FindBy(xpath = "//input[@name='suncardParticipantCode']")
	public UnityWebElement textboxSuncardParticipantCode;
	
	@FindBy(xpath = "//input[@name='valuationDateAndCycle@toggleCD']")
	public UnityWebElement toggleClearDate;
	
	@FindBy(xpath = "//input[@name='proxies']")
    public UnityWebElement lookupProxies;
    
    @FindBy(xpath = "//input[@name='lotSelectionMethod']")
    public UnityWebElement lookupLotSelecion;

    @FindBy(xpath = "//input[@name='accountForPlanNumber2']")
    public UnityWebElement textboxAccForPlanNum2;
    
    @FindBy(xpath = "//input[@name='feeBillingAddress1']")
    public UnityWebElement txtboxfeeBillAdd1;
    
    @FindBy(xpath = "//mat-select[@name='includeAccountProrationDetail']")
    public UnityWebElement dropdownAccProration;
    
    @FindBy(xpath = "//mat-select[@name='wealthcloudParticipation']")
    public UnityWebElement dropdownWealthCloudPart;

    @FindBy(xpath="//mat-select[@name='statementDate@cycleDateMonths']")
    public UnityWebElement selectStatementDateCycleDateMonths;

    @FindBy(xpath="//mat-select[@name='statementDate@cycleDateDays']")
    public UnityWebElement selectStatementDateCycleDateDays;

    @FindBy(xpath="//mat-select[@name='statementDate@cycleDateYears']")
    public UnityWebElement selectStatementDateCycleDateYears;

    @FindBy(xpath="//input[@name='statementDate@cycleDateOccursEvery']")
    public UnityWebElement selectStatementDateCycleDateOccursEvery;

    @FindBy(xpath="//mat-select[@name='statementDate@cycleDateFrequency']")
    public UnityWebElement selectStatementDateCycleDateFrequency;

    @FindBy(xpath = "//input[@name='numberOfCopies']")
	public UnityWebElement textboxStatementNumberOfCopies;
	
	@FindBy(xpath = "//input[@name='statementType']")
	public UnityWebElement dropdownStatementType;
	
	@FindBy(xpath = "//input[@name='dispositionCode']")
	public UnityWebElement dropdownDispositionCode;
	
	@FindBy(xpath = "//input[@name='expirationDate']")
	public UnityWebElement dateStatementExpirationDate;
	
	@FindBy(xpath="//mat-select[@name='invoiceEndingDate@cycleDateMonths']")
	public UnityWebElement selectCfipDateCycleDateMonths;
	                    
	@FindBy(xpath="//mat-select[@name='invoiceEndingDate@cycleDateDays']")
	public UnityWebElement selectCfipDateCycleDateDays;
	                    
	@FindBy(xpath="//mat-select[@name='invoiceEndingDate@cycleDateYears']")
	public UnityWebElement selectCfipDateCycleDateYears;
	                    
	@FindBy(xpath="//input[@name='invoiceEndingDate@cycleDateOccursEvery']")
	public UnityWebElement selectCfipDateCycleDateOccursEvery;
	                    
	@FindBy(xpath="//mat-select[@name='invoiceEndingDate@cycleDateFrequency']")
	public UnityWebElement selectCfipDateCycleDateFrequency;
	
	@FindBy(xpath = "//input[@name='message']")
	public UnityWebElement textboxCfipMessage;
	
	@FindBy(xpath = "//mat-select[@name='includeAccountProrationDetail']")
	public UnityWebElement dropdownCfipIncludeAccount;

	@FindBy(xpath = "//input[@name='householdNumber']")
	public UnityWebElement textboxStatementHouseholdNumber;

	@FindBy(xpath = "//input[@name='monthsSuppressedFromPrinting']")
	public UnityWebElement textboxStatementMonthsSuppressedFromPrinting;

	
	@FindBy(xpath="//input[@name='adpAcctNum2']")
	public UnityWebElement textADPAccNum2;

	@FindBy(xpath="//input[@name='adpAcctNum1']")
	public UnityWebElement textADPAccNum1;
	
	@FindBy(xpath="//input[@name='accountLookup']")
	public UnityWebElement lookupAccount;
	              
	@FindBy(xpath="//input[@name='componentSequenceNumber']")
	public UnityWebElement textFeeCompSeqno;
	              
	@FindBy(xpath="//input[@name='cofiduciaryNumber']")
	public UnityWebElement lookupCofiduciaryNum;
	              
	@FindBy(xpath="//input[@name='additionalAmount']")
	public UnityWebElement textAdditionalAmt;
	              
	@FindBy(xpath="//input[@name='feeSchedule']")
	public UnityWebElement lookupFeeSchedule;
	              
	@FindBy(xpath="//mat-select[@name='saveComponentNetAmountAfterCalculations']")
	public UnityWebElement dropdownSaveCompNetAmt;
	
	@FindBy(xpath = "//input[@name='toAccount']")
	public UnityWebElement lookupToAccount;
	              
	@FindBy(xpath = "//input[@name='toAccountBlockNumber']")
	public UnityWebElement lookupToAccountBlockNumber;
	              
	@FindBy(xpath = "//mat-select[@name='printForInvestmentOfficer']")
	public UnityWebElement dropdownPrintForInvOff;
	              
	@FindBy(xpath = "//mat-select[@name='printForPBOfficer']")
	public UnityWebElement dropdownPrintForPbOff;
	              
	@FindBy(xpath = "//mat-select[@name='printForOtherOfficer']")
	public UnityWebElement dropdownPrintForOtherOff;

	@FindBy(xpath = "//input[@name='fullyDisclosedAltCusip']")
	public UnityWebElement textBoxFullyDisAltCUSIP;

	@FindBy(xpath="//mat-select[@name='ticklerDate@cycleDateMonths']")
	public UnityWebElement dropdownticklerDateCycleDateMonths ;
	                    
	@FindBy(xpath="//mat-select[@name='ticklerDate@cycleDateDays']")
	public UnityWebElement dropdownticklerDateCycleDateDays ;
	                    
	@FindBy(xpath="//mat-select[@name='ticklerDate@cycleDateYears']")
	public UnityWebElement dropdownticklerDateCycleDateYears ;
	                    
	@FindBy(xpath="//input[@name='ticklerDate@cycleDateOccursEvery']")
	public UnityWebElement dropdownticklerDateCycleDateOccursEvery ;
	                    
	@FindBy(xpath="//mat-select[@name='ticklerDate@cycleDateFrequency']")
	public UnityWebElement dropdownticklerDateCycleDateFrequency ;
	              
	@FindBy(xpath = "//input[@name='adminOfficerCode']")
	public UnityWebElement lookupAdminOfficerCode;
	              
	@FindBy(xpath = "//input[@name='ticklerDescription1']")
	public UnityWebElement textBoxTickDes1;
	              
	@FindBy(xpath = "//input[@name='ticklerDescription2']")
	public UnityWebElement textBoxTickDes2;
	              
	@FindBy(xpath = "//input[@name='ticklerDescription3']")
	public UnityWebElement textBoxTickDes3;
	              
	@FindBy(xpath = "//input[@name='ticklerDescription4']")
	public UnityWebElement textBoxTickDes4;
	              
	@FindBy(xpath = "//input[@name='ticklerDescription5']")
	public UnityWebElement textBoxTickDes5;
	              
	@FindBy(xpath = "//input[@name='expirationDate']")
	public UnityWebElement textBoxExpDate;
	
	@FindBy(xpath = "//mat-slide-toggle[@class='mat-slide-toggle mat-primary ng-untouched ng-dirty ng-valid slide-toggle']")
	public UnityWebElement toggleCycleDate;

	@FindBy(xpath = "//mat-select[@name='historicalMarketValueCalcDate@cycleDateMonths']")
	public UnityWebElement dropdownHMVMonths;
	
	@FindBy(xpath = "//input[@name='fromDate']")
    public UnityWebElement txtboxfromdate;
    
    @FindBy(xpath = "//input[@name='toDate']")
    public UnityWebElement txtboxadptodate;
    
    @FindBy(xpath = "//button[@name='searchBtn']")
    public UnityWebElement btnsearch;
    
    @FindBy(xpath = "//input[@name='valuation4']")
    public UnityWebElement txtboxavaluation4;

    @FindBy(xpath = "//input[@name='accountCommentLine1of2']")
    public UnityWebElement txtboxacccmline1;
    
    @FindBy(xpath = "//input[@name='accountCommentLine2of2']")
    public UnityWebElement txtboxacccmline2;

    @FindBy(xpath = "//input[@name='investmentCommentLine1of2']")
    public UnityWebElement txtboxivcmline1;
    
    @FindBy(xpath = "//input[@name='investmentCommentLine2of2']")
    public UnityWebElement txtboxivcmline2;
    
    @FindBy(xpath = "//input[@name='recipientCommentLine1of3']")
    public UnityWebElement txtboxrecmline1;
    
    @FindBy(xpath = "//input[@name='recipientCommentLine2of3']")
    public UnityWebElement txtboxrecmline2;
    
    @FindBy(xpath = "//input[@name='exemptForFATCAWitholding']")
	public UnityWebElement lookupExemptForFATCAWitholding;
    
    @FindBy(xpath = "//input[@name='numberOfCopiesOfThisReview']")
	public UnityWebElement textboxNumberOfCopiesOfThisReview;
	
	@FindBy(xpath = "//input[@name='dispositionCode']")
	public UnityWebElement lookupDispositionCode;
	
	@FindBy(xpath = "//input[@name='expirationDate']")
	public UnityWebElement dateExpirationDate;
	
	@FindBy(xpath = "//input[@name='householdNumber']")
	public UnityWebElement textboxHouseholdNumber;
	
	@FindBy(xpath = "//input[@name='fundToeStatus']")
	public UnityWebElement lookupFundToeStatus;
	
	@FindBy(xpath = "//input[@name='excludeFrom22CInterface']")
	public UnityWebElement lookupExcludeFrom22CInterface;
	
	@FindBy(xpath = "//input[@name='intermediaryNumber']")
	public UnityWebElement lookupIntermediaryNumber;
	
	@FindBy(xpath = "//input[@name='fundCashManagementStatus']")
	public UnityWebElement lookupFundCashManagementStatus;
	
	@FindBy(xpath = "//input[@name='fundType']")
	public UnityWebElement lookupFundType;
	
	@FindBy(xpath = "//input[@name='fNavFund']")
	public UnityWebElement lookupFNavFund;
	
	@FindBy(xpath = "//input[@name='fundFeeEligible']")
	public UnityWebElement lookupFundFeeEligible;
    
    @FindBy(xpath = "//input[@name='recipientCommentLine3of3']")
    public UnityWebElement txtboxrecmline3;

    @FindBy(xpath = "//input[@name='durationDateStart']")
	public UnityWebElement textboxDurationDateStart;
	
	@FindBy(xpath = "//input[@name='durationDateStop']")
	public UnityWebElement textboxDurationDateStop;
	
	@FindBy(xpath = "//input[@name='recipientNumber']")
	public UnityWebElement lookupRecipientNumber;
	
	@FindBy(xpath = "//textarea[@name='standardDescription']")
	public UnityWebElement textboxStandardDescription;
	
	@FindBy(xpath = "//input[@name='principalCashAmountDollar']")
	public UnityWebElement textboxPrincipalCashAmountDollar;

	      
	@FindBy(xpath = "//mat-select[@name='historicalMarketValueCalcDate@cycleDateDays']")
	public UnityWebElement dropdownHMVDays;
	      
	@FindBy(xpath = "//mat-select[@name='historicalMarketValueCalcDate@cycleDateYears']")
	public UnityWebElement dropdownHMVYears;
	      
	@FindBy(xpath = "//input[@name='historicalMarketValueCalcDate@cycleDateOccursEvery']")
	public UnityWebElement txtHMVOccursEvery;
	      
	@FindBy(xpath = "//mat-select[@name='historicalMarketValueCalcDate@cycleDateFrequency']")
	public UnityWebElement dropdownHMVFrequency;
	      
	@FindBy(xpath = "//input[@name='levelOfService']")
	public UnityWebElement txtLevelOfService;
	
	@FindBy(xpath = "//input[@name='fundFamilyIPNumber']")
    public UnityWebElement textboxfundFamilyIPNumber;
    
    @FindBy(xpath = "//input[@name='numberOfDaysHeld']")
    public UnityWebElement textboxnumberOfDaysHeld;
    
    @FindBy(xpath = "//input[@name='redemptionFeePercentage']")
    public UnityWebElement textboxredemptionFeePercentage;
    
    @FindBy(xpath = "//input[@name='exemptionAmount']")
    public UnityWebElement textboxexemptionAmount;
    
    @FindBy(xpath = "//mat-select[@name='businessOrCalendarDays']")
    public UnityWebElement dropdownbusinessOrCalendarDays;
    
    @FindBy(xpath = "//mat-select[@name='includeSystematicTrades']")
    public UnityWebElement dropdownincludeSystematicTrades;
    
    @FindBy(xpath = "//mat-select[@name='inclusiveOfTradeDate']")
    public UnityWebElement dropdowninclusiveOfTradeDate;
    
    @FindBy(xpath = "//mat-select[@name='excludeDividentReinvBuys']")
    public UnityWebElement dropdownexcludeDividentReinvBuys;
    
    @FindBy(xpath = "//mat-select[@name='defaultToOmnibus']")
    public UnityWebElement dropdowndefaultToOmnibus;
    
    @FindBy(xpath = "//mat-select[@name='redemptionFeeCalculationMethod']")
    public UnityWebElement dropdownredemptionFeeCalculationMethod;
    
    @FindBy(xpath = "//mat-select[@name='actuaryTableToUse']")
    public UnityWebElement dropdownactuaryTableToUse;
    
    @FindBy(xpath = "//mat-select[@name='beneficiaryType']")
    public UnityWebElement dropdownbeneficiaryType;
    
    @FindBy(xpath = "//input[@name='lifeExpectancyDivisorOverride']")
    public UnityWebElement textboxlifeExpectancyDivisorOverride;
    
    @FindBy(xpath = "//mat-select[@name='beneficiaryElectionType']")
    public UnityWebElement dropdownbeneficiaryElectionType;
    
    @FindBy(xpath = "//input[@name='ruleExpirationDate']")
    public UnityWebElement textboxruleExpirationDate;
    
    @FindBy(xpath = "//input[@name='originalOwnerDateOfBirth']")
    public UnityWebElement textboxoriginalOwnerDateOfBirth;
    
    @FindBy(xpath = "//input[@name='rmdDueDeceasedOwner']")
    public UnityWebElement textboxrmdDueDeceasedOwner;
    
    @FindBy(xpath = "//input[@name='originalOwnerDateOfDeath']")
    public UnityWebElement textboxoriginalOwnerDateOfDeath;

    @FindBy(xpath = "//input[@name='adminOfficerCode']")
    public UnityWebElement lookupadminOfficerCode;
    
    @FindBy(xpath = "//input[@name='ticklerDescription1']")
    public UnityWebElement TextboxticklerDescription1;
    
    @FindBy(xpath = "//input[@name='ticklerDescription2']")
    public UnityWebElement TextboxticklerDescription2;
    
    @FindBy(xpath = "//input[@name='ticklerDescription3']")
    public UnityWebElement TextboxticklerDescription3;
    
    @FindBy(xpath = "//input[@name='ticklerDescription4']")
    public UnityWebElement TextboxticklerDescription4;
    
    @FindBy(xpath = "//input[@name='ticklerDescription5']")
    public UnityWebElement TextboxticklerDescription5;
    
    @FindBy(xpath = "//mat-select[@name='printForInvestmentOfficer']")
    public UnityWebElement dropdownprintForInvestmentOfficer;
    
    @FindBy(xpath = "//mat-select[@name='printForPBOfficer']")
    public UnityWebElement dropdownprintForPBOfficer;
    
    @FindBy(xpath = "//mat-select[@name='printForOtherOfficer']")
    public UnityWebElement dropdownprintForOtherOfficer;


	
	@FindBy(xpath = "//mat-select[@name='disbursementCode']")
	public UnityWebElement dropdowndisCode;

	
	@FindBy(xpath = "//input[@name='adpAcctNum2']")
	public UnityWebElement txtboxadpAccount2;
	
	@FindBy(xpath = "//input[@name='excludeFromNotices']")
	public UnityWebElement lookupexcludeFromNotices;

	@FindBy(xpath = "//input[@name='excludeFromEmailNotices']")
	public UnityWebElement lookupexcludeFromEmailNotices;
	
	@FindBy(xpath = "//input[@name='evareParticipation']")
	public UnityWebElement lookupevareParticipation;
	
	@FindBy(xpath = "//input[@name='consolidateFeeTrans']")
	public UnityWebElement lookupconsolidateFeeTrans;
	
	@FindBy(xpath = "//input[@name='useAlternateCMDescription']")
	public UnityWebElement lookupuseAlternateCMDescription;
	
	@FindBy(xpath = "//input[@name='consolidateCMTrans']")
	public UnityWebElement lookupconsolidateCMTrans;

	@FindBy(xpath = "//input[@name='costCenterNumber']")
	public UnityWebElement lookupcostCenterNumber;
	
	@FindBy(xpath = "//input[@name='excludeFromGLInterface']")
	public UnityWebElement lookupexcludeFromGLInterface;

	@FindBy(xpath = "//mat-select[@name='firstRateParticipation']")
	public UnityWebElement dropdownfirstRateParticipation;
	
	@FindBy(xpath = "//input[@name='firstRateTierLevel']")
	public UnityWebElement dropdownfirstRateTierLevel;
	
	@FindBy(xpath = "//input[@name='firstRateTierForDisplay']")
	public UnityWebElement dropdownfirstRateTierForDisplay;
	
	@FindBy(xpath = "//mat-select[@name='sendAccountShortTitle']")
	public UnityWebElement dropdownsendAccountShortTitle;
	
	@FindBy(xpath = "//mat-select[@name='options']")
	public UnityWebElement dropdownOptions;

	@FindBy(xpath = "//mat-select[@name='doOverdraftProcessing']")
	public UnityWebElement dropdowndoOverdraftProcessing;
	
	@FindBy(xpath = "//mat-select[@name='doOverdraftProcessing']")
	public UnityWebElement dropdowndoSweepProcessing;
	
	@FindBy(xpath = "//mat-select[@name='includeInterestPayments']")
	public UnityWebElement dropdownincludeInterestPayments;
	
	@FindBy(xpath = "//mat-select[@name='autoChargeAgedReceivables']")
	public UnityWebElement dropdownautoChargeAgedReceivables;
	
	@FindBy(xpath = "//mat-select[@name='consolidatePaymentsOnFormat6']")
	public UnityWebElement dropdownconsolidatePaymentsOnFormat6;
	
	@FindBy(xpath = "//input[@name='takeFeeFromPrincipalOrIncome']")
	public UnityWebElement lookuptakeFeeFromPrincipalOrIncome;

	@FindBy(xpath = "//input[@name='paymentLimit']")
	public UnityWebElement textBoxpaymentLimit;
	
	@FindBy(xpath = "//input[@name='daysAfterWhichRecCharged']")
	public UnityWebElement textBoxdaysAfterWhichRecCharged;
	
	@FindBy(xpath = "//input[@name='percentOfPrincipalForAutoCharge']")
	public UnityWebElement textBoxpercentOfPrincipalForAutoCharge;

	@FindBy(xpath = "//input[@name='taxYearEnd']")
    public UnityWebElement textnewTaxYearEnd;
	
	@FindBy(xpath = "//input[@name='entityType']")
	public UnityWebElement txtEntityType;


	 @FindBy(xpath = "//input[@name='taxGainTo']")
	      public UnityWebElement lookupTaxGainTo;
	
	 @FindBy(xpath = "//input[@name='taxIncomeTo']")
	      public UnityWebElement lookupTaxIncomeTo;
	
	 @FindBy(xpath = "//mat-select[@name='noTaxReporting']")
	      public UnityWebElement dropdownnoTaxReporting;
	
	 @FindBy(xpath = "//mat-select[@name='othTaxReports']")
	      public UnityWebElement dropdownnothTaxReports;
	
	 @FindBy(xpath = "//mat-select[@name='otherReqForms']")
	      public UnityWebElement dropdownnootherReqForms;
	
	 @FindBy(xpath = "//mat-select[@name='taxLetter1']")
	      public UnityWebElement dropdownntaxLetter1;
	
	 @FindBy(xpath = "//mat-select[@name='taxLetter2']")
	      public UnityWebElement dropdownntaxLetter2;
	
	 @FindBy(xpath = "//mat-select[@name='taxLetter3']")
	      public UnityWebElement dropdownntaxLetter3;
	 
	 @FindBy(xpath = "//mat-select[@name='includeInFeeSystemFile']")
	 public UnityWebElement dropdownIncludeInFeeSystemFile;
	       
	 @FindBy(xpath = "//mat-select[@name='includeAccruedIncome']")
	 public UnityWebElement dropdownIncludeAccruedIncome;

	 @FindBy(xpath = "//input[@name='reviewFormat']")
	 public UnityWebElement txtReviewFormat;
	 
	 @FindBy(xpath = "//mat-select[@name='privateBankingParticipation']")
	 public UnityWebElement dropdownPrivateBankingParticipation;
	       
	 @FindBy(xpath = "//input[@name='ddaAccountNumber']")
	 public UnityWebElement txtDdaAccountNumber;
	 
	 @FindBy(xpath = "//mat-select[@name='excludeAccountIndicator']")
	 public UnityWebElement dropdownExcludeAccountIndicator;
	       
	 @FindBy(xpath = "//input[@name='accountOwner']")
	 public UnityWebElement txtAccountOwner;
	       
	 @FindBy(xpath = "//input[@name='accountForPlanNumber1']")
	 public UnityWebElement txtAccountForPlanNumber1;
	 
	 @FindBy(xpath = "//input[@name='sponsorNum']")
	 public UnityWebElement lookupSponsorNum;
		
		
	@FindBy(xpath = "//input[@name='shortName']")
	public UnityWebElement textboxshortName;
		
	@FindBy(xpath = "//input[@name='fullName1']")
	public UnityWebElement textboxfullName1;
	
	@FindBy(xpath = "//input[@name='fullName2']")
	public UnityWebElement textboxfullName2;
	
	@FindBy(xpath = "//input[@name='address1']")
	public UnityWebElement textboxaddress1;
	
	@FindBy(xpath = "//input[@name='address2']")
	public UnityWebElement textboxaddress2;
	
	@FindBy(xpath = "//input[@name='address3']")
	public UnityWebElement textboxaddress3;
	
	@FindBy(xpath = "//input[@name='address4']")
	public UnityWebElement textboxaddress4;
	
	@FindBy(xpath = "//input[@name='address5']")
	public UnityWebElement textboxaddress5;
	
	@FindBy(xpath = "//input[@name='state']")
	public UnityWebElement lookupState;
	
	@FindBy(xpath = "//input[@name='zipCode']")
	public UnityWebElement textboxZipCode;
	
	@FindBy(xpath = "//input[@name='contactName']")
	public UnityWebElement textboxcontactName;
	
	@FindBy(xpath = "//input[@name='contactNumber']")
	public UnityWebElement textboxcontactNumber;
	
	@FindBy(xpath = "//input[@name='taxYearEnd']")
	public UnityWebElement textboxtaxYearEnd;
	
	@FindBy(xpath = "//input[@name='mailingAddress1']")
	public UnityWebElement textboxmailingAddress1;
	
	@FindBy(xpath = "//input[@name='mailingAddress2']")
	public UnityWebElement textboxmailingAddress2;
	
	@FindBy(xpath = "//input[@name='mailingAddress3']")
	public UnityWebElement textboxmailingAddress3;
	
	@FindBy(xpath = "//input[@name='sponsorMailState']")
	public UnityWebElement lookupSponsorMailState;
	
	@FindBy(xpath = "//input[@name='sponsorMailZip']")
	public UnityWebElement textboxsponsorMailZip;
	
	@FindBy(xpath = "//input[@name='legalAddressDate']")
	public UnityWebElement textboxlegalAddressDate;
	
	@FindBy(xpath = "//input[@name='mailOkDate']")
	public UnityWebElement textboxmailOkDate;
	
	@FindBy(xpath = "//input[@name='remarks1']")
	public UnityWebElement textboxremarks1;
	
	@FindBy(xpath = "//input[@name='remarks2']")
	public UnityWebElement textboxRemarks2;
	
	@FindBy(xpath = "//input[@name='remarks3']")
	public UnityWebElement textboxRemarks3;
	
	@FindBy(xpath = "//input[@name='remarks4']")
	public UnityWebElement textboxRemarks4;
	
	@FindBy(xpath = "//input[@name='remarks5']")
	public UnityWebElement textboxRemarks5;
	
	@FindBy(xpath = "//input[@name='remarks6']")
	public UnityWebElement textboxRemarks6;
	
	@FindBy(xpath = "//input[@name='remarks7']")
	public UnityWebElement textboxRemarks7;
	
	@FindBy(xpath = "//input[@name='remarks8']")
	public UnityWebElement textboxRemarks8;
	
	@FindBy(xpath = "//input[@name='remarks9']")
	public UnityWebElement textboxRemarks9;
	
	@FindBy(xpath = "//input[@name='remarks10']")
	public UnityWebElement textboxRemarks10;
	
	@FindBy(xpath = "//input[@name='ipForAccount']")
	public UnityWebElement textboxIpForAccount;
	
	@FindBy(xpath = "//input[@name='invManagerClientId']")
	public UnityWebElement textboxInvManagerClientId;
	
	@FindBy(xpath = "//mat-select[@name='wealthcloudParticipation']")
	public UnityWebElement dropdownwealthcloudParticipation;
	
	@FindBy(xpath="//input[@name='taxYearEnd']")
	public UnityWebElement txtTaxYearEnd ;
	
	@FindBy(xpath = "//input[@name='amount']")
	public UnityWebElement txtamount;

	@FindBy(xpath = "//input[@name='secondParty']")
	public UnityWebElement txtsecondParty;

	@FindBy(xpath="//mat-select[@name='suppressOnMasterStatement']")
	public UnityWebElement dropdownSupOnMasterStat ;

	@FindBy(xpath = "//input[@name='taxCode']")
	public UnityWebElement lookupTaxCode;

	@FindBy(xpath = "//input[@name='fundsCode']")
	public UnityWebElement lookupFundsCode;

	@FindBy(xpath = "//input[@name='commentLine1']")
	public UnityWebElement txtCommLine1;
	      
	@FindBy(xpath = "//input[@name='commentLine2']")
	public UnityWebElement txtCommLine2;
	      
	@FindBy(xpath = "//input[@name='commentLine3']")
	public UnityWebElement txtCommLine3;
	      
	@FindBy(xpath = "//input[@name='commentLine4']")
	public UnityWebElement txtCommLine4;
	
	@FindBy(xpath="//mat-select[@name='wscfiInterfaceEligible']")
	public UnityWebElement dropdownwscfiInterfaceEligible;

	@FindBy(xpath="//input[@name='clientID']")
	public UnityWebElement textclientID ;
	      
	@FindBy(xpath="//input[@name='currentElectionBeginYear']")
	public UnityWebElement textcurrentElectionBeginYear ;
	      
	@FindBy(xpath="//input[@name='mktDiscountElection']")
	public UnityWebElement textmktDiscountElection ;
	      
	@FindBy(xpath="//mat-select[@name='transferBetweenPortfolios']")
	public UnityWebElement dropdowntransferBetweenPortfolios ;
	      
	@FindBy(xpath="//mat-select[@name='amortizeTaxableBDPremiums']")
	public UnityWebElement dropdownamortizeTaxableBDPremiums ;
	      
	@FindBy(xpath="//mat-select[@name='dateForWscfiAmrAcr@cycleDateMonths']")
	public UnityWebElement dropdownWSCFIDateAndCycleMonths ;
	      
	@FindBy(xpath="//mat-select[@name='dateForWscfiAmrAcr@cycleDateDays']")
	public UnityWebElement dropdownWSCFIDateAndCycleDays ;
	      
	@FindBy(xpath="//mat-select[@name='dateForWscfiAmrAcr@cycleDateYears']")
	public UnityWebElement dropdownWSCFIDateAndCycleYears ;
	      
	@FindBy(xpath="//input[@name='dateForWscfiAmrAcr@cycleDateOccursEvery']")
	public UnityWebElement dropdownWSCFIDateAndCycleOccursEvery ;
	      
	@FindBy(xpath="//mat-select[@name='dateForWscfiAmrAcr@cycleDateFrequency']")
	public UnityWebElement dropdownWSCFIDateAndCycleFrequency ;
	
	@FindBy(xpath = "//input[@name='expenseRatio']")
    public UnityWebElement textBoxExpRatio;
      
      @FindBy(xpath = "//input[@name='fee12B1']")
    public UnityWebElement textBoxfee12B1;
      
      @FindBy(xpath = "//input[@name='shareholderServicesFee']")
    public UnityWebElement textBoxshareholderServicesFee;
      
      @FindBy(xpath = "//mat-select[@name='redemptionFee']")
    public UnityWebElement textBoxredemptionFee;
      
      @FindBy(xpath = "//input[@name='fundRepeatPercentage']")
    public UnityWebElement textBoxfundRepeatPercentage;

      @FindBy(xpath = "//input[@name='planNum']")
      public UnityWebElement lookupplanNum;
        
        @FindBy(xpath = "//input[@name='fundNum']")
      public UnityWebElement lookupfundNum;
        
        @FindBy(xpath = "//input[@name='fundName']")
      public UnityWebElement textBoxfundName;
        
        @FindBy(xpath = "//input[@name='fundType']")
      public UnityWebElement lookupfundType;
        
        @FindBy(xpath = "//input[@name='fundingTrustAcctNum']")
      public UnityWebElement textBoxfundingTrustAcctNum;
        
        @FindBy(xpath = "//mat-select[@name='unitFund']")
      public UnityWebElement dropdownunitFund;
        
        @FindBy(xpath = "//input[@name='fundCusipNum']")
      public UnityWebElement textBoxfundCusipNum;
        
        @FindBy(xpath = "//mat-select[@name='companyStockFund']")
      public UnityWebElement dropdownunitcompanyStockFund;
        
        @FindBy(xpath = "//input[@name='numOfDecimalsForRounding']")
      public UnityWebElement textBoxnumOfDecimalsForRounding;
        
        @FindBy(xpath = "//mat-select[@name='incomeSourceOnlyFund']")
      public UnityWebElement dropdownincomeSourceOnlyFund;
        
        @FindBy(xpath = "//input[@name='remarks4']")
      public UnityWebElement textBoxremarks4;
        
        @FindBy(xpath = "//input[@name='remarks5']")
      public UnityWebElement textBoxremarks5;

        @FindBy(xpath = "//input[@name='adminTrustee']")
        public UnityWebElement lookupAdminTrustee;
          
          @FindBy(xpath = "//input[@name='shortName']")
        public UnityWebElement textBoxShortName;
          
          @FindBy(xpath = "//input[@name='fullName1']")
        public UnityWebElement textBoxFullName1;
          
          @FindBy(xpath = "//input[@name='fullName2']")
        public UnityWebElement textBoxFullName2;
          
          @FindBy(xpath = "//input[@name='address1']")
        public UnityWebElement textBoxAddress1;
          
          @FindBy(xpath = "//input[@name='address2']")
        public UnityWebElement textBoxAddress2;
          
          @FindBy(xpath = "//input[@name='address3']")
        public UnityWebElement textBoxAddress3;
          
          @FindBy(xpath = "//input[@name='address4']")
        public UnityWebElement textBoxAddress4;
          
          @FindBy(xpath = "//input[@name='address5']")
        public UnityWebElement textBoxAddress5;
          
          @FindBy(xpath = "//input[@name='state']")
        public UnityWebElement lookupstate;
          
          @FindBy(xpath = "//input[@name='zipCode']")
        public UnityWebElement textBoxZipCode;
          
          @FindBy(xpath = "//input[@name='contactName']")
        public UnityWebElement textBoxcontactName;
          
          @FindBy(xpath = "//input[@name='contactNumber']")
        public UnityWebElement textBoxcontactNumber;
          
          @FindBy(xpath = "//input[@name='mailingAddress1']")
        public UnityWebElement textBoxmailingAddress1;
          
          @FindBy(xpath = "//input[@name='mailingAddress2']")
        public UnityWebElement textBoxmailingAddress2;
          
          @FindBy(xpath = "//input[@name='mailingAddress3']")
        public UnityWebElement textBoxmailingAddress3;
          
          @FindBy(xpath = "//input[@name='admTrusteeMailState']")
        public UnityWebElement lookupadmTrusteeMailState;
          
          @FindBy(xpath = "//input[@name='admTrusteeMailZip']")
        public UnityWebElement textBoxadmTrusteeMailZip;
          
          @FindBy(xpath = "//input[@name='legalAddressDate']")
        public UnityWebElement textBoxlegalAddressDate;
          
          @FindBy(xpath = "//input[@name='mailOkDate']")
        public UnityWebElement textBoxmailOkDate;
          
          @FindBy(xpath = "//input[@name='citizenStatus']")
          public UnityWebElement lookupCitizenStatus;


      @FindBy(xpath = "//input[@name='originalStreetAddress1']")
          public UnityWebElement textBoxOriginalStreetAddress1;
      
      @FindBy(xpath = "//input[@name='irsEfileName1']")
      public UnityWebElement textBoxIrsEfileName1;
	
	  @FindBy(xpath = "//input[@name='irsEfileName2']")
	      public UnityWebElement textBoxIrsEfileName2;
	
	  @FindBy(xpath = "//input[@name='natureOfSponsor']")
	  public UnityWebElement lookupNatureOfSponsor;
	
	@FindBy(xpath = "//input[@name='irsPlanNumber']")
	  public UnityWebElement textBoxIrsPlanNumber;
	
	@FindBy(xpath = "//mat-select[@name='welfareBenefitPlan']")
	  public UnityWebElement dropdownWelfareBenefitPlan;
	
	@FindBy(xpath = "//mat-select[@name='definedContributionPlan']")
	  public UnityWebElement dropdownDefinedContributionPlan;
	
	
	@FindBy(xpath = "//input[@name='will']")
	public UnityWebElement lookupWill;
	
	@FindBy(xpath = "//input[@name='assets']")
	public UnityWebElement textBoxAssets;
	
	@FindBy(xpath = "//input[@name='liabilities']")
	public UnityWebElement textBoxLiabilities;
	
	@FindBy(xpath = "//input[@name='netWorth']")
	public UnityWebElement textBoxNetWorth;
	
	@FindBy(xpath = "//input[@name='taxableEstate']")
	public UnityWebElement textBoxTaxableEstate;
	
	@FindBy(xpath = "//input[@name='excludeFromNotices']")
	public UnityWebElement lookupExcludeFromNotices;
	
	@FindBy(xpath = "//input[@name='excludeFromEmailNotices']")
	public UnityWebElement lookupExcludeFromEmailNotices;
	
	@FindBy(xpath = "//input[@name='irsEFileEntityName']")
	public UnityWebElement textBoxIrsEFileEntityName;
	
	@FindBy(xpath = "//input[@name='irsEFileEntityName2']")
	public UnityWebElement textBoxIrsEFileEntityName2;
	
	@FindBy(xpath = "//input[@name='streetAddress']")
	public UnityWebElement textBoxStreetAddress;
	
	@FindBy(xpath = "//input[@name='city']")
	public UnityWebElement textBoxCity;
	
	@FindBy(xpath = "//input[@name='annualFeeDate']")
	public UnityWebElement textBoxAnnualFeeDate;
	
	@FindBy(xpath = "//input[@name='accountLevelMinimumAmount']")
	public UnityWebElement textBoxAccountLevelMinimumAmount;
	
	@FindBy(xpath = "//input[@name='accountLevelMinimumToPrincipal']")
	public UnityWebElement textBoxAccountLevelMinimumToPrincipal;
	
	@FindBy(xpath = "//mat-select[@name='feeReserves']")
	public UnityWebElement dropdownFeeReserves;
	
	@FindBy(xpath = "//mat-select[@name='lateInterestCalculation']")
	public UnityWebElement dropdownLateInterestCalculation;
	
	@FindBy(xpath = "//input[@name='estimatedTaxStatus']")
	public UnityWebElement textBoxEstimatedTaxStatus;
	
	@FindBy(xpath = "//input[@name='irsBusinessNameControl']")
	public UnityWebElement textBoxIrsBusinessNameControl;
	
	@FindBy(xpath = "//input[@name='estimatedPaymentFrequency']")
	public UnityWebElement textBoxEstimatedPaymentFrequency;
	
	@FindBy(xpath = "//input[@name='annualPaymentMonth']")
	public UnityWebElement textBoxAnnualPaymentMonth;
	
	@FindBy(xpath = "//input[@name='depositoryEligibility']")
	public UnityWebElement lookupDepositoryEligibilty;
	
	@FindBy(xpath = "//input[@name='smacSettlementInstructions']")
	public UnityWebElement lookupSmacSettlementInstructions;
	
	@FindBy(xpath = "//input[@name='securityRegistration']")
	public UnityWebElement lookupSecurityRegistration;
	
	@FindBy(xpath = "//input[@name='mergeLotAssets']")
	public UnityWebElement lookupMergeLotAssets;
	
	@FindBy(xpath = "//input[@name='specialReg']")
	public UnityWebElement lookupSpecialReg;
	
	@FindBy(xpath = "//input[@name='suppressAdvicesForCashSweepTrans']")
	public UnityWebElement lookupSuppressAdvicesForCashSweepTrans;




          
          @FindBy(xpath = "//input[@name='remarks1']")
        public UnityWebElement textBoxremarks1;
          
          @FindBy(xpath = "//input[@name='remarks2']")
        public UnityWebElement textBoxremarks2;
          
          @FindBy(xpath = "//input[@name='remarks3']")
        public UnityWebElement textBoxremarks3;
          
          @FindBy(xpath = "//mat-select[@name='excludeFromNotices']")
          public UnityWebElement dropdownexcludeFromNotices;
            
            @FindBy(xpath = "//mat-select[@name='excludeFromEmailNotices']")
          public UnityWebElement dropdownexcludeFromEmailNotices;

            @FindBy(xpath = "//mat-select[@name='relationship']")
            public UnityWebElement dropdownrelationship;
              
              @FindBy(xpath = "//mat-select[@name='sbrInterestedParty']")
            public UnityWebElement dropdownsbrInterestedParty;
	      
	@FindBy(xpath = "//input[@name='networkingMatrixLevel']")
	public UnityWebElement lookupNetMatrixLevel;
	
	@FindBy(xpath="//mat-select[@name='noTaxReporting']")
	public UnityWebElement dropdownNoTaxReporting ;
	      
	@FindBy(xpath="//mat-select[@name='otherReqForms']")
	public UnityWebElement dropdownOtherReqForms ;
	      
	@FindBy(xpath="//mat-select[@name='othTaxReports']")
	public UnityWebElement dropdownOthTaxReports ;
	      
	@FindBy(xpath="//mat-select[@name='taxLetter1']")
	public UnityWebElement dropdownTaxLetter1 ;
	      
	@FindBy(xpath="//mat-select[@name='taxLetter2']")
	public UnityWebElement dropdownTaxLetter2 ;
	      
	@FindBy(xpath="//mat-select[@name='taxLetter3']")
	public UnityWebElement dropdownTaxLetter3 ;
	      
	@FindBy(xpath="//mat-select[@name='suppressTXWorksheet']")
	public UnityWebElement dropdownsuppressTXWorksheet ;
	
	@FindBy(xpath = "//mat-select[@name='bi7OrPi4AcctOpenDate']")
	public UnityWebElement dropdownBi7OrPi4AcctOpenDate;
	
	@FindBy(xpath = "//input[@name='incomeCashAmountDollar']")
    public UnityWebElement textBoxIncomeCashAmountDollar;
	
	@FindBy(xpath = "//mat-select[@name='investorsViewEligible']")
	public UnityWebElement dropdownInvestorsViewEligible;
	
	@FindBy(xpath = "//input[@name='invManagerClientId']")
	public UnityWebElement dropdownInvManagerClientId;
	
	@FindBy(xpath = "//mat-select[@name='bi7OrPi4AcctOpenDate']")
	public UnityWebElement dropdownOpenDate;
              
	@FindBy(xpath = "//input[@name='amount']")
	public UnityWebElement txtAmount;
	
	@FindBy(xpath = "//input[@name='returnExpectation']")
    public UnityWebElement lookUpReturnExpectation;
      
      @FindBy(xpath = "//input[@name='riskTolerance']")
    public UnityWebElement lookUpRiskTolerance;
      
      @FindBy(xpath = "//input[@name='investmentHorizon']")
    public UnityWebElement lookUpInvestmentHorizon;
      
      @FindBy(xpath = "//input[@name='liquidityNeeds']")
    public UnityWebElement lookUpLiquidityNeeds;
      
      @FindBy(xpath = "//input[@name='legalRestrictions']")
    public UnityWebElement textBoxLegalRestrictions;
      
      @FindBy(xpath = "//input[@name='specialComments']")
    public UnityWebElement textBoxSpecialComments;
      
      @FindBy(xpath = "//input[@name='lastAicrReviewDate']")
    public UnityWebElement dateLastAICRDate;
      
      @FindBy(xpath = "//input[@name='estimatedFedWitholdingRate']")
    public UnityWebElement textBoxEstFedWth;
      
      @FindBy(xpath = "//mat-select[@name='excludeFromEmailNotices']")
    public UnityWebElement drowpdownExFromEmailNotice;
      
      @FindBy(xpath = "//mat-select[@name='adventTrustedNetworkEligible']")
      public UnityWebElement dropdownAdventTrustedNetworkEligible;

      @FindBy(xpath = "//input[@name='adventInvestmentManagerCode1']")
      public UnityWebElement lookupAdventInvestmentManagerCode1;
      
      @FindBy(xpath = "//input[@name='countryOfResidence']")
      public UnityWebElement lookupCountryOfResidence;
                    
      @FindBy(xpath = "//input[@name='holdMailOrInCareOf']")
      public UnityWebElement lookupHoldMailOrInCareOf;
                    
      @FindBy(xpath = "//input[@name='countryOfBirth']")
      public UnityWebElement lookupCountryOfBirth;
                    
      @FindBy(xpath = "//input[@name='usAddressProvided']")
      public UnityWebElement lookupUsAddressProvided;
                    
      @FindBy(xpath = "//input[@name='foreignTaxID']")
      public UnityWebElement txtForeignTaxId;
      
      @FindBy(xpath = "//mat-select[@name='excludeFromNotices']")
      public UnityWebElement dropdownExcludeFromNotices;
            
      @FindBy(xpath = "//mat-select[@name='excludeFromEmailNotices']")
      public UnityWebElement dropdownExcludeFromEmailNotices;
      
      @FindBy(xpath = "//input[@name='planNumber']")
      public UnityWebElement lookupPlanNumber;
        
        @FindBy(xpath = "//input[@name='blockNumber']")
      public UnityWebElement lookupblockNumber;
        
        @FindBy(xpath="//mat-select[@name='wealthcloudParticipation']")
        public UnityWebElement dropdownWealthCloudeParti ;



      @FindBy(xpath = "//mat-select[@name='createMoxyTaxLotFile']")
      public UnityWebElement dropdownCreateMoxyTaxLotFile;
      
      @FindBy(xpath = "//input[@name='cusipType']")
  		public UnityWebElement lookupcusipType;
      
      @FindBy(xpath = "//mat-select[@name='excludeFromNotices']")
    public UnityWebElement dropdownExFromNotice;
      
      @FindBy(xpath = "//input[@name='interestedParty']")
    public UnityWebElement lookUpInterestedParty;
      
      @FindBy(xpath = "//input[@name='excludeFromEmailNotices']")
    public UnityWebElement lookUpExFromEmailNotice;
      
      @FindBy(xpath = "//input[@name='excludeFromNotices']")
    public UnityWebElement lookUpExFromNotice;
      
      @FindBy(xpath = "//input[@name='trmsEligible']")
    public UnityWebElement lookUpTRMSEligible;
      
      @FindBy(xpath = "//input[@name='tmmsEligible']")
    public UnityWebElement lookUpTMMSEligible;
      
      @FindBy(xpath = "//input[@name='costCenterNumber']")
    public UnityWebElement lookUpCCNumber;
      
      @FindBy(xpath = "//input[@name='excludeFromGLInterface']")
    public UnityWebElement lookUpEGLInter;

	@FindBy(xpath = "//input[@name='portfolioNumber']")
    public UnityWebElement lookupPortfolioNumber;
	    
	@FindBy(xpath="//mat-select[@name='checkfreeInterestedParty']")
	public UnityWebElement dropdownCheckFreeInterestedParty;
	                 
	@FindBy(xpath = "//input[@name='paymentDate']")
    public UnityWebElement textBoxPaymentDate;
	
	@FindBy(xpath = "//input[@name='accountShortTitle']")
    public UnityWebElement textBoxAccountShortTitle;
       
    @FindBy(xpath = "//input[@name='accountLongTitle1of5']")
    public UnityWebElement textBoxAccountLongTitle1;
       
    @FindBy(xpath = "//input[@name='accountLongTitle2of5']")
    public UnityWebElement textBoxAccountLongTitle_2;
    
    @FindBy(xpath="//mat-select[@name='adventParticipant']")
    public UnityWebElement dropdownAdventParticipant;
        
    @FindBy(xpath="//input[@name='adventClientPortFileName']")
    public UnityWebElement textboxAdventClientPortFileName;
        
    @FindBy(xpath="//input[@name='advAcctName1']")
    public UnityWebElement textboxAdAcctName1;
        
    @FindBy(xpath="//input[@name='advAcctName2']")
    public UnityWebElement textboxAdAcctName2;
        
    @FindBy(xpath="//input[@name='advAcctName3']")
    public UnityWebElement textboxAdAcctName3;
        
    @FindBy(xpath="//mat-select[@name='incAndPrinForPerforrmance']")
    public UnityWebElement dropdownGrpIncPrinForPerf;
        
    @FindBy(xpath="//mat-select[@name='legalAuthority']")
    public UnityWebElement dropdownLegAuthority;
        
    @FindBy(xpath="//input[@name='intPartyNumberForAccount']")
    public UnityWebElement lookupIntPartyNumberForAccount;
    
    @FindBy(xpath = "//input[@name='userDefinedField1']")
    public UnityWebElement textBoxUserDefinedField1;
       
    @FindBy(xpath = "//input[@name='userDefinedField2']")
    public UnityWebElement textBoxUserDefinedField2;
       
    @FindBy(xpath = "//input[@name='userDefinedField3']")
    public UnityWebElement textBoxUserDefinedField3;
       
    @FindBy(xpath = "//input[@name='userDefinedField4']")
    public UnityWebElement textBoxUserDefinedField4;
       
    @FindBy(xpath = "//input[@name='userDefinedField5']")
    public UnityWebElement textBoxUserDefinedField5;
       
	@FindBy(xpath = "//input[@name='longName2']")
	public UnityWebElement textBoxLongName2;
	       
	@FindBy(xpath = "//input[@name='longName3']")
	public UnityWebElement textBoxLongName3;
	
	@FindBy(xpath = "//input[@name='registerNum']")
    public UnityWebElement lookupRegisterNum;

    @FindBy(xpath = "//input[@name='participantNum']")
    public UnityWebElement lookupParticipantNum;

    @FindBy(xpath = "//input[@name='plan']")
    public UnityWebElement lookupPlan;

    @FindBy(xpath = "//input[@name='employer']")
    public UnityWebElement lookupEmployer;

    @FindBy(xpath = "//input[@name='accountForDeposit']")
    public UnityWebElement textBoxAccountForDeposit;

    @FindBy(xpath = "//input[@name='transitRoutingCode']")
    public UnityWebElement lookupTransitRoutingCode;

    @FindBy(xpath = "//mat-select[@name='receivingAccountType']")
    public UnityWebElement dropdownReceivingAccountType;

    @FindBy(xpath = "//input[@name='grossAmount']")
    public UnityWebElement textBoxGrossAmount;

    @FindBy(xpath = "//input[@name='source1FundNumber']")
    public UnityWebElement lookupSource1FundNumber;

    @FindBy(xpath = "//input[@name='source1MoneyType']")
    public UnityWebElement textBoxSource1MoneyType;

    @FindBy(xpath = "//input[@name='source1NonTaxableAmt']")
    public UnityWebElement textBoxSource1NonTaxableAmt;

    @FindBy(xpath = "//input[@name='taxpayerClassAbbrev']")
    public UnityWebElement lookupTaxpayerClassAbbrev;

    @FindBy(xpath = "//input[@name='departmentMeaningSequence']")
    public UnityWebElement lookupDepartmentMeaningSequence;

    @FindBy(xpath = "//input[@name='requestTypeMeaning']")
    public UnityWebElement lookupRequestTypeMeaning;

    @FindBy(xpath = "//div[@class='mat-form-field-infix']//textarea[@name='summary']")
    public UnityWebElement textBoxSummary;

    @FindBy(xpath = "//div[@class='mat-form-field-infix']//textarea[@name='description']")
    public UnityWebElement textBoxDescription;
	
	@FindBy(xpath = "//input[@name='code']")
	public UnityWebElement lookupcode;
	
	@FindBy(xpath = "//input[@name='internalDescriptionLine1']")
	public UnityWebElement lookupinternalDescriptionLine1;
	
	@FindBy(xpath = "//input[@name='rate']")
	public UnityWebElement lookuprate;
	
	@FindBy(xpath = "//input[@name='security']")
	public UnityWebElement lookupsecurity;
	
	@FindBy(xpath = "//input[@name='price']")
	public UnityWebElement lookupprice;
	
	@FindBy(xpath = "//input[@name='brokerId']")
	public UnityWebElement lookupbrokerId;

	@FindBy(xpath = "//input[@name='tradeDate']")
	public UnityWebElement lookuptradeDate;
	
	@FindBy(xpath = "//input[@name='traderAbbrev']")
	public UnityWebElement lookuptraderAbbrev;
	
	@FindBy(xpath = "//input[@name='contractualSettlementDate']")
	public UnityWebElement lookupcontractualSettlementDate;
	
	@FindBy(xpath = "//input[@name='registration']")
	public UnityWebElement lookupregistration;
	
	@FindBy(xpath = "//input[@name='salesPrice']")
	public UnityWebElement lookupsalesPrice;
	
	@FindBy(xpath = "//input[@name='totalUnits']")
	public UnityWebElement lookuptotalUnits;
	
	@FindBy(xpath = "//mat-select[@name='settlementMethod']")
	public UnityWebElement dropdownsettlementMethod;
	
	@FindBy(xpath = "(//input[@name='account'])[1]")
	public UnityWebElement lookupaccounts1;
	
	@FindBy(xpath = "//mat-select[@name='feeBase']")
	public UnityWebElement dropdownfeeBase;
	
	@FindBy(xpath = "//mat-select[@name='portfolio']")
	public UnityWebElement dropdownportfolio;
	
	@FindBy(xpath = "//mat-select[@name='lotSelection']")
	public UnityWebElement dropdownlotSelection;
	
	@FindBy(xpath = "//section[@align='start']//button")
	public UnityWebElement buttonaddaccountS;
	
	@FindBy(xpath = "//input[@name='registerNumber']")
	public UnityWebElement lookupregisterNumber;
	
	@FindBy(xpath = "//input[@name='securityGref']")
	public UnityWebElement lookupsecurityGref;
	
	@FindBy(xpath = "//input[@name='amortizationInstructions']")
	public UnityWebElement lookupamortizationInstructions;
	
	@FindBy(xpath = "//mat-radio-button//span[text()='Memo']")
	public UnityWebElement radioButtonMemo;
	
	@FindBy(xpath = "//input[@name='effectiveThroughDate']")
	public UnityWebElement textBoxeffectiveThroughDate;

	@FindBy(xpath = "//input[@name='effectiveFromDate']")
	public UnityWebElement textBoxeffectiveFromDate;

	@FindBy(xpath = "//input[@name='temporaryAddress1']")
	public UnityWebElement textBoxtemporaryAddress1;

	@FindBy(xpath = "//input[@name='transactionCategory']")
    public UnityWebElement lookupNameTransactionCategory;
    
	@FindBy(xpath = "//input[@name='transactionActivity']")
    public UnityWebElement lookupNameTransactionActivity;
    
	@FindBy(xpath = "//input[@name='department']")
    public UnityWebElement txtNameDepartment;
    
	@FindBy(xpath = "//input[@name='incomeCashAmount']")
    public UnityWebElement lookupNameIncomeCashAmount;
    
	@FindBy(xpath = "//input[@name='principalCashAmount']")
    public UnityWebElement lookupNamePrincipalCashAmount;
    
	@FindBy(xpath = "//input[@name='accountNumberRecv']")
    public UnityWebElement lookupNameReceivingAccount;
    
	@FindBy(xpath = "//input[@name='recvIncomeCashAmountDollar']")
    public UnityWebElement lookupNameReceivingIncomeCashAmountDollar;
    
	@FindBy(xpath = "//input[@name='recvPrincipalCashAmountDollar']")
    public UnityWebElement lookupNameReceivingPrincipalCashAmountDollar;
    
	@FindBy(xpath = "//input[@name='tickerSymbol']")
    public UnityWebElement lookupNameTickerSymbol; //WLSH
    
	@FindBy(xpath = "//input[@name='securityNumber']")
    public UnityWebElement lookupNameSecurityNumber;//000001149
    
	@FindBy(xpath = "//input[@name='sharesQuantity']")
    public UnityWebElement txtNameSharesQuantity;//1
    
	@FindBy(xpath = "//input[@name='clientGref']")
    public UnityWebElement lookupInterestedPartys;
	
	@FindBy(xpath = "//input[@name='paymentNumber']")
    public UnityWebElement lookupPaymentNumber;
	
	@FindBy(xpath = "(//input[@name='paymentNumber'])[1]")
    public UnityWebElement lookupPaymentNumber2;

	@FindBy(xpath = "//input[@name='mmfAccountType']")
    public UnityWebElement lookupMMFAccountType;
	
	@FindBy(xpath = "//input[@name='layoutNumberOfThisReview']")
	public UnityWebElement lookuLayoutNumberOfThisReview;
	
	@FindBy(xpath = "//mat-select[@name='eligibleForCoveredOptions']")
	public UnityWebElement lookupEligibleForCoveredOptions;
	
	@FindBy(xpath = "//mat-select[@name='eligibleForUncoveredOptions']")
	public UnityWebElement lookupEligibleForUnCoveredOptions;

	@FindBy(xpath = "//mat-select[@name='responsibility']")
	public UnityWebElement lookupResponsibility;
	
	@FindBy(xpath = "//input[@name='fundFee2ThreeYearsAgo']")
	public UnityWebElement textboxfundfee2;
	
	@FindBy(xpath = "//mat-select[@name='investmentReviewDate@cycleDateMonths']")
	public UnityWebElement lookuInvestmentReviewDatecycleDateMonths;
	
	@FindBy(xpath = "//mat-select[@name='investmentReviewDate@cycleDateDays']")
	public UnityWebElement lookuInvestmentReviewDatecycleDateDays;
	
	@FindBy(xpath = "//mat-select[@name='investmentReviewDate@cycleDateYears']")
	public UnityWebElement lookuInvestmentReviewDatecycleDateYears;
	
	@FindBy(xpath = "//mat-select[@name='investmentReviewDate@cycleDateMinusDays']")
	public UnityWebElement lookuInvestmentReviewDatecycleDateMinusDays;
	
	@FindBy(xpath = "//input[@name='investmentReviewDate@cycleDateOccursEvery']")
	public UnityWebElement lookupInvestmentReviewDatecycleDateOccursEvery;
	
	@FindBy(xpath = "//mat-select[@name='investmentReviewDate@cycleDateFrequency']")
	public UnityWebElement lookupInvestmentReviewDatecycleDateFrequency;

	
	@FindBy(xpath = "//input[@name='settlementDate']")
    public UnityWebElement dateNameSettlementDate;//02/22/2018
    
	@FindBy(xpath = "//input[@name='currentAssetLocation']")
    public UnityWebElement txtCurrentAssetLocation;//TST
    
	@FindBy(xpath = "//mat-select[@name='action']")
    public UnityWebElement selectActions;
    
	@FindBy(xpath = "//span[contains(@class,'mat-option-text')]/span")
    public UnityWebElement labelActionBuySell;
    
	@FindBy(xpath = "//mat-radio-button[.//*[normalize-space(text())='Shares']][1]")
    public UnityWebElement radiobuttonShares;
    
	@FindBy(xpath = "//input[@name='shares']")
    public UnityWebElement txtShares;

	
	@FindBy(xpath = "//mat-select[@name='masterInvestmentComplianceRptg']")
	public UnityWebElement lookupmasterInvestmentComplianceRptg;
	
	@FindBy(xpath = "//input[@name='invManagerClientId']")
	public UnityWebElement lookupinvManagerClientId;
	
	@FindBy(xpath = "//input[@name='invstCmpRptgMasterAcct']")
	public UnityWebElement lookupinvstCmpRptgMasterAcct;
	
	@FindBy(xpath = "//input[@name='fundFee3YearToDate']")
	public UnityWebElement lookupfundFee3YearToDate;
	
	@FindBy(xpath = "//input[@name='bankNumberNoContext']")
	public UnityWebElement lookupbank;
	
	@FindBy(xpath = "//input[@name='accountPrefix']")
	public UnityWebElement lookupaccountPrefix;
	
	@FindBy(xpath = "//input[@name='branchCodeDesignation']")
	public UnityWebElement lookupbranchCodeDesignation;
	
	@FindBy(xpath = "//button[@name='generateAccountNumber']")
	public UnityWebElement buttongenerateAccountNumber;
	
	@FindBy(xpath = "//input[@name='administrativeOfficer']")
	public UnityWebElement lookupadministrativeOfficer;
	
	@FindBy(xpath = "//input[@name='accountAlphabeticalListNumber']")
	public UnityWebElement lookupaccountAlphabeticalListNumber;
	
	@FindBy(xpath = "//input[@name='dateAccountOpened']")
	public UnityWebElement lookupdateAccountOpened;
	
	@FindBy(xpath = "//input[@name='accountShortTitle']")
	public UnityWebElement lookupaccountShortTitle;
	
	@FindBy(xpath = "//input[@name='accountLongTitle1']")
	public UnityWebElement lookupaccountLongTitle1;
	
	@FindBy(xpath = "//input[@name='reportOfTrustAssetsPTR283']")
	public UnityWebElement lookupreportOfTrustAssetsPTR283;
	
	@FindBy(xpath = "//input[@name='statementFormat']")
	public UnityWebElement lookupstatementFormat;
	
	@FindBy(xpath = "//input[@name='reportOfTrustAssetsNoOfAccounts']")
	public UnityWebElement lookupreportOfTrustAssetsNoOfAccounts;
	
	 @FindBy(xpath = "//input[@name='newTaxYearEnd']")
	    public UnityWebElement datenewTaxYearEnd;
	 
	 @FindBy(xpath = "//input[@name='receivingPortfolio']")
	    public UnityWebElement lookupReceivingPortfolio;
	 
	 @FindBy(xpath = "//input[@name='taxStatus']")
	    public UnityWebElement lookuptaxStatus;
	 
	 @FindBy(xpath = "//mat-select[@name='taxGainTo']")
		public UnityWebElement dropdowntaxGainTo;
	 
	 @FindBy(xpath = "//mat-select[@name='taxIncomeTo']")
		public UnityWebElement dropdowntaxIncomeTo;
	 
	 @FindBy(xpath = "//mat-select[@name='prDistribution']")
		public UnityWebElement dropdownprDistribution;
	 
	 @FindBy(xpath = "//mat-select[@name='fiveTimesFivePowerRightOfWithdraw']")
		public UnityWebElement dropdownfiveTimesFivePowerRightOfWithdraw;
	 
	@FindBy(xpath = "//mat-select[@name='selectRelationship']")
		public UnityWebElement dropdownSelectRelationship;
	
	@FindBy(xpath = "//mat-select[@name='pr480_7FormRecipient']")
		public UnityWebElement dropdownFormRecipient;
	
	@FindBy(xpath = "//mat-select[@name='cipRelationship']")
	public UnityWebElement dropdowncipRelationship;
	
	@FindBy(xpath = "//mat-select[@name='redFlag']")
	public UnityWebElement dropdownredFlag;
	
	@FindBy(xpath = "//mat-select[@name='riskedRankRel']")
	public UnityWebElement dropdownriskedRankRel;

	@FindBy(xpath = "//input[@name='interestedParty']")
	public UnityWebElement dropdownInterestedParty;

	@FindBy(xpath = "//input[@name='blockNumber']")
		public UnityWebElement dropdownBlockNumber;
		
	@FindBy(xpath = "//mat-select[@name='ticklerDate@cycleDateMonths']")
		public UnityWebElement selectTicklerDateCycleDateMonths;
		
	@FindBy(xpath = "//mat-select[@name='ticklerDate@cycleDateDays']")
		public UnityWebElement selectTicklerDateCycleDateDays;
		
	@FindBy(xpath = "//mat-select[@name='ticklerDate@cycleDateYears']")
		public UnityWebElement selectTicklerDateCycleDateYears;
		
	@FindBy(xpath = "//input[@name='ticklerDate@cycleDateOccursEvery']")
		public UnityWebElement selectTicklerDateCycleDateOccursEvery;
		
	@FindBy(xpath = "//mat-select[@name='ticklerDate@cycleDateFrequency']")
		public UnityWebElement selectTicklerDateCycleDateFrequency;

	@FindBy(xpath = "//input[@name='registerNumber']")
	public UnityWebElement lookupRegisterNumber;
		
	@FindBy(xpath = "//input[@name='payableDate']")
		public UnityWebElement textBoxPayableDate;
	
	@FindBy(xpath = "//input[@name='amount']")
		public UnityWebElement lookupAmount;
		
	@FindBy(xpath = "//input[@name='payee']")
	public UnityWebElement lookupPayee;
	
	@FindBy(xpath = "//input[@name='amount']")
		public UnityWebElement lookupamount;
		
	@FindBy(xpath = "//input[@name='disbursementCode']")
		public UnityWebElement lookupDisbursementCode;

	@FindBy(xpath = "//input[@name='interestedParty']")
	public UnityWebElement lookupInterestedParty;
		
	@FindBy(xpath = "//mat-select[@name='selectRelationship']")
	public UnityWebElement lookupselectRelationship;

	@FindBy(xpath = "//input[@name='riskReason']")
	public UnityWebElement lookupRiskReason;
		
	@FindBy(xpath = "//mat-select[@name='subjectToCip']")
		public UnityWebElement lookupSubjectToCip;
		
	@FindBy(xpath = "//input[@name='redFlag']")
		public UnityWebElement lookupRedFlag;
		
	@FindBy(xpath = "//input[@name='riskLevel']")
		public UnityWebElement lookupRiskLevel;
	
	@FindBy(xpath = "//mat-select[@name='valuationDateAndCycle@cycleDateMonths']")
	public UnityWebElement lookupCycleDateMonths;
	
	@FindBy(xpath = "//mat-select[@name='valuationDateAndCycle@cycleDateDays']")
	public UnityWebElement lookupCycleDateDays;
	
	@FindBy(xpath = "//mat-select[@name='valuationDateAndCycle@cycleDateYears']")
	public UnityWebElement lookupCycleDateYears;
	
	@FindBy(xpath = "//input[@name='valuationDateAndCycle@cycleDateOccursEvery']")
	public UnityWebElement lookupCycleDateOccursEvery;
	
	@FindBy(xpath = "//mat-select[@name='valuationDateAndCycle@cycleDateFrequency']")
	public UnityWebElement lookupCycleDateFrequency;
	
	@FindBy(xpath = "//mat-select[@name='firstRateParticipation']")
	public UnityWebElement lookupFirstRateParticipation;
		
	@FindBy(xpath = "//input[@name='blockNumber']")
	public UnityWebElement textboxBlockNumber;
	
	@FindBy(xpath = "//input[@name='fromWhoReceived']")
	public UnityWebElement textboxFromWhoReceived;
	
	@FindBy(xpath = "//input[@name='incomeAmount']")
	public UnityWebElement textboxIncomeAmount;
	
	
	@FindBy(xpath = "//mat-select[@name='dateOfReceipt@cycleDateMonths']")
	public UnityWebElement lookupReceiptcycleDateMonths;
	
	@FindBy(xpath = "//mat-select[@name='dateOfReceipt@cycleDateDays']")
	public UnityWebElement lookupReceiptcycleDateDays;
	
	@FindBy(xpath = "//mat-select[@name='dateOfReceipt@cycleDateYears']")
	public UnityWebElement lookupReceiptcycleDateYears;
	
	@FindBy(xpath = "//input[@name='dateOfReceipt@cycleDateOccursEvery']")
	public UnityWebElement lookupReceiptcycleDateOccursEvery;
	
	@FindBy(xpath = "//mat-select[@name='dateOfReceipt@cycleDateFrequency']")
	public UnityWebElement lookupReceiptcycleDateFrequency;
	
	@FindBy(xpath = "//input[@name='trustType']")
	public UnityWebElement lookupTrustType;
	
	@FindBy(xpath = "//input[@name='revocability']")
	public UnityWebElement lookupRevocability;
	
	@FindBy(xpath = "//input[@name='domesticReportingIndicator']")
	public UnityWebElement lookupDomesticReportingIndicator;
	
	@FindBy(xpath = "//input[@name='statementType1099']")
	public UnityWebElement lookupStatementType1099;
	
	@FindBy(xpath = "//input[@name='associateCopyIpNumber1']")
	public UnityWebElement textboxAssociateCopyIpNumber1;
	
	@FindBy(xpath = "//input[@name='description']")
	public UnityWebElement textboxDescription;
	
	@FindBy(xpath = "//input[@name='specReserveAmt']")
	public UnityWebElement textboxSpecReserveAmt;
	
	@FindBy(xpath = "//input[@name='activityCode']")
	public UnityWebElement lookupActivityCode;
	
	
	@FindBy(xpath = "//input[contains(@name,'transactionCategory')]")
	public UnityWebElement lookupTransactionCategory;

	@FindBy(xpath = "//input[contains(@name,'transactionActivity')]")
	public UnityWebElement lookupTransactionActivity;

	@FindBy(xpath = "//input[contains(@name,'incomeCashAmount')]")
	public UnityWebElement textBoxIncomeCashAmount;

	@FindBy(xpath = "//input[contains(@name,'principalCashAmount')]")
	public UnityWebElement textBoxPrincipalCashAmount;

	@FindBy(xpath = "//input[contains(@name,'postingDate')]")
	public UnityWebElement textBoxPostingDate;

	@FindBy(xpath = "//input[contains(@name,'transactionReportingCode')]")
	public UnityWebElement lookupTransactionReportingCode;

	@FindBy(xpath = "//input[@name='securityNumber']")
	public UnityWebElement lookupSecurityNumber;

	@FindBy(xpath = "//input[contains(@name,'typeOfCheckOrFundsType')]")
	public UnityWebElement lookupTypeOFCheckFundsType;

	@FindBy(xpath = "//textarea[contains(@name,'standardDescription')]")
	public UnityWebElement textBoxStandardDescription;
	
	@FindBy(xpath = "//input[contains(@name,'paymentFrequencyCode')]")
	public UnityWebElement lookupPaymentFrequencyCode;
	
	@FindBy(xpath = "//input[contains(@name,'paymentFrequencyDay')]")
	public UnityWebElement lookupPaymentFrequencyDay;
	
	@FindBy(xpath = "//mat-select[@name='dateAndCycle@cycleDateMonths']")
	public UnityWebElement lookupDateAndCycleDateMonths1;
	
	@FindBy(xpath = "//mat-select[@name='dateAndCycle@cycleDateDays']")
	public UnityWebElement lookupcycleDateDays;
	
	@FindBy(xpath = "//mat-select[@name='dateAndCycle@cycleDateYears']")
	public UnityWebElement lookupcycleDateYears;
	
	@FindBy(xpath = "//mat-select[@name='dateAndCycle@cycleDateMinusDays']")
	public UnityWebElement lookupcycleDateMinusDays;
	
	@FindBy(xpath = "//input[@name='dateAndCycle@cycleDateOccursEvery']")
	public UnityWebElement lookupcycleDateOccursEvery;
	
	@FindBy(xpath = "//mat-select[@name='dateAndCycle@cycleDateFrequency']")
	public UnityWebElement lookupcycleDateFrequency;
	
	@FindBy(xpath = "//mat-select[@name='excludeFromFeeDisclosure']")
	public UnityWebElement lookupexcludeFromFeeDisclosure;
	
	@FindBy(xpath = "//mat-select[@name='excludeFundLevelFees']")
	public UnityWebElement lookupexcludeFundLevelFees;
	
	
	@FindBy(xpath = "//mat-select[@name='takeInvMgmtFees']")
	public UnityWebElement lookuptakeInvMgmtFees;
	
	@FindBy(xpath = "//input[@name='amortizationInstructions']")
	public UnityWebElement CheckboxAmortizationInstructions;


	@FindBy(xpath = "//input[@name='sourcePortfolio']")
	public UnityWebElement lookupSrcPortfolio;
	
	@FindBy(xpath = "//input[@name='mutualFundPurchaseRegCode']")
	public UnityWebElement lookupmutualFundPurchaseRegCode;

	// **aprajita**
	// Account Corporate Responsibility Add
	@FindBy(xpath = "//input[contains(@name,'affiliationTypeAbbrev')]")
	public UnityWebElement lookupAffiliationType;

	@FindBy(xpath = "//input[contains(@name,'employeeAbbrev')]")
	public UnityWebElement lookupEmployee;

	// **monika**
	@FindBy(xpath = "//input[@name='clientGref']")
	public UnityWebElement lookupClient;

	// **nick**
	@FindBy(xpath = "//input[@name='masterAccount']")
	public UnityWebElement lookupMasterAccount;

	// **niranjan**
	@FindBy(xpath = "//input[@name='portfolioName']")
	public UnityWebElement textPortfolio;
	
	@FindBy(xpath = "//input[@name='managedMoneyInstrumentId']")
	public UnityWebElement textmanagedMoneyInstrumentId;
	
	@FindBy(xpath = "//input[@name='mfCusipRegPortfolio1']")
	public UnityWebElement textmfCusipRegPortfolio1;
	
	@FindBy(xpath = "//input[@name='mfCusipRegPortfolio2']")
	public UnityWebElement textmfCusipRegPortfolio2;
	
	@FindBy(xpath = "//input[@name='mfCusipRegPortfolio3']")
	public UnityWebElement textmfCusipRegPortfolio3;
	
	@FindBy(xpath = "//input[@name='mfCusipRegPortfolio4']")
	public UnityWebElement textmfCusipRegPortfolio4;
	
	@FindBy(xpath = "//input[@name='mfCusipRegPortfolio5']")
	public UnityWebElement textmfCusipRegPortfolio5;

	@FindBy(xpath = "//input[@name='affiliationTypeDesc']")
	public UnityWebElement textAffiliationType;

	@FindBy(xpath = "//input[@name='clientName']")
	public UnityWebElement textClientName;

	// **rohini**
	// Acc_Tax_Info
	@FindBy(xpath = "//input[@name='effectiveDate']")
	public UnityWebElement textBoxEffectiveDate;

	@FindBy(xpath = "//input[@name='taxpayerClassAbbrev']")
	public UnityWebElement lookupTaxpayerClass;

	// Account Add
	@FindBy(xpath = "//input[@name='accountModelNum']")
	public UnityWebElement lookupAccountModelNum;

	@FindBy(xpath = "//input[@name='branchAbbrev']")
	public UnityWebElement lookupBranch;

	@FindBy(xpath = "//input[@name='accountOwnerGref']")
	public UnityWebElement lookupAccountOwner;

	@FindBy(xpath = "//input[@name='name']")
	public UnityWebElement textBoxName;

	@FindBy(xpath = "//input[@name='adminName']")
	public UnityWebElement lookupAdministrator;

	@FindBy(xpath = "//input[@name='acNumber']")
	public UnityWebElement textBoxAccountNumber;

	@FindBy(xpath = "//input[@name='accountToAdd']")
	public UnityWebElement lookupAccountToAdd;
	
	@FindBy(xpath = "//input[@name='blockNumber']")
	public UnityWebElement lookupBlockNumber;

	// *praveena*
	// EBST
	@FindBy(xpath = "//input[@name='formatNumber']")
	public UnityWebElement lookupFormatNumber;
	
	@FindBy(xpath = "//mat-select[@name='investcloudParticipation']")
	public UnityWebElement dropdownInvestCloudParticipation;

	@FindBy(xpath = "//mat-select[@name='statementDate@cycleDateMonths']")
	public UnityWebElement dropdownCycleDateMonths;

	@FindBy(xpath = "//mat-select[@name='statementDate@cycleDateDays']")
	public UnityWebElement dropdownCycleDateDays;

	@FindBy(xpath = "//mat-select[@name='statementDate@cycleDateYears']")
	public UnityWebElement dropdownCycleDateYears;

	@FindBy(xpath = "//input[@name='statementDate@cycleDateOccursEvery']")
	public UnityWebElement dropdownCycleDateOccursEvery;

	@FindBy(xpath = "//mat-select[@name='statementDate@cycleDateFrequency']")
	public UnityWebElement dropdownCycleDateFrequency;

	@FindBy(xpath = "//input[@name='numberOfCopies']")
	public UnityWebElement textBoxNumberOfCopies;

	@FindBy(xpath = "//input[@name='disposition']")
	public UnityWebElement lookupDisposition;

	@FindBy(xpath = "//mat-select[@name='proofCopyRequested']")
	public UnityWebElement dropdownProofCopyRequested;

	@FindBy(xpath = "//mat-select[@name='finalCopyRequested']")
	public UnityWebElement dropdownFinalCopyRequested;

	@FindBy(xpath = "//mat-select[@name='markCompleteAfterPrinting']")
	public UnityWebElement dropdownMarkCompleteAfterPrinting;

	@FindBy(xpath = "//mat-select[@name='displayCUSIPNumberOfProofCopy']")
	public UnityWebElement dropdownDisplayCUSIPNumberOfProofCopy;

	@FindBy(xpath = "//mat-select[@name='suppressColOfAdjustmentsInSchOfIncomeOnProofCopy']")
	public UnityWebElement dropdownSuppressColOfAdjustmentsInSchOfIncomeOnProofCopy;

	@FindBy(xpath = "//mat-select[@name='holdForAudit']")
	public UnityWebElement dropdownHoldForAudit;

	// **Fund_account**
	@FindBy(xpath = "//input[@name='principalCash']")
	public UnityWebElement textBoxPrincipalCash;

	@FindBy(xpath = "//input[@name='incomeCash']")
	public UnityWebElement textBoxIncomeCash;

	// *Monika -Required Information

	@FindBy(xpath = "//input[@name='accountLongTitle2']")
	public UnityWebElement textBoxAccountLongTitle2;

	@FindBy(xpath = "//input[@name='accountLongTitle3']")
	public UnityWebElement textBoxAccountLongTitle3;

	@FindBy(xpath = "//input[@name='reportOfTrustAssetsPtr283']")
	public UnityWebElement lookupRptOfTrustAssets;

	// *Monika -Statement Information

	@FindBy(xpath = "//input[@name='performVendorOnStatements']")
	public UnityWebElement lookupPerformVendoronStatements;

	@FindBy(xpath = "//input[@name='consolidateFeesOnStatements']")
	public UnityWebElement lookupConsolidateFeesStatements;

	@FindBy(xpath = "//input[@name='performMeasurementSchedule']")
	public UnityWebElement lookupPerformMeasurementSchedule;

	@FindBy(xpath = "//input[@name='interim1StatementPriority']")
	public UnityWebElement textBoxInterim1StatementPriority;

	@FindBy(xpath = "//input[@name='annualStatementPriority']")
	public UnityWebElement textBoxAnnualStatementPriority;

	// *Monika -Operational information
	@FindBy(xpath = "//input[@name='proxyVotingCode']")
	public UnityWebElement lookupProxyVotingCode;

	@FindBy(xpath = "//input[@name='outsideManager']")
	public UnityWebElement textBoxOutsideManager;

	@FindBy(xpath = "//input[@name='taxLotSelectionMethod']")
	public UnityWebElement lookupTaxLotSelecion;

	@FindBy(xpath = "//input[@name='proxyAccountGroupCode']")
	public UnityWebElement textBoxProxyAccountGrpCode;

	// Pooja
	// TD Recipient delete/EDIT
	@FindBy(xpath = "//input[@name='recipientNumber']")
	public UnityWebElement lookuprecipientNumber;

	// TD Operational Info Transaction info
	@FindBy(xpath = "//input[@name='restrictedTransactionEntryCode']")
	public UnityWebElement lookuptransactionEntryCode;

	// Abhay
	@FindBy(xpath = "//input[@name='customerId1']")
	public UnityWebElement textCustomerID;

	@FindBy(xpath = "//input[@name='financialSummaryCategory']")
	public UnityWebElement lookupFinanancialSummaryCategory;

	// **nick**
	@FindBy(xpath = "//input[@name='nameAddressKey']")
	public UnityWebElement lookupNameAddressKey;
	
	@FindBy(xpath = "//input[@name='interestedParty']")
	public UnityWebElement lookupinterestedParty;
	
	@FindBy(xpath = "//input[@name='backupWithRequired']")
	public UnityWebElement lookupbackupWithRequired;

	@FindBy(xpath = "//input[@name='typeOfBackupWith']")
	public UnityWebElement lookuptypeOfBackupWith;
	
	@FindBy(xpath = "//input[@name='masterAccount']")
	public UnityWebElement lookupmasteraccount;
	
	@FindBy(xpath = "//button[@name='refreshButton']")
	public UnityWebElement buttonrefresh;
	
	@FindBy(xpath = "//input[@name='institutionCode']")
	public UnityWebElement lookupinstitutionCode;
	
	@FindBy(xpath = "//input[@name='accountToAdd']")
	public UnityWebElement lookupaccountNumber;
	
	@FindBy(xpath = "//input[@name='accountToDelete']")
	public UnityWebElement lookupaccountToDelete;
	
	@FindBy(xpath = "//section[@align='end']//button")
	public UnityWebElement buttonaddaccount;
	
	@FindBy(xpath = "//input[@name='cusip']")
	public UnityWebElement lookupcusip;
	
	@FindBy(xpath = "//input[@name='taxAcquisitionDate']")
	public UnityWebElement lookuptaxAcquisitionDate;
	
	@FindBy(xpath = "//input[@name='units']")
	public UnityWebElement lookupunits;
	
	@FindBy(xpath = "//input[@name='bookValue']")
	public UnityWebElement lookupbookValue;
	
	@FindBy(xpath = "//input[@name='portfolio']")
	public UnityWebElement lookupportfolio;
	

	@Override
	public void waitForPageToLoad() {
		startTime = System.currentTimeMillis();
		if (!super.isPageLoaded(driver))
			Assert.fail("Timed out after " + AppConstants.PAGE_LOAD_TIMEOUT + " seconds\n");
	}
}
