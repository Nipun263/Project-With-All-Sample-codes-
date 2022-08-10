package com.TestCases;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Pages.StopWatch;
import com.Utility.BrowserFactory;

public class TestCase_StopWatch {
	
	public static WebDriver driver;
	
	
	@BeforeTest
	public void BrowserIntialization() throws MalformedURLException {
		
	driver = BrowserFactory.startApplication(driver, "Chrome", "https://www.google.com");
		
	}
	
	
	@Test
	public void TestCase_StopWatch_Readings() throws InterruptedException {
		StopWatch SD =	PageFactory.initElements(driver, StopWatch.class);
		SD.StopWatch_Data();
	}
	
	
	
	

}
