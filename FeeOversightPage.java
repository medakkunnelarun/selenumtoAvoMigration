package com.unity.pages;

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

public class FeeOversightPage extends BaseTestPage {

	WebDriver driver;

	public FeeOversightPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}

	@FindBy(xpath = "//ag-grid-angular")
	public UnityGridElement gridFeeInformation;
	
//	@FindBy(xpath = "//span[@aria-haspopup='true']//span//span[contains(text(),'Investment Officer')]")
//    public UnityWebElement groupbyoptionInvestmentofficer;
//
//	@FindBy(xpath = "//span[@aria-haspopup='true']//span//span[contains(text(),'Fee Group')]")
//    public UnityWebElement groupbyoptionFeegroup;
	
	@FindBy(xpath = "//span[contains(@class,'mat-mdc-menu-trigger selected-group-by')]")
	public UnityWebElement dropdownGroupby;

	@FindBy(xpath = "//div[@role='menuitem']//span[contains(text(),'Branch')]")
	public UnityWebElement optionBranch;
	
	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Total Summary']]")
	public UnityWebElement panelTotalSummary;
	
	@FindBy(xpath = "//mat-expansion-panel-header[.//*[normalize-space(text())='Fee Information']]")
	public UnityWebElement panelFeeInformation;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Fees Year-to-Date')]")
	public UnityWebElement labelFeeYearToDate;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Fees This Month')]")
	public UnityWebElement labelFeeThisMonth;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Fees This Quarter')]")
	public UnityWebElement labelFeeThisQuarter;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Fees Prior Year')]")
	public UnityWebElement labelFeePriorYear;
	
	@FindBy(xpath = "//span[contains(normalize-space(text()),'Fees Currency')]")
	public UnityWebElement labelFeeCurrency;
	
	@FindBy(xpath = "//span[@class='sg-property-name']")
	public List<WebElement> labelHeadersTotalSummary;

	@FindBy(xpath = "//span[contains(@class,'sg-property-value')]")
	public List<WebElement> labelValuesTotalSummary;
	
	@FindBy(xpath = "//span[@aria-haspopup='menu']//span//span[contains(text(),'Branch')]")
	public UnityWebElement groupbyoptionBranch;
	
	@FindBy(xpath = "//div[@role='menuitem']//span[contains(text(),'Administrator')]")
	public UnityWebElement optionAdministrator;
	
	@FindBy(xpath = "//span[@aria-haspopup='menu']//span//span[contains(text(),'Administrator')]")
	public UnityWebElement groupbyoptionAdministrator;
	
	@FindBy(xpath = "//span[@aria-haspopup='menu']//span//span[contains(normalize-space(text()),'Investment Officer')]")
	public UnityWebElement groupbyoptionInvestmentOfficer;
	
	@FindBy(xpath = "//span[@aria-haspopup='menu']//span//span[contains(normalize-space(text()),'Fee Group')]")
	public UnityWebElement groupbyoptionFeeGroup;
	
	@FindBy(xpath = "//div[span[text()=' Branch']]")
	public UnityWebElement columnBranch;
	
	@FindBy(xpath = "//div[span[text()='Administrator']]")
	public UnityWebElement columnAdministrator;
	
	@FindBy(xpath = "//div[span[text()=' Branch']]/preceding-sibling::span/*")
	public UnityWebElement menuBranch;
	
	@FindBy(xpath = "//div[span[text()='Administrator']]/preceding-sibling::span/*")
	public UnityWebElement menuAdministrator;
	
	//@FindBy(xpath = "//div[@class='ag-theme-balham ag-popup']//div[@ref='eHeader']//span[@class='ag-icon ag-icon-filter']")
	@FindBy(xpath = "//*[normalize-space(text())='Group By:']")
	public UnityWebElement menuFilter;
	
	@FindBy(xpath = "//div[@role='combobox']/*[@data-ref='eIcon']")
	public UnityWebElement menuFilterDropdown;

	//@FindBy(xpath = "//div[@class='ag-filter-select ag-labeled ag-label-align-left ag-select']//div[@class='ag-picker-field-display'][normalize-space()='Contains']")
	@FindBy(xpath = "//*[text()='Contains']")
	public UnityWebElement menuFilterContains;

	@FindBy(xpath = "//*[text()='Not Contains']")
	public UnityWebElement menuFilterNotContains;
