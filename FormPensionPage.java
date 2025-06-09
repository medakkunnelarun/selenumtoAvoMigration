package com.unity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.unity.constants.AppConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityWebElement;

public class FormPensionPage extends BaseTestPage {
	WebDriver driver;

	public FormPensionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}
	
	@FindBy(xpath = "//input[@name='planNum']")
	public UnityWebElement lookupplanNum;	

	@FindBy(xpath = "//input[@name='moneyTypeForRemittance']")
	public UnityWebElement textBoxmoneyTypeForRemittance;
	
	@FindBy(xpath = "//input[@name='taxCodeForDetailTrans']")
	public UnityWebElement textBoxtaxCodeForDetailTrans;
	
	@FindBy(xpath = "//input[@name='yearOfAccruedYTDDeductions']")
	public UnityWebElement textBoxyearOfAccruedYTDDeductions;
	
	@FindBy(xpath = "//input[@name='taxCodeForSummaryTrans']")
	public UnityWebElement lookuptaxCodeForSummaryTrans;
	
	@FindBy(xpath = "//input[@name='checkingAccountNum']")
	public UnityWebElement textBoxcheckingAccountNum;
	
	@FindBy(xpath = "//mat-select[@name='checkIRASetBox1099R']")
	public UnityWebElement dropdowncheckIRASetBox1099R;
	
	@FindBy(xpath = "//mat-select[@name='holidayWeekendRemittanceSchedule']")
	public UnityWebElement dropdownholidayWeekendRemittanceSchedule;
	
	@FindBy(xpath = "//mat-select[@name='lastYearFor1099RRept']")
	public UnityWebElement dropdownlastYearFor1099RRept;
	
	@FindBy(xpath = "//mat-select[@name='suppressLongNameFromTrust']")
	public UnityWebElement dropdownsuppressLongNameFromTrust;
	
	@FindBy(xpath = "//mat-select[@name='displayParticipantPayeeOrBothOnTr']")
	public UnityWebElement dropdowndisplayParticipantPayeeOrBothOnTr;
	
	@FindBy(xpath = "//mat-select[@name='includeWithholdingDescriptionsOnTr']")
	public UnityWebElement dropdownincludeWithholdingDescriptionsOnTr;
	
	@FindBy(xpath = "//mat-select[@name='employeeNumberOnStub']")
	public UnityWebElement dropdownemployeeNumberOnStub;
	
	@FindBy(xpath = "//mat-select[@name='awardNumberOnStub']")
	public UnityWebElement dropdownawardNumberOnStub;
	
	@FindBy(xpath = "//mat-select[@name='displayIncomeSource']")
	public UnityWebElement dropdowndisplayIncomeSource;
	
	@FindBy(xpath = "//mat-select[@name='updateTrustAccounts']")
	public UnityWebElement dropdownupdateTrustAccounts;
	
	@FindBy(xpath = "//mat-select[@name='postSumOrDetailTrTrn']")
	public UnityWebElement dropdownpostSumOrDetailTrTrn;
	
	@FindBy(xpath = "//mat-select[@name='trustTransPortfolio']")
	public UnityWebElement dropdowntrustTransPortfolio;
	
	@FindBy(xpath = "//mat-select[@name='feeBaseForTrpTransactions']")
	public UnityWebElement dropdownfeeBaseForTrpTransactions;
	
	@FindBy(xpath = "//mat-select[@name='printAdviceForMailing']")
	public UnityWebElement dropdownprintAdviceForMailing;
	
	@FindBy(xpath = "//mat-select[@name='addressOnTaxForms']")
	public UnityWebElement dropdownaddressOnTaxForms;
	
	@FindBy(xpath = "//mat-select[@name='taxableAmtZeroFor1099R']")
	public UnityWebElement dropdowntaxableAmtZeroFor1099R;
	
	@FindBy(xpath = "//mat-select[@name='inclPRUnitWDsIn1099']")
	public UnityWebElement dropdowninclPRUnitWDsIn1099;
	
	@FindBy(xpath = "//input[@name='stubDesc1']")
	public UnityWebElement textBoxstubDesc1;
	
	@FindBy(xpath = "//input[@name='stubDesc2']")
	public UnityWebElement textBoxstubDesc2;
	
	@FindBy(xpath = "//input[@name='incomeSourceMtOrder']")
	public UnityWebElement textBoxincomeSourceMtOrder;
	
	@FindBy(xpath = "//input[@name='incomeSourceFundOrder']")
	public UnityWebElement textBoxincomeSourceFundOrder;
	
	@FindBy(xpath = "//input[@name='summaryOverrideDisbursementCodes']")
	public UnityWebElement textBoxsummaryOverrideDisbursementCodes;

	@FindBy(xpath = "//input[@name='fundsCodeTrpTrans']")
	public UnityWebElement lookupfundsCodeTrpTrans;	

	
	@Override
	public void waitForPageToLoad() {
		startTime = System.currentTimeMillis();
		if (!super.isPageLoaded(driver))
			Assert.fail("Timed out after " + AppConstants.PAGE_LOAD_TIMEOUT + " seconds\n");
	}

}
