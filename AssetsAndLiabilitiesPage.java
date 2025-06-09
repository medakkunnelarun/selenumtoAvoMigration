package com.unity.pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.unity.constants.AppConstants;

public class AssetsAndLiabilitiesPage extends BaseTestPage {

	WebDriver driver;

	@Override
	public void waitForPageToLoad() {
		startTime = System.currentTimeMillis();
		if (!super.isPageLoaded(driver))
			Assert.fail("Timed out after " + AppConstants.PAGE_LOAD_TIMEOUT + " seconds\n");
	}

}
