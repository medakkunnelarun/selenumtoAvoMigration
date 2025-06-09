package com.unity.pages;

import java.util.List;

import org.openqa.selenium.By;
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

public class CommonMenuPage extends BaseTestPage {

	WebDriver driver;

	public CommonMenuPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}
	
//	@FindBy(xpath = "//a[span[normalize-space(text())='Document Library']]")
//    public UnityWebElement linkDocumentLibrary;
	
	@FindBy(xpath = "//a[span[normalize-space(text())='Workflow Activity']]")
	public UnityWebElement linkWorkflowActivity;
	
	@FindBy(xpath = "(.//*[contains(text(),'Plans')]/following::div//div[@class='grid-panel'])[1]")
    public UnityGridElement panelSearchPlangrid;
	
	@FindBy(xpath = "//span[text()=' Retirement Management ']")
    public UnityWebElement linkRetirementManagement;
	
	@FindBy(xpath = "//*[normalize-space(text())='Search by Participant']")
	public UnityWebElement labelSearchByParticipant;
	
	@FindBy(xpath = "//*[normalize-space(text())='Search by Participant']/following::div/input")
	public UnityWebElement textboxSearchByParticipant;
	
	@FindBy(xpath = ".//mat-expansion-panel//mat-panel-title[contains(text(),'Participants')]")
	public UnityWebElement panelSearchAccorParticipant;
	
	@FindBy(xpath = "(.//*[contains(text(),'Participants')]/following::div//div[@class='grid-panel'])[1]")
	public UnityGridElement panelSearchParticipantgrid;

	@FindBy(xpath = "//span[text()=' User Request List ']")
	public UnityWebElement linkUserRequestList;

	@FindBy(xpath = "//span[text()=' Worklist ']")
	public UnityWebElement linkWorklist;

	@FindBy(xpath = "//*[normalize-space(text())='Email error report']")
	public UnityWebElement labelEmailErrorReport;
	
	@FindBy(xpath = "//ruf-page-header-title")
	public UnityWebElement labelAccountName;
	
	@FindBy(xpath = "//a[span[normalize-space(text())='Vault']]")
	public UnityWebElement linkVault;
	
	@FindBy(xpath = "//*[normalize-space(text())='Public Vault']//ancestor::mat-expansion-panel[1]//unity-upgrade-column-filter/button")
	public UnityWebElement buttonColumnSettingsPublicVault;

	@FindBy(xpath = "//*[normalize-space(text())='Personal Vault']//ancestor::mat-expansion-panel[1]//unity-upgrade-column-filter/button")
	public UnityWebElement buttonColumnSettingsPersonalVault;
	
	@FindBy(xpath = "//*[normalize-space(text())='Public Vault']//ancestor::mat-expansion-panel[1]//button//mat-icon[@fisicon='print']")
	public UnityWebElement buttonPrintPublicVault;
	
	@FindBy(xpath = "//*[normalize-space(text())='Personal Vault']//ancestor::mat-expansion-panel[1]//button//mat-icon[@fisicon='print']")
	public UnityWebElement buttonPrintPersonalVault;
	
	@FindBy(xpath = "//*[normalize-space(text())='Public Vault']//ancestor::mat-expansion-panel[1]//button//mat-icon[@fisicon='export']")
	public UnityWebElement buttonExportPublicVault;
	
	@FindBy(xpath = "//*[normalize-space(text())='Personal Vault']//ancestor::mat-expansion-panel[1]//button//mat-icon[@fisicon='export']")
	public UnityWebElement buttonExportPersonalVault;
	
	@FindBy(xpath = "//*[normalize-space(text())='Public Vault']//ancestor::mat-expansion-panel[1]//unity-upgrade-column-filter/preceding-sibling::button")
	public UnityWebElement buttonClearAllFilterPublicVault;
	
	@FindBy(xpath = "//*[normalize-space(text())='Personal Vault']//ancestor::mat-expansion-panel[1]//unity-upgrade-column-filter/preceding-sibling::button")
	public UnityWebElement buttonClearAllFilterPersonalVault;
	
	@FindBy(xpath = "//*[normalize-space(text())='Add New']")
	public UnityWebElement buttonAddNew;
	
	@FindBy(xpath = "//*[normalize-space(text())='Date:']")
	public UnityWebElement labelDate;
	
	@FindBy(xpath = "//a[span[normalize-space(text())='Fee Oversight']]")
	public UnityWebElement linkFeeFeeOversight;
	
	@FindBy(xpath = "//a[span[normalize-space(text())='Fee Receivables']]")
	public UnityWebElement linkFeeReceivables;
	
	@FindBy(xpath = "//mat-icon[@fisicon = 'notification']")
	public UnityWebElement iconNotificationBell;
	
	@FindBy(xpath = "//span[@id= 'mat-badge-content-0']")
	public UnityWebElement panelNotificationCount;
	
	@FindBy(xpath = "//div[@class = 'mat-menu-content']")
	public UnityWebElement panelRecentNotification;
	
	@FindBy(xpath = "//button//span[text() = ' View Details ']")
	public UnityWebElement buttonViewDetailsNotificationPanel;
	
	@FindBy(xpath = "//div[@class='mat-menu-content']//div[@class='ng-star-inserted']")
	public List<WebElement> gridNotificationPanel;
	
	@FindBy(xpath = "//div[@class='mat-menu-content']//div[@class='ng-star-inserted']//p")
	public List<WebElement> labelNotificationPanel;

	@FindBy(xpath = "(//td[@class='comment-header'])[last()]")
	public UnityWebElement labelLoggedInUserName;

	@FindBy(xpath = "//div[@class='profile-details']/span[2]")
	public UnityWebElement labelLastLoginTimestamp;

	@FindBy(xpath = "//div[@class='profile-details']/span/div[@mattooltip]")
	public UnityWebElement tooltipLastLoginTimestamp;

	// *Left-side menu items - start*
	@FindBy(xpath = "//a[span[normalize-space(text())='Home Office']]")
	public UnityWebElement linkHomeOffice;

	@FindBy(xpath = "//a[span[normalize-space(text())='Dashboard']]")
	public UnityWebElement linkDashboard;

	@FindBy(xpath = "//a[span[normalize-space(text())='Memos']]")
	public UnityWebElement linkMemos;

	@FindBy(xpath = "//a[span[normalize-space(text())='Account Management']]")
	public UnityWebElement linkAccountManagement;

	// *Account management menu-items*
	@FindBy(xpath = "//a[span[normalize-space(text())='Account List']]")
	public UnityWebElement linkAccountList;

	@FindBy(xpath = "//a[span[normalize-space(text())='Account Details']]")
	public UnityWebElement linkAccountDetails;

	@FindBy(xpath = "//a[span[normalize-space(text())='Balance']]")
	public UnityWebElement linkBalance;

	@FindBy(xpath = "//a[span[normalize-space(text())='Holdings']]")
	public UnityWebElement linkHoldings;

	@FindBy(xpath = "//a[span[normalize-space(text())='Activity']]")
	public UnityWebElement linkActivity;

	@FindBy(xpath = "//a[span[normalize-space(text())='Pending Activity']]")
	public UnityWebElement linkPendingActivity;

	@FindBy(xpath = "//a[span[normalize-space(text())='Events']]")
	public UnityWebElement linkEvents;

	@FindBy(xpath = "//a[span[normalize-space(text())='Service & Operations']]")
	public UnityWebElement linkServiceAndOperations;

	// *Service & Operations menu-items*
	@FindBy(xpath = "//a[span[normalize-space(text())='Service & Operations']]/../..//a[span[normalize-space(text())='Dashboard']]")
	public UnityWebElement linkSnoDashboard;

	@FindBy(xpath = "//a[span[normalize-space(text())='Cash Processing']]")
	public UnityWebElement linkCashProcessing;
	
	@FindBy(xpath = "//a[span[normalize-space(text())='Pending Cash Receipts']]")
	public UnityWebElement linkPendingCashReceipts;

	@FindBy(xpath = "//a[span[normalize-space(text())='Security Movement']]")
	public UnityWebElement linkSecurityMovement;

	@FindBy(xpath = "//a[span[normalize-space(text())='Trading']]")
	public UnityWebElement linkTrading;

	@FindBy(xpath = "//a[span[normalize-space(text())='Bill Pay']]")
	public UnityWebElement linkBillPay;

	@FindBy(xpath = "//a[span[normalize-space(text())='Tickets']]")
	public UnityWebElement linkTickets;

	@FindBy(xpath = "//a[span[normalize-space(text())='Utilities']]")
	public UnityWebElement linkUtilities;

	@FindBy(xpath = "//a[span[normalize-space(text())='Processes']]")
	public UnityWebElement linkProcesses;

	@FindBy(xpath = "//a[span[normalize-space(text())='Maintenance']]")
	public UnityWebElement linkMaintenance;

	@FindBy(xpath = "//a[span[normalize-space(text())='Maintenance - GO']]")
	public UnityWebElement linkMaintenanceGO;

	@FindBy(xpath = "//a[span[normalize-space(text())='Forms Processing']]")
	public UnityWebElement linkFormsProcessing;

	@FindBy(xpath = "//a[span[normalize-space(text())='Service & Operations Reports']]")
	public UnityWebElement linkServiceAndOperationsReports;

	@FindBy(xpath = "//a[span[normalize-space(text())='Qualified Plan Processing']]")
	public UnityWebElement linkQualifiedPlanProcessing;

	// Financial Planning menu items
	@FindBy(xpath = "(//a[span[normalize-space(text())='Financial Planning']])")
	public UnityWebElement linkFinancialPlanning;

	// Performance menu items
	@FindBy(xpath = "//a[span[normalize-space(text())='Performance']]")
	public UnityWebElement linkPerformance;

	@FindBy(xpath = "//a[span[normalize-space(text())='Performance']]/../following-sibling::ul//a[span[normalize-space(text())='Report History']]")
	public UnityWebElement linkPerformanceReports;

	@FindBy(xpath = "//a[span[normalize-space(text())='Historical Results']]")
	public UnityWebElement linkHistoricalResults;

	@FindBy(xpath = "//span[contains(normalize-space(text()),'Search')]")
	public UnityWebElement iconSearch;

	// Document library menu items
	@FindBy(xpath = "//a[span[normalize-space(text())='Document Library']]")
	public UnityWebElement linkDocumentLibrary;

	@FindBy(xpath = "//a[span[normalize-space(text())='Documents']]")
	public UnityWebElement linkDocuments;

	@FindBy(xpath = "//a[span[normalize-space(text())='Analytics']]")
	public UnityWebElement linkAnalytics;

	@FindBy(xpath = "//a[span[normalize-space(text())='Statements']]")
	public UnityWebElement linkStatements;

	@FindBy(xpath = "//a[span[normalize-space(text())='Tax Documents']]")
	public UnityWebElement linkTaxDocuments;

	@FindBy(xpath = "//a[span[normalize-space(text())='Forms Admin']]")
	public UnityWebElement linkFormsAdmin;

	@FindBy(xpath = "//a[span[normalize-space(text())='Form Maintenance']]")
	public UnityWebElement linkFormMaintenance;

	// Portfolio management menu items
	@FindBy(xpath = "//a[span[normalize-space(text())='Portfolio Management']]")
	public UnityWebElement linkPortfolioManagement;

	// Performance report menu items
	@FindBy(xpath = "//a[span[normalize-space(text())='Performance Report']]")
	public UnityWebElement linkPerformanceReport;

	@FindBy(xpath = "//div[@class='events-dropdown']")
	public UnityWebElement labelPortfolioManagementPopUp;

	// Clinet portal menu items
	@FindBy(xpath = "//a[span[normalize-space(text())='Client Portal']]")
	public UnityWebElement linkClientPortal;

	// Investment report menu items
	@FindBy(xpath = "//a[span[normalize-space(text())='Investment Report']]")
	public UnityWebElement linkInvestmentReport;

	// *Left-side menu items - end*

	// Left side Menu icons
	@FindBy(xpath = "//div[contains(@class,'menu-toggle')]/mat-icon")
	public UnityWebElement buttonCollapse;

	@FindBy(xpath = "//a[@title='Home Office']")
	public UnityWebElement linkHomeOfficeIcon;

	@FindBy(xpath = "//a[@title='Account Management']")
	public UnityWebElement linkAccountManagementIcon;

	@FindBy(xpath = "//a[@title='Service & Operations']")
	public UnityWebElement linkServiceAndOperationsIcon;

	@FindBy(xpath = "//a[@title='Performance']")
	public UnityWebElement linkPerformanceIcon;

	@FindBy(xpath = "//a[@title='Financial Planning']")
	public UnityWebElement linkFinancialPlanningIcon;

	@FindBy(xpath = "//*[@title='Portfolio Management']//a")
	public UnityWebElement linkPorfolioManagementIcon;

	@FindBy(xpath = "//a[@title='Document Library']")
	public UnityWebElement linkDocumentLibraryIcon;

	@FindBy(xpath = "//*[@role='menu']")
	public UnityWebElement panelMenu;

	@FindBy(xpath = "//*[@role='menu'])[2]")
	public UnityWebElement panelMenuWhenClient;

	@FindBy(xpath = "//a[@title='Home Office']")
	public UnityWebElement buttonHomeOffice;

	@FindBy(xpath = "//span[normalize-space(text())='Dashboard']")
	public UnityWebElement buttonDashboard;

	@FindBy(xpath = "//span[normalize-space(text())='Memos']")
	public UnityWebElement buttonMemos;

	@FindBy(xpath = "//span[normalize-space(text())='Account List']")
	public UnityWebElement buttonAccountList;

	@FindBy(xpath = "//span[normalize-space(text())='Account Details']")
	public UnityWebElement buttonAccountDetails;

	@FindBy(xpath = "//span[normalize-space(text())='Account Group Details']")
	public UnityWebElement buttonAccountGroupDetails;
	
	@FindBy(xpath = "//span[normalize-space(text())='Business Relationship Details']")
	public UnityWebElement buttonBusinessRelationshipDetails;

	@FindBy(xpath = "//span[normalize-space(text())='Balance']")
	public UnityWebElement buttonBalance;

	@FindBy(xpath = "//span[normalize-space(text())='Holdings']")
	public UnityWebElement buttonHoldings;

	@FindBy(xpath = "//span[normalize-space(text())='Activity']")
	public UnityWebElement buttonActivity;

	@FindBy(xpath = "//span[normalize-space(text())='Client Details']")
	public UnityWebElement buttonClientDetails;

	@FindBy(xpath = "//*[@role='menuitem'][span[normalize-space(text())='Events']]")
	public UnityWebElement buttonEvents;

	@FindBy(xpath = "//span[normalize-space(text())='Maintenance']")
	public UnityWebElement buttonMaintenance;

	@FindBy(xpath = "//span[normalize-space(text())='Service & Operations Reports']")
	public UnityWebElement buttonServiceAndOperationsReports;

	@FindBy(xpath = "//span[normalize-space(text())='Cash Processing']")
	public UnityWebElement buttonCashProcessing;

	@FindBy(xpath = "//span[normalize-space(text())='Security Movement']")
	public UnityWebElement buttonSecurityMovement;

	@FindBy(xpath = "//span[normalize-space(text())='Trading']")
	public UnityWebElement buttonTrading;

	@FindBy(xpath = "//span[normalize-space(text())='Bill pay']")
	public UnityWebElement buttonBillPay;

	@FindBy(xpath = "//span[normalize-space(text())='Tickets']")
	public UnityWebElement buttonTickets;

	@FindBy(xpath = "//span[normalize-space(text())='Utilities']")
	public UnityWebElement buttonUtilities;

	@FindBy(xpath = "//span[normalize-space(text())='Processes']")
	public UnityWebElement buttonProcesses;

	@FindBy(xpath = "//span[normalize-space(text())='Financial Planning']")
	public UnityWebElement buttonFinancialPlanning;

	@FindBy(xpath = "//i[contains(@class,'glyphicons x2 glyphicons-stats')]")
	public UnityWebElement buttonPerformance;

	//@FindBy(xpath = "//button[normalize-space(text())='Reports']")
	@FindBy(xpath = "//button//span[normalize-space(text())='Reports']")
	public UnityWebElement buttonReports;

	@FindBy(xpath = "//button//span[normalize-space(text())='Analytics']")
	public UnityWebElement buttonAnalytics;

	@FindBy(xpath = "//span[normalize-space(text())='Historical Results']")
	public UnityWebElement buttonHistoricalResults;

	@FindBy(xpath = "//button//span[normalize-space(text())='Documents']")
	public UnityWebElement buttonDocuments;

	@FindBy(xpath = "//button//span[normalize-space(text())='Statements']")
	public UnityWebElement buttonStatements;

	@FindBy(xpath = "//button//span[normalize-space(text())='Tax Documents']")
	public UnityWebElement buttonTaxDocuments;

	@FindBy(xpath = "//div[contains(text(),'Portfolio Management ')]")
	public UnityWebElement buttonPorfolioManagement;

	// *Top menu-items - start
	@FindBy(xpath = "//unity-search//button")
	public UnityWebElement iconGlobalSearch;
	
	@FindBy(xpath = "(//unity-search//button)[2]")
	public UnityWebElement iconLocalSearch;

	@FindBy(xpath = "//*[normalize-space(text())='Search By']")
	public UnityWebElement labelSearchBy;
	
	@FindBy(xpath = "//*[normalize-space(text())='Search by Account']")
	public UnityWebElement labelSearchByAccount;
	
	@FindBy(xpath = "//*[normalize-space(text())='Search by Client']")
	public UnityWebElement labelSearchByClient;

	//@FindBy(xpath = "//*[normalize-space(text())='Search By']/ancestor::div/input")
	@FindBy(xpath = "//*[normalize-space(text())='Search By']/following::div/input")
	public UnityWebElement textboxSearch;
	
	//@FindBy(xpath = "//*[normalize-space(text())='Search by Account']/ancestor::div/input")
	@FindBy(xpath = "//*[normalize-space(text())='Search by Account']/following::div/input")
	public UnityWebElement textboxSearchByAccount;
	
	//@FindBy(xpath = "//*[normalize-space(text())='Search by Client']/ancestor::div/input")
	@FindBy(xpath = "//*[normalize-space(text())='Search by Client']/following::div/input")
	public UnityWebElement textboxSearchByClient;

	@FindBy(xpath = "//mat-dialog-container")
	public UnityWebElement panelSearchResults;
	
	@FindBy(xpath = ".//mat-expansion-panel//mat-panel-title[contains(text(),'Accounts')]")
	public UnityWebElement panelSearchAccorAccount;
	
	@FindBy(xpath = ".//mat-expansion-panel//mat-panel-title[contains(text(),'Clients')]")
	public UnityWebElement panelSearchAccorClient;
	
	@FindBy(xpath = ".//mat-expansion-panel//mat-panel-title[contains(text(),'Business Relationships')]")
	public UnityWebElement panelSearchAccorBR;
	
	@FindBy(xpath = ".//mat-expansion-panel//mat-panel-title[contains(text(),'Account Groups')]")
	public UnityWebElement panelSearchAccorAG;
	
	@FindBy(xpath = ".//mat-expansion-panel//mat-panel-title[contains(text(),'Plans')]")
	public UnityWebElement panelSearchAccorPlan;
	
