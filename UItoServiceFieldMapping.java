package com.unity.utilities;

import java.util.HashMap;
import java.util.Map;

/**
 * @author e5562312 neerajM
 * 
 *         This class is used to provide uiMap to service attributes
 */
public class UItoServiceFieldMapping {

	private UItoServiceFieldMapping() {
		throw new IllegalStateException("Utility Class");
	}

	static Map<String, String> uiMapToServiceAttrib = null;

	public static Map<String, String> getServiceMapping(String serviceUrl) {
		serviceUrl = serviceUrl.substring(serviceUrl.lastIndexOf('/') + 1, serviceUrl.indexOf('?'));
		if (serviceUrl.contains("(")) {
			serviceUrl = serviceUrl.substring(0, serviceUrl.indexOf('('));
		}
		switch (serviceUrl.toLowerCase()) {
		case "excesscashwidget":
			return getMapping_ExcessCashWidget();
		case "cashbalancewidget":
			return getMapping_CashBalanceWidget();
		case "newlyopenaccounts":
			return getMapping_NewlyOpenAccounts();
		case "recentlyaccessed":
			return getMapping_RecentlyAccessed();
		case "accountgainloss":
			return getMapping_AccountGainLoss();
		case "accounthistoricalmktvalsummary":
			return getMapping_AccountHistoricalMktValSummary();
		case "accounts":
			return getMapping_Accounts();
		case "feeoversightsummary":
            return getMapping_FeeOversightSummary();
		case "feereceivables":
            return getMapping_feereceivables();
		case "feeactivity":
			return getMapping_FeeActivity();
		case "feeevents":
			return getMapping_FeeEvents();
		case "accountdetails":
			return getMapping_AccountDetails();
		case "accountdateddetails":
			return getMapping_AccountDatedDetails();
		case "accountfeedetail":
			return getMapping_AccountFeeDetails();
		case "accountgrouppostedtransactions":
			return getMapping_AccountGroupPostedTransactions();
		case "accountrmddetails":
			return getMapping_AccountRMDDetails();
		case "accountrmdownerdetail":
			return getMapping_AccountRMDOwnerDetail();
		case "accountrmddistributiondetail":
			return getMapping_AccountRMDDistributionDetail();
		case "accountrmddistributionsummary":
			return getMapping_AccountRMDDistributionSummary();
		case "accountrmdpaymenthistorydetail":
			return getMapping_AccountRMDPaymentHistoryDetail();
		case "accounttaxvendoramortgainlossdetails":
			return getMapping_AccountTaxVendorAmortGainLossDetails();
		case "clientassetallocation":
			return getMapping_AssetAllocation();
		case "clientaddresses":
			return getMapping_ClientAddresses();
		case "clientcontacts":
			return getMapping_ClientContacts();
		case "clientdetails":
			return getMapping_ClientDetails();
		case "default.getnotificationsforadmin":
			return getMapping_Notifications();
		case "eventdetails":
			return getMapping_EventsDetails();
		case "events":
			return getMapping_Events();
		case "feeeventparticipantdetail":
			return getMapping_FeeEventParticipantDetail();
		case "holdings":
			return getMapping_Holdings();
		case "acgholdings":
			return getMapping_Holdings();
		case "openorders":
			return getMapping_OpenOrders();
		case "ownedaccounts":
			return getMapping_OwnedAccounts();
		case "pendingfree":
			return getMapping_PendingFree();
		case "pendingfreedetail":
			return getMapping_PendingFreeDetail();
		case "portfolioalternateid":
			return getMapping_PortfolioAlternateId();
		case "portfoliosafekeeping":
			return getMapping_PortfolioSafeKeeping();
		case "portfoliosearch":
			return getMapping_PortfolioSearch();
		case "portfoliosforwidget":
			return getMapping_PortfoliosForWidget();
		case "postedtransactions":
			return getMapping_PostedTransactions();
		case "postedtransactioncategories":
			return getMapping_PostedTransactionCategories();
		case "transactionsforwidget":
			return getMapping_TransactionsForWidget();
		case "cashprojectionsummary":
			return getMapping_CashProjectionSummary();
		case "cashprojectionsummarytotal":
			return getMapping_CashProjectionSummaryTotal();
		case "cashprojectionheader":
			return getMapping_CashProjectionHeader();
		case "securitydetail":
			return getMapping_SecurityDetail();
		case "securitydetails":
			return getMapping_SecurityDetails();
		case "default.getsummarydata":
			return getMapping_PerformanceHistorical();
		case "affiliatees":
			return getMapping_Affiliatees();
		case "banks":
			return getMapping_Banks();
		case "feeoversighttotal":
			return getMapping_feeoversighttotal();
		case "branches":
			return getMapping_Branches();
		case "accountrmdrelationships":
			return getMapping_accountRMDRelationships();
		case "accountcashdetail":
			return getMapping_AccountCashDetails();
		case "accountheader":
			return getMapping_AccountHeader();
		case "accountgroupheader":
			return getMapping_AccountGroupHeader();
		case "assetallocation":
			return getMapping_AssetAllocation();
		case "disposedtaxlots":
			return getMapping_DisposedTax();
		case "feedetail":
			return getMapping_PostedTransactionFeeDetails();
		case "feecalculationformulasummary":
			return getMapping_PostedTransactionFeeCalculationSummary();
		case "portfoliofeesummary":
			return getMapping_PostedTransactionPortfolioFeeSummary();
		case "postedtransactiondetail":
			return getMapping_PostedTransactionDetails();
		case "taxcodedetail":
			return getMapping_TaxCodeDetails();
		case "checkdetail":
			return getMapping_PayRecordDetails();
		case "grosstonetcomponents":
			return getMapping_GrossToNetDetails();
		case "userdefinedfields":
			return getMapping_UserDefinedFields();
		case "feechargescal":
			return getMapping_FeeChargesCalculation();
		case "accountfeeeventdetails":
			return getMapping_AccountFeeEventDetails();
		case "accountgainlossbyyear":
			return getMapping_AccountGainLossByYear();
		case "disposedtaxlotdetails":
			return getMapping_DisposedTaxlotDetails();
		case "accountgainlossdetail":
			return getMapping_AccountGainLossDetail();
		case "documents":
			return getMapping_Documents();
		case "clientreminders":
			return getMapping_ClientReminders();
		case "clientrelationships":
			return getMapping_ClientRelationships();
		case "relationships":
			return getMapping_Relationships();
		case "memos":
			return getMapping_Memos();
		case "activetaxlotdetails":
			return getMapping_ActiveTaxlotDetails();
		case "activetaxlots":
			return getMapping_ActiveTaxlots();
		case "entitlementdetails":
			return getMapping_EntitlementDetails();
		case "entitlements":
			return getMapping_entitlements();
		case "holdingdetails":
			return getMapping_holdingdetails();
		case "holdingstotal":
			return getMapping_HoldingsTotal();
		case "accounttaxdetails":
			return getMapping_AccountTaxDetails();
		case "portfoliocashdetail":
			return getMapping_PortfolioCashDetail();
		case "reportexecutions":
			return getMapping_ReportExecutions();
		case "jobscheduler":
			return getMapping_JobSceduler();
		case "reportdefinitions":
			return getMapping_ReportDefinitions();
		case "accountgroupportfolios":
			return getMapping_AccountGroupPortfolios();
		case "workflowdocuments":
			return getMapping_WorkflowDocuments();
		case "portfolios":
			return getMapping_Portfolios();
		case "portfoliodetails":
			return getMapping_PortfolioDetails();
		case "eventparticipantfeedetail":
			return getMapping_EventParticipantFeeDetail();
			
		default:
			return new HashMap<>();
		}
	}
	
	private static Map<String, String> getMapping_ExcessCashWidget() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Name", "entityName");
		uiMapToServiceAttrib.put("Total Cash & Equivalents", "cashEquivalentBase");
		uiMapToServiceAttrib.put("% of Market Value in Cash & Equivalents", "cashEquivalentSettleMktValPercent");
		return uiMapToServiceAttrib;
	}
	
	private static Map<String, String> getMapping_CashBalanceWidget() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Name", "entityName");
		uiMapToServiceAttrib.put("Cash Value", "cashValueTradeDtBase");
//		uiMapToServiceAttrib.put("% of Market Value in Cash", "cashEquivalentSettleMktValPercent");
		return uiMapToServiceAttrib;
	}
	
	private static Map<String, String> getMapping_NewlyOpenAccounts() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Name", "entityName");
		uiMapToServiceAttrib.put("Date Opened", "openedDate");
		uiMapToServiceAttrib.put("Market Value", "marketValueSettleDtBase");
		return uiMapToServiceAttrib;
	}
	
	private static Map<String, String> getMapping_RecentlyAccessed() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Name", "entityName");
		uiMapToServiceAttrib.put("Number", "entityIdNumber");
//		uiMapToServiceAttrib.put("Market Value", "marketValueSettleDtBase");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_FeeOversightSummary() {
        uiMapToServiceAttrib = new HashMap<>();
        uiMapToServiceAttrib.put("Number of Accounts", "numberOfAccounts");
        uiMapToServiceAttrib.put("Total Market Value", "marketValue");
        uiMapToServiceAttrib.put("Branch", "branchName");
        uiMapToServiceAttrib.put("Fees Year-to-Date", "feesYearToDate");
        return uiMapToServiceAttrib;
  }

	
	private static Map<String, String> getMapping_FeeActivity() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Administrator", "accountAdmin");
		uiMapToServiceAttrib.put("Account Number", "accountNumber");
		uiMapToServiceAttrib.put("Branch Name", "branchName");
		uiMapToServiceAttrib.put("Event Number", "eventNumber");
		uiMapToServiceAttrib.put("Fee Schedule Description", "feeScheduleMeaning");
		uiMapToServiceAttrib.put("Fee Schedule Number", "feeScheduleCode");
		uiMapToServiceAttrib.put("Ledger Cash (Local)", "ledgerCashTdLocal");
		uiMapToServiceAttrib.put("Posted Date", "datePosted");
		uiMapToServiceAttrib.put("Portfolio Number", "portfolioNumber");
		uiMapToServiceAttrib.put("Reporting Date", "reportingAsOf");
		uiMapToServiceAttrib.put("Transaction GREF", "transactionGref");
		uiMapToServiceAttrib.put("Transaction Description", "transactionDescription");
		uiMapToServiceAttrib.put("Account Name", "accountName");
		uiMapToServiceAttrib.put("Branch Number", "branchCode");
		uiMapToServiceAttrib.put("Ledger Cash (Base)", "ledgerCashTdBase");
		uiMapToServiceAttrib.put("Portfolio Name", "portfolioName");
		uiMapToServiceAttrib.put("Receivable Amount (Base)", "cashReceivableSdBase");
		uiMapToServiceAttrib.put("Receivable Amount (Local)", "cashReceivableSdLocal");
		uiMapToServiceAttrib.put("Receivable Number", "cashReceivableNumber");
//		uiMapToServiceAttrib.put("Reversal Transaction ID", "");
		uiMapToServiceAttrib.put("Reversed?", "reversed");
		uiMapToServiceAttrib.put("Transaction Information", "fmtTxText");
		uiMapToServiceAttrib.put("Transaction Number", "transactionNumber");
		return uiMapToServiceAttrib;
	}
	
	private static Map<String, String> getMapping_AccountTaxVendorAmortGainLossDetails() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Process via ONESOURCE", "processViaOneSource");
		uiMapToServiceAttrib.put("ONESOURCE Product Code", "onesourceProductCode");
		uiMapToServiceAttrib.put("5498 via ONESOURCE", "onesource5498");
		uiMapToServiceAttrib.put("1099 Misc via ONESOURCE", "miscviaOnesource1099");
		uiMapToServiceAttrib.put("1099R via ONESOURCE", "onesource1099R");
		uiMapToServiceAttrib.put("ONESOURCE 1099 Account", "onesource1099Account");
		uiMapToServiceAttrib.put("ONESOURCE 1099 Service Level", "onesource1099ServiceLevel");
		uiMapToServiceAttrib.put("ONESOURCE UPIA Indicator", "onesourceUPIAIndicator");
		uiMapToServiceAttrib.put("1099 MR via ONESOURCE", "onesource1099Mr");
		uiMapToServiceAttrib.put("Reporting for 1099-B Only", "reportingfor1099BOnly");
		uiMapToServiceAttrib.put("1098 via ONESOURCE", "onesource1098");
		uiMapToServiceAttrib.put("1099Q via ONESOURCE", "onesource1099Q");
		uiMapToServiceAttrib.put("ONESOURCE Worksheet Only", "onesourceWorksheetOnly");
		uiMapToServiceAttrib.put("Do Automatic Amortization", "doAutomaticAmortization");
		uiMapToServiceAttrib.put("Date for Amortization", "dateforAmortization");
		uiMapToServiceAttrib.put("AMR Bkkeepping EFFT", "amrBkkeppingEFFT");
		uiMapToServiceAttrib.put("Accretion Bkkeeping EFFT", "accretionBkkeepingEFFT");
		uiMapToServiceAttrib.put("Amort Bonds to Pre Ref Date", "amortBondstoPreRefDate");
		uiMapToServiceAttrib.put("Do Automatic Accretion", "doAutomaticAccretion");
		uiMapToServiceAttrib.put("Acr Int Bearing Bd on UD Cycle", "acrIntBearingBdonUDCycle");
