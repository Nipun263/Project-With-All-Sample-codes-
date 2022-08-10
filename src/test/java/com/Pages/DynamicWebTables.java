package com.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class DynamicWebTables {

	public static WebDriver driver;

	public DynamicWebTables(WebDriver driver) {
		this.driver = driver;
	}
	
	
		@FindAll({
		@FindBy(xpath="//*[@class='dataTable']//tr"),
		@FindBy(xpath="//*[@class='dataTable']//tr")})
		List<WebElement> Rows;
	

		@FindAll({
		@FindBy(xpath="//*[@class='dataTable']//th"),
		@FindBy(xpath="//*[@class='dataTable']//th")})
		List<WebElement> Columns;
	
		
		@FindAll({
		@FindBy(xpath="//*[@class='dataTable']//tr//a"),
		@FindBy(xpath="//*[@class='dataTable']//tr//a")})
		List<WebElement> CompanyName;
		
		
		@FindAll({
		@FindBy(xpath="//*[@class='dataTable']//tr//td[3]"),
		@FindBy(xpath="//*[@class='dataTable']//tr//td[3]")})
		List<WebElement> PrevClose;
		
		
		public void DynamicTable2(String DesiredCompanyName) {
				
			for(WebElement WB : CompanyName) {
				
				String Company_Name = WB.getText();
				//
				
				if(Company_Name.equalsIgnoreCase(DesiredCompanyName)) {
				
				WebElement PriceTag = driver.findElement(By.xpath("//*[@id='leftcontainer']//a[contains(text(),'"+DesiredCompanyName+"')]//following::td[2]"));
					
				String pricee = PriceTag.getText();
				
				System.out.println(Company_Name + "   " + pricee);
					
					
					break;
				}
			
			}
		}
		





		public void handleDynamicTable() {

		for(int i =0;i<CompanyName.size();i++) {
			
			String CompanyNameExtracted = CompanyName.get(i).getText();
			
			if(CompanyNameExtracted.trim().equalsIgnoreCase("Escorts Ltd.")) {
				
				String PrevCloseExtracted  = PrevClose.get(i).getText();
				
				System.out.println( CompanyNameExtracted + "has a Prev Close = "  +    PrevCloseExtracted);
				
				break;
			}
		}
		
		
		List<WebElement> row = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));

		int row_Count = row.size();

		List<WebElement> column = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody//td"));

		int column_Count = column.size();

		/*// Get the Last Row Data
		for (int i = 0; i < row_Count; i++) {

			if (i == (row_Count) - 1) {
				String Row_Data = row.get(i).getText();
				System.out.println("Last Row Data is ::" + Row_Data);

				// Get Cell Data of the Selected Row

				for (int j = 0; j < column_Count; j++) {
					
					String Column_Data = column.get(j).getText();
					
					
					if (Row_Data.contains(Column_Data)) {
					System.out.println("Last Column  Data is ::" + Column_Data);
					
					continue;
				}
				
				
				}*/

		}}
		
