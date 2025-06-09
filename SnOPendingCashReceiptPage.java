package com.unity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.unity.constants.AppConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityGridElement;
import com.unity.customelements.UnityWebElement;

public class SnOPendingCashReceiptPage extends BaseTestPage {
	WebDriver driver;

	public SnOPendingCashReceiptPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}
	
	@FindBy(xpath = "//div[@role='rowgroup' and @class='ag-header-container']")
	public UnityGridElement gridPendingCashReceiptHeaders;
	
	@FindBy(css = "div[role='grid']")
	public UnityGridElement gridPendingCashReceipt;
	

	@FindBy(xpath = "(//div[contains(@class,'ag-column-drop-list')])[1]")
		public UnityWebElement groupByBar;
		
	@FindBy(xpath = "//span[contains(text(),'Account Name')]")
		public UnityWebElement columnAccountName;
		
	@FindBy(xpath = "//span[contains(text(),'Income Cash')]")
		public UnityWebElement columnIncomeCash;
	
	@FindBy(xpath = "//span[contains(text(),'Principal Cash')]")
		public UnityWebElement columnPrincipalCash;
	
	@FindBy(xpath = "//span[contains(text(),'Receipt Date')]")
		public UnityWebElement columnReceiptDate;
		
	@FindBy(xpath = "//span[contains(text(),'Type Of Receipt')]")
		public UnityWebElement columnTypeOfReceipt;
		
	@FindBy(xpath = "//span[contains(text(),'Block Number')]")
		public UnityWebElement columnBlockNumber;
		
	@FindBy(xpath = "//span[text()='Group']")
		public UnityWebElement columnHeaderGroup;

	
//	@FindBy(xpath = "//span[contains(text(),'Favorites')]//preceding-sibling::div/input")
//	public UnityWebElement checkboxFavorites;
	
	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Administrator Name']]")
    public UnityWebElement checkboxAdministratorName;
    
    @FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Carrying Value']]")
    public UnityWebElement checkboxCarryingValue;
    
    @FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Description Line 1']]")
    public UnityWebElement checkboxDescriptionLine1;
    
    @FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Paydown Units']]")
    public UnityWebElement checkboxPaydownUnits;

//    @FindBy(xpath = "//span[@class='mat-option-text' and contains(text(),'20') ]")
//    public UnityWebElement dropdownCalendarDaysoption20;
//    
//    @FindBy(xpath = "//span[@class='mat-option-text' and contains(text(),'25') ]")
//    public UnityWebElement dropdownCalendarDaysoption25;


    @FindBy(xpath = "//span[contains(text(),'5')]")
    public UnityWebElement dropdownCalendarDaysoption5;
    
    @FindBy(xpath = "//span[contains(text(),'10')]")
    public UnityWebElement dropdownCalendarDaysoption10;
    
    @FindBy(xpath = "//span[contains(text(),'20')]")
    public UnityWebElement dropdownCalendarDaysoption20;
    
    @FindBy(xpath = "//span[contains(text(),'30')]")
    public UnityWebElement dropdownCalendarDaysoption30;
    
    @FindBy(xpath = "//span[contains(text(),'60')]")
    public UnityWebElement dropdownCalendarDaysoption60;
    
    @FindBy(xpath = "//span[contains(text(),'90')]")
    public UnityWebElement dropdownCalendarDaysoption90; 

	
	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Book of Business']]//input")
	public UnityWebElement checkboxBookOfBusiness;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Favorites']]//input")
	public UnityWebElement checkboxFavorites;

	@FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Recent']]//input")
	public UnityWebElement checkboxRecent;
	
	@FindBy(xpath = "//button//*[normalize-space(text())='Clear']")
	public UnityWebElement buttonClear;
	
	//@FindBy(xpath = "//strong[contains(text(),'Calendar Days:')]//parent::label//following-sibling::mat-form-field")
	@FindBy(xpath = "//mat-select//span//span")
	public UnityWebElement dropdownCalendarDays;

	@FindBy(xpath = "//div[contains(@id,'mat-select-1-panel')]")
	public UnityWebElement panelCalendarDays;
	
	@FindBy(xpath = "//div[contains(@id,'mat-select-1-panel')]//mat-option//span[text(),' 25 '")
	public UnityWebElement dropdownCalendarDaysoption25;
	
	@FindBy(xpath = "//span[contains(text(),'Account Number')]")
	public UnityWebElement columnAccountNumber;
	
	@FindBy(xpath = "//div[span[text()='Account Number']]/preceding-sibling::span/*")
	public UnityWebElement menuAccountNumber;
	
	@FindBy(xpath = "//div[@class='ag-theme-balham ag-popup']//div[@ref='eHeader']//span[@class='ag-icon ag-icon-filter']")
	public UnityWebElement menuFilter;
	
	@FindBy(xpath = "//div[@class='ag-filter']")
	public UnityWebElement panelmenuFilter;
	
	@Override
	public void waitForPageToLoad() {
		startTime = System.currentTimeMillis();
		if (super.isPageLoaded(driver))
			try {
				checkboxFavorites.waitforVisible(AppConstants.PAGE_LOAD_TIMEOUT);
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
