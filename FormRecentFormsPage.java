package com.unity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.unity.constants.AppConstants;
import com.unity.customelements.CustomElementFieldDecorator;
import com.unity.customelements.UnityWebElement;

import junit.framework.Assert;

public class FormRecentFormsPage extends BaseTestPage {

	WebDriver driver;

	public FormRecentFormsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new CustomElementFieldDecorator(driver, driver), this);
	}

	@FindBy(xpath = "//*[@id=\"form-grid\"]/zeno-ag-grid-angular/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div[22]/div[8]")
	public UnityWebElement txtAccountNameGP;

	@FindBy(xpath = "//*[@id=\"form-grid\"]/zeno-ag-grid-angular/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div[22]/div[3]")
	public UnityWebElement txtFormTypeGP;

	@FindBy(xpath = "//*[@id=\"form-grid\"]/zeno-ag-grid-angular/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div[22]/div[7]")
	public UnityWebElement txtAccountNumberGP;

	@FindBy(xpath = "//*[@id=\"form-grid\"]/zeno-ag-grid-angular/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div[10]/div[9]")
	public UnityWebElement txtFormNameTD;

	@FindBy(xpath = "//*[@id=\"form-grid\"]/zeno-ag-grid-angular/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div[10]/div[6]")
	public UnityWebElement txtAccountNameTD;

	@FindBy(xpath = "//*[@id=\"form-grid\"]/zeno-ag-grid-angular/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div[10]/div[1]")
	public UnityWebElement txtFormTypeTD;

	@FindBy(xpath = "//*[@id=\"form-grid\"]/zeno-ag-grid-angular/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div[10]/div[5]")
	public UnityWebElement txtAccountNumberTD;

	@Override
	public void waitForPageToLoad() {
		startTime = System.currentTimeMillis();
		if (!super.isPageLoaded(driver))
			Assert.fail("Timed out after " + AppConstants.PAGE_LOAD_TIMEOUT + " seconds\n");
	}

}
