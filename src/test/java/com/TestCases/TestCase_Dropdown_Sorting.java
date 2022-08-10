package com.TestCases;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Pages.DropDownSortedFunc;
import com.Utility.BrowserFactory;

public class TestCase_Dropdown_Sorting {
	
	public static WebDriver driver ;
	
	@BeforeTest
	public void BrowserIntialization() throws MalformedURLException {
	driver = BrowserFactory.startApplication(driver, "Chrome", "https://testautomationpractice.blogspot.com/");
		
	}
	
	@Test
	public void verifySortingFunc() {
		DropDownSortedFunc DD = 	PageFactory.initElements(driver,DropDownSortedFunc.class);
		DD.SortFuncVerify();
	}

}