//	@FindBy(xpath = ".//mat-expansion-panel//mat-panel-title[contains(text(),'Participants')]")
//	public UnityWebElement panelSearchAccorParticipant;
	
	@FindBy(xpath = "(.//*[contains(text(),'Accounts')]/following::div//div[@class='grid-panel'])[1]")
	public UnityGridElement panelSearchAccountgrid;
	
	@FindBy(xpath = "(.//*[contains(text(),'Accounts')]/following::div//div[@class='grid-panel'])[last()]")
	public UnityGridElement panelSearchLocalAccountgrid;
	
	@FindBy(xpath = "(.//*[contains(text(),'Clients')]/following::div//div[@class='grid-panel'])[1]")
	public UnityGridElement panelSearchClientgrid;
	
//	@FindBy(xpath = "(.//*[contains(text(),'Participants')]/following::div//div[@class='grid-panel'])[1]")
//	public UnityGridElement panelSearchParticipantgrid;
	
//	@FindBy(xpath = "(.//*[contains(text(),'Plans')]/following::div//div[@class='grid-panel'])[1]")
//	public UnityGridElement panelSearchPlangrid;
	
	@FindBy(xpath = "(.//*[contains(text(),'Business Relationships')]/following::div//div[@class='grid-panel'])[1]")
	public UnityGridElement panelSearchBRgrid;
	
	@FindBy(xpath = "(.//*[contains(text(),'Account Groups')]/following::div//div[@class='grid-panel'])[1]")
	public UnityGridElement panelSearchAGgrid;
	
	@FindBy(xpath = "//button//mat-icon[@fisicon='close']")
	public UnityWebElement panelSearchCloseIcon;

	@FindBy(xpath = "//button[@overlaypanelclass='user-request-menu']")
	public UnityWebElement buttonlinks;

