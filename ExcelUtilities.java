package com.unity.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.format.CellDateFormatter;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;

import com.opencsv.CSVReader;

/**
 * Ths class includes all the required method for excel manipulation
 * 
 * @author e5562312
 */
public class ExcelUtilities {

	private String path = "";
	private Workbook workbook = null;
	private Sheet sheet = null;

	/**
	 * Constructor to initialize class variables
	 * 
	 * @param filePath
	 */
	public ExcelUtilities(String filePath) {
		path = filePath;
		workbook = getWorkbook(filePath);
		sheet = workbook.getSheetAt(0);
	}

	/**
	 * Returns workbook object of excel file
	 * 
	 * @param path
	 *            is location of file in File System
	 * @return object of excel file
	 */
	public Workbook getWorkbook(String path) {
		File file = new File(path);
		if (file.exists()) {
			try {
				FileInputStream input = new FileInputStream(path);
				String extension = FilenameUtils.getExtension(path);
				workbook = extension.equalsIgnoreCase(".xls") ? new HSSFWorkbook(input) : new XSSFWorkbook(input);
				input.close();
			} catch (IOException e) {
				Assert.fail("Workbook not found/loaded");
			}
		} else {
			Assert.fail("File " + path + " does not exists");
		}
		return workbook;
	}

	/**
	 * Returns the Sheet Object for the given SheetName
	 * 
	 * @param sheetName
	 * @return Sheet Object
	 * @throws Exception
	 *             if Sheet is not found in workbook
	 */
	public Sheet getSheet(String sheetName) {
		if (workbook.getSheetName(workbook.getSheetIndex(sheet)).equals(sheetName)) {
			return sheet;
		}
		if (!(sheetName == null || sheetName.isEmpty())) {
			int index = workbook.getSheetIndex(sheetName);
			if (index == -1) {
				Assert.fail("Sheet " + sheetName + " is not found in excel Workbook " + path);
			} else {
				sheet = workbook.getSheetAt(index);
			}
		}
		return sheet;
	}

	/**
	 * Returns cellData for the given sheetName, row and column number
	 * 
	 * @param sheetName
	 * @param rowNum
	 * @param colNum
	 * @return String cellData
	 */
	public String getCellData(String sheetName, int rowNum, int colNum) {

		String celldata = "";
		if (rowNum >= 0 || colNum >= 0) {
			try {
				sheet = getSheet(sheetName);
				Row row = sheet.getRow(rowNum);
				Cell cell = row.getCell(colNum);
				celldata = getCellContentAsString(cell);
			} catch (Exception e) {
				// Do nothing
			}
		}
		return celldata;
	}

	/**
	 * Returns columnCount for the first Row in a given sheet
	 * 
	 * @param sheetName
	 * @return
	 * @throws Exception
	 */
	public int getColumnCount(String sheetName) {
		try {
			sheet = getSheet(sheetName);
			Row row = sheet.getRow(0);
			if (row == null)
				return -1;
			return row.getLastCellNum();
		} catch (Exception e) {
			Assert.fail("", e.getCause());
		}
		return 0;
	}

	/**
	 * Returns rowCount in a given sheet
	 * 
	 * @param sheetName
	 * @return
	 * @throws Exception
	 */
	public int getRowCount(String sheetName) {
		sheet = getSheet(sheetName);
		return sheet.getLastRowNum() + 1;
	}

