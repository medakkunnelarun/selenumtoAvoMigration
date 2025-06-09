package com.unity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.unity.constants.AppConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityWebElement;

public class FormRelationshipPage extends BaseTestPage {
	WebDriver driver;

	public FormRelationshipPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}
	
	//Insurance Agent - UD
	@FindBy(xpath = "//mat-select[@name='i_3']/div/div[2]/div")
	public UnityWebElement dropdownUserDefined3I;
	
	@FindBy(xpath="//input[@name='i_5']")
	public UnityWebElement lookupUserDefined5I;
	
	@FindBy(xpath = "//input[@name='i_6']")
	public UnityWebElement textBoxUserDefined6I;
	
	@FindBy(xpath = "//input[@name='i_2']")
	public UnityWebElement textBoxMoney;
	
	@FindBy(xpath = "//input[@name='i_1-1']")
	public UnityWebElement textBoxName;
	
	// Plan Sponsor - UD
	@FindBy(xpath = "//mat-select[@name='s_2']/div/div[2]/div")
	public UnityWebElement dropdownUserDefined2S;
	
	@FindBy(xpath="//input[@name='s_5']")
	public UnityWebElement lookupUserDefined5S;
	
	@FindBy(xpath="//input[@name='s_6']")
	public UnityWebElement lookupUserDefined6S;
	
	@FindBy(xpath = "//input[@name='s_4']")
	public UnityWebElement textBoxUserDefined4S;
	
	@FindBy(xpath = "//input[@name='s_3']")
	public UnityWebElement textBoxUserDefined3S;
	
	@FindBy(xpath = "//input[@name='s_1-1']")
	public UnityWebElement textBoxUserDefined1S;
	
	// Attorney - UD
	@FindBy(xpath = "//mat-select[@name='a_4']/div/div[2]/div")
	public UnityWebElement dropdownValidAttorney;
	
	@FindBy(xpath="//input[@name='a_5']")
	public UnityWebElement lookupDisbTableValueAttorney;
	
	@FindBy(xpath="//input[@name='a_6']")
	public UnityWebElement lookupTableValueAttorney;
	
	@FindBy(xpath = "//input[@name='a_2']")
	public UnityWebElement textBoxAmountAttorney;
	
	@FindBy(xpath = "//input[@name='a_3']")
	public UnityWebElement textBoxDateEffectiveAttorney;
	
	@FindBy(xpath = "//input[@name='a_1-1']")
	public UnityWebElement textBoxAttorneyPartyName;
	
	// Co-Fiduciary
	@FindBy(xpath = "//mat-select[@name='c_4']/div/div[2]/div")
	public UnityWebElement dropdownValidCofiduciary;
	
	@FindBy(xpath="//input[@name='c_5']")
	public UnityWebElement lookupDisbTableValueCofiduciary;
	
	@FindBy(xpath = "//input[@name='c_3']")
	public UnityWebElement textBoxEffectiveDateCofiduciary;
	
	@FindBy(xpath = "//input[@name='c_2']")
	public UnityWebElement textBoxAmountCofiduciary;
	
	@FindBy(xpath = "//input[@name='c_1-1']")
	public UnityWebElement textBoxCofiduciaryName;
	
	//Actuary
	@FindBy(xpath = "//mat-select[@name='y_4']/div/div[2]/div")
	public UnityWebElement dropdownValidActuary;
	
	@FindBy(xpath="//input[@name='y_5']")
	public UnityWebElement lookupDisbTableActuary;
	
	@FindBy(xpath = "//input[@name='y_3']")
	public UnityWebElement textBoxDateEffectiveActuary;
	
	@FindBy(xpath = "//input[@name='y_2']")
	public UnityWebElement textBoxAmountActuary;
	
	@FindBy(xpath = "//input[@name='y_1-1']")
	public UnityWebElement textBoxActuaryName;
	
	@FindBy(xpath="//input[@name='y_6']")
	public UnityWebElement lookupTableValueActuary;
	
	//Beneficiary
	@FindBy(xpath = "//input[@name='b_1-1']")
	public UnityWebElement textBoxBeneficiaryName;
	
	@FindBy(xpath = "//input[@name='b_2']")
	public UnityWebElement textBoxAmountBeneficiary;
	
	@FindBy(xpath = "//input[@name='b_3']")
	public UnityWebElement textBoxDateEffectiveBeneficiary;
	
	@FindBy(xpath = "//mat-select[@name='b_4']/div/div[2]/div")
	public UnityWebElement dropdownValidBeneficiary;
	
	@FindBy(xpath="//input[@name='b_5']")
	public UnityWebElement lookupDisbTableValueBeneficiary;
	
	@FindBy(xpath="//input[@name='b_6']")
	public UnityWebElement lookupTableValueBeneficiary;
	
	@FindBy(xpath = "//input[@name='b_12-1']")
	public UnityWebElement textBoxTelephoneNumber1;
	
	@FindBy(xpath = "//input[@name='b_12-2']")
	public UnityWebElement textBoxTelephoneNumber2;
	
	@FindBy(xpath = "//input[@name='b_12-3']")
	public UnityWebElement textBoxTelephoneNumber3;
	
	@FindBy(xpath = "//input[@name='b_12-4']")
	public UnityWebElement textBoxTelephoneNumber4;
	
	@FindBy(xpath = "//input[@name='b_12-5']")
	public UnityWebElement textBoxTelephoneNumber5;
	
	@FindBy(xpath = "//input[@name='b_14-1']")
	public UnityWebElement textBoxOfficeTelephoneNumber1;
	
	@FindBy(xpath = "//input[@name='b_16-1']")
	public UnityWebElement textBoxOfficeTelephoneNumber2;
	
	@FindBy(xpath = "//input[@name='b_15-1']")
	public UnityWebElement textBoxHomeTelephoneNumber;
	
	@FindBy(xpath = "//input[@name='b_17-1']")
	public UnityWebElement textBoxCellTelephoneNumber;
	
	@FindBy(xpath = "//mat-select[@name='p_2']/div/div[2]/div")
	public UnityWebElement dropdownUserDefined2P;
	
	@FindBy(xpath="//input[@name='p_5']")
	public UnityWebElement lookupUserDefined5P;
	
	@FindBy(xpath="//input[@name='p_6']")
	public UnityWebElement lookupUserDefined6P;
	
	@FindBy(xpath = "//input[@name='p_3']")
	public UnityWebElement textBoxUserDefined3P;
	
	@FindBy(xpath = "//input[@name='p_4']")
	public UnityWebElement textBoxUserDefined4P;
	
	@FindBy(xpath = "//input[@name='p_1-1']")
	public UnityWebElement textBoxUserDefined1P;
	
	// Donor - UD
	@FindBy(xpath = "//mat-select[@name='d_4']/div/div[2]/div")
	public UnityWebElement dropdownValidDonor;
	
	@FindBy(xpath="//input[@name='d_5']")
	public UnityWebElement lookupDisbTableValueDonor;
	
	@FindBy(xpath="//input[@name='d_6']")
	public UnityWebElement lookupTableValueDonor;
	
	@FindBy(xpath = "//input[@name='d_3']")
	public UnityWebElement textBoxDateEffectiveDonor;
	
	@FindBy(xpath = "//input[@name='d_2']")
	public UnityWebElement textBoxAmountDonor;
	
	@FindBy(xpath = "//input[@name='d_1-1']")
	public UnityWebElement textBoxDonorName;

	
	@FindBy(xpath = "//mat-select[@name='t_4']/div/div[2]/div")
	public UnityWebElement dropdownValidAccountant;
	
	@FindBy(xpath="//input[@name='t_5']")
	public UnityWebElement lookupDispTable;
	
	@FindBy(xpath="//input[@name='t_6']")
	public UnityWebElement lookupTableValue;
	
	@FindBy(xpath = "//input[@name='t_3']")
	public UnityWebElement textBoxDateEffective;
	
	@FindBy(xpath = "//input[@name='t_2']")
	public UnityWebElement textBoxAmount;
	
	@FindBy(xpath = "//input[@name='t_1-1']")
	public UnityWebElement textBoxNameOfAccountant;
	
	// Investment Advisor - UD
	@FindBy(xpath = "//mat-select[@name='v_5']/div/div[2]/div")
	public UnityWebElement dropdownUserDefined5V;
	
	@FindBy(xpath="//input[@name='v_3']")
	public UnityWebElement lookupUserDefined3V;
	
	@FindBy(xpath = "//input[@name='v_6']")
	public UnityWebElement textBoxUserDefined6V;
	
	@FindBy(xpath = "//input[@name='v_2']")
	public UnityWebElement textBoxUserDefined2V;
	
	@FindBy(xpath = "//input[@name='v_1-1']")
	public UnityWebElement textBoxUserDefined1V;
	
	// Other Interest - UD
	@FindBy(xpath = "//mat-select[@name='o_6']/div/div[2]/div")
	public UnityWebElement dropdownUserDefined6O;
	
	@FindBy(xpath="//input[@name='o_4']")
	public UnityWebElement lookupUserDefined4O;
	
	@FindBy(xpath = "//input[@name='o_5']")
	public UnityWebElement textBoxUserDefined5O;
	
	@FindBy(xpath = "//input[@name='o_2']")
	public UnityWebElement textBoxUserDefined2O;
	
	@FindBy(xpath = "//input[@name='o_1-1']")
	public UnityWebElement textBoxUserDefined1O;
	
	//External Auditor - UD
	@FindBy(xpath = "//mat-select[@name='x_2']/div/div[2]/div")
	public UnityWebElement dropdownUserDefined2X;
	
	@FindBy(xpath="//input[@name='x_6']")
	public UnityWebElement lookupUserDefined6X;
	
	@FindBy(xpath = "//input[@name='x_4']")
	public UnityWebElement textBoxUserDefined4X;
	
	@FindBy(xpath = "//input[@name='x_3']")
	public UnityWebElement textBoxUserDefined3X;
	
	@FindBy(xpath = "//input[@name='x_1-1']")
	public UnityWebElement textBoxUserDefined1X;
	
	// Custodian - UD
	@FindBy(xpath = "//mat-select[@name='n_4']/div/div[2]/div")
	public UnityWebElement dropdownValidCustodian;
	
	@FindBy(xpath="//input[@name='n_5']")
	public UnityWebElement lookupDispTableCustodian;
	
	@FindBy(xpath="//input[@name='n_6']")
	public UnityWebElement lookupTableValueCustodian;
	
	@FindBy(xpath = "//input[@name='n_3']")
	public UnityWebElement textBoxEffectiveDate;
	
	
	@FindBy(xpath = "//input[@name='n_2']")
	public UnityWebElement textBoxAmountCustodian;
	
	@FindBy(xpath = "//input[@name='n_1-1']")
	public UnityWebElement textBoxNameOfCustodian;
	
	@FindBy(xpath="//input[@name='clientGref']")
	public UnityWebElement lookupclientGref;

	@FindBy(xpath = "//input[@name='householdNumber']")
    public UnityWebElement txthouseholdNumber;
    
    @FindBy(xpath = "//input[@name='monthsSuppressedFromPrinting']")
    public UnityWebElement txtmonthsSuppressedFromPrinting;

    @FindBy(xpath = "//input[@name='deductionCode']")
    public UnityWebElement lookupdeductionCode;
    
    @FindBy(xpath = "//input[@name='controlAcctNum']")
    public UnityWebElement txtcontrolAcctNum;

    @FindBy(xpath = "//input[@name='rtpUnderOmniTaxNum']")
    public UnityWebElement lookuprtpUnderOmniTaxNum;

    @FindBy(xpath = "//input[@name='secondParty']")
    public UnityWebElement txtsecondParty;
    
    @FindBy(xpath = "//input[@name='descOverride']")
    public UnityWebElement txtdescOverride;
    
    @FindBy(xpath = "//mat-select[@name='suppressOnMasterStatements']")
    public UnityWebElement dropdownsuppressOnMasterStatements;


	@FindBy(xpath = "//input[@name='interestedParty']")
	public UnityWebElement lookupInterestedParty;
	
	@FindBy(xpath = "//input[@name='accountLookup']")
	public UnityWebElement lookupaccountLookup;

	@FindBy(xpath = "//mat-select[@name='selectRelationship']/div/div[2]/div")
	public UnityWebElement dropdownRelationship;
	
	@FindBy(xpath = "//input[@name='amount']")
    public UnityWebElement txtAmount;
	
	@FindBy(xpath = "//input[@name='ytdRmdPayments']")
    public UnityWebElement txtytdRmdPayments;

	
	@FindBy(xpath = "//input[@name='issuer']")
    public UnityWebElement txtIssuer;
	
	@FindBy(xpath = "//input[@name='portfolio']")
	public UnityWebElement lookupPortfolio;
	
	@FindBy(xpath = "//input[@name='issuerName']")
    public UnityWebElement txtIssuerName;
	
    @FindBy(xpath = "//input[@name='accountGref']")
    public UnityWebElement lookupAccount;
    
    @FindBy(xpath = "//input[@name='source1FundNum']")
    public UnityWebElement lookupSource1FundNum;
    
    @FindBy(xpath = "//input[@name='source1MoneyType']")
    public UnityWebElement txtSource1MoneyType;
    
    @FindBy(xpath = "//input[@name='source1NonTaxableAmt']")
    public UnityWebElement txtSource1NonTaxableAmt;
    
    @FindBy(xpath = "//input[contains(@name,'participantNum')]")
    public UnityWebElement lookupParticipantNumber;
    
    @FindBy(xpath = "//input[contains(@name,'employerNum')]")
    public UnityWebElement lookupEmployerNumber;
    
    @FindBy(xpath = "//input[@name='employerNum']")
    public UnityWebElement lookupEmployerNum;
    
    @FindBy(xpath = "//input[contains(@name,'planNum')]")
    public UnityWebElement lookupPlanNumber;

    @FindBy(xpath = "//input[@name='holding']")
    public UnityWebElement lookupholding;  
    
    @FindBy(xpath = "//input[@name='existingRelationship']")
    public UnityWebElement lookupExistingRelationship;
    
    @FindBy(xpath = "//mat-select[@name='newRelationship']/div/div[2]/div")
    public UnityWebElement dropdownNewRelationship;
        
    @FindBy(xpath = "//input[@name='newRegistrationCode']")
    public UnityWebElement lookupnewRegistrationCode; 

	// *niranjan*
	// **BI ADD**
	@FindBy(xpath = "//mat-select[@name='acctApporvalRequired']/div/div[2]/div")
	public UnityWebElement dropdownAcctAppReq;

	@FindBy(xpath = "//mat-select[@name='invDecInvolve']/div/div[2]/div")
	public UnityWebElement dropdownInvDecInvolve;

	@FindBy(xpath = "//mat-select[@name='withdrawPrinc']/div/div[2]/div")
	public UnityWebElement dropdownWithdrawPrinc;

	@FindBy(xpath = "//mat-select[@name='appointPower']/div/div[2]/div")
	public UnityWebElement dropdownAppointPower;

	@FindBy(xpath = "//mat-select[@name='changeTrPower']/div/div[2]/div")
	public UnityWebElement dropdownchangeTrPower;

	@FindBy(xpath = "//input[@name='termDateAcctInvolvment']")
	public UnityWebElement textBoxTermDateAcctInvolvment;

	@FindBy(xpath = "//input[@name='decedentIppNumber']")
	public UnityWebElement textBoxDecedentIppNumber;

	@FindBy(xpath = "//mat-select[@name='beneficialOwnderDiscl']/div/div[2]/div")
	public UnityWebElement dropdownBeneficialOwnerDiscl;

	@FindBy(xpath = "//mat-select[@name='votingResp']/div/div[2]/div")
	public UnityWebElement dropdownVotingResp;

	@FindBy(xpath = "//mat-select[@name='formRecipient']/div/div[2]/div")
	public UnityWebElement dropdownFormRecipient;

	@FindBy(xpath = "//mat-select[@name='formRecipient1099Misc']/div/div[2]/div")
	public UnityWebElement dropdownFormRecipient1099Misc;

	@FindBy(xpath = "//mat-select[@name='securityAdv']/div/div[2]/div")
	public UnityWebElement dropdownSecurityAdv;

	@FindBy(xpath = "//mat-select[@name='cashReceiptAdv']/div/div[2]/div")
	public UnityWebElement dropdownCashReceiptAdv;

	@FindBy(xpath = "//mat-select[@name='disbAdv']/div/div[2]/div")
	public UnityWebElement dropdownDisbAdv;

	@FindBy(xpath = "//input[@name='pctDniOwndership1099']")
	public UnityWebElement textBoxPctDniOwndership1099;

	@FindBy(xpath = "//mat-select[@name='multiPartyVotingPower']/div/div[2]/div")
	public UnityWebElement dropdownMultiPartyVotingPower;

	@FindBy(xpath = "//mat-select[@name='prenotificationAdvice']/div/div[2]/div")
	public UnityWebElement dropdownPrenotificationAdvice;

	@FindBy(xpath = "//mat-select[@name='securityAdvExpDisplay']/div/div[2]/div")
	public UnityWebElement dropdownSecurityAdvExpDisplay;

	@FindBy(xpath = "//input[@name='targetRemittanceDistr']")
	public UnityWebElement textBoxTargetRemittanceDistr;

	@FindBy(xpath = "//input[@name='ytdRemittances']")
	public UnityWebElement textBoxTargetYtdRemittances;

	@FindBy(xpath = "//input[@name='ltdRemittances']")
	public UnityWebElement textBoxTargetLtdRemittances;

	@FindBy(xpath = "//input[@name='rmdDatePaid']")
	public UnityWebElement textBoxRmdDatePaid;

	@FindBy(xpath = "//input[@name='rmdAmountPaid']")
	public UnityWebElement textBoxRmdAmountPaid;

	@FindBy(xpath = "//input[@name='remarks1']")
	public UnityWebElement textBoxRemarks1;

	@FindBy(xpath = "//input[@name='proxyGroupCode']")
	public UnityWebElement textBoxProxyGroupCode;

	@FindBy(xpath = "//input[@name='relationshipSubType']")
	public UnityWebElement lookupRelationshipSubType;

	@FindBy(xpath = "//mat-select[@name='proxyInfoOnlyRecipient']/div/div[2]/div")
	public UnityWebElement dropdownProxyInfoOnlyRecipient;

	@FindBy(xpath = "//mat-select[@name='primaryOwner']/div/div[2]/div")
	public UnityWebElement dropdownPrimaryOwner;

	// **ACN ADD**
	@FindBy(xpath = "//mat-select[@name='excludeFromNotices']/div/div[2]/div")
	public UnityWebElement dropdownExcludeFromNotices;

	@FindBy(xpath = "//mat-select[@name='excludeFromNotices']/div/div[2]/div")
	public UnityWebElement dropdownExcludeFromEmailNotices;

	// **SRS ADD**
	@FindBy(xpath = "//input[@name='blockNumber']")
	public UnityWebElement lookupBlockNumber;

	@FindBy(xpath = "//input[@name='description']")
	public UnityWebElement textBoxDescription;

	@FindBy(xpath = "//input[@name='specReserveAmt']")
	public UnityWebElement textBoxSpecReserveAmt;

	@FindBy(xpath = "//input[@name='increment']")
	public UnityWebElement textBoxIncrement;

	@FindBy(xpath = "//mat-select[@name='feeDate@cycleDateMonths']/div/div[2]/div")
	public UnityWebElement dropdownDateAndCycleMonths;

	@FindBy(xpath = "//mat-select[@name='feeDate@cycleDateDays']/div/div[2]/div")
	public UnityWebElement dropdownDateAndCycleDays;

	@FindBy(xpath = "//mat-select[@name='feeDate@cycleDateYears']/div/div[2]/div")
	public UnityWebElement dropdownDateAndCycleYears;

	@FindBy(xpath = "//input[@name='feeDate@cycleDateOccursEvery']")
	public UnityWebElement dropdownDateAndCycleOccursEvery;

	@FindBy(xpath = "//mat-select[@name='feeDate@cycleDateFrequency']/div/div[2]/div")
	public UnityWebElement dropdownDateAndCycleFrequency;

	// **WSC ADD**
	@FindBy(xpath = "//input[@name='domesticReportingIndicator']")
	public UnityWebElement lookupDomesticReportIndicator;

	@FindBy(xpath = "//input[@name='statementType1099']")
	public UnityWebElement textBoxStatementType1099;

	@FindBy(xpath = "//input[@name='associateCopyIpNumber1']")
	public UnityWebElement textBoxAssociateCopyIPNumber1;

	// *nick*
	@FindBy(xpath = "//mat-select[@name='primaryContact']")
	public UnityWebElement dropdownPrimaryContact;

	@FindBy(xpath = "//input[@name='statementType']")
	public UnityWebElement lookupStatementType;

	@FindBy(xpath = "//mat-select[@name='statementDate@cycleDateMonths']")
	public UnityWebElement lookupStatementMonth;

	@FindBy(xpath = "//mat-select[@name='statementDate@cycleDateDays']")
	public UnityWebElement lookupStatementDays;

	@FindBy(xpath = "//mat-select[@name='statementDate@cycleDateYears']")
	public UnityWebElement lookupStatementYears;

	@FindBy(xpath = "//input[@name='statementDate@cycleDateOccursEvery']")
	public UnityWebElement lookupStatementOccursEvery;

	@FindBy(xpath = "//mat-select[@name='statementDate@cycleDateFrequency']")
	public UnityWebElement lookupStatementFrequency;

	// *aprajita*
	@FindBy(xpath = "//input[@name='totalAmount']")
	public UnityWebElement textTotalAmount;

	@FindBy(xpath = "//mat-select[@name='remittanceDate@cycleDateMonths']/div/div[2]/div")
	public UnityWebElement dropdownRMDateAndCycleMonths;

	@FindBy(xpath = "//mat-select[@name='remittanceDate@cycleDateDays']/div/div[2]/div")
	public UnityWebElement dropdownRMDateAndCycleDays;

	@FindBy(xpath = "//mat-select[@name='remittanceDate@cycleDateYears']/div/div[2]/div")
	public UnityWebElement dropdownRMDateAndCycleYears;

	@FindBy(xpath = "//input[@name='remittanceDate@cycleDateOccursEvery']")
	public UnityWebElement dropdownRMDateAndCycleOccursEvery;

	@FindBy(xpath = "//mat-select[@name='remittanceDate@cycleDateFrequency']/div/div[2]/div")
	public UnityWebElement dropdownRMDateAndCycleFrequency;

	@FindBy(xpath = "//input[@name='depositAcctNum']")
	public UnityWebElement textDepositAcctNum;

	@FindBy(xpath = "//mat-select[@name='remittanceType']/div/div[2]/div")
	public UnityWebElement dropdownRemittanceType;

	@FindBy(xpath = "//input[@name='payee']")
	public UnityWebElement textPayee;

	@FindBy(xpath = "//input[@name='mailTo1']")
	public UnityWebElement textMail1;

	@FindBy(xpath = "//input[@name='taxPartyCusipNumber']")
	public UnityWebElement lookUpTaxPartyCusipNumber;

	@FindBy(xpath = "//input[@name='fundsCode']")
	public UnityWebElement lookUpFundsCode;

	@FindBy(xpath = "//input[@name='whomPaidForCrTickets']")
	public UnityWebElement lookUpWhomPaidForCrTickets;

	@FindBy(xpath = "//input[@name='payeePartyNumber']")
	public UnityWebElement lookUpPayeePartyNumber;

	@FindBy(xpath = "//input[@name='disbursementCode']")
	public UnityWebElement lookUpDisbCode;

	@FindBy(xpath = "//input[@name='taxCode']")
	public UnityWebElement lookUpTaxCode;

	@FindBy(xpath = "//mat-select[@name='portfolio']/div/div[2]/div")
	public UnityWebElement dropdownPortfolio;

	@FindBy(xpath = "//input[@name='disposition']")
	public UnityWebElement lookUpDisposition;

	@FindBy(xpath = "//mat-select[@name='overdrCode']/div/div[2]/div")
	public UnityWebElement dropdownOverdrCode;

	@FindBy(xpath = "//input[@name='voucherReceiptDescrip4']")
	public UnityWebElement textVoucherReceiptDescrip4;

	@FindBy(xpath = "//input[@name='transactionDescrip3']")
	public UnityWebElement textTransactionDescrip3;

	@FindBy(xpath = "//input[@name='expirationDate']")
	public UnityWebElement dateExpirationDate;

	@FindBy(xpath = "//input[@name='principalAmountCurrency']")
	public UnityWebElement textPrincipalAmountCurrency;

	@FindBy(xpath = "//input[@name='incomeAmountCurrency']")
	public UnityWebElement textIncomeAmountCurrency;

	// *Rohini*
	// *CH ADD*
	@FindBy(xpath = "//input[@name='charitablePercentInterest']")
	public UnityWebElement txtboxCharitablePercentInterest;

	// *CCH ADD*
	@FindBy(xpath = "//input[@name='copyToIpNumber3']")
	public UnityWebElement txtBoxCopyToIpNumber3;

	// *SCIP ADD*
	@FindBy(xpath = "//mat-select[@name='suncardParticipation']/div/div[2]/div")
	public UnityWebElement dropdownSuncardParticipation;

	@FindBy(xpath = "//input[@name='suncardParticipantCode']")
	public UnityWebElement txtBoxsuncardParticipantCode;

	// *SY ADD*
	@FindBy(xpath = "//input[@name='domesticDividends']")
	public UnityWebElement txtBoxDomesticDividends;

	@FindBy(xpath = "//input[@name='usGovermentInterest']")
	public UnityWebElement txtBoxUsGovermentInterest;

	// *WS3 ADD*
	@FindBy(xpath = "//mat-select[@name='primaryContact']/div/div[2]/div")
	public UnityWebElement dropdownWS3PrimaryContact;

	@FindBy(xpath = "//mat-select[@name='excludeFromIpExtract']/div/div[2]/div")
	public UnityWebElement dropdownExcludeFromIPExtract;

	@FindBy(xpath = "//mat-select[@name='waPrimaryContact']/div/div[2]/div")
	public UnityWebElement dropdownWAPrimaryContact;

	// *rajat*
	// **FDR ADD**
	@FindBy(xpath = "//mat-select[@name='reportRecipient']/div/div[2]/div")
	public UnityWebElement dropdownreportRecipient;

	// **PRTF ADD**
	@FindBy(xpath = "//mat-select[@name='pr480_7FormRecipient']/div/div[2]/div")
	public UnityWebElement dropdownpr480_7FormRecipient;

	// **TK ADD**
	@FindBy(xpath = "//mat-select[@name='ticklerDate@cycleDateMonths']/div/div[2]/div")
	public UnityWebElement dropdownticklerDatecycleDateMonths;

	@FindBy(xpath = "//mat-select[@name='ticklerDate@cycleDateDays']/div/div[2]/div")
	public UnityWebElement dropdownticklerDatecycleDateDays;

	@FindBy(xpath = "//mat-select[@name='ticklerDate@cycleDateYears']/div/div[2]/div")
	public UnityWebElement dropdownticklerDatecycleDateYears;

	@FindBy(xpath = "//input[@name='ticklerDate@cycleDateOccursEvery']")
	public UnityWebElement dropdownticklerDatecycleDateOccursEvery;

	@FindBy(xpath = "//mat-select[@name='ticklerDate@cycleDateFrequency']/div/div[2]/div")
	public UnityWebElement dropdownticklerDatecycleDateFrequency;

	@FindBy(xpath = "//input[@name='adminOfficerCode']")
	public UnityWebElement lookupadminOfficerCode;

	@FindBy(xpath = "//input[@name='ticklerDescrip1']")
	public UnityWebElement textBoxticklerDescrip1;

	@FindBy(xpath = "//input[@name='expirationDate']")
	public UnityWebElement textBoxexpirationDate;

	// *Praveena*
	// **FEE**
	@FindBy(xpath = "//input[@name='feeSchedule']")
	public UnityWebElement lookupFeeSchedule;
	
	@FindBy(xpath = "//input[@name='layoutNum']")
	public UnityWebElement lookupLayoutNum;

	@FindBy(xpath = "//input[@name='minMaxAndStepCycle']")
	public UnityWebElement lookupMinMaxAndStepCycle;

	@FindBy(xpath = "//mat-select[@name='feeDate@cycleDateMonths']/div/div[2]/div")
	public UnityWebElement dropdownFeeDateAndCycleMonths;

	@FindBy(xpath = "//mat-select[@name='feeDate@cycleDateDays']/div/div[2]/div")
	public UnityWebElement dropdownFeeDateAndCycleDays;

	@FindBy(xpath = "//mat-select[@name='feeDate@cycleDateYears']/div/div[2]/div")
	public UnityWebElement dropdownFeeDateAndCycleYears;

	@FindBy(xpath = "//input[@name='feeDate@cycleDateOccursEvery']")
	public UnityWebElement dropdownFeeDateAndCycleOccursEvery;

	@FindBy(xpath = "//mat-select[@name='feeDate@cycleDateFrequency']/div/div[2]/div")
	public UnityWebElement dropdownFeeDateAndCycleFrequency;
	
	@FindBy(xpath = "//mat-select[@name='reviewDate@cycleDateMonths']/div/div[2]/div")
	public UnityWebElement dropdownReviewDateAndCycleMonths;

	@FindBy(xpath = "//mat-select[@name='reviewDate@cycleDateDays']/div/div[2]/div")
	public UnityWebElement dropdownReviewDateAndCycleDays;

	@FindBy(xpath = "//mat-select[@name='reviewDate@cycleDateYears']/div/div[2]/div")
	public UnityWebElement dropdownReviewDateAndCycleYears;

	@FindBy(xpath = "//input[@name='reviewDate@cycleDateOccursEvery']")
	public UnityWebElement dropdownReviewDateAndCycleOccursEvery;

	@FindBy(xpath = "//mat-select[@name='reviewDate@cycleDateFrequency']/div/div[2]/div")
	public UnityWebElement dropdownReviewDateAndCycleFrequency;
	
	@FindBy(xpath = "//mat-select[@name='invoiceEndingDate@cycleDateMonths']/div/div[2]/div")
	public UnityWebElement dropdownInvoiceEndingDateAndCycleMonths;

	@FindBy(xpath = "//mat-select[@name='invoiceEndingDate@cycleDateDays']/div/div[2]/div")
	public UnityWebElement dropdownInvoiceEndingDateAndCycleDays;

	@FindBy(xpath = "//mat-select[@name='invoiceEndingDate@cycleDateYears']/div/div[2]/div")
	public UnityWebElement dropdownInvoiceEndingDateAndCycleYears;

	@FindBy(xpath = "//input[@name='invoiceEndingDate@cycleDateOccursEvery']")
	public UnityWebElement dropdownInvoiceEndingDateAndCycleOccursEvery;

	@FindBy(xpath = "//mat-select[@name='invoiceEndingDate@cycleDateFrequency']/div/div[2]/div")
	public UnityWebElement dropdownInvoiceEndingDateAndCycleFrequency;
	
	@FindBy(xpath = "//mat-select[@name='dateAndCycle@cycleDateMonths']/div/div[2]/div")
	public UnityWebElement dropdownDCDateAndCycleMonths;

	@FindBy(xpath = "//mat-select[@name='dateAndCycle@cycleDateDays']/div/div[2]/div")
	public UnityWebElement dropdownDCDateAndCycleDays;

	@FindBy(xpath = "//mat-select[@name='dateAndCycle@cycleDateYears']/div/div[2]/div")
	public UnityWebElement dropdownDCDateAndCycleYears;

	@FindBy(xpath = "//input[@name='dateAndCycle@cycleDateOccursEvery']")
	public UnityWebElement dropdownDCDateAndCycleOccursEvery;

	@FindBy(xpath = "//mat-select[@name='dateAndCycle@cycleDateFrequency']/div/div[2]/div")
	public UnityWebElement dropdownDCDateAndCycleFrequency;

	// **APL**
	@FindBy(xpath = "//input[@name='accountAlphabeticalListNumber']")
	public UnityWebElement txtBoxAccountAlphabeticalListNumber;

	@FindBy(xpath = "//mat-select[@name='dateAccountOpened']/div/div[2]/div")
	public UnityWebElement dropdownDateAccountOpened;

	@FindBy(xpath = "//mat-select[@name='dateOfLastMaintenanceDisplay']/div/div[2]/div")
	public UnityWebElement dropdownDateOfLastMaintenanceDisplay;

	@FindBy(xpath = "//input[@name='masterAccount']")
	public UnityWebElement lookupMasterAccount;

	@FindBy(xpath = "//input[@name='formatNum']")
	public UnityWebElement lookupFormatNum;

	@FindBy(xpath = "//mat-select[@name='statementDate@cycleDateMonths']")
	public UnityWebElement dropdownEBStatementDateAndCycleMonths;

	@FindBy(xpath = "//mat-select[@name='statementDate@cycleDateDays']")
	public UnityWebElement dropdownEBStatementDateAndCycleDays;

	@FindBy(xpath = "//mat-select[@name='statementDate@cycleDateYears']")
	public UnityWebElement dropdownEBStatementDateAndCycleYears;

	@FindBy(xpath = "//input[@name='statementDate@cycleDateOccursEvery']")
	public UnityWebElement dropdownEBStatementDateAndCycleOccursEvery;

	@FindBy(xpath = "//mat-select[@name='statementDate@cycleDateFrequency']")
	public UnityWebElement dropdownEBStatementDateAndCycleFrequency;

	// *pooja*
	@FindBy(xpath = "//input[@name='advanceAmount']")
	public UnityWebElement textBoxAdvanceAmount;

	@FindBy(xpath = "//input[@name='expirDate']")
	public UnityWebElement textBoxExpirDate;

	//*praveena*
	//**Master-Account-Regulatory**
	@FindBy(xpath = "//mat-select[@name='subjectToCip']")
	public UnityWebElement dropdownSubjectToCip;

	@FindBy(xpath = "//input[@name='redFlag']")
	public UnityWebElement lookupRedFlag;

	@FindBy(xpath = "//input[@name='riskLevel']")
	public UnityWebElement lookupRiskLevel;

	@FindBy(xpath = "//input[@name='patriotActId']")
	public UnityWebElement textBoxPatriotActId;

	@FindBy(xpath = "//input[@name='riskReason']")
	public UnityWebElement lookupRiskReason;
	
	// **CCC_INTERFACE-CCC**
	@FindBy(xpath = "//input[@name='excludeFromCCCInterface']")
	public UnityWebElement lookupExcludeFromCCCInterface;

	@Override
	public void waitForPageToLoad() {
		startTime = System.currentTimeMillis();
		if (!super.isPageLoaded(driver))
			Assert.fail("Timed out after " + AppConstants.PAGE_LOAD_TIMEOUT + " seconds\n");
	}
}
