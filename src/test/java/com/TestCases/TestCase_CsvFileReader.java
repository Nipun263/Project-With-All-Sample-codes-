package com.TestCases;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.Pages.CsvFileReader;
import com.Utility.BrowserFactory;
import com.opencsv.exceptions.CsvValidationException;

public class TestCase_CsvFileReader {

	
	WebDriver driver ;
	
	@BeforeTest
	public void browserIntialization() throws MalformedURLException {
	driver = 	BrowserFactory.startApplication(driver, "chrome", "https://google.com");
	}
	
	
	@Test
	public void csvReader() throws CsvValidationException, IOException {
		CsvFileReader CF = 	PageFactory.initElements(driver, CsvFileReader.class);
		CF.readCSVFileCode();
		CF.textFileRead();
	}
	
	
	

	@AfterTest
	public void tearDown() {
	BrowserFactory.closeApplication(driver);
	}
	
	
}
