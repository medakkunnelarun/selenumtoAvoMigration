package com.unity.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.unity.constants.AppConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityGridElement;
import com.unity.customelements.UnityWebElement;
import com.unity.utilities.UnityUtils;

public class RetirementManagementPage extends BaseTestPage {
	WebDriver driver;

	public RetirementManagementPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}

	
	@FindBy(xpath = "(//a[span[normalize-space(text())='Dashboard']])[2]")
	public UnityWebElement linkDashboard;
	
//	@FindBy(xpath = "//a[span[normalize-space(text())='Plan / Participant List']]")
//	public UnityWebElement linkPlanParticipants;
//	
//    
//    @FindBy(css = "div[role='grid']")
//    public UnityGridElement gridRMD;
//    
    @FindBy(xpath = "//mat-checkbox[@aria-label='Recent']//input")
    public UnityWebElement checkboxRecent;

    @FindBy(xpath = "//span[normalize-space(text())='Plan / Participant List']")
    public UnityWebElement linkPlanParticipants;
    
	@FindBy(xpath = "//ag-grid-angular")
	public UnityGridElement gridRMD;


    @FindBy(xpath = "//span[text()=' Clear ']")
    public UnityWebElement checkboxClear;
    
    @FindBy(xpath = "//mat-checkbox[@aria-label='Favorites']//input")
    public UnityWebElement checkboxFavorites;
    
    @FindBy(xpath = "//entity-filter//mat-icon")
    public UnityWebElement dropdownView;
    
    @FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Plans']]//input")
    public UnityWebElement checkboxPlans;

    @FindBy(xpath = "//mat-checkbox[.//span[normalize-space(text())='Participants']]//input")
    public UnityWebElement checkboxParticipants;

    @FindBy(xpath = "//button[@id='account-list-filter-refresh']")
    public UnityWebElement buttonRefresh;
    
    @FindBy(xpath = "//input[contains(@class,'account-list-search-box')]")
    public UnityWebElement textboxSearch;
    
    @FindBy(xpath = "//div[normalize-space(text())='Plan Information']")
    public UnityWebElement tabPlanInformation;
    
    @FindBy(xpath = "//div[normalize-space(text())='Fund Accounts']")
    public UnityWebElement tabFundAccounts;

    @FindBy(xpath = "//div[normalize-space(text())='Other Masters']")
    public UnityWebElement tabOtherMasters;

    @FindBy(xpath = "//div[normalize-space(text())='Notes']")
    public UnityWebElement tabNotes;



    public void textBoxSearchAndClick(String searchParameter) {
        textboxSearch.sendKeys(searchParameter);
        gridRMD.waitforVisible();
        UnityUtils.wait(2000);
        gridRMD
                .findElements(By.xpath("//a//span[contains(text(),'" + searchParameter + "')]"))
                .get(0).click();
        UnityUtils.wait(2000);
    }


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