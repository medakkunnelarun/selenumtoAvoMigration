package com.unity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.unity.constants.AppConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityWebElement;

import junit.framework.Assert;

public class FormMastersPage extends BaseTestPage {

	WebDriver driver;
	
    public FormMastersPage(WebDriver driver) {
          this.driver = driver;
          PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
    }
    
    @FindBy(xpath = "//mat-select[@name='invoiceEndingDate@cycleDateMonths']")
    public UnityWebElement selectInvoiceEndingDateCycleDateMonths;
                                 
    @FindBy(xpath = "//mat-select[@name='invoiceEndingDate@cycleDateDays']")
    public UnityWebElement selectInvoiceEndingDateCycleDateDays;
                                 
    @FindBy(xpath = "//mat-select[@name='invoiceEndingDate@cycleDateYears']")
    public UnityWebElement selectInvoiceEndingDateCycleDateYears;
                                 
    @FindBy(xpath = "//input[@name='invoiceEndingDate@cycleDateOccursEvery']")
    public UnityWebElement selectInvoiceEndingDateCycleDateOccursEvery;
                                 
    @FindBy(xpath = "//mat-select[@name='invoiceEndingDate@cycleDateFrequency']")
    public UnityWebElement selectInvoiceEndingDateCycleDateFrequency;
                  
    @FindBy(xpath = "//input[@name='blockNumber']")
    public UnityWebElement lookupblockNumber;
                  
    @FindBy(xpath = "//mat-select[@name='includeCentralAccountFees']")
    public UnityWebElement dropdownIncludeCAFees;
                  
    @FindBy(xpath = "//mat-select[@name='includeAccountProrationDetail']")
    public UnityWebElement dropdownIncludeAccProrationDet;
    
    // Will - User Defined
	@FindBy(xpath = "//input[@name='wL_1']")
	public UnityWebElement textBoxWillField1;
	
	@FindBy(xpath = "//mat-select[@name='wL_2']/div/div[2]/div")
	public UnityWebElement dropdownWillField2;
	
	@FindBy(xpath = "//input[@name='wL_3-1']")
	public UnityWebElement textBoxWillField31;
	
	@FindBy(xpath = "//input[@name='wL_3-2']")
	public UnityWebElement textBoxWillField32;
	
	@FindBy(xpath = "//input[@name='wL_3-3']")
	public UnityWebElement textBoxWillField33;
	
	@FindBy(xpath = "//input[@name='wL_3-4']")
	public UnityWebElement textBoxWillField34;
	
	@FindBy(xpath = "//input[@name='wL_3-5']")
	public UnityWebElement textBoxWillField35;
	
	@FindBy(xpath = "//input[@name='wL_4']")
	public UnityWebElement textBoxWillField4;
	
	@FindBy(xpath="//input[@name='wL_5']")
	public UnityWebElement lookupWillField5;
	
	@FindBy(xpath="//input[@name='wL_6']")
	public UnityWebElement lookupWillField6;
    
    @FindBy(xpath = "//mat-select[@name='instrType']")
    public UnityWebElement dropdownInstrType;
    
    @FindBy(xpath = "//input[@name='receiptNum']")
    public UnityWebElement textBoxReceiptNum;
    
    @FindBy(xpath = "//mat-select[@name='origOnFile']")
    public UnityWebElement dropdownOrigOnFile;
    
    @FindBy(xpath = "//input[@name='instrDate']")
    public UnityWebElement dateInstrDate;
    
    @FindBy(xpath = "//input[@name='codicilDates1']")
    public UnityWebElement dateCodicilDates1;
    
    @FindBy(xpath = "//input[@name='codicilDates2']")
    public UnityWebElement dateCodicilDates2;
    
    @FindBy(xpath = "//input[@name='codicilDates3']")
    public UnityWebElement dateCodicilDates3;
    
    @FindBy(xpath = "//input[@name='codicilDates4']")
    public UnityWebElement dateCodicilDates4;
    
    @FindBy(xpath = "//input[@name='codicilDates5']")
    public UnityWebElement dateCodicilDates5;
  

    @FindBy(xpath = "//input[@name='fullName1']")
    public UnityWebElement textboxFullName1;
  
    @FindBy(xpath = "//input[@name='fullName2']")
    public UnityWebElement textboxFullName2;
    
    @FindBy(xpath = "//input[@name='fullName3']")
    public UnityWebElement textboxFullName3;
    
    @FindBy(xpath = "//input[@name='fullName4']")
    public UnityWebElement textboxFullName4;
    
    @FindBy(xpath = "//input[@name='fullName5']")
    public UnityWebElement textboxFullName5;
    
    @FindBy(xpath = "//input[@name='reviewDate']")
    public UnityWebElement dateReviewDate;
    
    @FindBy(xpath = "//input[@name='lastReview']")
    public UnityWebElement dateLastReview;
    
    @FindBy(xpath = "//mat-select[@name='objectiveLetter']")
    public UnityWebElement dropdownObjectiveLetter;
    
    @FindBy(xpath = "//mat-select[@name='locationOfInstrument']")
    public UnityWebElement dropdownLocationOfInstrument;
    
    @FindBy(xpath = "//input[@name='creationDate']")
    public UnityWebElement dateCreationDate;
    
    @FindBy(xpath = "//input[@name='updated']")
    public UnityWebElement dateUpdated;
    
