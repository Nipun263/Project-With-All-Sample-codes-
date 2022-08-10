package com.TestCases;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.Pages.*;

import com.Utility.BrowserFactory;

public class TestCase_HandleTabs {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void BrowserIntialise() throws MalformedURLException {
		
		driver = BrowserFactory.startApplication(driver, "chrome", "https://zoom.us/download");
		
	}
	
	@Test
	public void TestCase_Tab_Handling() {
		
		CloseTabsOneByOne COO =	PageFactory.initElements(driver, CloseTabsOneByOne.class);
		COO.Handle_Tabs();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