//   //div[contains(text(),'Not contains')]
	@FindBy(xpath = "//*[text()='Equals']")
	public UnityWebElement menuFilterEquals;

	@FindBy(xpath = "//*[text()='Not Equal']")
	public UnityWebElement menuFilterNotEqual;

	@FindBy(xpath = "//*[text()='Starts With']")
	public UnityWebElement menuFilterStartsWith;

	@FindBy(xpath = "//*[text()='Ends with']")
	public UnityWebElement menuFilterEndsWith;

	@FindBy(xpath = "(//div[@ref='eWrapper']/input[@ref='eInput' and @type='text'])[1]")
	public UnityWebElement menuFilterTextBox;

	@FindBy(xpath = "(//div[@ref='eWrapper']/input[@ref='eInput' and @type='date'])[1]")
	public UnityWebElement menuFilterDateBox;

	@FindBy(xpath = "//button[normalize-space(text())='Clear Filter']")
	public UnityWebElement buttonClearFilter;
	
	@FindBy(xpath = "//mat-icon[@fisicon='filter']")
	public UnityWebElement buttonClearAllGridFilter;
	
	@FindBy(xpath = "//div[@class='ag-filter-body']//input[@type='text']")
	public UnityWebElement menuFilterTextBox1;
//	(//div[@ref='eWrapper'][input[@ref='eInput' and @type='text']])[1]
	
	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Book of Business']]//input")
	public UnityWebElement checkboxBookOfBusiness;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Favorites']]//input")
	public UnityWebElement checkboxFavorites;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Recent']]//input")
	public UnityWebElement checkboxRecent;
	
	@FindBy(xpath = "//div[span[text()='Investment Officer']]")
	public UnityWebElement columnInvestmentOfficer;
	
	@FindBy(xpath = "//div[span[text()='Fee Group']]")
	public UnityWebElement columnFeeGroup;
	
	@FindBy(xpath = "//div[span[text()='Investment Officer']]/preceding-sibling::span/*")
	public UnityWebElement menuInvestmentOfficer;
	
	@FindBy(xpath = "//div[span[text()='Fee Group']]/preceding-sibling::span/*")
	public UnityWebElement menuFeeGroup;
	@FindBy(xpath = "//unity-print-v2/Button")
	public UnityWebElement linkPrint;
	
	@FindBy(xpath = "//client-side-unity-export-upgrade/Button")
	public UnityWebElement buttonExportToCSV;

	@FindBy(xpath = "//button[@aria-label='Clear']")
	public UnityWebElement buttonClear;
	
	@FindBy(xpath = "//div[@role='menuitem']//span[normalize-space(text())='Investment Officer']")
	public UnityWebElement optionInvestmentOfficer;
	
	@FindBy(xpath = "//div[@role='menuitem']//span[normalize-space(text())='Fee Group']")
	public UnityWebElement optionFeeGroup;
	
	@FindBy(xpath = "//span[@class='ag-header-cell-text']//parent::span[contains(text(),'Branch')]")
	public UnityWebElement headerBranch;
	
	@FindBy(xpath = "//span[@class='ag-header-cell-text']//parent::span[contains(text(),'Number of Accounts')]")
	public UnityWebElement headerNumberofAccounts;
	
	@FindBy(xpath = "//span[@class='ag-header-cell-text']//parent::span[contains(text(),'Total Market Value')]")
	public UnityWebElement headerTotalMarketValue;
	
	@FindBy(xpath = "//span[@class='ag-header-cell-text']//parent::span[contains(text(),'Fees Year-to-Date')]")
	public UnityWebElement headerFeesYeartoDate;
	
	
	

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