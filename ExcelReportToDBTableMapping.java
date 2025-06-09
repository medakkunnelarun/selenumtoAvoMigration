package com.unity.utilities;

import java.util.HashMap;
import java.util.Map;

public class ExcelReportToDBTableMapping {

	private ExcelReportToDBTableMapping() {
		throw new IllegalStateException("Utility Class");
	}

	static Map<String, String> excelReportToDBTable = null;

	public static Map<String, String> getDbMapping(String queryFileName) {
		queryFileName = queryFileName.split("\\.")[0];
		switch (queryFileName.toLowerCase()) {
		case "accountaffiliationreport":
			return getMapping_AccountAffiliationsReport();

		case "accountinformationreport":
			return getMapping_AccountInformationReport();

		case "accountsummaryinformationreport":
			return getMapping_AccountSummaryInformationReport();

		case "eventdisbursementreport":
			return getMapping_EventDisbursementReport();

		case "eventsreport":
			return getMapping_EventsReport();

		case "eventmemoreport":
			return getMapping_EventMemoReport();

		case "holdingsreport":
			return getMapping_HoldingsReport();

		case "portfolioSummaryReport":
			return getMapping_PortfolioSummaryReport();

		case "transactionsreport":
			return getMapping_TransactionsReport();

		default:
			break;
		}
		return new HashMap<>();
	}

	private static Map<String, String> getMapping_AccountInformationReport() {
		excelReportToDBTable = new HashMap<>();
		excelReportToDBTable.put("Account name", "SHORT_NAME");
		excelReportToDBTable.put("Account number", "ACCOUNT_NUMBER");
		excelReportToDBTable.put("Acquired by", "ACQUIRED_BY");
		excelReportToDBTable.put("Anticipated market value at open", "MARKET_VALUE_AT_OPEN");
		excelReportToDBTable.put("Associate investment officer", "ASSOCIATED_INVESTMENT_OFFICER");
		excelReportToDBTable.put("Bank name", "BANK_NAME");
		excelReportToDBTable.put("Branch name", "BRANCH_NAME");
		excelReportToDBTable.put("Country tax situs iso", "COUNTRY_TAX_SITUS_ISO");
		excelReportToDBTable.put("Currency", "BASE_CURRENCY_ISO");
		excelReportToDBTable.put("Events", "EVENTS");// not matching
		excelReportToDBTable.put("Federal tax payment method meaning", "FEDERAL_TAX_PAYMENT_METHOD_M");
		excelReportToDBTable.put("Fee agreement type", "FEE_AGREEMENT_TYPE");
		excelReportToDBTable.put("Fee agreement type meaning", "FEE_AGREEMENT_TYPE_M");
		excelReportToDBTable.put("Hold as", "HOW_HELD_MEANING");
		excelReportToDBTable.put("ITFA 5% payout amount", "ITFA_5PERC_PAYOUT_AMOUNT");
		excelReportToDBTable.put("ITFA active fiscal year", "ITFA_ACTIVE_FISCAL_YEAR");
		excelReportToDBTable.put("ITFA annual avg market value", "ITFA_ANNUAL_AVG_MAERKET_VALUE");
		excelReportToDBTable.put("ITFA election meaning", "ITFA_ELECTION_MEANING");
		excelReportToDBTable.put("ITFA previous fiscal year", "ITFA_PREVIOUS_FISCAL_YEAR");
		excelReportToDBTable.put("ITFA previous market year", "ITFA_PREVIOUS_MARKET_VALUE");
		excelReportToDBTable.put("Investment officer", "ACCOUNT_INVESTMENT_OFFICER");
		excelReportToDBTable.put("Legal name", "LEGAL_NAME");
		excelReportToDBTable.put("Long name", "LONG_NAME");
		excelReportToDBTable.put("Major account type", "MAJOR_TYPE_MEANING");
		excelReportToDBTable.put("Market value (base)", "MAJOR_TYPE_MEANING");
		excelReportToDBTable.put("Minor account type", "MINOR_TYPE_MEANING");
		excelReportToDBTable.put("Outside investment manager", "ACCNT_INVEST_ADVISOR_OUTSIDE");
		excelReportToDBTable.put("Overdraft netting rule meaning", "OVERDRAFT_NETTING_RULE_M");
		excelReportToDBTable.put("Owner name", "OWNER_NAME");
		excelReportToDBTable.put("Realized gain/loss", "REALIZED_GAIN_LOSS");
		excelReportToDBTable.put("Region meaning", "REGION_M");
		excelReportToDBTable.put("Reminders", "REMINDERS");// Values not
															// matching
		excelReportToDBTable.put("Service capacity", "CAPACITY_CODE_MEANING");
		excelReportToDBTable.put("Source of business", "SOURCE_OFBUSINESS_MEANING");
		excelReportToDBTable.put("State of admin law", "DOMICILE_STATE_ABBREV");
		excelReportToDBTable.put("State tax situs abbreviation", "STATE_TAX_SITUS_ABBREV");
		excelReportToDBTable.put("Status", "STATUS");
		excelReportToDBTable.put("Federal tax id", "FEDERAL_TAX_ID");
		excelReportToDBTable.put("Tax worksheet prod grp", "TAX_WORKSHEET_PROD_GRP_MEANING");
		return excelReportToDBTable;
	}

