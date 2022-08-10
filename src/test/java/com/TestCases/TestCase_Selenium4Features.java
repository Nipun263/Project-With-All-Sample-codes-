package com.TestCases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Pages.Selenium4Features;
import com.Utility.BrowserFactory;

public class TestCase_Selenium4Features {
	
	WebDriver driver ;
	
	@BeforeTest
	public void BrowserIntialization() throws MalformedURLException {
	driver = BrowserFactory.startApplication(driver,"chrome" ,"https://automationbookstore.dev/");
	
	}
	
	
	//@Test(priority=1)
	public void TestCase_Selenium4FeaturesImplementation() {
		Selenium4Features SF = 	PageFactory.initElements(driver, Selenium4Features.class);
		SF.RelativeLocators();
	}
	
	
	

	//@Test(priority=2)
	public void TestCase_Selenium4Feature_SwitchingTab() {
		Selenium4Features SF = 	PageFactory.initElements(driver, Selenium4Features.class);
		SF.SwitchTab();
	}
	
	
	
	//@Test(priority=3)
	public void TestCase_Selenium4Feature_TakeScreenOfCompleteScreen() throws IOException {
		Selenium4Features SF = 	PageFactory.initElements(driver, Selenium4Features.class);
		SF.CaptureSSOfCompletePage();
	}
	
	
	@Test(priority=4)
	public void TestCase_Selenium4Feature_TakeScreenOfElement() throws IOException {
		Selenium4Features SF = 	PageFactory.initElements(driver, Selenium4Features.class);
		SF.CaptureSSOfElement();
	}


	
	
	@AfterTest
	public void tearDownApplication() {
		BrowserFactory.closeApplication(driver);
	}

}
