package com.unity.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.unity.constants.AppConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityWebElement;

public class AnalyticsPage extends BaseTestPage {
	WebDriver driver;

	public AnalyticsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}

	@FindBy(xpath = "//iframe[@id='analytics-frame']")
	public UnityWebElement frameAnalytics;

	@FindBy(xpath = "//div[@class='mi-title h1']")
	public UnityWebElement labelDashboardKey;

	@FindBy(xpath = "//span[contains(@class,'btn__icon app-icon app-icon--general-plus')]")
	public UnityWebElement iconAddDashboard;

	@FindBy(xpath = "//div[normalize-space(text())='New Dashboard']")
	public UnityWebElement optionNewDashboard;

	@FindBy(xpath = "//div[normalize-space(text())='New Folder']")
	public UnityWebElement optionNewFolder;

	@FindBy(xpath = "//input[@id='input-with-placeholder-2']")
	public UnityWebElement textboxSearch;

	@FindBy(xpath = "//a[normalize-space(text())='Recent']")
	public UnityWebElement linkRecent;

	@FindBy(xpath = "//a[normalize-space(text())='All']")
	public UnityWebElement linkAll;

	@FindBy(xpath = "//a[normalize-space(text())='Created by Me']")
	public UnityWebElement linkCreatedByMe;

	@FindBy(xpath = "//a[normalize-space(text())='Shared with Me']")
	public UnityWebElement linkSharedWithMe;

	@FindBy(xpath = "//span[@title='Switch to tile view']")
	public UnityWebElement iconSwitchToTileView;

	@FindBy(xpath = "//span[contains(@class,'btn__icon app-icon app-icon--general-search-small')]")
	public UnityWebElement iconSearch;

	@FindBy(xpath = "//a[normalize-space(text())='MT01']")
	public UnityWebElement linkFolderMT01;

	@FindBy(xpath = "//a[normalize-space(text())='Account Information']")
	public UnityWebElement linkAccountInformation;

	@FindBy(xpath = "//a[normalize-space(text())='Account Summary Information']")
	public UnityWebElement linkAccountSummaryInformation;

	@FindBy(xpath = "//a[normalize-space(text())='Event (disbursement)']")
	public UnityWebElement linkEventDisbursement;

	@FindBy(xpath = "//a[normalize-space(text())='Event (memo)']")
	public UnityWebElement linkEventMemo;

	@FindBy(xpath = "//a[normalize-space(text())='Event (transfer recipient)']")
	public UnityWebElement linkEventTransferRecipient;

	@FindBy(xpath = "//a[normalize-space(text())='Events']")
	public UnityWebElement linkEvents;

	@FindBy(xpath = "//a[normalize-space(text())='Holdings']")
	public UnityWebElement linkHoldings;

	@FindBy(xpath = "//a[normalize-space(text())='Tax lots']")
	public UnityWebElement linkTaxLots;

	@FindBy(xpath = "//a[normalize-space(text())='Transactions']")
	public UnityWebElement linkTransactions;

	@FindBy(xpath = "//span[normalize-space(text())='To Create Your Dashboard']")
	public UnityWebElement linkToCreateYourDashboard;

	@FindBy(xpath = "//*[normalize-space(text())='New Dashboard /']")
	public UnityWebElement labelNewDashboard;

	@FindBy(xpath = "//*[normalize-space(text())='Please select a Data Source to connect to']")
	public UnityWebElement labelPleaseSelectADataSourceToConnectTo;

	@FindBy(xpath = "//button/span[normalize-space(text())='Create']")
	public UnityWebElement buttonCreate;

	@FindBy(xpath = "//span[normalize-space(text())='Cancel']")
	public UnityWebElement buttonCancel;

	// ---- 17 June

	@FindBy(xpath = "//*[normalize-space(text())='Data Source']")
	public UnityWebElement labelDataSource;

	@FindBy(xpath = "//*[normalize-space(text())='Title']")
	public UnityWebElement labelTitle;

	@FindBy(xpath = "//span[@class='home-grid__switch_view app-icon app-icon--general-list']")
	public UnityWebElement iconListView;

	@FindBy(xpath = "//span[@class='home-grid__switch_view app-icon app-icon--general-folder-copy-2']")
	public UnityWebElement iconGridView;

	@FindBy(xpath = "//div[@id='5ee1040c5a617a2918b02bc8']//span[@class='btn__icon app-icon app-icon--general-more']")
	public UnityWebElement iconMore;

	@FindBy(xpath = "//span[@class='btn__icon app-icon app-icon--general-more']")
	public UnityWebElement iconMore1;

	@FindBy(xpath = "//div[@class='menu-content']//div[@class='menu-item-container']//div[normalize-space(text())='Rename']")
	public UnityWebElement menuRenameDashboard;

	@FindBy(xpath = "//div[@class='menu-content']//div[@class='menu-item-container']//div[normalize-space(text())='Duplicate']")
	public UnityWebElement menuDuplicateDashboard;

	@FindBy(xpath = "//div[@class='menu-content']//div[@class='menu-item-container']//div[normalize-space(text())='Restore Dashboard']")
	public UnityWebElement menuRestoreDashboard;

	@FindBy(xpath = "//div[@class='menu-content']//div[@class='menu-item-container']//div[normalize-space(text())='Embed code']")
	public UnityWebElement menuEmbedCodeDashboard;

	@FindBy(xpath = "//span[normalize-space(text())='Select Data']")
	public UnityWebElement buttonSelectData;

	@FindBy(xpath = "//span[normalize-space(text())='Account Number']")
	public UnityWebElement itemAccountNumber;

	@FindBy(xpath = "//div[normalize-space(text())='Advanced Configuration']")
	public UnityWebElement linkAdvancedConfiguration;

	@FindBy(xpath = "//div[normalize-space(text())='Filters']")
	public UnityWebElement tabFilters;

	@FindBy(xpath = "//div[normalize-space(text())='Design']")
	public UnityWebElement tabDesign;

	@FindBy(xpath = "//button[@title='Edit Widget']")
	public UnityWebElement buttonEditWidget;

	@FindBy(xpath = "//span[normalize-space(text())='Widget']")
	public UnityWebElement buttonWidget;

	@FindBy(xpath = "//span[@class='btn__icon app-icon app-icon--header-text-widget']")
	public UnityWebElement buttonAddTextWidget;

	@FindBy(xpath = "//div[normalize-space(text())='Widget Filters']")
	public UnityWebElement labelWidgetFilters;

	@FindBy(xpath = "//div[@class='fs-add']")
	public UnityWebElement buttonAddWidgetFilter;

	@FindBy(xpath = "//span[normalize-space(text())=' As of Date Selection ']")
	public UnityWebElement labelAsOfDateSelection;

	@FindBy(xpath = "//div[@title='Edit Filter']")
	public UnityWebElement buttonEditWidgetFilter;

	@FindBy(xpath = "//button[@class='ren-act rename-ok confirm-btn confirm-btn--apply btn btn--transp js--btn-ok ctrl']")
	public UnityWebElement buttonConfirm;

	@FindBy(xpath = "//div[@class='ew-item-wrapper f-wrapper ui-draggable first can-modify-filters']//div[@class='ew-i-rem ew-i-act']")
	public UnityWebElement buttonDeleteWidgetFilter;

	@FindBy(xpath = "//div[@class='ew-item-wrapper f-wrapper ui-draggable first can-modify-filters']//label[@title='Click to disable']")
	public UnityWebElement buttonToggleWidgetFilter;

	@FindBy(xpath = "//div[@class='ew-item-wrapper f-wrapper ui-draggable first can-modify-filters']//div[@class='ew-i-menu ew-i-act']")
	public UnityWebElement buttonMenuWidgetFilter;

	@FindBy(xpath = "//div[@class='mi-caption'][normalize-space(text())='Rename']")
	public UnityWebElement menuRenameWidgetFilter;

	@FindBy(xpath = "//div[@class='menu-item mi-plain']//div[@class='mi-caption']")
	public UnityWebElement menuSetAsBackgroundWidgetFilter;

	@FindBy(xpath = "//span[normalize-space(text())='Apply']")
	public UnityWebElement buttonApply;

	// Dashboard Filters

	@FindBy(xpath = "//div[@id='prism-leftview']//div[contains(@class,'trillapser-container right')]")
	public UnityWebElement iconLeftView;

	@FindBy(xpath = "//div[@id='prism-mainview']//div[contains(@class,'trillapser-container right')]")
	public UnityWebElement iconRightView;

	@FindBy(xpath = "//div[normalize-space(text())='Filter Your Dashboard']")
	public UnityWebElement labelFilterYourDashboard;

	@FindBy(xpath = "//div[@class='filter-global-add-button']")
	public UnityWebElement buttonAddDashboardFilter;

	@FindBy(xpath = "//span[contains(@class,'fl-menu')]")
	public UnityWebElement iconDashboardFilter;

	@FindBy(xpath = "//div[@class='mi-caption'][normalize-space(text())='Default Filters']")
	public UnityWebElement menuDefaultFilters;

	@FindBy(xpath = "//div[@class='mi-caption'][normalize-space(text())='Set as My Default Filters']")
	public UnityWebElement menuSetAsMyDefaultFilters;

	@FindBy(xpath = "//div[@class='caption'][normalize-space(text())='Update on Every Change']")
	public UnityWebElement labelUpdateOnEveryChange;

	@FindBy(xpath = "//span[contains(@class,'custom-togglebtn__icon')]")
	public UnityWebElement buttonToggle;

	@FindBy(xpath = "//div[@class='uc-db-table']//div[@class='uc-db-column']//span[contains(normalize-space(text()),'Account GREF')]")
	public UnityWebElement labelAccountGref;

	@FindBy(xpath = "//div[@class='uc-db-table']//div[@class='uc-db-column']//span[contains(normalize-space(text()),'Account Administrator')]")
	public UnityWebElement labelAccountAdministrator;

	@FindBy(xpath = "//div[@class='uc-ok'][normalize-space(text())='OK']")
	public UnityWebElement buttonOk;

	@FindBy(xpath = "//span[normalize-space(text())='Account GREF']")
	public UnityWebElement labelAccountGrefFilter;

	@FindBy(xpath = "//span[normalize-space(text())='Account Administrator']")
	public UnityWebElement labelAccountAdministratorFilter;

	@FindBy(xpath = "//div[@class='ew-i-footer']//div[@title='Remove the item']")
	public UnityWebElement buttonDeleteDashboardFilter;

	@FindBy(xpath = "//div[@class='ew-i-footer']//div[@title='Add a dependent filter']")
	public UnityWebElement buttonAddDependentDashboardFilter;

	@FindBy(xpath = "//div[@class='ew-i-footer']//label[@title='Click to disable']")
	public UnityWebElement buttonToggleDashboardFilter;

	@FindBy(xpath = "//div[@class='ew-i-menu ew-i-act']")
	public UnityWebElement buttonMenuDashboardFilter;

	@FindBy(xpath = "//div[@class='mi-caption'][normalize-space(text())='Lock']")
	public UnityWebElement menuLockDashboardFilter;

	@FindBy(xpath = "//div[@class='mi-caption'][normalize-space(text())='Add a Dependent Filter']")
	public UnityWebElement menuAddADependentDashboardFilter;

	@FindBy(xpath = "//div[@class='mi-caption'][normalize-space(text())='Create Background Filter']")
	public UnityWebElement menuCreateBackgroundDashboardFilter;

	@FindBy(xpath = "//div[@title='List']")
	public UnityWebElement tabListFilter;

	@FindBy(xpath = "//div[@title='Text']")
	public UnityWebElement tabTextFilter;

	@FindBy(xpath = "//div[@title='Ranking']")
	public UnityWebElement tabRankingFilter;

	@FindBy(xpath = "//div[@title='Starred']")
	public UnityWebElement tabStarredFilter;

	@FindBy(xpath = "//div[@title='Advanced']")
	public UnityWebElement tabAdvancedFilter;

	@FindBy(xpath = "//input[@class='condition-input ng-pristine ng-untouched ng-valid ng-empty']")
	public UnityWebElement textboxTextFilterCondition;

	@FindBy(xpath = "//span[normalize-space(text())='All items containing \"53\"']")
	public UnityWebElement labelAllItemsContaining53;

	@FindBy(xpath = "//span[@class='uc-rf-by fake-textbox']")
	public UnityWebElement textboxRankingByFilterCondition;

	@FindBy(xpath = "//span[normalize-space(text())='Top 10 By # of unique Account GREF']")
	public UnityWebElement labelTop10ByOfUniqueAccountGREF;

	@FindBy(xpath = "//span[normalize-space(text())='filtered with custom filter']")
	public UnityWebElement labelFilteredWithCustomFilter;

	@FindBy(xpath = "//span[@class='fl-restore-filter']")
	public UnityWebElement buttonRestoreDefaultFilter;

	@FindBy(xpath = "//div[normalize-space(text())='Include all']")
	public UnityWebElement labelIncludeAllFilter;

	@FindBy(xpath = "//div[@class='i-locked']")
	public UnityWebElement iconLockFilter;

	@FindBy(xpath = "//div[@class='mi-caption'][normalize-space(text())='Unlock']")
	public UnityWebElement menuUnlockDashboardFilter;

	@FindBy(xpath = "//div[@class='mi-caption'][normalize-space(text())='Edit Background Filter']")
	public UnityWebElement menuEditBackgroundFilter;

	@FindBy(xpath = "//div[@class='mi-caption'][normalize-space(text())='Remove Background Filter']")
	public UnityWebElement menuRemoveBackgroundFilter;

	@FindBy(xpath = "//div[@class='i-background']")
	public UnityWebElement iconBackgroundFilter;

	@FindBy(xpath = "//span[normalize-space(text())='To Create Your Dashboard']")
	public UnityWebElement iconCreateYourashBoard;

	@FindBy(xpath = "//*[normalize-space(text())='Data Source']")
	public UnityWebElement buttonChooseDataSource;

	@FindBy(xpath = "//div[(contains(text(),'Affiliation Information'))]")
	public UnityWebElement optionAffiliationInformation;
	
	@FindBy(xpath = "//div[(contains(text(),'Event Details'))]")
	public UnityWebElement optionEventDetails;
	
	@FindBy(xpath = "//div[(contains(text(),'Events with Participation Details'))]")
	public UnityWebElement optionEventsParticipationDetails;
	
	@FindBy(xpath = "//div[(contains(text(),'Positions Information'))]")
	public UnityWebElement optionPositionInformation;
	
	@FindBy(xpath = "//div[(contains(text(),'Taxlot Information'))]")
	public UnityWebElement optionTaxInformation;
	
	@FindBy(xpath = "//div[(contains(text(),'Transaction Information'))]")
	public UnityWebElement optionTransactionInformation;
	
	@FindBy(xpath = "//a[@class='li-title']")
	public List<WebElement> optionsDashboardReportList;
	
	@FindBy(xpath = "//div[@class='dashboard-title-holder']//input[@type='text']")
	public UnityWebElement textTitle;
	
	@FindBy(xpath = "//div[@class='datasource-name-text']")
	public UnityWebElement labelFrom;

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

}
