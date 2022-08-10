package com.TestCases;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pages.StaleElementHandle;
import com.Utility.BrowserFactory;

public class TestCase_HandleStaleElement {
	
	WebDriver driver;
	
	
	
	@BeforeMethod
	public void browserIntialization() throws MalformedURLException {
	driver = BrowserFactory.startApplication(driver, "Chrome","https://courses.letskodeit.com/practice");
	}
	
	
	
	
	@Test
	public void HandleStaleElementExcptn_TestCase() throws InterruptedException {
		StaleElementHandle SH = PageFactory.initElements(driver, StaleElementHandle.class);
		//SH.StaleElementWillBeThrown();
		SH.StaleElementHandled();
	}
	

	@AfterMethod
	public void browserSetUpClosure() {
		BrowserFactory.closeApplication(driver);
	}
	
	

}
