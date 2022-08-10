package com.Pages;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell; 
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class HashMapWithExcel {

	WebDriver driver;

	public void readExcelData(String SheetNameToPass) throws IOException {

		String file = System.getProperty("user.dir") + "\\Sample Excel.xlsx";

		XSSFWorkbook WB = new XSSFWorkbook(file);

		XSSFSheet sheet = WB.getSheet(SheetNameToPass);

		int row_Count = sheet.getLastRowNum();

		for (int i = 0; i <= row_Count; i++) {
			XSSFRow row = sheet.getRow(i);

			
			int cell_Count = row.getLastCellNum();

			for (int j = 0; j < cell_Count; j++) {
				XSSFCell cell = sheet.getRow(i).getCell(j);
				String cellData = cell.toString();
				System.out.print(cellData + " ");
			}
			System.out.println();
		}

	}
	

	public void readExcelDataWithHashMap(String SheetNameToPass) throws IOException, InvalidFormatException {

		String filee = System.getProperty("user.dir") + "\\Sample Excel.xlsx";
		
		File file = new File(filee);
		
		XSSFWorkbook WB = new XSSFWorkbook(file);
		
		XSSFSheet sheet = WB.getSheet(SheetNameToPass);
		
		int rowCount = sheet.getLastRowNum();
		
		for (int i = 1 ; i <= rowCount ; i ++) {
			XSSFRow row = sheet.getRow(i);
			
			int cellCount = row.getLastCellNum();
			
				for ( int j = 0 ; j < cellCount ; j ++) {	
						XSSFCell cell = sheet.getRow(i).getCell(j);
						
						
			HashMap<String , String > HSS = new HashMap<String , String>();
						
			String keyValue = (sheet.getRow(i).getCell(0)).toString();
			System.out.println("Key Passed :::" +      keyValue + " " );
			
			String Value = (sheet.getRow(i).getCell(1)).toString();
			System.out.println("Value Extracted :::" + Value   + " ");
			
			break;
								
				}
				
		}
		
	}
	

	public static void main(String[] args) throws IOException, InvalidFormatException {
		HashMapWithExcel HSS = new HashMapWithExcel();
		//HSS.readExcelData("Data43");
		HSS.readExcelDataWithHashMap("HashMap");
	}
}