    @FindBy(xpath = "//input[@name='dateClosed']")
    public UnityWebElement dateDateClosed;
    
    @FindBy(xpath = "//mat-select[@name='reason']")
    public UnityWebElement dropdownReason;
    
    @FindBy(xpath = "//input[@name='microfilm1']")
    public UnityWebElement textboxMicrofilm1;
    
    @FindBy(xpath = "//input[@name='microfilm2']")
    public UnityWebElement textboxMicrofilm2;
    
    @FindBy(xpath = "//input[@name='microfilm3']")
    public UnityWebElement textboxMicrofilm3;
    
    @FindBy(xpath = "//input[@name='microfilm4']")
    public UnityWebElement textboxMicrofilm4;
    
    @FindBy(xpath = "//input[@name='microfilm5']")
    public UnityWebElement textboxMicrofilm5;
  
    @FindBy(xpath = "//input[@name='otherInfo1']")
    public UnityWebElement textboxOtherInfo1;
  
    @FindBy(xpath = "//input[@name='otherInfo2']")
    public UnityWebElement textboxOtherInfo2;
    
    @FindBy(xpath = "//input[@name='otherInfo3']")
    public UnityWebElement textboxOtherInfo3;
    
    @FindBy(xpath = "//input[@name='otherInfo4']")
    public UnityWebElement textboxOtherInfo4;
    
    @FindBy(xpath = "//input[@name='otherInfo5']")
    public UnityWebElement textboxOtherInfo5;

    @FindBy(xpath = "//input[@name='masterAccount']")
    public UnityWebElement lookupMasterAccount;
    
    @FindBy(xpath = "//mat-select[@name='firstRateMasterParticipant']")
    public UnityWebElement dropdownFirstRateMasterParticipant;


    @FindBy(xpath = "//input[@name='will']")
    public UnityWebElement lookupWill;
    
    @FindBy(xpath="//input[@name='attorney1']")
    public UnityWebElement textboxAttorney1;
                  
    @FindBy(xpath="//input[@name='banker5']")
    public UnityWebElement textboxBanker5;
                  
    @FindBy(xpath="//input[@name='investmentAdvisor1']")
    public UnityWebElement textboxInvestmentAdvisor1;
    
    @FindBy(xpath="//input[@name='masterAccount']")
    public UnityWebElement lookupMasterAcccount;

    @FindBy(xpath="//input[@name='excludeFromNotices']")
    public UnityWebElement lookupExcludeFromNotices;
          
    @FindBy(xpath="//input[@name='excludeFromEmailNotices']")
    public UnityWebElement lookupExcludeFromEmailNotices;

    
    @FindBy(xpath="//mat-select[@name='orionParticipation']")
    public UnityWebElement dropdownOrionParticipation;
    
    @FindBy(xpath = "//input[@name='safeDepInfo2']")
    public UnityWebElement textBoxSafeDepInfo2;
    
    @FindBy(xpath = "//input[@name='fullName1']")
    public UnityWebElement textBoxFullName1;
    
    @FindBy(xpath = "//input[@name='home1']")
    public UnityWebElement textBoxHome1;

    @FindBy(xpath = "//input[@name='contribByTrust1']")
    public UnityWebElement textBoxContribByTrust1;

                  
    @FindBy(xpath = "//input[@name='execNameAddress1']")
    public UnityWebElement textBoxExecNameAddress1;
    
	@FindBy(xpath = "//input[@name='nameLine2']")
	public UnityWebElement textBoxnameLine2;

	@FindBy(xpath = "//input[@name='nameLine2']")
	public UnityWebElement textBoxnameLine3;

	@FindBy(xpath = "//mat-select[@name='paymentType']/div/div[2]/div")
	public UnityWebElement dropdownPaymentType;

	@FindBy(xpath = "//mat-select[@name='paymentStatus']/div/div[2]/div")
	public UnityWebElement dropdownPaymentStatus;

	@FindBy(xpath = "//input[@name='paymentMethod']")
	public UnityWebElement lookupPaymentMethod;

	@FindBy(xpath = "//mat-select[@name='taxFormIndicatorDropDown']/div/div[2]/div")
	public UnityWebElement dropdownTaxFormIndicator;

	@FindBy(xpath = "//input[@name='grossPaymentAmount']")
	public UnityWebElement textBoxgrossPaymentAmount;

	@FindBy(xpath = "//input[@name='deductionAmount1']")
	public UnityWebElement textBoxDeductionAmount1;

	@FindBy(xpath = "//input[@name='deductionAmount2']")
	public UnityWebElement textBoxDeductionAmount2;
	
	@FindBy(xpath = "//button[.//span[normalize-space(text())='Auto-Numbering']]")
    public UnityWebElement buttonAutoNumbering;

    @FindBy(xpath = "//input[@name='shortName']")
    public UnityWebElement textBoxShortName;
    
    @FindBy(xpath = "//input[@name='longName1']")
    public UnityWebElement textBoxLongName1;
    
    @FindBy(xpath = "//input[@name='institutionCode']")
    public UnityWebElement lookUpInstitutionCode;


	@Override
	public void waitForPageToLoad() {
		startTime = System.currentTimeMillis();
		if (!super.isPageLoaded(driver))
			Assert.fail("Timed out after " + AppConstants.PAGE_LOAD_TIMEOUT + " seconds\n");
	}
}
