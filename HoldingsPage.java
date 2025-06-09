package com.unity.pages;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.unity.constants.AppConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityGridElement;
import com.unity.customelements.UnityWebElement;
import com.unity.utilities.UnityUtils;

public class HoldingsPage extends BaseTestPage {

	WebDriver driver;

	public HoldingsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}
	
	@FindBy(xpath = "//button[@aria-label='cancel']")
	public UnityWebElement buttonCancel;
	               
	@FindBy(xpath = "//holdings-external-nav-dialog//mat-icon[@fisicon='close']")
	public UnityWebElement buttonX;

	@FindBy(xpath = "//account-client-synopsis//a")
	public UnityWebElement buttonSynopsis;
	
	@FindBy(xpath = "//ngx-charts-pie-chart")
	public UnityWebElement piechart;

	@FindBy(xpath = "//a[@ng-reflect-message='Print']")
	public UnityWebElement buttonPrint;

	@FindBy(xpath = "//div[@class='local-search search-element']/input")
	public UnityWebElement textBoxSearchFor;

	// header details
	@FindBy(xpath = "//small[@class='ng-star-inserted']")
	public UnityWebElement labelAccountName;

	@FindBy(xpath = "//span[contains(@class,'account-value-description ng-binding')]")
	public List<WebElement> labelheaderKeys;

	@FindBy(xpath = "//span[contains(@class,'account-value ng-binding')]")
	public List<WebElement> labelheaderValues;

	@FindBy(xpath = "//md-checkbox//span")
	public List<WebElement> lableCheckboxesFilterGrid;

	@FindBy(xpath = "//unity-ag-grid-component//div[@class='grid-panel']//span[normalize-space(text())='No Results']")
	public UnityWebElement labelNoResultsInGrid;

	// Print icon
	@FindBy(xpath = "//client-side-unity-print/button")
	public UnityWebElement linkPrint;

	@FindBy(xpath = "//*[normalize-space(text())='Print All Pages']")
	public UnityWebElement buttonPrintAllPages;

	@FindBy(xpath = "//*[normalize-space(text())='Print Current Page']")
	public UnityWebElement buttonCurrentPage;

	@FindBy(xpath = "//button[@aria-label='Export to CSV']")
	public UnityWebElement buttonExportToCSV;

	// tabs
	@FindBy(xpath = "//*[normalize-space(text())='Holdings Report']")
	public UnityWebElement tabHoldingsReport;

	@FindBy(xpath = "//*[normalize-space(text())='Gain/Loss']")
	public UnityWebElement tabGainLoss;

	// holdings report tab links
	@FindBy(xpath = "//strong[normalize-space(text())='As Of:']/../following-sibling::div/mat-form-field//following-sibling::div/input")
	public UnityWebElement labelAsOfDate;

	@FindBy(xpath = "//strong[normalize-space(text())='View By:' or normalize-space(text())='View by:']/../following-sibling::div/mat-form-field//div/mat-select")
	public UnityWebElement dropdownViewBy;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Holdings Total Summary']]")
	public UnityWebElement panelHoldingsTotalSummary;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Holdings Total Summary']]")
	public UnityWebElement panelHoldingsTotalSummaryHeader;

	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Asset Allocation']]")
	public UnityWebElement panelAssetAllocation;

	@FindBy(xpath = "//div[contains(@class,'ngx-charts')]")
	public UnityWebElement chartAssetAllocation;

	@FindBy(xpath = "//mat-option[.//span[normalize-space(text())='Trade Date']]")
	public UnityWebElement optionViewByTradeDate;

	@FindBy(xpath = "//mat-option[.//span[normalize-space(text())='Settlement Date']]")
	public UnityWebElement optionViewBySettlementDate;

	@FindBy(xpath = "//strong[normalize-space(text())='Group By:']/../following-sibling::div/mat-form-field//following-sibling::div/mat-select")
	public UnityWebElement dropdownGroupBy;

	@FindBy(xpath = "//strong[normalize-space(text())='Group By:']/../following-sibling::div/mat-select//span[contains(@class,'mat-select-value-text')]/span")
	public UnityWebElement dropdownGroupByDefaultValue;

	@FindBy(xpath = "//mat-option[span[normalize-space(text())='Major Security']]")
	public UnityWebElement optionGroupByMajorSecurity;
	
	@FindBy(xpath = "//mat-option[span[normalize-space(text())='Major Industry']]")
	public UnityWebElement optionGroupByMajorIndustry;

	@FindBy(xpath = "//mat-option[span[normalize-space(text())='Minor Security']]")
	public UnityWebElement optionGroupByMinorSecurity;

	@FindBy(xpath = "//mat-option[span[normalize-space(text())='None']]")
	public UnityWebElement optionGroupByNone;

	@FindBy(xpath = "//div[contains(@class,'portfolio-option')]//a")
	public UnityWebElement dropdownPortfolio;

	@FindBy(xpath = "//input[@placeholder='Search']")
	public UnityWebElement textboxPortfolio;

	@FindBy(xpath = "//div[@role='listbox']")
	public UnityWebElement listPortfolio;

	@FindBy(xpath = "//span[@class='ag-group-expanded']//div[@class='material-icons']")
	public UnityWebElement iconAgGroupExpand;

	@FindBy(xpath = "//span[@class='ag-group-contracted']//div[@class='material-icons']")
	public UnityWebElement iconAgGroupContract;

	@FindBy(xpath = "//strong[normalize-space(text())='Holdings:']/../..//mat-select")
	public UnityWebElement dropdownHoldings;

	@FindBy(xpath = "//mat-option[span[normalize-space(text())='List by Category']]")
	public UnityWebElement optionListByCategory;

	@FindBy(xpath = "//mat-option[span[normalize-space(text())='List by Security']]")
	public UnityWebElement optionListBySecurity;

	@FindBy(xpath = "//mat-option[span[normalize-space(text())='List by Security Classifications']]")
	public UnityWebElement optionListBySecurityClassifications;

	// grid Controls
	@FindBy(xpath = "//mat-icon[@fisicon='compress']")
	public UnityWebElement linkCollapseAll;

	@FindBy(xpath = "//mat-icon[@fisicon='expand']")
	public UnityWebElement linkExpandAll;

	@FindBy(xpath = "//account-gain-loss-summary//button[@aria-label='Export to CSV']")
	public UnityWebElement linkAccountGainLossExportGrid;

	@FindBy(xpath = "//portfolio-gain-loss-summary//a[@aria-label='Export to CSV']")
	public UnityWebElement linkPortfolioGainLossExportGrid;

	@FindBy(xpath = ".//span[@class='glyphicons glyphicons-print print-icon-size']")
	public UnityWebElement linkPrintGrid;

	// Grid filter columns
	@FindBy(xpath = "//span[normalize-space(text())='Base Currency']/preceding-sibling::div/input")
	public UnityWebElement checkboxBaseCurrency;

	@FindBy(xpath = "//span[normalize-space(text())='Market Value']/preceding-sibling::div/input")
	public UnityWebElement checkboxMarketValueBase;

	@FindBy(xpath = "//span[normalize-space(text())='Market Value (Local)']/preceding-sibling::div/input")
	public UnityWebElement checkboxMarketValueLocal;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Federal Tax Cost']]")
	public UnityWebElement checkboxFederaltaxcost;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Security Internal']]")
	public UnityWebElement checkboxSecurityInternal;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Unrealized Gain/Loss Special Value']]")
	public UnityWebElement checkboxUnrealisedgainlossspecialvalue;

	@FindBy(xpath = "//button//span[normalize-space(text())='Save']")
	public UnityWebElement buttonSaveFilterGrid;

	// grid control
	@FindBy(xpath = "//ag-grid-angular")
	public UnityGridElement holdingsGrid;

	@FindBy(xpath = "//ag-grid-angular[@id='totals-grid']//div[@role='gridcell']")
	public List<WebElement> holdingsTotalGridValues;

	@FindBy(xpath = "//div[@role='grid']")
	public UnityGridElement holdingsGainLossGrid;

	@FindBy(xpath = "//span[@class='ag-group-value'][normalize-space(text())='Cash Equivalents']/preceding-sibling::span[2]")
	public UnityWebElement panelCashEquivalents;

	@FindBy(xpath = "//span[@class='ag-group-value'][normalize-space(text())='Corporate Obligations']/preceding-sibling::span[2]")
	public UnityWebElement panelCorporateObligations;

	@FindBy(xpath = "//span[@class='ag-group-value'][normalize-space(text())='Equities']/preceding-sibling::span[2]")
	public UnityWebElement panelEquities;

	// holdings report
	@FindBy(xpath = "//p[@class='return-menu noprint']//a")
	public UnityWebElement linkHoldingsReport;