	private static Map<String, String> getMapping_PortfolioSummaryReport() {
		excelReportToDBTable = new HashMap<>();
		excelReportToDBTable.put("Account number", "ACCOUNT_NUMBER");
		excelReportToDBTable.put("Base currency", "BASE_CURRENCY");
		excelReportToDBTable.put("Estimated annual income (base)", "ESTIMATED_ANNUAL_INCOME_BASE");
		excelReportToDBTable.put("Estimated yield", "ESTIMATED_YIELD_BASE");
		excelReportToDBTable.put("Fed cost trade date base", "FED_COST_TRADE_DATE_BASE");
		excelReportToDBTable.put("Market value trade date (base)", "MARKET_VALUE_TRADE_DATE_BASE");
		excelReportToDBTable.put("Relationship name", "ACCOUNT_NAME");
		excelReportToDBTable.put("Unrealized gain/loss (base)", "UNREALIZED_GAIN_LOSS_BASE");
		excelReportToDBTable.put("Security type abbrev", "MINOR_SECURITY_TYPE_ABBREV");
		excelReportToDBTable.put("Security type code", "MINOR_SECURITY_TYPE_NUMBER");
		excelReportToDBTable.put("Security type", "MINOR_SECURITY_TYPE_MEANING");
		return excelReportToDBTable;
	}

	private static Map<String, String> getMapping_AccountAffiliationsReport() {
		excelReportToDBTable = new HashMap<>();
		excelReportToDBTable.put("Account long name", "ACCOUNT_LONG_NAME");
		excelReportToDBTable.put("Account name", "ACCOUNT_NAME");
		excelReportToDBTable.put("Account number", "ACCOUNT_NUMBER");
		excelReportToDBTable.put("Affiliation name", "AFFILIATION_NAME");
		excelReportToDBTable.put("Affiliation type", "AFFILIATION_TYPE_MEANING");
		excelReportToDBTable.put("Affiliation type number", "AFFILIATION_TYPE_NUMBER");
		excelReportToDBTable.put("Home fax phone", "HOME_FAX_PHONE");
		excelReportToDBTable.put("Home phone", "HOME_PHONE");
		excelReportToDBTable.put("Office phone", "OFFICE_PHONE");
		excelReportToDBTable.put("Portfolio name", "PORTFOLIO_NAME");
		excelReportToDBTable.put("Portfolio number", "PORTFOLIO_NUMBER");
		return excelReportToDBTable;
	}

	private static Map<String, String> getMapping_AccountSummaryInformationReport() {
		excelReportToDBTable = new HashMap<>();
		excelReportToDBTable.put("Account name", "ACCOUNT_NAME");
		excelReportToDBTable.put("Account number", "ACCOUNT_NUMBER");
		excelReportToDBTable.put("Market value", "MARKET_VALUE");// Big integer
		// excelReportToDBTable.put("Report date", "REPORT_DATE");//Date format
		// issue
		excelReportToDBTable.put("Security type", "ASSET_CLASS_MEANING");
		excelReportToDBTable.put("Security type abbrev", "ASSET_CLASS_ABBREV");
		excelReportToDBTable.put("Security type code", "ASSET_CLASS_CODE");
		return excelReportToDBTable;
	}

