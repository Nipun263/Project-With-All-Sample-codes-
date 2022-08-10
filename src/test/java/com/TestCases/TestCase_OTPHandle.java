package com.TestCases;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Pages.OTPHandle;
import com.Utility.BrowserFactory;

public class TestCase_OTPHandle {
	
	public static WebDriver driver ;
	
	@BeforeTest
	public void BrowserIntialization() throws MalformedURLException {
	driver =	BrowserFactory.startApplication(driver, "chrome","https://www.amazon.in/");
	}
	
	
	@Test
	public void TestCase_HandleOTP_Login() throws Throwable {
		OTPHandle OTT = 	PageFactory.initElements(driver, OTPHandle.class);
		
		OTT.Login();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
