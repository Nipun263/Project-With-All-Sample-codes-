package com.TestCases;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Pages.TextFileReader;
import com.Utility.BrowserFactory;
import com.opencsv.exceptions.CsvValidationException;

public class TestCase_TextFileReader {
	
	WebDriver driver ;
	
	@BeforeSuite
	public void startApplication() throws MalformedURLException {
	driver = BrowserFactory.startApplication(driver, "Chrome", "https://www.google.com");
		
	}

	
	@Test
	public void readTextFile() throws IOException, CsvValidationException, InvalidFormatException {
		TextFileReader TR =	PageFactory.initElements(driver, TextFileReader.class);
		//TR.readTextFile();
		//TR.readCSVFile();
		TR.excelFileRead();
		
	}
	
	
	
	
	@AfterSuite
	public void tearDown() {
		BrowserFactory.closeApplication(driver);	
	}


}
