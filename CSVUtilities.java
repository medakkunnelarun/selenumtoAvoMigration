package com.unity.utilities;

import java.io.File;
import java.io.FileReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opencsv.CSVReader;

public class CSVUtilities {

	private File file = null;
	private Map<String, List<String>> csvDataMap = null;

	public CSVUtilities(String csvFilePath) {
		file = new File(csvFilePath);
		csvDataMap = new HashMap<>();
	}

	/**
	 * Returns an object of map in the form Map<String, List<String>> with CSV
	 * headers as key and corresponding data as values list mapped to keys.
	 * 
	 * @param exportedCSVFilePath
	 * @return CSV data as map
	 * 
	 * @author e5562312
	 */
	public Map<String, List<String>> readCsvFileAsMap() {
		List<String> mapKeys = new ArrayList<>();
		List<String> rowValues = new ArrayList<>();
		try {
			FileReader fileReader = new FileReader(file);
			try (CSVReader csvReader = new CSVReader(fileReader)) {
				String[] rowData;
				int rowIndex = 1;
				int nameColumn = 0;
				int colID =0;
				while ((rowData = csvReader.readNext()) != null) {
					for (String cellData : rowData) {
						colID=colID+1;
						//System.out.println(cellData.trim());
						//cellData = formatCsvCellData(cellData.trim());						
						if (rowIndex == 1) {
							if(cellData.contains("Name")) {
								nameColumn=colID;
							}
							mapKeys.add(formatCsvCellData(cellData));
						} else {
							if(colID==nameColumn) {
								rowValues.add(cellData.trim());
							}else {
								rowValues.add(formatCsvCellData(cellData));
							}
						}
					}
					colID=0;
					putRowValuesInCSVMap(mapKeys, rowValues);
					rowValues = new ArrayList<>();
					rowIndex++;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			// Assert.fail(e.getLocalizedMessage());
		}
		//Removing unwanted key
		if(csvDataMap.containsKey("Group By"))
			csvDataMap.remove("Group By");
		return csvDataMap;
	}

	private void putRowValuesInCSVMap(List<String> mapKeys, List<String> rowValues) {
		List<String> tempList = new ArrayList<>();
		if (!rowValues.isEmpty()) {
			for (int i = 0; i < mapKeys.size(); i++) {
				if (csvDataMap.get(mapKeys.get(i)) != null) {
					tempList = csvDataMap.get(mapKeys.get(i));
				}
				tempList.add(rowValues.get(i));
				csvDataMap.put(mapKeys.get(i), tempList);
				tempList = new ArrayList<>();
			}
		}
	}

	private String formatCsvCellData(String cellData) {
		if (!(cellData.contains("Name"))) {
		if (cellData.contains("\n"))
			cellData = cellData.substring(cellData.lastIndexOf('\n') + 1);
		if (cellData.contains("\'"))
			cellData = cellData.substring(cellData.lastIndexOf('\'') + 1);
		if (cellData.contains("ï»¿\""))
			cellData = cellData.replace("ï»¿\"", "");
		if (cellData.equals("Account/ I d number"))
			cellData = cellData.replaceAll("Account/ I d number", "Account/id number");
		
		if (cellData.contains("\""))
			cellData = cellData.replace("\"", "");
		if (cellData.contains(","))
			cellData = cellData.replaceAll(",", "");
		if (cellData.contains(".")) {
			try {
				BigDecimal decimal = new BigDecimal(cellData).stripTrailingZeros();
				if(decimal.scale() > 2 ||decimal.scale() < 2)
				{
					System.out.println("in decimal 2 places");
					decimal = decimal.setScale(2, RoundingMode.HALF_UP);
				}
//				value = decimal.toPlainString();
				cellData = decimal.toPlainString();
			} catch (NumberFormatException e) {
				// Do nothing if cellData is not a valid number
			}
			if (cellData.contains(".00"))
				cellData = cellData.replace(".00", "");
		}
		}
		return cellData;
	}
}
