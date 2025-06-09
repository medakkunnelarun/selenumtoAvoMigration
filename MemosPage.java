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

public class MemosPage extends BaseTestPage {

	WebDriver driver;

	public MemosPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}
	
	@FindBy(xpath = "//span[contains(text(),' 20 ')]")
	public UnityWebElement option20Days;

	@FindBy(xpath = "//span[contains(text(),' 90 ')]")
	public UnityWebElement option90Days;
	
	@FindBy(xpath = "//*[@id=\"memo-event-select\"]/div/div[2]")
	public UnityWebElement dropdownViewBy;
	
	@FindBy(xpath = "//*[@id=\"width-full\"]/div[1]/unity-calendar-days/div/span[2]/span/span/mat-icon")
	public UnityWebElement dropdownDaysInFuture;
	
	@FindBy(xpath = "//*[@id=\"memo-white-bg\"]/div[2]/unity-clientside-grid/div/div[1]/div/div[2]/unity-upgrade-column-filter/button/span[3]")
	public UnityWebElement linkFilterGrid;

	@FindBy(xpath = "//*[@id=\"memo-grid\"]")
	public UnityGridElement gridMemos;

	@FindBy(xpath = "//*[@id=\"memo-white-bg\"]/div[2]/unity-clientside-grid/div/div[1]/div/div[2]/unity-print-v2/button")
	public UnityWebElement buttonPrint;

	
	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Event Type']]//input")
	public UnityWebElement checkboxEventType;
	               
	@FindBy(xpath = "//*[normalize-space(text())='SCHMODT,WALTER(1015001541)']")
	public UnityWebElement labelAccountName1;
	
	@FindBy(xpath = "(//book-of-business-checkbox//mat-select//div[2])")
	public UnityWebElement dropDownBookOfBusinessArrow;
	
	@FindBy(xpath = "//mat-option//span[text()='test']")
	public UnityWebElement optionTest;
	
	@FindBy(xpath = "//mat-option//span[text()='new bob']")
	public UnityWebElement optionNewBob;
	
	@FindBy(xpath = "//span[text()='Account Branch Name']")
    public UnityWebElement Acc_Branch_Name;
    
    @FindBy(xpath = "//span[text()='Account Bank Name']")
    public UnityWebElement Acc_Bank_Name;
    
    @FindBy(xpath = "//span[text()='Account Administrator']")
    public UnityWebElement Acc_Admin;
    
    @FindBy(xpath = "//span[text()='Account Investment Officer']")
    public UnityWebElement Acc_Inv_off;
    
    @FindBy(xpath = "//span[text()='Client Bank Name']")
    public UnityWebElement Client_Bank_Name;
    
    @FindBy(xpath = "//span[text()='Client Branch Name']")
    public UnityWebElement Client_Branch_Name;
    
    @FindBy(xpath = "//span[text()='Security Bank Number']")
    public UnityWebElement Sec_bank_num;
    
    @FindBy(xpath = "//span[text()='Minor Security Type']")
    public UnityWebElement Minor_Sec_Type;
    
    @FindBy(xpath = "//span[text()='Portfolio Branch Name']")
    public UnityWebElement Port_Branch_Name;
    
    @FindBy(xpath = "//span[text()='Portfolio Bank Name']")
    public UnityWebElement Port_Bnak_Name;

	
	@FindBy(xpath = "//span[@class='selected-date mat-menu-trigger']")
    public UnityWebElement CalenderDays;
	
	@FindBy(xpath = "//div[@class='mat-focus-indicator mat-menu-item ng-star-inserted']//span[text()='Custom Date']")
	    public UnityWebElement CustomDate;
	    
	@FindBy(xpath = "//input[@placeholder='To']")
	    public UnityWebElement textboxToDate;
	    
	@FindBy(xpath = "//button[contains(@class,'mat-focus-indicator')]//following-sibling::button//span")
	    public UnityWebElement buttonGo;
	
	@FindBy(xpath = "//span[@class='select-day-range']//span")
	    public UnityWebElement DateAD;
	
	@FindBy(xpath = "//span[text()='03/20/2023']")
    public UnityWebElement Date;
	
	@FindBy(xpath = "//input[@name='eventType']")
    public UnityWebElement lookupEventType;
    
    @FindBy(xpath = "//input[@name='frequency']")
    public UnityWebElement lookupFrequency;
    
    @FindBy(xpath = "//textarea[@name='memoText']")
    public UnityWebElement textboxMemoText;


	@FindBy(xpath = "//book-of-business-checkbox//mat-checkbox")
	public UnityWebElement checkboxBookOfBusiness;

	
	@FindBy(xpath = "//span[@class='select-day-range']//mat-icon")
	public UnityWebElement dropdownCalDays;

	@FindBy(xpath = "//span[normalize-space(text())='5']")
	public UnityWebElement dropdownDaysInFutureDefaultValue;
	
	@FindBy(xpath = "//input[@name='oneTimeDate']")
    public UnityWebElement textboxOntimedate;
    
    @FindBy(xpath = "//input[@name='primaryContact']")
    public UnityWebElement lookupPrimarycontact;
    
    @FindBy(xpath = "//input[@name='secondaryContact']")
    public UnityWebElement lookupSecondarycontact;
    
    @FindBy(xpath = "//input[@name='subjectLine']")
    public UnityWebElement textboxSubjectLine;
    
    @FindBy(xpath = "//textarea[@name='primaryDescription']")
    public UnityWebElement textboxPrimaryDesc;
    
    @FindBy(xpath = "//textarea[@name='privateDescription']")
    public UnityWebElement textboxPrivateDesc;


	// Dropdown view by options
	@FindBy(xpath = "//div[normalize-space(text())='5']")
	public UnityWebElement option5Days;

	@FindBy(xpath = "//div[normalize-space(text())='10']")
	public UnityWebElement option10Days;
	
	@FindBy(xpath = "//div[normalize-space(text())='14']")
	public UnityWebElement option14Days;



	@FindBy(xpath = "//div[normalize-space(text())='25']")
	public UnityWebElement option25Days;

	@FindBy(xpath = "//div[normalize-space(text())='30']")
	public UnityWebElement option30Days;

	@FindBy(xpath = "//div[normalize-space(text())='60']")
	public UnityWebElement option60Days;



	// Dropdown view by options
	@FindBy(xpath = "//mat-option[.//span[normalize-space(text())='All Accounts']]")
	public UnityWebElement checkboxAllAccounts;

	@FindBy(xpath = "//mat-option[.//span[normalize-space(text())='All Clients']]")
	public UnityWebElement checkboxAllClients;

	@FindBy(xpath = "//mat-option[.//span[normalize-space(text())='All Securities']]")
	public UnityWebElement checkboxAllSecurities;

	@FindBy(xpath = "//mat-option[.//span[normalize-space(text())='All Portfolios']]")
	public UnityWebElement checkboxAllPortfolios;

	@FindBy(xpath = "//mat-option[.//span[normalize-space(text())='All Affiliations']]")
	public UnityWebElement checkboxAllAffiliations;

	//@FindBy(xpath = "//button[.//span[normalize-space(text())='Refresh']]")
	@FindBy(xpath = "//span[normalize-space(text())='Refresh']/parent::button")
	public UnityWebElement buttonRefresh;



	@FindBy(xpath = "//memo-event-number//a")
	public List<WebElement> linkEventNumber;

	// Grid controls
	@FindBy(xpath = "//*[@aria-label='Export to CSV']")
	public UnityWebElement buttonExport;



	// Account and portfolio popup
	@FindBy(xpath = "//unity-property")
	public List<WebElement> labelAccountOrPortfolioValue;

	@FindBy(xpath = "//button[@id='memo-details-close']")
	public UnityWebElement buttonClose;

	// Memo event details popup
	@FindBy(xpath = "//p[strong[contains(text(),'Client')]]")
	public UnityWebElement labelClientName;

	@FindBy(xpath = "//*[normalize-space(text())='Event Details']")
	public UnityWebElement panelEventDetails;

	@FindBy(xpath = "//span[normalize-space(text())='As of Date']")
	public UnityWebElement labelAsofDateKey;

	@FindBy(xpath = "//span[normalize-space(text())='Date Stop']")
	public UnityWebElement labelDateStopKey;

	@FindBy(xpath = "//span[normalize-space(text())='Event Name']")
	public UnityWebElement labelEventNameKey;

	@FindBy(xpath = "//span[normalize-space(text())='Event Type']")
	public UnityWebElement labelEventTypeKey;

	@FindBy(xpath = "//span[normalize-space(text())='Holiday Rule']")
	public UnityWebElement labelHolidayRuleKey;

	@FindBy(xpath = "//span[normalize-space(text())='Responsible Employee']")
	public UnityWebElement labelResponsibleEmployeeKey;

	@FindBy(xpath = "//span[normalize-space(text())='Weekend Rule']")
	public UnityWebElement labelWeekendRuleKey;

	@FindBy(xpath = "//span[normalize-space(text())='Date Last Processed']")
	public UnityWebElement labelDateLastProcessedKey;

	@FindBy(xpath = "//span[normalize-space(text())='Event Class']")
	public UnityWebElement labelEventClassKey;

	@FindBy(xpath = "//span[normalize-space(text())='Event Number']")
	public UnityWebElement labelEventNumberKey;

	@FindBy(xpath = "//span[normalize-space(text())='Frequency']")
	public UnityWebElement labelFrequencyKey;

	@FindBy(xpath = "//span[normalize-space(text())='Next Scheduled Execution']")
	public UnityWebElement labelNextScheduledExecutionKey;

	@FindBy(xpath = "//span[normalize-space(text())='Disposition']")
	public UnityWebElement labelDispositionKey;

	@FindBy(xpath = "//span[normalize-space(text())='Block Number']")
	public UnityWebElement labelBlockNumberKey;

	@FindBy(xpath = "//span[normalize-space(text())='Print for INV Officer']")
	public UnityWebElement labelPrintforINVOfficerKey;

	@FindBy(xpath = "//span[normalize-space(text())='Print for Other Officer']")
	public UnityWebElement labelPrintforOtherOfficerKey;

	@FindBy(xpath = "//span[normalize-space(text())='Print for PB Officer']")
	public UnityWebElement labelPrintforPBOfficerKey;

	@FindBy(xpath = "//span[normalize-space(text())='Start of Business']")
	public UnityWebElement labelStartOfBusinessKey;

	@FindBy(xpath = "//span[normalize-space(text())='Account Number']")
	public UnityWebElement labelAccountNumberKey;

	@FindBy(xpath = "//span[normalize-space(text())='Client Name']")
	public UnityWebElement labelClientNameKey;

	@FindBy(xpath = "//span[normalize-space(text())='Security']")
	public UnityWebElement labelSecurityKey;

	@FindBy(xpath = "//mat-expansion-panel//mat-panel-title[normalize-space(text())='Memo Text']")
	public UnityWebElement panelMemoText;

	@FindBy(xpath = "//li//span[normalize-space(text())='Memo Text']")
	public UnityWebElement labelMemoTextKey;

	// Tab menus


	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Responsible Employee']]//input")
	public UnityWebElement checkboxResponsibleEmployee;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Associated Number']]//input")
	public UnityWebElement checkboxAssociatedNumber;
	
	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Associated Name']]//input")
	public UnityWebElement checkboxAssociatedName;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Requires Acknowledgement']]//input")
	public UnityWebElement checkboxRequireAcknowledgement;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Frequency']]//input")
	public UnityWebElement checkboxFrequency;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Associated Entity Type']]//input")
	public UnityWebElement checkboxAssociateEntityType;

	@FindBy(xpath = "//button//span[normalize-space(text())='Save']")
	public UnityWebElement buttonSaveFilterGrid;

	@FindBy(xpath = "//*[normalize-space(text())='Sattler Company(1050004849)']")
	public UnityWebElement labelAccountName;

	@FindBy(xpath = "//p[strong[contains(text(),'Security')]]")
	public UnityWebElement labelSecurityName;

	@FindBy(xpath = "//p[strong[contains(text(),'Account/Portfolio:')]]")
	public UnityWebElement labelAccountPortfoliio;

	@FindBy(xpath = "//p[strong[contains(text(),'Client:')]]")
	public UnityWebElement labelClient;

	@FindBy(xpath = "//h2[normalize-space(text())='Edit Memo']")
	public UnityWebElement headerEditMemo;

	@FindBy(xpath = "//h2[normalize-space(text())='Delete Memo']")
	public UnityWebElement headerDeleteMemo;

	@FindBy(xpath = "//span[normalize-space(text())='Primary Contact']")
	public UnityWebElement labelPrimaryContactKey;

	@FindBy(xpath = "//span[normalize-space(text())='Date Start']")
	public UnityWebElement labelDateStartKey;

	@FindBy(xpath = "//span[normalize-space(text())='Name/Address']")
	public UnityWebElement labelNameAddressKey;

	@FindBy(xpath = "//span[normalize-space(text())='Memo Number']")
	public UnityWebElement labelMemoNumberKey;

	@FindBy(xpath = "//span[normalize-space(text())='Secondary Contact']")
	public UnityWebElement labelSecondaryContactKey;

	@FindBy(xpath = "//span[normalize-space(text())='Email Notification (Primary Contact)']")
	public UnityWebElement labelEmailNotificationPrimaryContactKey;

	@FindBy(xpath = "//span[normalize-space(text())='Email Notification (Secondary Contact)']")
	public UnityWebElement labelEmailNotificationSecondaryContactKey;

	@FindBy(xpath = "//span[normalize-space(text())='Primary Description']")
	public UnityWebElement labelPrimaryDescriptionKey;

	@FindBy(xpath = "//span[normalize-space(text())='Private Description']")
	public UnityWebElement labelPrivateDescriptionKey;

	@Override
	public void waitForPageToLoad() {
		startTime = System.currentTimeMillis();
		if (super.isPageLoaded(driver))
			try {
				dropdownViewBy.waitforVisible(AppConstants.PAGE_LOAD_TIMEOUT);
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
		gridMemos.waitforVisible();
	}

	public void setDefaultState() {
		String propertyName = "class";
		String propertyNameBob = "aria-checked";
		String propertyValue = "mat-mdc-checkbox-checked";
		if (checkboxBookOfBusiness.isPresent()
				&& checkboxBookOfBusiness.getAttribute(propertyName).contains(propertyValue))
			checkboxBookOfBusiness.click();
		
//		option90Days.click();
		if (!dropdownViewBy.getText().trim().equals("All")) {
//			dropdownDaysInFuture.click();
			dropdownViewBy.click();
			checkboxAllAccounts.waitforVisible();
			if (!checkboxAllAccounts.getAttribute(propertyName).contains(propertyValue))
				checkboxAllAccounts.click();
			if (!checkboxAllClients.getAttribute(propertyName).contains(propertyValue))
				checkboxAllClients.click();
			if (!checkboxAllPortfolios.getAttribute(propertyName).contains(propertyValue))
				checkboxAllPortfolios.click();
			if (!checkboxAllSecurities.getAttribute(propertyName).contains(propertyValue))
				checkboxAllSecurities.click();
			if (checkboxAllAffiliations.isPresent()
					&& !checkboxAllAffiliations.getAttribute(propertyName).contains(propertyValue))
				checkboxAllAffiliations.click();
			buttonRefresh.click();
			if(buttonRefresh.isDisplayed()) {
				buttonRefresh.click();
			}
			waitForGridToLoad();
		}
		dropdownCalDays.click();
		//dropdownDaysInFuture.click();
		option90Days.click();
		waitForPageToLoad();
	}

}
