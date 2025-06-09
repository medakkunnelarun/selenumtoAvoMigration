package com.unity.constants;

import java.time.LocalDateTime;
import java.util.Properties;

import org.testng.Assert;

import com.unity.utilities.AppConfig;

/**
 * This class sets all the given properties to constants
 * 
 * @author e5562312
 *
 */
public final class AppConstants {
	private AppConstants() {
		throw new IllegalStateException("AppConstants class");
	}

	static Properties prop = AppConfig.propertyReader();

	private static String applicationURL = null;
	private static String applicationURLMT01 = null;
	private static String applicationURLMT02 = null;
	
	public static String Env_Load;
	public static String Forms_Load;
	public static String Lookup_Load;
	public static String Submission;
	public static String UserList_Status;
	public static String Approver_Bucket;
	public static String Approval;
	public static String ManagerFlow;
	public static String Final_Status;
	public static LocalDateTime startTime;
	public static LocalDateTime endTime;

	public static final String USER_DIRECTORY = System.getProperty("user.dir");
	public static String APPLICATION_ENV = prop.getProperty("application.env");
	public static final String APPLICATION_Type = prop.getProperty("application.type");
	public static final String UPLOAD_FOLDER_PATH = System.getProperty("user.dir") + "\\test-data\\upload\\";
	public static final String DOWNLOAD_FOLDER_PATH = System.getProperty("user.home") + "\\Downloads\\";

	public static final String BROWSER_TYPE = prop.getProperty("browser.type");
	
	/************************************Zephyr API(ZAPI) data*******************************************************/
	public static final String ZAPI_BASE_URL = AppConfig.propertyReader().getProperty("zapi.baseurl");
	public static final Boolean ZAPI_UPDATE_FLAG = Boolean
			.valueOf(AppConfig.propertyReader().getProperty("zapi.update.flag"));
	public static final String ZAPI_TESTCYCLEID = AppConfig.propertyReader().getProperty("zapi.testcycleid");
	public static final String ZAPI_USERKEY = AppConfig.propertyReader().getProperty("zapi.userkey");
	public static final String ZAPI_PATTOKEN = AppConfig.propertyReader().getProperty("zapi.bearertoken");
	/************************************Zephyr API(ZAPI) data*******************************************************/
	
	/************************************TestRail Data*******************************************************/
	public static final String TESTRAIL_BASE_URL = prop.getProperty("testrail.baseurl");
	public static final Boolean TESTRAIL_UPDATE_FLAG = Boolean.valueOf(prop.getProperty("testrail.update.flag"));
	public static final String TESTRAIL_RUNID = prop.getProperty("testrail.runid");
	public static final String TESTRAIL_USERNAME = prop.getProperty("testrail.username");
	public static final String TESTRAIL_APIKEY = prop.getProperty("testrail.apikey");
	/************************************TestRail Data*******************************************************/

	// Timeouts
	public static final int PAGE_LOAD_TIMEOUT = Integer.parseInt(prop.getProperty("pageLoad.timeout"));
	public static final int FRAME_LOAD_TIMEOUT = Integer.parseInt(prop.getProperty("frameload.timeout"));
	public static final int POPUP_TIMEOUT = Integer.parseInt(prop.getProperty("popup.timeout"));
	public static final int SCRIPT_TIMEOUT = Integer.parseInt(prop.getProperty("script.timeout"));
	public static final int WAIT_TIMEOUT = Integer.parseInt(prop.getProperty("wait.timeout"));
	public static final int IPP_TIMEOUT = Integer.parseInt(prop.getProperty("IPP.timeout"));

	// Web Services constants
	public static final String SERVICE_BASE_URL_TST181 = prop.getProperty("service.baseurl.tst181");
	public static final String SERVICE_BASE_URL_TST191 = prop.getProperty("service.baseurl.tst191");
	public static final String SERVICE_BASE_URL_QC181 = prop.getProperty("service.baseurl.qc181");
	public static final String SERVICE_BASE_URL_QC191 = prop.getProperty("service.baseurl.qc191");
	public static final String SERVICE_BASE_URL_QC201 = prop.getProperty("service.baseurl.qc201");
	public static final String SERVICE_BASE_URL_TST191_AZ = prop.getProperty("service.baseurl.tst191.az");
	public static final String SERVICE_BASE_URL_TST191_AD = prop.getProperty("service.baseurl.tst191.ad");
	public static final String SERVICE_BASE_URL_TST191_TD = prop.getProperty("service.baseurl.tst191.td");
	public static final String SERVICE_BASE_URL_TST191_TD1 = prop.getProperty("service.baseurl.tst191.td1");