//	@FindBy(xpath = "//span/*[normalize-space(text())='Holdings information']")
//	public UnityWebElement panelHoldingsInformation;
	@FindBy(xpath = "//mat-expansion-panel[.//*[normalize-space(text())='Holdings Information']]")
	public UnityWebElement panelHoldingsInformation;

	@FindBy(xpath = "//mat-expansion-panel[.//*[normalize-space(text())='Security Information']]")
	public UnityWebElement panelSecurityInformation;

	@FindBy(xpath = "//mat-expansion-panel[.//*[normalize-space(text())='Entitlement Information']]")
	public UnityWebElement panelEntitlementInformation;

	@FindBy(css = "*[id='holdingsEntitlementsDetail'] div[role='grid']")
	public UnityGridElement gridEntitlementInformation;

	@FindBy(xpath = "//v-pane[@id='entitlementInformationPane']//a[@aria-label='Open filter modal']")
	public UnityWebElement linkEntitlementInformationFilterGrid;

	@FindBy(xpath = "//mat-expansion-panel//*[normalize-space(text())='Active Tax Lot']")
	public UnityWebElement panelActiveTaxLot;

	@FindBy(css = "#activeTaxLotPane div[role='grid']")
	public UnityGridElement gridActiveTaxLot;

	@FindBy(xpath = "//*[@id='activeTaxLotPane']//*[@class='glyphicons glyphicons-table print-icon-size']")
	public UnityWebElement linkFilterGridActiveTaxLot;

	// Active Tax Lot
	@FindBy(xpath = "//span[normalize-space(text())='Estimated Unrealized Gain/Loss (Base)']/preceding-sibling::div/input")
	public UnityWebElement checkboxEstimatedUnrealizedGainLoss;

	@FindBy(xpath = "//span[normalize-space(text())='Federal Acquisition Date']/preceding-sibling::div/input")
	public UnityWebElement checkboxFederalAquisitionDate;

	@FindBy(xpath = "//span[normalize-space(text())='Portfolio Short Name']/preceding-sibling::div/input")
	public UnityWebElement checkboxPortfolioShortName;

	@FindBy(xpath = "//span[normalize-space(text())='Restricted']/preceding-sibling::div/input")
	public UnityWebElement checkboxRestricted;

	@FindBy(xpath = "//span[normalize-space(text())='Security']/preceding-sibling::div/input")
	public UnityWebElement checkboxSecurity;

	@FindBy(xpath = "//span[normalize-space(text())='Share/PV/Units']/preceding-sibling::div/input")
	public UnityWebElement checkboxSharePVUnits;

	@FindBy(xpath = "//span[normalize-space(text())='Unit Cost']/preceding-sibling::div/input")
	public UnityWebElement checkboxUnitCost;

	@FindBy(xpath = "//*[normalize-space(text())='Call Stock Options']/preceding-sibling::span[2]//div")
	public UnityWebElement textCallStockOptions;

	// Entitlement Information

	@FindBy(xpath = "//*[@class='return-menu']//a[normalize-space(text())='Entitlement Information']")
	public UnityWebElement linkEntitlementInformation;

	@FindBy(xpath = "//*[@id='entitlementInformationPane']//*[@class='glyphicons glyphicons-table print-icon-size']")
	public UnityWebElement linkFilterGridEntitlementInformation;

	@FindBy(xpath = "//span[normalize-space(text())='Current Units']/preceding-sibling::div/input")
	public UnityWebElement checkboxCurrentUnits;

	@FindBy(xpath = "//span[normalize-space(text())='Entitlement Date']/preceding-sibling::div/input")
	public UnityWebElement checkboxEntitlementDate;

	@FindBy(xpath = "//span[normalize-space(text())='Location']/preceding-sibling::div/input")
	public UnityWebElement checkboxLocation;

	@FindBy(xpath = "//span[normalize-space(text())='Registration Code Description']/preceding-sibling::div/input")
	public UnityWebElement checkboxRegistrationCodeDescription;

	@FindBy(xpath = "//span[normalize-space(text())='Restriction']/preceding-sibling::div/input")
	public UnityWebElement checkboxRestriction;

	@FindBy(xpath = "//span[normalize-space(text())='Security GREF']/preceding-sibling::div/input")
	public UnityWebElement checkboxSecurityGREF;

	// Gain Loss tab items
	@FindBy(xpath = "//mat-expansion-panel//*[normalize-space(text())='Account Gain/Loss']")
	public UnityWebElement panelAccountGainLoss;

	@FindBy(xpath = "//mat-expansion-panel//*[normalize-space(text())='Historical']")
	public UnityWebElement panelHistorical;

	@FindBy(xpath = "//mat-expansion-panel//*[normalize-space(text())='Portfolio Gain/Loss']")
	public UnityWebElement panelPortfolioGainLoss;

	@FindBy(xpath = "//*[normalize-space(text())='Select Fiscal Year:']/../div/a/span")
	public UnityWebElement dropdownSelectedFiscalYear;

	@FindBy(xpath = "//a[@id='account-gainloss-summary-2016']")
	public UnityWebElement optionFiscalYear2016;

	@FindBy(xpath = "//account-gain-loss-summary//div[@role='grid']")
	public UnityGridElement gridAccountGainLoss;

	@FindBy(xpath = "//disposed-tax-lot-component//a[normalize-space(text())='Gain/Loss']")
	public UnityWebElement linkGainLoss;

	@FindBy(xpath = "//a[contains(@class,'filter-text')]")
	public UnityWebElement dropdownPortfolioGainLoss;

	@FindBy(xpath = "//strong[normalize-space(text())='Select Fiscal Year:']")
	public UnityWebElement labelSelectFiscalYear;

	@FindBy(xpath = "//span[@class='sg-property-name']")
	public List<WebElement> labelAccountGainLossKeys;

	@FindBy(xpath = "//span[@class='sg-property-value ng-star-inserted']")
	public List<WebElement> labelAccountGainLossValues;

	// grid filter columns
	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Name']]")
	public UnityWebElement checkboxName;

	@FindBy(xpath = "//portfolio-gain-loss-summary//div[@role='grid']")
	public UnityGridElement gridPortfolioGainLoss;

	@FindBy(xpath = "//mat-expansion-panel[.//mat-panel-title[normalize-space(text())='Tax Lot Information']]//span[normalize-space(text())='Sequence Number']")
	public UnityWebElement labelSequenceNumberKey;

	@FindBy(xpath = "//mat-expansion-panel[.//mat-panel-title[normalize-space(text())='Tax Lot Information']]//span[normalize-space(text())='Sequence Number']/following-sibling::span")
	public UnityWebElement labelSequenceNumberValue;

	@FindBy(xpath = "//strong[@class='security-id-header']")
	public UnityWebElement labelSecurityIdentifierKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Name')]")
	public UnityWebElement labelNameKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Price as Of')]")
	public UnityWebElement labelPriceAsOfKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Minor Security Type')]")
	public UnityWebElement labelMinorSecurityTypeKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Estimated Annual Income Per Unit')]")
	public UnityWebElement labelEstimatedAnnualIncomePerUnitKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Dated Date')]")
	public UnityWebElement labelDatedDateKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Series')]")
	public UnityWebElement labelSeriesKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Security Considered Worthless')]")
	public UnityWebElement labelSecurityConsideredWorthlessKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Price')]")
	public UnityWebElement labelPriceKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Pricing Source')]")
	public UnityWebElement labelPricingSourceKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Security Processing Class')]")
	public UnityWebElement labelSecurityProcessingClassKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Estimated Annual Income Rate')]")
	public UnityWebElement labelEstimatedAnnualIncomeRateKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Maturity Date')]")
	public UnityWebElement labelMaturityDateKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Pool Number')]")
	public UnityWebElement labelPoolNumberKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Ticker')]")
	public UnityWebElement labelTickerKey;

	// Holdings Information Panel

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'As Of')]")
	public UnityWebElement labelAsOfKey;
	
	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Factor Valid')]")
	public UnityWebElement labelFactorValidKey;

	@FindBy(xpath = "(//li//span[contains(normalize-space(text()),'Market Value')])[last()]")
	public UnityWebElement labelMarketValueKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Holding Security Description')]")
	public UnityWebElement labelHoldingSecurityDescriptionKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Unrealized Gain/Loss (Local)')]")
	public UnityWebElement labelUnrealizedGainLossLocalKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Worthless Flag')]")
	public UnityWebElement labelWorthlessFlagKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Equivalence Factor')]")
	public UnityWebElement labelEquivalenceFactorKey;

	@FindBy(xpath = "(//li//span[contains(normalize-space(text()),'Federal Cost')])[2]")
	public UnityWebElement labelFederalCostKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Percent')]")
	public UnityWebElement labelPercentKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Treat Price as Percent')]")
	public UnityWebElement labelTreatPriceAsPercentKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Share/PV/Units')]")
	public UnityWebElement labelSharePVUnitsKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Valoren')]")
	public UnityWebElement labelValorenKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Portfolio Number')]")
	public UnityWebElement labelPortfolioNumberKey;

	@FindBy(xpath = "//span[@class='sg-property-name']")
	public List<WebElement> labelHistoricalKeys;

	@FindBy(xpath = "//span[contains(@class,'sg-property-value ng-star-inserted')]")
	public List<WebElement> labelHistoricalValues;
	
	//more details
	
	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Administrative Officer')]")
	public UnityWebElement labelAdministrativeOfficerKey;
	
	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Investment Authority')]")
	public UnityWebElement labelInvestmentAuthorityKey;
	
	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Investment Objective')]")
	public UnityWebElement labelInvestmentObjectiveKey;
	
	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Investment Officer')]")
	public UnityWebElement labelInvestmentOfficerKey;
	
	//Accural and proxy info
	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'ACM Fee MTD Accrual')]")
	public UnityWebElement labelACMFeeMTDAccrualKey;
	
	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Alt Proxy Name/Address')]")
	public UnityWebElement labelAltProxyNameAddressKey;
	
	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Current Accrual')]")
	public UnityWebElement labelCurrentAccrualKey;
	
	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Fund MTD Accrual Fed/State Taxable')]")
	public UnityWebElement labelFundMTDAccrualFedStateTaxableKey;
	
	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Fund MTD Accrual Fed Taxable')]")
	public UnityWebElement labelFundMTDAccrualFedTaxableKey;
	
	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Prior accrual')]")
	public UnityWebElement labelPrioraccrualKey;
	
	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Proxy Group Code Override')]")
	public UnityWebElement labelProxyGroupCodeOverrideKey;
	
	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Proxy Voting Code')]")
	public UnityWebElement labelProxyVotingCodeKey;
	
	//Foreign Withholding
	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Foreign Tax Percent Withheld')]")
	public UnityWebElement labelForeignTaxPercentWithheldKey;
	
	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Foreign Withholding Override')]")
	public UnityWebElement labelForeignWithholdingOverrideKey;
	
	//Fund Fee Credit Information
	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Fund Fee 1 Override')]")
	public UnityWebElement labelFundFee1OverrideKey;
	
	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Fund Fee 2 Override')]")
	public UnityWebElement labelFundFee2OverrideKey;
	
	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Fund Fee 3 Override')]")
	public UnityWebElement labelFundFee3OverrideKey;
	
	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Fund Fee 4 Override')]")
	public UnityWebElement labelFundFee4OverrideKey;
	
	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Fund Fee 5 Override')]")
	public UnityWebElement labelFundFee5OverrideKey;
	
	//CTF Information
	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'CTF Begining Accrual')]")
	public UnityWebElement labelCTFBeginingAccrualKey;
	
	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'CTF Income Accrued')]")
	public UnityWebElement labelCTFIncomeAccruedKey;
	
	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'CTF Income Received')]")
	public UnityWebElement labelCTFIncomeReceivedKey;
	
	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Today Unit')]")
	public UnityWebElement labelTodayUnitKey;
	
	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Unit Activity 1')]")
	public UnityWebElement labelUnitActivity1Key;
	
	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Unit Activity 2')]")
	public UnityWebElement labelUnitActivity2Key;

	// Security Information Panel Elements

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Bank Security Number')]")
	public UnityWebElement labelBankSecurityNumberKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Fair Value Category')]")
	public UnityWebElement labelFairValueCategoryKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Long Title 1')]")
	public UnityWebElement labelLongTitle1Key;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Long Title 2')]")
	public UnityWebElement labelLongTitle2Key;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Long Title 3')]")
	public UnityWebElement labelLongTitle3Key;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Long Title 4')]")
	public UnityWebElement labelLongTitle4Key;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Long Title 5')]")
	public UnityWebElement labelLongTitle5Key;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Minor Security Code')]")
	public UnityWebElement labelMinorSecurityCodeKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Price as of Date')]")
	public UnityWebElement labelPriceAsOfDateKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Quotron')]")
	public UnityWebElement labelQuotronKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Performance Measurement Asset Class Number')]")
	public UnityWebElement labelPerformanceMeasurementAssetClassNumberKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Performance Measurement Asset Class Name')]")
	public UnityWebElement labelPerformanceMeasurementAssetClassNameKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Short Title 2')]")
	public UnityWebElement labelShortTitle2Key;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Short Title 1')]")
	public UnityWebElement labelShortTitle1Key;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Sedol')]")
	public UnityWebElement labelSedolKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Security Identifier')]")
	public UnityWebElement labelSecurityIdentifierSecurityInfoKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Display Current ISO Code')]")
	public UnityWebElement labelDisplayCurrentISOCodeKey;

	// Account Gain/Loss Panel Elements
	
	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Account GREF')]")
	public UnityWebElement labelAccountGrefKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Start of Fiscal Year')]")
	public UnityWebElement labelStartOfFiscalYearKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Short Term Gains This Year')]")
	public UnityWebElement labelShortTermGainsThisYearKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Net Short Term This Year')]")
	public UnityWebElement labelNetShortTermThisYearKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Long Term Losses This Year')]")
	public UnityWebElement labelLongTermLossesThisYearKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Fiscal Year')]")
	public UnityWebElement labelFiscalYearKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Fiscal Year Ends')]")
	public UnityWebElement labelFiscalYearEndsKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Short Term Losses This Year')]")
	public UnityWebElement labelShortTermLossesThisYearKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Long Term Gains This Year')]")
	public UnityWebElement labelLongTermGainsThisYearKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Net Long Term This Year')]")
	public UnityWebElement labelNetLongTermThisYearKey;

	@FindBy(xpath = "//span[normalize-space(text())='Fed Cost']/preceding-sibling::div/input")
	public UnityWebElement checkboxFedCost;

	@FindBy(xpath = "//span[normalize-space(text())='Name']/preceding-sibling::div/input")
	public UnityWebElement checkboxAccountGainLossName;

	@FindBy(xpath = "//span[normalize-space(text())='Proceeds']/preceding-sibling::div/input")
	public UnityWebElement checkboxProceeds;

	@FindBy(xpath = "//span[normalize-space(text())='Realized Gain/Loss']/preceding-sibling::div/input")
	public UnityWebElement checkboxRealizedGainLoss;

	// Historical Panel Elements

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Short Term Capital Loss Forward as of 12/31/1969')]")
	public UnityWebElement labelShortTermCapitalLossForwardAsOf12311969Key;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Short Term Capital Loss Forward Pre 1970')]")
	public UnityWebElement labelShortTermCapitalLossForwardPre1970Key;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Long Term Capital Loss Forward as of 12/31/1969')]")
	public UnityWebElement labelLongTermCapitalLossForwardAsOf12311969Key;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Long Term Capital Loss Forward Pre 1970')]")
	public UnityWebElement labelLongTermCapitalLossForwardPre1970Key;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Local Currency')]")
	public UnityWebElement labelLocalCurrencyKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Short Term Capital Loss Forward Post 1969')]")
	public UnityWebElement labelShortTermCapitalLossForwardPost1969Key;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Net Short Term Carry Forward')]")
	public UnityWebElement labelNetShortTermCarryForwardKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Long Term Capital Loss Forward Post 1969')]")
	public UnityWebElement labelLongTermCapitalLossForwardPost1969Key;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Net Long Term Carry Forward')]")
	public UnityWebElement labelNetLongTermCarryForwardKey;

	// Tax Lot Information Elements

	@FindBy(xpath = "(//li//span[contains(normalize-space(text()),'Account Name')])[1]")
	public UnityWebElement labelAccountNameKey;

	@FindBy(xpath = "(//li//span[contains(normalize-space(text()),'Acquired By')])[1]")
	public UnityWebElement labelAcquiredByKey;

	@FindBy(xpath = "(//li//span[contains(normalize-space(text()),'Disposition Date')])[1]")
	public UnityWebElement labelDispositionDateKey;

	@FindBy(xpath = "(//li//span[contains(normalize-space(text()),'Hold as')])[1]")
	public UnityWebElement labelHoldAsKey;

	@FindBy(xpath = "(//li//span[contains(normalize-space(text()),'Portfolio Name')])[1]")
	public UnityWebElement labelPortfolioNameKey;

	@FindBy(xpath = "(//li//span[contains(normalize-space(text()),'Account Number')])[1]")
	public UnityWebElement labelAccountNumberKey;

	@FindBy(xpath = "(//li//span[contains(normalize-space(text()),'Disposed By')])[1]")
	public UnityWebElement labelDisposedByKey;

	@FindBy(xpath = "(//li//span[contains(normalize-space(text()),'Security')])[3]")
	public UnityWebElement labelSecurityKey;

	@FindBy(xpath = "(//li//span[contains(normalize-space(text()),'Is This Transaction Taxable')])[1]")
	public UnityWebElement labelIsThisTransactionTaxableKey;

	// Federal State Tax Panel Elements

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Base Cost')]")
	public UnityWebElement labelBaseCostKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Carry Over Basis')]")
	public UnityWebElement labelCarryOverBasisKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Federal Realized Gain / Loss')]")
	public UnityWebElement labelFederalRealizedGainLossKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'State Tax Consequences')]")
	public UnityWebElement labelStateTaxConsequencesKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Base Disposed at Value')]")
	public UnityWebElement labelBaseDisposedAtValueKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Federal Acquisition Date')]")
	public UnityWebElement labelFederalAcquisitionDateKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Federal Disposed at Value')]")
	public UnityWebElement labelFederalDisposedAtValueKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'State Cost')]")
	public UnityWebElement labelStateCostKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'State Realized Gain/Loss')]")
	public UnityWebElement labelStateRealizedGainLossKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Base Gain Loss When Disposed')]")
	public UnityWebElement labelBaseGainLossWhenDisposedKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'State Acquisition Date')]")
	public UnityWebElement labelStateAcquisitionDateKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Federal Tax Consequences')]")
	public UnityWebElement labelFederalTaxConsequencesKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'State Disposed at Value')]")
	public UnityWebElement labelStateDisposedAtValueKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'V Day Value')]")
	public UnityWebElement labelVDayValueKey;

	// Disposed tax lot details screen
	@FindBy(xpath = "//mat-expansion-panel//*[normalize-space(text())='Tax Lot Information']")
	public UnityWebElement panelTaxLotInformation;

	@FindBy(xpath = "//mat-expansion-panel//*[normalize-space(text())='Federal State Tax']")
	public UnityWebElement panelFederalStateTax;

	@FindBy(xpath = "//mat-expansion-panel//*[normalize-space(text())='Miscellaneous']")
	public UnityWebElement panelMiscellaneous;

	@FindBy(xpath = "//a[normalize-space(text())='Disposed Taxlots']")
	public UnityWebElement linkDisposedTaxLots;

	@FindBy(xpath = "//div[@role='grid']")
	public UnityGridElement gridDisposedTaxLots;

	@FindBy(xpath = "//span[normalize-space(text())='Book Value']/preceding-sibling::div/input")
	public UnityWebElement checkboxBookValueBase;

	@FindBy(xpath = "//span[normalize-space(text())='Book Value (Local)']/preceding-sibling::div/input")
	public UnityWebElement checkboxBookValueLocal;

	@FindBy(xpath = "//span[normalize-space(text())='Current Face']/preceding-sibling::div/input")
	public UnityWebElement checkboxCurrentFace;

	@FindBy(xpath = "//span[normalize-space(text())='Equivalence Factor']/preceding-sibling::div/input")
	public UnityWebElement checkboxEquivalenceFactor;

	@FindBy(xpath = "//span[normalize-space(text())='Estimated Annual Income']/preceding-sibling::div/input")
	public UnityWebElement checkboxEstimatedAnnualIncomeBase;

	@FindBy(xpath = "//span[normalize-space(text())='Estimated Annual Income (Local)']/preceding-sibling::div/input")
	public UnityWebElement checkboxEstimatedAnnualIncomeLocal;

	@FindBy(xpath = "//span[normalize-space(text())='Estimated Annual Income Rate']/preceding-sibling::div/input")
	public UnityWebElement checkboxEstimatedAnnualIncomeRate;

	@FindBy(xpath = "//span[normalize-space(text())='Estimated Unrealized Gain/Loss']/preceding-sibling::div/input")
	public UnityWebElement checkboxEstimatedUnrealizedGainLossBase;

	@FindBy(xpath = "//span[normalize-space(text())='Factor Valid']/preceding-sibling::div/input")
	public UnityWebElement checkboxFactorValid;

	@FindBy(xpath = "//span[normalize-space(text())='Federal Cost']/preceding-sibling::div/input")
	public UnityWebElement checkboxFederalCostBase;

	@FindBy(xpath = "//span[normalize-space(text())='Federal Cost (Local)']/preceding-sibling::div/input")
	public UnityWebElement checkboxFederalCostLocal;

	@FindBy(xpath = "//span[normalize-space(text())='Local Currency']/preceding-sibling::div/input")
	public UnityWebElement checkboxLocalCurrency;

	@FindBy(xpath = "//span[normalize-space(text())='Minor Security']/preceding-sibling::div/input")
	public UnityWebElement checkboxMinorSecurity;

	@FindBy(xpath = "//span[normalize-space(text())='Percent']/preceding-sibling::div/input")
	public UnityWebElement checkboxPercent;

	@FindBy(xpath = "//span[normalize-space(text())='Portfolio Number']/preceding-sibling::div/input")
	public UnityWebElement checkboxPortfolioNumber;

	@FindBy(xpath = "//span[normalize-space(text())='Price']/preceding-sibling::div/input")
	public UnityWebElement checkboxPriceBase;

	@FindBy(xpath = "//span[normalize-space(text())='Price (Local)']/preceding-sibling::div/input")
	public UnityWebElement checkboxPriceLocal;

	@FindBy(xpath = "//span[normalize-space(text())='Security Alpha Sort']/preceding-sibling::div/input")
	public UnityWebElement checkboxSecurityAlphaSort;

	@FindBy(xpath = "//span[normalize-space(text())='Security Identifier Number']/preceding-sibling::div/input")
	public UnityWebElement checkboxSecurityIdentifierNumber;

	@FindBy(xpath = "//span[normalize-space(text())='Security Identifier Type']/preceding-sibling::div/input")
	public UnityWebElement checkboxSecurityIdentifierType;

	@FindBy(xpath = "//span[normalize-space(text())='Ticker']/preceding-sibling::div/input")
	public UnityWebElement checkboxTicker;

	@FindBy(xpath = "//span[normalize-space(text())='Units']/preceding-sibling::div/input")
	public UnityWebElement checkboxUnits;

	@FindBy(xpath = "//span[normalize-space(text())='Unrealized Gain/Loss (Local)']/preceding-sibling::div/input")
	public UnityWebElement checkboxUnrealizedGainLossLocal;

	@FindBy(xpath = "//button[@aria-label='Close dialog']")
	public UnityWebElement buttonClose;

	@FindBy(xpath = "//span[normalize-space(text())='✕']")
	public UnityWebElement buttonFilterClose;

	@FindBy(xpath = "//button[span[normalize-space(text())='Transaction Summary']]")
	public UnityWebElement buttonTransactionSummary;

	@FindBy(xpath = "//mat-panel-title[normalize-space(text())='Federal and State Information']")
	public UnityWebElement panelFederalStateInformation;

	@FindBy(xpath = "//active-tax-lot-details-component//span[@class='sg-property-name']")
	public List<WebElement> activeTaxlotDetailsKeys;

	@FindBy(xpath = "//active-tax-lot-details-component//span[contains(@class,'sg-property-value')]")
	public List<WebElement> activeTaxlotDetailsValues;

	@FindBy(xpath = "//*[normalize-space(text())='Active Tax Lot']//ancestor::mat-expansion-panel[1]//*[@aria-label='Export to CSV']")
	public UnityWebElement buttonActiveTaxlotExportToCSV;

	// Entitlement details
	@FindBy(xpath = "//entitlement-details-component//span[@class='sg-property-name']")
	public List<WebElement> entitlementDetailsKeys;

	@FindBy(xpath = "//entitlement-details-component//span[contains(@class,'sg-property-value')]")
	public List<WebElement> entitlementDetailsValues;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Current Units')]")
	public UnityWebElement labelCurrentUnitsKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Registration')]")
	public UnityWebElement labelRegistrationKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Location')]")
	public UnityWebElement labelLocationKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Prior Units')]")
	public UnityWebElement labelPriorUnitsKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Date Income Starts')]")
	public UnityWebElement labelDateIncomeStartsKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Income Disposition Rule')]")
	public UnityWebElement labelIncomeDispositionRuleKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Capital Gains Distribution')]")
	public UnityWebElement labelCaptitalGainsDistributionKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Percent to Reinvest')]")
	public UnityWebElement labelPercentToReinvestKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'National Withholding Category')]")
	public UnityWebElement labelNationalWithholdingCategoryKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Entitlement Date')]")
	public UnityWebElement labelEntitlementDateKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Restriction')]")
	public UnityWebElement labelRestrictionKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Date of Last Change')]")
	public UnityWebElement labelDateOfLastChangeKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Units Receivable at This Location')]")
	public UnityWebElement labelUnitsReceivableAtThisLocationKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Units Pending Sale')]")
	public UnityWebElement labelUnitsPendingSaleKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Income Receipt Calculation')]")
	public UnityWebElement labelIncomeReceiptCalculationKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Local Withholding Category')]")
	public UnityWebElement labelLocalWithholdingCategoryKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Nonresident Tax Withholding Category')]")
	public UnityWebElement labelNonresidenTaxWithholdingCategoryKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Units to be Delivered from Location')]")
	public UnityWebElement labelUnitsToBeDeliveredFromLocationKey;

	// Security information
	@FindBy(xpath = "//security-details-component//span[@class='sg-property-name']")
	public List<WebElement> securityIdentifierKeys;

	@FindBy(xpath = "//security-details-component//span[contains(@class,'sg-property-value')]")
	public List<WebElement> securityIdentifierValues;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'% of Portfolio')]")
	public UnityWebElement labelPercentOfPortfolioKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Book Value')]")
	public UnityWebElement labelBookValueKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Federal Cost')]")
	public UnityWebElement labelFederalCostSecInfoKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Accrued Income')]")
	public UnityWebElement labelAccruedIncomeKey;
	
	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Estimated Annual Income')]")
	public UnityWebElement labelEstimatedAnnualIncome;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Unrealized Gain/Loss')]")
	public UnityWebElement labelUnrealizedGainLossKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Annual Income')]")
	public UnityWebElement labelAnnualIncomeKey;

	// Security Identifier
	@FindBy(xpath = "//holding-details-component//span[@class='sg-property-name']")
	public List<WebElement> holdingDetailsComponentKeys;

	@FindBy(xpath = "//holding-details-component//span[contains(@class,'sg-property-value')]")
	public List<WebElement> holdingDetailsComponentValues;

	@FindBy(xpath = "//holdings-total-card//span[@class='sg-property-name']")
	public List<WebElement> holdingsTotalKeys;
	
	@FindBy(xpath = "//entitlement-details-component//span[@class='sg-property-name']")
	public List<WebElement> EntitlementDetailsKeys;

	@FindBy(xpath = "//holdings-total-card//span[contains(@class,'sg-property-value')]")
	public List<WebElement> holdingsTotalValues;
	
	@FindBy(xpath = "//entitlement-details-component//span[contains(@class,'sg-property-value')]")
	public List<WebElement> EntitlementDetailsValues;
	
	//Entilement details
	
