package com.Pages;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;


public class ParameterizationUsingExcel {
	
	
	public static WebDriver driver ;
	
	
	public ParameterizationUsingExcel(WebDriver driver) {
		this.driver=driver;
	}
	
		@FindBy(id ="Email")
		WebElement Email ;
		
			
		
		@FindBy(id ="Password")
		WebElement Password ;
		
		
		public  void readExcelPassCredentials(String ExcelName , String SheetName ) throws IOException {
			
			String file = System.getProperty("user.dir");
			
			String excelSheet = file + "\\" + ExcelName;
			
			XSSFWorkbook WB = new XSSFWorkbook(excelSheet);
			
			XSSFSheet sheet = WB.getSheet(SheetName);
			
				HashMap<Object,Object> HSS = new LinkedHashMap<Object,Object>();
			
			int row_count = sheet.getLastRowNum();
			
			int cell_Count = sheet.getRow(0).getPhysicalNumberOfCells();
			
			
			for(int i=1;i<row_count;i++) {
				
				
				
				String UserNameToPass = sheet.getRow(i).getCell(0).toString();
				
				String PasswordToPass = sheet.getRow(i).getCell(1).toString();
				
				
				Email.clear();
				Email.sendKeys(UserNameToPass);
				
				
				Password.clear();
				Password.sendKeys(PasswordToPass);
				
				
				driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
				
			
			}
			
		
			
		}
		
		
	

		
		public void PassCredentailsDataProvidr(String UserName , String Pass) {
			
			Email.sendKeys(UserName);
			
			
			Password.sendKeys(Pass);
			
		}
		
	
}
