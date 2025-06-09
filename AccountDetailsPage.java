package com.unity.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.unity.constants.AppConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityGridElement;
import com.unity.customelements.UnityTableElement;
import com.unity.customelements.UnityWebElement;

public class AccountDetailsPage extends BaseTestPage {

	WebDriver driver;

	public AccountDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}
	
	@FindBy(css = "//ag-grid-angular")
	public UnityGridElement gridPortfolioInformation;
	
	@FindBy(xpath = "//span//mat-panel-title[normalize-space(text())='Sawtooth Books and Record']")
    public UnityWebElement panelSawtoothBooksandRecord;
	
    @FindBy(xpath = "//span[contains(normalize-space(text()),'SBR Eligible')]")
    public UnityWebElement labelSBREligible;
    
    @FindBy(xpath = "//span[contains(normalize-space(text()),'Client Advisor Code')]")
    public UnityWebElement labelClientAdvisorCode;
	
//	@FindBy(xpath = "//span[contains(text(),'Portfolio Information')]//parent::button") 
//	public UnityWebElement tabPortfolioInformation;
	
	@FindBy(xpath = "//h2[normalize-space(text())='Edit Portfolio Alternate Identifier']")
	public UnityWebElement headerEditPortfolioAlternateIdentifier1;

	@FindBy(xpath = "//mat-dialog-container//input[@name='portfolioName']")
	public UnityWebElement textboxPortfolioName;

	@FindBy(xpath = "//h2[normalize-space(text())='Edit Portfolio Information']")
	public UnityWebElement headerEditPortfolioInformation;

	@FindBy(xpath = "//h2[normalize-space(text())='Edit Tax Information']")
	public UnityWebElement headerEditTaxInformation;

	@FindBy(xpath = "//mat-dialog-container//input[@name='federalTaxId']")
	public UnityWebElement textboxTaxId;

//	@FindBy(xpath = "//span[contains(text(),'Tax Information')]//parent::button")
//	public UnityWebElement tabTaxInformation;
//
//	@FindBy(xpath = "//span[contains(text(),'Affiliations')]//parent::button")
//	public UnityWebElement tabRelationships;
//
//	@FindBy(xpath = "//span[contains(text(),'Notes')]//parent::button")
//	public UnityWebElement tabNotes;

