package com.unity.utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.testng.Assert;

import com.unity.constants.AppConstants;

public class FileUtils {
	private FileUtils() {
		throw new IllegalStateException("Utility Class");
	}

	public static String readFileAsString(String filePath) {

		File file = new File(System.getProperty("user.dir") + "/src/test/resources/DBQueries/" + filePath);
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line = null;
			StringBuilder sb = new StringBuilder();
			while ((line = br.readLine()) != null) {
				sb.append(line + " ");
			}
			return new String(sb);
		} catch (Exception e) {
			Assert.fail(e.getLocalizedMessage());
			return null;
		}
	}

	/**
	 * This method reads SQL query from the given text file and returns it as
	 * String to be used by DBUtils class
	 * 
	 * @param queryFileName
	 *            - name of the query file with extension '.txt'
	 * @return
	 */
	public static String readQueryFileAsString(String queryFileName) {
		File file = new File(AppConstants.QUERY_FILE_PATH + queryFileName);
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {

			String line = null;
			StringBuilder sb = new StringBuilder();
			while ((line = br.readLine()) != null) {
				sb.append(line + " ");
			}
			return new String(sb);
		} catch (Exception e) {
			Assert.fail(e.getLocalizedMessage());
			return null;
		}
	}

	/**
	 * Format given parameterized query with the given date range
	 * 
	 * @param query
	 * @return
	 */
	// Under development
	public String formatQuery(String query, String dateRange) {
		switch (dateRange) {
		case "last12months":
			query = query.replace("DD1-MMM1-YY1", "");
			query = query.replace("DD1-MMM2-YY2", "");
			break;
		case "last6months":
			query = query.replace("DD1-MMM1-YY1", "");
			break;

		default:
			Assert.fail("!! Invalid Date Range !! : " + dateRange);
			break;
		}
		if (query.contains("DD1-MMM1-YY1")) {
			query = query.replace("DD1-MMM1-YY1", "");
			query = query.replace("DD1-MMM2-YY2", "");
		}
		return query;
	}
}
