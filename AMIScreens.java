package com.unity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.unity.constants.AppConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityTableElement;
import com.unity.customelements.UnityWebElement;

public class AMIScreens extends BaseTestPage {
	
	WebDriver driver;

	public AMIScreens(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}
		
	@FindBy(xpath = "//span[contains(text(),'Masters')]")
	public UnityWebElement linkMasters;

	@FindBy(xpath = "//span[contains(text(),'Account Master Data')]")
	public UnityWebElement linkMasterAccountMaster;
	
	@FindBy(xpath = "//a//span[text()='Interested Party Master']")
	public UnityWebElement linkInterestedPartyMaster;
	              
	@FindBy(xpath = "//input[@name='IPN']")
	public UnityWebElement textboxInterestedParty;
	
	@FindBy(xpath = "//input[@value='OK']")
	public UnityWebElement btnOkMasterAcc;
	
	@FindBy(xpath = "//a//span[text()='Master Account Master']")
	public UnityWebElement linkMasterAccountMasterD;
	
	@FindBy(xpath = "//a//span[text()='Master Account Master']")
	public UnityWebElement linkMasterAccountMaster1;
	
	@FindBy(xpath = "//a//span[text()='Security - Cusip']")
	public UnityWebElement labelSecurityCusip;
	
	@FindBy(xpath = "//input[@name='SII']")
	public UnityWebElement textboxCusip;
	
	@FindBy(xpath = "//*[@id=\"Page1\"]/tbody/tr[41]/td[1]/a")
    public UnityWebElement linkFeeProcessing;
    
    @FindBy(xpath = "//table[@id='Page1']")
    public UnityTableElement tblFeeProcessing;

	
	@FindBy(xpath = "//input[@name='userID']")
	public UnityWebElement textboxUserID;
	
	@FindBy(xpath = "//input[@name='UserPWD']")
	public UnityWebElement textboxPassword;
	
	@FindBy(xpath = "//input[@name='os_password']")
	public UnityWebElement textboxJiraPassword;
	
	@FindBy(xpath = "//input[@name='btnOK']")
	public UnityWebElement btnOk;
	
	@FindBy(xpath = "//input[@name='login']")
	public UnityWebElement btnLogin;
	
	@FindBy(xpath = "//frameset[@id='idLeftFrameset']")
	public UnityWebElement frameSetMain;
	
	@FindBy(xpath = "//frame[@name='frmToc']")
	public UnityWebElement frameCommonMenu;
	
	@FindBy(xpath = "//a//span[text()='Transactions']")
	public UnityWebElement linkTransactions;
	
//	@FindBy(xpath = "//a//span[text()='Masters']")
//	public UnityWebElement linkMasters;
	
	@FindBy(xpath = "//a//span[text()='Cash']")
	public UnityWebElement linkCash;
	
	@FindBy(xpath = "//a//span[text()='Trades -  Orders']")
	public UnityWebElement linkTradeOrders;
	
//	@FindBy(xpath = "//a//span[text()='Account Master Data']")
//	public UnityWebElement linkMasterAccountMaster;
	
	@FindBy(xpath = "//a//span[text()='Cash Balance']")
	public UnityWebElement linkCashBalance;
	
	@FindBy(xpath = "//a//span[text()='Account - Summary ']")
	public UnityWebElement linkAccountSummary;
	
	@FindBy(xpath = "//frame[@name='frmMain']")
	public UnityWebElement frameMainSec;
	
	@FindBy(xpath = "//input[@name='ACN']")
	public UnityWebElement textboxAccount;
	
	@FindBy(xpath = "//input[@name='MACN']")
	public UnityWebElement textboxMasterAccount;
	
	@FindBy(xpath = "//input[@name='Status']")
	public UnityWebElement textboxStatus;
	
	@FindBy(xpath = "//input[@value='OK']")
	public UnityWebElement buttonOk;
	
	@FindBy(xpath = "//table[@id='Page1']")
	public UnityTableElement tblTradeOrders;
	
	@FindBy(xpath = "//*[normalize-space(text())='Units']/following-sibling::td")
	public UnityWebElement labelUnitsValue;
	
	@FindBy(xpath = "//*[normalize-space(text())='Income Cash']/following-sibling::td")
	public UnityWebElement labelIncomeCashValue;

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
