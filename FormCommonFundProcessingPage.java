package com.unity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.unity.constants.AppConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityWebElement;

public class FormCommonFundProcessingPage extends BaseTestPage {
	WebDriver driver;

	public FormCommonFundProcessingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}
	
	@FindBy(xpath = "//mat-select[@name='portfolio']")
	public UnityWebElement dropdownportfolio;	
	
	@FindBy(xpath="//input[@name='commonFundAccount']")
	public UnityWebElement lookupcommonFundAccount;
	
	@FindBy(xpath = "//input[@name='registration']")
	public UnityWebElement lookupRegistration;
	
	@FindBy(xpath = "//mat-select[@name='redeemOrPurchase']")
	public UnityWebElement dropdownRedeemOrPurchase;	
	
	@FindBy(xpath = "//mat-select[@name='basis']")
	public UnityWebElement dropdownBasis;	
	
	@FindBy (xpath="//input[@name='amount']")
	public UnityWebElement textBoxAmount;
	
	@FindBy (xpath="//input[@name='digitsOfAccuracy']")
	public UnityWebElement txtBoxDigitsOfAccuracy;
	       
	@FindBy(xpath = "//input[@name='commentLine1']")
	public UnityWebElement textBoxcommentLine1;
	
	@FindBy(xpath = "//input[@name='commentLine2']")
	public UnityWebElement textBoxcommentLine2;
	
	@FindBy(xpath = "//input[@name='commentLine3']")
	public UnityWebElement textBoxcommentLine3;
	
	@FindBy(xpath = "//input[@name='commentLine4']")
	public UnityWebElement textBoxcommentLine4;
	
	


	@Override
	public void waitForPageToLoad() {
		startTime = System.currentTimeMillis();
		if (!super.isPageLoaded(driver))
			Assert.fail("Timed out after " + AppConstants.PAGE_LOAD_TIMEOUT + " seconds\n");
	}

}
