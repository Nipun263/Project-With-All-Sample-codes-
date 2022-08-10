package com.TestCases;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Pages.CloseSpecificWindow;
import com.Utility.BrowserFactory;

public class TestCase_CloseDesiredWindow {
	
	public static WebDriver driver ;
	
	
	@BeforeTest
	public void intialiseBrowser() throws MalformedURLException {
	//driver = 	BrowserFactory.startApplication(driver, "Chrome", "https://secure.indeed.com/account/login");	
	driver = 	BrowserFactory.startApplication(driver, "Chrome", "https://google.com");
	
}
	
	
	@Test
	public void TestCase_CloseDesiredWindow() {
	 CloseSpecificWindow CW =	PageFactory.initElements(driver, CloseSpecificWindow.class);
	 System.out.print("Factory_Method_1 :: Class 1 ");
	// CW.closeDesiredWindow();
	}
	
	@Test
	public void Factory_M1() {
		System.out.print("Factory_Method_2 :: Class 1 ");
	}
	
	
	@AfterTest
	public void closeApplication() {
		BrowserFactory.closeApplication(driver);
	}
	

}
