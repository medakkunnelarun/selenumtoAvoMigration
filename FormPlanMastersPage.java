package com.unity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.unity.constants.AppConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityWebElement;

import junit.framework.Assert;

public class FormPlanMastersPage extends BaseTestPage {

	WebDriver driver;
	
    public FormPlanMastersPage(WebDriver driver) {
          this.driver = driver;
          PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
    }
    
    @FindBy(xpath = "//input[@name='blockNumber']")
    public UnityWebElement lookUpBlockNumber;
    
    @FindBy(xpath = "//input[@name='deductionCode']")
    public UnityWebElement lookUpDeductionCode;
    
    @FindBy(xpath = "//input[@name='controlAcctNum']")
    public UnityWebElement lookUpControlAcctNum;
    
    @FindBy(xpath = "//input[@name='planNumber']")
    public UnityWebElement lookUpPlanNumber;
    
    @FindBy(xpath = "//input[@name='rtpUnderOmniTaxNum']")
    public UnityWebElement lookUpRtpUnderOmniTaxNum;
    
    @FindBy(xpath = "//input[@name='patriotActId']")
    public UnityWebElement textboxPatriotActIds;


    
	@Override
	public void waitForPageToLoad() {
		startTime = System.currentTimeMillis();
		if (!super.isPageLoaded(driver))
			Assert.fail("Timed out after " + AppConstants.PAGE_LOAD_TIMEOUT + " seconds\n");
	}

}
