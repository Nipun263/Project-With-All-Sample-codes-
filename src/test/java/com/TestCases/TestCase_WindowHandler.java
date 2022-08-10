package com.TestCases;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Pages.WindowHandler;
import com.Utility.BrowserFactory;

public class TestCase_WindowHandler {
	
	public static WebDriver driver ;
	
	@BeforeSuite
	public void browserIntialise() throws MalformedURLException {
	//driver = BrowserFactory.startApplication(driver, "Chrome", "https://demoqa.com/browser-windows");
	driver = BrowserFactory.startApplication(driver, "Chrome", "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
	
	}
	
	
	@Test
	public void TestCase_WindowHandle() throws InterruptedException {
		WindowHandler WW =	PageFactory.initElements(driver, WindowHandler.class);
		WW.HandleWindowz();
		
	}
	

}