	private static Map<String, String> getMapping_EventDisbursementReport() {
		excelReportToDBTable = new HashMap<>();
		excelReportToDBTable.put("Amount advanced", "AMOUNT_ADVANCED");
		excelReportToDBTable.put("Description code", "DESCRIPTION_CODE");
		excelReportToDBTable.put("Disburse include all owners", "DISBURSE_INCLUDE_ALL_OWNERS");
		excelReportToDBTable.put("Disbursement event count", "DISBURSEMENT_EVENT_COUNT");// Date
																							// format
																							// issue
		excelReportToDBTable.put("Disbursement limit (local) currency", "DISBURSEMENT_LMT_USE_PT_CURR");
		excelReportToDBTable.put("Disbursing account name", "DISBURSING_ACCOUNT_NAME");
		excelReportToDBTable.put("Disbursing account number", "DISBURSING_ACCOUNT_NUMBER");
		excelReportToDBTable.put("Disbursing portfolio number", "DISBURSING_PORTFOLIO_NUMBER");
		excelReportToDBTable.put("Distribution type desc", "DISTRIBUTION_TYPE_DESC");
		excelReportToDBTable.put("Event frequency", "EVENT_FREQUENCY");
		excelReportToDBTable.put("Event type", "EVENT_TYPE");
		excelReportToDBTable.put("Event type id", "EVENT_TYPE_ID");
		excelReportToDBTable.put("Explanation", "EXPLANATION");
		excelReportToDBTable.put("Fixed amount", "FIXED_AMOUNT");
		excelReportToDBTable.put("Funds type", "FUNDS_TYPE");
		excelReportToDBTable.put("Irs distribution code", "IRS_DISTRIBUTION_CODE");
		excelReportToDBTable.put("Local currency", "CURRENCY");
		excelReportToDBTable.put("Maximum amount", "MAXIMUM_AMOUNT");
		excelReportToDBTable.put("Minimum amount", "MINIMUM_AMOUNT");
		excelReportToDBTable.put("Name", "RECIPIENT_NAME");
		excelReportToDBTable.put("Net commission reserves", "NET_COMMISION_RESERVES");
		excelReportToDBTable.put("Net payables", "NET_PAYABLES");
		excelReportToDBTable.put("Pay by document", "PAY_BY_DOCUMENT)");
		excelReportToDBTable.put("Payee tax address", "PAYEE_TAX_ADDRESS)");
		excelReportToDBTable.put("Payee tax id", "PAYEE_TAX_ID)");
		excelReportToDBTable.put("Payee tax name", "PAYEE_TAX_NAME)");
		excelReportToDBTable.put("Payment calculation method", "PAYMENT_CALCULATION_METHOD");
		excelReportToDBTable.put("Portfolio type", "PORTFOLIO_TYPE");
		excelReportToDBTable.put("Premature distribution", "PREMATURE_DISTRIBUTION");
		excelReportToDBTable.put("Recipient affiliation id", "RECIPIENT_AFFILIATION_ID");
		excelReportToDBTable.put("Recipient event count", "RECIPIENT_EVENT_COUNT");
		excelReportToDBTable.put("Recipient portfolio id", "RECIPIENT_PORTFOLIO_ID");
		excelReportToDBTable.put("Tax code", "TAX_CODE");
		excelReportToDBTable.put("Zero fixed amount", "ZERO_FIXED_AMOUNT");
		return excelReportToDBTable;
	}

	private static Map<String, String> getMapping_EventMemoReport() {
		excelReportToDBTable = new HashMap<>();
		excelReportToDBTable.put("Account name", "ACCOUNT_NAME");
		excelReportToDBTable.put("Account number", "ACCOUNT_NUMBER");
		excelReportToDBTable.put("Employee/Trust administrator", "EMPLOYEE_OWNER_NAME");
		excelReportToDBTable.put("Event frequency", "FREQUENCY");
		excelReportToDBTable.put("Event id", "EXTERNAL_ID");
		excelReportToDBTable.put("Event type", "EVENT_TYPE_DESCRIPTION");
		excelReportToDBTable.put("Event type id", "EVENT_TYPE");
		excelReportToDBTable.put("Memo text", "TEXT_MESSAGE");
		return excelReportToDBTable;
	}