//	@FindBy(xpath = "//button[normalize-space(text())='User Request List']")
//	public UnityWebElement linkUserRequestList;
//
//	@FindBy(xpath = "//button[normalize-space(text())='Worklist']")
//	public UnityWebElement linkWorklist;

	@FindBy(xpath = "//button[normalize-space(text())='IPP']")
	public UnityWebElement linkIPP;

	@FindBy(xpath = "//button[normalize-space(text())='Reports']")
	public UnityWebElement linkReports;

	@FindBy(xpath = "//button[contains(@class,'profile')]")
	public UnityWebElement linkProfile;

	@FindBy(xpath = "//button[span[normalize-space(text())='Book of Business']]")
	public UnityWebElement linkBookOfBusiness;

	@FindBy(xpath = "//button[span[normalize-space(text())='Change Password']]")
	public UnityWebElement linkChangePassword;

	@FindBy(xpath = "//*[normalize-space(text())='User Preference']")
	public UnityWebElement linkUserPreference;

	@FindBy(xpath = "//*[normalize-space(text())='Logout']")
	public UnityWebElement linkLogout;

	// *Frame change password - Not updated for 21.3
	@FindBy(xpath = "//h2[normalize-space(text())='Change Password']")
	public UnityWebElement headerChangePassword;

	@FindBy(xpath = "//iframe[@id='iFrame']")
	public UnityWebElement frameChangePassword;

	@FindBy(xpath = "//li[@fis-unique-id='top_level_utility_UserSettings']/a")
	public UnityWebElement linkUserSettings;

	@FindBy(xpath = "//div/span[normalize-space(text())='Settings']")
	public UnityWebElement linkSettings;

	@FindBy(xpath = "//span[normalize-space(text())='Old Password:']")
	public UnityWebElement labelOldPassword;

	// *Top menu-items - end*

	// Book of business controls - Not updated for 21.3
	@FindBy(xpath = "//h2[normalize-space(text())='Book of Business']")
	public UnityWebElement headerBookOfBusiness;

	@FindBy(xpath = "//h3[contains(text(),'BoB Definition')]")
	public UnityWebElement labelBoBDefinition;
	
	@FindBy(xpath = "//div[@class='mat-button-toggle-label-content' and contains(text(),' By Relationship ')]")
	public UnityWebElement tabByRelationship;
	
	@FindBy(xpath = "//div[@class='mat-button-toggle-label-content' and contains(text(),' By Other ')]")
	public UnityWebElement tabByOther;
	
	@FindBy(xpath = "//div[@class='mat-button-toggle-label-content' and contains(text(),' AND ')]")
	public UnityWebElement toogleAnd;
	
	@FindBy(xpath = "//div[@class='mat-button-toggle-label-content' and contains(text(),' OR ')]")
	public UnityWebElement toogleOr;
	
	@FindBy(xpath = "//div[@class='mat-select-value']//span[contains(text(),'Branch Code')]")
	public UnityWebElement panelBranchCode;
	
	@FindBy(xpath = "//div[@class='mat-select-value']//span[contains(text(),'Account Type')]")
	public UnityWebElement panelAccountType;
	
	@FindBy(xpath = "//div[@class='mat-select-value']//span[contains(text(),'Capacity Code')]")
	public UnityWebElement panelCapacityCode;

	@FindBy(xpath = "//div[contains(@class,'text-danger definitionsReached')]")
	public UnityWebElement labelErrorMaxDefinitions;

	@FindBy(xpath = "//ul[@class='bob-list bobTree']//li")
	public UnityWebElement labelBOBUserName;
	
	@FindBy(xpath = "//ul[@class='bob-list bobTree']//li//a")
	public UnityWebElement iconDelete;

	@FindBy(xpath = "//a[@title='Remove']")
	public List<WebElement> buttonListRemoveBoBDefinition;

	@FindBy(xpath = "//mat-select[@aria-label='My Relationship']//following-sibling::span[@class='mat-form-field-label-wrapper']")
	public UnityWebElement dropdownMyRelationship;

	@FindBy(xpath = "//div[contains(@class,'mat-select-content')]//mat-option")
	public List<WebElement> listDropdownOptionsBoBPopup;

	@FindBy(xpath = "//mat-option[.//span[normalize-space(text())='Account Assistant']]")
	public UnityWebElement checkboxAccountAssistant;

	@FindBy(xpath = "//mat-option[.//span[normalize-space(text())='Accountant']]")
	public UnityWebElement checkboxAccountant;

	@FindBy(xpath = "//mat-option[.//span[normalize-space(text())='Administrator']]")
	public UnityWebElement checkboxAdministrator;

	@FindBy(xpath = "//mat-option[.//span[normalize-space(text())='Backup Administrator']]")
	public UnityWebElement checkboxBackupAdministrator;

	@FindBy(xpath = "//mat-option[.//span[normalize-space(text())='Bookkeeper']]")
	public UnityWebElement checkboxBookKeeper;

	@FindBy(xpath = "//mat-option[.//span[normalize-space(text())='Cash Manager']]")
	public UnityWebElement checkboxCashManager;

	@FindBy(xpath = "//mat-option[.//span[normalize-space(text())='Client Contact']]")
	public UnityWebElement checkboxClientContact;

	@FindBy(xpath = "//mat-option[.//span[normalize-space(text())='Commercial Banker']]")
	public UnityWebElement checkboxCommercialBanker;

	@FindBy(xpath = "//mat-option[.//span[normalize-space(text())='Investment Officer']]")
	public UnityWebElement checkboxInvestmentOfficer;

	@FindBy(xpath = "//mat-option[.//span[normalize-space(text())='Tax Officer']]")
	public UnityWebElement checkboxTaxOfficer;

	@FindBy(xpath = "//button[*[normalize-space(text())='Refresh']]")
	public UnityWebElement buttonRefresh;

	@FindBy(xpath = "//mat-select[@aria-label='Relationship Type']")
	public UnityWebElement dropdownRelationshipType;

	@FindBy(xpath = "//mat-option[span[normalize-space(text())='Account Assistant']]")
	public UnityWebElement optionAccountAssistant;

	@FindBy(xpath = "//mat-option[span[normalize-space(text())='Accountant']]")
	public UnityWebElement optionAccountant;

	@FindBy(xpath = "//mat-option[span[normalize-space(text())='Administrator']]")
	public UnityWebElement optionAdministrator;

	@FindBy(xpath = "//mat-option[span[normalize-space(text())='APPLE001']]")
	public UnityWebElement optionAPPLE001;

	@FindBy(xpath = "//mat-option[span[normalize-space(text())='Backup Administrator']]")
	public UnityWebElement optionBackupAdministrator;

	@FindBy(xpath = "//mat-option[span[normalize-space(text())='Bookkeeper']]")
	public UnityWebElement optionBookKeeper;

	@FindBy(xpath = "//mat-option[span[normalize-space(text())='Cash Manager']]")
	public UnityWebElement optionCashManager;

	@FindBy(xpath = "//mat-option[span[normalize-space(text())='Client Contact']]")
	public UnityWebElement optionClientContact;

	@FindBy(xpath = "//span[span[normalize-space(text())='Annette Swank']]")
	public UnityWebElement optionAnnetteSwank;

	@FindBy(xpath = "//mat-option[span[normalize-space(text())='Client Contact']]")
	public UnityWebElement panelSearchEmployee;

	@FindBy(xpath = "//mat-label[contains(text(),'Search Employee Name')]")
	public UnityWebElement textboxSearchEmployeeName;

	@FindBy(xpath = "//div[contains(@class,'mat-autocomplete-panel')]")
	public UnityWebElement panelsearchEmployeeName;

	@FindBy(xpath = "//div[contains(@class,'mat-autocomplete-panel')]//mat-option")
	public List<WebElement> listEmployeeNames;

	@FindBy(xpath = "//button[span[normalize-space(text())='Add']]")
	public UnityWebElement buttonAdd;

	@FindBy(xpath = "//button[span[normalize-space(text())='Cancel']]")
	public UnityWebElement buttonCancel;

	@FindBy(xpath = "//button[span[normalize-space(text())='Save']]")
	public UnityWebElement buttonSave;

	@FindBy(xpath = "//*[normalize-space(text())='BoB definition saved successfully']")
	public UnityWebElement labelBoBDefinitionSavedSuccessfully;

	@FindBy(xpath = "//button[span[normalize-space(text())='Ok']]")
	public UnityWebElement buttonOK;

	@FindBy(xpath = "//div[contains(@class,'entitlement-error')]")
	public UnityWebElement labelEntitlementError;

	// Grid controls
	@FindBy(xpath = "//span[@data-ref='eButton']")
	public UnityWebElement buttonGroupingCancel;
	
	@FindBy(xpath = "//*[normalize-space(text())='No Results']")
	public UnityWebElement labelNoResultsInGrid;

	@FindBy(xpath = "//unity-upgrade-column-filter/button")
	public UnityWebElement buttonColumnSettings;
	
	@FindBy(xpath = "//unity-upgrade-column-filter/preceding-sibling::button")
	public UnityWebElement buttonClearAllFilter;

	@FindBy(xpath = "//unity-column-filter-dialog//div//h3")
	public UnityWebElement headerColumnSettings;

	@FindBy(xpath = "//div[@aria-label='Column Settings']//input")
	public List<WebElement> listCheckboxColumnSettings;

	@FindBy(xpath = "//button[span[normalize-space(text())='Save']]")
	public UnityWebElement buttonSaveColumnSettings;
	
	@FindBy(xpath = "//button[span[normalize-space(text())='SAVE']]")
	public UnityWebElement buttonSaveColumnSettingsAZ;

	@FindBy(xpath = "//*[@aria-label='Export to CSV']")
	public UnityWebElement buttonExportToCSV;

	@FindBy(xpath = "//button//mat-icon[@fisicon='print']")
	public UnityWebElement buttonPrint;

	@FindBy(xpath = "//*[normalize-space(text())='Print All Pages']")
	public UnityWebElement buttonPrintAllPages;

	@FindBy(xpath = "//*[normalize-space(text())='Print Current Page']")
	public UnityWebElement buttonPrintCurrentPage;

	@FindBy(xpath = "(//span[normalize-space(text())='Select'])[1]")
	public UnityWebElement optionSelect;

	@FindBy(xpath = "//span[normalize-space(text())='Edit']")
	public UnityWebElement optionEdit;

	@FindBy(xpath = "//span[normalize-space(text())='Delete']")
	public UnityWebElement optionDelete;

	@FindBy(xpath = "//span[normalize-space(text())='Process']")
	public UnityWebElement optionProcess;

	@FindBy(xpath = "//span[normalize-space(text())='Pay']")
	public UnityWebElement optionPay;

	@FindBy(xpath = "//span[normalize-space(text())='Copy & Edit']")
	public UnityWebElement optionCopyAndEdit;

	@FindBy(xpath = "//span[normalize-space(text())='Run']")
	public UnityWebElement optionRun;

	@FindBy(xpath = "//div[@ref='btFirst']")
	public UnityWebElement buttonFirstPage;

	@FindBy(xpath = "//div[@ref='btPrevious']")
	public UnityWebElement buttonPreviousPage;

	@FindBy(xpath = "//div[@ref='btNext']")
	public UnityWebElement buttonNextPage;

	@FindBy(xpath = "//div[@ref='btLast']")
	public UnityWebElement buttonLastPage;

	@FindBy(xpath = "//span[@ref='lbCurrent']")
	public UnityWebElement labelCurrentPage;

	@FindBy(xpath = "//span[@ref='lbTotal']")
	public UnityWebElement labelMaxPages;

	@FindBy(xpath = "//span[contains(text(),'Page No')]/..//mat-form-field//following-sibling::div/input")
	public UnityWebElement textboxPageNumber;

	@FindBy(xpath = "//span[contains(text(),'Page No')]/following-sibling::button")
	public UnityWebElement buttonGo;

	@FindBy(xpath = "//unity-detail-view-print-component//mat-icon")
	public UnityWebElement buttonGlobalPrint;

	@FindBy(xpath = "//button[@aria-label='close']")
	public UnityWebElement buttonClosePopup;

	// Common locators to multiple pages
	@FindBy(xpath = "//account-synopsis//mat-icon")
	public UnityWebElement buttonSynopsis;

	@FindBy(xpath = "//unity-detail-view-print-component//mat-icon")
	public UnityWebElement buttonPrintPageContents;

	@FindBy(xpath = "//div[@class='searchbox']//input")
	public UnityWebElement textBoxSearchFor;

	@FindBy(xpath = "//div[contains(@class,'mat-autocomplete-panel local-search-dropdown')]//mat-option")
	public UnityWebElement panelLocalSearchResults;

	@FindBy(xpath = "//mat-icon[@class='custom-glypicon mat-icon glyphicons ux-glyphicons-account-management']")
	public UnityWebElement iconHomeTab;

	@FindBy(xpath = "//ruf-page-header-title")
	public UnityWebElement labelAccountClientName;

	@FindBy(xpath = "//div[@fxlayoutalign='center flex-end']//small")
	public List<WebElement> labelheaderKeys;

	@FindBy(xpath = "//h2[contains(@class,'ruf-page-header-metric')]")
	public List<WebElement> labelheaderValues;

	// BOB - not updated for 21.3
	@FindBy(xpath = "//div[contains(@id,'mat-select')]//mat-option")
	public List<WebElement> listBOBMyRelationshipDropdownOptions;

	@FindBy(xpath = "//div[contains(@class,'mat-select-panel')]//mat-option")
	public List<WebElement> listBOBRelationshipTypeDropdownOptions;

	@FindBy(xpath = "//div[@class='alertWindow']")
	public UnityWebElement transactionsAlertWindow;

	@FindBy(xpath = "//div[@class='buttonArea']//input[@class='primaryButton']")
	public UnityWebElement buttonYes;

	@FindBy(xpath = "//div[@class='buttonArea']//input[@class='transactionButton']")
	public UnityWebElement buttonNo;

	@FindBy(xpath = "//a[span[normalize-space(text())='Document Vault']]")
	public UnityWebElement linkDocumentVault;

	@FindBy(xpath = "//mat-option[.//span[normalize-space(text())='ADMIN OFFICER']]")
	public UnityWebElement optionAdminOfficer;

	@FindBy(xpath = "//span[span[normalize-space(text())='BEEDLE, LAURA']]")
	public UnityWebElement optionLauraBeedle;

	@FindBy(xpath = "//div[@class='bob-list-item']")
	public UnityWebElement textBobListItem;

	// Time picker controls
	@FindBy(xpath = ".//div[@class='time-control-container']//span[@class='hour ignore-click']")
	public UnityWebElement labelHour;

	@FindBy(xpath = ".//div[@class='arrow-up ignore-click']")
	public UnityWebElement buttonArrowUp;

	@FindBy(xpath = ".//div[@class='arrow-down ignore-click']")
	public UnityWebElement buttonArrowDown;

	@FindBy(xpath = ".//span[@class='minute ignore-click']")
	public UnityWebElement labelMinute;

	@FindBy(xpath = ".//span[contains(@class,'am-pm-container ignore-click')]")
	public UnityWebElement labelPMOrAM;

	@FindBy(xpath = "//input[@formcontrolname='endDate']")
	public UnityWebElement textboxEndDate;

	@FindBy(xpath = "//a[span[normalize-space(text())='Fees']]")
	public UnityWebElement linkFees;
	
	@FindBy(xpath = "//a[span[normalize-space(text())='Fee Receivables']]")
	public UnityWebElement linkFeesReceivables;
	
	
	@FindBy(xpath = "//span[contains(text(),'Fee Oversight')]")
	public UnityWebElement linkFeeOversight;

	// filters locator
	@FindBy(xpath = "//mat-icon[@fisicon='filter']")
	public UnityWebElement iconClearAllGridFilters;

	@FindBy(xpath = "//div[@ref='eSelectAll']//div")
	public UnityWebElement checkboxFilterSelectAll;

	@FindBy(xpath = "//span[@ref='eFilterItemValue']")
	public List<WebElement> filterItemValuesList;

	@FindBy(xpath = "//div[@class='ag-filter']")
	public UnityWebElement columnFilterMenuBody;

	@FindBy(xpath = "//span[@aria-label='filter']")
	public UnityWebElement columnFilterMenuIcon;

	@FindBy(xpath = "//span[@ref='eFilter']")
	public List<WebElement> columnFilterIcon;

	@FindBy(xpath = "//a[span[normalize-space(text())='Fee Activity']]")
	public UnityWebElement linkFeeActivity;
	
	@FindBy(xpath = "//a[span[normalize-space(text())='Fee Events']]")
	public UnityWebElement linkFeeEvents;

	@FindBy(xpath = "//div[@class='cursor-prop notification-icon mat-menu-trigger ng-star-inserted']")
	public UnityWebElement iconNotifications;

	@FindBy(xpath = "//div[@class='ruf-padding-medium ruf-padding']")
	public UnityWebElement panelNotification;

	@FindBy(xpath = "//span[normalize-space(text())='View Details']")
	public UnityWebElement buttonNotificationDetail;

	@FindBy(xpath = "//*[normalize-space(text())='Decisions']")
	public UnityWebElement linkDecisions;
	
	@FindBy(xpath = "//*[contains(text(),'Logout')] | //*[contains(text(),'Logged off')]")
	public UnityWebElement gpLogout;

	// Client Insights
	@FindBy(xpath = "//*[normalize-space(text())='Client Insights']")
	public UnityWebElement linkClientInsights;

	@FindBy(xpath = "//*[normalize-space(text())='Select Client']")
	public UnityWebElement linkSelectClient;

	@FindBy(xpath = "//*[normalize-space(text())='Assets and Liabilities']")
	public UnityWebElement linkAssetsAndLiabilities;

	@Override
	public void waitForPageToLoad() {
		startTime = System.currentTimeMillis();
		if (!super.isPageLoaded(driver))
			Assert.fail("Timed out after " + AppConstants.PAGE_LOAD_TIMEOUT + " seconds\n");
	}

	public void selectEmployeeNameforBOB(String employeeName) {
		panelSearchEmployee
				.findElement(By.xpath(".//mat-option[.//span[normalize-space(text())='" + employeeName + "']]"))
				.click();
	}

	public void globalSearchAndClick(String searchParameter) {
		iconGlobalSearch.jsClick();
		labelSearchBy.waitforVisible();
		textboxSearch.sendKeys(searchParameter);
		panelSearchResults.waitforVisible();
		UnityUtils.wait(2000);
		List<WebElement> e = panelSearchResults.findElements(By.xpath(".//mat-expansion-panel"));
		for(int i=0;i<e.size();i++)
		{
			e.get(i).click();
			UnityUtils.wait(2000);
			
		}
			panelSearchResults
			.findElements(By.xpath("//a//span[contains(text(),'" + searchParameter + "')]"))
			.get(0).click();
		UnityUtils.wait(2000);
		//panelSearchResults.findElements(By.xpath(".//button[@aria-label='close']")).get(0).click();
		//waitForPageToLoad();
		//labelAccountName.waitforVisible();
		//UnityUtils.wait(2000);
	}

	public void resetBOBDefinitions() {
		linkProfile.click();
		linkBookOfBusiness.click();
		UnityUtils.wait(2000);
		if (labelBoBDefinition.isPresent()) {
			for (WebElement element : buttonListRemoveBoBDefinition) {
				element.click();
				UnityUtils.wait(1000);
			}
			buttonSave.click();
			buttonOK.click();
		} else {
			buttonCancel.click();
		}
	}

	public void setBOBAdmin() {
		linkProfile.click();
		linkBookOfBusiness.click();
		dropdownMyRelationship.click();
		checkboxAdministrator.click();
		UnityUtils.robotClickNoElement();
		buttonRefresh.click();
		buttonSave.click();
		buttonOK.click();
	}

	/**
	 * Selects placeholder time in a timepicker using arrow up keys
	 * 
	 * @param timePicker
	 */
	public void selectPlaceholderTimeFromTimePicker(UnityWebElement timePicker) {
		timePicker.findElement(labelHour.getBy()).click();
		timePicker.findElement(buttonArrowUp.getBy()).click();
		timePicker.findElement(labelMinute.getBy()).click();
		timePicker.findElement(buttonArrowUp.getBy()).click();
		timePicker.findElement(labelPMOrAM.getBy()).click();
		timePicker.findElement(buttonArrowUp.getBy()).click();
		timePicker.findElement(buttonArrowUp.getBy()).click();
	}

	/**
	 * Logs out from the application
	 */
	public void doLogout() {
		driver.switchTo().defaultContent();
		linkProfile.click();
		linkLogout.waitforVisible();
		linkLogout.scrollAndClick();
	}

	public void selectAllfromFilterMenu() {
		if (!checkboxFilterSelectAll.getAttribute("class").contains("checked")) {
			checkboxFilterSelectAll.jsClick();
		}
	}

	public void unselectAllfromFilterMenu() {
		if (checkboxFilterSelectAll.getAttribute("class").contains("checked")) {
			checkboxFilterSelectAll.jsClick();
		}
	}
}
