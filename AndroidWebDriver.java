package com.unity.browsers;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import com.unity.utilities.AppiumServer;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AndroidWebDriver implements Driver {

	protected Logger log = LogManager.getLogger();

	/**
	 * This method provides an implementation of getDriver() method for Android
	 * browser
	 * 
	 * @author e5562312 neerajM
	 */
	@Override
	public WebDriver getDriver() {
		AppiumServer appiumServer = new AppiumServer();
		int port = 4723;
		if (!appiumServer.checkIfServerIsRunnning(port)) {
			appiumServer.startServer();
		}

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "emulator-5554");
		capabilities.setCapability("platformName", "Android");
		capabilities.setVersion("5.1.1");
		capabilities.setCapability("noReset", "true");
		capabilities.setCapability("appPackage", "com.google.android.apps.authenticator2");
		capabilities.setCapability("appActivity", "com.google.android.apps.authenticator.AuthenticatorActivity");

		try {
			log.info("[ Initializing android driver ]");
			return new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			Assert.fail("Appium Server URL is not correct", e.getCause());
		}
		return null;
	}

}
