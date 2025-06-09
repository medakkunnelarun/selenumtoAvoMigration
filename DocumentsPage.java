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
import com.unity.customelements.UnityTableElement;
import com.unity.customelements.UnityWebElement;
import com.unity.utilities.UnityUtils;

public class DocumentsPage extends BaseTestPage {
	WebDriver driver;

	public DocumentsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}
	
	@FindBy(xpath = "//mat-select[@formcontrolname='documentCategory']")
	public UnityWebElement addNewDoc_documentCategoryDropDown;

	@FindBy(xpath = "//mat-select[@formcontrolname='documentType']")
	public UnityWebElement addNewDoc_documentTypeDropDown;

	@FindBy(xpath = "//span[contains(text(),'Updated Information')]")
	public UnityWebElement optionUpdatedInformation;

	@FindBy(xpath = "//ag-grid-angular")
	public UnityGridElement gridDocumentVault;

	@FindBy(xpath = "//span[contains(@id,'ModifyViewCaption')]")
	public UnityWebElement labelModifyView;

	@FindBy(xpath = "//a[normalize-space(text())='Add New']")
	public UnityWebElement linkAddNew;
	
	@FindBy(xpath = "//span[normalize-space(text())='Add New']")
	public UnityWebElement linkTDAddNew;

	@FindBy(xpath = "//iframe[contains(@src,'Documents')]")
	public UnityWebElement frameDocument;

	@FindBy(xpath = "//iframe[@name='DocAdd']")
	public UnityWebElement frameDocumentAdd;

	@FindBy(xpath = "//iframe[@name='DocEdit']")
	public UnityWebElement frameDocumentEdit;

	@FindBy(xpath = "//table[@class='rgMasterTable']")
	public UnityTableElement tableDocuments;

	@FindBy(xpath = "//div[contains(@id,'ctlDocuments_ctlGridContainer')]")
	public UnityTableElement tableDocumentsLibrary;

