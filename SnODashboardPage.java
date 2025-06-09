package com.unity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.unity.constants.AppConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityWebElement;

public class SnODashboardPage extends BaseTestPage {

	WebDriver driver;

	public SnODashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}

	// header
	@FindBy(xpath = "//small[@class='ng-star-inserted']")
	public UnityWebElement labelAccountOrClientName;

	// Cash Processing tile links
	@FindBy(xpath = "//button[@id='go-tile-Disbursement-button']")
	public UnityWebElement buttonDisbursement;

	@FindBy(xpath = "//button[@id='go-tile-Transfer-button']")
	public UnityWebElement buttonTransfer;

	@FindBy(xpath = "//button[@id='go-tile-Receipt-button']")
	public UnityWebElement buttonReceipt;

	@FindBy(xpath = "//div//span[normalize-space(text())='Disbursement by:']//..//div//button[@class='go-menu-btn mat-menu-trigger']")
	public UnityWebElement dropdownCashProcessing;

	// Disbursement : Options
	@FindBy(xpath = "//button[@id='go-tile-Disbursement by check']")
	public UnityWebElement optionDisbursementByCheck;

	@FindBy(xpath = "//button[@id='go-tile-Disbursement by ACH']")
	public UnityWebElement optionDisbursementByACH;

	@FindBy(xpath = "//button[@id='go-tile-Disbursement by wire']")
	public UnityWebElement optionDisbursementByWire;

	@FindBy(xpath = "//button[@id='go-tile-Disbursement by SWIFT']")
	public UnityWebElement optionDisbursementBySwift;

	@FindBy(xpath = "//button[@id='go-tile-Disbursement by chips']")
	public UnityWebElement optionDisbursementByChips;

	// Transfer : Options
	@FindBy(xpath = "//button[@id='go-tile-Transfer to account']")
	public UnityWebElement optionTransferToAccount;

	// Receipt : Options
	@FindBy(xpath = "//button[@id='go-tile-Cash receipt']")
	public UnityWebElement optionCashReceipt;

	// Security Movement tile links
	@FindBy(xpath = "//button[@id='go-tile-Free receipts / Delivers-button']")
	public UnityWebElement buttonFreeReceiptsOrDelivers;

	@FindBy(xpath = "//button[@id='go-tile-Release security-button']")
	public UnityWebElement buttonReleaseSecurity;

	@FindBy(xpath = "//go-tile[.//h3[normalize-space(text())='Security movement']]//button[@class='go-menu-btn mat-menu-trigger']")
	public UnityWebElement dropdownSecurityMovement;

	// Fee Receipts/Delivers : Options
	@FindBy(xpath = "//span[normalize-space(text())='Free delivery of security']")
	public UnityWebElement optionFreeDeliveryOfSecurity;

	@FindBy(xpath = "//span[normalize-space(text())='Free receipt of security']")
	public UnityWebElement optionFreeReceiptOfSecurity;

	@FindBy(xpath = "//span[normalize-space(text())='Security distribution to account']")
	public UnityWebElement optionSecurityDistributionToAccount;

	@FindBy(xpath = "//span[normalize-space(text())='Pending free delivery of security']")
	public UnityWebElement optionPendingFreeDeliveryOfSecurity;

	@FindBy(xpath = "//span[normalize-space(text())='Pending free receipt of security']")
	public UnityWebElement optionPendingFreeReceiptOfSecurity;

	// Release Security : Options
	@FindBy(xpath = "//span[normalize-space(text())='Restrict security']")
	public UnityWebElement optionRestrictSecurity;

	@FindBy(xpath = "//span[normalize-space(text())='Release restricted security']")
	public UnityWebElement optionReleaseRestrictedSecurity;

	// Trading Tile links
	@FindBy(xpath = "//button[@id='go-tile-Fund orders-button']")
	public UnityWebElement buttonFundOrders;

	@FindBy(xpath = "//button[@id='go-tile-Orders-button']")
	public UnityWebElement buttonOrders;

	@FindBy(xpath = "//button[@id='go-tile-Purchase / Sell-button']")
	public UnityWebElement buttonPurchaseOrSell;

	@FindBy(xpath = "//go-tile[.//h3[normalize-space(text())='Trading']]//button[contains(@class,'go-menu-btn')]")
	public UnityWebElement dropdownTrading;

	// Trading Orders : Options

	@FindBy(xpath = "//span[normalize-space(text())='Fund purchase order']")
	public UnityWebElement optionFundPurchaseOrder;

	@FindBy(xpath = "//span[normalize-space(text())='Order to buy']")
	public UnityWebElement optionOrderToBuy;

	@FindBy(xpath = "//span[normalize-space(text())='Fund Sell order']")
	public UnityWebElement optionFundSaleOrder;

	@FindBy(xpath = "//span[normalize-space(text())='Fund liquidation order']")
	public UnityWebElement optionFundLiquidationOrder;

	@FindBy(xpath = "//span[normalize-space(text())='Order to sell']")
	public UnityWebElement optionOrderToSell;

	// Purchase/Sell : Options
	@FindBy(xpath = "//span[normalize-space(text())='Purchase']")
	public UnityWebElement optionPurchase;

	@FindBy(xpath = "//span[normalize-space(text())='Sale']")
	public UnityWebElement optionSale;

	@FindBy(xpath = "//span[normalize-space(text())='Add and purchase']")
	public UnityWebElement optionAddAndPurchase;

	// Bill Pay tile links
	@FindBy(xpath = "//go-tile[.//h3[normalize-space(text())='Bill pay']]//button[@class='go-menu-btn mat-menu-trigger']")
	public UnityWebElement dropdownBillPay;

	// Tickets tile links
	@FindBy(xpath = "//go-tile[.//h3[normalize-space(text())='Tickets']]//button[@class='go-menu-btn mat-menu-trigger']")
	public UnityWebElement dropdownTickets;

	// Forms processing tile links
	@FindBy(xpath = "//go-tile[.//h3[normalize-space(text())='Forms Processing']]//button[@class='go-menu-btn mat-menu-trigger']")
	public UnityWebElement dropdownFormsProcessing;

	// Utilities tile links
	@FindBy(xpath = "//go-tile[.//h3[normalize-space(text())='Utilities']]//button[@class='go-menu-btn mat-menu-trigger']")
	public UnityWebElement dropdownUtilities;

	// Processes tile links
	@FindBy(xpath = "//go-tile[.//h3[normalize-space(text())='Processes']]//button[@class='go-menu-btn mat-menu-trigger']")
	public UnityWebElement dropdownProcesses;

	@FindBy(xpath = "//span[normalize-space(text())='Trust distribution']")
	public UnityWebElement optionTrustDistribution;
	
	@FindBy(xpath = "//div[contains(text(),'Distribution')]")
	public UnityWebElement TabDistribution;

	@FindBy(xpath = "//span[normalize-space(text())='Upon death administration']")
	public UnityWebElement optionUponDeathAdministration;

	@FindBy(xpath = "//span[normalize-space(text())='Gift distribution']")
	public UnityWebElement optionGiftDistribution;

	// Service & Operations reports tile links
	@FindBy(xpath = "//go-tile[.//h3[normalize-space(text())='Service & Operations reports']]//button[contains(@class,'go-menu-btn')]")
	public UnityWebElement dropdownServiceAndOperationsReports;

	// Qualified plan processing tile links
	@FindBy(xpath = "//go-tile[.//h3[normalize-space(text())='Qualified plan processing']]//button[contains(@class,'go-menu-btn')]")
	public UnityWebElement dropdownQualifiedPlanProcessing;

	@FindBy(xpath = "//button[@id='go-tile-Distribution by Check']")
	public UnityWebElement optionDistributionByCheck;

	@FindBy(xpath = "//button[@id='go-tile-Distribution by Wire']")
	public UnityWebElement optionDistributionByWire;

	@FindBy(xpath = "//button[@id='go-tile-Distribution by ACH']")
	public UnityWebElement optionDistributionByACH;

	// Tickets options
	@FindBy(xpath = "//button[@id='go-tile-Cash']")
	public UnityWebElement optionCash;

	@FindBy(xpath = "//button[@id='go-tile-Securities']")
	public UnityWebElement optionSecurities;

	@FindBy(xpath = "//button[@id='go-tile-Transfer all']")
	public UnityWebElement optionTransferAll;

	// Bill pay options
	@FindBy(xpath = "//button[@id='go-tile-One-time payment']")
	public UnityWebElement optionOneTimePayment;

	@FindBy(xpath = "//button[@id='go-tile-Recurring - Ask operator']")
	public UnityWebElement optionRecurringAskOperator;

	@FindBy(xpath = "//button[@id='go-tile-Recurring - Constant amount']")
	public UnityWebElement optionRecurringConstantAmount;

	@FindBy(xpath = "//button[@id='go-tile-Recurring - Computed disbursement']")
	public UnityWebElement optionRecurringComputedDisbursement;

	// Utilites options
	@FindBy(xpath = "//button[@id='go-tile-One-time payment']")
	public UnityWebElement optionBulkLoad;

	@FindBy(xpath = "//button[@id='go-tile-Unclaimed cash']")
	public UnityWebElement optionUnclaimedCash;

	@FindBy(xpath = "//button[@id='go-tile-Cash transfers']")
	public UnityWebElement optionCashTransfers;

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
