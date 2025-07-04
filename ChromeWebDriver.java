package com.unity.browsers;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeWebDriver implements Driver {

	protected Logger log = LogManager.getLogger();

	/**
	 * This method provides an implementation of getDriver() method for Chrome
	 * browser
	 * 
	 * @author e5562312 neerajM
	 */
	public WebDriver getDriver() {
		log.info("[ Initializing chrome driver ]");
		WebDriverManager.chromedriver().setup();
//		WebDriverManager.chromedriver().c
//		String chromePath = System.getProperty("user.dir") + "/drivers/chromedriver.exe";
//		System.setProperty("webdriver.chrome.driver", chromePath);
		
		ChromeOptions options = new ChromeOptions();
		//ChromeOptions chromeOptions = getDefaultChromeOptions();
		options.setCapability(CapabilityType.STRICT_FILE_INTERACTABILITY,false);
		Map<String, Object> preferences = new HashMap<>();
		preferences.put("plugins.plugins_disabled", new String[] { "Chrome PDF Viewer" });
		preferences.put("plugins.always_open_pdf_externally", true);
		options.setExperimentalOption("prefs", preferences);

		return new ChromeDriver(options);
	}
}
