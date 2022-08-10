package com.TestCases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Pages.HashMapWithExcel;
import com.Utility.BrowserFactory;
import com.opencsv.exceptions.CsvValidationException;

public class TestCase_HashMapWithExcel {
	
	WebDriver driver ;
	
	@BeforeTest
	public void intialseBrowser() throws MalformedURLException {
	driver = 	BrowserFactory.startApplication(driver,"chrome", "https://www.google.com");
		
	}

	
	@Test
	public void excelWithHashMapImplementation_TC() throws InvalidFormatException, IOException, CsvValidationException {
		HashMapWithExcel HME =	PageFactory.initElements(driver, HashMapWithExcel.class);
		//HME.readExcelData("HashMap");
		//HME.readCSVData();
		HME.readExcelDataWithHashMap(null);
		
	}
	
	

	@AfterTest
	public void tearDown() {
	driver = BrowserFactory.closeApplication(driver);
		
	}
}