//	@FindBy(css = "div[role='grid']")
//	public UnityGridElement gridDocumentVault;

	// Document upload

	@FindBy(xpath = "//input[contains(@id,'ctlDocUpload_ctlDocumentName')]")
	public UnityWebElement textboxDocumentName;

	@FindBy(xpath = "//textarea[contains(@id,'DocumentDescription')]")
	public UnityWebElement textboxDocumentDescription;

	@FindBy(xpath = "//input[contains(@id,'ctlDocUpload_ctlDocCatType_Input')]")
	public UnityWebElement dropdownDocumentCategory;

	@FindBy(xpath = "//div[@id='ctl00_ContentPlaceHolderPage_ctlDocUpload_ctlDocCatType_DropDown']//ul")
	public UnityWebElement listDocumentCategory;

	@FindBy(xpath = "//input[contains(@id,'ctlDocUpload_ctlDocTypeCombo_Input')]")
	public UnityWebElement dropdownDocumentType;

	@FindBy(xpath = "//input[@type='file']")
	public UnityWebElement buttonFilePath;

	@FindBy(xpath = "//input[contains(@id,'ctlDocUpload_ctlUploadBtn')]")
	public UnityWebElement buttonUpload;

	@FindBy(xpath = "//li[@class='rcbHovered' and text()='Contractual']")
	public UnityWebElement textContractual;

	@FindBy(xpath = "//li[@class='rcbItem' and text()='Passport']")
	public UnityWebElement textPassport;

	@FindBy(xpath = "//div[@id='ctl00_ContentPlaceHolderPage_ctlDocUpload_ctlDocTypeCombo_DropDown']")
	public UnityWebElement listDocumentType;

	@FindBy(xpath = "//a[span[normalize-space(text())='Close']]")
	public UnityWebElement linkClose;

	@FindBy(xpath = "//small[@class='ng-star-inserted']")
	public UnityWebElement textEntityName;

	@FindBy(xpath = "//span[normalize-space(text())='Basic Options']")
	public UnityWebElement labelBasicOptionsKey;

	@FindBy(xpath = "//span[normalize-space(text())='Start Date']")
	public UnityWebElement labelStartDateKey;

	@FindBy(xpath = "//span[normalize-space(text())='End Date']")
	public UnityWebElement labelEndDateKey;

	@FindBy(xpath = "//span[normalize-space(text())='Portfolio']")
	public UnityWebElement labelPortfolioKey;

	@FindBy(xpath = "//span[normalize-space(text())='Items per page']")
	public UnityWebElement labelItemsPerPageKey;

	@FindBy(xpath = "//span[normalize-space(text())='Document Category']")
	public UnityWebElement labelDocumentCategoryKey;

	@FindBy(xpath = "//span[normalize-space(text())='Document Type']")
	public UnityWebElement labelDocumentTypeKey;

	@FindBy(xpath = "//input[@value='Refresh']")
	public UnityWebElement buttonRefresh;

	@FindBy(xpath = "//input[@value='Cancel']")
	public UnityWebElement buttonCancel;

	@FindBy(xpath = "//span[normalize-space(text())='Include Event Documents']")
	public UnityWebElement labelIncludeEventDocumentsKey;

	@FindBy(xpath = "//td[contains(@class,'modifyViewDropDownImageHolder')]")
	public UnityWebElement dropdownModifyView;

	@FindBy(xpath = "//a[contains(@id,'ctlGridPager_ctlLast')]")
	public UnityWebElement buttonLastRecord;

	@FindBy(xpath = "//h2[normalize-space(text())='Add New Document']")
	public UnityWebElement labelAddNewDocument;
	
	@FindBy(xpath = "//h2[normalize-space(text())='Edit Document']")
	public UnityWebElement labelEditDocument;

	@FindBy(xpath = "//span[normalize-space(text())='No File Chosen']")
	public UnityWebElement labelNoFileChoosen;

	@FindBy(xpath = "//unity-upgrade-column-filter/button//span//mat-icon")
	public UnityWebElement linkColumnFilter;

	@FindBy(xpath = "//button[span[normalize-space(text())='Save']]")
	public UnityWebElement buttonSaveFilterGrid;
	
	@FindBy(xpath = "//button//span[normalize-space(text())='Save']")
	public UnityWebElement buttonEditSave;
	
	@FindBy(xpath = "//button//span[normalize-space(text())='Ok']")
	public UnityWebElement buttonEditOk;
	
	@FindBy(xpath = "//mat-dialog-content[normalize-space(text())='Document updated successfully']")
	public UnityWebElement labelDocumentUpdateSuccessfully;

	@FindBy(xpath = "//label[normalize-space(text())='Created Date / Time']/ancestor::mat-checkbox")
	public UnityWebElement checkboxCreatedDatTime;

	@FindBy(xpath = "//label[normalize-space(text())='Document Size (bytes)']/ancestor::mat-checkbox")
	public UnityWebElement checkboxDocumentSizebytes;

	@FindBy(xpath = "//label[normalize-space(text())='File Name']/ancestor::mat-checkbox")
	public UnityWebElement checkboxFileName;

	@FindBy(xpath = "//label[normalize-space(text())='Modified Date / Time']/ancestor::mat-checkbox")
	public UnityWebElement checkboxModifiedDateTime;

	@FindBy(xpath = "//label[normalize-space(text())='Revision Name']/ancestor::mat-checkbox")
	public UnityWebElement checkboxRevisionName;

	@FindBy(xpath = "//label[normalize-space(text())='Status']/ancestor::mat-checkbox")
	public UnityWebElement checkboxStatus;

	@FindBy(xpath = "//ag-grid-angular")
	public UnityGridElement gridDocumentClient;

	@FindBy(xpath = "//unity-grid-column-filter/a")
	public UnityWebElement columnFilter;

	@FindBy(xpath = "//column-filter-dialog//span[contains(text(),' Created Date / Time')]")
	public UnityWebElement columnFilter_CreatedDateTime;

	@FindBy(xpath = "//column-filter-dialog//span[contains(text(),' Document Size (bytes)')]")
	public UnityWebElement columnFilter_DocumentSize;

	@FindBy(xpath = "//column-filter-dialog//span[contains(text(),'File Name')]")
	public UnityWebElement columnFilter_FileName;

	@FindBy(xpath = "//column-filter-dialog//span[contains(text(),'Modified Date / Time')]")
	public UnityWebElement columnFilter_ModifiedDateTime;

	@FindBy(xpath = "//column-filter-dialog//span[contains(text(),'Revision Name')]")
	public UnityWebElement columnFilter_RevisionName;

	@FindBy(xpath = "//column-filter-dialog//span[contains(text(),'Status')]")
	public UnityWebElement columnFilter_Status;

	@FindBy(xpath = "//mat-panel-title[normalize-space(text())='Advanced Filters']")
	public UnityWebElement linkAdvancedFilters;

	@FindBy(xpath = "//input[@formcontrolname='docNameSearch']")
	public UnityWebElement textBoxDocumentNameSearch;

	@FindBy(xpath = "//mat-select[@formcontrolname='documentCategory']//div[contains(@class,'mat-mdc-select-arrow')]")
	public UnityWebElement documentCategoryDropDownButton;

	@FindBy(xpath = "//mat-select[@formcontrolname='documentType']//div[contains(@class,'mat-mdc-select-arrow')]")
	public UnityWebElement documentTypeDropDownButton;

	@FindBy(xpath = "//input[@formcontrolname='startDate']")
	public UnityWebElement textBoxStartDate;

	@FindBy(xpath = "//input[@formcontrolname='endDate']")
	public UnityWebElement textBoxEndDate;

	@FindBy(xpath = "//button[@type='submit']")
	public UnityWebElement buttonSubmit;

	@FindBy(xpath = "//button[span[contains(text(),'Clear All')]]")
	public UnityWebElement buttonClear;

	@FindBy(xpath = "//mat-option/span[contains(text(),'Account')]")
	public UnityWebElement documentCategory_Account;

	@FindBy(xpath = "//mat-option/span[contains(text(),'Client')]")
	public UnityWebElement documentCategory_Client;

	@FindBy(xpath = "//mat-option/span[contains(text(),'Client Onboarding Documentation')]")
	public UnityWebElement documentType_ClientOnboardingDocumentation;

	@FindBy(xpath = "//input[@aria-invalid='true'][@formcontrolname='endDate']")
	public UnityWebElement textBoxEndDate_InvalidDate;

	@FindBy(xpath = "//button[@aria-label='Add new']")
	public UnityWebElement buttonAddNew;

	@FindBy(xpath = "//input[@formcontrolname='documentName']")
	public UnityWebElement addNewDoc_textBoxDocumentName;

	@FindBy(xpath = "//input[@formcontrolname='documentName'][@aria-invalid='true']")
	public UnityWebElement addNewDoc_textBoxDocumentName_InvalidInput;

