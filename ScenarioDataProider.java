package com.unity.utilities;

import java.util.Map;

import org.testng.Assert;

import com.unity.constants.AppConstants;

public class ScenarioDataProider {

	private ScenarioDataProider() {
		throw new IllegalStateException("Utility Class");
	}

	public static Map<String, String> getData(String scenarioName) {
		ExcelUtilities excelUtils = null;
		try {
			switch (AppConstants.APPLICATION_ENV.toLowerCase()) {
			case "tst181":
				excelUtils = new ExcelUtilities(AppConstants.USER_DIRECTORY + "/test-data/UnityTestData_TST_181.xlsx");
				break;
			case "jira":
				excelUtils = new ExcelUtilities(AppConstants.USER_DIRECTORY + "/test-data/UnityTestData_Jira.xlsx");
				break;
			case "tst191":
				excelUtils = new ExcelUtilities(AppConstants.USER_DIRECTORY + "/test-data/UnityTestData_TST_191.xlsx");
				break;
			case "qc181":
			case "qc191":
			case "qc201":
				excelUtils = new ExcelUtilities(AppConstants.USER_DIRECTORY + "/test-data/UnityTestData_QC.xlsx");
				break;
			case "tst191.az":
				excelUtils = new ExcelUtilities(
						AppConstants.USER_DIRECTORY + "/test-data/UnityTestData_TST191_AZ.xlsx");
				break;
			case "tst191.ad":
				excelUtils = new ExcelUtilities(
						AppConstants.USER_DIRECTORY + "/test-data/UnityTestData_TST_191_AD.xlsx");
				break;
			case "tst191.td":
			case "tst191.td1":
			case "tst191.td2":
				excelUtils = new ExcelUtilities(
						AppConstants.USER_DIRECTORY + "/test-data/UnityTestData_TST_191_TD_Azure.xlsx");
				break;
			case "uat":
			excelUtils = new ExcelUtilities(
					AppConstants.USER_DIRECTORY + "/test-data/UnityTestData_UAT.xlsx");
			break;
			case "sanity":
				excelUtils = new ExcelUtilities(
						AppConstants.USER_DIRECTORY + "/test-data/UnityTestData_Forms_Sanity.xlsx");
				break;
			default:
				Assert.fail("*****Enviroment is not properly set*****");
				break;
			}
			return UnityUtils.getData(scenarioName, excelUtils);
		} catch (Exception e) {
			Assert.fail(e.getLocalizedMessage());
			return null;
		}
	}
}
