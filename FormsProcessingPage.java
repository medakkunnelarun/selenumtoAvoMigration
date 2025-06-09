package com.unity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.unity.constants.AppConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityGridElement;
import com.unity.customelements.UnityWebElement;

public class FormsProcessingPage extends BaseTestPage {

	WebDriver driver;

	public FormsProcessingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}
	
	@FindBy(xpath = "//label[contains(text(),'Favorites')]")
	public UnityWebElement checkboxFavourite;

	@FindBy(xpath = "//ag-grid-angular[@id='dynamic-forms']")
	public UnityGridElement gridCurrentForms;

	@FindBy(xpath = "//*[@id='form-grid']//div[@role='presentation']")
	public UnityGridElement gridRecentForms;

//	@FindBy(xpath = "//mat-checkbox[@aria-label='Favorites']//input")
//	public UnityWebElement checkboxFavourite;
	
	@FindBy(xpath = "//button//*[text()=' Form Suites ']")
	public UnityWebElement tabFormsSuites;
	
	@FindBy(xpath = "//mat-checkbox//input[@name='checkbox1']")
	public UnityWebElement checkboxInquiryForm;
	
	@FindBy(xpath = "//button//span[text()='Next']")
	public UnityWebElement buttonNext;

	@FindBy(xpath = "//mat-select[@id='mat-select-1']")
	public UnityGridElement dopdownViews;
	
	@FindBy(xpath = "//div[@role='gridcell']//span[contains(@class,'ag-icon-tree-closed')]")
	public UnityGridElement IconDownArrow;

	@FindBy(xpath = "//mat-option[@value='10']")
	public UnityGridElement option10RecentForms;

	@FindBy(xpath = "//mat-option[@value='20']")
	public UnityGridElement option20RecentForms;

	@FindBy(xpath = "//mat-option[@value='30']")
	public UnityGridElement option30RecentForms;

	@FindBy(xpath = "//div[@class='entity-searchbox']//input")
	public UnityWebElement textboxSearchForms;

	@FindBy(xpath = "//div[@class='entity-searchbox']//mat-icon")
	public UnityWebElement searchIconSearchForms;

//	@FindBy(xpath = "//*[@id='dynamic-forms']//div[@role='grid']")
//	public UnityGridElement gridCurrentForms;
//
//	@FindBy(xpath = "//*[@id='form-grid']//div[@role='grid']")
//	public UnityGridElement gridRecentForms;
	
	@FindBy(xpath = "//div[@role='grid']")
	public UnityGridElement gridFormSuite;

	@FindBy(xpath = "//mat-select")
	public UnityWebElement dropdownDepartments;

	@FindBy(xpath = "//mat-option[*[normalize-space(text())='sales']]")
	public UnityWebElement optionSales;
	
	@FindBy(xpath = "//div[@role='grid']")
	public UnityGridElement gridRules;
	
	@FindBy(xpath = "//*[normalize-space(text())='Edit Rule']")
	public UnityWebElement headerEditRule;

	@Override
	public void waitForPageToLoad() {
		startTime = System.currentTimeMillis();
		if (!super.isPageLoaded(driver))
			Assert.fail("Timed out after " + AppConstants.PAGE_LOAD_TIMEOUT + " seconds\n");
	}
}
