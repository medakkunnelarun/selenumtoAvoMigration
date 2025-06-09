package com.unity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.unity.constants.AppConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityGridElement;
import com.unity.customelements.UnityWebElement;

public class FeeEventsPage extends BaseTestPage {

	WebDriver driver;

	public FeeEventsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}

	@FindBy(xpath = "//ag-grid-angular")
	public UnityGridElement gridFeeEvents;
	
	@FindBy(xpath = "//*[normalize-space(text())='Book of Business']/ancestor::mat-checkbox")
	public UnityWebElement checkboxBookOfBusiness;
	
	@FindBy(xpath = "//book-of-business-checkbox//mat-select")
	public UnityWebElement dropDownBookOfBusiness;
	
	@FindBy(xpath = "//book-of-business-checkbox//mat-select//div[2]")
	public UnityWebElement dropDownBookOfBusinessarrow;
	
	@FindBy(xpath = "//span[text()='Event Type']//parent::div//preceding-sibling::span")
	public UnityWebElement iconEventTypeMenu;
	
	@FindBy(xpath = "//div[@aria-label='Column Filter']")
	public UnityWebElement panelColumnFilter;
	
	@FindBy(xpath = "//mat-option//span[text()='Test group2']")
	public UnityWebElement optionBOBByOther;
	
	@FindBy(xpath = "//mat-option//span[text()='Original BoB']")
	public UnityWebElement optionOriginalBOB;
	
	@FindBy(xpath = "//mat-option//span[text()='Test_24.3']")
	public UnityWebElement optionDefaultBOB;
	
	@FindBy(xpath = "//mat-option//span[text()='AC-3']")
	public UnityWebElement optionAC3;
	
	@FindBy(xpath = "//mat-option//span[text()='test']")
	public UnityWebElement optionReg23;
	
	@FindBy(xpath = "//mat-option//span[text()='Demo']")
	public UnityWebElement optionDemo;
	
	@FindBy(xpath = "//label[normalize-space(text())='Favorites']/ancestor::mat-checkbox")
	public UnityWebElement checkboxFavorites;

	@FindBy(xpath = "//Label[normalize-space(text())='Recent']/ancestor::mat-checkbox")
	public UnityWebElement checkboxRecent;
	
	@FindBy(xpath = "//label[normalize-space(text())='Include Expired Events']/ancestor::mat-checkbox")
	public UnityWebElement checkboxIncludeExpiredEvents;
	
	@FindBy(xpath = "//input[contains(@id,'mat-input')]")
	public UnityWebElement textboxSearch;

	@FindBy(xpath = "//button//span[normalize-space(text())='Reset']")
	public UnityWebElement buttonClear;
	
	@FindBy(xpath = "//label[normalize-space(text())='Administrator']/ancestor::mat-checkbox")
	public UnityWebElement checkboxAdministrator;
	
	@FindBy(xpath = "//label[normalize-space(text())='Allocation Method']/ancestor::mat-checkbox")
	public UnityWebElement checkboxAllocationMethod;
	
	@FindBy(xpath = "//label[normalize-space(text())='As of Date']/ancestor::mat-checkbox")
	public UnityWebElement checkboxAsOfDate;
	
	@FindBy(xpath = "//label[normalize-space(text())='Branch']/ancestor::mat-checkbox")
	public UnityWebElement checkboxBranch;
	
	@FindBy(xpath = "//label[normalize-space(text())='Branch Code']/ancestor::mat-checkbox")
	public UnityWebElement checkboxBranchCode;
	
	@FindBy(xpath = "//label[normalize-space(text())='Block Number']/ancestor::mat-checkbox")
	public UnityWebElement checkboxBlockNumber;
	
	@FindBy(xpath = "//label[normalize-space(text())='Collection Method']/ancestor::mat-checkbox")
	public UnityWebElement checkboxCollectionMethod;
	
	@FindBy(xpath = "//label[normalize-space(text())='Current Fee Year']/ancestor::mat-checkbox")
	public UnityWebElement checkboxCurrentFeeYear;
	
	@FindBy(xpath = "//label[normalize-space(text())='Current Fees Taken']/ancestor::mat-checkbox")
	public UnityWebElement checkboxCurrentFeesTaken;
	
	@FindBy(xpath = "//label[normalize-space(text())='Description Code']/ancestor::mat-checkbox")
	public UnityWebElement checkboxDescriptionCode;
	
	@FindBy(xpath = "//label[normalize-space(text())='Description Code Description']/ancestor::mat-checkbox")
	public UnityWebElement checkboxDescriptionCodeDescription;
	
	@FindBy(xpath = "//label[normalize-space(text())='Event Class']/ancestor::mat-checkbox")
	public UnityWebElement checkboxEventClass;
	
	@FindBy(xpath = "//label[normalize-space(text())='Event Class Code']/ancestor::mat-checkbox")
	public UnityWebElement checkboxEventClassCode;
	
	@FindBy(xpath = "//label[normalize-space(text())='Event Name']/ancestor::mat-checkbox")
	public UnityWebElement checkboxEventName;
	
	@FindBy(xpath = "//label[normalize-space(text())='Fee Schedule Description']/ancestor::mat-checkbox")
	public UnityWebElement checkboxFeeScheduleDescription;
	
	@FindBy(xpath = "//label[normalize-space(text())='Fee Schedule Number']/ancestor::mat-checkbox")
	public UnityWebElement checkboxFeeScheduleNumber;
	
	@FindBy(xpath = "//label[normalize-space(text())='Frequency']/ancestor::mat-checkbox")
	public UnityWebElement checkboxFrequency;
	
	@FindBy(xpath = "//label[normalize-space(text())='Last Scheduled Execution']/ancestor::mat-checkbox")
	public UnityWebElement checkboxLastScheduledExecution;
	
	@FindBy(xpath = "//label[normalize-space(text())='Next Scheduled Execution']/ancestor::mat-checkbox")
	public UnityWebElement checkboxNextScheduledExecution;
	
	@FindBy(xpath = "//label[normalize-space(text())='Previous Fees Taken']/ancestor::mat-checkbox")
	public UnityWebElement checkboxPreviousFeesTaken;
	
	@FindBy(xpath = "//label[normalize-space(text())='Prior Fee Year']/ancestor::mat-checkbox")
	public UnityWebElement checkboxPriorFeeYear;
	
	@FindBy(xpath = "//label[normalize-space(text())='Responsible Employee']/ancestor::mat-checkbox")
	public UnityWebElement checkboxResponsibleEmployee;
	
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