	public static final int SERVICE_PORT_TST181 = Integer.parseInt(prop.getProperty("port.tst181"));
	public static final int SERVICE_PORT_TST191 = Integer.parseInt(prop.getProperty("port.tst191"));
	public static final int SERVICE_PORT_QC181 = Integer.parseInt(prop.getProperty("port.qc181"));
	public static final int SERVICE_PORT_QC191 = Integer.parseInt(prop.getProperty("port.qc191"));
	public static final int SERVICE_PORT_QC201 = Integer.parseInt(prop.getProperty("port.qc201"));
	public static final int SERVICE_PORT_TST191_AZ = Integer.parseInt(prop.getProperty("port.tst191.az"));
	public static final int SERVICE_PORT_TST191_AD = Integer.parseInt(prop.getProperty("port.tst191.ad"));
	public static final int SERVICE_PORT_TST191_TD = Integer.parseInt(prop.getProperty("port.tst191.td"));
	public static final int SERVICE_PORT_TST191_TD1 = Integer.parseInt(prop.getProperty("port.tst191.td1"));

	// Reports path
	public static final String QUERY_FILE_PATH = System.getProperty("user.dir") + "/src/test/resources/DBQueries/";

	// RuntimeProperties
	public static final String RUNTIME_PROPERTY_PATH = System.getProperty("user.dir")
			+ "/src/test/resources/Runtime.properties";

	// set application URl
	public static String getApplicationURL() {
		switch (APPLICATION_ENV.toLowerCase()) {
		case "tst181":
			applicationURL = prop.getProperty("application.url.tst181");
			applicationURLMT01 = prop.getProperty("application.url.tst181.mt01");
			applicationURLMT02 = prop.getProperty("application.url.tst181.mt02");
			break;
		case "qc181":
			applicationURL = prop.getProperty("application.url.qc181");
			applicationURLMT01 = prop.getProperty("application.url.qc181.mt01");
			applicationURLMT02 = prop.getProperty("application.url.qc181.mt02");
			break;
		case "qc191":
			applicationURL = prop.getProperty("application.url.qc191");
			applicationURLMT01 = prop.getProperty("application.url.qc191.mt01");
			applicationURLMT02 = prop.getProperty("application.url.qc191.mt02");
			break;
		case "qc201":
			applicationURL = prop.getProperty("application.url.qc201");
			applicationURLMT01 = prop.getProperty("application.url.qc201.mt01");
			applicationURLMT02 = prop.getProperty("application.url.qc201.mt02");
			break;
		case "jira":
			applicationURL = prop.getProperty("application.url.jira");
			break;
		case "tst191":
			applicationURL = prop.getProperty("application.url.tst191");
			break;
		case "tst191.az":
			applicationURL = prop.getProperty("application.url.tst191.az");
			break;
		case "tst191.ad":
			applicationURL = prop.getProperty("application.url.tst191.ad");
			break;
		case "tst191.td":
			applicationURL = prop.getProperty("application.url.tst191.td");
			break;
		case "tst191.td1":
			applicationURL = prop.getProperty("application.url.tst191.td1");
			break;
		case "tst191.td2":
			applicationURL = prop.getProperty("application.url.tst191.td2");
			break;
		default:
			Assert.fail("Incorrect environment");
			break;
		}
		System.out.println(applicationURL);
		return applicationURL;
	}

	public static String getApplicationURL_MT01() {
		return applicationURLMT01;
	}

	public static String getApplicationURL_MT02() {
		return applicationURLMT02;
	}

	// Set DB properties
	public static final String UNITY_AO_TST181 = prop.getProperty("unity.ao.tst181");
	public static final String UNITY_RT_TST181 = prop.getProperty("unity.rt.tst181");
	public static final String UNITY_AO_TST191 = prop.getProperty("unity.ao.tst191");
	public static final String UNITY_RT_TST191 = prop.getProperty("unity.rt.tst191");
	public static final String UNITY_AO_QC181 = prop.getProperty("unity.ao.qc181");
	public static final String UNITY_RT_QC181 = prop.getProperty("unity.rt.qc181");
	public static final String UNITY_AO_QC191 = prop.getProperty("unity.ao.qc191");
	public static final String UNITY_RT_QC191 = prop.getProperty("unity.rt.qc191");
	public static final String UNITY_AO_QC201 = prop.getProperty("unity.ao.qc201");
	public static final String UNITY_RT_QC201 = prop.getProperty("unity.rt.qc201");
	public static final String UNITY_AO_TST191_AD = prop.getProperty("unity.ao.tst191.ad");
	public static final String UNITY_AO_TST191_TD = prop.getProperty("unity.ao.tst191.td");
}