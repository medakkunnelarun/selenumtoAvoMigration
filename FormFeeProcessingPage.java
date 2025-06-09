package com.unity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.unity.constants.AppConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityWebElement;

public class FormFeeProcessingPage extends BaseTestPage {
	WebDriver driver;

	public FormFeeProcessingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}
	
	@FindBy(xpath = "//input[@name='additionalAmount']")
	public UnityWebElement textBoxadditionalAmount;
	
	@FindBy(xpath = "//input[@name='componentSequenceNumber']")
	public UnityWebElement textBoxcomponentSequenceNumber;
	
	@FindBy(xpath = "//mat-select[@name='saveComponentNetAmountAfterCalculations']")
	public UnityWebElement dropdownsaveComponentNetAmountAfterCalculations;
	
	@FindBy(xpath = "//input[@name='cusip']")
	public UnityWebElement lookupcusip;
	
	@FindBy(xpath = "//mat-select[@name='portfolio']")
	public UnityWebElement dropdownportfolio;
	
	@FindBy(xpath = "//input[@name='amount']")
	public UnityWebElement textBoxamount;
	
	@FindBy(xpath = "//input[@name='reasonCode']")
	public UnityWebElement lookupreasonCode;
	
	@FindBy(xpath = "//input[@name='feeBlockNum']")
	public UnityWebElement textBoxfeeBlockNum;
	
	@FindBy(xpath = "//input[@name='userDescription']")
	public UnityWebElement textBoxUserDescription;
	
	@FindBy(xpath = "//input[@name='commentLine1']")
	public UnityWebElement textBoxcommentLine1;
	
	@FindBy(xpath = "//input[@name='commentLine2']")
	public UnityWebElement textBoxcommentLine2;
	
	@FindBy(xpath = "//input[@name='commentLine3']")
	public UnityWebElement textBoxcommentLine3;
	
	@FindBy(xpath = "//input[@name='commentLine4']")
	public UnityWebElement textBoxcommentLine4;

	
	@FindBy(xpath="//input[@name='feeScheduleNumber']")
	public UnityWebElement lookupFeeScheduleNumber;
	       
	@FindBy (xpath="//input[@name='internalDescriptionLine2']")
	public UnityWebElement txtIntDesLine2;
	
	@FindBy (xpath="//input[@name='internalDescriptionLine1']")
	public UnityWebElement txtIntDesLine1;
	       
	@FindBy (xpath="//input[@name='scheduleCode']")
	public UnityWebElement txtScheduleCode;

	@FindBy(xpath = "//input[@name='percentToChargePrincipal']")
	public UnityWebElement txtPercentToCharge;

	@FindBy(xpath = "//input[@name='feeSchedule']")
	public UnityWebElement lookupFeeSchedule;

	@FindBy(xpath = "//input[@name='amount']")
	public UnityWebElement txtAmount;

	// Abhay
	@FindBy(xpath = "//input[@name='activityCode']")
	public UnityWebElement lookupActivityCode;

	@FindBy(xpath = "//input[@name='allocationPercentIncome']")
	public UnityWebElement textBoxAllocationPercentIncome;

	@FindBy(xpath = "//input[@name='lastChargedAmount']")
	public UnityWebElement textBoxLastChargeAmnt;
	
	@FindBy(xpath = "//input[@name='memoNumber']")
	public UnityWebElement lookUpMemo;

	@FindBy(xpath = "//input[@name='primaryDescriptionLine1']")
	public UnityWebElement textBoxprimaryDesc;


	@Override
	public void waitForPageToLoad() {
		startTime = System.currentTimeMillis();
		if (!super.isPageLoaded(driver))
			Assert.fail("Timed out after " + AppConstants.PAGE_LOAD_TIMEOUT + " seconds\n");
	}

}
