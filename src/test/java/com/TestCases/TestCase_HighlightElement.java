package com.TestCases;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Pages.HighLight_Element;
import com.Utility.BrowserFactory;

public class TestCase_HighlightElement {

	
	public WebDriver driver;

	
	
	
	@BeforeTest
	public void browserIntialization() throws MalformedURLException {
		
		driver = BrowserFactory.startApplication(driver, "Chrome", "https://www.amazon.in/");
	}
	
	
	
	

	@Test
	public void TestCase_Verify_Element_Highlighted() {
		HighLight_Element HE = PageFactory.initElements(driver, HighLight_Element.class);
		HE.Verify_HighLight_Element();
	}
	
	

	@AfterTest
	public void browserSetUpClosure() {
		BrowserFactory.closeApplication(driver);
	}

}
