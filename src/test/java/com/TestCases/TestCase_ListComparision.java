package com.TestCases;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Pages.ListComparision;
import com.Utility.BrowserFactory;

public class TestCase_ListComparision {
	
	public WebDriver driver ;
	
	@BeforeTest
	public void IntialiseBrowser() throws MalformedURLException {
	driver = 	BrowserFactory.startApplication(driver, "chrome", "http://babynames.merschat.com/");
	}


	
	@Test
	public void TestCase_CompareList() {
		ListComparision LC = 	PageFactory.initElements(driver, ListComparision.class);
		LC.compareTheTwoListElementsAndVerifyDDOptionsIsSorted();
	}
	
	
	
	@AfterTest
	public void CloseBrowser() throws MalformedURLException {
	driver = 	BrowserFactory.closeApplication(driver);
	}

}