	/**
	 * Retruns cell data by converting it to String
	 * 
	 * @param cell
	 * @return String cellData
	 */
	private String getCellContentAsString(Cell cell) {

		FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();
		evaluator.evaluateInCell(cell);
		String cellData = "";
		switch (cell.getCellType()) {
		case Cell.CELL_TYPE_BLANK:
			cellData = "";
			break;
		case Cell.CELL_TYPE_STRING:
			cellData = cell.getStringCellValue();
			break;
		case Cell.CELL_TYPE_NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateValue = cell.getDateCellValue();
				String df = cell.getCellStyle().getDataFormatString();
				cellData = new CellDateFormatter(df).format(dateValue);
			} else {
				cellData = NumberToTextConverter.toText(cell.getNumericCellValue());
			}
			break;
		case Cell.CELL_TYPE_FORMULA:
			if (cell.getCachedFormulaResultType() == 0 && DateUtil.isCellDateFormatted(cell)) {
				Date dateValue = cell.getDateCellValue();
				String df = cell.getCellStyle().getDataFormatString();
				cellData = new CellDateFormatter(df).format(dateValue);
			} else {
				cellData = String.valueOf(cell.getNumericCellValue());
			}
			break;
		case Cell.CELL_TYPE_BOOLEAN:
			cellData = String.valueOf(cell.getBooleanCellValue());
			break;
		default:
			break;
		}
		return cellData;
	}

	/**
	 * Returns list of sheet names present in the workbook
	 * 
	 * @return
	 */
	public List<String> getSheetNames() {
		int numberOfSheets = workbook.getNumberOfSheets();
		List<String> sheetNames = new ArrayList<>();
		for (int i = 0; i < numberOfSheets; i++) {
			sheetNames.add(workbook.getSheetName(i));
		}
		return sheetNames;
	}

	/**
	 * Retruns row number of a given testName in the given sheet
	 * 
	 * @param sheetName
	 * @param testName
	 * @return rowNumber of given test name in sheet
	 * @throws Exception
	 */
	public int findRow(String sheetName, String testName) {
		int rowCount = getRowCount(sheetName);
		int rowNum = 0;
		for (rowNum = 0; rowNum <= rowCount; rowNum++) {
			String testNameInExcel = getCellData(sheetName, rowNum, 0);
			if (testNameInExcel.equalsIgnoreCase(testName)) {
				return rowNum;
			}
		}
		return -1;
	}

	public boolean isExcelEmpty() {
		int numberOfRows = sheet.getLastRowNum() + 1;
		return numberOfRows < 2;
	}

	/**
	 * To read unity reports as map
	 * 
	 * @return - A collection of excel report data with column name as key and
	 *         column fields as values
	 */
	public Map<String, List<String>> readExcelReportAsMap() {
		Map<String, List<String>> excelValuesMap = new HashMap<>();
		int rowCount = sheet.getLastRowNum();
		if (Objects.isNull(sheet.getRow(1))) {
			Assert.fail("No data is present in the downloaded excel");
		}
		int columnCount = sheet.getRow(1).getLastCellNum();
		String cellData = "";
		String key = null;
		List<String> values = new ArrayList<>();

		for (int col = 0; col < columnCount; col++) {
			for (int row = 0; row <= rowCount; row++) {
				cellData = getCellData(sheet.getSheetName(), row, col);
				if (row == 0)
					key = cellData;
				else {
					if (cellData.contains(".00"))
						cellData = cellData.replace(".00", "");
					if (cellData.contains(".0"))
						cellData = cellData.replace(".0", "");
					values.add(row - 1, cellData);
				}
			}
			excelValuesMap.put(key, values);
			values = new ArrayList<>();
		}
		return excelValuesMap;
	}

	/**
	 * To write any changes made in the excel workbook object
	 */
	public void writeWorkbook() {
		try (FileOutputStream outputStream = new FileOutputStream(path)) {
			workbook.write(outputStream);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * To write the execution report in a separate excel file. The excel contains
	 * list of all the executed scenarios in the current run against their status
	 * 
	 * @param results
	 *            - Accepts results map where scenario name is key and its status is
	 *            value
	 */
	public void writeResultsToExcelReport(Map<String, String> results) {
		int rowNum = 1;
		for (Entry<String, String> entry : results.entrySet()) {
			Row row = sheet.createRow(rowNum);
			Cell cell = row.createCell(0);
			cell.setCellValue(entry.getKey());
			cell = row.createCell(1);
			cell.setCellValue(entry.getValue());
			rowNum++;
		}
		writeWorkbook();
	}
	
	/**
	 * To write the execution report in a separate excel file. The excel contains
	 * list of all the executed scenarios in the current run against their status
	 * 
	 * @param results
	 *            - Accepts results map where scenario name is key and its status is
	 *            value
	 */
	public void writeResultsToExcelReportMultiValue(Map<String, List<String> > results) {
		int rowNum = 1;
		sheet = getSheet("Result");
		for (Entry<String, List<String> > entry : results.entrySet()) {
			Row row = sheet.createRow(rowNum);
			Cell cell = row.createCell(0);
			cell.setCellValue(entry.getKey());
			for(int i=0;i<entry.getValue().size();i++) {
				cell = row.createCell(i+1);
				if(entry.getValue().get(i).isEmpty()) {
					cell.setCellValue("Failed");
				}else {
					cell.setCellValue(entry.getValue().get(i));	
				}
			}
			rowNum++;
			
		}
		writeWorkbook();
	}

	/**
	 * To delete all rows in a given sheet, except header row
	 */
	public void deleteAllRowsExceptHeader() {
		int rowCount = getRowCount(sheet.getSheetName());
		for (int i = 1; i < rowCount; i++) {
			sheet.removeRow(sheet.getRow(i));
		}
		writeWorkbook();
	}
	
	public static String convertCsvToXls(String xlsFileLocation, String csvFilePath, String fileName) {
		//final char FILE_DELIMITER = ',';
	    String FILE_EXTN = ".xlsx";
	    String FILE_NAME = fileName;
        SXSSFSheet sheet = null;
        CSVReader reader = null;
        Workbook workBook = null;
        String generatedXlsFilePath = "";
        FileOutputStream fileOutputStream = null;
 
        try {
 
            /**** Get the CSVReader Instance & Specify The Delimiter To Be Used ****/
            String[] nextLine;
            reader = new CSVReader(new FileReader(csvFilePath));
 
            workBook = new SXSSFWorkbook();
            sheet = (SXSSFSheet) workBook.createSheet("Sheet");
 
            int rowNum = 0;
            System.out.println("Creating New .Xls File From The Already Generated .Csv File");
            while((nextLine = reader.readNext()) != null) {
                Row currentRow = sheet.createRow(rowNum++);
                for(int i=0; i < nextLine.length; i++) {
                    if(NumberUtils.isDigits(nextLine[i])) {
                        currentRow.createCell(i).setCellValue(Integer.parseInt(nextLine[i]));
                    } else if (NumberUtils.isNumber(nextLine[i])) {
                        currentRow.createCell(i).setCellValue(Double.parseDouble(nextLine[i]));
                    } else {
                        currentRow.createCell(i).setCellValue(nextLine[i]);
                    }
                }
            }
 
            generatedXlsFilePath = xlsFileLocation + FILE_NAME + FILE_EXTN;
            System.out.println("The File Is Generated At The Following Location?= " + generatedXlsFilePath);
//            logger.info("The File Is Generated At The Following Location?= " + generatedXlsFilePath);
 
            fileOutputStream = new FileOutputStream(generatedXlsFilePath.trim());
            workBook.write(fileOutputStream);
        } catch(Exception exObj) {
            System.out.println("Exception In convertCsvToXls() Method?=  " + exObj);
        } finally {         
            try {
 
                /**** Closing The Excel Workbook Object ****/
//            	SXSSFWorkbook
//                ((SXSSFWorkbook) workBook).close();
 
                /**** Closing The File-Writer Object ****/
                fileOutputStream.close();
 
                /**** Closing The CSV File-ReaderObject ****/
                reader.close();
            } catch (IOException ioExObj) {
                System.out.println("Exception While Closing I/O Objects In convertCsvToXls() Method?=  " + ioExObj);          
            }
        }
 
        return generatedXlsFilePath;
    }   
}
