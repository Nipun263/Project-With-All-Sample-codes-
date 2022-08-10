package com.TestCases;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Pages.MultipleHover;
import com.Utility.BrowserFactory;

public class TestCase_Multiple_Hover {
	
	public static WebDriver driver ;
	
	
	@BeforeTest
	public void IntialSetUp() throws MalformedURLException {
		
	driver = BrowserFactory.startApplication(driver,"chrome","https://deluxe-menu.com/samples-sample.html");
		
	}

	@Test
	public void HandleMutlipleHoverOption() throws InterruptedException {
		
		MultipleHover MV = PageFactory.initElements(driver, MultipleHover.class);
		MV.TackleMultipleHover();
		
	}
	
	
	
}