//		uiMapToServiceAttrib.put("Date for Accretion", "dateforAccretion");
		uiMapToServiceAttrib.put("Security Type or Subclass to Include", "securityTypeorSubclasstoInclude");
		uiMapToServiceAttrib.put("Addtl Sec Codes to Incl", "addtlSecCodestoIncl");
		uiMapToServiceAttrib.put("Override DE Minimus Rule", "overrideDEMinimusRule");
		uiMapToServiceAttrib.put("Addtl Sec Codes for AC", "addtlSecCodesforAC");
		uiMapToServiceAttrib.put("Eligible for AHB Processing", "eligibleforAHBProcessing");
		uiMapToServiceAttrib.put("Tax Service Code", "taxServiceReportCodeMeaning");
		uiMapToServiceAttrib.put("Tax Preparer", "taxPreparer");
		uiMapToServiceAttrib.put("ONESOURCE Processing Indicator", "onesourceProcessingIndicator");
		uiMapToServiceAttrib.put("Tax Open Date", "taxOpenDate");
		uiMapToServiceAttrib.put("Tax Vendor Admin Type", "taxVendorAdminType");
		uiMapToServiceAttrib.put("Final Return Date", "finalReturnDate");
		uiMapToServiceAttrib.put("1099 Service Level", "1099ServiceLevel");
		uiMapToServiceAttrib.put("Produce 1098 Mortgage Interest", "produce1098MortgageInterest");
		uiMapToServiceAttrib.put("Amort/Accrete Model", "amortAccreteModel");
		uiMapToServiceAttrib.put("Amortization Instructions", "amortizationInstructions");
		uiMapToServiceAttrib.put("Federal Short Term Gain/Loss YTD", "federalShortTermGLYTD");
		uiMapToServiceAttrib.put("Federal Long Term Gain/Loss YTD", "federalLongTermGLYTD");
		uiMapToServiceAttrib.put("Federal Qualified 5 YR Gain YTD", "federalQualified5YRGainYTD");
		uiMapToServiceAttrib.put("State Short Term Gain/Loss YTD", "stateShortTermGLYTD");
		uiMapToServiceAttrib.put("State Long Term Gain/Loss YTD", "stateLongTermGLYTD");
		uiMapToServiceAttrib.put("State Qualified 5 YR Gain YTD", "stateQualified5YRGainYTD");
		uiMapToServiceAttrib.put("Federal Deduction IROD", "federalDeductionIROD");
		uiMapToServiceAttrib.put("State Net Operating Loss", "stateNetOperatingLoss");
		uiMapToServiceAttrib.put("Federal Short Term Loss Carry Over", "federalShortTermLossCarryOver");
		uiMapToServiceAttrib.put("Federal Long Term Loss Carry Over", "federalLongTermLossCarryOver");
		uiMapToServiceAttrib.put("State Short Term Loss Carry Over", "stateShortTermLossCarryOver");
		uiMapToServiceAttrib.put("State Long Term Loss Carry Over", "stateLongTermLossCarryOver");
		uiMapToServiceAttrib.put("Total Federal Tax Cost", "totalFederalTaxCost");
		uiMapToServiceAttrib.put("Total State Tax Cost", "totalStateTaxCost");
		uiMapToServiceAttrib.put("Federal Estate Tax Filing Date", "federalEstateTaxFilingDate");
		uiMapToServiceAttrib.put("State Inheritance Tax Filing Date", "stateInheritanceTaxFilingDate");
		uiMapToServiceAttrib.put("Amortize Taxable Bond Premium", "amortizeTaxableBondPremium");
		uiMapToServiceAttrib.put("Accrue Discount Constant Yield", "accrueDiscountConstantYield");
		uiMapToServiceAttrib.put("Incl Market Discount in Income", "inclMarketDiscountinIncome");
		uiMapToServiceAttrib.put("Treat Interest as OID", "treatInterestasOID");
		uiMapToServiceAttrib.put("Use Spot Rate", "useSpotRate");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_EventParticipantFeeDetail() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Account Name", "accountName");
		uiMapToServiceAttrib.put("Account Number", "accountNumber");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_WorkflowDocuments() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Document Name", "docName");
		uiMapToServiceAttrib.put("Document Category", "docCategory");
		uiMapToServiceAttrib.put("Document Type(s)", "docTypeList");
		uiMapToServiceAttrib.put("Document Description", "docDescription");
		uiMapToServiceAttrib.put("File Name", "fileName");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_AccountGroupPortfolios() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Portfolio Name", "portfolioName");
		uiMapToServiceAttrib.put("Portfolio Currency", "portfolioCurrencyCode");
		uiMapToServiceAttrib.put("Portfolio Number", "portfolioNumber");
		uiMapToServiceAttrib.put("Base Currency", "accountCurrencyCode");
		uiMapToServiceAttrib.put("Account Number", "accountNumber");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_AccountTaxDetails() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Tax ID", "federalTaxId");
		uiMapToServiceAttrib.put("YTD Realized Gain/Loss", "realizedGainLoss");
		uiMapToServiceAttrib.put("Short-Term Gain/Loss", "ytdSTRealizedGainLoss");
		uiMapToServiceAttrib.put("Long-Term Gain/Loss", "ytdLTRealizedGainLoss");
		uiMapToServiceAttrib.put("Tax Period Frequency", "taxPeriodFrequencyDay");
		uiMapToServiceAttrib.put("Tax Lot Selection Method", "taxLotSelectionMethodCodeMeaning");
		uiMapToServiceAttrib.put("Generation Skipping Code", "generationSkipCodeMeaning");
		uiMapToServiceAttrib.put("Tax Service Code", "taxServiceReportCodeMeaning");
		// uiMapToServiceAttrib.put("YTD Realized Total GL", "realizedGainLoss");
		// uiMapToServiceAttrib.put("YTD Gain Loss ST", "ytdSTRealizedGainLoss");
		// uiMapToServiceAttrib.put("YTD Gain Loss LT", "ytdLTRealizedGainLoss");
		uiMapToServiceAttrib.put("Tax ID Number", "federalTaxId");
		uiMapToServiceAttrib.put("Tax Lot Accounting", "accountMaintainsTaxlots");
		uiMapToServiceAttrib.put("Combined Tax Reporting", "combinedTaxReporting");
		uiMapToServiceAttrib.put("Eligible for 2% Floor Exemption", "eligibleForTwoPercentFloorExemption");
		uiMapToServiceAttrib.put("Generation Skip Percent", "generationSkipPercent");
		uiMapToServiceAttrib.put("Foreign Tax Withholding (%)", "foreignTaxWithholdingPer");
		uiMapToServiceAttrib.put("IRA/SEP/Simple/Roth/ESA", "iraSepSimpleRothESA");
		uiMapToServiceAttrib.put("Average Cost/Tax Lot Reduction", "avgCostTaxLotReductCodeMeaning");
		uiMapToServiceAttrib.put("ONESOURCE Processing Indicator", "onesourceProcessingIndicator");
		uiMapToServiceAttrib.put("Income Tax Liability Code", "incomeTaxLiabilityCode");
		uiMapToServiceAttrib.put("Capital Gains Tax Liability Code", "capitalGainsTaxLiabilityCode");
		uiMapToServiceAttrib.put("Exempt from Personal Property Tax", "exemptfromPersonalPropertyTax");
		uiMapToServiceAttrib.put("Account Taxability", "accountTaxability");
		uiMapToServiceAttrib.put("Original Owner Date of Death", "originalOwnerDateofDeath");
		uiMapToServiceAttrib.put("Original Owner Date of Birth", "originalOwnerDateofBirth");
		uiMapToServiceAttrib.put("Country Code", "cntryOfResidenceMeaning");
		uiMapToServiceAttrib.put("YTD Realized Total G/L", "realizedGainLoss");
		uiMapToServiceAttrib.put("YTD Gain/Loss Short Term", "ytdSTRealizedGainLoss");
		uiMapToServiceAttrib.put("YTD Gain/Loss Long Term", "ytdLTRealizedGainLoss");
		uiMapToServiceAttrib.put("Tax Short Title", "shortName");
		uiMapToServiceAttrib.put("Filing Status", "trustTaxFilingStatusCodeMeaning");
		uiMapToServiceAttrib.put("Tax Year", "taxYearEnd");
		uiMapToServiceAttrib.put("Date Account Closed", "dateAccountClosed");
		uiMapToServiceAttrib.put("Tax Gain To Code", "taxGainToCode");
		uiMapToServiceAttrib.put("Tax Income To Code", "taxIncomeToCode");
		uiMapToServiceAttrib.put("Principal Distribution made this year", "principalDistributionmadethisyear");
		uiMapToServiceAttrib.put("Final Distribution made this year", "finalDistributionMadethisyear");
		uiMapToServiceAttrib.put("Adjusted Tax Bracket for Last Tax Year", "adjustedTaxBracketforLastTaxYear");
		uiMapToServiceAttrib.put("5X5 Power Right of Withdraw", "powerRightOfWithdraw");
		uiMapToServiceAttrib.put("Former Fiscal Year End", "formerFiscalYearEnd");
		uiMapToServiceAttrib.put("No tax Reporting Necessary", "notaxReportingNecessary");
		uiMapToServiceAttrib.put("Additional Tax Forms Required for Trust", "additionalTaxFormsReqTrust");
		uiMapToServiceAttrib.put("Other Tax reporting Required", "taxServiceReportCodeMeaning");
		uiMapToServiceAttrib.put("Tax Letter #1", "taxLetter_1");
		uiMapToServiceAttrib.put("Tax Letter #2", "taxLetter_2");
		uiMapToServiceAttrib.put("Tax Letter #3", "taxLetter_3");
		uiMapToServiceAttrib.put("Reporting for 1099 BRO, DIV, INT, MISC, RENT, OID, Real Estate Required", "rptBroDivIntOidReportingRequired");
		uiMapToServiceAttrib.put("Exclude from Backup Withholding", "excludeFromBackupWithholding");
		uiMapToServiceAttrib.put("Suppress Tax Worksheet", "suppressTaxWorksheet");
		uiMapToServiceAttrib.put("Federal Estimated Tax for Current Year", "federalEstimatedTaxforCurrentYear");
		uiMapToServiceAttrib.put("Basis of Estimated Federal Tax", "basisOfEstimatedFederalTax");
		uiMapToServiceAttrib.put("State Estimated Tax for Current Year", "stateEstimatedTaxforCurrentYear");
		uiMapToServiceAttrib.put("Basis of Estimated State Tax", "basisOfEstimatedStateTax");
		uiMapToServiceAttrib.put("Passive Loss/Credit Carryover Post ‘86", "passiveLossCreditCarryPost86");
		uiMapToServiceAttrib.put("Fed LT Loss Carry Over", "federalLTLossCarryover");
		uiMapToServiceAttrib.put("Fed ST Loss Carry Over", "federalSTLossCarryver");
		uiMapToServiceAttrib.put("Date for State Loss Carryover", "dateforStateLossCarryover");
		uiMapToServiceAttrib.put("Amount of State Loss Carryover", "amountofStateLossCarryover");
		uiMapToServiceAttrib.put("Exempt from Federal Tax Withholding", "exemptFromFederalTaxWithholding");
		uiMapToServiceAttrib.put("Date of Tax Exemption", "dateOfTaxExemption");
		uiMapToServiceAttrib.put("Fed Exemption Type", "fedExemptionType");
		uiMapToServiceAttrib.put("Federal Withholding Rate", "federalWithholdingRate");
		uiMapToServiceAttrib.put("Exempt from State Tax Withholding", "exemptFromStateTaxWithholding");
		uiMapToServiceAttrib.put("State Withholding Rate", "stateWithholdingRate");
		uiMapToServiceAttrib.put("State Taxpayer Identification Number", "stateTaxpayerIdNumber");
		uiMapToServiceAttrib.put("Date Tax Costs Updated by Bridgeback", "dateTaxCostsUpdatedbyBridgeback");
		uiMapToServiceAttrib.put("Tax Year End for Refunds", "taxYearEndforRefunds");
		uiMapToServiceAttrib.put("Tax Year End for Refunds #2", "taxYearEndforRefunds_2");
		uiMapToServiceAttrib.put("Tax Year End for Refunds #3", "taxYearEndforRefunds_3");
		uiMapToServiceAttrib.put("Amount of Previous Year Federal Refund", "amountOfPrevYearFederalRefund");
		uiMapToServiceAttrib.put("Amount of Previous Year Federal Refund #2", "amountOfPrevYearFederalRefund_2");
		uiMapToServiceAttrib.put("Amount of Previous Year Federal Refund #3", "amountOfPrevYearFederalRefund_3");
		uiMapToServiceAttrib.put("Date Previous Year Federal Refund Received", "datePrevYearFederalRefundReceived");
		uiMapToServiceAttrib.put("Date Previous Year Federal Refund Received #2", "datePrevYearFederalRefundReceived_2");
		uiMapToServiceAttrib.put("Date Previous Year Federal Refund Received #3", "datePrevYearFederalRefundReceived_3");
		uiMapToServiceAttrib.put("Amount of Previous Year State Refund", "amountOfPrevYearStateRefund");
		uiMapToServiceAttrib.put("Amount of Previous Year State Refund #2", "amountOfPrevYearStateRefund_2");
		uiMapToServiceAttrib.put("Amount of Previous Year State Refund #3", "amountOfPrevYearStateRefund_3");
		uiMapToServiceAttrib.put("Date Previous Year State Refund Received", "datePrevYearStateRefundReceived");
		uiMapToServiceAttrib.put("Date Previous Year State Refund Received #2", "datePrevYearStateRefundReceived_2");
		uiMapToServiceAttrib.put("Date Previous Year State Refund Received #3", "datePrevYearStateRefundReceived_3");
		uiMapToServiceAttrib.put("Generation Skipping Trust", "generationSkippingTrust");
		uiMapToServiceAttrib.put("Generation Skipping Account Type", "generationSkippingAccountType");
		uiMapToServiceAttrib.put("Inclusion Ratio", "inclusionRatio");
		uiMapToServiceAttrib.put("Percentage Exclusion for Partial Distribution", "percExclusionPartialDistr");
		uiMapToServiceAttrib.put("Date AIT Last Posted", "dateAITLastPosted");
		uiMapToServiceAttrib.put("Accumulation Trust", "accumulationTrust");
		uiMapToServiceAttrib.put("ONESOURCE Tran History Flag Removed Date", "onesourceTranHistoryFlagRemovedDate");
		uiMapToServiceAttrib.put("ONESOURCE Tran History Period", "onesourceTranHistoryPeriod");
		uiMapToServiceAttrib.put("Exclude from NRA Withholding", "excludeFromNRAWithholding");
		uiMapToServiceAttrib.put("Date of First ROTH Contribution", "dateOfFirstROTHContribution");
		uiMapToServiceAttrib.put("Inherited IRA", "inheritedIRA");
		uiMapToServiceAttrib.put("Uni Trust Payout Amount", "uniTrustPayoutAmount");
		uiMapToServiceAttrib.put("1st State Code", "firstStateCode");
		uiMapToServiceAttrib.put("1st State Type", "firstStateType");
		uiMapToServiceAttrib.put("1st State Non Taxable", "firstStateNonTaxable");
		uiMapToServiceAttrib.put("1st NY State Resident Type", "firstNYStateResidentType");
		uiMapToServiceAttrib.put("1st NY City Resident Type", "firstNYCityResidentType");
		uiMapToServiceAttrib.put("1st Yonkers Resident Type", "firstYonkersResidentType");
		uiMapToServiceAttrib.put("2nd State Code", "secondStateCode");
		uiMapToServiceAttrib.put("2nd State Type", "secondStateType");
		uiMapToServiceAttrib.put("2nd State Non Taxable", "secondStateNonTaxable");
		uiMapToServiceAttrib.put("2nd NY State Resident Type", "secondNYStateResidentType");
		uiMapToServiceAttrib.put("2nd NY City Resident Type", "secondNYCityResidentType");
		uiMapToServiceAttrib.put("2nd Yonkers Resident Type", "secondYonkersResidentType");
		uiMapToServiceAttrib.put("Account Prepares 1041 and 990", "accountPrepares1041And990");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_HoldingsTotal() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("% of Portfolio", "percentOfTotal");		
		uiMapToServiceAttrib.put("Market Value", "marketValue");
		uiMapToServiceAttrib.put("Book Value", "bookValue");
		uiMapToServiceAttrib.put("Accrued Income", "accruedIncome");
		uiMapToServiceAttrib.put("Unrealized Gain/Loss", "unrealizedGainLoss");
		uiMapToServiceAttrib.put("Estimated Annual Income", "estimatedAnnualIncomeBase");
		uiMapToServiceAttrib.put("Federal Cost", "federalCost");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_holdingdetails() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("As of", "dateAsOf");
		uiMapToServiceAttrib.put("Market Value", "marketValueLocal");
		uiMapToServiceAttrib.put("Holding Security Description", "shortDescriptionLine1");
		uiMapToServiceAttrib.put("Unrealized Gain/Loss (Local)", "unrealizedGainLossLocal");
		uiMapToServiceAttrib.put("Equivalence Factor", "equivalenceFactor");
		uiMapToServiceAttrib.put("Federal Cost", "fedCostLocal");
		uiMapToServiceAttrib.put("Share/PV/Units", "units");
		uiMapToServiceAttrib.put("Portfolio Number", "portfolioNumber");
		uiMapToServiceAttrib.put("ISIN", "isin");
		uiMapToServiceAttrib.put("Long Title 1", "longTitleLine1");
		uiMapToServiceAttrib.put("Minor Security Code", "minorSecurityTypeNumber");
		uiMapToServiceAttrib.put("Price as of Date", "priceDated");
		uiMapToServiceAttrib.put("Security Processing Class", "securityProcessClassMeaning");
		uiMapToServiceAttrib.put("Minor Security Type", "minorSecurityTypeMeaning");
		uiMapToServiceAttrib.put("Price", "price");
		uiMapToServiceAttrib.put("Pricing Source", "priceSource");
		uiMapToServiceAttrib.put("Performance Measurement Asset Class Name", "securityAssetClassMeaning");
		uiMapToServiceAttrib.put("Security Identifier", "securityId");
		uiMapToServiceAttrib.put("Short Title 1", "shortTitleLine1");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_EntitlementDetails() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Current Units", "currentUnits");
		uiMapToServiceAttrib.put("Entitlement Date", "entitlementDate");
		uiMapToServiceAttrib.put("Registration", "registration");
		uiMapToServiceAttrib.put("Restriction", "restriction");
		uiMapToServiceAttrib.put("Location", "location");
		uiMapToServiceAttrib.put("Date of Last Change", "dateOfLastChange");
		uiMapToServiceAttrib.put("Prior Units", "priorUnits");
		uiMapToServiceAttrib.put("Units Receivable at This Location", "unitsReceivableAtThisLocation");
		uiMapToServiceAttrib.put("Units Pending Sale", "unitsPendingSale");
		uiMapToServiceAttrib.put("Income Disposition Rule", "incomeDispositionRule");
		uiMapToServiceAttrib.put("Income Receipt Calculation", "incomeReceiptCalculation");
		uiMapToServiceAttrib.put("Capital Gains Distribution", "capitalGainsDistribution");
		uiMapToServiceAttrib.put("Local Withholding Category", "localWithholdingCategory");
		uiMapToServiceAttrib.put("Percent to Reinvest", "percentToReinvest");
		uiMapToServiceAttrib.put("National Withholding Category", "nationalWithholdingCategory");
		uiMapToServiceAttrib.put("Units to be Delivered From Location", "unitsDeliveredFromLocation");
		uiMapToServiceAttrib.put("Portfolio Number", "portfolioNumber");
		uiMapToServiceAttrib.put("Date Income Starts", "dateIncomeStarts");
		uiMapToServiceAttrib.put("Nonresident Tax Withholding Category", "nonresidentTaxWithholdingCategory");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_entitlements() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Portfolio Number", "portfolioNumber");
		uiMapToServiceAttrib.put("Security Gref", "registration");
		uiMapToServiceAttrib.put("Location", "location");
		uiMapToServiceAttrib.put("Restriction", "restriction");
		uiMapToServiceAttrib.put("Registration Code Description", "registrationMeaning");
		uiMapToServiceAttrib.put("Entitlement Date", "entitlementDate");
		uiMapToServiceAttrib.put("Current Units", "currentUnits");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_ActiveTaxlots() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Portfolio Number", "portfolioNumber");
		uiMapToServiceAttrib.put("Local Currency", "currency");
		uiMapToServiceAttrib.put("Federal Acquisition Date", "federalAcquisitionDate");
		uiMapToServiceAttrib.put("Security", "securityName");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_ActiveTaxlotDetails() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Portfolio Number", "portfolioNumber");
		uiMapToServiceAttrib.put("Market Value", "marketValue");
		uiMapToServiceAttrib.put("Share/PV/Units", "sharesPvUnits");
		uiMapToServiceAttrib.put("Unrealized gain/Loss", "unrealizedGainLoss");
		uiMapToServiceAttrib.put("How Held", "howHeld");
		uiMapToServiceAttrib.put("How Acquired", "howAcquired");
		uiMapToServiceAttrib.put("Federal Accumulated Amortization", "federalAccumulatedAmort");
		uiMapToServiceAttrib.put("Federal Acquisition Date", "federalAcquisitionDate");
		uiMapToServiceAttrib.put("State Acquisition Date", "stateAcquisitionDate");
		uiMapToServiceAttrib.put("State Cost", "stateCost");
		uiMapToServiceAttrib.put("State Accumulated Amortization", "stateAccumulatedAmort");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_SecurityDetail() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Current Year Amount", "currentYearAmount");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_SecurityDetails() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Name", "name");
		uiMapToServiceAttrib.put("Price", "price");
		uiMapToServiceAttrib.put("Minor Security Type", "minorSecurityType");
		uiMapToServiceAttrib.put("Pricing Source", "pricingSource");
		uiMapToServiceAttrib.put("Security Processing Class", "securityProcessingClass");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_AccountRMDDetails() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Current Year Amount", "currentYearAmount");
		uiMapToServiceAttrib.put("Effective Date", "effectiveDate");
		uiMapToServiceAttrib.put("Current Year Market Value", "currentYearMarketValue");
		uiMapToServiceAttrib.put("First Distribution Year", "firstDistibutionYear");
		uiMapToServiceAttrib.put("Manually Computed", "manuallyComputedFlag");
		uiMapToServiceAttrib.put("First Distribution Amount", "firstDistributionAmount");
		uiMapToServiceAttrib.put("Distribution Year", "distributionYear");
		uiMapToServiceAttrib.put("Trade Basis", "tradeBasisADDV");
		uiMapToServiceAttrib.put("RMD Paid This Year", "rmdPaidThisYear");
		uiMapToServiceAttrib.put("RMD Remaining for the Year", "rmdRemainingForTheYear");
		uiMapToServiceAttrib.put("Life Expectancy Table", "lifeExpectancyTable");
		uiMapToServiceAttrib.put("Required Beginning Date", "firstDistributionBeginingDate");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_AccountRMDOwnerDetail() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Tax ID Type", "typeOfClient");
		uiMapToServiceAttrib.put("Date of Birth", "dateOfBirthOrInception");
		uiMapToServiceAttrib.put("Date of Death", "dateOfDeath");
		uiMapToServiceAttrib.put("Date Opened", "dateOpened");
		uiMapToServiceAttrib.put("Tax ID", "taxId");
		uiMapToServiceAttrib.put("Is Non Resident Alien", "isNonResidentAlien");
		uiMapToServiceAttrib.put("Spouse's Birth Date", "dateOfSpouseBirth");
		uiMapToServiceAttrib.put("Form Recipient", "formRecipient");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_AccountRMDDistributionSummary() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Tax Year", "taxYear");
		uiMapToServiceAttrib.put("Gross Amount", "grossAmount");
		uiMapToServiceAttrib.put("Net Amount", "netAmount");
		uiMapToServiceAttrib.put("Federal Tax Withheld", "fedTaxWithheld");
		uiMapToServiceAttrib.put("State Tax Withheld", "stateTaxWithheld");
		uiMapToServiceAttrib.put("Distribution Taken Year to Date Gross Amount:", "distributionTakenToDate");
		uiMapToServiceAttrib.put("Remaining Distribution to be Taken Current Year:", "remainingDistributionToCurrYear");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_AccountRMDPaymentHistoryDetail() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Adjust Internal Participant", "adjustInternalParticipant");
		uiMapToServiceAttrib.put("Posting Date", "postingDate");
		uiMapToServiceAttrib.put("Transaction Type", "transactionType");
		uiMapToServiceAttrib.put("Record Type", "recordType");
		uiMapToServiceAttrib.put("Payment Method", "paymentMethod");
		uiMapToServiceAttrib.put("Tax Filing State", "taxFilingState");
		uiMapToServiceAttrib.put("Withholding from Account", "withholdingFromAccount");
		uiMapToServiceAttrib.put("Distribution Code 1", "distributionCode1");
		uiMapToServiceAttrib.put("Record Entry Number", "recordEntryNumber");
		uiMapToServiceAttrib.put("History Add Reason", "historyAddReason");
		uiMapToServiceAttrib.put("Gross Payment Amount", "grossPaymentAmount");
		uiMapToServiceAttrib.put("Net Payment Amount", "netPaymentAmount");
		uiMapToServiceAttrib.put("Federal Taxable Amount", "federalTaxableAmount");
		uiMapToServiceAttrib.put("State Taxable Amount", "stateTaxableAmount");
		uiMapToServiceAttrib.put("Ordinary Income Amount", "ordinaryIncomeAmount");
		uiMapToServiceAttrib.put("Deductions Code 1", "deductionCode1");
		uiMapToServiceAttrib.put("Tax Form Indicator", "taxFormIndicator");
		uiMapToServiceAttrib.put("IRA/SEP/SIMPLE Distribution", "iraSepSimpleDistribution");
		uiMapToServiceAttrib.put("Total Distribution Indicator", "totalDistributionIndicator");
		uiMapToServiceAttrib.put("Designated Roth Contribution Date", "designatedRothContributionDate");
		uiMapToServiceAttrib.put("Federal Marital Status", "federalMaritalStatus");
		uiMapToServiceAttrib.put("Federal Number of Exemptions", "federalNumberOfExemptions");
		uiMapToServiceAttrib.put("Tax Method", "taxMethod");
		uiMapToServiceAttrib.put("Tax Formula Type", "taxFormulaType");
		uiMapToServiceAttrib.put("Residency Code", "residencyCode");
		uiMapToServiceAttrib.put("Tax ID (Masked)", "taxID");
		uiMapToServiceAttrib.put("State Marital Status", "stateMaritalStatus");
		uiMapToServiceAttrib.put("State Number of Exemptions", "stateNumberOfExemptions");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_AccountRMDDistributionDetail() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Date Paid", "datePaid");
		uiMapToServiceAttrib.put("Payment Method", "paymentMethod");
		uiMapToServiceAttrib.put("Tax Year", "taxYear");
		uiMapToServiceAttrib.put("Gross Amount", "grossAmount");
		uiMapToServiceAttrib.put("Net Amount", "netAmount");
		uiMapToServiceAttrib.put("Federal Tax Withheld", "fedTaxWithheld");
		uiMapToServiceAttrib.put("State Tax Withheld", "stateTaxWithheld");
		uiMapToServiceAttrib.put("IRS Distribution Type", "iraDistributionType");
		return uiMapToServiceAttrib;
	}

	public static Map<String, String> getMapping_ClientDetails() {

		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Type of Client", "typeOfNameMeaning");
		uiMapToServiceAttrib.put("Full Name", "name");
		uiMapToServiceAttrib.put("Extended Name", "nameExtension");
		uiMapToServiceAttrib.put("Title", "title");
		uiMapToServiceAttrib.put("Bank", "bankName");
		uiMapToServiceAttrib.put("Credit Rating", "creditRatingMeaning");
		uiMapToServiceAttrib.put("Credit Rating Source", "sourceCreditRatingName");
		uiMapToServiceAttrib.put("Tax ID", "taxIdMask");
		uiMapToServiceAttrib.put("TIN Status", "taxInfoStatusMeaning");
		uiMapToServiceAttrib.put("Local Tax ID", "localTaxId");
		uiMapToServiceAttrib.put("Tax Bracket", "taxBracket");
		uiMapToServiceAttrib.put("Tax Country", "cntryTaxSitusCommonName");
		uiMapToServiceAttrib.put("Tax State or Province", "stateTaxSitusName");
		uiMapToServiceAttrib.put("EIN", "einMask");
		uiMapToServiceAttrib.put("SSN", "ssnMask");
		uiMapToServiceAttrib.put("Birth Date", "dateOfBirthOrInception");
		uiMapToServiceAttrib.put("Native Language", "languageMeaning");
		uiMapToServiceAttrib.put("Occupation", "occupationMeaning");
		uiMapToServiceAttrib.put("Marital Status", "maritalStatusMeaning");
		uiMapToServiceAttrib.put("Non-Resident?", "isNonResidentAlien");
		uiMapToServiceAttrib.put("Alpha Sort", "alphaSortCode");
		uiMapToServiceAttrib.put("Date Opened", "dateOpened");
		uiMapToServiceAttrib.put("Ethnic Background", "raceMeaning");
		uiMapToServiceAttrib.put("OFAC Status", "ofacStatusMeaning");
		uiMapToServiceAttrib.put("Last Changed on", "lastUpdateDate");
		uiMapToServiceAttrib.put("Contact Type", "typeContactMeaning");
		uiMapToServiceAttrib.put("Employment Status", "primaryOccuStatusMeaning");
		uiMapToServiceAttrib.put("Contact Branch", "branchName");
		uiMapToServiceAttrib.put("Client GREF", "clientGref");
		uiMapToServiceAttrib.put("Statements Delivery Method", "deliveryMethodMeaning");
		uiMapToServiceAttrib.put("Quick Reference", "quickRefernece");
		uiMapToServiceAttrib.put("City", "addressCity");
		uiMapToServiceAttrib.put("Country Name", "addressCountry");
		uiMapToServiceAttrib.put("State Name", "addressStateName");
		uiMapToServiceAttrib.put("Zip Code", "addressZipCode");
		uiMapToServiceAttrib.put("Cell Phone", "cellPhone");
		uiMapToServiceAttrib.put("Home Email", "homeEmail");
		uiMapToServiceAttrib.put("Home Fax Phone", "homeFaxPhone");
		uiMapToServiceAttrib.put("Number of Alternate Addresses", "numberOfAlternateAddresses");
		uiMapToServiceAttrib.put("Office Email", "officeEmail");
		uiMapToServiceAttrib.put("Office Phone", "officePhone");
		return uiMapToServiceAttrib;
	}

	public static Map<String, String> getMapping_Notifications() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Type", "type");
		uiMapToServiceAttrib.put("Start Date", "startDateTime");
		uiMapToServiceAttrib.put("Created/Modified By", "createdModifiedBy");
		uiMapToServiceAttrib.put("End Date", "endDateTime");
		uiMapToServiceAttrib.put("Created/Modified Date", "createdModifiedDateTime");
		return uiMapToServiceAttrib;
	}

	public static Map<String, String> getMapping_accountRMDRelationships() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Retirement Beneficiary", "shortName");
		uiMapToServiceAttrib.put("Relationship with Account Owner", "iraBeneficiaryMeaning");
		uiMapToServiceAttrib.put("SSN/SIN", "socialSecurityNumber");
		return uiMapToServiceAttrib;
	}

	public static Map<String, String> getMapping_Top10Widgets() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Account Name", "entityName");
		uiMapToServiceAttrib.put("Client Name", "entityName");
		uiMapToServiceAttrib.put("Cash Value", "cashValueTradeDtBase");
		uiMapToServiceAttrib.put("Market Value (base)", "marketValueTradeDtBase");
		return uiMapToServiceAttrib;
	}

	public static Map<String, String> getMapping_Accounts() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Number", "entityIdNumber");
		uiMapToServiceAttrib.put("Base Currency", "baseCurrency");
		uiMapToServiceAttrib.put("Name", "entityName");
		uiMapToServiceAttrib.put("Cash Value", "cashValueTradeDtDatabase");
		uiMapToServiceAttrib.put("Market Value", "marketValueTradeDtBase");
		uiMapToServiceAttrib.put("Total Cash & Equivalents", "cashEquivalentDatabase");
		uiMapToServiceAttrib.put("% of Market Value in Cash", "cashEquivalentTradeMktValPercent");
		uiMapToServiceAttrib.put("Amount Overdrawn", "availableCash");
		uiMapToServiceAttrib.put("Date", "postedDate");
		uiMapToServiceAttrib.put("Amount", "ledgerCashTradeLocal");
		uiMapToServiceAttrib.put("Expected Close Date", "expectedCloseDate");
		return uiMapToServiceAttrib;
	}

	public static Map<String, String> getMapping_Affiliatees() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Affiliation Type", "affiliationTypeMeaning");
		uiMapToServiceAttrib.put("Relationship Name", "affiliateeName");
		return uiMapToServiceAttrib;
	}

	public static Map<String, String> getMapping_Banks() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Name", "name");
		return uiMapToServiceAttrib;
	}

	public static Map<String, String> getMapping_Branches() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Bank Name", "bankName");
		uiMapToServiceAttrib.put("Branch Name", "branchName");
		return uiMapToServiceAttrib;
	}

	public static Map<String, String> getMapping_AccountHeader() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Total Market Value", "marketValueTradeDtBase");
		uiMapToServiceAttrib.put("YTD Fee Revenue", "ytdRevenueBase");
		uiMapToServiceAttrib.put("Year to Date Net Flows Base", "ytdNetFlowsBase");
		uiMapToServiceAttrib.put("Cash Value", "cashValueTradeDtBase");
		uiMapToServiceAttrib.put("Net Annualized Return", "netAnnualizedReturn");
		return uiMapToServiceAttrib;
	}
	
	public static Map<String, String> getMapping_AccountGroupHeader() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Total Market Value", "marketValueTradeDtBase");
		uiMapToServiceAttrib.put("Cash Value", "cashValueTradeDtBase");
		return uiMapToServiceAttrib;
	}

	public static Map<String, String> getMapping_CashProjectionHeader() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Institution Name", "institutionName");
		uiMapToServiceAttrib.put("Administrative Officer", "administrativeOfficer");
		uiMapToServiceAttrib.put("Investment Officer", "investmentOfficer");
		uiMapToServiceAttrib.put("Investment Authority", "investmentAuthority");
		uiMapToServiceAttrib.put("Investment Objective", "investmentObjective");
		return uiMapToServiceAttrib;
	}

	public static Map<String, String> getMapping_AccountDetails() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Account Number", "entityIdNumber");
		uiMapToServiceAttrib.put("Name", "entityName");
		uiMapToServiceAttrib.put("Opened Date", "openedDate");
		uiMapToServiceAttrib.put("Account Type", "accountTypeMeaning");
		uiMapToServiceAttrib.put("Account Sub-type", "accountSubType");
		uiMapToServiceAttrib.put("Total Market Value", "marketValue");
		uiMapToServiceAttrib.put("YTD Revenue", "feesYearToDate");
		uiMapToServiceAttrib.put("YTD Net Flows", "itfaPreviousMarketValue");
		uiMapToServiceAttrib.put("Investment Officer", "investmentOfficer");
		uiMapToServiceAttrib.put("Branch", "branchMeaning");
		uiMapToServiceAttrib.put("Region", "regionMeaning");
		uiMapToServiceAttrib.put("Capacity", "capacityMeaning");
		uiMapToServiceAttrib.put("Long Name", "longName");
		uiMapToServiceAttrib.put("Last Fiscal Year", "lastFiscalYear");
		uiMapToServiceAttrib.put("Next Fiscal Year", "nextFiscalYear");
		uiMapToServiceAttrib.put("Date of Agreement", "dateOfAgreement");
		uiMapToServiceAttrib.put("Division", "divisionMeaning");
		uiMapToServiceAttrib.put("Bank", "bankMeaning");
		uiMapToServiceAttrib.put("Source of Business", "sourceOfBusinessMeaning");
		uiMapToServiceAttrib.put("Acquired By", "acquiredBy");
		uiMapToServiceAttrib.put("How Held", "howHeld");
		uiMapToServiceAttrib.put("Social Code", "socialCodeMeaning");
		uiMapToServiceAttrib.put("Legal Name", "legalName");
		uiMapToServiceAttrib.put("Overdraft Netting Rule", "overdraftNettingRuleMeaning");
		uiMapToServiceAttrib.put("Revocable Status", "revocableStatusMeaning");
		uiMapToServiceAttrib.put("Cash in Lieu Rule", "ruleCashInLieuMeaning");
		uiMapToServiceAttrib.put("Return of Capital Rule", "ruleCapitalMeaning");
		uiMapToServiceAttrib.put("Small Stock Dividend Rule", "ruleSmallStockDivMeaning");
		uiMapToServiceAttrib.put("Date of Fee Agreement", "dateOfFeeAgreement");
		uiMapToServiceAttrib.put("Fee Agreement Type", "feeAgreementTypeMeaning");
		uiMapToServiceAttrib.put("Date of Appointment", "dateOfAppointment");
		uiMapToServiceAttrib.put("Events", "events");
		uiMapToServiceAttrib.put("Reminders", "reminders");
		uiMapToServiceAttrib.put("Account Open Date", "openedDate");
		uiMapToServiceAttrib.put("Administrative Officer", "administrator");
		uiMapToServiceAttrib.put("Investment Officer", "investmentOfficer");
		uiMapToServiceAttrib.put("Branch Code", "branchMeaning");
		uiMapToServiceAttrib.put("Account Long Title", "entityName");
		uiMapToServiceAttrib.put("YTD Gain Loss ST", "realizedLoss");
		uiMapToServiceAttrib.put("YTD Gain Loss LT", "totalYTDGain");
		uiMapToServiceAttrib.put("Tax Short Title", "entityName");
		return uiMapToServiceAttrib;
	}

	public static Map<String, String> getMapping_AccountDatedDetails() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Effective Date", "effectiveDate");
		uiMapToServiceAttrib.put("Country Tax Situs Iso", "countryTaxSitusIso");
		uiMapToServiceAttrib.put("State Tax Situs", "stateTaxSitusMeaning");
		return uiMapToServiceAttrib;
	}

	public static Map<String, String> getMapping_Holdings() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Security Description", "securityDescription");
		uiMapToServiceAttrib.put("Units", "units");
		uiMapToServiceAttrib.put("Security Identifier", "securityIdentifier");
		uiMapToServiceAttrib.put("Federal Cost (Base)", "federalCost");
		uiMapToServiceAttrib.put("Minor Security", "minorSecurityMeaning");
		uiMapToServiceAttrib.put("Major Security Code", "majorSecurityCodeMeaning");
		uiMapToServiceAttrib.put("Portfolio Number", "portfolioNumber");
		uiMapToServiceAttrib.put("Percent", "percentOfTotal");
		return uiMapToServiceAttrib;
	}

	public static Map<String, String> getMapping_AssetAllocation() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Category Name", "categoryName");
		uiMapToServiceAttrib.put("Market Value", "marketValueTradeDtBase");
		return uiMapToServiceAttrib;
	}

	public static Map<String, String> getMapping_AccountCashDetails() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Portfolio Number", "portfolioNumber");
		uiMapToServiceAttrib.put("Portfolio Name", "portfolioName");
		uiMapToServiceAttrib.put("Local Currency ISO", "localCurrencyIso");
		uiMapToServiceAttrib.put("Uninvested", "availableCash");
		uiMapToServiceAttrib.put("Invested", "sweep");
		uiMapToServiceAttrib.put("Total", "total");
		uiMapToServiceAttrib.put("Account Number", "accountNumber");
		return uiMapToServiceAttrib;
	}

	public static Map<String, String> getMapping_PortfolioInformation() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Portfolio Name", "portfolioName");
		uiMapToServiceAttrib.put("Portfolio Number", "portfolioNumber");
		uiMapToServiceAttrib.put("Local Currency", "localCurrencyIso");
		uiMapToServiceAttrib.put("Base Currency", "baseCurrency");
		uiMapToServiceAttrib.put("Market Value (base)", "marketValueTradeDtBase");
		uiMapToServiceAttrib.put("Market Value (local)", "marketValueTradeDtLocal");
		uiMapToServiceAttrib.put("Status", "status");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_PortfolioSearch() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Account Number", "accountNumber");
		uiMapToServiceAttrib.put("Base Currency", "baseCurrency");
		uiMapToServiceAttrib.put("Portfolio Currency", "portfolioCurrency");
		uiMapToServiceAttrib.put("Portfolio Name", "portfolioName");
		uiMapToServiceAttrib.put("Portfolio Number", "portfolioNumber");
		uiMapToServiceAttrib.put("Account Number", "accountNumber");
		uiMapToServiceAttrib.put("Base Currency", "baseCurrency");
		uiMapToServiceAttrib.put("Portfolio Currency", "portfolioCurrency");
		uiMapToServiceAttrib.put("Portfolio Name", "portfolioName");
		uiMapToServiceAttrib.put("Portfolio Number", "portfolioNumber");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_Events() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Event Type", "eventTypeDescription");
		uiMapToServiceAttrib.put("Portfolio Number", "portfolioNumberOwner");
		uiMapToServiceAttrib.put("Next Scheduled Execution", "dateNext");
		uiMapToServiceAttrib.put("Frequency", "frequency");
		uiMapToServiceAttrib.put("Portfolio Name", "portfolioNameOwner");
		uiMapToServiceAttrib.put("Event Name", "eventName");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_FeeEventParticipantDetail() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Participant Number", "participantNumber");
		uiMapToServiceAttrib.put("Description Code", "descCodeMean");
		uiMapToServiceAttrib.put("Event Allocation Method", "feeAllocationMethodMeaning");
		uiMapToServiceAttrib.put("Collection Method", "feeCollMethodMean");
		uiMapToServiceAttrib.put("Sharing Responsibility Center", "sharngRespnsbltyCntrMng");
		uiMapToServiceAttrib.put("Responsibility Center", "respCenterMean");
		uiMapToServiceAttrib.put("Sharing Responsibility Center Percent", "sharngRespnsbltyCntrPctg");
		uiMapToServiceAttrib.put("Fee Allocation Method Code", "feeAllocationMethodCode");
		uiMapToServiceAttrib.put("Fee Coll Method Code", "feeCollMethodCode");
		uiMapToServiceAttrib.put("Responsibility Center Abbreviation", "respCenterAbbr");
		uiMapToServiceAttrib.put("Responsibility Center Code", "respCenterCode");
		uiMapToServiceAttrib.put("Sharing Responsibility Control Abbrv", "sharngRespnsbltyCntrAbbrv");
		uiMapToServiceAttrib.put("Sharing Responsibility Control Number", "sharngRespnsbltyCntrNmbr");
		return uiMapToServiceAttrib;
	}

	public static Map<String, String> getMapping_EventPayees() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Advanced Payment Amount", "advancePayment");
		uiMapToServiceAttrib.put("Combine Payments", "combinePayments");
		uiMapToServiceAttrib.put("Fixed Amount", "fixedAmount");
		uiMapToServiceAttrib.put("Maximum Amount", "maximumAmount");
		uiMapToServiceAttrib.put("Pay for Name", "payForName");
		uiMapToServiceAttrib.put("Pay to Name", "payToName");
		uiMapToServiceAttrib.put("Payment Method", "paymentMethodMeaning");
		uiMapToServiceAttrib.put("Percentage", "percentage");
		uiMapToServiceAttrib.put("Report Destination Meaning", "reportDestinationMeaning");
		return uiMapToServiceAttrib;
	}

	public static Map<String, String> getMapping_PortfolioDetails() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Income Default Rule", "incomeDefaultRuleMeaning");
		uiMapToServiceAttrib.put("Ledger Balance", "ledgerBalance");
		uiMapToServiceAttrib.put("Maturity Default Rule", "maturityDefaultRuleMeaning");
		uiMapToServiceAttrib.put("Override Availability Rule", "overrideAvailabilityRuleMeaning");
		uiMapToServiceAttrib.put("Capacity", "capacityMeaning");
		uiMapToServiceAttrib.put("Responsibility Center", "responsibilityCenterMeaning");
		uiMapToServiceAttrib.put("Shared Responsibility Center", "sharedResponsibilityCenterMeaning");
		uiMapToServiceAttrib.put("Shared Responsibility Percent", "sharedResponsibilityPercent");
		uiMapToServiceAttrib.put("Portfolio to Credit Income", "portToCreditIncomeName");
		uiMapToServiceAttrib.put("Preferred Income Disposition Method", "prefIncomeDispMethodMeaning");
		uiMapToServiceAttrib.put("Ami Strategy", "amiStrategyMeaning");
		uiMapToServiceAttrib.put("Broker Confirm Rule", "brokerConfirmRuleMeaning");
		uiMapToServiceAttrib.put("Commingled Trust Fund Rule", "commingledTrustFundRuleMeaning");
		uiMapToServiceAttrib.put("Fractional Share Rule", "fractionalShareRuleMeaning");
		uiMapToServiceAttrib.put("Investment Authority", "investmentAuthorityMeaning");
		uiMapToServiceAttrib.put("Investment Objective", "investmentObjectiveMeaning");
		uiMapToServiceAttrib.put("Mutual Fund Lot Sale Method", "mutualFundLotSaleMethodMeaning");
		uiMapToServiceAttrib.put("PM Strategy", "pmStrategyMeaning");
		uiMapToServiceAttrib.put("Positions Allowed Per Security", "posAllowedPerSecurityMeaning");
		uiMapToServiceAttrib.put("Prefer Taxlot Sale Method", "preferTaxlotSaleMethodMeaning");
		uiMapToServiceAttrib.put("Rate of Return Objective", "rateOfReturnObjective");
		uiMapToServiceAttrib.put("Risk Level", "riskLevelMeaning");
		uiMapToServiceAttrib.put("Trade Approval Rule", "tradeApprovalRuleMeaning");
		uiMapToServiceAttrib.put("Voting Authority", "votingAuthorityMeaning");
		uiMapToServiceAttrib.put("Portfolio Number", "portfolioNumber");
		uiMapToServiceAttrib.put("Portfolio Name", "portfolioName");
		uiMapToServiceAttrib.put("Date Opened", "dateOpened");
		uiMapToServiceAttrib.put("Status", "status");
		uiMapToServiceAttrib.put("Gross to Net Proof", "grossToNetProof");
		uiMapToServiceAttrib.put("Depository", "depositoryMeaning");
		uiMapToServiceAttrib.put("Powers on Hand", "powersOnHand");
		uiMapToServiceAttrib.put("Registration", "registrationMeaning");
		uiMapToServiceAttrib.put("Registration Class", "registrationClassMeaning");
		uiMapToServiceAttrib.put("Storage Location", "storageLocationMeaning");
		uiMapToServiceAttrib.put("Initial Position Default Tax Amortization", "initialPosDefaltTaxAmortMeaning");
		uiMapToServiceAttrib.put("Non Resident Discount Rate", "nonResidentDiscountRate");
		uiMapToServiceAttrib.put("Tax Amortization Calculation Rule", "taxAmortCalculationRuleMeaning");
		uiMapToServiceAttrib.put("Tax Situs", "taxSitusMeaning");
		uiMapToServiceAttrib.put("Current Sweep Strategy", "sweepStrategyMeaning");
		uiMapToServiceAttrib.put("Strategy Last Sweep", "proposedSweepStrategyMeaning");
		uiMapToServiceAttrib.put("Alternate id", "alternateId");
		uiMapToServiceAttrib.put("Security Activity?", "securityActivity");
		uiMapToServiceAttrib.put("Security Lending?", "securityLending");
		uiMapToServiceAttrib.put("Memo Post Cash", "memoPostCash");
		uiMapToServiceAttrib.put("Theoretically Settle Buys?", "theoSettleBuys");
		uiMapToServiceAttrib.put("Theoretically Settle Sales?", "theoSettleSales");
		uiMapToServiceAttrib.put("Amortize Bond Discounts for Tax", "amortBondDiscountsForTax");
		uiMapToServiceAttrib.put("Amortize Bond Premium for Tax", "amortBondPremiumsForTax");
		uiMapToServiceAttrib.put("Portfolio Managed", "portfolioManaged");
		uiMapToServiceAttrib.put("Allow Block Trades", "allowBlockTrades");
		uiMapToServiceAttrib.put("Allow Sweep", "allowSweep");
		uiMapToServiceAttrib.put("Net Idle Cash / Overdraft Transaction", "netIdleCashOdTxns");
		uiMapToServiceAttrib.put("Income Days Post Available", "incomeDaysPostAvailableMeaning");
		uiMapToServiceAttrib.put("Income Days Post Ledger", "incomeDaysPostLedgerMeaning");
		uiMapToServiceAttrib.put("Maturity Days Post Available", "maturityDaysPostAvailableMeaning");
		uiMapToServiceAttrib.put("Maturity Days Post Ledger", "maturityDaysPostLedgerMeaning");
		uiMapToServiceAttrib.put("Allow Income Disbursements", "allowIncomeDisbursements");
		uiMapToServiceAttrib.put("Allow Income Payout", "allowIncomePayout");
		uiMapToServiceAttrib.put("Allow Total Reinvestment", "allowTotalReinvestment");
		uiMapToServiceAttrib.put("Allow Whole Share Reinvestment", "allowWholeShareReinvestment");
		uiMapToServiceAttrib.put("Allow Short Sales", "allowShortSales");
		uiMapToServiceAttrib.put("Keep Federal Cost", "keepFederalCost");
		uiMapToServiceAttrib.put("Keep State Cost", "keepStateCost");
		uiMapToServiceAttrib.put("Maintain Tax Lots", "maintainTaxLots");
		uiMapToServiceAttrib.put("Auto Backdate Late Trades", "autoBackdateLateTrades");
		uiMapToServiceAttrib.put("Theoretically Settle Maturities?", "theoSettleMaturities");
		uiMapToServiceAttrib.put("Treat Invest Restrict as Error", "treatInvestRestrictAsError");
		uiMapToServiceAttrib.put("Transaction for Open Order Changes", "txnForOpenOrderChanges");
		uiMapToServiceAttrib.put("Do Realignment", "doRealignment");
		uiMapToServiceAttrib.put("Security Activity", "securityActivity");
		uiMapToServiceAttrib.put("Security Lending", "securityLending");
		return uiMapToServiceAttrib;
	}

	public static Map<String, String> getMapping_AccountInformation() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Account/ID Number ", "entityIdNumber");
		uiMapToServiceAttrib.put("Name ", "entityName");
		uiMapToServiceAttrib.put("Opened Date ", "openedDate");
		uiMapToServiceAttrib.put("Base Currency ", "baseCurrency");
		uiMapToServiceAttrib.put("Account Type ", "accountType");
		uiMapToServiceAttrib.put("Last Fiscal Year ", "lastFiscalYear");
		uiMapToServiceAttrib.put("Last Investment Review ", "lastInvestmentReview");
		uiMapToServiceAttrib.put("Last Administrative Review ", "lastAdministrativeReview");
		uiMapToServiceAttrib.put("Next Fiscal Year ", "nextFiscalYear");
		uiMapToServiceAttrib.put("Date of Agreement ", "dateOfAgreement");
		uiMapToServiceAttrib.put("Date of Appointment ", "dateOfAppointment");
		uiMapToServiceAttrib.put("Status ", "status");
		uiMapToServiceAttrib.put("Division ", "divisionMeaning");
		uiMapToServiceAttrib.put("Region ", "regionMeaning");
		uiMapToServiceAttrib.put("Bank ", "bankMeaning");
		uiMapToServiceAttrib.put("Branch ", "branchMeaning");
		uiMapToServiceAttrib.put("Acquired By ", "acquiredBy");
		uiMapToServiceAttrib.put("Federal Tax Payment Method ", "federalTaxPaymentMethod");
		uiMapToServiceAttrib.put("Fee Agreement Type ", "feeAgreementTypeMeaning");
		uiMapToServiceAttrib.put("Date of Fee Agreement Expiration ", "");
		uiMapToServiceAttrib.put("Date of Fee Agreement ", "dateOfFeeAgreement");
		uiMapToServiceAttrib.put("Anticipated Market Value at Open ", "marketValueAtOpen");
		uiMapToServiceAttrib.put("Legal Name ", "legalName");
		uiMapToServiceAttrib.put("Long Name ", "longName");
		uiMapToServiceAttrib.put("Realized Gain/Loss ", "realizedGainLoss");
		uiMapToServiceAttrib.put("Fees Year to Date ", "feesYearToDate");
		uiMapToServiceAttrib.put("Market Value (base) ", "marketValue");
		uiMapToServiceAttrib.put("How Held ", "howHeld");
		uiMapToServiceAttrib.put("Capacity ", "capacityMeaning");
		uiMapToServiceAttrib.put("Overdraft Netting Rule ", "overdraftNettingRuleMeaning");
		uiMapToServiceAttrib.put("Events ", "events");
		uiMapToServiceAttrib.put("Reminders ", "reminders");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_OpenOrders() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Order Number", "orderNumber");
		uiMapToServiceAttrib.put("Security Identifier", "securityIdentifier");
		uiMapToServiceAttrib.put("Portfolio Number", "portfolioNumber");
		uiMapToServiceAttrib.put("Action", "action");
		uiMapToServiceAttrib.put("Type", "orderType");
		return uiMapToServiceAttrib;
	}

	public static Map<String, String> getMapping_ClientContacts() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Information", "contactInfo");
		uiMapToServiceAttrib.put("Contact Type Abbreviation", "contactTypeAbbrev");
		uiMapToServiceAttrib.put("Contact Type Code", "contactTypeCode");
		uiMapToServiceAttrib.put("Description", "contactTypeMeaning");
		return uiMapToServiceAttrib;
	}

	public static Map<String, String> getMapping_ClientAddresses() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("City", "city");
		uiMapToServiceAttrib.put("Name", "name");
		uiMapToServiceAttrib.put("Postal Code", "postalCode");
		uiMapToServiceAttrib.put("State Number", "stateNumber");
		uiMapToServiceAttrib.put("Phone", "phone");
		uiMapToServiceAttrib.put("Mailing Info", "mailingInfo");
		uiMapToServiceAttrib.put("Extended Name", "extendedName");
		uiMapToServiceAttrib.put("Country", "countryMeaning");
		uiMapToServiceAttrib.put("Building Name", "buildingName");
		uiMapToServiceAttrib.put("Apartment Number", "apartmentNumber");
		uiMapToServiceAttrib.put("Street Number", "streetNumber");
		uiMapToServiceAttrib.put("Street Name", "streetName");
		uiMapToServiceAttrib.put("Address Purpose", "addressPurposeMeaning");
		return uiMapToServiceAttrib;
	}

	public static Map<String, String> getMapping_OwnedAccounts() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Account Name", "accountShortName");
		uiMapToServiceAttrib.put("Account Number", "accountNumber");
		uiMapToServiceAttrib.put("Administrator", "administrator");
		uiMapToServiceAttrib.put("Investment Officer", "investmentOfficer");
		uiMapToServiceAttrib.put("Base Currency", "baseCurrency");
		uiMapToServiceAttrib.put("Owner Name", "ownerName");
		uiMapToServiceAttrib.put("Market Value (Base)", "marketValueTradeDtBase");
		return uiMapToServiceAttrib;
	}

	public static Map<String, String> getMapping_Memos() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Event Number", "eventNumber");
		uiMapToServiceAttrib.put("Memo Text", "memoText");
		uiMapToServiceAttrib.put("Associated Entity Type", "associatedEntityType");
		uiMapToServiceAttrib.put("Associated Number", "associatedEntityNumber");
		uiMapToServiceAttrib.put("Associated Entity Name", "associatedEntityName");
		uiMapToServiceAttrib.put("Next Scheduled Execution", "dateNext");
		//uiMapToServiceAttrib.put("Event Type", "eventTypeDescription");
		uiMapToServiceAttrib.put("Frequency", "frequency");
		uiMapToServiceAttrib.put("Requires Acknowledgement", "requireAck");
		uiMapToServiceAttrib.put("Responsible Employee", "responsibleEmployee");
		return uiMapToServiceAttrib;
	}

	public static Map<String, String> getMapping_ActivityHistory() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Date Settled ", "dateSettled");
		uiMapToServiceAttrib.put("Date Traded", "dateTraded");
		uiMapToServiceAttrib.put("Ledger Cash (Local)", "ledgerCash");
		uiMapToServiceAttrib.put("Posting Date", "postingDate");
		uiMapToServiceAttrib.put("Reporting Date", "reportingDate");
		uiMapToServiceAttrib.put("Transaction Description", "transactionDescription");
		uiMapToServiceAttrib.put("Ledger Cash (Base)", "ledgerCash");
		uiMapToServiceAttrib.put("Portfolio Name", "portfolioName");
		uiMapToServiceAttrib.put("Security Description", "securityDescription");
		return uiMapToServiceAttrib;
	}

	public static Map<String, String> getMapping_PendingFree() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Ref gref", "freeGref");
		uiMapToServiceAttrib.put("Portfolio Number", "portfolioNumber");
		uiMapToServiceAttrib.put("Portfolio Name", "portfolioName");
		uiMapToServiceAttrib.put("Action", "action");
		uiMapToServiceAttrib.put("Quantity", "quantity");
		uiMapToServiceAttrib.put("Security ID", "symbolAbbrev");
		uiMapToServiceAttrib.put("Security Description", "symbolDescription");
		uiMapToServiceAttrib.put("Entitlement Date", "entitlementDate");
		uiMapToServiceAttrib.put("Settlement Date", "setlementDate");
		return uiMapToServiceAttrib;
	}

	public static Map<String, String> getMapping_PendingFreeDetail() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Free Reference Number", "freeGref");
		uiMapToServiceAttrib.put("Entitlement Date", "entitlementDate");
		uiMapToServiceAttrib.put("Action", "action");
		uiMapToServiceAttrib.put("Primary Broker", "primaryBrokerOffice");
		uiMapToServiceAttrib.put("Units", "quantity");
		uiMapToServiceAttrib.put("Disposal Method", "disposalMethodAbbrev");
		uiMapToServiceAttrib.put("Security ID", "symbolAbbrev");
		uiMapToServiceAttrib.put("Security Name", "symbolDescription");
		uiMapToServiceAttrib.put("Settlement Date", "setlementDate");
		uiMapToServiceAttrib.put("Clearing Broker", "clearingBrokerOffice");
		uiMapToServiceAttrib.put("Disposal Market Value", "disposalMarketValue");
		uiMapToServiceAttrib.put("Cost for Tax Purposes", "bookValue");
		uiMapToServiceAttrib.put("Quantity", "quantity");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_CashProjectionSummary() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Date", "projectionDate");
		uiMapToServiceAttrib.put("Cash Increase", "cashIncrease");
		uiMapToServiceAttrib.put("Cash Decrease", "cashDecrease");
		uiMapToServiceAttrib.put("Net Change", "netChange");
		uiMapToServiceAttrib.put("Daily Balance", "dailyBalance");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_CashProjectionSummaryTotal() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Cash Increase", "cashIncrease");
		uiMapToServiceAttrib.put("Cash Decrease", "cashDecrease");
		uiMapToServiceAttrib.put("Net Change", "netChange");
		return uiMapToServiceAttrib;
	}

	public static Map<String, String> getMapping_PostedTransactions() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Date Settled ", "dateSettled");
		uiMapToServiceAttrib.put("Date Traded", "dateTraded");
		uiMapToServiceAttrib.put("Date Posted", "postingDate");
		uiMapToServiceAttrib.put("Date Reported", "reportingDate");
		uiMapToServiceAttrib.put("Transaction Description", "transactionDescription");
		uiMapToServiceAttrib.put("Portfolio Name", "portfolioName");
		uiMapToServiceAttrib.put("Security Description", "securityDescription");
		uiMapToServiceAttrib.put("Transaction Type Code", "transactionTypeCode");
		uiMapToServiceAttrib.put("Transaction Type", "transactionType");
		uiMapToServiceAttrib.put("Transaction Abbreviation", "txnDescAbrv");
		uiMapToServiceAttrib.put("Transaction Security/Client", "clientName");
		uiMapToServiceAttrib.put("Transaction Created By", "transactionCreatedBy");
		uiMapToServiceAttrib.put("Tax Description", "taxDescription");
		uiMapToServiceAttrib.put("Tax Code", "taxCode");
		uiMapToServiceAttrib.put("Sequence No", "sequenceNo");
		uiMapToServiceAttrib.put("Receivable Payable Cash", "receivablePayableCash");
		uiMapToServiceAttrib.put("Portfolio Number", "portfolioNumber");
		uiMapToServiceAttrib.put("Explanation", "explanation");
		uiMapToServiceAttrib.put("Local Currency", "currencyCode");
		uiMapToServiceAttrib.put("Client Name", "clientName");
		uiMapToServiceAttrib.put("Base Currency", "baseCurrency");
		return uiMapToServiceAttrib;
	}

	public static Map<String, String> getMapping_PostedTransactionCategories() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Ledger Cash (Base)", "baseLedgerCash");
		uiMapToServiceAttrib.put("Portfolio Name", "portfolioName");
		uiMapToServiceAttrib.put("Date Traded", "dateTraded");
		uiMapToServiceAttrib.put("Transaction Description", "transactionDescription");
		uiMapToServiceAttrib.put("Portfolio Number", "portfolioNumber");
		uiMapToServiceAttrib.put("Date Settled", "dateSettled");
		uiMapToServiceAttrib.put("Reporting Date", "reportingDate");
		uiMapToServiceAttrib.put("Ledger Cash (Local)", "ledgerCash");
		uiMapToServiceAttrib.put("Posting Date", "postingDate");
		return uiMapToServiceAttrib;
	}

	public static Map<String, String> getMapping_ActivityPendingOrders() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Order Number", "orderNumber");
		uiMapToServiceAttrib.put("Security Identifier", "securityIdentifier");
		uiMapToServiceAttrib.put("Portfolio Number", "portfolioNumber");
		uiMapToServiceAttrib.put("Action", "action");
		uiMapToServiceAttrib.put("Type", "orderType");
		uiMapToServiceAttrib.put("Cash Currency (ISO)", "cashCurrencyIso");
		uiMapToServiceAttrib.put("Security Gref", "securityGref");
		uiMapToServiceAttrib.put("Symbol ID", "symbolId");
		return uiMapToServiceAttrib;
	}

	public static Map<String, String> getMapping_TaxCodeDetails() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Tax Code", "taxCodeNumber");
		uiMapToServiceAttrib.put("Tax Treatment Abrv", "taxTreatmentAbrv");
		uiMapToServiceAttrib.put("Tax Treatment", "taxTreatmentMeaning");
		uiMapToServiceAttrib.put("Exchange Rate", "exchangeRate");
		uiMapToServiceAttrib.put("Tax Amount (Local)", "taxAmount");
		uiMapToServiceAttrib.put("Tax Amount (Base)", "taxAmountInBase");
		uiMapToServiceAttrib.put("Tax Year", "taxYear");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_AccountGainLoss() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Realized Gain/Loss", "realizedGainLoss");
		uiMapToServiceAttrib.put("Proceeds", "proceeds");
		uiMapToServiceAttrib.put("Fed Cost", "cost");
		uiMapToServiceAttrib.put("Share/PV/Units", "units");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_AccountHistoricalMktValSummary() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Last Updated By", "lastUpdatedBy");
		uiMapToServiceAttrib.put("Total Market Value", "totalMarketValue");
		uiMapToServiceAttrib.put("Market Value", "marketValue");
		uiMapToServiceAttrib.put("Accrual", "accrual");
		uiMapToServiceAttrib.put("Last Updated", "lastUpdated");
		uiMapToServiceAttrib.put("Market Value Date", "marketValueDate");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_PortfolioAlternateId() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Location", "locationAbrv");
		uiMapToServiceAttrib.put("External Identifier", "externalPtId");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_PortfolioSafeKeeping() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Location", "loctionMng");
		uiMapToServiceAttrib.put("Cash Safekeeping Alias", "cashSafeKeepingAlias");
		uiMapToServiceAttrib.put("Cash Safekeeping Name", "cashSafeKeepingName");
		uiMapToServiceAttrib.put("Cash Safekeeping Account", "cashSafeKeepingAcc");
		uiMapToServiceAttrib.put("Units Safekeeping Alias", "unitSafeKeepingAlias");
		uiMapToServiceAttrib.put("Units Safekeeping Name", "unitSafeKeepingName");
		uiMapToServiceAttrib.put("Units Safekeeping Account", "unitSafeKeepingAcc");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_PerformanceHistorical() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Number", "entityNumber");
		uiMapToServiceAttrib.put("Name", "entityName");
		uiMapToServiceAttrib.put("Account Type Indicator", "sectorBenchmarkFlag");
		uiMapToServiceAttrib.put("Segment", "sectorName");
		uiMapToServiceAttrib.put("Account Type Label (Sector ID)", "sectorCode");
		uiMapToServiceAttrib.put("Net Flows", "netFlows");
		uiMapToServiceAttrib.put("Outflows", "negativeFlows");
		uiMapToServiceAttrib.put("Inflows", "positiveFlows");
		uiMapToServiceAttrib.put("Prelim/Final", "statusMeaning");
		uiMapToServiceAttrib.put("6  Months", "month6Return");
		uiMapToServiceAttrib.put("Y T D", "yearToDateReturn");
		uiMapToServiceAttrib.put("1 Day", "day1Return");
		uiMapToServiceAttrib.put("Country", "country");
		uiMapToServiceAttrib.put("M T D", "monthToDateReturn");
		uiMapToServiceAttrib.put("Q T D", "currentQuarterReturn");
		uiMapToServiceAttrib.put("1  Month", "month1Return");
		uiMapToServiceAttrib.put("2  Months", "month2Return");
		uiMapToServiceAttrib.put("3  Months", "month3Return");
		uiMapToServiceAttrib.put("4  Months", "month4Return");
		uiMapToServiceAttrib.put("5  Months", "month5Return");
		uiMapToServiceAttrib.put("Lifetime", "inceptionToDateAnnualized");
		uiMapToServiceAttrib.put("7  Months", "month7Return");
		uiMapToServiceAttrib.put("8  Months", "month8Return");
		uiMapToServiceAttrib.put("9  Months", "month9Return");
		uiMapToServiceAttrib.put("10  Months", "month10Return");
		uiMapToServiceAttrib.put("11  Months", "month11Return");
		uiMapToServiceAttrib.put("1  Year", "month12Return");
		uiMapToServiceAttrib.put("2  Years", "unannualized24MonthReturn");
		uiMapToServiceAttrib.put("2  Years Cumulative", "annualized24MonthReturn");
		uiMapToServiceAttrib.put("3  Years", "unannualized36MonthReturn");
		uiMapToServiceAttrib.put("3  Years Cumulative", "annualized36MonthReturn");
		uiMapToServiceAttrib.put("4  Years", "unannualized48MonthReturn");
		uiMapToServiceAttrib.put("4  Years Cumulative", "annualized48MonthReturn");
		uiMapToServiceAttrib.put("5  Years", "unannualized60MonthReturn");
		uiMapToServiceAttrib.put("5  Years Cumulative", "annualized60MonthReturn");
		uiMapToServiceAttrib.put("6  Years", "unannualized72MonthReturn");
		uiMapToServiceAttrib.put("6  Years Cumulative", "annualized72MonthReturn");
		uiMapToServiceAttrib.put("7  Years", "unannualized84MonthReturn");
		uiMapToServiceAttrib.put("7  Years Cumulative", "annualized84MonthReturn");
		uiMapToServiceAttrib.put("8  Years", "unannualized96MonthReturn");
		uiMapToServiceAttrib.put("8  Years Cumulative", "annualized96MonthReturn");
		uiMapToServiceAttrib.put("9  Years", "unannualized108MonthReturn");
		uiMapToServiceAttrib.put("9  Years Cumulative", "annualized108MonthReturn");
		uiMapToServiceAttrib.put("10  Years", "unannualized120MonthReturn");
		uiMapToServiceAttrib.put("10  Years Cumulative", "annualized120MonthReturn");
		uiMapToServiceAttrib.put("15  Years", "unannualized180MonthReturn");
		uiMapToServiceAttrib.put("15  Years Cumulative", "annualized180MonthReturn");
		uiMapToServiceAttrib.put("Lifetime  Cumulative", "cumulativeSinceInceptionRet");
		uiMapToServiceAttrib.put("Lifetime Unit Value", "unitValueInceptToDateRet");
		uiMapToServiceAttrib.put("Market Value (Inc. Accruals)", "marketValueWithAccruals");
		uiMapToServiceAttrib.put("Market Value (Exc. Accruals)", "marketValueNoAccruals");
		uiMapToServiceAttrib.put("Income (for Period)", "income");
		uiMapToServiceAttrib.put("Fee Expense (for Period)", "fees");
		uiMapToServiceAttrib.put("Accrual Amount", "accruedIncome");
		uiMapToServiceAttrib.put("As of Date", "asOfDate");
		uiMapToServiceAttrib.put("Inception Date", "inceptionDate");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_AccountGroupPostedTransactions() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Transaction Description", "transactionDescription");
		uiMapToServiceAttrib.put("Portfolio Name", "portfolioName");
		uiMapToServiceAttrib.put("Transaction Type", "transactionType");
		uiMapToServiceAttrib.put("Transaction Abbreviation", "txnDescAbrv");
		uiMapToServiceAttrib.put("Reporting Date", "reportingDate");
		uiMapToServiceAttrib.put("Date Traded", "dateTraded");
		uiMapToServiceAttrib.put("Date Settled", "dateSettled");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_DisposedTax() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Unit Cost", "unitCost");
		uiMapToServiceAttrib.put("Sequence Number", "taxlotSeqNum");
		uiMapToServiceAttrib.put("Federal Realized Gain Loss", "federalRealizedGainLoss");
		uiMapToServiceAttrib.put("Federal Cost(Base)", "federalCost");
		uiMapToServiceAttrib.put("Disposition Date", "dispositionDate");
		uiMapToServiceAttrib.put("Taxlot Gref", "taxlotGref");
		uiMapToServiceAttrib.put("Position Type", "positionTypeMeaning");
		uiMapToServiceAttrib.put("Position Type Number", "positionTypeNumber");
		uiMapToServiceAttrib.put("Security", "securityName");
		uiMapToServiceAttrib.put("Security Identifier", "securityIdentifier");
		uiMapToServiceAttrib.put("Security Gref", "securityGref");
		uiMapToServiceAttrib.put("Portfolio Number", "portfolioNumber");
		uiMapToServiceAttrib.put("Portfolio Name", "portfolioName");
		uiMapToServiceAttrib.put("Portfolio Gref", "portfolioGref");
		uiMapToServiceAttrib.put("Account Number", "accountNumber");
		uiMapToServiceAttrib.put("Account Name", "accountName");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_PostedTransactionFeeDetails() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Event Number", "eventNumber");
		uiMapToServiceAttrib.put("Fee Event Frequency", "feeEventFrequency");
		uiMapToServiceAttrib.put("Fee Schedule", "feeSchedule");
		uiMapToServiceAttrib.put("Default Allocation Method", "defaultAllocationMethodMeaning");
		uiMapToServiceAttrib.put("Allocate By Account", "allocateByAccount");
		uiMapToServiceAttrib.put("Include P T Inactive Period for Proration", "includePtInactivePeriodForProration");
		uiMapToServiceAttrib.put("Portfolio Prorate Method", "portfolioProrateMethodMeaning");
		uiMapToServiceAttrib.put("Minimum Application Rule", "minimumApplicationRuleMeaning");
		uiMapToServiceAttrib.put("Fee Start Date", "feeStartDate");
		uiMapToServiceAttrib.put("Fee End Date", "feeEndDate");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_PostedTransactionFeeCalculationSummary() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Fee Amount", "feeThisVersion");
		uiMapToServiceAttrib.put("Start Date", "startDate");
		uiMapToServiceAttrib.put("End Date", "endDate");
		uiMapToServiceAttrib.put("Qualifiers in Tiers", "applyQualifiersInTiers");
		uiMapToServiceAttrib.put("Breakpoint as Threshold", "breakpointAsThreshold");
		uiMapToServiceAttrib.put("Charge Calculation Basis", "chargeCalculationBasisMeaning");
		uiMapToServiceAttrib.put("Prorated by Frequency", "proratedByFrequency");
		uiMapToServiceAttrib.put("Prorated Amount", "proratedAmount");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_PostedTransactionPortfolioFeeSummary() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Paying Account/Portfolio Number", "portfolioNumber");
		uiMapToServiceAttrib.put("Collection Method", "collectionMethodMeaning");
		uiMapToServiceAttrib.put("% of Total Fee Paid", "percentOfFeePaid");
		uiMapToServiceAttrib.put("Total Fee this Portfolio", "totalFeeThisPortfolio");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_PostedTransactionDetails() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Portfolio Number", "portfolioNumber");
		uiMapToServiceAttrib.put("Date Posted", "datePosted");
		uiMapToServiceAttrib.put("Date Reported", "dateReport");
		uiMapToServiceAttrib.put("Date Traded", "dateTraded");
		uiMapToServiceAttrib.put("Date Settled", "dateSettled");
		uiMapToServiceAttrib.put("Transaction Amount", "txnAmount");
		uiMapToServiceAttrib.put("Security Description", "securityDescription");
		uiMapToServiceAttrib.put("Cusip", "cusip");
		uiMapToServiceAttrib.put("Transaction GREF", "transactionGref");
		uiMapToServiceAttrib.put("Transaction Description", "transactionDescription");
		uiMapToServiceAttrib.put("Tax Treatment", "taxCodeMeaning");
		uiMapToServiceAttrib.put("Sequence Number", "sequenceNumber");
		uiMapToServiceAttrib.put("Ledger Cash (Local)", "ledgerCash");
		uiMapToServiceAttrib.put("Reporting Cash", "reportingCash");
		uiMapToServiceAttrib.put("Gross Cash", "grossCash");
		uiMapToServiceAttrib.put("1099 Tax Year", "taxYear1099");
		uiMapToServiceAttrib.put("Withholding Rate", "withholdingRate");
		uiMapToServiceAttrib.put("Non-Resident Alien Withholding Rate", "nrtWhRate");
		uiMapToServiceAttrib.put("Withholding Description", "withholdingDesc");
		uiMapToServiceAttrib.put("Withholding Tax Treatment Code", "withholdingTaxCode");
		uiMapToServiceAttrib.put("Non-Resident Alien Withholding Tax Treatment Code", "nrtTaxCode");
		uiMapToServiceAttrib.put("Account Number", "accountNumber");
		uiMapToServiceAttrib.put("Account Name", "accountName");
		uiMapToServiceAttrib.put("Security Type", "minorSecurityMeaning");
		uiMapToServiceAttrib.put("Transaction Amount", "principleCash");
		uiMapToServiceAttrib.put("Transaction Description", "transactionDescription");
		uiMapToServiceAttrib.put("Original Face", "originalFaceValue");
		uiMapToServiceAttrib.put("Carry Value", "carryValue");
		uiMapToServiceAttrib.put("Principal Cash", "principleCash");
		uiMapToServiceAttrib.put("Income Cash", "incomeCash");
		uiMapToServiceAttrib.put("State Short-Term Gain/Los", "stateShortTermGainLoss");
		uiMapToServiceAttrib.put("State Long-Term Gain/Loss", "stateLongTermGainLoss");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_PayRecordDetails() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Check Amount", "checkAmount");
		uiMapToServiceAttrib.put("Issue Date", "issueDate");
		uiMapToServiceAttrib.put("Check Status", "checkStatus");
		uiMapToServiceAttrib.put("Payment Type", "paymentType");
		uiMapToServiceAttrib.put("Combined Payment Count", "combinedPaymentCount");
		uiMapToServiceAttrib.put("Payee Name", "payeeName");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_GrossToNetDetails() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Local Currency", "currencyAbbrev");
		uiMapToServiceAttrib.put("Amount(Local)", "amount");
		uiMapToServiceAttrib.put("Financial Component Type", "financialComponentTypeMeaning");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_UserDefinedFields() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("User Defined Value", "userDefinedValue");
		uiMapToServiceAttrib.put("User defined Label", "userDefinedLabel");
		uiMapToServiceAttrib.put("User Defined Field", "userDefinedField");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_AccountFeeDetails() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Fee Agreement Type", "feeAggrementType");
		uiMapToServiceAttrib.put("Date of Fee Agreement", "dateFeeAggrementType");
		uiMapToServiceAttrib.put("Fee Relationship Group", "feeRelationGrp");
		uiMapToServiceAttrib.put("Fee Relationship Minimum", "feeRelationMin");
		uiMapToServiceAttrib.put("Fee Account Group", "feeGrpReference");
		uiMapToServiceAttrib.put("Responsibility Center", "responsibilityCenter");
		uiMapToServiceAttrib.put("Sharing Responsibility Center", "sharingRespCenter");
		uiMapToServiceAttrib.put("Sharing Responsibility Percent", "sharingRespPerctg");
		uiMapToServiceAttrib.put("Prior Year Fees", "priorYearFees");
		uiMapToServiceAttrib.put("Current Year-to-Date (YTD)", "currYearToDate");
		uiMapToServiceAttrib.put("Prior Quarter", "priorQtrFee");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_FeeChargesCalculation() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Fee Calculation Formula", "feeCalFormula");
		uiMapToServiceAttrib.put("Calculation Basis", "calBasis");
		uiMapToServiceAttrib.put("Calculation Method", "calMethod");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_EventsDetails() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Start of Business", "startOfBusiness");
		uiMapToServiceAttrib.put("Combine Payments", "combinePayments");
		uiMapToServiceAttrib.put("Distribution Amount", "distributionAmount");
		uiMapToServiceAttrib.put("Text", "memoText");
		uiMapToServiceAttrib.put("Date Last Processed", "dataLastProcessed");
		uiMapToServiceAttrib.put("Event Number", "eventNumber");
		uiMapToServiceAttrib.put("Event Type", "eventTypeDescription");
		uiMapToServiceAttrib.put("Frequency", "frequency");
		uiMapToServiceAttrib.put("Holiday Rule", "holidayRule");
		uiMapToServiceAttrib.put("Next Scheduled Execution", "nextScheduledExecution");
		uiMapToServiceAttrib.put("Responsible Employee", "responsibleEmployee");
		uiMapToServiceAttrib.put("Weekend Rule", "weekendRule");
		uiMapToServiceAttrib.put("Distribution Amount", "distributionAmount");
		uiMapToServiceAttrib.put("IRS Distribution Abbrev", "irsDistributionAbbrev");
		uiMapToServiceAttrib.put("IRS Distribution", "irsDistributionMeaning");
		uiMapToServiceAttrib.put("Pay for Name", "payForName");
		uiMapToServiceAttrib.put("Pay to Account Number", "paymentAccountRef");
		uiMapToServiceAttrib.put("Pay to Routing Number", "paymentRoutingSymbol");
		uiMapToServiceAttrib.put("Remittance Form", "paymentMethodMeaning");
		uiMapToServiceAttrib.put("Remittance Form Number", "remittanceFormNumber");
		uiMapToServiceAttrib.put("Report Package", "reportPackageName");
		uiMapToServiceAttrib.put("From Close of Business", "fromCloseOfBusiness");
		uiMapToServiceAttrib.put("Event Identifier", "eventGref");
		uiMapToServiceAttrib.put("Event Name", "eventName");
		uiMapToServiceAttrib.put("Block Number", "blockNumberStmtDtl");
		uiMapToServiceAttrib.put("As of Date", "asOf");
		uiMapToServiceAttrib.put("Tax Code", "taxCode");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_AccountFeeEventDetails() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Date Last Processed", "dateLastFinished");
		uiMapToServiceAttrib.put("Event Number", "eventGref");
		uiMapToServiceAttrib.put("Event Type", "eventTypeDescription");
		uiMapToServiceAttrib.put("Frequency", "frequency");
		uiMapToServiceAttrib.put("Holiday Rule", "holidayRule");
		uiMapToServiceAttrib.put("Next Scheduled Execution", "dateNext");
		uiMapToServiceAttrib.put("Responsible Employee", "responsbileEmployeeName");
		uiMapToServiceAttrib.put("Weekend Rule", "weekendRule");
		uiMapToServiceAttrib.put("As of", "dateAsOf");
		uiMapToServiceAttrib.put("Count of Participients", "cntEpdFpd");
		uiMapToServiceAttrib.put("Count of Recipients", "cntRecipients");
		uiMapToServiceAttrib.put("End Date of Fee Period", "dateEndFeePeriod");
		uiMapToServiceAttrib.put("Anniversary Date", "dateFeeAnniversary");
		uiMapToServiceAttrib.put("Start Date of Fee Period", "dateStartFeePeriod");
		uiMapToServiceAttrib.put("Currency", "eventCurrencyAbbrev");
		uiMapToServiceAttrib.put("Event Allocation Method", "feeAllocationMethodMeaning");
		uiMapToServiceAttrib.put("Effective Fee Schedule", "feeScheduleMeaning");
		uiMapToServiceAttrib.put("Fees Ytd Year 1", "feeYr1");
		uiMapToServiceAttrib.put("Fees Ytd Year 2", "feeYr2");
		uiMapToServiceAttrib.put("Fees Ytd Year 1 Amount", "sumFeeYrFees1");
		uiMapToServiceAttrib.put("Fees Ytd Year 2 Amount", "sumFeeYrFees2");
		uiMapToServiceAttrib.put("Override Fee Schedule Annual Min", "amtOverrideAnnualMin");
		uiMapToServiceAttrib.put("Fee Schedule Min Application Rule", "dfltMinAppRuleMeaning");
		uiMapToServiceAttrib.put("Fee Event Maximum", "maxFee");
		uiMapToServiceAttrib.put("Event Fee Min Application Rule", "minAppRuleMeaning");
		uiMapToServiceAttrib.put("Maximum Tolerance", "toleranceAmount");
		uiMapToServiceAttrib.put("Discount Override Amount", "discountAmount");
		uiMapToServiceAttrib.put("Discount Percentage", "discountPercent");
		uiMapToServiceAttrib.put("Premium Override Amount", "premiumAmount");
		uiMapToServiceAttrib.put("Account Number", "accountNumber");
		uiMapToServiceAttrib.put("Account Name", "accountName");
		uiMapToServiceAttrib.put("Event Name", "externalId");
		uiMapToServiceAttrib.put("Premium Percentage", "premiumPercent");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_AccountGainLossByYear() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Account Gref", "accountGref");
		uiMapToServiceAttrib.put("Start of Fiscal Year", "startOfFiscalYear");
		uiMapToServiceAttrib.put("Net Short Term this Year", "shortTermNetThisYear");
		uiMapToServiceAttrib.put("Fiscal Year", "fiscalYear");
		uiMapToServiceAttrib.put("Fiscal Year Ends", "endOfFiscalYear");
		uiMapToServiceAttrib.put("Short Term Losses this Year", "shortTermLossesThisYear");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_DisposedTaxlotDetails() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Account Name", "accountName");
		uiMapToServiceAttrib.put("Account Number", "accountNumber");
		uiMapToServiceAttrib.put("Acquired By", "acquiredByMeaning");
		uiMapToServiceAttrib.put("Disposition Date", "dateDisposed");
		uiMapToServiceAttrib.put("Hold As", "howHeldMeaning");
		uiMapToServiceAttrib.put("Security Identifier", "securityId");
		uiMapToServiceAttrib.put("Sequence Number", "taxlotSeqNum");
		uiMapToServiceAttrib.put("Disposed By", "disposedByMeaning");
		uiMapToServiceAttrib.put("Portfolio Number", "portfolioNumber");
		uiMapToServiceAttrib.put("Security", "securityName");
		uiMapToServiceAttrib.put("Federal Acquisition Date", "dateFedAcquisition");
		uiMapToServiceAttrib.put("Federal Cost", "fedCost");
		uiMapToServiceAttrib.put("State Tax Consequences", "stateGainLossClassMeaning");
		uiMapToServiceAttrib.put("State Acquisition Date", "dateStateAcquisition");
		uiMapToServiceAttrib.put("Federal Realized Gain/Loss", "fedGainLossWhenDisposed");
		uiMapToServiceAttrib.put("Federal Last Actual Amortization", "dateLastStateAmort");
		uiMapToServiceAttrib.put("Taxlot Gref", "taxlotGref");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_AccountGainLossDetail() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Short Term Capital Loss Forward Pre 1970", "shortTermCapLossFwdPre70");
		uiMapToServiceAttrib.put("Short Term Capital Loss Forward Post 1969", "shortTermCapLossFwdPost69");
		uiMapToServiceAttrib.put("Net Short Term Carry Forward", "netShortTermCarryFwd");
		uiMapToServiceAttrib.put("Short Term Capital Loss Forward as of 12/31/1969", "shortTermCapLossFwdAsOf123169");
		uiMapToServiceAttrib.put("Long Term Capital Loss Forward Pre 1970", "longTermCapLossFwdPre70");
		uiMapToServiceAttrib.put("Long Term Capital Loss Forward Post 1969", "longTermCapLossFwdPost69");
		uiMapToServiceAttrib.put("Net Long Term Carry Forward", "netLongTermCarryForward");
		uiMapToServiceAttrib.put("Long Term Capital Loss Forward as of 12/31/1969", "longTermCapLossFwdAsOf123169");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_Documents() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Account Name", "entityName");
		uiMapToServiceAttrib.put("Report Name", "documentFileName");
		uiMapToServiceAttrib.put("Account Number", "entityNumber");
		uiMapToServiceAttrib.put("As of Date", "documentRevisedDate");
		uiMapToServiceAttrib.put("Frequency", "documentFreqCode");
		uiMapToServiceAttrib.put("Report Type", "documentType");
		uiMapToServiceAttrib.put("Re-rendered Flag", "renderingFlag");
		uiMapToServiceAttrib.put("Statement End Date", "documentEndDate");
		uiMapToServiceAttrib.put("Statement Start Date", "documentStartDate");
		uiMapToServiceAttrib.put("Recipient Name", "recipientName");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_ClientReminders() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Event Type Code", "eventTypeCode");
		uiMapToServiceAttrib.put("Responsible Employee", "responsibleEmployeeName");
		uiMapToServiceAttrib.put("Memo", "memo");
		uiMapToServiceAttrib.put("Frequency", "frequency");
		uiMapToServiceAttrib.put("External Reference", "externalReference");
		uiMapToServiceAttrib.put("Event Type", "eventTypeDescription");
		uiMapToServiceAttrib.put("Event Name", "eventName");
		uiMapToServiceAttrib.put("Event ID", "eventId");
		uiMapToServiceAttrib.put("Display Type Number", "displayTypeNumber");
		uiMapToServiceAttrib.put("Next Scheduled Execution", "dateNext");
		uiMapToServiceAttrib.put("Date Last Processed", "dateLastFinished");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_ClientRelationships() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Affiliation Type", "affiliationType");
		uiMapToServiceAttrib.put("Account/Portfolio Number", "affiliateeId");
		uiMapToServiceAttrib.put("Affiliation Record Name", "affiliateeName");
		uiMapToServiceAttrib.put("Affiliation Record Type", "affiliateeType");
		uiMapToServiceAttrib.put("Affiliation", "affiliationType");
		uiMapToServiceAttrib.put("Affiliation Name", "affiliateeName");
		uiMapToServiceAttrib.put("Affiliatee Type", "affiliateeType");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_Relationships() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Affiliation Name", "shortName");
		uiMapToServiceAttrib.put("Entity Type", "entityType");
		uiMapToServiceAttrib.put("Address", "address1");
		uiMapToServiceAttrib.put("Address 2", "address2");
		uiMapToServiceAttrib.put("City", "addressCity");
		uiMapToServiceAttrib.put("State Name", "addressStateName");
		uiMapToServiceAttrib.put("Country Name", "addressCountry");
		return uiMapToServiceAttrib;
	}

	public static Map<String, String> getMapping_PortfoliosForWidget() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Name", "portfolioName");
		uiMapToServiceAttrib.put("Amount Overdrawn", "ledgerCashLocal");
		return uiMapToServiceAttrib;
	}

	public static Map<String, String> getMapping_TransactionsForWidget() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Name", "portfolioName");
		uiMapToServiceAttrib.put("Date", "postedDate");
		uiMapToServiceAttrib.put("Amount", "ledgerCashTradeDatabase");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_PortfolioCashDetail() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Invested Income Balance", "investedBalanceIncome");
		uiMapToServiceAttrib.put("Invested Principal Balance", "investedBalancePrincipal");
		uiMapToServiceAttrib.put("Income ACM Balance", "sweepSumLocalIncome");
		uiMapToServiceAttrib.put("Principal ACM Balance", "sweepSumLocalPrincipal");
		uiMapToServiceAttrib.put("Income Cash", "ledgerCashLocalIncome");
		uiMapToServiceAttrib.put("Principal Cash", "ledgerCashLocalPrincipal");
		uiMapToServiceAttrib.put("Available Funds - Income", "availableCashLocalIncome");
		uiMapToServiceAttrib.put("Available Funds - Principal", "availableCashLocalPrincipal");
		uiMapToServiceAttrib.put("Available Next Day Income Cash", "availNextDayCashIncome");
		uiMapToServiceAttrib.put("Available Next Day Principal Cash", "availNextDayCashPrincipal");
		uiMapToServiceAttrib.put("Income Cash Hold Amount", "cashHoldAmountIncome");
		uiMapToServiceAttrib.put("Principal Cash Hold Amount", "cashHoldAmountPrincipal");
		uiMapToServiceAttrib.put("Available Cash", "availableCash");
		uiMapToServiceAttrib.put("Ledger Cash (Local)", "ledgerCash");
		uiMapToServiceAttrib.put("Sweep Sum", "sweepSum");
		uiMapToServiceAttrib.put("Current Sweep Strategy Number", "currentSweepStrategyNum");
		uiMapToServiceAttrib.put("Current Sweep Strategy Abbreviation", "currentSweepStrategyAbbrev");
		uiMapToServiceAttrib.put("Current Sweep Strategy", "currentSweepStrategy");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_ReportExecutions() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Report Name", "outputFileName");
		uiMapToServiceAttrib.put("Category Name", "categoryName");
		uiMapToServiceAttrib.put("Status", "statusMeaning");
		uiMapToServiceAttrib.put("Template Name", "definitionName");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_JobSceduler() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Next Scheduled Date/Time EST", "nextFire");
		uiMapToServiceAttrib.put("Report Name", "outputFileName");
		uiMapToServiceAttrib.put("Category Name", "categoryName");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_ReportDefinitions() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Template Name", "definitionName");
		return uiMapToServiceAttrib;
	}

	private static Map<String, String> getMapping_Portfolios() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Portfolio Name", "portfolioName");
		uiMapToServiceAttrib.put("Portfolio Number", "portfolioNumber");
		uiMapToServiceAttrib.put("Local Currency", "localCurrency");
		return uiMapToServiceAttrib;
	}
	
	private static Map<String, String> getMapping_feeoversighttotal() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Fees Year-to-Date", "feesYearToDate");
		uiMapToServiceAttrib.put("Fees This Month", "feesThisMonth");
		uiMapToServiceAttrib.put("Fees This Quarter", "feesThisQuarter");
		uiMapToServiceAttrib.put("Fees Prior Year", "feesPriorYear");
		uiMapToServiceAttrib.put("Fees Currency", "feesCurrency");
		return uiMapToServiceAttrib;
	}
	private static Map<String, String> getMapping_feereceivables() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Account Number", "accountNumber");
		uiMapToServiceAttrib.put("Fee Bill Recipient Name", "feeBillRecipientName");
		uiMapToServiceAttrib.put("Event Number", "eventNumber");
		uiMapToServiceAttrib.put("Balance Due", "balanceDue");
		uiMapToServiceAttrib.put("Receivable/ Invoice Number", "receivableNumber");
		return uiMapToServiceAttrib;
	}
	
	private static Map<String, String> getMapping_FeeEvents() {
		uiMapToServiceAttrib = new HashMap<>();
		uiMapToServiceAttrib.put("Account Number", "accountNumber");
		uiMapToServiceAttrib.put("Event Type", "eventType");
		uiMapToServiceAttrib.put("Event Number", "eventNumber");
		uiMapToServiceAttrib.put("Account Name", "accountName");
		uiMapToServiceAttrib.put("Interested Party Number", "interestedPartyNumber");
		uiMapToServiceAttrib.put("Responsible Employee", "responsibleEmployee");
		uiMapToServiceAttrib.put("Event Description", "eventDescription");
		return uiMapToServiceAttrib;
	}
}
