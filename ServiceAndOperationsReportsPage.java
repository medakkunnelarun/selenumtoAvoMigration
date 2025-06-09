package com.unity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.unity.constants.AppConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityWebElement;

public class ServiceAndOperationsReportsPage extends BaseTestPage {

	WebDriver driver;

	public ServiceAndOperationsReportsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}

	@FindBy(xpath = "//mat-select[@aria-label='View by']")
	public UnityWebElement dropdownServiceOperationsReports;
	
	@FindBy(xpath = "//span[normalize-space(text())='Workflow audit']")
	public UnityWebElement optionWorkflowAudit;
	
	@FindBy(xpath = "//span[normalize-space(text())='Security cross reference']")
	public UnityWebElement optionSecurityCrossReference;
	
	@FindBy(xpath = "//iframe[contains(@src,'AuditReport')]")
	public UnityWebElement frameAuditReport;
	
	@FindBy(xpath = "//iframe[contains(@src,'SecurityCrossRefReport')]")
	public UnityWebElement frameSecurityCrossReferenceReport;
		
	@FindBy(xpath = "//a[contains(@id,'TicketRadComboBox_Arrow')]")
	public UnityWebElement linkTicketId;
	
	@FindBy(xpath = "//div[contains(@id,'TicketLookup_ctlTicketRadComboBox_DropDown')]")
	public UnityWebElement optionsTicketId;
	
	@FindBy(xpath = "//input[contains(@id,'TransactionAuditSearchCriteria_ctlSearch')]")
	public UnityWebElement buttonGenerateReport;
	
	@FindBy(xpath = "//input[contains(@id,'SecurityRadComboBox_Input')]")
	public UnityWebElement textboxSecurity;
	
	@FindBy(xpath = "//div[contains(@id,'SecurityRadComboBox_DropDown')]")
	public UnityWebElement optionSecurity;
	
	@FindBy(xpath = "//input[contains(@id,'SecurityCrossReferenceSearchCriteria_ctlSearch')]")
	public UnityWebElement buttonSearch;
	
	@FindBy(xpath = "//em[normalize-space(text())='Security Cross Reference']")
	public UnityWebElement labelSecurityCrossReference;
	
	@FindBy(xpath = "//em[normalize-space(text())='Total Summary']")
	public UnityWebElement labelTotalSummary;
	
	@FindBy(xpath = "//table//div[contains(@id,'ctlSecurityCrossReferenceList_ctlGenericGrid_ctlGridContainer')]//tr[2]")
	public UnityWebElement tableRow;
	
	@FindBy(xpath = "//table[@class='dtlsCtl_tbl']//span[normalize-space(text())='Restricted Units']")
	public UnityWebElement labelRestrictedUnits;
	
	@Override
	public void waitForPageToLoad() {
		startTime = System.currentTimeMillis();
		if (super.waitforAjaxtoComplete(driver))
			try {
				dropdownServiceOperationsReports.waitforVisible(AppConstants.PAGE_LOAD_TIMEOUT);
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