//	@FindBy(xpath = "//ag-grid-angular")
//	public UnityGridElement gridRelationships;

	@FindBy(xpath = "//input[@name='clientGref']")
	public UnityWebElement lookupClient;

	@FindBy(xpath = "//h2[normalize-space(text())='Add External Identifier']")
	public UnityWebElement headerAddExternalIdentifier;

	@FindBy(xpath = "//mat-dialog-container//input[@name='alternateExternalIdentifier']")
	public UnityWebElement textboxalternateExternalIdentifier;

	@FindBy(xpath = "//input[@name='locationAbbrev']")
	public UnityWebElement lookupLocation;

	@FindBy(xpath = "//ag-grid-angular[@id='external-safekeeping-accounts']")
	public UnityGridElement gridExternalSafekeepingAccounts;

	@FindBy(xpath = "//mat-dialog-container//input[@name='usiAliasAbbrev']")
	public UnityWebElement textboxAlias;

	@FindBy(xpath = "//h2[normalize-space(text())=' Add New Tax Information']")
	public UnityWebElement headerAddNewTaxInformation;

	@FindBy(xpath = "//input[@name='customerTaxClassAbbrev']")
	public UnityWebElement lookupCustomerTaxClass;
	
	@FindBy(xpath = "//input[@name='taxpayerClassAbbrev']")
	public UnityWebElement lookupTaxPayerClass;

	@FindBy(xpath = "//mat-dialog-container//input[@name='effectiveDate']")
	public UnityWebElement textboxEffectiveDate;
	
	@FindBy(xpath = "//mat-select[@name='investorsViewEligible']")
	public UnityWebElement dropdownInvestorsViewEligible;
	
	@FindBy(xpath = "//input[@name='invManagerClientId']")
	public UnityWebElement dropdownInvManagerClientId;
	
	@FindBy(xpath = "//*[text()=' Alternate ID: ']/ancestor::span/following-sibling::add-edit-info-component//button")
	public UnityWebElement buttonPortfolioAltIDEdit;
	
	@FindBy(xpath = "//*[contains(text(),'Portfolio Detail For:')]/ancestor::span/following-sibling::span/add-edit-info-component//button")
	public UnityWebElement buttonPortfolioEdit;
	
	@FindBy(xpath = "//edit-info-form")
	public UnityWebElement popupEditForm;
	
	
	@FindBy(xpath = "//mat-select[@name='bi7OrPi4AcctOpenDate']")
	public UnityWebElement dropdownOpenDate;


	@FindBy(xpath = "//account-synopsis//mat-icon")
	public UnityWebElement buttonSynopsis;
	
	@FindBy(xpath = "//input[@name='payoutPercent']")
	public UnityWebElement textboxPayoutPercent;
	
	@FindBy(xpath = "//input[@name='firstPaymentDateOfYear']")
	public UnityWebElement textboxFirstPaymentDateOfYear;
	
	@FindBy(xpath = "//input[@name='paymentFrequency']")
	public UnityWebElement dropdownPaymentFrequency;
	
	@FindBy(xpath = "//input[@name='computeValueDate']")
	public UnityWebElement textboxComputeValueDate;
	
	@FindBy(xpath = "//input[@name='charitableType']")
	public UnityWebElement dropdownCharitableType;

	// Button Print
	@FindBy(xpath = "//unity-print//*[contains(@class,'fis-icon-print')]")
	public UnityWebElement buttonPrint;
	
	@FindBy(xpath = "(//*[normalize-space(text())='Gain/Loss Information'])[1]")
	public UnityWebElement linkGainLossInformation;
	
	@FindBy(xpath = "//mat-expansion-panel-header/..//span[.='ONESOURCE Processing Indicator']")
	public UnityWebElement labeltaxvendorONESOURCEProcessingIndicatorKey;
	
	@FindBy(xpath = "//span[.='Tax Vendor']")
	public UnityWebElement labelTaxVendor;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Tax Open Date')]")
	public UnityWebElement labelTaxOpenDate;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Tax Preparer')]")
	public UnityWebElement labelTaxPreparer;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Tax Vendor Admin Type')]")
	public UnityWebElement labelTaxVendorAdminType;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Final Return Date')]")
	public UnityWebElement labelFinalReturnDate;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'1099 Service Level')]")
	public UnityWebElement label1099ServiceLevel;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Produce 1099 DIV/INT/B')]")
	public UnityWebElement labelProduce1099DIVINTB;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Produce 1099 MISC – Receipts')]")
	public UnityWebElement labelProduce1099MISCReceipts;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Produce 1099 MISC – Disbursements')]")
	public UnityWebElement labelProduce1099MISCDisbursements;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Produce 5498 ESA/IRA')]")
	public UnityWebElement labelProduce5498ESAIRA;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Produce 1098 Mortgage Interest')]")
	public UnityWebElement labelProduce1098MortgageInterest;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Amortization Instructions')]")
	public UnityWebElement labelAmortizationInstructions;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Tax Vendor Information']]")
	public UnityWebElement panelTaxVendorInformation;
	
	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Amortization and Accretion']]")
	public UnityWebElement panelAmortizationandAccretion;  
	
	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Estimate/Balance Information']]")
	public UnityWebElement panelEstimateBalanceInformation;
	
	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Gain/Loss Information']]")
	public UnityWebElement panelGainLossInformation;
	
	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Uniform Principal/Income Information']]")
	public UnityWebElement panelUniformPrincipalIncomeInformation;
	
	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Investdesk Controls']]")
	public UnityWebElement panelInvestdeskControls;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Amort/Accrete Model')]")
	public UnityWebElement labelAmortAccreteModel;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Amortize Taxable Bond Premium')]")
	public UnityWebElement labelAmortizeTaxableBondPremium;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Accrue Discount Constant Yield')]")
	public UnityWebElement labelAccrueDiscountConstantYield;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Incl Market Discount in Income')]")
	public UnityWebElement labelInclMarketDiscountinIncome;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Treat Interest as OID')]")
	public UnityWebElement labelTreatInterestasOID;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Use Spot Rate')]")
	public UnityWebElement labelUseSpotRate;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Federal Short Term Gain/Loss YTD')]")
	public UnityWebElement labelFederalShortTermGainLossYTD;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'State Short Term Gain/Loss YTD')]")
	public UnityWebElement labelStateShortTermGainLossYTD;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Federal Long Term Gain/Loss YTD')]")
	public UnityWebElement labelFederalLongTermGainLossYTD;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Federal Qualified 5 YR Gain YTD')]")
	public UnityWebElement labelFederalQualified5YRGainYTD;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'State Long Term Gain/Loss YTD')]")
	public UnityWebElement labelStateLongTermGainLossYTD;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'State Qualified 5 YR Gain YTD')]")
	public UnityWebElement labelStateQualified5YRGainYTD;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Federal Deduction IROD')]")
	public UnityWebElement labelFederalDeductionIROD;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'State Net Operating Loss')]")
	public UnityWebElement labelStateNetOperatingLoss;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Federal Short Term Loss Carry Over')]")
	public UnityWebElement labelFederalShortTermLossCarryOver;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Federal Long Term Loss Carry Over')]")
	public UnityWebElement labelFederalLongTermLossCarryOver;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'State Short Term Loss Carry Over')]")
	public UnityWebElement labelStateShortTermLossCarryOver;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'State Long Term Loss Carry Over')]")
	public UnityWebElement labelStateLongTermLossCarryOver;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Total Federal Tax Cost')]")
	public UnityWebElement labelTotalFederalTaxCost;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Total State Tax Cost')]")
	public UnityWebElement labelTotalStateTaxCost;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'State Inheritance Tax Filing Date')]")
	public UnityWebElement labelStateInheritanceTaxFilingDate;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Federal Estate Tax Filing Date')]")
	public UnityWebElement labelFederalEstateTaxFilingDate;

	@FindBy(xpath = "(//unity-search//button)[2]")
	public UnityWebElement iconLocalSearch;

	@FindBy(xpath = "//*[normalize-space(text())='Search by Account']")
	public UnityWebElement labelSearchByAccount;

	@FindBy(xpath = "//*[normalize-space(text())='Search by Client']")
	public UnityWebElement labelSearchByClient;

	@FindBy(xpath = "//*[normalize-space(text())='Search by Account']/ancestor::div/input")
	public UnityWebElement textBoxSearchFor;

	@FindBy(xpath = "//div[contains(@class,'mat-autocomplete-panel local-search-dropdown')]//mat-option")
	public UnityWebElement panelLocalSearchResults;

	// header
	@FindBy(xpath = "//ruf-page-header-title")
	public UnityWebElement labelAccountName;

	@FindBy(xpath = "(//a[@class='ng-star-inserted'])[1]")
	public UnityWebElement linkClientName;

	@FindBy(xpath = "//mat-card-title[normalize-space(text())='Asset Allocation']/ancestor::mat-card//button[@aria-label]")
	public UnityWebElement panelAssetAllocation;

	@FindBy(xpath = "//h2/following-sibling::small")
	public List<WebElement> labelheaderKeys;

	@FindBy(xpath = "//div/h2")
	public List<WebElement> labelheaderValues;

	@FindBy(xpath = "//div[contains(@class,'ngx-charts')]")
	public UnityWebElement pieChart;

	@FindBy(xpath = "//button[following-sibling::mat-menu[@id='entity-information-select-menu']]")
	public UnityWebElement dropdownViewBy;

	@FindBy(xpath = "//button[span[normalize-space(text())='Minor Security']]")
	public UnityWebElement linkMinorSecurity;

	@FindBy(xpath = "//button[span[normalize-space(text())='Major Security']]")
	public UnityWebElement linkMajorSecurity;

	@FindBy(xpath = "//div[contains(@class,'asset-allocation')]//table")
	public UnityTableElement tableAssetAllocation;

	@FindBy(xpath = "//*[normalize-space(text())='Account Information']")
	public UnityWebElement tabAccountInformation;

	@FindBy(xpath = "//*[normalize-space(text())='IRA Information']")
	public UnityWebElement tabIRAInformation;

	@FindBy(xpath = "//*[normalize-space(text())='Portfolio Information']")
	public UnityWebElement tabPortfolioInformation;

	@FindBy(xpath = "//*[normalize-space(text())='Tax Information']")
	public UnityWebElement tabTaxInformation;

	@FindBy(xpath = "//*[normalize-space(text())='Affiliations']")
	public UnityWebElement tabRelationships;

	@FindBy(xpath = "//*[normalize-space(text())='Notes']")
	public UnityWebElement tabNotes;

	// Account information tab links
	@FindBy(xpath = ".//*[contains(@class,'sg-property-name')]")
	public List<WebElement> labelHeadersAccountInformation;

	@FindBy(xpath = ".//*[contains(@class,'sg-property-value')]")
	public List<WebElement> labelValuesAccountInformation;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Account Identification Details']]")
	public UnityWebElement panelAccountIdentificationDetails;
	
	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Basic Information']]")
	public UnityWebElement panelBasicInformation1;
	
	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Regulatory']]")
	public UnityWebElement panelRegulatory;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Account Attributes']]")
	public UnityWebElement panelAccountAttributes;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Reviews']]")
	public UnityWebElement panelReviews;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Legal']]")
	public UnityWebElement panelLegal;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='User Defined']]")
	public UnityWebElement panelUserDefined;
	
	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Investor’s View']]")
	public UnityWebElement panelInvestorView;
	
	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Options Processing']]")
	public UnityWebElement panelOptionsProcessing;
	
	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Interfaces']]")
	public UnityWebElement panelInterfaces;
	
	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Asset Instructions']]")
	public UnityWebElement panelAssetInstructions;
	
	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Mutual Fund Processing']]")
	public UnityWebElement panelMutualFundProcessing;
	
	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Protected Information']]")
	public UnityWebElement panelProtectedInformation1;

	@FindBy(xpath = "(//*[normalize-space(text())='More Details'])[1]")
	public UnityWebElement linkMoreDetailsAccountIdentification;

	@FindBy(xpath = "//*[normalize-space(text())='More Details']")
	public UnityWebElement linkMoreDetailsAccountAttribute;

	@FindBy(xpath = "//*[normalize-space(text())='More Details']")
	public UnityWebElement linkMoreDetails;

	@FindBy(xpath = "//mat-expansion-panel-header//*[normalize-space(text())='Fee Information']/ancestor::mat-expansion-panel//button/span[normalize-space(text())='More Details']")
	public UnityWebElement linkFeeInformationMoreDetails;

	@FindBy(xpath = "//*[normalize-space(text())='Less Details']")
	public UnityWebElement linkLessDetails;

	@FindBy(xpath = "(//*[normalize-space(text())='More Details'])[2]")
	public UnityWebElement linkMoreDetailsCashValueAccountAttribute;

	@FindBy(xpath = "//*[normalize-space(text())='More Details']")
	public UnityWebElement linkMoreDetailsTaxInformation;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Bank information']]")
	public UnityWebElement panelBankInformation;

	@FindBy(xpath = "//span//mat-panel-title[normalize-space(text())='General Information']")
	public UnityWebElement panelGeneralInformation;

	@FindBy(xpath = "//span//mat-panel-title[normalize-space(text())='Mutual Fund Credits']")
	public UnityWebElement panelMutualFundCredits;

	@FindBy(xpath = "//span//mat-panel-title[normalize-space(text())='Credit Method Overrides']")
	public UnityWebElement panelCreditMethodOverrides;

	@FindBy(xpath = "//span//mat-panel-title[normalize-space(text())='Related Accounts']")
	public UnityWebElement panelRelatedAccounts;

	@FindBy(xpath = "//mat-expansion-panel[4]/div[1]/div[1]/div[1]/div[1]/unity-clientside-grid[1]/div[1]/div[2]/div[1]/div[1]/ag-grid-angular[1]/div[1]/div[2]/div[2]")
	public UnityGridElement GridRelatedAccounts;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Contact Information' or text()='Contact information']]")
	public UnityWebElement panelContactInformation;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Financials']]")
	public UnityWebElement panelFinancials;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Others']]")
	public UnityWebElement panelOthers;

	// Account information - Account identification panel
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Account Type')]")
	public UnityWebElement labelAccountTypeKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Base Currency')]")
	public UnityWebElement labelBaseCurrencyKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Base Currency')]/following-sibling::span")
	public UnityWebElement labelBaseCurrencyValue;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Account Number')]")
	public UnityWebElement labelAccountIdNumberKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Name')]")
	public UnityWebElement labelNameKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Opened Date')]")
	public UnityWebElement labelOpenDateKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Domicile')]")
	public UnityWebElement labelDomicileKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Skip Tax Reclaim')]")
	public UnityWebElement labelSkipTaxReclaimKey;

	@FindBy(xpath = "//*[contains(normalize-space(text()),'Production Group') or contains(normalize-space(text()),'Production group')]")
	public UnityWebElement labelProductionGroupKey;

	@FindBy(xpath = "//*[contains(normalize-space(text()),'YTD Realised Gain/Loss') or contains(normalize-space(text()),'YTD Realized Gain/Loss')]")
	public UnityWebElement labelYTDRealizedGainLossKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Country of Residence')]")
	public UnityWebElement labelCountryOfResidenceKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Return Filed for this Account')]")
	public UnityWebElement labelReturnFiledForThisAccountKey;

	// Bank information panel
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Acquired By')]")
	public UnityWebElement labelAcquiredByKey;

	@FindBy(xpath = "//span[normalize-space(text())='Bank']")
	public UnityWebElement labelBankKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Branch')]")
	public UnityWebElement labelBranchKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Closed Reason')]")
	public UnityWebElement labelClosedReasonKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Comments')]")
	public UnityWebElement labelCommentsKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Last Fiscal Year')]")
	public UnityWebElement labelLastFiscalYearKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Last Investment Review')]")
	public UnityWebElement labelLastInvesmentReviewKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Last Fee Review')]")
	public UnityWebElement labelLastFeeReviewKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Fee Average Balance Calculation')]")
	public UnityWebElement labelFeeAverageBalanceCalculation;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Fee Accrual Method')]")
	public UnityWebElement labelFeeAccrualMethod;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Fee Clause Code')]")
	public UnityWebElement labelFeeClauseCode;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Co-Trustee Fee Indicator')]")
	public UnityWebElement labelCoTrusteeFeeIndicator;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Account to Be Charged')]")
	public UnityWebElement labelAccounttoBeCharged;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Invoice Name')]")
	public UnityWebElement labelInvoiceName;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Performance Invmt Mgmt Fee Percent')]")
	public UnityWebElement labelPerformanceInvmtMgmtFeePercent;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Commission Percent')]")
	public UnityWebElement labelCommissionPercent;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Closing Fee Approved')]")
	public UnityWebElement labelClosingFeeApproved;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Combined Fees Charge Method')]")
	public UnityWebElement labelCombinedFeesChargeMethod;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Charge Account Back')]")
	public UnityWebElement labelChargeAccountBack;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Minimum Fee Amount')]")
	public UnityWebElement labelMinimumFeeAmount;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Minimum Payment Method')]")
	public UnityWebElement labelMinimumPaymentMethod;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Minimum Allocation Income Percent')]")
	public UnityWebElement labelMinimumAllocationIncomePercent;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Minimum Allocation Principal Percent')]")
	public UnityWebElement labelMinimumAllocationPrincipalPercent;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Maximum Fee Amount')]")
	public UnityWebElement labelMaximumFeeAmount;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Maximum Payment Method')]")
	public UnityWebElement labelMaximumPaymentMethod;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Maximum Allocation Income Percent')]")
	public UnityWebElement labelMaximumAllocationIncomePercent;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Maximum Allocation Principal Percent')]")
	public UnityWebElement labelMaximumAllocationPrincipalPercent;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Deduction Amount')]")
	public UnityWebElement labelDeductionAmount;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Discount Percent 1')]")
	public UnityWebElement labelDiscountPercent1;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Discount Percent 2')]")
	public UnityWebElement labelDiscountPercent2;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'1st Quarter Fees')]")
	public UnityWebElement label1stQuarterFees;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'2nd Quarter Fees')]")
	public UnityWebElement label2ndQuarterFees;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'3rd Quarter Fees')]")
	public UnityWebElement label3rdQuarterFees;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'4th Quarter Fees')]")
	public UnityWebElement label4thQuarterFees;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Activity Fee Exclude Min/Max')]")
	public UnityWebElement labelActivityFeeExcludeMinMax;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Last Administrative Review')]")
	public UnityWebElement labelLastAdministrativeReviewKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Next Fiscal Year')]")
	public UnityWebElement labelKeyNextFiscalYearKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Date of Agreement')]")
	public UnityWebElement labelDateOfAgreementKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Date of Appointment')]")
	public UnityWebElement labelDateOfAppointmentKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Pre Closed Date')]")
	public UnityWebElement labelPreClosedDateKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Closed Date')]")
	public UnityWebElement labelClosedDateKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Status')]")
	public UnityWebElement labelStatusKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Division')]")
	public UnityWebElement labelDivisionKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Region')]")
	public UnityWebElement labelRegionKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Federal Tax Payment Method')]")
	public UnityWebElement labelFederalTaxPaymentMethodKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Fee Agreement Type')]")
	public UnityWebElement labelFeeAgreementTypeKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Date of Fee Agreement Expiration')]")
	public UnityWebElement labelDateOfFeeAgreementExpirationKey;

	@FindBy(xpath = "//span[normalize-space(text())='Date of Fee Agreement']")
	public UnityWebElement labelDateOfFeeAgreementKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Anticipated Market Value at Open')]")
	public UnityWebElement labelAnticipatedMarketValueAtOpenKey;

	// contact information panel
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Alternate Account Number')]")
	public UnityWebElement labelAlternateAccountNumberKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Legal Name')]")
	public UnityWebElement labelLegalNameKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Account Long Name')]")
	public UnityWebElement labelLongNameKey;

	@FindBy(xpath = "//span[@class='sg-property-name']")
	public List<WebElement> labelHeadersContactInformation;

	@FindBy(xpath = "//span[contains(@class,'sg-property-value')]")
	public List<WebElement> labelValuesContactInformation;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Capacity')]")
	public UnityWebElement labelCapacityKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'How Held')]")
	public UnityWebElement labelHowHeldKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Overdraft Netting Rule')]")
	public UnityWebElement labelOverdraftNettingRuleKey;

	// others panel
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Events') and @class='sg-property-name']")
	public UnityWebElement labelEventsKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Miscellaneous Account Codes')]")
	public UnityWebElement labelMiscellaneousAccountCodesKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Reminders')]")
	public UnityWebElement labelRemindersKey;

	@FindBy(xpath = "//add-edit-info-component/button")
	public UnityWebElement buttonEditAccountInformation;

	@FindBy(xpath = "//h2[normalize-space(text())='Edit Account Information']")
	public UnityWebElement headerEditAccountInformation;

	@FindBy(xpath = "//button[@id='expand']")
	public UnityWebElement buttonExpandAll;

	@FindBy(xpath = "//button[@id='compress']")
	public UnityWebElement buttonCollapseAll;

	// IRA Information tab links
	@FindBy(xpath = "//a[normalize-space(text())='Initiate a Distribution']")
	public UnityWebElement linkInitaiteADistribution;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Required Minimum Distribution']]//span//mat-panel-title")
	public UnityWebElement panelRequiredMinimumDistribution;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Distribution History']]")
	public UnityWebElement panelDistributionHistory;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Owner Information']]")
	public UnityWebElement panelOwnerInformation;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='IRA Relationship']]")
	public UnityWebElement panelIRARelationship;

	// Panel Required Minimum Distribution
	@FindBy(xpath = "//a[@title='Edit']//mat-icon")
	public UnityWebElement linkEditRMD;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Required Minimum Distribution']]/..//span[@class='sg-property-name']")
	public List<WebElement> labelHeadersRequiredMinimumDistribution;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Required Minimum Distribution']]/..//span[contains(@class,'sg-property-value')]")
	public List<WebElement> labelValuesRequiredMinimumDistribution;

	@FindBy(xpath = "//span[normalize-space(text())='RMD This Year']")
	public UnityWebElement labelRMDThisYearkey;

	@FindBy(xpath = "//span[normalize-space(text())='RMD Remaining for the Year']")
	public UnityWebElement labelRMDRemainingfortheYearkey;

	@FindBy(xpath = "//span[normalize-space(text())='Life Expectancy Table']")
	public UnityWebElement labelLifeExpectancyTablekey;

	@FindBy(xpath = "//span[normalize-space(text())='RMD Calculation Date']")
	public UnityWebElement labelRMDCalculationDatekey;

	@FindBy(xpath = "//span[normalize-space(text())='Required Beginning Date']")
	public UnityWebElement labelRequiredBeginningDatekey;

	@FindBy(xpath = "//span[normalize-space(text())='RMD Last Year']")
	public UnityWebElement labelRMDLastYearkey;

	@FindBy(xpath = "//span[normalize-space(text())='Life to Date Remittances']")
	public UnityWebElement labelLifetoDateRemittanceskey;

	@FindBy(xpath = "//span[normalize-space(text())='Trade Basis']")
	public UnityWebElement labelTradeBasiskey;

	@FindBy(xpath = "//span[normalize-space(text())='RMD Paid This Year']")
	public UnityWebElement labelRMDPaidThisYearkey;

	@FindBy(xpath = "//span[normalize-space(text())='RMD Last Payment Date']")
	public UnityWebElement labelRMDLastPaymentDatekey;

	@FindBy(xpath = "//span[normalize-space(text())='Life Expectancy Factory']")
	public UnityWebElement labelLifeExpectancyFactorykey;

	@FindBy(xpath = "//span[normalize-space(text())='RMD Calculated by']")
	public UnityWebElement labelRMDCalculatedbykey;

	@FindBy(xpath = "//span[normalize-space(text())='RMD Payment Deferred']")
	public UnityWebElement labelRMDPaymentDeferredkey;

	@FindBy(xpath = "//span[normalize-space(text())='RMD Paid Last Year']")
	public UnityWebElement labelRMDPaidLastYearkey;

	// Panel Owner Information
	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Owner Information']]/..//span[@class='sg-property-name']")
	public List<WebElement> labelHeadersOwnerInformation;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Owner Information']]/..//span[contains(@class,'sg-property-value')]")
	public List<WebElement> labelValuesOwnerInformation;

	// Panel IRA Relationship
	@FindBy(xpath = "(//div[@role='grid'])[2]")
	public UnityGridElement gridIraRelationship;

	// Panel IRA Distribution History
	@FindBy(xpath = "//div[contains(@class,'disbursement-summary')]//strong")
	public List<WebElement> labelHeadersDistributionHistory;

	@FindBy(xpath = "//div[contains(@class,'disbursement-summary')]//span")
	public List<WebElement> labelValuesDistributionHistory;

	@FindBy(xpath = "(//div[@role='grid'])[1]")
	public UnityGridElement gridIraDistributionHistory;

	@FindBy(xpath = "(//div[@role='grid'])[3]")
	public UnityGridElement gridDistributionDetails;

	@FindBy(xpath = "//span[normalize-space(text())='✕']")
	public UnityWebElement buttonFilterClose;

	@FindBy(xpath = "//span[@class='ag-icon ag-icon-tree-closed']")
	public UnityWebElement iconDistributionHistoryExpand;

	// Portfolio Information Tab elements
	@FindBy(xpath = "//a[normalize-space(text())='Portfolio Information']")
	public UnityWebElement linkPortfolioInformation;

	@FindBy(xpath = "//div[@class='portfolio-info-header']/span[strong]")
	public UnityWebElement labelPortfolioDetail;

	@FindBy(xpath = "//button[@id='unity-account-edit-info-add-new']")
	public UnityWebElement buttonAddNewPortfolioInformation;

	@FindBy(xpath = "//iframe[contains(@src,'ptadd')]")
	public UnityWebElement frameAddPortfolio;

	@FindBy(xpath = "//input[contains(@id,'ctlPortfolioModelRadComboBox_ctlPortfolioModelRadComboBox_Input')]")
	public UnityWebElement textboxPortfolioModel;

	@FindBy(xpath = "//div[contains(@id,'ctlPortfolioModelRadComboBox_ctlPortfolioModelRadComboBox_DropDown')]")
	public UnityWebElement dropdownPortfolioModel;

	@FindBy(xpath = "//input[contains(@id,'ctlPortfolioIdentification_ctlName')]")
	public UnityWebElement textboxAddPortfolioName;

	@FindBy(xpath = "//h2[normalize-space(text())='Add New Portfolio']")
	public UnityWebElement headerAddPortfolio;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Ledger Balance')]/following-sibling::span")
	public UnityWebElement labelLedgerBalanceValue;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Local Currency')]/following-sibling::span")
	public UnityWebElement labelLocalCurrencyValue;

	// Tax Information Tab elements
	@FindBy(xpath = "//button[.//mat-icon[@fisicon='edit']]")
	public UnityWebElement buttonEditTaxInformation;

	@FindBy(xpath = "//mat-icon[contains(@fisicon,'edit')]")
	public UnityWebElement frameEditTaxDetails;

	@FindBy(xpath = "//input[contains(@id,'TaxInformation_ctlCUIACTaxInformation_ctlAccountTaxSitus_ctlCodeFile_Input')]")
	public UnityWebElement textboxCountryOfResidence;

	@FindBy(xpath = "//div[contains(@id,'AccountTaxSitus_ctlCodeFile_DropDown')]")
	public UnityWebElement optionCountryOfResidence;

	@FindBy(xpath = "//span[normalize-space(text())='Tax ID']")
	public UnityWebElement labelTaxID;
	
	@FindBy(xpath = "//span[normalize-space(text())='Tax ID']/following-sibling::span")
	public UnityWebElement labelTaxIDValue;

	@FindBy(xpath = "//span[normalize-space(text())='Tax Servicer']")
	public UnityWebElement labelTaxServicerKey;

	@FindBy(xpath = "//span[normalize-space(text())='Tax ID']/following-sibling::span/span")
	public UnityWebElement labelTaxIdValue;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Current Details']]")
	public UnityWebElement panelCurrentDetails;

	@FindBy(xpath = "//span[.//mat-panel-title[normalize-space(text())='Current Details']]/../..//ag-grid-angular")
	public UnityGridElement gridCurrentDetails;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Dated Details']]")
	public UnityWebElement panelDatedDetails;

	@FindBy(xpath = "//add-edit-info-component//span[normalize-space(text())='Add New']")
	public UnityWebElement buttonAddNewDatedDetails;

	@FindBy(xpath = "//span[.//mat-panel-title[normalize-space(text())='Dated Details']]/../..//ag-grid-angular")
	public UnityGridElement gridDatedDetails;

	@FindBy(xpath = "//*[normalize-space(text())='Client name' or normalize-space(text())='Client Name']")
	public UnityWebElement labelClientNameKey;

	@FindBy(xpath = "//*[normalize-space(text())='IRS control name' or normalize-space(text())='IRS Control Name']")
	public UnityWebElement labelIRSControlNameKey;

	@FindBy(xpath = "//*[normalize-space(text())='Group']")
	public UnityWebElement labelGroupKey;

	@FindBy(xpath = "//iframe[contains(@src,'actaxinfodateddetailsadd')]")
	public UnityWebElement frameAddTaxDatedDetails;

	@FindBy(css = "div[role='grid']")
	public UnityGridElement gridTaxInformationDetail;

	// Relationships Tab elements
	@FindBy(xpath = "//span[@class='viewByFilterString']")
	public UnityWebElement dropdownViewByRelationship;

	@FindBy(xpath = "//mat-radio-button[.//*[normalize-space(text())='All']]//input")
	public UnityWebElement radioButtonAll;

	@FindBy(xpath = "//mat-radio-button[.//*[normalize-space(text())='Account Affiliations']]//input")
	public UnityWebElement radioButtonAccountRelationships;

	@FindBy(xpath = "//mat-radio-button[.//*[normalize-space(text())='Portfolio Affiliations']]//input")
	public UnityWebElement radioButtonPortfolioRelationships;

	@FindBy(xpath = "//mat-radio-button[.//*[normalize-space(text())='Account']]//input")
	public UnityWebElement radioButtonAccount;

	@FindBy(xpath = "//mat-radio-button[.//*[normalize-space(text())='Portfolio']]//input")
	public UnityWebElement radioButtonPortfolio;

	@FindBy(xpath = "(//span[normalize-space(text())='All'])[2]")
	public UnityWebElement dropdownPortfolioPanel;

	@FindBy(xpath = "//span[contains(@class,'portfolio-text')]")
	public UnityWebElement labelSelectedPortfolio;

	@FindBy(xpath = "//div[@role='listbox']")
	public UnityWebElement listPortfolioSuggestions;

	@FindBy(xpath = "//div[contains(@class,'autocomplete-panel')]")
	public UnityWebElement panelSearchResults;

	@FindBy(xpath = "//button[@aria-label='Add New']")
	public UnityWebElement buttonAddNew;

	@FindBy(xpath = "//button[@aria-label='Add Bulk']")
	public UnityWebElement buttonAddBulk;

	@FindBy(xpath = "//ag-grid-angular")
	public UnityGridElement gridRelationships;

	@FindBy(xpath = "//div[contains(@class,'affiliation-menu-actions')]//div[span[normalize-space(text())='Edit']]")
	public UnityWebElement buttonEditAffiliation;

	@FindBy(xpath = "//h2[normalize-space(text())='Edit Affiliation']")
	public UnityWebElement headerEditAffiliations;

	@FindBy(xpath = "//iframe[contains(@src,'relationshipedit')]")
	public UnityWebElement frameEditAffiliation;

	@FindBy(xpath = "//div[contains(@class,'affiliation-menu-actions')]//div[span[normalize-space(text())='Delete']]")
	public UnityWebElement buttonDeleteAffiliation;

	@FindBy(xpath = "//h2[normalize-space(text())='Delete Affiliation']")
	public UnityWebElement headerDeleteAffiliation;

	@FindBy(xpath = "//iframe[contains(@src,'Relationshipdelete')]")
	public UnityWebElement frameDeleteAffiliation;

	@FindBy(xpath = "//span[normalize-space(text())='Delete Relationship']")
	public UnityWebElement labelDeleteRelationship;

	@FindBy(xpath = "//input[@name='ctlSubmit']")
	public UnityWebElement buttonSubmitGoForm;

	// Portfolio information filter
	@FindBy(xpath = "//span[normalize-space(text())='Available Cash']/preceding-sibling::div/input")
	public UnityWebElement checkboxAvailableCash;

	@FindBy(xpath = "//span[normalize-space(text())='Market Settle Value (Local)']/preceding-sibling::div/input")
	public UnityWebElement checkboxMarketSettleValueLocal;

	@FindBy(xpath = "//span[normalize-space(text())='Administrator']/preceding-sibling::div/input")
	public UnityWebElement checkboxAdministrator;

	@FindBy(xpath = "//span[normalize-space(text())='Base Currency']/preceding-sibling::div/input")
	public UnityWebElement checkboxBaseCurrency;

	@FindBy(xpath = "//span[normalize-space(text())='Database Currency']/preceding-sibling::div/input")
	public UnityWebElement checkboxDatabaseCurrency;

	@FindBy(xpath = "//span[normalize-space(text())='Investment Officer']/preceding-sibling::div/input")
	public UnityWebElement checkboxOfficer;

	@FindBy(xpath = "//span[normalize-space(text())='Ledger Cash (Base)']/preceding-sibling::div/input")
	public UnityWebElement checkboxLedgerCashBase;

	@FindBy(xpath = "//span[normalize-space(text())='Ledger Cash (Database)']/preceding-sibling::div/input")
	public UnityWebElement checkboxLedgerCashDatabase;

	@FindBy(xpath = "//span[normalize-space(text())='Ledger Cash (Local)']/preceding-sibling::div/input")
	public UnityWebElement checkboxLedgerCashLocal;

	@FindBy(xpath = "//span[normalize-space(text())='Local Currency Name']/preceding-sibling::div/input")
	public UnityWebElement checkboxLocalCurrencyName;

	@FindBy(xpath = "//span[normalize-space(text())='Market Settle Value (Base)']/preceding-sibling::div/input")
	public UnityWebElement checkboxMarketSettleValueBase;

	@FindBy(xpath = "//span[normalize-space(text())='Market Settle Value (Database)']/preceding-sibling::div/input")
	public UnityWebElement checkboxMarketSettleValueDatabase;

	@FindBy(xpath = "//span[normalize-space(text())='Market Value (Base)']/preceding-sibling::div/input")
	public UnityWebElement checkboxMarketValueBase;

	@FindBy(xpath = "//span[normalize-space(text())='Market Value (Database)']/preceding-sibling::div/input")
	public UnityWebElement checkboxMarketValueDatabase;

	@FindBy(xpath = "//span[normalize-space(text())='Market Value (Local)']/preceding-sibling::div/input")
	public UnityWebElement checkboxMarketValueLocal;

	@FindBy(xpath = "//span[normalize-space(text())='Status']/preceding-sibling::div/input")
	public UnityWebElement checkboxStatus;

	@FindBy(xpath = "//span[normalize-space(text())='Sweep Sum']/preceding-sibling::div/input")
	public UnityWebElement checkboxSweepSum;

	@FindBy(xpath = "//span//add-edit-info-component//button[.//*[@fisicon='edit']]")
	public UnityWebElement buttonEditPortfolioInformation;

	// Portfolio information tab links
