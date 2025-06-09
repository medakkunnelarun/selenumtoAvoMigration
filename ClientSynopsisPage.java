package com.unity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.unity.constants.AppConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityWebElement;

public class ClientSynopsisPage extends BaseTestPage {

	WebDriver driver;

	public ClientSynopsisPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}

	@FindBy(xpath = "//span[normalize-space(text())='Client Identification']")
	public UnityWebElement headerClientIdentification;

	@FindBy(xpath = "//table[@id='contentPlaceHolder_Page_ctlContentPlaceHolderPopup_ctlClientIdentificationGrid_ctlBasicGrid_ctl00']//td[1]")
	public UnityWebElement labelClientName;
	
	@FindBy(xpath = "//td[span[normalize-space(text())='Tax Id']]/following-sibling::td")
	public UnityWebElement labelTaxIDValue;
	
	@FindBy(xpath = "//td[span[normalize-space(text())='SSN']]/following-sibling::td")
	public UnityWebElement labelSSNValue;
	
	@FindBy(xpath = "//td[span[normalize-space(text())='EIN']]/following-sibling::td")
	public UnityWebElement labelEINValue;

	@Override
	public void waitForPageToLoad() {
		startTime = System.currentTimeMillis();
		if (super.waitforAjaxtoComplete(driver))
			try {
				headerClientIdentification.waitforVisible(AppConstants.PAGE_LOAD_TIMEOUT);
				endTime = System.currentTimeMillis();
				pageLoadTime = (endTime - startTime) / 1000;
			} catch (Exception e) {
				Assert.fail("Expected page did not load");
			}
		else {
			Assert.fail("Timed out after " + AppConstants.PAGE_LOAD_TIMEOUT + " seconds");
		}
	}
}