	private static Map<String, String> getMapping_EventsReport() {
		excelReportToDBTable = new HashMap<>();
		excelReportToDBTable.put("Account name", "ACCOUNT_NAME");
		excelReportToDBTable.put("Account number", "ACCOUNT_NUMBER");
		excelReportToDBTable.put("Additional information", "ADDITIONAL_INFO");
		excelReportToDBTable.put("Additional information extended", "ADDITIONAL_INFO_EXTENDED");
		excelReportToDBTable.put("Event class", "EVENT_CLASS");
		excelReportToDBTable.put("Event class code", "EXTERNAL_CLASS_CODE");
		excelReportToDBTable.put("Event class decription code", "EVENT_CLASS_DESCRIPTION_CODE");
		excelReportToDBTable.put("Event description", "EVENT_DESCRIPTION");
		excelReportToDBTable.put("Event number", "EVENT_NUMBER");
		excelReportToDBTable.put("Event type", "EVENT_TYPE_DESCRIPTION");
		excelReportToDBTable.put("Memo text", "TEXT_MESSAGE");
		excelReportToDBTable.put("Event type id", "EVENT_TYPE");
		excelReportToDBTable.put("Expired", "EXPIRED");
		excelReportToDBTable.put("Frequency", "FREQUENCY");
		excelReportToDBTable.put("Portfolio name", "PORTFOLIO_NAME");
		excelReportToDBTable.put("Portfolio number", "PORTFOLIO_NUMBER");
		excelReportToDBTable.put("Responsible employee", "RESPONSIBLE_EMPLOYEE");
		excelReportToDBTable.put("Responsible employee gref", "RESPONSIBLE_EMPLOYEE_GREF");
		return excelReportToDBTable;
	}

	private static Map<String, String> getMapping_HoldingsReport() {
		excelReportToDBTable = new HashMap<>();
		excelReportToDBTable.put("Account name", "ACCOUNT_NAME");
		excelReportToDBTable.put("Account number", "ACCOUNT_NUMBER");
		return excelReportToDBTable;
	}

