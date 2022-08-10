package com.TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Pages.HashMapImplementation;
import com.Utility.BrowserFactory;

public class TestCase_HashMapImplementation {
	
	
	public WebDriver driver ;
	
	
	@BeforeTest
	public void browserIntialization() throws IOException, InterruptedException {
	driver = BrowserFactory.startApplication(driver, "Chrome", "https://classic.crmpro.com/index.html");
	
	}
	
	
	
	@Test
	public void passUserCredentials() {
		HashMapImplementation HSS = PageFactory.initElements(driver, HashMapImplementation.class);
		HSS.PassUserCredentials();
		
	}

}