//	@FindBy(xpath = "//mat-dialog-container//mat-select[@formcontrolname='documentCategory']//div[@class='mat-select-arrow']")
//	public UnityWebElement addNewDoc_documentCategoryDropDown;
//
//	@FindBy(xpath = "//mat-dialog-container//mat-select[@formcontrolname='documentType']//div[@class='mat-select-arrow']")
//	public UnityWebElement addNewDoc_documentTypeDropDown;

	@FindBy(xpath = "//textarea[@formcontrolname='documentDescription']")
	public UnityWebElement addNewDoc_textBoxdocumentDescription;

	@FindBy(xpath = "//textarea[@formcontrolname='documentDescription'][@aria-invalid='true']")
	public UnityWebElement addNewDoc_textBoxdocumentDescription_InvalidInput;

	@FindBy(xpath = "//button[@aria-label='Choose File'] ")
	public UnityWebElement addNewDoc_buttonChooseFile;

	@FindBy(xpath = "//mat-dialog-container//button[span[contains(text(),'Cancel')]] ")
	public UnityWebElement addNewDoc_buttonCancel;

	@FindBy(xpath = "//mat-dialog-container//button[@type='submit']")
	public UnityWebElement addNewDoc_buttonSubmit;
	
	@FindBy(xpath = "//mat-dialog-container//button[@type='submit']//*[contains(text(),'Save')]")
	public UnityWebElement addNewDoc_buttonSave;

	@FindBy(xpath = "//span[normalize-space(text())='Account Information']")
	public UnityWebElement optionAccountInformation;
	
//	@FindBy(xpath = "//span[normalize-space(text())='Updated Information']")
//	public UnityWebElement optionUpdatedInformation;

	@FindBy(xpath = "//div[@aria-label='Notes status']")
	public UnityWebElement labelDocumentAddedSuccessfully;
	
	@FindBy(xpath = "//div[@class='delete-topic-confirmation']")
	public UnityWebElement labelDocumentDeletedSuccessfully;
	
	@FindBy(xpath = "//button[@aria-label='create']")
	public UnityWebElement buttonOK;
	
	@FindBy(xpath = "//button[span[contains(text(),'Delete')]]")
	public UnityWebElement buttonDelete;
	
	@FindBy(xpath = "//button//span[normalize-space(text())='Cancel']")
	public UnityWebElement buttonDeleteCancel;
	
	@FindBy(xpath = "//h2[normalize-space(text())='Delete Document']")
	public UnityWebElement labelDeleteDocument;
	
	@FindBy(xpath = "//mat-dialog-content[normalize-space(text()='Document deleted successfully')]")
	public UnityWebElement labelDocumentDeletedSuccessfullyAddv;
	
	
	
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

	public void selectDocumentCategory(String documentType) {
		UnityUtils.wait(2000);
		dropdownDocumentCategory.click();
		UnityUtils.wait(3000);
		listDocumentCategory.waitforVisible();
		List<WebElement> documentTypeList = listDocumentCategory
				.findElements(By.xpath(".//li[normalize-space(text())='" + documentType + "']"));
		if (!documentTypeList.isEmpty())
			documentTypeList.get(0).click();
		else {
			dropdownDocumentCategory.sendKeys(documentType);
			listDocumentCategory.waitforVisible();
			listDocumentCategory.findElements(By.xpath(".//li[normalize-space(text())='" + documentType + "']")).get(0).click();
		}
	}

	public void selectDocumentType(String documentType) {
		UnityUtils.wait(2000);
		dropdownDocumentType.click();
		listDocumentType.waitforVisible();
		UnityUtils.wait(2000);
		List<WebElement> documentTypeList = listDocumentType
				.findElements(By.xpath(".//li[normalize-space(text())='" + documentType + "']"));
		if (!documentTypeList.isEmpty())
			documentTypeList.get(0).click();
		else {
			dropdownDocumentType.sendKeys(documentType);
			listDocumentType.waitforVisible();
			listDocumentType.findElements(By.xpath("//li[normalize-space(text())='" + documentType + "']")).get(0).click();
		}
	}

}
