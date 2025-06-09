package com.unity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.unity.constants.AppConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityWebElement;

public class AccountSynopsisPage extends BaseTestPage {

	WebDriver driver;

	public AccountSynopsisPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}

	@FindBy(xpath = "//span[normalize-space(text())='Account Identification']")
	public UnityWebElement headerAccountIdentification;

	@FindBy(xpath = "//tr[@id='ctl00_ctl00_contentPlaceHolder_Page_ctlContentPlaceHolderPopup_ctlAccountIdentification_ctlBasicGrid_ctl00__0']//td[2]")
	public UnityWebElement labelAccountNumber;

	@FindBy(xpath = "//tr[@id='ctl00_ctl00_contentPlaceHolder_Page_ctlContentPlaceHolderPopup_ctlAccountIdentification_ctlBasicGrid_ctl00__0']//td[3]")
	public UnityWebElement labelAccountName;
	
	@FindBy(xpath = "//tr[@id='ctl00_ctl00_contentPlaceHolder_Page_ctlContentPlaceHolderPopup_ctlClientIdentificationGrid_ctlBasicGrid_ctl00__0']//td[1]")
	public UnityWebElement labelClientName;

	@FindBy(xpath = "//td[span[normalize-space(text())='Tax Id']]/following-sibling::td")
	public UnityWebElement labelTaxIDValue;
	
	@FindBy(xpath = "//iframe[@id='synopsis-frame']")
	public UnityWebElement framesynopsis;

	@Override
	public void waitForPageToLoad() {
		startTime = System.currentTimeMillis();
		if (super.waitforAjaxtoComplete(driver))
			try {
				headerAccountIdentification.waitforVisible(AppConstants.PAGE_LOAD_TIMEOUT);
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