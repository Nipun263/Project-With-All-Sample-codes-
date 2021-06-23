package LoginSuite;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelDataReading {

	@Test
	public static void readDataFromExcel() throws IOException {
		  String excelPath = System.getProperty("user.dir");
		  
		  
		  XSSFWorkbook WB = new XSSFWorkbook(excelPath + "\\ExcelData\\ExcelData.xlsx");
		  
		  XSSFSheet WS = WB.getSheet("DummyAutomation"); 
		  XSSFRow WR = WS.getRow(0);
		  
		  String column1Data = WR.getCell(0).toString(); 
		  String column2Data = WR.getCell(1).toString();
		  String column3Data = WR.getCell(2).toString();
		  String column4Data = WR.getCell(3).toString();
		 

	}
	
}
