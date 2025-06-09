package com.unity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.unity.constants.AppConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityGridElement;
import com.unity.customelements.UnityWebElement;

public class FeeReceivablesPage extends BaseTestPage {

	WebDriver driver;

	public FeeReceivablesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}

	@FindBy(css = "div[role='grid']")
	public UnityGridElement gridFeeReceivables;
	
	@FindBy(xpath = "//a[span[normalize-space(text())='Fee Receivables']]")
    public UnityWebElement linkFeesReceivables;

	@FindBy(xpath = "//input[@id='mat-input-3']")
    public UnityWebElement textboxSearch;
	
	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Account Name']]")
	public UnityWebElement checkboxAccountName;
	
	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Administrator']]")
	public UnityWebElement checkboxAdministrator;
	
	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Branch']]")
	public UnityWebElement checkboxBranch;
	
	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Days Aged']]")
	public UnityWebElement checkboxDaysAged;
	
	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='External Reference Number']]")
	public UnityWebElement checkboxExternalReferenceNumber;
	
	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Fee Status']]")
	public UnityWebElement checkboxFeeStatus;
	
	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Portfolio Name']]")
	public UnityWebElement checkboxPortfolioName;
	
	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Portfolio Number']]")
	public UnityWebElement checkboxPortfolioNumber;
	
	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Posted / Invoice Date']]")
	public UnityWebElement checkboxPostedInvoiceDate;
	
	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Book of Business']]//input")
	public UnityWebElement checkboxBookOfBusiness;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Favorites']]//input")
	public UnityWebElement checkboxFavorites;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Recent']]//input")
	public UnityWebElement checkboxRecent;
	
	
	@FindBy(xpath = "//button[@aria-label='Clear']")
	public UnityWebElement buttonClear;

	@Override
	public void waitForPageToLoad() {
		startTime = System.currentTimeMillis();
		if (super.isPageLoaded(driver))
			try {
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