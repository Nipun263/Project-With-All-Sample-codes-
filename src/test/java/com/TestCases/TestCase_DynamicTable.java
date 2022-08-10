package com.TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Pages.ColorChange;
import com.Pages.DynamicWebTables;
import com.Utility.BrowserFactory;

public class TestCase_DynamicTable {
	
	public static WebDriver driver;
	
	
	@BeforeTest
	public void browserIntialization() throws IOException, InterruptedException {
	driver = BrowserFactory.startApplication(driver, "Chrome", "http://demo.guru99.com/test/web-table-element.php");
	//driver=BrowserFactory.startApplication(driver, "chrome", "https://money.rediff.com/gainers/bse/daily/groupa");
	}
	
	
	
	@Test
	public void TestCase_HandleDynamicWebTables() {
		DynamicWebTables DW = 	PageFactory.initElements(driver, DynamicWebTables.class);
		DW.handleDynamicTable();
		//DW.DynamicTable2("Guj. Mineral Dev");
	}
	
	


	

}
