package com.TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.Utility.BrowserFactory;

public class TestCase_FactoryImplementation {
	
	public WebDriver driver ;
	
	
	@BeforeTest
	public void browserIntialization() throws IOException, InterruptedException {
		driver = BrowserFactory.startApplication(driver, "Chrome", "https://www.google.com");
	}
	
	@Test
	@Factory
	public Object[] FactoryTestMethod() {
		
		Object[] Obj = new Object[2];
		Obj[0] = new TestCase_CloseDesiredWindow();
		Obj[1] = new TestCase_ColorChange();
		
		return Obj;
		
	}


}
