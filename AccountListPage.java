package com.unity.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.unity.constants.AppConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityGridElement;
import com.unity.customelements.UnityTableElement;
import com.unity.customelements.UnityWebElement;
import com.unity.utilities.UnityUtils;

public class AccountListPage extends BaseTestPage {

	WebDriver driver;

	public AccountListPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}

	// header
	@FindBy(xpath = "//div[normalize-space(text())='Unity']")
	public UnityWebElement headerUnity;

	@FindBy(xpath = "//mat-checkbox[@aria-label='Book of Business']//input")
	public UnityWebElement checkboxBookOfBusiness;

	@FindBy(xpath = "//mat-checkbox[@aria-label='Favorites']//input")
	public UnityWebElement checkboxFavorites;

	@FindBy(xpath = "//entity-filter//mat-icon")
	public UnityWebElement dropdownView;

	// Print icon
	@FindBy(xpath = "//unity-print/button")
	public UnityWebElement linkPrint;

	@FindBy(xpath = "//*[normalize-space(text())='Print All Pages']")
	public UnityWebElement buttonPrintAllPages;

	@FindBy(xpath = "//*[normalize-space(text())='Print Current Page']")
	public UnityWebElement buttonCurrentPage;

	@FindBy(xpath = "//span[normalize-space(text())='Ok']")
	public UnityWebElement buttonPrintOk;

	// Add new elements
	@FindBy(xpath = "//button[@aria-label='Add new']")
	public UnityWebElement buttonAddNew;

	@FindBy(xpath = "//div[@id='account-list-account-selection']")
	public UnityWebElement buttonAccount;

	@FindBy(xpath = "//div[@id='account-list-account-group-selection']")
	public UnityWebElement buttonAccountGroup;

	@FindBy(xpath = "//div[@id='account-list-client-selection']")
	public UnityWebElement buttonClient;

	// Add new account group
	@FindBy(xpath = "//input[@placeholder='Group Abbreviation']")
	public UnityWebElement textboxGroupAbbreviation;

	@FindBy(xpath = "//input[@placeholder='Group Description']")
	public UnityWebElement textboxGroupDescription;

	@FindBy(xpath = "//div[@class='mat-select-trigger']")
	public UnityWebElement dropdownCurrency;

	@FindBy(xpath = "//mat-option[*[normalize-space(text())='USD']]")
	public UnityWebElement optionUSD;

	@FindBy(xpath = "//mat-option[*[normalize-space(text())='CAD']]")
	public UnityWebElement optionCAD;

	@FindBy(xpath = "//button[@aria-label='create']")
	public UnityWebElement buttonCreate;

	@FindBy(css = "div[role='grid']")
	public UnityGridElement gridAddNewAccountGroup;

	@FindBy(xpath = "//mat-dialog-content")
	public UnityWebElement labelSuccess;

	@FindBy(xpath = "//mat-dialog-actions/button")
	public UnityWebElement buttonOk;

	@FindBy(xpath = "//button[.//span[normalize-space(text())='Cancel']]")
	public UnityWebElement buttonCancel;

	@FindBy(xpath = "//mat-panel-title[normalize-space(text()='Advanced Search')]")
	public UnityWebElement panelAdvanceSearch;

	@FindBy(xpath = "//input[@placeholder='Portfolio number/name' or @placeholder='Name/Number']")
	public UnityWebElement textboxPortfolioNumberOrName;

	@FindBy(xpath = "//button[*[normalize-space(text())='Refresh']]")
	public UnityWebElement buttonACGRefresh;

	@FindBy(xpath = "//mat-select[@aria-label='Search By']")
	public UnityWebElement dropdownSearchParameter;

	@FindBy(xpath = "//mat-option//*[normalize-space(text())='Client Relationship']")
	public UnityWebElement optionClientRelationship;

	@FindBy(xpath = "//mat-option//*[normalize-space(text())='Employee Relationship']")
	public UnityWebElement optionEmployeeRelationship;

	@FindBy(xpath = "//input[@placeholder='Client Relationship']")
	public UnityWebElement textboxClientRelationship;

	@FindBy(xpath = "//input[@placeholder='Affiliation']")
	public UnityWebElement textboxAffiliation;

	@FindBy(xpath = "(//table)[1]")
	public UnityWebElement optionsClientRelationship;

	@FindBy(xpath = "(//table)[2]")
	public UnityWebElement optionsClientAffiliation;

	@FindBy(xpath = "//input[@placeholder='Employee Relationship']")
	public UnityWebElement textboxEmployeeRelationship;

	@FindBy(xpath = "(//table)[1]")
	public UnityWebElement optionsEmployeeRelationship;

	@FindBy(xpath = "(//table)[2]")
	public UnityWebElement optionsEmployeeAffiliation;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Account Name']]//input")
	public UnityWebElement checkboxAccountName;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Base Currency *']]//input")
	public UnityWebElement checkboxBaseCurrencyAccountGroup;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Portfolio Currency']]//input")
	public UnityWebElement checkboxPortfolioCurrency;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Portfolio Name']]//input")
	public UnityWebElement checkboxPortfolioName;

	// grid filter options
	@FindBy(xpath = "//mat-checkbox[@aria-label='Recent']//input")
	public UnityWebElement checkboxRecent;

	//@FindBy(xpath = "//mat-checkbox[@aria-label='Reset']//input")
	@FindBy(xpath = "//label[normalize-space(text())='Reset']/ancestor::mat-checkbox")
	public UnityWebElement checkboxClear;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Base Currency']]//input")
	public UnityWebElement checkboxBaseCurrency;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Begin to Close Date']]//input")
	public UnityWebElement checkboxBeginToCloseDate;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Branch']]//input")
	public UnityWebElement checkboxBranch;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Date Funded']]//input")
	public UnityWebElement checkboxDateFunded;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Date Opened']]//input")
	public UnityWebElement checkboxDateOpened;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Database Currency']]//input")
	public UnityWebElement checkboxDatabaseCurrency;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Market Value Settle Date (Base)']]//input")
	public UnityWebElement checkboxMarketSettleValueBase;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Market Value Trade Date (Database)']]//input")
	public UnityWebElement checkboxMarketTradeValueDatabase;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Market Value Settle Date (Database)']]//input")
	public UnityWebElement checkboxMarketSettleValueDatabase;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Year to Date Fee Revenue (Base)']]//input")
	public UnityWebElement checkboxYearToDateFeeRevenueBase;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Year to Date Fee Revenue (Database)']]//input")
	public UnityWebElement checkboxYearToDateFeeRevenueDatabase;

	// View: dropdown elements
	@FindBy(xpath = "//*[normalize-space(text())='View:']/following::span[1]")
	public UnityWebElement labelSelectedView;

	@FindBy(xpath = "//label[normalize-space(text())='Accounts']/ancestor::mat-checkbox")
	public UnityWebElement checkboxAccounts;

	@FindBy(xpath = "//label[normalize-space(text())='Clients']/ancestor::mat-checkbox")
	public UnityWebElement checkboxClients;

	@FindBy(xpath = "//label[normalize-space(text())='Account Groups']/ancestor::mat-checkbox")
	public UnityWebElement checkboxSystemDefinedAccountGroups;

	@FindBy(xpath = "//label[normalize-space(text())='User Defined Account Groups']/ancestor::mat-checkbox")
	public UnityWebElement checkboxUserDefinedAccountGroups;
	
	@FindBy(xpath = "//label[normalize-space(text())='Business Relationships']/ancestor::mat-checkbox")
	public UnityWebElement checkboxBusinessRelationships;

	@FindBy(xpath = "//button[@id='account-list-filter-refresh']")
	public UnityWebElement buttonRefresh;

	// Add new client

	@FindBy(xpath = "//iframe[contains(@src,'ClientAdd')]")
	public UnityWebElement frameAddNewClient;

	@FindBy(xpath = "//input[contains(@id,'ClientType_ctlCodeFile_Input')]")
	public UnityWebElement dropdownTypeOfClient;

	@FindBy(xpath = "//div[contains(@id,'ClientName_ctlClientType_ctlCodeFile_DropDown')]")
	public UnityWebElement optionsTypeOfClient;

	@FindBy(xpath = "//input[contains(@id,'ClientName_ctlFullName')]")
	public UnityWebElement textboxFullName;

	@FindBy(xpath = "//input[contains(@id,'ClientName_ctlLastName')]")
	public UnityWebElement textboxLastName;

	@FindBy(xpath = "//input[contains(@id,'ctlClientAddress_ctlStreetNumber')]")
	public UnityWebElement textboxStreetNumber;

	@FindBy(xpath = "//input[contains(@id,'ctlClientAddress_ctlStreetName')]")
	public UnityWebElement textboxStreetName;

	@FindBy(xpath = "//input[contains(@id,'ctlClientAddress_ctlCity')]")
	public UnityWebElement textboxCity;

	@FindBy(xpath = "//input[contains(@id,'ctlClientAddress_ctlState_ctlCodeFile_Input')]")
	public UnityWebElement dropdownState;

	@FindBy(xpath = "//div[contains(@id,'ClientAddress_ctlState_ctlCodeFile_DropDown')]")
	public UnityWebElement optionsState;

	@FindBy(xpath = "//input[contains(@id,'ctlClientAddress_ctlCountry_ctlCodeFile_Input')]")
	public UnityWebElement dropdownCountry;

	@FindBy(xpath = "//div[contains(@id,'ClientAddress_ctlCountry_ctlCodeFile_DropDown')]")
	public UnityWebElement optionsCountry;

	@FindBy(xpath = "//input[contains(@id,'ctlClientAddress_ctlZipPostalCode')]")
	public UnityWebElement textboxZipPostalCode;

	@FindBy(xpath = "//input[contains(@id,'ctlClientBankingInformation_ctlBank_ctlCodeFile_Input')]")
	public UnityWebElement dropdownBank;

	@FindBy(xpath = "//div[contains(@id,'ctlClientBankingInformation_ctlBank_ctlCodeFile_DropDown')]")
	public UnityWebElement optionsBank;

	@FindBy(xpath = "//input[contains(@id,'ctlClientTaxInformation_ctlTaxCountry_ctlCodeFile_Input')]")
	public UnityWebElement dropdownTaxCountry;

	@FindBy(xpath = "//div[contains(@id,'ctlClientTaxInformation_ctlTaxCountry_ctlCodeFile_DropDown')]")
	public UnityWebElement optionsTaxCountry;

	@FindBy(xpath = "//input[contains(@id,'ctlClientTaxInformation_ctlTaxStateProv_ctlCodeFile_Input')]")
	public UnityWebElement dropdownTaxStateOrProvince;

	@FindBy(xpath = "//div[contains(@id,'ctlClientTaxInformation_ctlTaxStateProv_ctlCodeFile_DropDown')]")
	public UnityWebElement optionsTaxStateOrProvince;

	@FindBy(xpath = "//input[contains(@id,'ClientMiscInformation_ctlContactBranch_ctlCodeFile_Input')]")
	public UnityWebElement dropdownContactBranch;

	@FindBy(xpath = "//div[contains(@id,'ClientMiscInformation_ctlContactBranch_ctlCodeFile_DropDown')]")
	public UnityWebElement optionsContactBranch;

	@FindBy(xpath = "//iframe[contains(@id,'iFrame')]")
	public UnityWebElement frameAddClient;

	@FindBy(xpath = "//a[normalize-space(text())='Add Comments']")
	public UnityWebElement linkAddComments;

	@FindBy(xpath = "//textarea[contains(@id,'ctlCommentsControl_ctlEnterComments')]")
	public UnityWebElement textboxComments;

	@FindBy(xpath = "//input[@value='Save']")
	public UnityWebElement buttonSaveAddClient;

	@FindBy(xpath = "//tr//input[@value='Submit']")
	public UnityWebElement buttonSubmitAddClient;

	@FindBy(xpath = "//input[@value='No']")
	public UnityWebElement buttonNo;

	// Grid action elements
	@FindBy(xpath = "//span[@class='ag-loading-icon']")
	private UnityWebElement labelLoading;

	@FindBy(xpath = "//unity-ag-grid-component//div[@class='grid-panel']//div[@ref='eBodyContainer']/div[1]")
	private UnityWebElement firstRowInGrid;

	@FindBy(xpath = "//input[contains(@class,'account-list-search-box')]")
	public UnityWebElement textboxSearch;

	// Not sure which filter it is - Neeraj
	// Need to check and update
	@FindBy(xpath = "//a[@aria-label='Open filter modal']")
	public UnityWebElement linkFilter;

	@FindBy(xpath = "//ag-grid-angular")
	public UnityGridElement gridAccountList;

	@FindBy(xpath = "//div[@role='grid']")
	public UnityGridElement gridCashBalances;

	@FindBy(xpath = "//*[normalize-space(text())='No Results']")
	public UnityWebElement labelNoResultsInGrid;

	// Account Group
	@FindBy(xpath = "//*[normalize-space(text())='Portfolios in account group']")
	public UnityWebElement panelPortfoliosInAccountGroup;

	@FindBy(xpath = "//*[normalize-space(text())='Add Portfolios']")
	public UnityWebElement panelAddPortfolios;

	@FindBy(xpath = "//div[contains(@id,'new-acgrp-portfolio-list')]//div[@role='grid']")
	public UnityGridElement gridAddPortfolios;

	@FindBy(xpath = "//button[span[contains(text(),'Save')]]")
	public UnityWebElement buttonSave;

	// Edit account group
	@FindBy(css = "div[role='grid']")
	public UnityGridElement gridPortfoliosInAccountGroup;

	@FindBy(xpath = "//span[@id='account-group-search']//span")
	public UnityWebElement buttonSearchAddPortfolios;

	@FindBy(xpath = "//input[@placeholder='Portfolio Number/Name']")
	public UnityWebElement textboxSearchAddPortfolios;

	@FindBy(xpath = "//button[@id='account-group-search-refresh']")
	public UnityWebElement buttonRefreshAddPortfolios;

	@FindBy(xpath = "//button[@id='account-group-search-refresh']")
	public UnityWebElement gridEditAddPortfolios;

	@FindBy(xpath = "//span[normalize-space(text())='Cash Value Settle Date (Base)']/preceding-sibling::div/input")
	public UnityWebElement checkboxCashValueSettleDtBase;

	@FindBy(xpath = "//span[normalize-space(text())='Cash Value Settle Date (Database)']/preceding-sibling::div/input")
	public UnityWebElement checkboxCashValueSettleDtDatabase;

	@FindBy(xpath = "//span[normalize-space(text())='Cash Value Trade Date (Database)']/preceding-sibling::div/input")
	public UnityWebElement checkboxCashValueTradeDtDatabase;

	@FindBy(xpath = "//span[normalize-space(text())='Client Address']/preceding-sibling::div/input")
	public UnityWebElement checkboxClientAddress;

	@FindBy(xpath = "//button[@id='account-group-status-close']")
	public UnityWebElement buttonClose;

	@FindBy(xpath = "//span[normalize-space(text())='✕']")
	public UnityWebElement buttonFilterClose;

	@FindBy(xpath = "//span[@class='search-display-text']")
	public UnityWebElement buttonSearchPortfolios;

	@FindBy(xpath = "//text-search-button-component//input[@type='text']")
	public UnityWebElement textboxSearchPortfoliosInAccountGroup;

	@FindBy(xpath = "//span[normalize-space(text())='A maximum of 200 portfolios may be selected.']")
	public UnityWebElement labelMaximumPoint;

	@FindBy(xpath = "//div[@aria-label='Account Group Status']//mat-dialog-content")
	public UnityWebElement labelSuccessMessage;

	// Add Account
	@FindBy(xpath = "//span[contains(normalize-space(text()),'account')]")
	public UnityWebElement labelAddAccount;

	@FindBy(xpath = "//iframe[contains(@src,'TRANS=AccountAdd')]")
	public UnityWebElement frameAddAccount;

	@FindBy(xpath = "//input[contains(@id,'AccountLookup_ctlModelAccountLookup_ctlAccountModelRadComboBox_Input')]")
	public UnityWebElement textboxAccountModel;

	@FindBy(xpath = "//td[normalize-space(text())='Revocable Living Trusts']")
	public UnityWebElement optionsAccountModel;

	@FindBy(xpath = "//input[contains(@id,'ctlACContactInformation_ctlAcctNumber')]")
	public UnityWebElement textboxAccountNumber;

	@FindBy(xpath = "//input[contains(@id,'AcctOwner_ctlClientRadComboBox_Input')]")
	public UnityWebElement textboxAccountOwner;

	@FindBy(xpath = "//div[contains(@id,'ACContactInformation_ctlAcctOwner_ctlClientRadComboBox_DropDown')]")
	public UnityWebElement optionsAccountOwner;

	@FindBy(xpath = "//input[contains(@id,'ctlAdmin_ctlEmployeeLookupRadComboBox_Input')]")
	public UnityWebElement textboxAdministrator;

	@FindBy(xpath = "//div[contains(@id,'ctlContactInformation_ctlACContactInformation_ctlAdmin_ctlEmployeeLookupRadComboBox_DropDown')]")
	public UnityWebElement optionsAdministrator;

	@FindBy(xpath = "//input[contains(@id,'ctlACContactInformation_ctlName')]")
	public UnityWebElement textboxName;

	@FindBy(xpath = "//input[@value='Submit']")
	public UnityWebElement buttonSubmitAddAccount;

	@FindBy(xpath = "//*[@id='ctl01_ctl00_contentPlaceHolder_MainContent_contentPlaceHolder_AccountClientMaster_ctlDockDocuments_C_ctlDocuments_ctlDocsGrid']")
	public UnityWebElement tableDocuments;

	@FindBy(xpath = "//input[@value='Save']")
	public UnityWebElement buttonSaveAddAccount;

	@FindBy(xpath = "//a//mat-icon[contains(@class,'mat-icon notranslate fisfont fis-icon-search')]")
	public UnityWebElement iconSearch;

	// Account group trust desk

	@FindBy(xpath = "//div[@id='edit-account-group']//div[@role='grid']")
	public UnityGridElement gridEditAccountGroup;

	@FindBy(xpath = "//span[@id='account-group-search']")
	public UnityWebElement iconAccountGroupSearch;

	@FindBy(xpath = "//input[@placeholder='Acct/PT Number/Name' or @placeholder='Name/Number' and @type='text']")
	public UnityWebElement textboxAccountGroupActPtSearch;

	@FindBy(xpath = "//button[@id='account-group-search-refresh']")
	public UnityWebElement buttonAccountGroupSearchRefresh;

	@FindBy(xpath = "//p[normalize-space(text())='A maximum of 500 portfolios may be selected.']")
	public UnityWebElement labelMaximumPointPortfolio;

	@FindBy(xpath = "//table[contains(@class,'table-width review-selection-grid')]")
	public UnityTableElement tableReviewSelectionGridAccountGroup;

	@FindBy(xpath = "//a[normalize-space(text())='Select All']")
	public UnityWebElement linkSelectAll;

	@FindBy(xpath = "//a[normalize-space(text())='Unselect All']")
	public UnityWebElement linkUnSelectAll;

	@FindBy(xpath = "//input[@aria-label='selectAll']")
	public UnityWebElement checkboxSelectAll;

	@FindBy(xpath = "//view-by-filter//mat-icon")
	public UnityWebElement linkViewByFilter;

	@FindBy(xpath = "//span[normalize-space(text())='Account']/preceding-sibling::div/input")
	public UnityWebElement checkboxAccount;

	@FindBy(xpath = "//span[normalize-space(text())='Portfolios']/preceding-sibling::div/input")
	public UnityWebElement checkboxPortfolios;

	@FindBy(xpath = "//button[contains(@class,'mat-focus-indicator mat-raised-button mat-button-base mat-primary ruf')][span[normalize-space(text())='Refresh']]")
	public UnityWebElement buttonAccountGroupRefresh;

	@Override
	public void waitForPageToLoad() {
		startTime = System.currentTimeMillis();
		if (super.isPageLoaded(driver))
			try {
				headerUnity.waitforVisible(AppConstants.PAGE_LOAD_TIMEOUT);
				endTime = System.currentTimeMillis();
				pageLoadTime = (endTime - startTime) / 1000;
			} catch (Exception e) {
				Assert.fail("Expected page did not load\n");
			}
		else {
			Assert.fail("Timed out after " + AppConstants.PAGE_LOAD_TIMEOUT + " seconds\n");
		}
	}

	public void waitForGridToLoad() {
		super.isPageLoaded(driver);
		labelLoading.waitforInvisible();
		gridAccountList.waitforVisible();
	}

	public void waitForGridToLoadElements() {
		super.isPageLoaded(driver);
		labelLoading.waitforInvisible();
		gridAccountList.waitforVisible();
		firstRowInGrid.waitforVisible();
	}

	/**
	 * This method does the following: Select all options in the View menu. Un-check
	 * BoB and Favorite check boxes
	 */
	public void setDefaultState() {
		String propertyName = "aria-checked";
		String propertyValue = "false";
		if (checkboxClear.getAttribute(propertyName).equalsIgnoreCase(propertyValue))
			checkboxClear.click();
		waitForPageToLoad();
		if (!labelSelectedView.getText().trim().contains("All")) {
			dropdownView.click();
			checkboxAccounts.waitforVisible();
			if (checkboxAccounts.getAttribute(propertyName).equalsIgnoreCase(propertyValue))
				checkboxAccounts.click();
			if (checkboxClients.getAttribute(propertyName).equalsIgnoreCase(propertyValue))
				checkboxClients.click();
			if (checkboxSystemDefinedAccountGroups.getAttribute(propertyName).equalsIgnoreCase(propertyValue))
				checkboxSystemDefinedAccountGroups.click();
			if (checkboxUserDefinedAccountGroups.getAttribute(propertyName).equalsIgnoreCase(propertyValue))
				checkboxUserDefinedAccountGroups.click();
			buttonRefresh.click();
			waitForGridToLoad();
		}
		waitForPageToLoad();
	}

	public void selectAccountInGrid(String accountNumber) {
		waitForGridToLoad();
		textboxSearch.sendKeys(accountNumber);
		UnityUtils.wait(1000);
		waitForGridToLoad();
		gridAccountList
				.findElements(By.xpath(".//div[contains(@title,'" + accountNumber + "')]/following-sibling::div//a"))
				.get(0).click();
		UnityUtils.wait(1000);
	}

	public void selectLinkInGrid(String linkText) {
		textboxSearch.sendKeys(linkText);
		UnityUtils.wait(1000);
		waitForGridToLoad();
		gridAccountList.findElements(By.xpath("//span[normalize-space(text())='" + linkText + "']")).get(0).click();
		UnityUtils.wait(1000);
	}
}