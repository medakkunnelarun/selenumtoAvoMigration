package com.unity.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.unity.constants.AppConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityWebElement;
import com.unity.customelements.UnityWidgetElement;

public class DashboardPage extends BaseTestPage {

	WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}

	// Loader spinner
	@FindBy(xpath = "//unity-loader")
	public UnityWebElement loginSpinner;
	
	@FindBy(xpath = "//*[normalize-space(text())='Top Business Relationships']/ancestor::dashboard-widget//div[contains(@class,'widget-contents')]")
	public UnityWidgetElement widgetTopBusinessRelationships;

	// header
	@FindBy(xpath = "//unity-header//*[normalize-space(text())='Unity']")
	public UnityWebElement headerUnity;

	@FindBy(xpath = "//book-of-business-checkbox//mat-checkbox")
	public UnityWebElement checkboxBookOfBusiness;

	@FindBy(xpath = "//*[normalize-space(text())='Recently Accessed']/ancestor::dashboard-widget//div[contains(@class,'widget-contents')]")
	public UnityWidgetElement widgetRecentlyAccessed;

	@FindBy(xpath = "//*[normalize-space(text())='Recently Accessed']/ancestor::dashboard-widget//ruf-card-controls/button")
	public UnityWebElement menuRecentlyAccessed;

	@FindBy(xpath = "//*[normalize-space(text())='Excess Cash Equivalent']/ancestor::dashboard-widget//div[contains(@class,'widget-contents')]")
	public UnityWidgetElement widgetExcessCashEquivalent;

	@FindBy(xpath = "//*[normalize-space(text())='Excess Cash Equivalent']/ancestor::dashboard-widget//ruf-card-controls/button")
	public UnityWebElement menuExcessCashEquivalent;

	@FindBy(xpath = "//*[normalize-space(text())='Top Market Value']/ancestor::dashboard-widget//div[contains(@class,'widget-contents')]")
	public UnityWidgetElement widgetTopMarketValue;

	@FindBy(xpath = "//*[normalize-space(text())='Top Market Value']/ancestor::dashboard-widget//ruf-card-controls/button")
	public UnityWebElement menuTopMarketValue;

	@FindBy(xpath = "./..//button[span[normalize-space(text())='Bar Chart View']]")
	public UnityWebElement linkBarChartView;

	@FindBy(xpath = "./..//button[span[normalize-space(text())='List Chart View']]")
	public UnityWebElement linkListChartView;

	@FindBy(xpath = "//*[normalize-space(text())='Top Market Value']/ancestor::dashboard-widget//button[span[normalize-space(text())='Bar Chart View']]")
	public UnityWebElement linkBarChartTopMarketValue;

	@FindBy(xpath = "//*[normalize-space(text())='Top Market Value']/ancestor::dashboard-widget//button[span[normalize-space(text())='Donut Chart View']]")
	public UnityWebElement linkDonutChartTopMarketValue;

	@FindBy(xpath = "//*[normalize-space(text())='Top Market Value']/ancestor::dashboard-widget//button[span[normalize-space(text())='List Chart View']]")
	public UnityWebElement linkListChartTopMarketValue;

	@FindBy(xpath = "//*[normalize-space(text())='Top Market Value']/ancestor::dashboard-widget//div[contains(@class,'bar-chart')]")
	public UnityWebElement barChartTopMarketValue;

	@FindBy(xpath = "//*[normalize-space(text())='Top Market Value']/ancestor::dashboard-widget//div[contains(@class,'donut')]")
	public UnityWebElement donutChartTopMarketValue;

	@FindBy(xpath = "//*[normalize-space(text())='Top Market Value']/ancestor::dashboard-widget//div[contains(@class,'fixed-header-table')]")
	public UnityWebElement listChartTopMarketValue;

	@FindBy(xpath = "//*[normalize-space(text())='Cash Balance']/ancestor::dashboard-widget//div[contains(@class,'widget-contents')]")
	public UnityWidgetElement widgetCashBalance;

	@FindBy(xpath = "//*[normalize-space(text())='Cash Balance']/ancestor::dashboard-widget//ruf-card-controls//button//mat-icon")
	public UnityWebElement menuCashBalance;

	@FindBy(xpath = "//*[normalize-space(text())='Cash Balance']/ancestor::dashboard-widget//button[span[normalize-space(text())='Bar Chart View']]")
	public UnityWebElement linkBarChartCashBalance;

	@FindBy(xpath = "//*[normalize-space(text())='Cash Balance']/ancestor::dashboard-widget//button[span[normalize-space(text())='Donut Chart View']]")
	public UnityWebElement linkDonutChartCashBalance;

	@FindBy(xpath = "//*[normalize-space(text())='Cash Balance']/ancestor::dashboard-widget//button[span[normalize-space(text())='List Chart View']]")
	public UnityWebElement linkListChartCashBalance;

	@FindBy(xpath = "//*[normalize-space(text())='Cash Balance']/ancestor::dashboard-widget//div[contains(@class,'bar-chart')]")
	public UnityWebElement barChartCashBalance;

	@FindBy(xpath = "//*[normalize-space(text())='Cash Balance']/ancestor::dashboard-widget//div[contains(@class,'donut')]")
	public UnityWebElement donutChartCashBalance;

	@FindBy(xpath = "//*[normalize-space(text())='Cash Balance']/ancestor::dashboard-widget//div[contains(@class,'fixed-header-table')]")
	public UnityWebElement listChartCashBalance;

	@FindBy(xpath = "//*[normalize-space(text())='Overdrafts']/ancestor::dashboard-widget//div[contains(@class,'widget-contents')]")
	public UnityWidgetElement widgetOverdrafts;

	@FindBy(xpath = "//*[normalize-space(text())='Overdrafts']/ancestor::dashboard-widget//ruf-card-controls/button")
	public UnityWebElement menuOverDrafts;
	
	@FindBy(xpath = "//*[@fisicon='export']")
	public UnityWebElement exportOverdraft;

	@FindBy(xpath = "//*[normalize-space(text())='Newly Opened Accounts']/ancestor::dashboard-widget//div[contains(@class,'widget-contents')]")
	public UnityWidgetElement widgetNewlyOpenedAccounts;

	@FindBy(xpath = "//*[normalize-space(text())='Newly Opened Accounts']/ancestor::dashboard-widget//ruf-card-controls/button")
	public UnityWebElement menuNewlyOpenedAccounts;

	@FindBy(xpath = "//*[normalize-space(text())='Closing Accounts']/ancestor::dashboard-widget//div[contains(@class,'widget-contents')]")
	public UnityWidgetElement widgetClosingAccounts;

	@FindBy(xpath = "//*[normalize-space(text())='Closing Accounts']/ancestor::dashboard-widget//ruf-card-controls/button")
	public UnityWebElement menuClosingAccounts;

	@FindBy(xpath = "//*[starts-with(text(),'Large') and substring(text(),7,4)='Cash' and normalize-space(substring(text(),12))='Receipts']/ancestor::dashboard-widget//div[contains(@class,'widget-contents')]")
	public UnityWidgetElement widgetLargeCashReceipts;

	@FindBy(xpath = "//*[starts-with(text(),'Large') and substring(text(),7,4)='Cash' and normalize-space(substring(text(),12))='Receipts']/ancestor::dashboard-widget//ruf-card-controls/button")
	public UnityWebElement menuLargeCashReceipts;

	@FindBy(xpath = "//*[normalize-space(text())='Account Without Fees']/ancestor::dashboard-widget//div[contains(@class,'widget-contents')]")
	public UnityWidgetElement widgetAccountWithoutFees;

	@FindBy(xpath = "//*[normalize-space(text())='Account Without Fees']/ancestor::dashboard-widget//ruf-card-controls/button")
	public UnityWebElement menuAccountWithoutFees;

	@FindBy(xpath = "//*[@id='top10Accounts']")
	public UnityWebElement optionTop10Accounts;

	@FindBy(xpath = "//*[@id='top20Accounts']")
	public UnityWebElement optionTop20Accounts;

	@FindBy(xpath = "//*[@id='top30Accounts']")
	public UnityWebElement optionTop30Accounts;

	@FindBy(xpath = "//*[@id='top10Clients']")
	public UnityWebElement optionTop10Clients;

	@FindBy(xpath = "//*[@id='top20Clients']")
	public UnityWebElement optionTop20Clients;

	@FindBy(xpath = "//*[@id='top30Clients']")
	public UnityWebElement optionTop30Clients;

	@FindBy(xpath = "//*[@id='top10Portfolios']")
	public UnityWebElement optionTop10Portfolios;

	@FindBy(xpath = "//*[@id='top20Portfolios']")
	public UnityWebElement optionTop20Portfolios;

	@FindBy(xpath = "//*[@id='top30Portfolios']")
	public UnityWebElement optionTop30Portfolios;

	@FindBy(xpath = "//*[@id='top01Days']")
	public UnityWebElement option1Day;

	@FindBy(xpath = "//*[@id='top02Days']")
	public UnityWebElement option2Days;

	@FindBy(xpath = "//*[@id='top03Days']")
	public UnityWebElement option3Days;

	@FindBy(xpath = "//*[@id='top05Days']")
	public UnityWebElement option5Days;

	@FindBy(xpath = "//*[@id='top10Days']")
	public UnityWebElement option10Days;

	@FindBy(xpath = "//*[@id='top10Amount']")
	public UnityWebElement optionTop10ByAmount;

	@FindBy(xpath = "//*[@id='top20Amount']")
	public UnityWebElement optionTop20ByAmount;

	@FindBy(xpath = "//*[@id='top30Amount']")
	public UnityWebElement optionTop30ByAmount;

	@FindBy(xpath = "//*[@id='top10Percentage']")
	public UnityWebElement optionTop10ByPercentage;

	@FindBy(xpath = "//*[@id='top20Percentage']")
	public UnityWebElement optionTop20ByPercentage;

	@FindBy(xpath = "//*[@id='top30Percentage']")
	public UnityWebElement optionTop30ByPercentage;

	// New settings
	@FindBy(xpath = "//*[@id='main']//unity-dashboard//div[1]//button//mat-icon")
	public UnityWebElement buttonSettings;

	@FindBy(xpath = "//h2[normalize-space(text())='Configure Dashboard']")
	public UnityWebElement headerConfigureDashboard;

	@FindBy(xpath = "//span[normalize-space(text())='Account Without Fees']/preceding-sibling::mat-checkbox")
	public UnityWebElement checkboxAccountWithoutFees;

	@FindBy(xpath = "//span[normalize-space(text())='Cash Balance']/preceding-sibling::mat-checkbox")
	public UnityWebElement checkboxCashBalance;

	@FindBy(xpath = "//span[normalize-space(text())='Closing Accounts']/preceding-sibling::mat-checkbox")
	public UnityWebElement checkboxClosingAccounts;

	@FindBy(xpath = "//span[normalize-space(text())='Excess Cash Equivalent']/preceding-sibling::mat-checkbox")
	public UnityWebElement checkboxExcessCashEquivalent;

	@FindBy(xpath = "//*[starts-with(text(),'Large') and substring(text(),7,4)='Cash' and substring(text(),12)='Receipts']/preceding-sibling::mat-checkbox")
	public UnityWebElement checkboxLargeCashReceipts;

	@FindBy(xpath = "//span[normalize-space(text())='Newly Opened Accounts']/preceding-sibling::mat-checkbox")
	public UnityWebElement checkboxNewlyOpenedAccounts;

	@FindBy(xpath = "//span[normalize-space(text())='Overdrafts']/preceding-sibling::mat-checkbox")
	public UnityWebElement checkboxOverdrafts;

	@FindBy(xpath = "//span[normalize-space(text())='Recently Accessed']/preceding-sibling::mat-checkbox")
	public UnityWebElement checkboxRecentlyAccessed;

	@FindBy(xpath = "//span[normalize-space(text())='Top Market Value']/preceding-sibling::mat-checkbox")
	public UnityWebElement checkboxTopMarketValue;
	
	@FindBy(xpath = "//span[normalize-space(text())='Top Business Relationships']/preceding-sibling::mat-checkbox")
	public UnityWebElement checkboxTopBusinessRelationship;

	@FindBy(xpath = "//button[@aria-label='close']")
	public UnityWebElement buttonClose;
	
	@FindBy(xpath = "//button[@id='button-launch-dashboard']")
	public UnityWebElement buttonLanchDashboard;

	@Override
	public void waitForPageToLoad() {
		//System.out.println("invoked");
		startTime = System.currentTimeMillis();
		if (super.isPageLoaded(driver)) {
		//elseif()
			//System.out.println("In If");
			try {
				loginSpinner.waitforInvisible(AppConstants.PAGE_LOAD_TIMEOUT);
				headerUnity.waitforVisible(AppConstants.PAGE_LOAD_TIMEOUT);
				endTime = System.currentTimeMillis();
				pageLoadTime = (endTime - startTime) / 1000;
			} catch (Exception e) {
				Assert.fail("Expected page did not load\n" + e.getLocalizedMessage());
				driver.close();
			}
		}
		else if(headerUnity.isDisplayed() && AppConstants.APPLICATION_ENV.equalsIgnoreCase("tst191.ad")){
			System.out.println("In else If");
			try {
			//do nothing and move on
			loginSpinner.waitforInvisible(AppConstants.PAGE_LOAD_TIMEOUT);
		} catch (Exception e) {
			Assert.fail("Expected page did not load\n" + e.getLocalizedMessage());
		}
		}
//		else if()
		else {
			System.out.println("In else");
			Assert.fail("Timed out after " + AppConstants.PAGE_LOAD_TIMEOUT + " seconds\n");
		}
	}

	public void setDefaultState() {
		if (checkboxBookOfBusiness.isPresent()
				&& checkboxBookOfBusiness.getAttribute("class").contains("mat-mdc-checkbox-checked")) {
			checkboxBookOfBusiness.click();
			waitForPageToLoad();
		}
		buttonSettings.click();
		headerConfigureDashboard.waitforVisible();
		checkboxRecentlyAccessed.waitforVisible();
		if (checkboxAccountWithoutFees.isPresent()
				&& !(checkboxAccountWithoutFees.getAttribute("class").contains("mat-mdc-checkbox-checked"))) {
			checkboxAccountWithoutFees.click();
		}
		if (!(checkboxCashBalance.getAttribute("class").contains("mat-mdc-checkbox-checked"))) {
			checkboxCashBalance.click();
		}
		if (checkboxClosingAccounts.isPresent()
				&& !(checkboxClosingAccounts.getAttribute("class").contains("mat-mdc-checkbox-checked"))) {
			checkboxClosingAccounts.click();
		}
		if (!(checkboxExcessCashEquivalent.getAttribute("class").contains("mat-mdc-checkbox-checked"))) {
			checkboxExcessCashEquivalent.click();
		}
		if (!(checkboxLargeCashReceipts.getAttribute("class").contains("mat-mdc-checkbox-checked"))) {
			checkboxLargeCashReceipts.click();
		}
		if (!(checkboxNewlyOpenedAccounts.getAttribute("class").contains("mat-mdc-checkbox-checked"))) {
			checkboxNewlyOpenedAccounts.click();
		}
		if (!(checkboxOverdrafts.getAttribute("class").contains("mat-mdc-checkbox-checked"))) {
			checkboxOverdrafts.click();
		}
		if (!(checkboxRecentlyAccessed.getAttribute("class").contains("mat-mdc-checkbox-checked"))) {
			checkboxRecentlyAccessed.click();
		}
		if (!(checkboxTopMarketValue.getAttribute("class").contains("mat-mdc-checkbox-checked"))) {
			checkboxTopMarketValue.click();
		}
		if (checkboxAccountWithoutFees.isPresent()
				&& !(checkboxTopBusinessRelationship.getAttribute("class").contains("mat-mdc-checkbox-checked"))) {
			checkboxTopBusinessRelationship.click();
		}
		buttonLanchDashboard.click();
		waitForPageToLoad();
	}

	public List<String> verifyWidgetPosition() {
		List<WebElement> widgetsXCordinate = driver.findElements(By.xpath("//div[contains(@style,'translateX')]"));
		List<String> widgeXCordinateString = new ArrayList<>();
		for (WebElement widget : widgetsXCordinate) {
			String coordinateValueX = widget.getAttribute("style").replaceAll("\\(", "").split("translateX")[1]
					.split("px")[0].trim();
			widgeXCordinateString.add(coordinateValueX);
		}
		return widgeXCordinateString;
	}
}