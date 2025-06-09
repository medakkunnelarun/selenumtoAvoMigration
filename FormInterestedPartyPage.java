package com.unity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.unity.constants.AppConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityWebElement;

import junit.framework.Assert;

public class FormInterestedPartyPage extends BaseTestPage {

	WebDriver driver;
	
    public FormInterestedPartyPage(WebDriver driver) {
          this.driver = driver;
          PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
    }
    
    @FindBy(xpath = "//input[@name='blockNumber']")
	public UnityWebElement lookupBlockNumber;
	
	@FindBy(xpath = "//input[@name='interestedParty']")
	public UnityWebElement lookupInterestedParty;
		
	@FindBy(xpath = "//mat-select[@name='ticklerDate@cycleDateMonths']")
	public UnityWebElement lookupDateMonths;
	
	@FindBy(xpath = "//mat-select[@name='ticklerDate@cycleDateDays']")
	public UnityWebElement lookupDateDays;
	
	@FindBy(xpath = "//mat-select[@name='ticklerDate@cycleDateYears']")
	public UnityWebElement lookupDateYears;
	
	@FindBy(xpath = "//mat-select[@name='dateOfReceipt@cycleDateMinusDays']")
	public UnityWebElement lookupDateMinusDays;
	
	@FindBy(xpath = "//input[@name='ticklerDate@cycleDateOccursEvery']")
	public UnityWebElement lookupDateOccursEvery;
	
	@FindBy(xpath = "//mat-select[@name='ticklerDate@cycleDateFrequency']")
	public UnityWebElement lookupDateFrequency;
	
	@FindBy(xpath = "//input[@name='adminOfficerCode']")
	public UnityWebElement lookupAdminOfficerCode;
	
	@FindBy(xpath = "//input[@name='ticklerDescription1']")
	public UnityWebElement textboxTicklerDescription1;
	
	@FindBy(xpath = "//input[@name='ticklerDescription2']")
	public UnityWebElement textboxTicklerDescription2;
	
	@FindBy(xpath = "//input[@name='ticklerDescription3']")
	public UnityWebElement textboxTicklerDescription3;
	
	@FindBy(xpath = "//input[@name='ticklerDescription4']")
	public UnityWebElement textboxTicklerDescription4;
	
	@FindBy(xpath = "//input[@name='ticklerDescription5']")
	public UnityWebElement textboxTicklerDescription5;
	
	@FindBy(xpath = "//input[@name='expirationDate']")
	public UnityWebElement textboxExpirationDate;
	
	@FindBy(xpath = "//input[@role='switch']")
	public UnityWebElement checkboxClearCycleDate;

    
	@Override
	public void waitForPageToLoad() {
		startTime = System.currentTimeMillis();
		if (!super.isPageLoaded(driver))
			Assert.fail("Timed out after " + AppConstants.PAGE_LOAD_TIMEOUT + " seconds\n");
	}

}
