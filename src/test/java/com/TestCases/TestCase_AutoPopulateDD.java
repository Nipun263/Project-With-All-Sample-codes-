package com.TestCases;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Pages.AutoPopulateDD;
import com.Utility.BrowserFactory;

public class TestCase_AutoPopulateDD {

	public WebDriver driver ;
	
	@BeforeTest
	public void HitURL() throws MalformedURLException {
		
		//driver = BrowserFactory.startApplication(driver,"Chrome", "https://www.makemytrip.com/");
		driver = BrowserFactory.startApplication(driver,"Chrome", "https://demoqa.com/select-menu");
	}
	
	
	
	@Test(priority=1)
	public void SelectCity() {
		AutoPopulateDD ADD =	PageFactory.initElements(driver, AutoPopulateDD.class);
		//ADD.sourceCity("Goa, India");
		ADD.startSelectingValuesFromSecond();
	}
	
	
	
	
	@AfterTest
	public void CloseApplication() throws MalformedURLException {
		
		driver = BrowserFactory.closeApplication(driver);
		
	}
	
}
