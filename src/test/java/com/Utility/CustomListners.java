package com.Utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListners implements  ITestListener {
	
	public static WebDriver driver;



	public void onTestFailure(ITestResult result) {
		System.out.println("Failed Test Case!!!!");
		
		try {
			BrowserFactory.takeScreenShot(driver);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}

}