//	@FindBy(css = "div[role='grid']")
//	public UnityGridElement gridPortfolioInformation;

	// Portfolio information detail
	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Cash Processing Rules']]")
	public UnityWebElement panelCashProcessingRules;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Classification']]")
	public UnityWebElement panelClassification;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Income Collection Rules']]")
	public UnityWebElement panelIncomeCollectionRules;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Investment Powers']]")
	public UnityWebElement panelInvestmentPowers;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Portfolio Information']]")
	public UnityWebElement panelPortfolioInformation;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Security Processing']]")
	public UnityWebElement panelSecurityProcessing;
	
	@FindBy(xpath = "//mat-dialog-container//mat-expansion-panel-header[.//*[normalize-space(text())='Security Processing Rules']]")
	public UnityWebElement panelSecurityProcessingRules;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='External Identifiers']]")
	public UnityWebElement panelExternalIdentifiers;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Alternate External Identifiers']]")
	public UnityWebElement panelAlternateExternalIdentifiers;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Alternate External Identifiers']]/..//a[@aria-label='Export to CSV']")
	public UnityWebElement buttonExportAlternateExternalIdentifiersGrid;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Alternate External Identifiers']]/..//button[.//*[normalize-space(text())='Add New']]")
	public UnityWebElement buttonAddNewAlternateExternalIdentifier;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='External Safekeeping Accounts']]")
	public UnityWebElement panelExternalSafekeepingAccounts;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='External Safekeeping Accounts']]/..//a[@aria-label='Export to CSV']")
	public UnityWebElement buttonExportExternalSafekeepingAccountsGrid;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='External Safekeeping Accounts']]/..//button[.//*[normalize-space(text())='Add New']]")
	public UnityWebElement buttonAddNewExternalSafekeepingAccount;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Tax Processing Rules']]")
	public UnityWebElement panelTaxProcessingRules;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Sweep Processing']]")
	public UnityWebElement panelSweepProcessing;

	@FindBy(xpath = "//*[contains(@class,'sg-property-name')]")
	public List<WebElement> labelHeadersPorfolioDetail;

	@FindBy(xpath = "//*[starts-with(@class,'sg-property-value ng-star')]")
	public List<WebElement> labelValuesPorfolioDetail;

	@FindBy(xpath = "//*[normalize-space(text())='Change External Identifier']")
	public UnityWebElement headerChangeExternalIdentifier;

	@FindBy(xpath = "//*[normalize-space(text())='Change External Safekeeping Account']")
	public UnityWebElement headerChangeExternalSafekeepingAccount;

	@FindBy(xpath = "//*[normalize-space(text())='Delete External Identifier']")
	public UnityWebElement headerDeleteExternalIdentifier;

	@FindBy(xpath = "//*[normalize-space(text())='Delete External Safekeeping Account']")
	public UnityWebElement headerDeleteExternalSafekeepingAccount;

	// Portfolio information - panel elements
	@FindBy(xpath = "//*[normalize-space(text())='Alternate ID:']/../following-sibling::span")
	public UnityWebElement labelAlternateIdValue;

	@FindBy(xpath = "//*[normalize-space(text())='Alternate ID:']/../following-sibling::*/button")
	public UnityWebElement buttonEditAlternateID;

	@FindBy(xpath = "//*[normalize-space(text())='Edit Portfolio Alternate Identifier']")
	public UnityWebElement headerEditPortfolioAlternateIdentifier;

	@FindBy(xpath = "//iframe[contains(@src,'AltIdentifierChange')]")
	public UnityWebElement frameEditPortfolioAlternateIdentifier;

	@FindBy(xpath = "//input[contains(@id,'AltIdentifierChange_ctlAltIdentifier')]")
	public UnityWebElement textboxAlternateID;

	@FindBy(xpath = "//input[@id='ctlSubmit']")
	public UnityWebElement buttonSubmitEditALternatePortfolio;

	@FindBy(xpath = "//div[@role='menuitem'][.//span[normalize-space(text())='Edit']]")
	public UnityWebElement buttonEditRecordInGrid;

	@FindBy(xpath = "//div[@role='menuitem'][.//span[normalize-space(text())='Edit']]")
	public UnityWebElement buttonDeleteRecordInGrid;

	@FindBy(xpath = "//ag-grid-angular[@id='alternate-external-identifier']//div[@role='grid']")
	public UnityGridElement gridAlternateExternalIdentifiers;

