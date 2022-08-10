package com.Utility;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadingUtility {
	
	
	public static String[][] readExcelSheet(String ExcelName , String SheetName) throws IOException {
		String file = System.getProperty("user.dir");
		
		String excelSheet = file + "\\" + ExcelName;
		
		XSSFWorkbook WB = new XSSFWorkbook(excelSheet);
		
		XSSFSheet sheet = WB.getSheet(SheetName);
		
		int row_count = sheet.getLastRowNum();
		
		//********************************************************************************************
		//Notes : TO get the data from excel - how many rows/cells are there below steps are done 
		//Post doing the steps - Data is passed to String[][] 
		//********************************************************************************************
		
		int lastRow = sheet.getLastRowNum();
		int lastcell = sheet.getRow(0).getLastCellNum();
		
		
		String[][] data = new String[lastRow][lastcell];
		
		for (int i = 0 ; i < row_count ; i ++) {
			XSSFRow roww = sheet.getRow(i);
			
		//********************************************************************************************	
		//System.out.print("********New Row with Row # " + "  "  +sheet.getRow(i).getRowNum());
		//********************************************************************************************
			
			System.out.println();
			
			int cell_count = roww.getLastCellNum();
			
				for (int j = 0 ; j <cell_count ; j ++ ) {
					String cell_Data = roww.getCell(j).toString();
				
					
		//********************************************************************************************
		//Notes : Above mentioned String[][] data is now getting the value of the cell 
		//********************************************************************************************	
					
					data[i][j]=cell_Data;
				
					System.out.print(data[i][j] + "  ");
	
			}
				System.out.println();
				}
		
	
		return data;
	
	
	}
	

}
