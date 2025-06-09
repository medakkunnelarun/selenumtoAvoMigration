package com.unity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.unity.constants.AppConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityWebElement;

public class SnOTradingPage extends BaseTestPage {

	WebDriver driver;

	public SnOTradingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}

	// Tab Items
	@FindBy(xpath = "//*[normalize-space(text())='Fund orders']")
	public UnityWebElement tabFundOrders;
	
	@FindBy(xpath = "//*[normalize-space(text())='Orders']")
	public UnityWebElement tabOrders;

	@FindBy(xpath = "//*[normalize-space(text())='Purchase / Sell']")
	public UnityWebElement tabPurchaseOrSell;

	@FindBy(xpath = "//mat-select[@aria-label='View by']")
	public UnityWebElement dropdownSelect;

	// Dropdown Options
	@FindBy(xpath = "//mat-option[span[normalize-space(text())='Purchase']]")
	public UnityWebElement optionPurchase;

	@FindBy(xpath = "//mat-option[span[normalize-space(text())='Sell']]")
	public UnityWebElement optionSell;

	@FindBy(xpath = "//mat-option[span[normalize-space(text())='Add and purchase']]")
	public UnityWebElement optionAddAndPurchase;
	
	@FindBy(xpath = "//iframe[contains(@src,'OrderToBuy')]")
	public UnityWebElement frameSnOTrading;
	
	@FindBy(xpath = "//span[normalize-space(text())='Order to buy']")
    public UnityWebElement optionOrderToBuy;
	
	@FindBy(xpath = "//span[normalize-space(text())='Order to sell']")
    public UnityWebElement optionOrderToSell;
	
	@FindBy(xpath = "//iframe[@id='service-ops']")
    public UnityWebElement frameOrderToSell;
	
	@FindBy(xpath = "//td//input[contains(@id,'ctl01_FxTransactionsContentPlaceHolder_ctlOrderToSell_ctlDockTxIdent_C_ctlSecurityProcessing_ctlSecurityProcessing_ctlPortfolioLookup_ctlPortfolioRadComboBox_In')]")
    public UnityWebElement textboxSourcePortfolio;
	
	@FindBy(xpath = "//div[contains(@id,'ctl01_FxTransactionsContentPlaceHolder_ctlOrderToSell_ctlDockTxIdent_C_ctlSecurityProcessing_ctlSecurityProcessing_ctlPortfolioLookup_ctlPortfolioRadComboBox_DropDown')]")
    public UnityWebElement panelSourcePortfolioOptions;

	@FindBy(xpath = "//input[@id='ctl01_FxTransactionsContentPlaceHolder_ctlOrderToSell_ctlDockTxIdent_C_ctlSecurityProcessing_ctlSecurityProcessing_ctlHoldingSearchLookup_ctlSearch']")
    public UnityWebElement buttonHoldingsSearch;
	
	@FindBy(xpath = "//input[@id='ctl01_FxTransactionsContentPlaceHolder_ctlOrderToSell_ctlDockTxIdent_C_ctlSecurityProcessing_ctlSecurityProcessing_ctlHoldingSearchLookup_ctlSearchText']")
    public UnityWebElement textBoxHoldings;
	
	@FindBy(xpath = "//iframe[@name='HoldingLookup']")
    public UnityWebElement frameHoldings;
	
	@FindBy(xpath = "//tr[@id='ctlPortfolioTradeHoldingsLookup_ctlPortfolioTradeHolding_ctlRadioGridControl_ctlGenericGrid_ctl00__0']/td[1]")
    public UnityWebElement radioButtonfirstHolding;
	
	@FindBy(xpath = "//input[@id='ctlPortfolioTradeHoldingsLookup_cltPortfolioHoldingEntitlement_ctlRadioGridControl_ctlGenericGrid_ctl00_ctl04_rdSelect']")
    public UnityWebElement radioButtonfirstPositionEntitlementSummaryHolding;
	
	@FindBy(xpath = "//input[@id='ctlSelect']")
    public UnityWebElement buttonSelect;
	
	@FindBy(xpath = "//input[@id='ctl01_FxTransactionsContentPlaceHolder_ctlOrderToSell_ctlDockOrderDetails_C_ctlOrderDetails_ctlUnits']")
    public UnityWebElement textBoxUnits;
	
	

	@Override
	public void waitForPageToLoad() {
		startTime = System.currentTimeMillis();
		if (super.isPageLoaded(driver))
			try {
				dropdownSelect.waitforVisible(AppConstants.PAGE_LOAD_TIMEOUT);
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
