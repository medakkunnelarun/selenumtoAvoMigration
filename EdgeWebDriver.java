package com.unity.browsers;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import com.unity.constants.AppConstants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeWebDriver implements Driver {

	protected Logger log = LogManager.getLogger();

	/**
	 * This method provides an implementation of getDriver() method for Edge browser
	 * 
	 * @author e5562312 neerajM
	 */
	public WebDriver getDriver() {
		log.info("[ Initializing Edge driver ]");
		WebDriverManager.edgedriver().setup();
//		String edgePath = System.getProperty("user.dir") + "/drivers/msedgedriver.exe";
//		System.setProperty("webdriver.edge.driver", edgePath);
		EdgeOptions options = new EdgeOptions();
		
		Map<String, Object> preferences = new HashMap<>();
		preferences.put("download.default_directory", AppConstants.DOWNLOAD_FOLDER_PATH);
		//preferences.put("plugins.plugins_disabled", new String[] { "Chrome PDF Viewer" });
		preferences.put("plugins.always_open_pdf_externally", true);

		//options.add_experimental_option("prefs",{"plugins.always_open_pdf_externally": True});

		options.setExperimentalOption("prefs", preferences);

		return new EdgeDriver(options);
	}
}