//	@FindBy(xpath = "//ag-grid-angular[@id='external-safekeeping-accounts']//div[@role='grid']")
//	public UnityGridElement gridExternalSafekeepingAccounts;

	// Portfolio information edit frame elements
	@FindBy(xpath = "//iframe[contains(@id,'iFrame')]")
	public UnityWebElement frameEditPortfolioInformation;

	@FindBy(xpath = "//em[normalize-space(text())='Portfolio Information']")
	public UnityWebElement panelPortfolioInformationEdit;

	@FindBy(xpath = "//em[normalize-space(text())='Income Collection Rules']")
	public UnityWebElement panelIncomeCollectionRulesEdit;

	@FindBy(xpath = "//em[normalize-space(text())='Security Processing Rules']")
	public UnityWebElement panelSecurityProcessingRulesEdit;

	@FindBy(xpath = "//em[normalize-space(text())='Tax Processing Rules']")
	public UnityWebElement panelTaxProcessingRulesEdit;

	@FindBy(xpath = "//em[normalize-space(text())='Cash Processing Rules']")
	public UnityWebElement panelCashProcessingRulesEdit;

	@FindBy(xpath = "//em[normalize-space(text())='Cash Receipt Type']")
	public UnityWebElement panelCashReceiptTypeEdit;

	@FindBy(xpath = "//em[normalize-space(text())='Portfolio Investment Powers']")
	public UnityWebElement panelPortfolioInvestmentPowersEdit;

	@FindBy(xpath = "//em[normalize-space(text())='Portfolio Sweep Processing']")
	public UnityWebElement panelPortfolioSweepProcessingEdit;

	@FindBy(xpath = "//em[normalize-space(text())='Documents']")
	public UnityWebElement panelDocumentsEdit;

	@FindBy(xpath = "//em[normalize-space(text())='Comments']")
	public UnityWebElement panelCommentsEdit;

	@FindBy(xpath = "//span[normalize-space(text())='Save']")
	public UnityWebElement buttonSave;

	// SO screens in the flow
	// Add new relationship to - screen
	@FindBy(xpath = "//iframe[contains(@src,'TRANS=RelationshipAdd&RelType')]")
	public UnityWebElement frameAddRelationship;

	@FindBy(xpath = "//button[@id='unity-account-add-new-for-dialog-selected-option']")
	public UnityWebElement dropdownAddNewRelationShipTo;

	@FindBy(xpath = "//button[span[normalize-space(text())='Select']]")
	public UnityWebElement dropdownSelect;

	// Add Bulk account and Relationship
	@FindBy(xpath = "//iframe[contains(@src,'BulkRelationshipAdd')]")
	public UnityWebElement frameAddBulkRelationship;

	@FindBy(xpath = "//input[contains(@id,'AffiliationCorporate_ctlAffiliationType_ctlCodeFile_Input')]")
	public UnityWebElement textboxCorporateAffilationType;

	@FindBy(xpath = "//div[contains(@id,'AffiliationCorporate_ctlAffiliationType_ctlCodeFile_DropDown')]")
	public UnityWebElement optionCorporateAffilationType;

	@FindBy(xpath = "//input[contains(@id,'AffiliationPartyOfInterest_ctlAffiliationType_ctlCodeFile_Input')]")
	public UnityWebElement textboxPartyOfInterestAffilationType;

	@FindBy(xpath = "//div[contains(@id,'AffiliationPartyOfInterest_ctlAffiliationType_ctlCodeFile_DropDown')]")
	public UnityWebElement optionPartyOfInterestAffilationType;

	@FindBy(xpath = "//div[contains(@id,'AffiliationCorporate_ctlEmployee_ctlEmployeeLookupRadComboBox_DropDown')]")
	public UnityWebElement optionEmployee;

	@FindBy(xpath = "//input[contains(@id,'AffiliationPartyOfInterest_ctlClientLookup_ctlClientRadComboBox_Input')]")
	public UnityWebElement textboxclient;

	@FindBy(xpath = "//div[contains(@id,'AffiliationPartyOfInterest_ctlClientLookup_ctlClientRadComboBox_DropDown')]")
	public UnityWebElement optionclient;

	@FindBy(xpath = "//input[@value='Add']")
	public UnityWebElement buttonAdd;

	@FindBy(xpath = "//a[contains(@id,'ctlRelationshipMaintenance_ctlRelationshipMaintenance_ctlAffiliation_Arrow')]")
	public UnityWebElement dropdownRelationShipType;

	@FindBy(xpath = "//li[normalize-space(text())='Party Of Interest']")
	public UnityWebElement optionPartyOfInterest;

	@FindBy(xpath = "//table[contains(@id,'RelationshipMaintenanceRelationshipList_ctlRelationshipList_ctl00')]")
	public UnityTableElement tableRelationshipList;

	@FindBy(xpath = "//input[@name='ctlSubmitAndClose']")
	public UnityWebElement buttonBulkSubmit;

	@FindBy(xpath = "//button[@id='unity-add-bulk-for-type-select']")
	public UnityWebElement buttonAddBulkSelect;

	@FindBy(xpath = "//button[@id='select' or @id='unity-add-new-for-type-select']")
	public UnityWebElement buttonSelect;

	@FindBy(xpath = "//button[@id='unity-add-new-for-type-cancel']")
	public UnityWebElement buttonCancel;

	@FindBy(xpath = "//button[*[normalize-space(text())='Cancel']]")
	public UnityWebElement buttonCancelNote;

	@FindBy(xpath = "//input[contains(@id,'ctlEmployee_ctlEmployeeLookupRadComboBox_Input')]")
	public UnityWebElement textboxEmployee;

	@FindBy(xpath = "//a[contains(@id,'AffiliationPartyOfInterest_ctlAffiliationType_ctlCodeFile_Arrow')]")
	public UnityWebElement dropdownAffiliationType;

	@FindBy(xpath = "//div[@id='ctlRelationshipMaintenance_ctlRelationshipMaintenance_ctlAffiliationCorporate_ctlEmployee_ctlEmployeeLookupRadComboBox_DropDown']")
	public UnityWebElement panelEmployee;

	@FindBy(xpath = "//span[normalize-space(text())='No records to display.']")
	public UnityWebElement labelNoRecordsToDisplay;

	// Edit required minimum distribution panel elements
	@FindBy(xpath = "//h2[normalize-space(text())='Required Minimum Distribution']")
	public UnityWebElement headerRequiredMinimumDistribution;

	@FindBy(xpath = "//input[@formcontrolname='currentYearAmount']")
	public UnityWebElement textboxCurrentYearAmount;

	@FindBy(xpath = "//input[@formcontrolname='currentYearMarketValue']")
	public UnityWebElement textboxCurrentYearMarketValue;

	@FindBy(xpath = "//input[@formcontrolname='firstDistributionAmount']")
	public UnityWebElement textboxFIrstDistributionAmount;

	@FindBy(xpath = "//button[*[normalize-space(text())='Submit']]")
	public UnityWebElement buttonSubmit;

	@FindBy(xpath = "//div[@class='mat-dialog-content']")
	public UnityWebElement labelUpdateRequestDialog;

	@FindBy(xpath = "//button[*[normalize-space(text())='Ok']]")
	public UnityWebElement buttonOk;

	// Notes tab details
	@FindBy(css = "div[role='grid']")
	public UnityGridElement gridNotes;

	@FindBy(xpath = "//span[normalize-space(text())='Contact Type']/preceding-sibling::div/input")
	public UnityWebElement checkboxContactType;

	@FindBy(xpath = "//span[normalize-space(text())='Created By']/preceding-sibling::div/input")
	public UnityWebElement checkboxCreatedBy;

	@FindBy(xpath = "//span[normalize-space(text())='Created Date']/preceding-sibling::div/input")
	public UnityWebElement checkboxCreatedDate;

	@FindBy(xpath = "//mat-icon[@fisicon='calendar']")
	public UnityWebElement iconCalender;

	@FindBy(xpath = "//div[contains(@class,'mat-calendar-body-today')]")
	public UnityWebElement iconCurrentDate;

	@FindBy(xpath = "//span[normalize-space(text())='Security Name']/preceding-sibling::div/input")
	public UnityWebElement checkboxSecurityName;

	@FindBy(xpath = "//div[@formcontrolname='securityName']//input")
	public UnityWebElement textboxSecurityName;

	@FindBy(xpath = "//mat-icon[@fisicon='filter']")
	public UnityWebElement buttonClearAllGridFilters;

	@FindBy(xpath = "//span[normalize-space(text())='Add New']")
	public UnityWebElement buttonAddNewNotes;

	@FindBy(xpath = "//b[normalize-space(text())='New Notes']")
	public UnityWebElement labelNewNotes;

	@FindBy(xpath = "//div[@ref='eHeader']//span[@class='ag-icon ag-icon-filter']")
	public UnityWebElement gridFilterIcon;

	@FindBy(xpath = "//div[@ref='eSelectAll']")
	public UnityWebElement checkboxSelectAll;

	@FindBy(xpath = "//div[@ref='eCheckbox'][1]")
	public UnityWebElement gridFilterFirstCheckBox;

	@FindBy(xpath = "//div[@ref='eLabel']//span[normalize-space(text())='Topic']")
	public UnityWebElement gridColumnHeaderTopic;

	@FindBy(xpath = "//div[@ref='eLabel']//span[normalize-space(text())='Notes Text']")
	public UnityWebElement gridColumnHeaderNotesText;

	@FindBy(xpath = "//div[@ref='eLabel']//span[normalize-space(text())='Contact Date']")
	public UnityWebElement gridColumnHeaderContactDate;

	@FindBy(xpath = "//div[@ref='eLabel']//span[normalize-space(text())='Priority']")
	public UnityWebElement gridColumnHeaderPriority;

	@FindBy(xpath = "//div[@ref='eLabel']//span[normalize-space(text())='Modified Date']")
	public UnityWebElement gridColumnHeaderModifiedDate;

	@FindBy(xpath = "//div[@ref='eLabel']//span[normalize-space(text())='Modified By']")
	public UnityWebElement gridColumnHeaderModifiedBy;

	@FindBy(xpath = "//span[normalize-space(text())='Topic']//parent::div/preceding-sibling::span")
	public UnityWebElement gridFilterTopic;

	@FindBy(xpath = "//span[normalize-space(text())='Notes Text']//parent::div/preceding-sibling::span")
	public UnityWebElement gridFilterNotesText;

	@FindBy(xpath = "//span[normalize-space(text())='Contact Date']//parent::div/preceding-sibling::span")
	public UnityWebElement gridFilterContactDate;

	@FindBy(xpath = "//span[normalize-space(text())='Priority']//parent::div/preceding-sibling::span")
	public UnityWebElement gridFilterPriority;

	@FindBy(xpath = "//span[normalize-space(text())='Modified Date']//parent::div/preceding-sibling::span")
	public UnityWebElement gridFilterModifiedDate;

	@FindBy(xpath = "//span[normalize-space(text())='Modified By']//parent::div/preceding-sibling::span")
	public UnityWebElement gridFilterModifiedBy;

	@FindBy(xpath = "//div[@ref='eMiniFilter']/div/input")
	public UnityWebElement gridFilterSearch;

	@FindBy(xpath = "//iframe[contains(@src,'AccountNotes')]")
	public UnityWebElement frameAccountNotes;

	@FindBy(xpath = "//iframe[contains(@src,'ClientNotes')]")
	public UnityWebElement frameClientNotes;

	@FindBy(xpath = "//b[normalize-space(text())='Current Notes']")
	public UnityWebElement labelCurrentNotes;

	@FindBy(xpath = "//span[normalize-space(text())='retest new']")
	public UnityWebElement labelRetestNew;

	@FindBy(xpath = "//span[normalize-space(text())='Shr new client']")
	public UnityWebElement labelShrNewClientNotes;

	@FindBy(xpath = "//span[normalize-space(text())='retest new']//ancestor::div[@class='myTopicBorder']//textarea")
	public UnityWebElement textBoxRetestNew;

	@FindBy(xpath = "//span[normalize-space(text())='Shr new client']//ancestor::div[@class='myTopicBorder']//textarea")
	public UnityWebElement textBoxShrNewClientNotes;

	@FindBy(xpath = "//span[normalize-space(text())='retest new']//ancestor::div[@class='myTopicBorder']//input[@type='submit']")
	public UnityWebElement buttonSubmitRetestNew;

	@FindBy(xpath = "//span[normalize-space(text())='Shr new client']//ancestor::div[@class='myTopicBorder']//input[@type='submit']")
	public UnityWebElement buttonSubmitShrNewClientNotes;

	@FindBy(xpath = "(//span[normalize-space(text())='retest new']//ancestor::div[@class='myTopicBorder']//textarea[contains(text(), ' Modified by ')])[1]")
	public UnityWebElement textboxEditRetestNew;

	@FindBy(xpath = "(//span[normalize-space(text())='Shr new client']//ancestor::div[@class='myTopicBorder']//textarea[contains(text(), ' Modified by ')])[1]")
	public UnityWebElement textboxEditShrNewClientNotes;

	@FindBy(xpath = "//a[normalize-space(text())='Modified Date']")
	public UnityWebElement linkModifiedDate;

	@FindBy(xpath = "//a[normalize-space(text())='Topic']")
	public UnityWebElement linkTopic;

	@FindBy(xpath = "//a[@name='DeleteButton']")
	public UnityWebElement linkDelete;

	@FindBy(xpath = "//mat-select[@formcontrolname='topicId']")
	public UnityWebElement dropdownTopic;

	@FindBy(xpath = "//mat-option")
	public UnityWebElement listTopic;

	@FindBy(xpath = "//button[span[normalize-space(text())='Ok']]")
	public UnityWebElement buttonPopupOk;

	@FindBy(xpath = "//button[span[normalize-space(text())='Delete']]")
	public UnityWebElement buttonPopupDelete;

	@FindBy(xpath = "//label[normalize-space(text())='Contact Date*']/parent::Strong/following-sibling::mat-form-field//input")
	public UnityWebElement textboxContactDate;

	@FindBy(xpath = "//mat-select[@formcontrolname='priority']")
	public UnityWebElement dropdownPriority;

	@FindBy(xpath = "//mat-select[@formcontrolname='contactType']")
	public UnityWebElement dropdownContactType;

	@FindBy(xpath = "//span[normalize-space(text())='Asset Note']//preceding-sibling::div/input")
	public UnityWebElement checkboxAssetNote;

	@FindBy(xpath = "//textarea[@formcontrolname='noteText']")
	public UnityWebElement textboxNoteText;

	@FindBy(xpath = "//div[contains(@class,'mat-autocomplete-panel unity-filter-autocomplete')]/mat-option")
	public UnityWebElement optionsSearch;

	@FindBy(xpath = "//button[span[normalize-space(text())='Cancel']]")
	public UnityWebElement buttonPopupCancel;

	@FindBy(xpath = "//button[span[normalize-space(text())='Submit']]")
	public UnityWebElement buttonPopupSubmit;

	@FindBy(xpath = "//strong[label[normalize-space(text())='Topic*']]/following-sibling::mat-form-field//*[normalize-space(text())='(required)']")
	public UnityWebElement labelTopicMandatory;

	@FindBy(xpath = "//strong[label[normalize-space(text())='Note Text*']]/following-sibling::mat-form-field//*[normalize-space(text())='(required)']")
	public UnityWebElement labelNoteTextMandatory;

	@FindBy(xpath = "//strong[label[normalize-space(text())='Security Name*']]/following-sibling::div//*[normalize-space(text())='(required)']")
	public UnityWebElement labelSecurityNameMandatory;

	@FindBy(xpath = "//strong[label[normalize-space(text())='Contact Date*']]/following-sibling::mat-form-field//*[normalize-space(text())='(required)']")
	public UnityWebElement labelContactDateMandatory;

	@FindBy(xpath = "//strong[label[normalize-space(text())='Contact Date*']]/following-sibling::mat-form-field//*[normalize-space(text())='Date cannot be in the future.']")
	public UnityWebElement labelFutureDateError;

	@FindBy(xpath = "(//mat-dialog-content//mat-panel-title[contains(text(),'Modified By:')])[1]")
	public UnityWebElement labelModifiedBy;

	@FindBy(xpath = "//mat-dialog-content//mat-panel-title[contains(text(),'Created By:')]")
	public UnityWebElement labelCreatedBy;

	@FindBy(xpath = "(//mat-dialog-content//div[contains(@id,'cdk-accordion-child')])[1]//div[@class='overflow-text']")
	public UnityWebElement textboxPopupNote;

	// Portfolio detail screen elements
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Net Idle Cash / Overdraft Transaction')]")
	public UnityWebElement labelNetIdleCashOverdraftTransactionKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Idle Cash Interest Group')]")
	public UnityWebElement labelIdleCashInterestGroupKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Income Days Post Available')]")
	public UnityWebElement labelIncomeDaysPostAvailableKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Income Days Post Ledger')]")
	public UnityWebElement labelIncomeDaysPostLedgerKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Income Default Rule')]")
	public UnityWebElement labelIncomeDefaultRuleKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Ledger Balance')]")
	public UnityWebElement labelLedgerBalanceKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Maturity Days Post Available')]")
	public UnityWebElement labelMaturityDaysPostAvailableKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Maturity Days Post Ledger')]")
	public UnityWebElement labelMaturityDaysPostLedgerKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Maturity Default Rule')]")
	public UnityWebElement labelMaturityDefaultRuleKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Override Availability Rule')]")
	public UnityWebElement labelOverrideAvailabilityRuleKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Capacity')]")
	public UnityWebElement labelCapacityClassificationKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Responsibility Center')]")
	public UnityWebElement labelResponsibilityCenterKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Shared Responsibility Center')]")
	public UnityWebElement labelSharedResponsibilityCenterKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Shared Responsibility Percent')]")
	public UnityWebElement labelSharedResponsibilityPercentKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Allow Income Disbursements')]")
	public UnityWebElement labelAllowIncomeDisbursementsKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Allow Income Payout')]")
	public UnityWebElement labelAllowIncomePayoutKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Allow Total Reinvestment')]")
	public UnityWebElement labelAllowTotalReinvestmentKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Allow Whole Share Reinvestment')]")
	public UnityWebElement labelAllowWholeShareReinvestmentKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Portfolio to Credit Income')]")
	public UnityWebElement labelPortfolioToCreditIncomeKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Preferred Income Disposition Method')]")
	public UnityWebElement labelPreferredIncomeDispositionMethodKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Ami Strategy')]")
	public UnityWebElement labelAMIStrategyKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Broker Confirm Rule')]")
	public UnityWebElement labelBrokerConfirmRuleKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Commingled Trust Fund Rule')]")
	public UnityWebElement labelCommingledTrustFundRuleKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Fractional Share Rule')]")
	public UnityWebElement labelFractionalShareRuleKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Investment authority') or contains(normalize-space(text()),'Investment Authority') ]")
	public UnityWebElement labelInvestmentAuthorityKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Investment objective') or contains(normalize-space(text()),'Investment Objective')]")
	public UnityWebElement labelInvestmentObjectiveKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Investment Officer')]")
	public UnityWebElement labelInvestmentOfficerKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Investment Officer')]/following-sibling::span/a")
	public UnityWebElement linkInvestmentOfficerValue;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Mutual Fund Lot Sale Method')]")
	public UnityWebElement labelMutualFundLotSaleMethodKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'PM Strategy')]")
	public UnityWebElement labelPMStrategyKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Portfolio Managed')]")
	public UnityWebElement labelPortfolioManagedKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Positions Allowed Per Security')]")
	public UnityWebElement labelPositionsAllowedPerSecurityKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Prefer Taxlot Sale Method')]")
	public UnityWebElement labelPreferTaxlotSaleMethodKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Rate of Return Objective')]")
	public UnityWebElement labelRateOfReturnObjectiveKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Risk Level')]")
	public UnityWebElement labelRiskLevelKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Trade Approval Rule')]")
	public UnityWebElement labelTradeApprovalRuleKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Voting Authority')]")
	public UnityWebElement labelVotingAuthorityKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Portfolio Number')]")
	public UnityWebElement labelPortfolioNumberKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Portfolio Name')]")
	public UnityWebElement labelPortfolioNameKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Local Currency')]")
	public UnityWebElement labelLocalCurrencyKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Alternate ID')]")
	public UnityWebElement labelAlternateIDKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Administrator')]")
	public UnityWebElement labelAdministratorKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Date Opened')]")
	public UnityWebElement labelDateopenedKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Date Pre Closed')]")
	public UnityWebElement labelDatepreclosedKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Date Closed')]")
	public UnityWebElement labelDatclosedKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Status')]")
	public UnityWebElement labelStatuspPTInfoKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Allow Block Trades')]")
	public UnityWebElement labelAllowBlockTradesKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Allow Naked Options')]")
	public UnityWebElement labelAllowNakedOptionsKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Allow Short Sales')]")
	public UnityWebElement labelAllowShortSalesKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Gross to Net Proof')]")
	public UnityWebElement labelGrossToNetProofKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Keep Federal Cost')]")
	public UnityWebElement labelKeepFederalCostKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Keep State Cost')]")
	public UnityWebElement labelKeepStateCostKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Maintain Tax Lots')]")
	public UnityWebElement labelMaintainTaxLotsKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Security Activity')]")
	public UnityWebElement labelSecurityActivityKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Security Lending')]")
	public UnityWebElement labelSecurityLendingKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Auto Backdate Late Trades')]")
	public UnityWebElement labelAutoBackdateLateTradesKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Memo Post Cash')]")
	public UnityWebElement labelMemoPostCashKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Theoretically Settle Buys?')]")
	public UnityWebElement labelTheoreticallySettleBuysKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Theoretically Settle Maturities?')]")
	public UnityWebElement labelTheoreticallySettleMaturitiesKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Theoretically Settle Sales?')]")
	public UnityWebElement labelTheoreticallySettleSalesKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Treat Invest Restrict as Error')]")
	public UnityWebElement labelTreatInvestRestrictAsErrorKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Transaction for Open Order Changes')]")
	public UnityWebElement labelTransactionForOpenOrderChangesKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Depository')]")
	public UnityWebElement labelDepositoryKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Powers on Hand')]")
	public UnityWebElement labelPowersOnHandKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Registration')]")
	public UnityWebElement labelRegistrationKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Registration Class')]")
	public UnityWebElement labelRegistrationClassKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Storage Location')]")
	public UnityWebElement labelStorageLocationKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Amortize Bond Discounts for Tax')]")
	public UnityWebElement labelAmortizeBondDiscountsForTaxKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Amortize Bond Premium for Tax')]")
	public UnityWebElement labelAmortizeBondPremiumForTaxKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Initial Position Default Tax Amortization')]")
	public UnityWebElement labelInitialPositionDefaultTaxAmortizationKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Non Resident Discount Rate')]")
	public UnityWebElement labelNonResidentDiscountRateKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Non Resident Reserve Portfolio')]")
	public UnityWebElement labelNonResidentReservePortfolioKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Tax Amortization Calculation Rule')]")
	public UnityWebElement labelTaxAmortizationCalculationRuleKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Tax Situs')]")
	public UnityWebElement labelTaxSitusKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Allow Sweep')]")
	public UnityWebElement labelAllowSweepKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Do Realignment')]")
	public UnityWebElement labelDoRealignmentKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Current Sweep Strategy')]")
	public UnityWebElement labelCurrentSweepStrategyKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Strategy Last Sweep')]")
	public UnityWebElement labelStrategyLastSweepKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Sweep Net O/D with Portfolio Name')]")
	public UnityWebElement labelSweepNetODWithPortfolioNameKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Sweep Net O/D with Portfolio Number')]")
	public UnityWebElement labelSweepNetODWithPortfolioNumberKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Swept with Portfolio Name')]")
	public UnityWebElement labelSweptWithPortfolioNameKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Swept with Portfolio Number')]")
	public UnityWebElement labelSweptWithPortfolioNumberKey;

	// Relationship details
	@FindBy(xpath = "//a[normalize-space(text())='Affiliations']")
	public UnityWebElement linkBackToRelationships;

	@FindBy(xpath = "//*[contains(normalize-space(text()),'Affiliation Name:')]")
	public UnityWebElement labelRelationshipNameKey;

	@FindBy(xpath = "//*[normalize-space(text())='Affiliate:']")
	public UnityWebElement labelAffiliteKey;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Contact Information']]")
	public UnityWebElement panelContactInformationRelationships;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Office Email 1')]")
	public UnityWebElement labelOfficeEmail1Key;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Office Email 2')]")
	public UnityWebElement labelOfficeEmail2Key;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Telephone - Cell')]")
	public UnityWebElement labelTelephoneCellKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'City')]")
	public UnityWebElement labelCityKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Country Name')]")
	public UnityWebElement labelCountryNameKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'State Name')]")
	public UnityWebElement labelStateNameKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Zip Code')]")
	public UnityWebElement labelZipCodeKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Cell phone') or contains(normalize-space(text()),'Cell Phone')]")
	public UnityWebElement labelCellPhoneKey;

	@FindBy(xpath = "//*[contains(normalize-space(text()),'Address')]")
	public UnityWebElement labelAddressKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Home email') or contains(normalize-space(text()),'Home Email')]")
	public UnityWebElement labelHomeEmailKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Home Fax Phone')]")
	public UnityWebElement labelHomeFaxPhoneKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Home phone') or contains(normalize-space(text()),'Home Phone')]")
	public UnityWebElement labelHomePhoneKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Number of Alternate Addresses')]")
	public UnityWebElement labelNumberOfAlternateAddressesKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Office email') or contains(normalize-space(text()),'Office Email')]")
	public UnityWebElement labelOfficeEmailKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Office fax phone') or contains(normalize-space(text()),'Office Fax Phone')]")
	public UnityWebElement labelOfficeFaxPhoneKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Office phone') or contains(normalize-space(text()),'Office Phone')]")
	public UnityWebElement labelOfficePhoneKey;

	// Added by Sindhu
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Account Sub-Type')]")
	public UnityWebElement labelAccountSubTypeKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Administrative Officer')]")
	public UnityWebElement labelAdministratorOfficerKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Source of Business')]")
	public UnityWebElement labelSourceofBusinessKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Inception Date')]")
	public UnityWebElement labelInceptionDateKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Date Funded')]")
	public UnityWebElement labelDateFundedKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Social Code')]")
	public UnityWebElement labelSocialCodeKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Revocable Status')]")
	public UnityWebElement labelRevocableStatusKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Cash in Lieu Rule')]")
	public UnityWebElement labelCashInLieuRuleKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Return of Capital Rule')]")
	public UnityWebElement labelReturnOfCapitalRuleKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Small Stock Dividend Rule')]")
	public UnityWebElement labelSmallStockDividendRuleKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Estimated Close Date')]")
	public UnityWebElement labelEstimatedCloseDateKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Date of Death')]")
	public UnityWebElement labelDateOfDeathKey;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Fee Information']]")
	public UnityWebElement panelFeeInformation;

	@FindBy(xpath = "//div[@role='grid']")
	public UnityGridElement gridUserDefined;

	@FindBy(xpath = "//span[normalize-space(text())='City']/preceding-sibling::div/input")
	public UnityWebElement checkboxCity;

	@FindBy(xpath = "//span[normalize-space(text())='Client Name 1']/preceding-sibling::div/input")
	public UnityWebElement checkboxClientName1;

	@FindBy(xpath = "//span[normalize-space(text())='Client Name 2']/preceding-sibling::div/input")
	public UnityWebElement checkboxClientName2;

	@FindBy(xpath = "//span[normalize-space(text())='Country']/preceding-sibling::div/input")
	public UnityWebElement checkboxCountry;

	@FindBy(xpath = "//span[normalize-space(text())='Country Abbreviation']/preceding-sibling::div/input")
	public UnityWebElement checkboxCountryAbbreviation;

	@FindBy(xpath = "//span[normalize-space(text())='Country Tax Situs Name']/preceding-sibling::div/input")
	public UnityWebElement checkboxCountryTaxSitusName;

	@FindBy(xpath = "//span[normalize-space(text())='IRS Name Control']/preceding-sibling::div/input")
	public UnityWebElement checkboxIrsNameControl;

	@FindBy(xpath = "//span[normalize-space(text())='Pers Prop Tax Prod Grp Abbreviation']/preceding-sibling::div/input")
	public UnityWebElement checkboxPersPropTaxProdGrpAbbreviation;

	@FindBy(xpath = "//span[normalize-space(text())='Pers Prop Tax Prod Grp Descr']/preceding-sibling::div/input")
	public UnityWebElement checkboxPersPropTaxProdGrpDescr;

	@FindBy(xpath = "//span[normalize-space(text())='Personal Prop Tax Situs Abbreviation']/preceding-sibling::div/input")
	public UnityWebElement checkboxPersonalPropTaxSitusAbbreviation;

	@FindBy(xpath = "//span[normalize-space(text())='Personal Prop Tax Situs Description']/preceding-sibling::div/input")
	public UnityWebElement checkboxPersonalPropTaxSitusDescription;

	@FindBy(xpath = "//span[normalize-space(text())='State Abbreviation']/preceding-sibling::div/input")
	public UnityWebElement checkboxStateAbbreviation;

	@FindBy(xpath = "//span[normalize-space(text())='State Tax Situs Abbreviation']/preceding-sibling::div/input")
	public UnityWebElement checkboxStateTaxSitusAbbreviation;

	@FindBy(xpath = "//span[normalize-space(text())='Street Name']/preceding-sibling::div/input")
	public UnityWebElement checkboxStreetName;

	@FindBy(xpath = "//span[normalize-space(text())='Street Number']/preceding-sibling::div/input")
	public UnityWebElement checkboxStreetNumber;

	@FindBy(xpath = "//span[normalize-space(text())='Tax ID']/preceding-sibling::div/input")
	public UnityWebElement checkboxTaxId;

	@FindBy(xpath = "//span[normalize-space(text())='Taxpayer Class']/preceding-sibling::div/input")
	public UnityWebElement checkboxTaxpayerClass;

	@FindBy(xpath = "//span[normalize-space(text())='Zip Postal Code']/preceding-sibling::div/input")
	public UnityWebElement checkboxZipPostalCode;

	@FindBy(xpath = "//span[normalize-space(text())='Address']/preceding-sibling::div/input")
	public UnityWebElement checkboxAddress;

	@FindBy(xpath = "//span[normalize-space(text())='Address 2']/preceding-sibling::div/input")
	public UnityWebElement checkboxAddres2;

	@FindBy(xpath = "//span[normalize-space(text())='Address Apartment Number']/preceding-sibling::div/input")
	public UnityWebElement checkboxAddressApartmentNumber;

	@FindBy(xpath = "//span[normalize-space(text())='Address Building']/preceding-sibling::div/input")
	public UnityWebElement checkboxAddressBuilding;

	@FindBy(xpath = "//span[normalize-space(text())='Address PO Box']/preceding-sibling::div/input")
	public UnityWebElement checkboxAddressPoBox;

	@FindBy(xpath = "//span[normalize-space(text())='Address Suite Number']/preceding-sibling::div/input")
	public UnityWebElement checkboxAddressSuiteNumber;

	@FindBy(xpath = "//span[normalize-space(text())='Affiliation Details']/preceding-sibling::div/input")
	public UnityWebElement checkboxAffiliationDetails;

	@FindBy(xpath = "//span[normalize-space(text())='Country Name']/preceding-sibling::div/input")
	public UnityWebElement checkboxCountryName;

	@FindBy(xpath = "//span[normalize-space(text())='City']/preceding-sibling::div/input")
	public UnityWebElement checkboxCityName;

	@FindBy(xpath = "//span[normalize-space(text())='Home Phone']/preceding-sibling::div/input")
	public UnityWebElement checkboxHomePhone;

	@FindBy(xpath = "//span[normalize-space(text())='Office Phone']/preceding-sibling::div/input")
	public UnityWebElement checkboxOfficePhone;

	@FindBy(xpath = "//span[normalize-space(text())='Primary Email']/preceding-sibling::div/input")
	public UnityWebElement checkboxPrimaryEmail;

	@FindBy(xpath = "//span[normalize-space(text())='Secondary Email']/preceding-sibling::div/input")
	public UnityWebElement checkboxSecondaryEmail;

	@FindBy(xpath = "//span[normalize-space(text())='State Name']/preceding-sibling::div/input")
	public UnityWebElement checkboxStateName;

	@FindBy(xpath = "//span[normalize-space(text())='Zip Code']/preceding-sibling::div/input")
	public UnityWebElement checkboxZipCode;

	@FindBy(xpath = "//button[@aria-label='close']")
	public UnityWebElement buttonClose;

	// Delete Affiliation
	@FindBy(xpath = "//*[@id='ctlDockDocuments_C_ctlDocuments_ctlDocsGrid_ctl00']")
	public UnityWebElement tableDocuments;

	@FindBy(xpath = "//*[@id='ctlDockComments_C_ctlComments_ctlCommentsControl_ctlAddComments']")
	public UnityWebElement linkAddComments;

	@FindBy(xpath = "//a[contains(text(),'Add Comments')]")
	public UnityWebElement linkAddCommentsEditTax;

	@FindBy(xpath = "//*[@id='ctlDockComments_C_ctlComments_ctlCommentsControl_ctlEnterComments']")
	public UnityWebElement textareaComments;

	@FindBy(xpath = "//*[@id='ctlDockComments_C_ctlComments_ctlCommentsControl_btnSaveComment']")
	public UnityWebElement buttonSaveComments;

	// Account Relationship grid
	@FindBy(xpath = "//input[@placeholder='Search']")
	public UnityWebElement textBoxSearch;

	@FindBy(xpath = "//button[normalize-space(text())='Print All Pages']")
	public UnityWebElement buttonPrintAllPages;

	@FindBy(xpath = "//button[normalize-space(text())='Print Current Page']")
	public UnityWebElement buttonPrintCurrentPages;

	@FindBy(xpath = "//button[@id='edit-delete-affiliation-close']")
	public UnityWebElement buttonEditDeleteAffiliationClose;

	@FindBy(xpath = "//table[contains(@class,'table relationship-details')]")
	public UnityTableElement tableRelationshipDetails;

	@FindBy(xpath = "//a[normalize-space(text())='Affiliations']")
	public UnityWebElement linkRelationship;

	@FindBy(xpath = "//mat-panel-title[normalize-space(text())='Contact Information']//ancestor::mat-expansion-panel-header[@role='button']")
	public UnityWebElement pannelConatctInformation;

	@FindBy(xpath = "//td[strong[normalize-space(text())='Affiliation Name:']]//span")
	public UnityWebElement linkRelationshipName;

	@FindBy(xpath = "(//div[strong[normalize-space(text())='Affiliate:']]//a)[1]")
	public UnityWebElement linkRelationshipAffiliate;

	@FindBy(xpath = "//div[strong[normalize-space(text())='Affiliate:']]//div[@class='flexDiv']")
	public UnityWebElement textRelationshipAffiliate;

	@FindBy(xpath = "//div[strong[normalize-space(text())='Affiliate:']]//span")
	public UnityWebElement textRelationshipAffiliateTD;

	@FindBy(xpath = "//*[normalize-space(text())='Client Events']")
	public UnityWebElement buttonClientEvents;

	@FindBy(xpath = "//*[normalize-space(text())='Client Affiliations']")
	public UnityWebElement buttonClientRelationships;

	@FindBy(xpath = "//span[@class='sg-property-name']")
	public List<WebElement> keysContactInformation;

	@FindBy(xpath = "//span[contains(@class,'sg-property-value')]")
	public List<WebElement> valuesContactInformation;

	// add new relationship go screen elements
	@FindBy(xpath = "//input[contains(@id,'ctlRelationshipMaintenance_ctlAffiliation_Input')]")
	public UnityWebElement textboxRelationType;

	@FindBy(xpath = "//div[contains(@id,'ctlRelationshipMaintenance_ctlAffiliation_DropDown')]")
	public UnityWebElement dropdownRelationType;

	@FindBy(xpath = "(//input[contains(@id,'ctlAffiliationType_ctlCodeFile_Input')])[1]")
	public UnityWebElement textboxAffiliationType;

	@FindBy(xpath = "(//div[contains(@id,'ctlAffiliationType_ctlCodeFile_DropDown')])[1]")
	public UnityWebElement dropdownAffilitaionType;

	@FindBy(xpath = "//input[contains(@id,'ctlEmployee_ctlEmployeeLookupRadComboBox_Input')]")
	public UnityWebElement textboxEmployeeRelationship;

	@FindBy(xpath = "//div[contains(@id,'ctlEmployee_ctlEmployeeLookupRadComboBox_DropDown')]")
	public UnityWebElement dropdownEmployeeRelationship;

	@FindBy(xpath = "(//input[contains(@id,'ctlClientLookup_ctlClientRadComboBox_Input')])[1]")
	public UnityWebElement textboxClientRelationship;

	@FindBy(xpath = "(//div[contains(@id,'ctlClientLookup_ctlClientRadComboBox_DropDown')])[1]")
	public UnityWebElement dropdownClientRelationship;

	@FindBy(xpath = "//span[@id='ctlRelationshipMaintenance_ctlRelationshipMaintenance_ctlPortfolioLabel']")
	public UnityWebElement headerPortfolioRelationship;

	// Account details edit frame
	@FindBy(xpath = "//iframe[contains(@src,'accountdetailedit')]")
	public UnityWebElement frameAccountDetailEdit;

	@FindBy(xpath = "//div[@id='ctlAccountEdit_ctlDocContactInfo']//span")
	public UnityWebElement headerAccountContactInfo;

	@FindBy(xpath = "//textarea[contains(@id,'ctlAcctLongName_ctlTextBox')]")
	public UnityWebElement textboxAcctLongName;

	@FindBy(xpath = "//input[@value='Cancel']")
	public UnityWebElement buttonEditAccountInformationCancel;

	// **rohini**
	// portfolio Id update
	@FindBy(xpath = "//mat-dialog-container//input[@name='alternateId']")
	public UnityWebElement txtboxAlternateId;
	
	@FindBy(xpath = "//mat-dialog-container//input[@name='prefIncomeDispMethodAbbrev']")
	public UnityWebElement lookupPrefIncomeDispMethod;
	
	@FindBy(xpath = "//mat-dialog-container//input[@name='portToCreditIncomeNum']")
	public UnityWebElement lookupPortToCreditIncome;
	
	@FindBy(xpath = "//mat-dialog-container//input[@name='grossToNetProof']")
	public UnityWebElement lookupGrossToNetProof;

	@FindBy(xpath = "//add-edit-info-component[@process='PT_ID_UPDATE']/button")
	public UnityWebElement iconEdit;

	// locator for trust desk
	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Investment']]")
	public UnityWebElement panelInvestment;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Account Officers']]")
	public UnityWebElement panelAccountOfficers;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Cash Management']]")
	public UnityWebElement panelCashManagement;

	@FindBy(xpath = "//*[normalize-space(text())='Affiliations']")
	public UnityWebElement tabAffiliations;

	@FindBy(xpath = "//td[strong[normalize-space(text())='Affiliation Name:']]//span")
	public UnityWebElement linkAffiliationName;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Tax ID Number')]")
	public UnityWebElement labelTaxIDNumberKey;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Tax ID Number')]/following-sibling::span")
	public UnityWebElement labelTaxIDNumberValue;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'State Code')]")
	public UnityWebElement labelStateCodeKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'County Code')]")
	public UnityWebElement labelCountyCodeKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Short-Term Gain/Loss')]")
	public UnityWebElement labelShortTermGainLossKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Long-Term Gain/Loss')]")
	public UnityWebElement labelLongTermGainLossKey;

	@FindBy(xpath = "//span[@class='sg-property-name']")
	public List<WebElement> labelKeyTaxInformation;

	@FindBy(xpath = "//span[contains(@class,'sg-property-value')]")
	public List<WebElement> labelValuesTaxInformation;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Tax Lot Accounting')]")
	public UnityWebElement labelTaxLotAccountingKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Tax Period Frequency')]")
	public UnityWebElement labelTaxPeriodFrequencyKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Tax Lot Selection Method')]")
	public UnityWebElement labelTaxLotSelectionMethodKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Tax Lot Reduction')]")
	public UnityWebElement labelTaxLotReductionKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Generation Skipping Code')]")
	public UnityWebElement labelGenerationSkippingCodeKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'ONESOURCE Processing Indicator')]")
	public UnityWebElement labelONESOURCEProcessingIndicatorKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Tax Service Code')]")
	public UnityWebElement labelTaxServiceCodesKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Vendor Start/Stop Indicator')]")
	public UnityWebElement labelVendorStartStopIndicatorKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Income Tax Liability Code')]")
	public UnityWebElement labelIncomeTaxLiabilityCodeKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Capital Gains Tax Liability Code')]")
	public UnityWebElement labelCapitalGainsTaxLiabilityCodeKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Eligible for 2% Floor Exemption')]")
	public UnityWebElement labelEligibleforFloorExemptionKey;

	// labels for contact information

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Name Address Key')]")
	public UnityWebElement labelNameAddressKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Recipient Number')]")
	public UnityWebElement labelRecipientNumberKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Address Purpose Type')]")
	public UnityWebElement labelAddressPurposeTypeKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Primary Contact')]")
	public UnityWebElement labelPrimaryContactKey;

	@FindBy(xpath = "//a[normalize-space(text())='Affiliations']")
	public UnityWebElement linkAffiliations;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Account Capacity')]")
	public UnityWebElement labelAccountCapacityKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Account Long Title')]")
	public UnityWebElement labelAccountLongTitleKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Account Open Date')]")
	public UnityWebElement labelAccountOpenDateKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Held-Away/No Custody Indicator')]")
	public UnityWebElement labelHeldAwayNoCustodyIndicatorKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Held-Away Location')]")
	public UnityWebElement labelHeldAwayLocationKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Relationship')]")
	public UnityWebElement labelRelationshipKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'FinCEN Certification Date')]")
	public UnityWebElement labelFinCENCertificationDateKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Stmt Trade Date Rpting')]")
	public UnityWebElement labelStmtTradeDateRptingrKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Financial Advisory Resource')]")
	public UnityWebElement labelFinancialAdvisoryResourceKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Accrual Indicator')]")
	public UnityWebElement labelAccrualIndicatorKey;

	// Investment panel
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Allocation Manager Strategy')]")
	public UnityWebElement labelAllocationManagerStrategyKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Discretionary Account')]")
	public UnityWebElement labelDiscretionaryAccountKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Proxy Voting Code')]")
	public UnityWebElement labelProxyVotingCodeKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Investment Model')]")
	public UnityWebElement labelInvestmentModelKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Proxy Disclosure Code')]")
	public UnityWebElement labelProxyDisclosureCodeKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Proxy Account Group Code')]")
	public UnityWebElement labelProxyAccountGroupCodeKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Proxy Voting Name Address')]")
	public UnityWebElement labelProxyVotingNameAddressKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Proxy Mailing Name Address1')]")
	public UnityWebElement labelProxyMailingNameAddress1Key;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Proxy Mailing Name Address2')]")
	public UnityWebElement labelProxyMailingNameAddress2Key;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Target Asset Class Allocation')]")
	public UnityWebElement labelTargetAssetClassAllocationKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Invasion of Principal')]")
	public UnityWebElement labelInvasionofPrincipalKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Reallocation Frequency')]")
	public UnityWebElement labelReallocationFrequencyKey;

	@FindBy(xpath = "//span//mat-panel-title[contains(normalize-space(text()),'Investdesk Controls')]")
	public UnityWebElement linkInvestdeskControls;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'InvestDesk Indicator')]")
	public UnityWebElement labelInvestDeskIndicatorKey;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Time Horizon')]")
	public UnityWebElement labelTimeHorizonKey;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Tax Rate')]")
	public UnityWebElement labelTaxRateKey;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Investment Strategy Code')]")
	public UnityWebElement labelInvestmentStrategyCodeKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Allocation Percent')]")
	public UnityWebElement labelAllocationPercentKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Trade Minimum Percent')]")
	public UnityWebElement labelTradeMinimumPercentKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Client Point Duration')]")
	public UnityWebElement labelClientPointDurationKey;

	// Legal panel

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Begin to Close Date')]")
	public UnityWebElement labelBeginToCloseDateKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Date Account Closed')]")
	public UnityWebElement labelDateAccountClosedKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Estimated Termination Date')]")
	public UnityWebElement labelEstimatedTerminationDateKey;

	// Account Officers panel

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Administrative Officer')]")
	public UnityWebElement labelAdministrativeOfficerKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Alternative Investment Officer')]")
	public UnityWebElement labelAlternativeInvestmentOfficerKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Alternate Admin Officer1')]")
	public UnityWebElement labelAlternateAdminOfficer1Key;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Alternate Admin Officer2')]")
	public UnityWebElement labelAlternateAdminOfficer2Key;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Alternate Admin Officer3')]")
	public UnityWebElement labelAlternateAdminOfficer3Key;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Family Office Administrator')]")
	public UnityWebElement labelFamilyOfficeAdministratorKey;

	@FindBy(xpath = "//span[@class='sg-property-name']")
	public List<WebElement> keysAccountDetailsInformation;

	@FindBy(xpath = "//span[contains(@class,'sg-property-value')]")
	public List<WebElement> valuesAccountDetailsInformation;

	@FindBy(xpath = "//ruf-page-header-title")
	public UnityWebElement labelAccountNameValue;

	// tax information tab details

	@FindBy(xpath = "(//mat-expansion-panel-header//mat-panel-title)[2]")
	public UnityWebElement panelAtIndex2;

	@FindBy(xpath = "(//mat-expansion-panel-header//mat-panel-title)[3]")
	public UnityWebElement panelAtIndex3;

	@FindBy(xpath = "(//mat-expansion-panel-header//mat-panel-title)[4]")
	public UnityWebElement panelAtIndex4;

	@FindBy(xpath = "(//mat-expansion-panel-header//mat-panel-title)[5]")
	public UnityWebElement panelAtIndex5;

	@FindBy(xpath = "(//mat-expansion-panel-header//mat-panel-title)[6]")
	public UnityWebElement panelAtIndex6;

	@FindBy(xpath = "(//mat-expansion-panel-header//mat-panel-title)[7]")
	public UnityWebElement panelAtIndex7;

	@FindBy(xpath = "(//mat-expansion-panel-header//mat-panel-title)[8]")
	public UnityWebElement panelAtIndex8;

	@FindBy(xpath = "(//mat-expansion-panel-header//mat-panel-title)[9]")
	public UnityWebElement panelAtIndex9;

	@FindBy(xpath = "//span[@class='sg-property-name']")
	public List<WebElement> keysTaxInformation;

	@FindBy(xpath = "//span[contains(@class,'sg-property-value')]")
	public List<WebElement> valueskeysTaxInformation;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Tax ID')]")
	public UnityWebElement labelTaxIDKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Country of Residence')]")
	public UnityWebElement labelCountryOfResidenceTaxInfoKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'YTD Realized Total GL')]")
	public UnityWebElement labelYTDRealizedTotalGLInfoKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'YTD Gain Loss ST')]")
	public UnityWebElement labelYTDGainLossSTKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'YTD Gain Loss LT')]")
	public UnityWebElement labelYTDGainLossLTKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Tax Short Title')]")
	public UnityWebElement labelTaxShortTitleKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Tax Year')]")
	public UnityWebElement labelTaxYearKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Process OneSource Tax')]")
	public UnityWebElement labelProcessOneSourceTaxKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Filing Status')]")
	public UnityWebElement labelFilingStatusKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'1099 Reporting Required')]")
	public UnityWebElement label1099ReportingRequiredKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Fed LT Loss Carry Over')]")
	public UnityWebElement labelFedLTLossCarryOverKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Fed ST Loss Carry Over')]")
	public UnityWebElement labelFedSTLossCarryOverKey;

	@FindBy(xpath = "//input[contains(@id,'DocDatedDetailsDateInfo_C_ctlDatedDetailsDateInfo_ctlEffectiveDatePicker_dateInput')][@type='text']")
	public UnityWebElement textBoxEffectiveDate;

	@FindBy(xpath = "//input[contains(@id,'DetailsAdd_ctlDocDatedDetailsDateInfo_C_ctlDatedDetailsDateInfo_ctlTaxpayerClass_ctlCodeFile_ctlCodeFile_Input')]")
	public UnityWebElement textBoxTaxPayer;

	@FindBy(xpath = "//div[contains(@id,'DatedDetailsDateInfo_ctlTaxpayerClass_ctlCodeFile_ctlCodeFile_DropDown')]")
	public UnityWebElement dropDownTaxPayer;

	// Contact Information for Addvantage
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Primary Email')]")
	public UnityWebElement labelPrimaryEmailKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Fax Number')]")
	public UnityWebElement labelFaxNumberKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Pager Number')]")
	public UnityWebElement labelPagerNumberKey;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Alternate Phone Number')]")
	public UnityWebElement labelAlternatePhoneNumberKey;

	// Account Attributes link

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Account Attributes']]//following::div[1]//span[normalize-space(text())='Administrative Officer']//following::span[1]//a")
	public UnityWebElement linkAccountAttributesAdminOfficer;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Account Attributes']]//following::div[1]//span[normalize-space(text())='Investment Officer']//following::span[1]//a")
	public UnityWebElement linkAccountAttributesInvestmentOfficer;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Account Officers']]//following::div[1]//span[normalize-space(text())='Administrative Officer']//following::span[1]//a")
	public UnityWebElement linkAccountOfficersAdminOfficer;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Account Officers']]//following::div[1]//span[normalize-space(text())='Investment Officer']//following::span[1]//a")
	public UnityWebElement linkAccountOfficersInvestmentOfficer;

	@FindBy(xpath = "//entity-affiliation-details//a[normalize-space(text())='Account Information']")
	public UnityWebElement linkAccountInformation;

	@FindBy(xpath = "//div[contains(@class,'affiliation-menu-actions')]//div[span[normalize-space(text())='Details']]")
	public UnityWebElement buttonDetailsAffiliation;

	@FindBy(xpath = "//strong[normalize-space(text())='Subgroup Information :']")
	public UnityWebElement labelSubgroupInfromation;

	@FindBy(xpath = "//strong[normalize-space(text())='Affiliate:']")
	public UnityWebElement labelAffiliate;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='BASIC INFORMATION']]")
	public UnityWebElement panelBasicInformation;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='PROTECTED INFORMATION']]")
	public UnityWebElement panelProtectedInformation;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='PUERTO RICO TAX FORM']]")
	public UnityWebElement panelPuertoRicoTaxForm;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='BASIC INFORMATION']]//following::div/table[1]")
	public UnityTableElement tableBasicInformation;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='PROTECTED INFORMATION']]//following::div/table[1]")
	public UnityWebElement tableProtectedInformation;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='PUERTO RICO TAX FORM']]//following::div/table[1]")
	public UnityWebElement tablePuertoRicoTaxForm;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Interested Party Number')]")
	public UnityWebElement labelInterestedPartyNumberKey;

	// Tab historical Market Value
	@FindBy(xpath = "//*[normalize-space(text())='Historical Market Value']")
	public UnityWebElement tabHistoricalMarketValue;

	@FindBy(css = "div[role='grid']")
	public UnityGridElement gridHistoricalMarketValue;

	@FindBy(xpath = "(//div[@class='mat-tab-label-content']//span)[last()]")
	public UnityWebElement labelLastOpenedAccountNameValue;

	// Added by - Rupali
	@FindBy(xpath = "//iframe[contains(@src,'TRANS=ExtIdentifierAdd&ACGref')]")
	public UnityWebElement frameAddExternalIdentifier;

	@FindBy(xpath = "//div[contains(@id,'ctlLocation_ctlCodeFile_ctlCodeFile_DropDown')]")
	public UnityWebElement dropdownLocationList;

	@FindBy(xpath = "//input[contains(@id,'ctlExtIdentifierAdd_ctlLocation_ctlCodeFile_ctlCodeFile_Input')]")
	public UnityWebElement textBoxLocation;

	@FindBy(xpath = "//input[@name='ctl00$FxTransactionsContentPlaceHolder$ctlExtIdentifierAdd$ctlExtIdentifier']")
	public UnityWebElement textBoxAlternateExternalID;

	@FindBy(xpath = "//iframe[contains(@src,'/unitysso/Content/UnityController.aspx?TRANS=ExtSafekeepingACAdd&ACGref')]")
	public UnityWebElement frameAddExternalSafekeepingAccount;

	@FindBy(xpath = "//input[@name='ctl00$FxTransactionsContentPlaceHolder$ctlExtSafekeepingACAdd$ctlLocation$ctlCodeFile$ctlCodeFile']")
	public UnityWebElement textBoxLocationSafekeepingAccount;

	@FindBy(xpath = "//input[@name='ctl00$FxTransactionsContentPlaceHolder$ctlExtSafekeepingACAdd$ctlDockStatementToCopy$C$ctlUnitSafekeepingInformation$ctlAccount']")
	public UnityWebElement textBoxAccountSafekeepingAccount;

	@FindBy(xpath = "//input[@value='Submit' and @type='button']")
	public UnityWebElement buttonSubmitExternalIdentifier;

	// portfolio details

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Investment Powers']]")
	public UnityWebElement panelPortfolioInvestmentPowers1Edit;

	@FindBy(xpath = "//span[@class='sg-property-name']")
	public List<WebElement> labelKeyPortfolioDetails;

	@FindBy(xpath = "//span[contains(@class,'sg-property-value')]")
	public List<WebElement> labelValuesPortfolioDetails;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Investment Officer')]")
	public UnityWebElement labelPortfolioInvestmentOfficerKey;

	@FindBy(xpath = "//span[normalize-space(text())='Party Type']")
	public UnityWebElement labelPartyTypeKey;

	@FindBy(xpath = "//span[normalize-space(text())='Short Name']")
	public UnityWebElement labelShortNameKey;

	@FindBy(xpath = "//span[normalize-space(text())='TIN Type']")
	public UnityWebElement labelTINTypeKey;

	@FindBy(xpath = "//span[normalize-space(text())='Tax Year End']")
	public UnityWebElement labelTaxYearEndKey;

	@FindBy(xpath = "//span[normalize-space(text())='NRA Country']")
	public UnityWebElement labelNRACountryKey;

	@FindBy(xpath = "//span[normalize-space(text())='Prepare Taxes']")
	public UnityWebElement labelPrepareTaxesKey;

	@FindBy(xpath = "//span[normalize-space(text())='Tax Preparation Fee']")
	public UnityWebElement labelTaxPreparationFeeKey;

	@FindBy(xpath = "//span[normalize-space(text())='Federal Estimated Basis']")
	public UnityWebElement labelFederalEstimatedBasisKey;

	@FindBy(xpath = "//span[normalize-space(text())='Federal Estimated Tax']")
	public UnityWebElement labelFederalEstimatedTaxKey;

	@FindBy(xpath = "//span[normalize-space(text())='Federal Refund']")
	public UnityWebElement labelFederalRefundKey;

	@FindBy(xpath = "//span[normalize-space(text())='Short Federal Loss']")
	public UnityWebElement labelShortFederalLossKey;

	@FindBy(xpath = "//span[normalize-space(text())='Federal Loss Post 69']")
	public UnityWebElement labelFederalLossPost69Key;

	@FindBy(xpath = "//span[normalize-space(text())='Federal Loss Carryover Pre 70']")
	public UnityWebElement labelFederalLossCarryoverPre70Key;

	@FindBy(xpath = "//span[normalize-space(text())='Adjust Tax Bracket Last Year Percent']")
	public UnityWebElement labelAdjustTaxBracketLastYearPercentKey;

	@FindBy(xpath = "//span[normalize-space(text())='Date from State Loss Carryover']")
	public UnityWebElement labelDatefromStateLossCarryoverKey;

	@FindBy(xpath = "//span[normalize-space(text())='Amount of State Loss Carryover']")
	public UnityWebElement labelAmountofStateLossCarryoverKey;

	@FindBy(xpath = "//span[normalize-space(text())='Date W8 Received']")
	public UnityWebElement labelDateW8ReceivedKey;

	@FindBy(xpath = "//span[normalize-space(text())='Date W9 Received']")
	public UnityWebElement labelDateW9ReceivedKey;

	@FindBy(xpath = "//span[normalize-space(text())='Date 1001 Received']")
	public UnityWebElement labelDate1001ReceivedKey;

	@FindBy(xpath = "//span[normalize-space(text())='State Estimated Basis']")
	public UnityWebElement labelStateEstimatedBasisKey;

	@FindBy(xpath = "//span[normalize-space(text())='State Estimated Tax']")
	public UnityWebElement labelStateEstimatedTaxKey;

	@FindBy(xpath = "//span[normalize-space(text())='State Estimated Refund']")
	public UnityWebElement labelStateEstimatedRefundKey;

	@FindBy(xpath = "//span[normalize-space(text())='NRA Recipient Code']")
	public UnityWebElement labelNRARecipientCodeKey;

	@FindBy(xpath = "//span[normalize-space(text())='Recipient TIN Type 1042']")
	public UnityWebElement labelRecipientTINType1042Key;

	@FindBy(xpath = "//span[normalize-space(text())='Chapter 4 Status 1042']")
	public UnityWebElement labelChapter4Status1042Key;

	@FindBy(xpath = "//span[normalize-space(text())='LOB Code 1042']")
	public UnityWebElement labelLOBCode1042Key;

	@FindBy(xpath = "//span[normalize-space(text())='IRS Name Control']")
	public UnityWebElement labelIRSNameControlKey;

	@FindBy(xpath = "//span[normalize-space(text())='IRS Efile Name 1']")
	public UnityWebElement labelIRSEfileName1Key;

	@FindBy(xpath = "//span[normalize-space(text())='IRS Efile Name 2']")
	public UnityWebElement labelIRSEfileName2Key;

	@FindBy(xpath = "//span[normalize-space(text())='IRS Efile Street']")
	public UnityWebElement labelIRSEfileStreetKey;

	@FindBy(xpath = "//span[normalize-space(text())='IRS Efile City']")
	public UnityWebElement labelIRSEfileCityKey;

	@FindBy(xpath = "//span[normalize-space(text())='IRS Efile State Code']")
	public UnityWebElement labelIRSEfileStateCodeKey;

	@FindBy(xpath = "//span[normalize-space(text())='IRS Efile Zip Code']")
	public UnityWebElement labelIRSEfileZipCodeKey;

	@FindBy(xpath = "//span[normalize-space(text())='Date Backup Withholding Effective']")
	public UnityWebElement labelDateBackupWithholdingEffectiveKey;

	@FindBy(xpath = "//span[normalize-space(text())='Type of Backup Withholding']")
	public UnityWebElement labelTypeofBackupWithholdingKey;

	@FindBy(xpath = "//span[normalize-space(text())='Backup Withholding Required']")
	public UnityWebElement labelBackupWithholdingRequiredKey;

	@FindBy(xpath = "//span[normalize-space(text())='Backup Withholding Percentage']")
	public UnityWebElement labelBackupWithholdingPercentageKey;

	// TD IRA elements
	@FindBy(xpath = "//h2[normalize-space(text())='View Payment History Detail']")
	public UnityWebElement headerViewPaymentHistoryDetail;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Payment History Detail']]")
	public UnityWebElement panelPaymentHistoryDetail;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Deductions']]")
	public UnityWebElement panelDeductions;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Form 480.7c Reporting']]")
	public UnityWebElement panelForm480dot7cReporting;

	@FindBy(xpath = "//*[@id='payHistory' or @id='deductions' or @id='formReporting']//span[@class='sg-property-name']")
	public List<WebElement> labelKeysPaymentHistoryDetail;

	@FindBy(xpath = "//*[@id='payHistory' or @id='deductions' or @id='formReporting']//span[contains(@class,'sg-property-value')]")
	public List<WebElement> labelValuesPaymentHistoryDetail;

	@FindBy(xpath = "//unity-upgrade-column-filter//button//span//mat-icon")
	public UnityWebElement linkGridColumnFilter;

	@FindBy(xpath = "//span[normalize-space(text())='Private Note']//preceding-sibling::div/input")
	public UnityWebElement checkboxPrivateNote;

	@FindBy(xpath = "//unity-client-side-print-upgrade//button//span//mat-icon")
	public UnityWebElement buttonPrintNotes;

	@FindBy(xpath = "//span[normalize-space(text())='Private']//preceding-sibling::div/input")
	public UnityWebElement checkboxPrivate;

	@FindBy(xpath = "(//*[normalize-space(text())='Tax Vendor Information'])[1]")
	public UnityWebElement linkTaxVendorInformation;

	@FindBy(xpath = "(//*[normalize-space(text())='Amortization and Accretion'])[1]")
	public UnityWebElement linkAmortizationandAccretion;
	
	@FindBy(xpath = "//mat-panel-title[contains(text(),'Estimate/Balance Information')]")
	public UnityWebElement linkEstimateBalanceInformation;
	
	@FindBy(xpath = "//mat-panel-title[contains(normalize-space(text()),'Uniform Principal/Income Information')]")
	public UnityWebElement linkUniformPrincipalIncomeInformation;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Business Name Control Code')]")
	public UnityWebElement labelBusinessNameControlCode;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Fed Qrtly Estimate from Principal')]")
	public UnityWebElement labelFedQrtlyEstimatefromPrincipal;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'State Qrtly Estimate from Principal')]")
	public UnityWebElement labelStateQrtlyEstimatefromPrincipal;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Last Period Income Balance')]")
	public UnityWebElement labelLastPeriodIncomeBalance;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Last Period Carrying Value Balance')]")
	public UnityWebElement labelLastPeriodCarryingValueBalance;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Prior Period Income Balance')]")
	public UnityWebElement labelPriorPeriodIncomeBalance;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Prior Period Carrying Value Balance')]")
	public UnityWebElement labelPriorPeriodCarryingValueBalance;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Fed Qrtly Estimate from Income')]")
	public UnityWebElement labelFedQrtlyEstimatefromIncome;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'State Qrtly Estimate from Income')]")
	public UnityWebElement labelStateQrtlyEstimatefromIncome;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Date of Last Tax Report')]")
	public UnityWebElement labelDateofLastTaxReport;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Last Period Principal Balance')]")
	public UnityWebElement labelLastPeriodPrincipalBalance;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Date of Prior Tax Report')]")
	public UnityWebElement labelDateofPriorTaxReport;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Prior Period Principal Balance')]")
	public UnityWebElement labelPriorPeriodPrincipalBalance;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Uniform Principal/Income Indicator')]")
	public UnityWebElement labelUniformPrincipalIncomeIndicator;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'UPIA Date of Review')]")
	public UnityWebElement labelUPIADateofReview;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'UPIA Year End 1 Year Ago')]")
	public UnityWebElement labelUPIAYearEnd1YearAgo;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'UPIA Year End 2 Years Ago')]")
	public UnityWebElement labelUPIAYearEnd2YearsAgo;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'UPIA Year End 3 Years Ago')]")
	public UnityWebElement labelUPIAYearEnd3YearsAgo;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'UPIA Average Market Value')]")
	public UnityWebElement labelUPIAAverageMarketValue;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Prior Year Adjusted Income')]")
	public UnityWebElement labelPriorYearAdjustedIncome;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'UPIA Governing Law')]")
	public UnityWebElement labelUPIAGoverningLaw;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'UPIA Adjustments')]")
	public UnityWebElement labelUPIAAdjustments;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'UPIA Market Value 1 Year Ago')]")
	public UnityWebElement labelUPIAMarketValue1YearAgo;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'UPIA Market Value 2 Years Ago')]")
	public UnityWebElement labelUPIAMarketValue2YearsAgo;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'UPIA Market Value 3 Years Ago')]")
	public UnityWebElement labelUPIAMarketValue3YearsAgo;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Estimated Gross Income Before Adjustment')]")
	public UnityWebElement labelEstimatedGrossIncomeBeforeAdjustment;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Trustee Fee Alloc by State')]")
	public UnityWebElement labelTrusteeFeeAllocbyState;
	

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Tax Gain To Code')]")
	public UnityWebElement labelTaxgaintocode;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Tax Income To Code')]")
	public UnityWebElement labelTaxIncomeToCode;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Final Distribution made this year')]")
	public UnityWebElement labelFinalDistributionmadethisyear;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Principal Distribution made this year')]")
	public UnityWebElement labelPrincipalDistributionmadethisyear;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'5X5 Power Right of Withdraw')]")
	public UnityWebElement label5X5PowerRightofWithdraw;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Former Fiscal Year End')]")
	public UnityWebElement labelFormerFiscalYearEnd;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'No tax Reporting Necessary')]")
	public UnityWebElement labelNotaxReportingNecessary;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Other Tax reporting Required')]")
	public UnityWebElement labelOtherTaxreportingRequired;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Additional Tax Forms Required for Trust')]")
	public UnityWebElement labelAdditionalTaxFormsRequiredforTrust;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Tax Letter #1')]")
	public UnityWebElement labelTaxLetter1;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Tax Letter #2')]")
	public UnityWebElement labelTaxLetter2;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Tax Letter #3')]")
	public UnityWebElement labelTaxLetter3;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Reporting for 1099 BRO, DIV, INT, MISC, RENT, OID, Real Estate Required')]")
	public UnityWebElement labelReportingfor1099BRODIVINTMISCRENTOIDRealEstateRequired;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Exclude from Backup Withholding')]")
	public UnityWebElement labelExcludefromBackupWithholding;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Suppress Tax Worksheet')]")
	public UnityWebElement labelSuppressTaxWorksheet;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Federal Estimated Tax for Current Year')]")
	public UnityWebElement labelFederalEstimatedTaxforCurrentYear;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Basis of Estimated Federal Tax')]")
	public UnityWebElement labelBasisofEstimatedFederalTax;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'State Estimated Tax for Current Year')]")
	public UnityWebElement labelStateEstimatedTaxforCurrentYear;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Basis of Estimated State Tax')]")
	public UnityWebElement labelBasisofEstimatedStateTax;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Passive Loss/Credit Carryover Post ‘86')]")
	public UnityWebElement labelPassiveLossCreditCarryoverPost86;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Fed LT Loss Carry Over')]")
	public UnityWebElement labelFedLTLossCarryOver;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Fed ST Loss Carry Over')]")
	public UnityWebElement labelFedSTLossCarryOver;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Date for State Loss Carryover')]")
	public UnityWebElement labelDateforStateLossCarryover;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Amount of State Loss Carryover')]")
	public UnityWebElement labelAmountofStateLossCarryover;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Exempt from Federal Tax Withholding')]")
	public UnityWebElement labelExemptfromFederalTaxWithholding;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Date of Tax Exemption')]")
	public UnityWebElement labelDateofTaxExemption;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Fed Exemption Type')]")
	public UnityWebElement labelFedExemptionType;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Federal Withholding Rate')]")
	public UnityWebElement labelFederalWithholdingRate;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Exempt from State Tax Withholding')]")
	public UnityWebElement labelExemptfromStateTaxWithholding;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'State Withholding Rate')]")
	public UnityWebElement labelStateWithholdingRate;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'State Taxpayer Identification Number')]")
	public UnityWebElement labelStateTaxpayerIdentificationNumber;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Date Tax Costs Updated by Bridgeback')]")
	public UnityWebElement labelDateTaxCostsUpdatedbyBridgeback;

	@FindBy(xpath = "//span[.='Tax Year End for Refunds']")
	public UnityWebElement labelTaxYearEndforRefunds;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Tax Year End for Refunds #2')]")
	public UnityWebElement labelTaxYearEndforRefunds2;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Tax Year End for Refunds #3')]")
	public UnityWebElement labelTaxYearEndforRefunds3;

	@FindBy(xpath = "//span[.='Amount of Previous Year Federal Refund']")
	public UnityWebElement labelAmountofPreviousYearFederalRefund;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Amount of Previous Year Federal Refund #2')]")
	public UnityWebElement labelAmountofPreviousYearFederalRefund2;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Amount of Previous Year Federal Refund #3')]")
	public UnityWebElement labelAmountofPreviousYearFederalRefund3;

	@FindBy(xpath = "//span[.='Date Previous Year Federal Refund Received']")
	public UnityWebElement labelDatePreviousYearFederalRefundReceived;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Date Previous Year Federal Refund Received #2')]")
	public UnityWebElement labelDatePreviousYearFederalRefundReceived2;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Date Previous Year Federal Refund Received #3')]")
	public UnityWebElement labelDatePreviousYearFederalRefundReceived3;

	@FindBy(xpath = "//span[.='Amount of Previous Year State Refund']")
	public UnityWebElement labelAmountofPreviousYearStateRefund;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Amount of Previous Year State Refund #2')]")
	public UnityWebElement labelAmountofPreviousYearStateRefund2;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Amount of Previous Year State Refund #3')]")
	public UnityWebElement labelAmountofPreviousYearStateRefund3;

	@FindBy(xpath = "//span[.='Date Previous Year State Refund Received']")
	public UnityWebElement labelDatePreviousYearStateRefundReceived;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Date Previous Year State Refund Received #2')]")
	public UnityWebElement labelDatePreviousYearStateRefundReceived2;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Date Previous Year State Refund Received #3')]")
	public UnityWebElement labelDatePreviousYearStateRefundReceived3;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Generation Skipping Trust')]")
	public UnityWebElement labelGenerationSkippingTrust;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Generation Skipping Account Type')]")
	public UnityWebElement labelGenerationSkippingAccountType;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Inclusion Ratio')]")
	public UnityWebElement labelInclusionRatio;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Percentage Exclusion for Partial Distribution')]")
	public UnityWebElement labelPercentageExclusionforPartialDistribution;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Date AIT Last Posted')]")
	public UnityWebElement labelDateAITLastPosted;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Accumulation Trust')]")
	public UnityWebElement labelAccumulationTrust;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'ONESOURCE Tran History Flag Removed Date')]")
	public UnityWebElement labelONESOURCETranHistoryFlagRemovedDate;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'ONESOURCE Tran History Period')]")
	public UnityWebElement labelONESOURCETranHistoryPeriod;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Exclude from NRA Withholding')]")
	public UnityWebElement labelExcludefromNRAWithholding;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Date of First ROTH Contribution')]")
	public UnityWebElement labelDateofFirstROTHContribution;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Inherited IRA')]")
	public UnityWebElement labelInheritedIRA;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Uni Trust Payout Amount')]")
	public UnityWebElement labelUniTrustPayoutAmount;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'1st State Code')]")
	public UnityWebElement label1stStateCode;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'1st State Type')]")
	public UnityWebElement label1stStateType;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'1st State Non Taxable')]")
	public UnityWebElement label1stStateNonTaxable;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'1st NY State Resident Type')]")
	public UnityWebElement label1stNYStateResidentType;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'1st NY City Resident Type')]")
	public UnityWebElement label1stNYCityResidentType;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'1st Yonkers Resident Type')]")
	public UnityWebElement label1stYonkersResidentType;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'2nd State Code')]")
	public UnityWebElement label2ndStateCode;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'2nd State Type')]")
	public UnityWebElement label2ndStateType;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'2nd State Non Taxable')]")
	public UnityWebElement label2ndStateNonTaxable;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'2nd NY State Resident Type')]")
	public UnityWebElement label2ndNYStateResidentType;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'2nd NY City Resident Type')]")
	public UnityWebElement label2ndNYCityResidentType;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'2nd Yonkers Resident Type')]")
	public UnityWebElement label2ndYonkersResidentType;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Account Prepares 1041 and 990')]")
	public UnityWebElement labelAccountPrepares1041and990;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'5498 via ONESOURCE')]")
	public UnityWebElement label5498viaONESOURCE;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Process via ONESOURCE')]")
	public UnityWebElement labelProcessviaONESOURCE;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'ONESOURCE Product Code')]")
	public UnityWebElement labelONESOURCEProductCode;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'1099 Misc via ONESOURCE')]")
	public UnityWebElement label1099MiscviaONESOURCE;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'1099R via ONESOURCE')]")
	public UnityWebElement label1099RviaONESOURCE;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'ONESOURCE 1099 Account')]")
	public UnityWebElement labelONESOURCE1099Account;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'ONESOURCE 1099 Service Level')]")
	public UnityWebElement labelONESOURCE1099ServiceLevel;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'ONESOURCE UPIA Indicator')]")
	public UnityWebElement labelONESOURCEUPIAIndicator;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'1099 MR via ONESOURCE')]")
	public UnityWebElement label1099MRviaONESOURCE;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Reporting for 1099-B Only')]")
	public UnityWebElement labelReportingfor1099BOnly;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'1098 via ONESOURCE')]")
	public UnityWebElement label1098viaONESOURCE;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'1099Q via ONESOURCE')]")
	public UnityWebElement label1099QviaONESOURCE;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'ONESOURCE Worksheet Only')]")
	public UnityWebElement labelONESOURCEWorksheetOnly;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Do Automatic Amortization')]")
	public UnityWebElement labelDoAutomaticAmortization;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Date for Amortization')]")
	public UnityWebElement labelDateforAmortization;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'AMR Bkkeepping EFFT')]")
	public UnityWebElement labelAMRBkkeeppingEFFT;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Accretion Bkkeeping EFFT')]")
	public UnityWebElement labelAccretionBkkeepingEFFT;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Amort Bonds to Pre Ref Date')]")
	public UnityWebElement labelAmortBondstoPreRefDate;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Do Automatic Accretion')]")
	public UnityWebElement labelDoAutomaticAccretion;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Acr Int Bearing Bd on UD Cycle')]")
	public UnityWebElement labelAcrIntBearingBdonUDCycle;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Date for Accretion')]")
	public UnityWebElement labelDateforAccretion;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Addtl Sec Codes to Incl')]")
	public UnityWebElement labelAddtlSecCodestoIncl;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Security Type or Subclass to Include')]")
	public UnityWebElement labelSecurityTypeorSubclasstoInclude;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Override DE Minimus Rule')]")
	public UnityWebElement labelOverrideDEMinimusRule;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Addtl Sec Codes for AC')]")
	public UnityWebElement labelAddtlSecCodesforAC;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Eligible for AHB Processing')]")
	public UnityWebElement labelEligibleforAHBProcessing;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Calculate on Settle Date')]")
	public UnityWebElement labelCalculateonSettleDate;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Adjusted Tax Bracket for Last Tax Year')]")
	public UnityWebElement labelAdjustedTaxBracketforLastTaxYear;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Country Code')]")
	public UnityWebElement labelCountrycode;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'YTD Realized Total G/L')]")
	public UnityWebElement labelYTDRealizedTotalGL;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Tax Short Title')]")
	public UnityWebElement labelTaxShortTitle;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'YTD Gain/Loss Short Term')]")
	public UnityWebElement labelYTDGainLossShortTerm;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'YTD Gain/Loss Long Term')]")
	public UnityWebElement labelYTDGainLossLongTerm;

	@FindBy(xpath = "//mat-expansion-panel-header/..//span[contains(@class,'sg-property-name')]")
	public List<WebElement> labelHeadersTaxVendorInformationAmortizationandAccretionGainLossInformation;

	@FindBy(xpath = "//mat-expansion-panel-header/..//span[contains(@class,'sg-property-value')]")
	public List<WebElement> labelValuesTaxVendorInformationAmortizationandAccretionGainLossInformation;

	@FindBy(xpath = "//span[.='Short Term Gain/Loss']")
	public UnityWebElement labelShortTermGainLoss;

	@FindBy(xpath = "//span[.='Long Term Gain/Loss']")
	public UnityWebElement labelLongTermGainLoss;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Combined Tax Reporting')]")
	public UnityWebElement labelCombinedTaxReporting;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Average Cost/Tax Lot Reduction')]")
	public UnityWebElement labelAverageCostTaxLotReduction;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Generation Skip Percent')]")
	public UnityWebElement labelGenerationSkipPercent;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Exempt from Personal Property Tax')]")
	public UnityWebElement labelExemptfromPersonalPropertyTax;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'IRA/SEP/Simple/Roth/ESA')]")
	public UnityWebElement labelIRASEPSimpleRothESA;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Account Taxability')]")
	public UnityWebElement labelAccountTaxability;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Original Owner Date of Death')]")
	public UnityWebElement labelOriginalOwnerDateofDeath;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Original Owner Date of Birth')]")
	public UnityWebElement labelOriginalOwnerDateofBirth;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Foreign Tax Withholding')]")
	public UnityWebElement labelForeignTaxWithholding;

	@Override
	public void waitForPageToLoad() {
		startTime = System.currentTimeMillis();
		if (super.isPageLoaded(driver))
			try {
				endTime = System.currentTimeMillis();
				pageLoadTime = (endTime - startTime) / 1000;
			} catch (Exception e) {
				Assert.fail("Expected page did not load\n");
			}
		else {
			Assert.fail("Timed out after " + AppConstants.PAGE_LOAD_TIMEOUT + " seconds\n");
		}
	}

	public void verifyGraphLegends() {
		String uiValue = null;
		List<String> columnUiValues = new ArrayList<>();
		List<String> graphUiValues = new ArrayList<>();
		List<WebElement> columnWebElements = null;
		List<WebElement> graphWebElements = null;

		columnWebElements = driver.findElements(By.xpath(".//tr/td[1]"));
		graphWebElements = driver
				.findElements(By.xpath(".//ul[@class='legend-labels']//span[@class='legend-label-text']"));
		for (WebElement element : columnWebElements) {
			uiValue = element.getText().split("\n")[0].trim();
			columnUiValues.add(uiValue);
		}
		// columnUiValues.remove("Corporate Bond Mutual Fund - Open End");
		columnUiValues.remove("Equity Mutual Funds - Open End");
		// columnUiValues.remove("Municipal Bond Mutual Fund - Open End");
		for (WebElement element : graphWebElements) {
			uiValue = element.getText().trim();
			// uiValue = element.getText().split("-")[1].trim();
			graphUiValues.add(uiValue);
		}
		// graphUiValues.remove("Corporate Bond Mutual Fund");
		graphUiValues.remove("Equity Mutual Funds - Open End");
		// graphUiValues.remove("Municipal Bond Mutual Fund");
		Assert.assertTrue(Arrays.equals(columnUiValues.toArray(), graphUiValues.toArray()),
				"Table data is not matching with graph legends\n");
	}

	public void selectLinkInGrid(String linkText) {
		List<WebElement> list = gridPortfolioInformation
				.findElements(By.xpath("//a[span[normalize-space(text())='" + linkText + "']]"));
		list.get(0).click();
	}

	public Map<String, List<String>> getAffiliationGridUiValues() {
		List<String> list = new ArrayList<>();
		Map<String, List<String>> uiGridValues = gridRelationships.getGridUiValuesMap();

		List<String> affiliationValues = uiGridValues.get("Affiliation Details");
		for (String value : affiliationValues) {
			if (value.contains("\n")) {
				value = value.replace("Show more", "");
				String[] arr = value.split("\n");
				list.addAll(Arrays.asList(arr));
			} else {
				list.add(value);
			}
		}
		uiGridValues.replace("Affiliation Details", list);
		return uiGridValues;
	}
}