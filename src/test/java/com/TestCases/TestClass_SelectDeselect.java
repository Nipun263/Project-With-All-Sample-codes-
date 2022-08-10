package com.TestCases;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Pages.HandleMultipleDD;
import com.Utility.BrowserFactory;

public class TestClass_SelectDeselect {
	
	
	public static WebDriver driver;
	
	@BeforeTest
	public void browserIntialization() throws MalformedURLException {
		
	driver = BrowserFactory.startApplication(driver, "chrome", "https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
	
	
	}
	
	
	@Test
	public void testCase_SelectDeselect() {
		HandleMultipleDD SDD = 	PageFactory.initElements(driver, HandleMultipleDD.class);
		SDD.handleMultipleDDoptions("Manual Testing" ,"Agile Methodology" ,"Manual Testing");
	}
	
	
	@AfterTest
	public void tearDown() {
		
	driver = BrowserFactory.closeApplication(driver);
	
	}

}