//	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Current Units')]")
//	public UnityWebElement labelCurrentUnitsKey;

	// Taxlot information and Federal and state information
	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Portfolio Short Name')]")
	public UnityWebElement labelPortfolioShortNameKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'How Acquired')]")
	public UnityWebElement labelHowAcquiredKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'How Held')]")
	public UnityWebElement labelHowHeldKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Vday Valuation')]")
	public UnityWebElement labelVdayValuationKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Reserved Taxlot')]")
	public UnityWebElement labelReservedTaxlotKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Federal Accumulated Amortization')]")
	public UnityWebElement labelFederalAccumulatedAmortizationKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Federal Cost (Base)')]")
	public UnityWebElement labelFederalCostBaseKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Federal Tax Cost')]")
	public UnityWebElement labelFederalTaxCostKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'State Accumulated Amortization')]")
	public UnityWebElement labelStateAccumulatedAmortizationKey;

	@FindBy(xpath = "//*[normalize-space(text())='Taxlot Information']//ancestor::mat-expansion-panel//li//span[contains(normalize-space(text()),'Unrealized Gain/Loss')]")
	public UnityWebElement labelTaxlotInfoUnrealizedGainLossKey;

	@FindBy(xpath = "//span[normalize-space(text())='Major Security Code']/preceding-sibling::div/input")
	public UnityWebElement checkboxMajorSecurityCode;

	// Asset Allocation
	@FindBy(xpath = "//mat-expansion-panel[.//*[normalize-space(text())='Asset Allocation']]//*[contains(@class,'chart chart')]")
	public UnityWebElement barChartAssetAllocation;

	// As of calender icons
	@FindBy(xpath = "//button[@aria-label='Open calendar']")
	public UnityWebElement buttonAsOfCalender;

	@FindBy(xpath = "//button[@aria-label='Choose month and year']")
	public UnityWebElement buttonChooseMonthYear;

	// Holdings next page
	@FindBy(xpath = "//li[@class='active']//mat-icon[contains(@class,'fis-icon-rotate-270')]")
	public UnityWebElement linkNextPage;

	@FindBy(xpath = "//li[@class='active']//i[normalize-space(text())='last_page']")
	public UnityWebElement linkLastPage;

	@FindBy(xpath = "//mat-option[span[normalize-space(text())='Security Type']]")
	public UnityWebElement optionGroupBySecurityType;

	@FindBy(xpath = "//mat-option[span[normalize-space(text())='Asset Category']]")
	public UnityWebElement optionGroupByAssetCategory;

	@FindBy(xpath = "//span[normalize-space(text())='Earnings per Share']/preceding-sibling::div/input")
	public UnityWebElement checkboxEarningsPerShare;

	@FindBy(xpath = "//span[normalize-space(text())='Industry']/preceding-sibling::div/input")
	public UnityWebElement checkboxIndustry;

	@FindBy(xpath = "//span[normalize-space(text())='Maturity Date']/preceding-sibling::div/input")
	public UnityWebElement checkboxMaturityDate;

	@FindBy(xpath = "//span[normalize-space(text())='Moody’s Ratings']/preceding-sibling::div/input")
	public UnityWebElement checkboxMoodysRatings;

	@FindBy(xpath = "//span[normalize-space(text())='Price Date']/preceding-sibling::div/input")
	public UnityWebElement checkboxPriceDate;

	@FindBy(xpath = "//span[normalize-space(text())='S&P Rating']/preceding-sibling::div/input")
	public UnityWebElement checkboxSPRating;

	@FindBy(xpath = "//span[normalize-space(text())='Unit Tax Cost']/preceding-sibling::div/input")
	public UnityWebElement checkboxUnitTaxCost;

	@FindBy(xpath = "//button[@aria-label='ok']")
	public UnityWebElement buttonOk;

	@FindBy(xpath = "//div[contains(@class,'mat-checkbox-inner-container')]")
	public UnityWebElement checkboxHyperlink;

	@FindBy(xpath = "//*[normalize-space(text())='More Details']")
	public UnityWebElement linkMoreDetails;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'ISIN')]")
	public UnityWebElement labelISINKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Reporting Class Code')]")
	public UnityWebElement labelReportingClassCodeKey;

	@FindBy(xpath = "//li//span[contains(normalize-space(text()),'Reporting Class Meaning')]")
	public UnityWebElement labelReportingClassMeaningKey;

	@FindBy(xpath = "//span[normalize-space(text())='Managed by Bank']/preceding-sibling::div/input")
	public UnityWebElement checkboxManagedByBank;

	@FindBy(xpath = "//span[normalize-space(text())='Proxy Voting Code']/preceding-sibling::div/input")
	public UnityWebElement checkboxProxyVotingCode;

	@FindBy(xpath = "//*[normalize-space(text())='Entitlement Information']//ancestor::mat-expansion-panel[1]//unity-upgrade-column-filter/button")
	public UnityWebElement buttonEntitlementInformationColumnSettings;

	@FindBy(xpath = "//*[normalize-space(text())='Entitlement Information']//ancestor::mat-expansion-panel[1]//*[@aria-label='Export to CSV']")
	public UnityWebElement buttonEntitlementInformationExportToCSV;

	@FindBy(xpath = "//*[normalize-space(text())='Entitlement Information']//ancestor::mat-expansion-panel[1]//unity-print-v2/button")
	public UnityWebElement buttonEntitlementInformationPrint;

	@FindBy(xpath = "//*[normalize-space(text())='Active Tax Lot']//ancestor::mat-expansion-panel[1]//unity-upgrade-column-filter/button")
	public UnityWebElement buttonActiveTaxlotColumnSettings;

	@FindBy(xpath = "//*[normalize-space(text())='Active Tax Lot']//ancestor::mat-expansion-panel[1]//unity-print-v2/button")
	public UnityWebElement buttonActiveTaxLotPrint;

	@FindBy(xpath = "//unity-grid-column-filter//button//span//mat-icon")
	public UnityWebElement linkFilterGrid;
	
	@FindBy(xpath = "//unity-grid-column-filter/button//span//mat-icon ")
	public UnityWebElement buttonColumnSettings;

	@FindBy(xpath = "//column-filter-dialog//div//h2")
	public UnityWebElement headerColumnSettings;

	@FindBy(xpath = "//div[@aria-label='Column Settings']//input")
	public List<WebElement> listCheckboxColumnSettings;
	
	@FindBy(xpath = "//button[span[normalize-space(text())='Save']]")
	public UnityWebElement buttonSaveColumnSettings;


	@Override
	public void waitForPageToLoad() {
		boolean flag = false;
		startTime = System.currentTimeMillis();
		if (super.isPageLoaded(driver))
			try {
				UnityUtils.wait(2000);
				endTime = System.currentTimeMillis();
				pageLoadTime = (endTime - startTime) / 1000;
			} catch (Exception e) {
				Assert.fail("Expected page did not load\n");
			}
		else {
			Assert.assertTrue(flag, "Timed out after " + AppConstants.PAGE_LOAD_TIMEOUT + " seconds");
		}
	}

	public String formatServiceUrl(String serviceUrl) {
		String asOfDate = labelAsOfDate.getAttribute("value").trim();
		Date date = null;
		try {
			date = new SimpleDateFormat("MM/dd/yyyy").parse(asOfDate);
		} catch (ParseException e) {
			Assert.fail("As of date is not in acceptable format");
		}
		SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd");
		serviceUrl = serviceUrl.replace("YYYY-MM-DD", form.format(date));
		return serviceUrl;
	}

	public String formatServiceUrlFiscalYear(String serviceUrl, String fiscalYear) {
		String startDate = fiscalYear + "-01-01";
		String endDate = fiscalYear + "-12-31";
		serviceUrl = serviceUrl.replace("YYYY1-MM1-DD1", startDate);
		serviceUrl = serviceUrl.replace("YYYY2-MM2-DD2", endDate);
		return serviceUrl;
	}

	public void waitForGridToLoad() {
		super.isPageLoaded(driver);
		holdingsGrid.waitforVisible();
	}

	public String getMonthName(String strDate) {
		Date date = new Date();
		String month = null;
		try {
			SimpleDateFormat formatter1 = new SimpleDateFormat("MM/dd/yyyy");
			date = formatter1.parse(strDate);
			formatter1 = new SimpleDateFormat("MMMM");
			month = formatter1.format(date).toString();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return month;
	}
}
