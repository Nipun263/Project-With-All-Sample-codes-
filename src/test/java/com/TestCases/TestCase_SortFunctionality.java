package com.TestCases;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Pages.VerifyDropdownSortFunc;
import com.Utility.BrowserFactory;

public class TestCase_SortFunctionality {
	
	public static WebDriver driver ;
	
	
	@BeforeTest
	public void BrowserIntialization() throws MalformedURLException {
	
	driver = BrowserFactory.startApplication(driver, "Chrome","https://www.twoplugs.com/newsearchserviceneed");

	}
	

	@Test
	public void TestCase_Sorting() {
		
		VerifyDropdownSortFunc VS =	PageFactory.initElements(driver,VerifyDropdownSortFunc.class);
		VS.verifyDDSorting();
		
	}
	
	
	
	
	
	
	
	
	
	
}