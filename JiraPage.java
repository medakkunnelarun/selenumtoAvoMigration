package com.unity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.unity.constants.AppConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityTableElement;
import com.unity.customelements.UnityWebElement;

public class JiraPage extends BaseTestPage {
	
	WebDriver driver;

	public JiraPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}
	
	
	@FindBy(xpath = "//input[@name='os_username']")
	public UnityWebElement textboxJiraUserID;
	
	@FindBy(xpath = "//input[@name='loginfmt']")
	public UnityWebElement textboxTRUserID;
	

	@FindBy(xpath = "//input[@name='os_password']")
	public UnityWebElement textboxJiraPassword;
	
	@FindBy(xpath = "//input[@name='Password']")
	public UnityWebElement textboxTRPassword;
	
	
	@FindBy(xpath = "//input[@name='login']")
	public UnityWebElement btnLogin;
	
	@FindBy(xpath = "//a[text()='WUP-29840']")
	public UnityWebElement linkGPCoreJira;
	
	@FindBy(xpath = "//span[contains(@class,'aui-iconfont-edit')]")
	public UnityWebElement iconEdit;
	
	@FindBy(xpath = "//h1[@id='summary-val']")
	public UnityWebElement headerSummary;
	
	@FindBy(xpath = "//input[@name='summary']")
	public UnityWebElement txtSummary;
	
	@FindBy(xpath = "//input[@class='top-search-control']")
	public UnityWebElement txtTRSearch;
	
	@FindBy(xpath = "//a[contains(@class,'button-edit')]")
	public UnityWebElement linkTREdit;
	
	@FindBy(xpath = "(//a[text()='Test Suites'])[1]")
	public UnityWebElement linkTRTestSuites;
	
	@FindBy(xpath = "//input[@name='refs']")
	public UnityWebElement txtTRRef;
	
	@FindBy(xpath = "//button[normalize-space(text())='Save Test Case']")
	public UnityWebElement butnTRSave;
	
	@FindBy(xpath = "//button[@type='submit']")
	public UnityWebElement butnSave;
	
	@FindBy(xpath = "//input[@type='submit']")
	public UnityWebElement butnTRNext;
	
	@FindBy(xpath = "//span[text()='Sign in']")
	public UnityWebElement butnTRSignIn;
	
	@FindBy(xpath = "//table[@id='issuetable']")
	public UnityTableElement tblSubtask;
	
	@Override
	public void waitForPageToLoad() {
		// TODO Auto-generated method stub
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
