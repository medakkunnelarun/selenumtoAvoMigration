package com.unity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.unity.constants.AppConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityWebElement;

import junit.framework.Assert;

public class FormClientsPage extends BaseTestPage {

	WebDriver driver;

	public FormClientsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}
	
	@FindBy(xpath = "//input[@name='typeOfRecordSeasonal']")
    public UnityWebElement lookupTypeofRecordSeasonal;
	
	@FindBy(xpath ="//input[@name='bankNumberNoContext']")
	public UnityWebElement lookupBanks;

	@FindBy(xpath="//input[@name='interestedParty']")
	public UnityWebElement interestedParty ;
	      
	@FindBy(xpath="//mat-select[@name='excludePartyIndicator']")
	public UnityWebElement excludePartyIndicator ;
	      
	@FindBy(xpath="//input[@name='primeCustomerId']")
	public UnityWebElement primecustID;
	      
	@FindBy(xpath="//mat-select[@name='riskClass']")
	public UnityWebElement riskClass ;
	
	@FindBy(xpath = "//input[@name='taxIDType']")
	public UnityWebElement lookupTaxIDType;
	
	@FindBy(xpath = "//input[@name='taxID']")
	public UnityWebElement textboxTaxID;
	
	@FindBy(xpath = "//input[@name='taxFilingStateCode']")
	public UnityWebElement lookupTaxFilingStateCode;
	
	@FindBy(xpath = "//input[@name='taxLocality']")
	public UnityWebElement textboxTaxLocality;
	
	@FindBy(xpath = "//input[@name='client']")
	public UnityWebElement lookupClient;
	
	
	@FindBy(xpath = "//input[@name='foreignResidentCitizen']")
	public UnityWebElement checkboxForeignResidentCitizen;
	
	@FindBy(xpath = "//input[@name='doNotPurgeIndicator']")
	public UnityWebElement checkboxDoNotPurgeIndicator;
	
	@FindBy(xpath = "//input[@name='gender']")
	public UnityWebElement lookupGender;
	
	@FindBy(xpath = "//input[@name='dateofBirth']")
	public UnityWebElement textboxDateofBirth;
	
	@FindBy(xpath = "//input[@name='dateofDeath']")
	public UnityWebElement textboxDateofDeath;
	
	@FindBy(xpath = "//input[@name='w9Date']")
	public UnityWebElement textboxW9Date;
	
	@FindBy(xpath = "//input[@name='participantNumber']")
	public UnityWebElement textboxParticipantNumber;
	
	@FindBy(xpath = "//span[text()='Generate Participant']")
	public UnityWebElement buttonGenerateParticipant;



	// **rohini**
	@FindBy(xpath = "//input[@name='contactTypeAbbrev']")
	public UnityWebElement lookupContactType;

	@FindBy(xpath = "//input[@name='value']")
	public UnityWebElement textBoxValue;
	
	@FindBy(xpath = "//input[@name='accountNumber']")
    public UnityWebElement lookupAccount;
	
	@FindBy(xpath = "//input[contains(@name,'affiliationTypeAbbrev')]")
	public UnityWebElement lookupAffiliationType;

	@FindBy(xpath = "//input[@name='clientGref']")
	public UnityWebElement lookupSrcClient;

	// **aprajita**
	// Client ADD Page Mandatory fields
	@FindBy(xpath = "//input[contains(@name,'typeOfClientAbbrev')]")
	public UnityWebElement lookupTypeOfClientKey;
	
	@FindBy(xpath = "//input[@name='typeOfNameMeaning']")
	public UnityWebElement lookupTypeOfClient;
	
	@FindBy(xpath = "//input[@name='creditRatingAbbrev']")
	public UnityWebElement lookupCreditRating;

	@FindBy(xpath = "//input[contains(@name,'fullName')]")
	public UnityWebElement textBoxFullName;

	@FindBy(xpath = "//input[contains(@name,'city')]")
	public UnityWebElement textBoxCity;

	@FindBy(xpath = "//input[contains(@name,'stateAbbrev')]")
	public UnityWebElement lookupState;

	@FindBy(xpath = "//input[contains(@name,'postalCode')]")
	public UnityWebElement textBoxPostalCode;

	@FindBy(xpath = "//input[contains(@name,'countryAbbrev')]")
	public UnityWebElement lookupCountry;

	@FindBy(xpath = "//input[contains(@name,'bankAbbrev')]")
	public UnityWebElement lookupBank;

	@FindBy(xpath = "//input[contains(@name,'taxStateAbbrev')]")
	public UnityWebElement lookupTaxStateOrProvince;

	@FindBy(xpath = "//input[contains(@name,'taxCountryAbbrev')]")
	public UnityWebElement lookupTaxCountry;

	@FindBy(xpath = "//input[contains(@name,'contactBranchCode')]")
	public UnityWebElement lookupContactBranchCode;

	@FindBy(xpath = "//input[contains(@name,'statementsDeliveryMethodAbbrev')]")
	public UnityWebElement lookupStatementDeliveryMethod;

	// **pooja**
	@FindBy(xpath = "//input[@name='contactInfo']")
	public UnityWebElement textBoxContactInfo;
	
	@FindBy(xpath = "//input[@name='participant']")
    public UnityWebElement lookupParticipants;

	// **niranjan**
	@FindBy(xpath = "//input[@name='streetNumber']")
	public UnityWebElement textBoxStreetNumber;

	@FindBy(xpath = "//input[@name='streetName']")
	public UnityWebElement textBoxStreetName;

	@FindBy(xpath = "//input[@name='addressPurposeMeaning']")
	public UnityWebElement textBoxAddressType;

	@FindBy(xpath = "//input[@name='postalCode']")
	public UnityWebElement textBoxZipCode;

	// Name Address Add
	@FindBy(xpath = "//input[@name='typeOfRecord']")
	public UnityWebElement lookupTypeOfRecord;

	@FindBy(xpath = "//input[@name='cisNumber']")
	public UnityWebElement textBoxCisNumber;

	@FindBy(xpath = "//input[@name='firstName']")
	public UnityWebElement textBoxFirstName;

	@FindBy(xpath = "//input[@name='lastName']")
	public UnityWebElement textBoxLastName;

	@FindBy(xpath = "//input[@name='nameLine2']")
	public UnityWebElement textBoxNameLine2;

	@FindBy(xpath = "//input[@name='addressLine1']")
	public UnityWebElement textBoxAddressLine1;

	@FindBy(xpath = "//input[@name='addressLine2']")
	public UnityWebElement textBoxAddressLine2;

	@FindBy(xpath = "//input[@name='state']")
	public UnityWebElement lookupStateAddress;// check for the lookupstate

	@FindBy(xpath = "//input[@name='zipCodeFirst5']")
	public UnityWebElement textBoxZipCode5;

	@FindBy(xpath = "//input[@name='zipCodeLast4']")
	public UnityWebElement textBoxZipCode4;

	@FindBy(xpath = "//button[@name='generateNameKey']")
	public UnityWebElement buttonGenerateNameKey;

	@FindBy(xpath = "//input[@name='nameAddressKey']")
	public UnityWebElement textBoxNameAddressKey;

	@FindBy(xpath = "//input[@name='firmNumber']")
	public UnityWebElement textBoxFirmNumber;

	@FindBy(xpath = "//input[@name='firmType']")
	public UnityWebElement lookupFirmType;

	@FindBy(xpath = "//input[@name='birthDate']")
	public UnityWebElement textBoxBirthDate;

	@FindBy(xpath = "//input[@name='home']")
	public UnityWebElement textBoxHomeNumber;

	@FindBy(xpath = "//input[@name='eMailAddress1']")
	public UnityWebElement textBoxEmailAddress1;

	@FindBy(xpath = "//input[@name='socialMedia1']")
	public UnityWebElement textBoxSocialMedia1;

	@FindBy(xpath = "//input[@name='socialMedia1Description']")
	public UnityWebElement lookupSocialMedia1Desc;

	@FindBy(xpath = "//legend[normalize-space(text())='Personal Information']/following::span[1]")
	public UnityWebElement panelAccordianPersonalInfo;

	@FindBy(xpath = "//legend[normalize-space(text())='User Defined Information']/following::span[1]")
	public UnityWebElement panelUserDefinedInfo;

	@FindBy(xpath = "//legend[normalize-space(text())='Seasonal Address Info']/following::span[1]")
	public UnityWebElement panelSeasonalAddressInfo;

	@FindBy(xpath = "//input[@name='bankNumberNoContext']")
	public UnityWebElement lookupBankNumber;
	
	@FindBy(xpath = "//button[@name='autoNumberingButton']")
	public UnityWebElement buttonautonumbering;

	@Override
	public void waitForPageToLoad() {
		startTime = System.currentTimeMillis();
		if (!super.isPageLoaded(driver))
			Assert.fail("Timed out after " + AppConstants.PAGE_LOAD_TIMEOUT + " seconds\n");
	}
}
