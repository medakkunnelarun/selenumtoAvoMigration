package com.unity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.unity.constants.AppConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityGridElement;
import com.unity.customelements.UnityWebElement;

public class MaintenancePage extends BaseTestPage {

	WebDriver driver;

	public MaintenancePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}

	@FindBy(xpath = "//mat-select[@role='listbox']")
	public UnityWebElement dropdownViewTopicsForTenant;

	@FindBy(xpath = "//*[normalize-space(text())='Account Topics']")
	public UnityWebElement tabAccountTopics;

	@FindBy(xpath = "//*[normalize-space(text())='Client Topics']")
	public UnityWebElement tabClientTopics;

	@FindBy(xpath = "//*[normalize-space(text())='Notifications']")
	public UnityWebElement tabNotifications;

	@FindBy(xpath = "//div[contains(text(),'All date time displayed in below grid are in EST t')]")
	public UnityWebElement labelAdminNotification;

	@FindBy(xpath = "//button[@aria-label='Add new']")
	public UnityWebElement buttonAddNew;

	@FindBy(css = "div[role='grid']")
	public UnityGridElement gridNotifications;

	@FindBy(css = "div[role='grid']")
	public UnityGridElement gridAccountTopics;

	@FindBy(xpath = "//span[normalize-space(text())='Edit']")
	public UnityWebElement linkActionEdit;

	@FindBy(xpath = "//span[normalize-space(text())='Delete']")
	public UnityWebElement linkActionDelete;

	@FindBy(xpath = "//input[contains(@class,'input-topic-name mat-input-element')]")
	public UnityWebElement textboxAccountTopicName;

	@FindBy(xpath = "//button[*[normalize-space(text())='Submit']]")
	public UnityWebElement buttonSubmit;

	@FindBy(xpath = "//button[*[normalize-space(text())='Cancel']]")
	public UnityWebElement buttonCancel;

	@FindBy(xpath = "//strong[normalize-space(text())='Account Topic Name']")
	public UnityWebElement labelAccountTopicName;

	@FindBy(xpath = "//strong[normalize-space(text())='Client Topic Name']")
	public UnityWebElement labelClientTopicName;

	@FindBy(xpath = "//button/span[normalize-space(text())='Ok']")
	public UnityWebElement buttonPopupOk;

	@FindBy(xpath = "//button/span[normalize-space(text())='Delete']")
	public UnityWebElement buttonPopupDelete;

	@FindBy(xpath = "//button/span[normalize-space(text())='Close']")
	public UnityWebElement buttonPopupClose;

	@FindBy(xpath = "//mat-error[normalize-space(text())='Name must not be empty.']")
	public UnityWebElement labelAccountTopicNameTexboxError;

	@FindBy(xpath = "//mat-error[normalize-space(text())='Name already exists.']")
	public UnityWebElement labelSameAccountNameTexboxError;

	@FindBy(xpath = "//h2[normalize-space(text())='Cannot delete this topic because the following account(s) reference it:']")
	public UnityWebElement headerDeleteAccountReferencePopup;

	@FindBy(xpath = "//h2[normalize-space(text())='Cannot delete this topic because the following client(s) reference it:']")
	public UnityWebElement headerDeleteClientReferencePopup;

	// Add new notification elements
	@FindBy(xpath = "//h2[normalize-space(text())='Add New Notification']")
	public UnityWebElement headerAddNewNotification;

	@FindBy(xpath = "//*[normalize-space(text())='Type*']")
	public UnityWebElement labelType;

	@FindBy(xpath = "//*[normalize-space(text())='Start Date*']")
	public UnityWebElement labelStartDate;

	@FindBy(xpath = "//*[normalize-space(text())='Start Time*']")
	public UnityWebElement labelStartTime;

	@FindBy(xpath = "//*[normalize-space(text())='End Date*']")
	public UnityWebElement labelEndDate;

	@FindBy(xpath = "//*[normalize-space(text())='End Time*']")
	public UnityWebElement labelEndTime;

	@FindBy(xpath = "//*[normalize-space(text())='Text*']")
	public UnityWebElement labelText;

	@FindBy(xpath = "//mat-select")
	public UnityWebElement dropdownType;

	@FindBy(xpath = "//mat-option[*[normalize-space(text())='Critical']]")
	public UnityWebElement optionCritical;

	@FindBy(xpath = "//mat-option[*[normalize-space(text())='Warning']]")
	public UnityWebElement optionWarning;

	@FindBy(xpath = "//mat-option[*[normalize-space(text())='Informational']]")
	public UnityWebElement optionInformational;

	@FindBy(xpath = "//input[@formcontrolname='startDate']")
	public UnityWebElement textboxStartDate;

	@FindBy(xpath = "//time-picker[.//*[normalize-space(text())='Start Time*']]")
	public UnityWebElement timePickerStartTime;

	@FindBy(xpath = "//input[@formcontrolname='endDate']")
	public UnityWebElement textboxEndDate;

	@FindBy(xpath = "//time-picker[.//*[normalize-space(text())='End Time*']]")
	public UnityWebElement timePickerEndTime;

	@FindBy(xpath = "//textarea[@formcontrolname='notificationMessage']")
	public UnityWebElement textboxText;

	@FindBy(xpath = "//mat-error")
	public UnityWebElement labelErrorMessage;

	@FindBy(xpath = "//mat-dialog-content")
	public UnityWebElement labelSuccessMessage;

	@FindBy(xpath = "//button[*[normalize-space(text())='Ok']]")
	public UnityWebElement buttonOK;

	// Edit Notification elements
	@FindBy(xpath = "//h2[normalize-space(text())='Edit Notification']")
	public UnityWebElement headerEditNotification;

	@FindBy(xpath = "//button[*[normalize-space(text())='Update']]")
	public UnityWebElement buttonUpdate;

	// Delete Notification elements
	@FindBy(xpath = "//h2[normalize-space(text())='Delete Notification']")
	public UnityWebElement headerDeleteNotification;

	@FindBy(xpath = "//div[@class='delete-topic-confirmation']/p")
	public UnityWebElement labelDeleteConfirmation;

	@FindBy(xpath = "//button[*[normalize-space(text())='Delete']]")
	public UnityWebElement buttonDelete;

	@Override
	public void waitForPageToLoad() {
		startTime = System.currentTimeMillis();
		if (super.waitforAjaxtoComplete(driver))
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
