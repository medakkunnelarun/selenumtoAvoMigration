package com.unity.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.unity.constants.AppConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityTableElement;
import com.unity.customelements.UnityWebElement;

public class FormDetailsPage extends BaseTestPage {

	WebDriver driver;

	public FormDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}

	@FindBy(xpath = "//button[@type='button']//span[normalize-space(text())='Refresh']")
	public UnityWebElement buttonRefresh;
	
	@FindBy(xpath = "//textarea[@name='explanation']")
    public UnityWebElement textboxExplanation;
	
	@FindBy(xpath = "//textarea[@name='descriptionOfStatement']")
    public UnityWebElement textboxDescription;
	
	@FindBy(xpath = "//input[@name='issueName2']")
	public UnityWebElement inputissueName2;
	
	@FindBy(xpath = "//mat-expansion-panel-header//*[normalize-space(text())='Account Information']")
	public UnityWebElement panelAccountInformation;

	@FindBy(xpath = "//mat-expansion-panel-header//*[normalize-space(text())='Transaction Template']")
	public UnityWebElement panelTransactionTemplate;

	@FindBy(xpath = "//mat-expansion-panel-header//*[normalize-space(text())='Transaction']")
	public UnityWebElement panelTransaction;

	@FindBy(xpath = "//mat-expansion-panel-header//*[normalize-space(text())='Documents']")
	public UnityWebElement panelDocuments;

	@FindBy(xpath = "//mat-expansion-panel-header//*[normalize-space(text())='Comments']")
	public UnityWebElement panelComments;

	@FindBy(xpath = "//div[*[normalize-space(text())='More Details']]")
	public UnityWebElement linkMoreDetails;

	@FindBy(xpath = "//span[@class='sg-property-name']")
	public List<WebElement> listAccountInformationKeys;

	@FindBy(xpath = "//span[contains(@class,'sg-property-value')]")
	public List<WebElement> listAccountInformationValues;

	// Document Panel locators
	@FindBy(xpath = "//button[@aria-label='Add New']")
	public UnityWebElement buttonAddNewDocument;

	@FindBy(xpath = "//table[thead]")
	public UnityTableElement tableDocuments;

	@FindBy(xpath = "//h3[normalize-space(text())='Document Upload']")
	public UnityWebElement headerDocumentUpload;

	@FindBy(xpath = "//button[@aria-label='Choose File']")
	public UnityWebElement buttonChooseFile;

	@FindBy(xpath = "//input[@formcontrolname='documentName']")
	public UnityWebElement textboxDocumentName;

	@FindBy(xpath = "//div[normalize-space(text())='Profile' or normalize-space (text())='Profil']")
	public UnityWebElement linkProfile;

	@FindBy(xpath = "//mat-select[@formcontrolname='documentCategory']")
	public UnityWebElement dropdownDocumentCategory;

	@FindBy(xpath = "//textarea[@formcontrolname='documentDescription']")
	public UnityWebElement textboxDocumentDescription;

	@FindBy(xpath = "//mat-select[@formcontrolname='documentType']")
	public UnityWebElement dropdownDocumentType;

	@FindBy(xpath = "//button[span[contains(text(),'Upload')]]")
	public UnityWebElement buttonUpload;

	@FindBy(xpath = "//button[@aria-label='Close dialog']")
	public UnityWebElement buttonCancel;

	@FindBy(xpath = "//mat-option[span[contains(text(),'Automation Test 1')]]")
	public UnityWebElement optionAutomationTest1;

	@FindBy(xpath = "//mat-option[span[contains(text(),' TestInvestments ')]]")
	public UnityWebElement optionTestInvestments;

	@FindBy(xpath = "//mat-option[span[contains(text(),'EXCEL')]]")
	public UnityWebElement optionExcel;

	@FindBy(xpath = "//mat-option[span[contains(text(),' TESTING FOR DROPDOWN FOR DOCUMENT CATEGORY VERIFICATION TEST 3 ')]]")
	public UnityWebElement optionVerificationTest3;

	@FindBy(xpath = "//button[@id='document-upload-form-close']")
	public UnityWebElement buttonClose;

	@FindBy(xpath = "//div[@class='success-dialog']")
	public UnityWebElement successDialogbox;

	// delete document
	@FindBy(xpath = "//button//span[normalize-space(text())='DELETE']")
	public UnityWebElement buttonDocDelete;

	@FindBy(xpath = "//button//span[contains(text(),'Ok')]")
	public UnityWebElement buttonDocOK;

	// Comment Panel locators
	@FindBy(xpath = "//button[@type='button']//span[normalize-space(text())='Add Comment']")
	public UnityWebElement buttonAddComment;

	@FindBy(xpath = "//textarea[@name='comment']")
	public UnityWebElement textboxComment;

	@FindBy(xpath = "//button[@type='button']//span[normalize-space(text())='Save']")
	public UnityWebElement buttonSave;

	@FindBy(xpath = "//div[@class='mat-expansion-panel-body']/ticket-comments/div")
	public UnityTableElement tableComment;

	@FindBy(xpath = "//span[normalize-space(text())='Worklist']/ancestor::div[1]//a[normalize-space(text())='IPP']")
	public UnityWebElement lnkIPPWorklist;

	@FindBy(xpath = "//span[normalize-space(text())='Worklist']/ancestor::div[1]//a[normalize-space(text())='Decisions']")
	public UnityWebElement lnkDecisionsWorklist;

	// User Request list
	@FindBy(xpath = "//span[normalize-space(text())='User Request List']/ancestor::li[1]//a[normalize-space(text())='IPP']")
	public UnityWebElement lnkIPPUserRequestList;

	@FindBy(xpath = "//span[normalize-space(text())='User Request List']/ancestor::li[1]//a[normalize-space(text())='Decisions']")
	public UnityWebElement lnkDecisionsUserRequestList;

	@FindBy(xpath = "//*[@fisicon='link']/ancestor::button")
	public UnityWebElement iconDecisions;

	@FindBy(xpath = "//button[.//span[normalize-space(text())='Return to Forms Dashboard']]")
	public UnityWebElement buttonReturnToFormsDashboard;
	
	@FindBy(xpath = "//button[.//span[normalize-space(text())='Ok']]")
	public UnityWebElement buttonok;

	@FindBy(xpath = "//button[.//span[normalize-space(text())='Submit']]")
	public UnityWebElement buttonSubmit;

	@FindBy(xpath = "//button[normalize-space(text())='Worklist']")
	public UnityWebElement linkWorklist;

	@FindBy(xpath = "//button[normalize-space(text())='User Request List']")
	public UnityWebElement linkUserRequesList;

	@Override
	public void waitForPageToLoad() {
		startTime = System.currentTimeMillis();
		if (!super.isPageLoaded(driver))
			Assert.fail("Timed out after " + AppConstants.PAGE_LOAD_TIMEOUT + " seconds\n");
	}
}
