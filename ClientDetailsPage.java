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
import com.unity.customelements.UnityTableElement;
import com.unity.customelements.UnityWebElement;

public class ClientDetailsPage extends BaseTestPage {

	WebDriver driver;

	public ClientDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}

	@FindBy(xpath = "//client-synopsis//mat-icon")
	public UnityWebElement buttonSynopsis;
	
	@FindBy(xpath = "//*[contains(@class,'fis-icon-print')]")
	public UnityWebElement buttonPrint;

	@FindBy(xpath = "(//unity-search//button)[2]")
	public UnityWebElement iconLocalSearch;

	@FindBy(xpath = "//*[normalize-space(text())='Search by Client']")
	public UnityWebElement labelSearchByClient;

	@FindBy(xpath = "//*[normalize-space(text())='Search by Client']/ancestor::div/input")
	public UnityWebElement textBoxSearchFor;

	//@FindBy(xpath = "//mat-card-title[normalize-space(text())='Asset Allocation']/ancestor::mat-card//button[@aria-label]")
	@FindBy(xpath = "//*[normalize-space(text())='Asset Allocation']/ancestor::mat-card//button[@aria-label]")
	public UnityWebElement panelAssetAllocation;

	@FindBy(xpath = "//button[following-sibling::mat-menu[@id='entity-information-select-menu']]")
	public UnityWebElement dropdownViewBy;

	@FindBy(xpath = "//button[span[normalize-space(text())='Minor Security']]")
	public UnityWebElement optionMinorSecurity;

	@FindBy(xpath = "//button[span[normalize-space(text())='Major Security']]")
	public UnityWebElement optionMajorSecurity;

	@FindBy(xpath = "//div[contains(@class,'asset-allocation')]//table")
	public UnityTableElement tableAssetAllocation;

	// Client information tab items
	@FindBy(xpath = "//*[normalize-space(text())='Client Information']")
	public UnityWebElement tabClientInformation;

	@FindBy(xpath = "//mat-icon[@fisicon='edit']")
	public UnityWebElement buttonEdit;

	@FindBy(xpath = "//h2[normalize-space(text())='Edit Client Information']")
	public UnityWebElement headerEditClientInformation;

	@FindBy(xpath = "//iframe[contains(@src,'NAME')]")
	public UnityWebElement frameEditClient;

	@FindBy(xpath = "//input[contains(@id,'ctlClientName_ctlFullName')]")
	public UnityWebElement textboxFullName;

	@FindBy(xpath = "//input[@type='button' and @value='Submit']")
	public UnityWebElement buttonSubmit;

	// Client information tab panels
	@FindBy(xpath = "//mat-expansion-panel//mat-expansion-panel-header//span//mat-panel-title[normalize-space(text())='Name']")
	public UnityWebElement panelName;

	@FindBy(xpath = "//mat-expansion-panel[.//mat-panel-title[normalize-space(text())='Bank']]")
	public UnityWebElement panelBank;

	@FindBy(xpath = "//mat-expansion-panel[.//mat-panel-title[normalize-space(text())='Tax']]")
	public UnityWebElement panelTax;

	@FindBy(xpath = "//mat-expansion-panel[.//mat-panel-title[normalize-space(text())='Demographic Data']]")
	public UnityWebElement panelDemographicData;

	@FindBy(xpath = "//mat-expansion-panel[.//mat-panel-title[normalize-space(text())='Miscellaneous']]")
	public UnityWebElement panelMiscellaneous;

	@FindBy(xpath = "//mat-panel-title[contains(text(),'Contacts')]")
	public UnityWebElement panelContacts;

	@FindBy(xpath = "//mat-expansion-panel[.//mat-panel-title[normalize-space(text())='Addresses']]")
	public UnityWebElement panelAddresses;

	// Client information tab panel items
	@FindBy(xpath = "//span[normalize-space(text())='Type of Client']")
	public UnityWebElement labelTypeOfClientKey;

	@FindBy(xpath = "//span[normalize-space(text())='Full Name']")
	public UnityWebElement labelFullNameKey;

	@FindBy(xpath = "//span[normalize-space(text())='Extended Name']")
	public UnityWebElement labelExtendedNameKey;

	@FindBy(xpath = "//span[normalize-space(text())='Party Type']")
	public UnityWebElement labelPartyTypeKey;

	@FindBy(xpath = "//span[normalize-space(text())='Title']")
	public UnityWebElement labelTitleKey;

	@FindBy(xpath = "//span[normalize-space(text())='Extended Title']")
	public UnityWebElement labelExtendedTitleKey;

	@FindBy(xpath = "//span[normalize-space(text())='First Name']")
	public UnityWebElement labelFirstNameKey;

	@FindBy(xpath = "//span[normalize-space(text())='Middle Name']")
	public UnityWebElement labelMiddleNameKey;

	@FindBy(xpath = "//span[normalize-space(text())='Last Name']")
	public UnityWebElement labelLastNameKey;

	@FindBy(xpath = "//span[normalize-space(text())='Bank']")
	public UnityWebElement labelBankKey;

	@FindBy(xpath = "//span[normalize-space(text())='Bank Routing Symbol']")
	public UnityWebElement labelBankRoutingSymbolKey;

	@FindBy(xpath = "//span[normalize-space(text())='Bank Account Number']")
	public UnityWebElement labelBankAccountNumberKey;

	@FindBy(xpath = "//span[normalize-space(text())='Credit Rating']")
	public UnityWebElement labelCreditRatingKey;

	@FindBy(xpath = "//span[normalize-space(text())='Credit Rating Date']")
	public UnityWebElement labelCreditRatingDateKey;

	@FindBy(xpath = "//span[normalize-space(text())='Credit Rating Source']")
	public UnityWebElement labelCreditRatingSourceKey;

	@FindBy(xpath = "//span[normalize-space(text())='Tax ID']")
	public UnityWebElement labelTaxIdKey;
	
	@FindBy(xpath = "//span[normalize-space(text())='Tax ID']/following-sibling::span")
	public UnityWebElement labelTaxIdValue;

	@FindBy(xpath = "//span[normalize-space(text())='NINO']")
	public UnityWebElement labelNinoKey;
	
	@FindBy(xpath = "//span[normalize-space(text())='NINO']/following-sibling::span")
	public UnityWebElement labelNinoValue;

	@FindBy(xpath = "//span[normalize-space(text())='TIN Status']")
	public UnityWebElement labelTinStatusKey;

	@FindBy(xpath = "//span[normalize-space(text())='Personal Property Tax']")
	public UnityWebElement labelPersonalPropertyTaxKey;

	@FindBy(xpath = "//span[normalize-space(text())='Local Tax ID']")
	public UnityWebElement labelLocalTaxIdKey;
	
	@FindBy(xpath = "//span[normalize-space(text())='Local Tax ID']/following-sibling::span")
	public UnityWebElement labelLocalTaxIdValue;

	@FindBy(xpath = "//span[normalize-space(text())='Tax Bracket']")
	public UnityWebElement labelTaxBracketKey;

	@FindBy(xpath = "//span[normalize-space(text())='Tax Country']")
	public UnityWebElement labelTaxCountryKey;

	@FindBy(xpath = "//span[normalize-space(text())='Tax State or Province']")
	public UnityWebElement labelTaxStateOrProvinceKey;

	@FindBy(xpath = "//span[normalize-space(text())='EIN']")
	public UnityWebElement labelEINKey;

	@FindBy(xpath = "//span[normalize-space(text())='SSN']")
	public UnityWebElement labelSSNKey;

	@FindBy(xpath = "//span[normalize-space(text())='Birth Date']")
	public UnityWebElement labelBirthDateKey;

	@FindBy(xpath = "//span[normalize-space(text())='Native Language']")
	public UnityWebElement labelNativeLanguageKey;

	@FindBy(xpath = "//span[normalize-space(text())='Date of Death']")
	public UnityWebElement labelDateOfDeathKey;

	@FindBy(xpath = "//span[normalize-space(text())='Client Acquired By']")
	public UnityWebElement labelClientAcquiredByKey;

	@FindBy(xpath = "//span[normalize-space(text())='Source of Business']")
	public UnityWebElement labelSourceOfBusinessKey;

	@FindBy(xpath = "//span[normalize-space(text())='Occupation']")
	public UnityWebElement labelOccupationKey;

	@FindBy(xpath = "//span[normalize-space(text())='Marital Status']")
	public UnityWebElement labelMaritalStatusKey;

	@FindBy(xpath = "//span[normalize-space(text())='Spouse Birthday']")
	public UnityWebElement labelSpouseBirthdayKey;

	@FindBy(xpath = "//span[normalize-space(text())='Non-Resident?']")
	public UnityWebElement labelNonResidentKey;

	@FindBy(xpath = "//span[normalize-space(text())='Alpha Sort']")
	public UnityWebElement labelAlphaSortKey;

	@FindBy(xpath = "//span[normalize-space(text())='Date Closed']")
	public UnityWebElement labelDateClosedKey;

	@FindBy(xpath = "//span[normalize-space(text())='Date Opened']")
	public UnityWebElement labelDateOpenedKey;

	@FindBy(xpath = "//span[normalize-space(text())='Ethnic Background']")
	public UnityWebElement labelEthnicBackgroundKey;

	@FindBy(xpath = "//span[normalize-space(text())='Gender']")
	public UnityWebElement labelGenderKey;

	@FindBy(xpath = "//span[normalize-space(text())='OFAC Status']")
	public UnityWebElement labelOFACStatusKey;

	@FindBy(xpath = "//span[normalize-space(text())='Last Changed On']")
	public UnityWebElement labelLastChangedOnKey;

	@FindBy(xpath = "//span[normalize-space(text())='Risk Level']")
	public UnityWebElement labelRiskLevelKey;

	@FindBy(xpath = "//span[normalize-space(text())='Initial Contact Date']")
	public UnityWebElement labelInitialContactDateKey;

	@FindBy(xpath = "//span[normalize-space(text())='Last Contact Date']")
	public UnityWebElement labelLastContactDateKey;

	@FindBy(xpath = "//span[normalize-space(text())='Contact Type']")
	public UnityWebElement labelContactTypeKey;

	@FindBy(xpath = "//span[normalize-space(text())='Employment Status']")
	public UnityWebElement labelEmploymentStatusKey;

	@FindBy(xpath = "//span[normalize-space(text())='Alternate External Reference']")
	public UnityWebElement labelAlternateExternalReferenceKey;

	@FindBy(xpath = "//span[normalize-space(text())='Bank Primary Reference']")
	public UnityWebElement labelBankPrimaryReferenceKey;

	@FindBy(xpath = "//span[normalize-space(text())='Contact Branch']")
	public UnityWebElement labelContactBranchKey;

	@FindBy(xpath = "//span[normalize-space(text())='Client GREF']")
	public UnityWebElement labelClientGREFKey;

	@FindBy(xpath = "//span[normalize-space(text())='Statements Delivery Method']")
	public UnityWebElement labelStatementsDeliveryMethodKey;

	@FindBy(xpath = "//span[normalize-space(text())='Quick Reference']")
	public UnityWebElement labelQuickReferenceKey;

	@FindBy(xpath = "//span[normalize-space(text())='Will Prospect Information']")
	public UnityWebElement labelWillProspectInformationKey;

	@FindBy(xpath = "//span[normalize-space(text())='Number of Client Memo Events']")
	public UnityWebElement labelNumberOfClientMemoEventsKey;

	// Label values
	@FindBy(xpath = "//span[normalize-space(text())='Tax ID']//following-sibling::span")
	public UnityWebElement labelTaxIDValue;

	@FindBy(xpath = "//span[normalize-space(text())='SSN']//following-sibling::span")
	public UnityWebElement labelSSNValue;

	@FindBy(xpath = "//span[normalize-space(text())='EIN']//following-sibling::span")
	public UnityWebElement labelEINValue;

	@FindBy(xpath = "//span[@class='sg-property-name']")
	public List<WebElement> labelClientDetailsKeys;

	@FindBy(xpath = "//span[contains(@class,'sg-property-value')]")
	public List<WebElement> labelClientDetailsValues;

	@FindBy(xpath = "//mat-expansion-panel[.//mat-panel-title[normalize-space(text())='Contacts']]//button[.//*[normalize-space(text())='Add New']]")
	public UnityWebElement buttonAddNewContact;

	@FindBy(xpath = "//*[@id='client-contact']//div[@role='grid']")
	public UnityGridElement gridClientContacts;
	
	@FindBy(xpath = "//input[@name='contactInfo']")
	public UnityGridElement textBoxContactInfo;

	@FindBy(xpath = "//mat-expansion-panel[.//mat-panel-title[normalize-space(text())='Contacts']]//unity-grid-column-filter/button")
	public UnityWebElement linkColumnSettingsContactsGrid;
	
	@FindBy(xpath = "//*[text()=' Change Contact Information']")
	public UnityWebElement textChangeContactInfo;
	
	@FindBy(xpath = "//*[text()=' Edit Client Address ']")
	public UnityWebElement headerEditClientAddress;

	@FindBy(xpath = "//mat-expansion-panel[.//mat-panel-title[normalize-space(text())='Contacts']]//unity-export/button")
	public UnityWebElement linkExportContactsGrid;

	@FindBy(xpath = "//ag-grid-angular[@id='client-address-list']")
	public UnityGridElement gridClientAddresses;

	@FindBy(xpath = "//mat-expansion-panel[.//mat-panel-title[normalize-space(text())='Addresses']]//unity-upgrade-column-filter/button")
	public UnityWebElement linkColumnSettingsAddressesGrid;

	@FindBy(xpath = "//mat-expansion-panel[.//mat-panel-title[normalize-space(text())='Addresses']]//unity-export/button")
	public UnityWebElement linkExportAddressesGrid;

	@FindBy(xpath = "//mat-expansion-panel[.//mat-panel-title[normalize-space(text())='Addresses']]//button[.//*[normalize-space(text())='Add New']]")
	public UnityWebElement buttonAddNewAddress;

	// Client Address details
	@FindBy(xpath = "//*[normalize-space(text())='Address Details']")
	public UnityWebElement headerAddressDetails;

	@FindBy(xpath = "//strong[normalize-space(text())='Name:']")
	public UnityWebElement labelNameKey;

	@FindBy(xpath = "//li/*[normalize-space(text())='Address']")
	public UnityWebElement labelAddressKeyAddressDetails;

	@FindBy(xpath = "//li/*[normalize-space(text())='Extended Name']")
	public UnityWebElement labelExtendedNameKeyAddressDetails;

	@FindBy(xpath = "//li/*[normalize-space(text())='State']")
	public UnityWebElement labelStateKeyAddressDetails;

	@FindBy(xpath = "//li/*[normalize-space(text())='Enum Address Type']")
	public UnityWebElement labelEnumAddressTypeKeyAddressDetails;

	@FindBy(xpath = "//li/*[normalize-space(text())='Postal Code']")
	public UnityWebElement labelPostalCodeKeyAddressDetails;

	@FindBy(xpath = "//li/*[normalize-space(text())='Country Number']")
	public UnityWebElement labelCountryNumberKeyAddressDetails;

	@FindBy(xpath = "//li/*[normalize-space(text())='Address Purpose']")
	public UnityWebElement labelAddressPurposeKeyAddressDetails;

	@FindBy(xpath = "//li/*[normalize-space(text())='Country Name']")
	public UnityWebElement labelCountryNameKeyAddressDetails;

	@FindBy(xpath = "//li/*[normalize-space(text())='PO Box']")
	public UnityWebElement labelPOBoxKeyAddressDetails;

	@FindBy(xpath = "//li/*[normalize-space(text())='Country']")
	public UnityWebElement labelCountryKeyAddressDetails;

	@FindBy(xpath = "//li/*[normalize-space(text())='Suite Number']")
	public UnityWebElement labelSuiteNumberKeyAddressDetails;

	@FindBy(xpath = "//li/*[normalize-space(text())='City']")
	public UnityWebElement labelCityKeyAddressDetails;

	@FindBy(xpath = "//li/*[normalize-space(text())='State Number']")
	public UnityWebElement labelStateNumberKeyAddressDetails;

	@FindBy(xpath = "//li/*[normalize-space(text())='Building Unit']")
	public UnityWebElement labelBuildingUnitKeyAddressDetails;

	@FindBy(xpath = "//li/*[normalize-space(text())='State Name']")
	public UnityWebElement labelStateNameKeyAddressDetails;

	@FindBy(xpath = "//li/*[normalize-space(text())='Building Name']")
	public UnityWebElement labelBuildingNameKeyAddressDetails;

	@FindBy(xpath = "//li/*[normalize-space(text())='Rural Route Number']")
	public UnityWebElement labelRuralRouteNumberKeyAddressDetails;

	@FindBy(xpath = "//li/*[normalize-space(text())='Apartment Number']")
	public UnityWebElement labelApartmentNumberKeyAddressDetails;

	@FindBy(xpath = "//li/*[normalize-space(text())='Phone Extension']")
	public UnityWebElement labelPhoneExtensionKeyAddressDetails;

	@FindBy(xpath = "//li/*[normalize-space(text())='Address Purpose Terminate']")
	public UnityWebElement labelAddressPurposeTerminateKeyAddressDetails;

	@FindBy(xpath = "//li/*[normalize-space(text())='Phone Country']")
	public UnityWebElement labelPhoneCountryKeyAddressDetails;

	@FindBy(xpath = "//li/*[normalize-space(text())='Address Additional Info 1']")
	public UnityWebElement labelAddressAdditionalInfo1KeyAddressDetails;

	@FindBy(xpath = "//li/*[normalize-space(text())='Phone']")
	public UnityWebElement labelPhoneKeyAddressDetails;

	@FindBy(xpath = "//li/*[normalize-space(text())='Additional Info 2']")
	public UnityWebElement labelAdditionalInfo2KeyAddressDetails;

	@FindBy(xpath = "//li/*[normalize-space(text())='Options Link']")
	public UnityWebElement labelOptionsLinkKeyAddressDetails;

	@FindBy(xpath = "//li/*[normalize-space(text())='Additional Info 1']")
	public UnityWebElement labelAdditionalInfo1KeyAddressDetails;

	@FindBy(xpath = "//li/*[normalize-space(text())='Mailing Info']")
	public UnityWebElement labelMailingInfoKeyAddressDetails;

	@FindBy(xpath = "//div[@class='sg-property-name']")
	public List<WebElement> labelClientAddressDetailsKeys;

	@FindBy(xpath = "//div[@class='sg-property-value']")
	public List<WebElement> labelClientAddressDetailsValues;

	@FindBy(xpath = "//button[@id='add-new-close']")
	public UnityWebElement buttonClose;

	@FindBy(xpath = "//span[normalize-space(text())='Save']")
	public UnityWebElement buttonSave;

	@FindBy(xpath = "//span[normalize-space(text())='Country']/preceding-sibling::div/input")
	public UnityWebElement checkboxCountry;

	@FindBy(xpath = "//span[normalize-space(text())='Country Code']/preceding-sibling::div/input")
	public UnityWebElement checkboxCountryCode;

	@FindBy(xpath = "//span[normalize-space(text())='Building Unit']/preceding-sibling::div/input")
	public UnityWebElement checkboxBuildingUnit;

	@FindBy(xpath = "//span[normalize-space(text())='Building Name']/preceding-sibling::div/input")
	public UnityWebElement checkboxBuildingName;

	@FindBy(xpath = "//span[normalize-space(text())='Apartment Number']/preceding-sibling::div/input")
	public UnityWebElement checkboxApartmentNumber;

	@FindBy(xpath = "//span[normalize-space(text())='Address Purpose Terminate']/preceding-sibling::div/input")
	public UnityWebElement checkboxAddressPurposeTerminate;

	@FindBy(xpath = "//label[normalize-space(text())='Address Purpose']/ancestor::mat-checkbox")
	public UnityWebElement checkboxAddressPurpose;

	@FindBy(xpath = "//span[normalize-space(text())='Address Additional Info 1']/preceding-sibling::div/input")
	public UnityWebElement checkboxAddressAdditionalInfo1;

	@FindBy(xpath = "//span[normalize-space(text())='Address 2']/preceding-sibling::div/input")
	public UnityWebElement checkboxAddress2;

	@FindBy(xpath = "(//span[normalize-space(text())='Address']/preceding-sibling::div/input)[1]")
	public UnityWebElement checkboxAddress;

	@FindBy(xpath = "//span[normalize-space(text())='Additional Info 2']/preceding-sibling::div/input")
	public UnityWebElement checkboxAdditionalInfo2;

	@FindBy(xpath = "//span[normalize-space(text())='Additional Info 1']/preceding-sibling::div/input")
	public UnityWebElement checkboxAdditionalInfo1;

	@FindBy(xpath = "//span[normalize-space(text())='Street Number']/preceding-sibling::div/input")
	public UnityWebElement checkboxStreetNumber;

	@FindBy(xpath = "//span[normalize-space(text())='Street Name']/preceding-sibling::div/input")
	public UnityWebElement checkboxStreetName;

	@FindBy(xpath = "//span[normalize-space(text())='State Number']/preceding-sibling::div/input")
	public UnityWebElement checkboxStateNumber;

	@FindBy(xpath = "//span[normalize-space(text())='Postal Code']/preceding-sibling::div/input")
	public UnityWebElement checkboxPostalCode;

	@FindBy(xpath = "//span[normalize-space(text())='City']/preceding-sibling::div/input")
	public UnityWebElement checkboxCity;

	// Add new address popup elements
	@FindBy(xpath = "//h2[normalize-space(text())='Add New Address']")
	public UnityWebElement headerAddNewAddress;

	// Tab owned accounts
	@FindBy(xpath = "//*[normalize-space(text())='Owned Accounts']")
	public UnityWebElement tabOwnedAccounts;

	@FindBy(xpath = "//div[@role='grid']")
	public UnityGridElement gridOwnedAccounts;

	@FindBy(xpath = "//a[normalize-space(text())='Account Details']")
	public UnityWebElement linkAccountDetails;

	@FindBy(xpath = "//span[normalize-space(text())='Amos Zucker Jr.']")
	public UnityWebElement tabClientAmosZucker;

	@FindBy(xpath = "(//mat-icon[contains(@class,'fis-icon-close')])[2]")
	public UnityWebElement tabClose;

	@FindBy(xpath = "//a[normalize-space(text())='Account Balance']")
	public UnityWebElement linkAccountBalance;

	@FindBy(xpath = "//a[normalize-space(text())='Account Holdings']")
	public UnityWebElement linkAccountHoldings;

	@FindBy(xpath = "//a[normalize-space(text())='Account Activity']")
	public UnityWebElement linkAccountActivity;

	@FindBy(xpath = "//a[normalize-space(text())='Account Events']")
	public UnityWebElement linkAccountEvents;

	@FindBy(xpath = "//span[normalize-space(text())='Client']")
	public UnityWebElement labelClientAddressClientKey;

	@FindBy(xpath = "//span[normalize-space(text())='Address Type']")
	public UnityWebElement labelClientAddressTypeKey;

	@FindBy(xpath = "//span[normalize-space(text())='Street Number']")
	public UnityWebElement labelClientStreetNumberKey;

	@FindBy(xpath = "//span[normalize-space(text())='Street Name']")
	public UnityWebElement labelClientStreetNameKey;

	@FindBy(xpath = "//span[normalize-space(text())='Apt']")
	public UnityWebElement labelClientAddressAptKey;

	@FindBy(xpath = "//span[normalize-space(text())='Suite']")
	public UnityWebElement labelClientAddressSuiteKey;

	@FindBy(xpath = "//span[normalize-space(text())='PO Box']")
	public UnityWebElement labelClientAddressPOBoxKey;

	@FindBy(xpath = "//span[normalize-space(text())='Building Unit']")
	public UnityWebElement labelClientAddressBuildingUnitKey;

	@FindBy(xpath = "//span[normalize-space(text())='Building Name']")
	public UnityWebElement labelClientAddressBuildingNameKey;

	@FindBy(xpath = "//span[normalize-space(text())='Rural Route Number']")
	public UnityWebElement labelClientAddressRuralRouteNumberKey;

	@FindBy(xpath = "//span[normalize-space(text())='City']")
	public UnityWebElement labelClientAddressCityKey;

	@FindBy(xpath = "//span[normalize-space(text())='State']")
	public UnityWebElement labelClientAddressStateKey;

	@FindBy(xpath = "//span[normalize-space(text())='Zip/Postal Code']")
	public UnityWebElement labelClientAddressZipPostalCodeKey;

	@FindBy(xpath = "//span[normalize-space(text())='Country']")
	public UnityWebElement labelClientAddressCountryKey;

	@FindBy(xpath = "//span[normalize-space(text())='To search an existing address enter known fields above and select the Lookup button.']")
	public UnityWebElement labelClientAddressSearchExistingKey;

	@FindBy(xpath = "//span[normalize-space(text())='Mailing Info']")
	public UnityWebElement labelClientAddressMailingInfoKey;

	@FindBy(xpath = "//span[normalize-space(text())='Additional Info']")
	public UnityWebElement labelClientAddressAdditionalInfoKey;

	@FindBy(xpath = "//span[normalize-space(text())='Effective Date']")
	public UnityWebElement labelClientAddressEffectiveDateKey;

	@FindBy(xpath = "//a[normalize-space(text())='Add Comments']")
	public UnityWebElement linkClientAddComments;

	@FindBy(xpath = "//a[normalize-space(text())='Add New']")
	public UnityWebElement linkClientAddNewDocumennts;

	@FindBy(xpath = "//iframe[contains(@src,'clientaddress') or contains(@src,'ClientAddress')]")
	public UnityWebElement frameAddClientAddress;

	@FindBy(xpath = "//div[@id='ctlClientAddressMaintenance_ctlDockTxIdent_T']//em")
	public UnityWebElement panelAddressToAdd;

	@FindBy(xpath = "//div[@id='ctlClientAddressMaintenance_ctlDockFinancialDetails_T']//em")
	public UnityWebElement panelNewAddress;

	@FindBy(xpath = "//div[@id='ctlDockDocuments_T']//em")
	public UnityWebElement panelDocuments;

	@FindBy(xpath = "//div[@id='ctlDockComments_T']//em")
	public UnityWebElement panelComments;

	@FindBy(xpath = "//input[@id='ctlSubmitAndRepeat']")
	public UnityWebElement buttonSubmitAndRepeat;

	@FindBy(xpath = "//input[@id='ctlCancel']")
	public UnityWebElement buttonCancel;
	
	@FindBy(xpath = "//input[@id='ctlClearFields']")
	public UnityWebElement buttonContactAddNewFrameCancel;
	
	@FindBy(xpath = "//input[@id='ctlSubmit']")
	public UnityWebElement buttonSubmitClientAddress;

	@FindBy(xpath = "//a[@id='ctlClientAddressMaintenance_ctlDockTxIdent_C_ctlAddressTypeLookup_ctlCodeFile_ctlCodeFile_Arrow']")
	public UnityWebElement textboxAddressType1;

	@FindBy(xpath = "//input[@id='ctlClientAddressMaintenance_ctlDockTxIdent_C_ctlAddressTypeLookup_ctlCodeFile_ctlCodeFile_Input']")
	public UnityWebElement textboxAddressType;

	@FindBy(xpath = "//input[@id='ctlClientAddressMaintenance_ctlDockFinancialDetails_C_ctlNewAddress_ctlNewPayee_ctlNewPayeeStreetNumber']")
	public UnityWebElement textboxStreetNumber;

	@FindBy(xpath = "//input[@id='ctlClientAddressMaintenance_ctlDockFinancialDetails_C_ctlNewAddress_ctlNewPayee_ctlNewPayeeStreetName']")
	public UnityWebElement textboxStreetName;

	@FindBy(xpath = "//input[@id='ctlClientAddressMaintenance_ctlDockFinancialDetails_C_ctlNewAddress_ctlNewPayee_ctlNewPayeeApt']")
	public UnityWebElement textboxApt;

	@FindBy(xpath = "//input[@id='ctlClientAddressMaintenance_ctlDockFinancialDetails_C_ctlNewAddress_ctlNewPayee_ctlNewPayeeSuite']")
	public UnityWebElement textboxSuite;

	@FindBy(xpath = "//input[@id='ctlClientAddressMaintenance_ctlDockFinancialDetails_C_ctlNewAddress_ctlNewPayee_ctlNewPayeePOBox']")
	public UnityWebElement textboxPOBox;

	@FindBy(xpath = "//input[@id='ctlClientAddressMaintenance_ctlDockFinancialDetails_C_ctlNewAddress_ctlNewPayee_ctlNewPayeeCity']")
	public UnityWebElement textboxCity;

	@FindBy(xpath = "//input[@id='ctlClientAddressMaintenance_ctlDockFinancialDetails_C_ctlNewAddress_ctlNewPayee_ctlNewPayeeState_ctlCodeFile_Input']")
	public UnityWebElement textboxState;

	@FindBy(xpath = "//div[contains(@id,'NewAddress_ctlNewPayee_ctlNewPayeeState_ctlCodeFile_DropDown')]")
	public UnityWebElement optionsState;

	@FindBy(xpath = "//a[@id='ctlClientAddressMaintenance_ctlDockFinancialDetails_C_ctlNewAddress_ctlNewPayee_ctlNewPayeeCountry_ctlCodeFile_Arrow']")
	public UnityWebElement textboxCountry1;

	@FindBy(xpath = "//input[@id='ctlClientAddressMaintenance_ctlDockFinancialDetails_C_ctlNewAddress_ctlNewPayee_ctlNewPayeeCountry_ctlCodeFile_Input']")
	public UnityWebElement textboxCountry;

	@FindBy(xpath = "//input[@id='ctlClientAddressMaintenance_ctlDockFinancialDetails_C_ctlNewAddress_ctlNewPayee_ctlEffectiveDatePicker_dateInput']")
	public UnityWebElement textboxEffectiveDate;

	@FindBy(xpath = "//div[@id='ctlClientAddressMaintenance_ctlDockTxIdent_C_ctlAddressTypeLookup_ctlCodeFile_ctlCodeFile_DropDown']")
	public UnityWebElement dropdownAddressType;

	@FindBy(xpath = "//div[@id='ctlClientAddressMaintenance_ctlDockFinancialDetails_C_ctlNewAddress_ctlNewPayee_ctlNewPayeeState_ctlCodeFile_DropDown']")
	public UnityWebElement dropdownState;

	@FindBy(xpath = "//div[@id='ctlClientAddressMaintenance_ctlDockFinancialDetails_C_ctlNewAddress_ctlNewPayee_ctlNewPayeeCountry_ctlCodeFile_DropDown']")
	public UnityWebElement dropdownCountry;

	@FindBy(xpath = "//table[@class='rgMasterTable']")
	public UnityTableElement tableDocuments;

	@FindBy(xpath = "//*[@id='ctlDockComments_C_ctlComments_ctlCommentsControl_ctlEnterComments']")
	public UnityWebElement textareaComments;

	@FindBy(xpath = "//input[@value='Save']")
	public UnityWebElement buttonSaveComment;

	@FindBy(xpath = "//button[@aria-label='close']")
	public UnityWebElement buttonEditClientInformationClose;

	@FindBy(xpath = "//a[@class='ng-star-inserted']")
	public UnityWebElement linkClientName;

	@FindBy(xpath = "//h2[contains(text(),'Client Address')]")
	public UnityWebElement headerClientAddress;

	@FindBy(xpath = "//input[@id='ctlClientAddressMaintenance_ctlDockFinancialDetails_C_ctlNewAddress_ctlNewPayee_ctlNewPayeeZipCode']")
	public UnityWebElement textboxZipCode;

	@FindBy(xpath = "//h2[contains(text(),'Client Contact')]")
	public UnityWebElement headerClientContact;

	@FindBy(xpath = "//iframe[contains(@src,'clientcontact') or contains(@src,'ClientContact')]")
	public UnityWebElement frameAddClientContact;

	@FindBy(xpath = "//input[contains(@id,'ctlContactInformationLookup_ctlCodeFile_ctlCodeFile_Input')]")
	public UnityWebElement textboxContactInfoType;

	@FindBy(xpath = "//div[contains(@id,'ctlContactInformationLookup_ctlCodeFile_ctlCodeFile_DropDown')]")
	public UnityWebElement dropdownContactInfoType;

	@FindBy(xpath = "//input[contains(@id,'ctlClientContactInformationMaintenance_ctlDockTxIdent_C_ctlValueText')]")
	public UnityWebElement textboxContactValue;

	// Tab Relationships
	@FindBy(xpath = "//*[normalize-space(text())='Affiliations']")
	public UnityWebElement tabRelationships;

	@FindBy(xpath = "//div[@id='account-portfolio-relationship']//div[@role='grid']")
	public UnityGridElement gridAccountAndPortfolioRelationship;

	@FindBy(xpath = "//mat-expansion-panel[.//mat-panel-title[normalize-space(text())='Account and Portfolio Affiliations']]//unity-grid-column-filter/button")
	public UnityWebElement linkColumnSettingsAccountAndPortfolioRelationshipGrid;

	@FindBy(xpath = "//*[normalize-space(text())='Account and Portfolio Affiliations']")
	public UnityWebElement panelAccountPortfolioRelationship;

	@FindBy(xpath = "//*[normalize-space(text())='Event Affiliations']")
	public UnityWebElement panelEventRelationship;

	@FindBy(xpath = "//span[normalize-space(text())='Account/Portfolio Number']/preceding-sibling::div/input")
	public UnityWebElement checkboxAccountPortfolioNumber;

	@FindBy(xpath = "//span[normalize-space(text())='Affiliation']/preceding-sibling::div/input")
	public UnityWebElement checkboxAffiliation;

	@FindBy(xpath = "//span[normalize-space(text())='Affiliation Type']/preceding-sibling::div/input")
	public UnityWebElement checkboxRelationShipType;

	@FindBy(xpath = "//span[normalize-space(text())='Affiliation Name']/preceding-sibling::div/input")
	public UnityWebElement checkboxRelationshipName;

	@FindBy(xpath = "//span[normalize-space(text())='Affiliation Record Name']/preceding-sibling::div/input")
	public UnityWebElement checkboxAffiliationRecordName;

	@FindBy(xpath = "//span[normalize-space(text())='Affiliation Record Type']/preceding-sibling::div/input")
	public UnityWebElement checkboxAffiliationRecordType;

	@FindBy(xpath = "//span[normalize-space(text())='✕']")
	public UnityWebElement buttonFilterClose;

	@FindBy(xpath = "//div[@aria-label='Column Settings']//h2")
	public UnityWebElement labelColumnSettings;

	@FindBy(xpath = "//mat-expansion-panel[.//mat-panel-title[normalize-space(text())='Account and Portfolio Affiliations']]//unity-export/button")
	public UnityWebElement linkExportAccountAndPortfolioRelationshipGrid;

	@FindBy(xpath = "//mat-expansion-panel[.//mat-panel-title[normalize-space(text())='Account and Portfolio Affiliations']]//unity-print/button")
	public UnityWebElement linkPrintAccountAndPortfolioRelationshipGrid;

	// Client and Employee relationship
	@FindBy(xpath = "//*[normalize-space(text())='Client and Employee Affiliations']")
	public UnityWebElement panelClientAndEmployeeRelationship;

	@FindBy(xpath = "//mat-expansion-panel[.//mat-panel-title[normalize-space(text())='Client and Employee Affiliations']]//unity-grid-column-filter/button")
	public UnityWebElement linkColumnSettingsClientAndEmployeeRelationshipGrid;

	@FindBy(xpath = "//mat-expansion-panel[.//mat-panel-title[normalize-space(text())='Client and Employee Affiliations']]//unity-export/button")
	public UnityWebElement linkExportClientAndEmployeeRelationshipGrid;

	@FindBy(xpath = "//div[@id='client-employee-relationships']//div[@role='grid']")
	public UnityGridElement gridClientAndEmployeeRelationship;

	//@FindBy(xpath = "(//entity-type-icon//following::span[1])[last()]")
	@FindBy(xpath = "//entity-header//ruf-page-header-title")
	public UnityWebElement textClientFullName;

	// Tab notes items
	@FindBy(xpath = "//*[normalize-space(text())='Notes']")
	public UnityWebElement tabNotes;

	@FindBy(xpath = "//div[@role='grid']")
	public UnityGridElement gridNotes;

	@FindBy(xpath = "//span[normalize-space(text())='Add New']")
	public UnityWebElement buttonAddNewNotes;

	@FindBy(xpath = "//unity-upgrade-column-filter/button")
	public UnityWebElement linkGridColumnFilter;

	@FindBy(xpath = "//span[normalize-space(text())='Contact Type']/preceding-sibling::div/input")
	public UnityWebElement checkboxContactType;

	@FindBy(xpath = "//span[normalize-space(text())='Created By']/preceding-sibling::div/input")
	public UnityWebElement checkboxCreatedBy;

	@FindBy(xpath = "//span[normalize-space(text())='Created Date']/preceding-sibling::div/input")
	public UnityWebElement checkboxCreatedDate;

	@FindBy(xpath = "//span[normalize-space(text())='Private']/preceding-sibling::div/input")
	public UnityWebElement checkboxPrivate;

	@FindBy(xpath = "//mat-select[@formcontrolname='topicId']")
	public UnityWebElement dropdownTopic;

	@FindBy(xpath = "//label[normalize-space(text())='Contact Date*']/parent::Strong/following-sibling::mat-form-field//input")
	public UnityWebElement textboxContactDate;

	@FindBy(xpath = "//mat-select[@formcontrolname='priority']")
	public UnityWebElement dropdownPriority;

	@FindBy(xpath = "//mat-select[@formcontrolname='contactType']")
	public UnityWebElement dropdownContactType;

	@FindBy(xpath = "//span[normalize-space(text())='Private Note']")
	public UnityWebElement checkboxPrivateNote;

	@FindBy(xpath = "//textarea[@formcontrolname='noteText']")
	public UnityWebElement textboxNoteText;

	@FindBy(xpath = "//button[span[normalize-space(text())='Cancel']]")
	public UnityWebElement buttonPopupCancel;

	@FindBy(xpath = "//button[span[normalize-space(text())='Submit']]")
	public UnityWebElement buttonPopupSubmit;

	@FindBy(xpath = "//iframe[contains(@src,'ClientNotes')]")
	public UnityWebElement frameClientNotes;

	@FindBy(xpath = "//b[normalize-space(text())='New Notes']")
	public UnityWebElement labelNewNotes;

	// updated till here
	@FindBy(xpath = "//span[normalize-space(text())='Name']")
	public UnityWebElement labelNameeKey;

	@FindBy(xpath = "//span[normalize-space(text())='Salutation']")
	public UnityWebElement labelSalutationKey;

	@FindBy(xpath = "//span[normalize-space(text())='Title After']")
	public UnityWebElement labelTitleAfterKey;

	@FindBy(xpath = "//span[normalize-space(text())='Entity Description']")
	public UnityWebElement labelEntityDescriptionKey;

	@FindBy(xpath = "//span[normalize-space(text())='Short Name']")
	public UnityWebElement labelShortNameKey;

	@FindBy(xpath = "//span[normalize-space(text())='NAICS Code']")
	public UnityWebElement labelNAICSCodeKey;

	@FindBy(xpath = "//span[normalize-space(text())='TIN Type']")
	public UnityWebElement labelTINTypeKey;

	@FindBy(xpath = "//span[normalize-space(text())='Prepare Taxes']")
	public UnityWebElement labelPrepareTaxesKey;

	@FindBy(xpath = "//span[normalize-space(text())='Tax Preparation Fee']")
	public UnityWebElement labelTaxPreparationFeeKey;

	@FindBy(xpath = "//span[text()='Federal Estimated Basis']")
	public UnityWebElement labelFederalEstimatedBasisKey;

	@FindBy(xpath = "//span[normalize-space(text())='Federal Estimated Tax']")
	public UnityWebElement labelFederalEstimatedTaxKey;

	@FindBy(xpath = "//span[normalize-space(text())='Federal Refund']")
	public UnityWebElement labelFederalRefundKey;

	@FindBy(xpath = "//span[normalize-space(text())='Short Federal Loss']")
	public UnityWebElement labelShortFederalLossKey;

	@FindBy(xpath = "//span[normalize-space(text())='Federal Loss Post 69']")
	public UnityWebElement labelFederalLossPost69Key;

	@FindBy(xpath = "//span[normalize-space(text())='Federal Loss Carryover Pre 70']")
	public UnityWebElement labelFederalLossCarryoverPre70Key;

	@FindBy(xpath = "//span[normalize-space(text())='Adjust Tax Bracket Last Year Percent']")
	public UnityWebElement labelAdjustTaxBracketLastYearPercentKey;

	@FindBy(xpath = "//span[normalize-space(text())='Date from State Loss Carryover']")
	public UnityWebElement labelDatefromStateLossCarryoverKey;

	@FindBy(xpath = "//span[normalize-space(text())='Amount of State Loss Carryover']")
	public UnityWebElement labelAmountofStateLossCarryoverKey;

	@FindBy(xpath = "//span[normalize-space(text())='NAICS Description']")
	public UnityWebElement labelNAICSDescriptionKey;

	@FindBy(xpath = "//span[normalize-space(text())='Employer ID Number']")
	public UnityWebElement labelEmpoyerIdNumberKey;
	
	@FindBy(xpath = "//span[normalize-space(text())='Employer ID Number']//following-sibling::span")
	public UnityWebElement labelEmpoyerIdNumberValue;

	@FindBy(xpath = "//span[normalize-space(text())='County Code']")
	public UnityWebElement labelCountyCodeKey;

	@FindBy(xpath = "//span[normalize-space(text())='Name of Spouse']")
	public UnityWebElement labelNameOfSpouseKey;

	@FindBy(xpath = "//span[normalize-space(text())='Date of Last Master Modification']")
	public UnityWebElement labelDateOfLastMasterModificationKey;

	@FindBy(xpath = "//mat-expansion-panel[.//mat-panel-title[normalize-space(text())='Compliance']]")
	public UnityWebElement panelCompliance;

	@FindBy(xpath = "//span[normalize-space(text())='Entity Type']")
	public UnityWebElement labelEntityTypeKey;

	@FindBy(xpath = "//span[normalize-space(text())='OFAC Suspect']")
	public UnityWebElement labelOFACSuspectKey;

	@FindBy(xpath = "//span[normalize-space(text())='OFAC Date']")
	public UnityWebElement labelOFACDateKey;

	@FindBy(xpath = "//span[normalize-space(text())='Firm Number']")
	public UnityWebElement labelFirmNumberKey;

	@FindBy(xpath = "//span[normalize-space(text())='Firm Type']")
	public UnityWebElement labelFirmTypeKey;

	@FindBy(xpath = "//span[normalize-space(text())='Employee/Director/Officer']")
	public UnityWebElement labelEmployeeDirectorOfficerKey;

	@FindBy(xpath = "//span[normalize-space(text())='Politically Exposed Person']")
	public UnityWebElement labelPoliticallyExposedPersonKey;

	@FindBy(xpath = "//span[normalize-space(text())='Financially Exposed Person']")
	public UnityWebElement labelFinanciallyExposedPersonKey;

	@FindBy(xpath = "//span[normalize-space(text())='Street Address 1']")
	public UnityWebElement labelStreetAddress1Key;

	@FindBy(xpath = "//span[normalize-space(text())='Street Address 2']")
	public UnityWebElement labelStreetAddress2Key;

	@FindBy(xpath = "//span[normalize-space(text())='Street Address 3']")
	public UnityWebElement labelStreetAddress3Key;

	@FindBy(xpath = "//mat-expansion-panel[.//mat-panel-title[normalize-space(text())='Bank']]//span[normalize-space(text())='Entity Type']")
	public UnityWebElement panelBankEntityType;

	@FindBy(xpath = "//span[normalize-space(text())='Date W8 Received']")
	public UnityWebElement labelDateW8ReceivedKey;

	@FindBy(xpath = "//span[normalize-space(text())='Date W9 Received']")
	public UnityWebElement labelDateW9ReceivedKey;

	@FindBy(xpath = "//span[normalize-space(text())='Date 1001 Received']")
	public UnityWebElement labelDate1001ReceivedKey;

	@FindBy(xpath = "//span[normalize-space(text())='State Estimated Basis']")
	public UnityWebElement labelStateEstimatedBasisKey;

	@FindBy(xpath = "//span[normalize-space(text())='State Estimated Tax']")
	public UnityWebElement labelStateEstimatedTaxKey;

	@FindBy(xpath = "//span[normalize-space(text())='State Estimated Refund']")
	public UnityWebElement labelStateEstimatedRefundKey;

	@FindBy(xpath = "//span[normalize-space(text())='NRA Recipient Code']")
	public UnityWebElement labelNRARecipientCodeKey;

	@FindBy(xpath = "//span[normalize-space(text())='Recipient TIN Type 1042']")
	public UnityWebElement labelRecipientTINType1042Key;

	@FindBy(xpath = "//span[normalize-space(text())='Chapter 4 Status 1042']")
	public UnityWebElement labelChapter4Status1042Key;

	@FindBy(xpath = "//span[normalize-space(text())='LOB Code 1042']")
	public UnityWebElement labelLOBCode1042Key;

	@FindBy(xpath = "//span[normalize-space(text())='IRS Name Control']")
	public UnityWebElement labelIRSNameControlKey;

	@FindBy(xpath = "//span[normalize-space(text())='IRS Efile Name 1']")
	public UnityWebElement labelIRSEfileName1Key;

	@FindBy(xpath = "//span[normalize-space(text())='IRS Efile Name 2']")
	public UnityWebElement labelIRSEfileName2Key;

	@FindBy(xpath = "//span[normalize-space(text())='IRS Efile Street']")
	public UnityWebElement labelIRSEfileStreetKey;

	@FindBy(xpath = "//span[normalize-space(text())='IRS Efile City']")
	public UnityWebElement labelIRSEfileCityKey;

	@FindBy(xpath = "//span[normalize-space(text())='IRS Efile State Code']")
	public UnityWebElement labelIRSEfileStateCodeKey;

	@FindBy(xpath = "//span[normalize-space(text())='IRS Efile Zip Code']")
	public UnityWebElement labelIRSEfileZipCodeKey;

	@FindBy(xpath = "//span[normalize-space(text())='Date Backup Withholding Effective']")
	public UnityWebElement labelDateBackupWithholdingEffectiveKey;

	@FindBy(xpath = "//span[normalize-space(text())='Type of Backup Withholding']")
	public UnityWebElement labelTypeofBackupWithholdingKey;

	@FindBy(xpath = "//span[normalize-space(text())='Backup Withholding Required']")
	public UnityWebElement labelBackupWithholdingRequiredKey;

	@FindBy(xpath = "//span[normalize-space(text())='Backup Withholding Percentage']")
	public UnityWebElement labelBackupWithholdingPercentageKey;

	@Override
	public void waitForPageToLoad() {
		startTime = System.currentTimeMillis();
		if (super.isPageLoaded(driver))
			try {
				panelAssetAllocation.waitforVisible(AppConstants.PAGE_LOAD_TIMEOUT);
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
