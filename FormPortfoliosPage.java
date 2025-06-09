package com.unity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.unity.constants.AppConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityWebElement;

import junit.framework.Assert;

public class FormPortfoliosPage extends BaseTestPage {

	WebDriver driver;

	public FormPortfoliosPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}

	// **nick**
	@FindBy(xpath = "//input[@name='portfolioNumber']")
	public UnityWebElement lookupPortfolio;

	@FindBy(xpath = "//mat-option[div[normalize-space(text())='12345-00/9.1']]")
	public UnityWebElement toClickPortfolio;

	@FindBy(xpath = "//input[@name='locationAbbrev']")
	public UnityWebElement textBoxLocation;

	@FindBy(xpath = "//input[@name='usiAccountAbbrev']")
	public UnityWebElement textBoxAccount;

	@FindBy(xpath = "//input[@name='usiAccountAbbrev']")
	public UnityWebElement textBoxUnitAccount;

	@FindBy(xpath = "//input[@name='usiAliasAbbrev']")
	public UnityWebElement textBoxUnitAlias;

	@FindBy(xpath = "//input[@name='usiNameAbbrev']")
	public UnityWebElement textBoxUnitName;

	@FindBy(xpath = "//input[@name='csiAccountAbbrev']")
	public UnityWebElement textBoxCashAccount;

	@FindBy(xpath = "//input[@name='csiAliasAbbrev']")
	public UnityWebElement textBoxCashAlias;

	@FindBy(xpath = "//input[@name='csiNameAbbrev']")
	public UnityWebElement textBoxCashName;

	// **niranjan**
	@FindBy(xpath = "//input[@name='affiliationTypeAbbrev']")
	public UnityWebElement lookupAffiliation;

	@FindBy(xpath = "//input[@name='existingClientCheck']")
	public UnityWebElement checkBoxExistClient;

	@FindBy(xpath = "//input[@name='clientGref']")
	public UnityWebElement lookupClient;

	// **Monika**
	@FindBy(xpath = "//input[@name='employeeAbbrev']")
	public UnityWebElement lookupEmployee;

	@FindBy(xpath = "//input[@name='employeeDesc']")
	public UnityWebElement textEmployee;
	
	// **rohini**
	@FindBy(xpath = "//input[@name='portfolioModelNumber']")
	public UnityWebElement lookupPortfolioModelNumber;

	@FindBy(xpath = "//input[@name='name']")
	public UnityWebElement txtBoxName;

	@FindBy(xpath = "//input[@name='portfolioTypeAbbrev']")
	public UnityWebElement lookupPortfolioType;

	@FindBy(xpath = "//input[@name='alternatePortfolioNumber']")
	public UnityWebElement txtBoxAlternatePortfolioNumber;

	@Override
	public void waitForPageToLoad() {
		startTime = System.currentTimeMillis();
		if (!super.isPageLoaded(driver))
			Assert.fail("Timed out after " + AppConstants.PAGE_LOAD_TIMEOUT + " seconds\n");
	}
}