	private static Map<String, String> getMapping_TransactionsReport() {
		excelReportToDBTable = new HashMap<>();
		excelReportToDBTable.put("ABA routing code", "BANK_ACCOUNT_ROUTING_SYMBOL");
		excelReportToDBTable.put("Account name", "ACCOUNT_NAME");
		excelReportToDBTable.put("Account number", "ACCOUNT_NUMBER");
		excelReportToDBTable.put("Accrued int on purchase", "ACCRUED_INT_ON_PURCHASE");
		excelReportToDBTable.put("Accrued int on purchase accrue", "ACCRUED_INT_ON_PURCHASE_ACCRUE");
		excelReportToDBTable.put("Accrued int tax amount (base)", "ACCRUED_INT_TAX_AMT_BASE");
		excelReportToDBTable.put("Accrued int tax amount (local)", "ACCRUED_INT_TAX_AMT_LOCAL	");
		excelReportToDBTable.put("Auto theo settlement execution", "AUTO_THEO_SETTLE_EXEC");
		excelReportToDBTable.put("Book gain", "BOOK_GAIN_BASE");
		excelReportToDBTable.put("Book loss", "BOOK_LOSS_BASE");
		excelReportToDBTable.put("Book value (base)", "BOOK_VALUE_CHANGE_TD_BASE");
		excelReportToDBTable.put("Book value (local)", "BOOK_VALUE_CHANGE_TD_LOCAL");
		excelReportToDBTable.put("CUSIP", "CUSIP");
		excelReportToDBTable.put("Cash payable (base)", "CASH_PAYABLE_TD_BASE");
		excelReportToDBTable.put("Cash payable (local)", "CASH_PAYABLE_TD_LOCAL");
		excelReportToDBTable.put("Cash receivable (base)", "CASH_RECEIVABLE_TD_BASE");
		excelReportToDBTable.put("Cash receivable (local)", "CASH_RECEIVABLE_TD_LOCAL");
		excelReportToDBTable.put("Corporate action fee", "CORP_ACT_FEE");
		excelReportToDBTable.put("Country of exposure", "COUNTRY_OF_EXPOSURE_NAME");
		excelReportToDBTable.put("Currency (base)", "ISO_CURRENCY_BASE");
		excelReportToDBTable.put("Currency (local)", "ISO_CURRENCY_LOCAL");
		excelReportToDBTable.put("Currency gain", "CURRENCY_GAIN_BASE");
		excelReportToDBTable.put("Currency loss", "CURRENCY_LOSS_BASE");
		excelReportToDBTable.put("Description code", "DESCRIPTION_MEANING");
		excelReportToDBTable.put("Description code id", "DESCRIPTION_NUMBER");
		excelReportToDBTable.put("Dividend withholding at source (base)", "BASE_DIVIDEND_WH_AT_SOURCE");
		excelReportToDBTable.put("Dividend withholding by US", "DIVIDEND_WH_BY_US");
		excelReportToDBTable.put("Dividend withholding rate", "DIVIDEND_WH_RATE");
		excelReportToDBTable.put("Dividend withholding source", "DIVIDEND_WH_AT_SOURCE");
		excelReportToDBTable.put("Dividend withholding tax (base)", "DIVIDEND_WH_TAX_BASE");
		excelReportToDBTable.put("Exchange rate (base)", "TRANSACTION_EXCHANGE_RATE");
		excelReportToDBTable.put("Exchange rate (local)", "EXCHANGE_RATE_TD_LOCAL");
		excelReportToDBTable.put("Explanation text", "SF_GET_GDS_TXN_EXPL(TX.DATABASE_ID,TX.TRANSACTION_GREF)");
		excelReportToDBTable.put("FATCA withholding by US", "FATCA_WH_BY_US");
		excelReportToDBTable.put("Fed long gain (local)", "FED_LONG_GAIN_LOCAL");
		excelReportToDBTable.put("Fed long loss (local)", "FED_LONG_LOSS_LOCAL	");
		excelReportToDBTable.put("Fed short gain (local)", "FED_SHORT_GAIN_LOCAL");
		excelReportToDBTable.put("Fed short loss (local)", "FED_SHORT_LOSS_LOCAL");
		excelReportToDBTable.put("Federal tax cost (base)", "FED_TAX_COST_BASE");
		excelReportToDBTable.put("Federal tax cost (local)", "FED_TAX_COST_LOCAL");
		excelReportToDBTable.put("Gross cash (base)", "GROSS_CASH_BASE");
		excelReportToDBTable.put("Gross cash (local)", "GROSS_CASH_LOCAL");
		excelReportToDBTable.put("Investment objective", "INVESTMENT_OBJECTIVE_MEANING");
		excelReportToDBTable.put("Ledger cash (base)", "LEDGER_CASH_TD_BASE");
		excelReportToDBTable.put("Ledger cash (local)", "LEDGER_CASH_TD_LOCAL");
		excelReportToDBTable.put("Long term gain loss", "LONG_TERM_GAIN_LOSS");
		excelReportToDBTable.put("Major asset type", "MAJOR_SECURITY_CODE_MEANING");
		excelReportToDBTable.put("Match fx id", "MATCH_FX_ID");
		excelReportToDBTable.put("Matched fx gain loss", "MATCH_FX_GAIN_LOSS_LOCAL");
		excelReportToDBTable.put("Minor asset type", "MINOR_SECURITY_TYPE_MEANING");
		excelReportToDBTable.put("NRA country", "NRA_COUNTRY_NAME");
		excelReportToDBTable.put("NRA withholding at source", "NRA_WH_AT_SOURCE");
		excelReportToDBTable.put("NRA withholding by US", "NRA_WH_BY_US");
		excelReportToDBTable.put("NRA withholding rate", "NRA_WH_RATE");
		excelReportToDBTable.put("NRA withholding tax (base)", "NRA_WH_TAX_BASE");
		excelReportToDBTable.put("National tax withholding by US", "NTL_TAX_WH_BY_US");
		excelReportToDBTable.put("National tax withholding rate", "NTL_WH_RATE");
		excelReportToDBTable.put("National tax withholding at source", "NTL_WH_AT_SOURCE");
		excelReportToDBTable.put("National tax withholding tax (base)", "NTL_TAX_WH_TAX_BASE");
		excelReportToDBTable.put("Net amount broker (base)", "");// Not Found
		excelReportToDBTable.put("Net amount broker (local)", "");// Not Found
		excelReportToDBTable.put("Original TPP number", "ORIGINAL_TPP_NUMBER");
		excelReportToDBTable.put("Payment levy tax (base)", "PAYMENT_LEVY_TAX_BASE");
		excelReportToDBTable.put("Payment rate", "PAYMENT_RATE");
		excelReportToDBTable.put("Portfolio name", "PORTFOLIO_NAME");
		excelReportToDBTable.put("Portfolio number", "PORTFOLIO_NUMBER");
		excelReportToDBTable.put("Post date", "");// Date issue
		excelReportToDBTable.put("Process class", "SECURITY_PROCESSING_CLASS_NAME");
		excelReportToDBTable.put("Registration description", "REGISTRATION_CODE_MEANING");
		excelReportToDBTable.put("Reporting cash (base)", "REPORTING_CASH_AMT_BASE");
		excelReportToDBTable.put("Reporting cash (local)", "REPORTING_CASH_AMT_LOCAL");
		excelReportToDBTable.put("Reversal indicator", "IS_REVERSAL");
		excelReportToDBTable.put("Security description", "SECURITY_SHORT_TITLE_1");
		excelReportToDBTable.put("Service capacity", "CAPACITY_CODE_MEANING");
		excelReportToDBTable.put("Settlement location", "SETTLE_LOCATION_MEANING");
		excelReportToDBTable.put("Short term gain loss", "SHORT_TERM_GAIN_LOSS");
		excelReportToDBTable.put("Split ratio", "SPLIT_RATIO");
		excelReportToDBTable.put("Stamp duty (base)", "STAMP_DUTY_AMT_BASE");
		excelReportToDBTable.put("State long gain (local)", "STATE_LONG_GAIN_LOCAL");
		excelReportToDBTable.put("State long loss (local)", "STATE_LONG_LOSS_LOCAL");
		excelReportToDBTable.put("State short gain (local)", "STATE_SHORT_GAIN_LOCAL");
		excelReportToDBTable.put("State short loss (local)", "STATE_SHORT_LOSS_LOCAL");
		excelReportToDBTable.put("Storage location", "STORAGE_LOCATION_MEANING");
		excelReportToDBTable.put("Sweep vehicle", "SWEEP_STRATEGY_NAME");
		excelReportToDBTable.put("Tax lot selection method", "TAXLOT_SALE_METHOD_MEANING");
		excelReportToDBTable.put("Tax lot selection method code", "TAXLOT_SALE_METHOD_CODE");
		excelReportToDBTable.put("Trade transaction", "TRANSACTION_NUMBER");
		excelReportToDBTable.put("Transaction class", "TRANSACTION_CATEGORY");
		excelReportToDBTable.put("Transaction currency", "TRANSACTION_CURRENCY_ISO");
		excelReportToDBTable.put("Transaction description", "SF_GET_GDS_TXN_INFO(TX.DATABASE_ID,TX.TRANSACTION_GREF)");
		excelReportToDBTable.put("Transaction event type", "EVENT_TYPE_CODE");
		excelReportToDBTable.put("Transaction exchange rate", "TRANSACTION_EXCHANGE_RATE");
		excelReportToDBTable.put("Transaction price per share", "PRICE_PER_SHARE");
		excelReportToDBTable.put("Transaction type", "TRANSACTION_TYPE_CODE_MEANING");
		excelReportToDBTable.put("Transfer portfolio alternate number", "ALTERNATE_NUMBER");
		excelReportToDBTable.put("Units", "UNITS");
		return excelReportToDBTable;
	}
}
