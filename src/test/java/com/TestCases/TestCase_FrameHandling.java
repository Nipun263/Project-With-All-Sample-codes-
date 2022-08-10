package com.TestCases;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Pages.FrameHandling;
import com.Pages.WindowHandler;
import com.Utility.BrowserFactory;

public class TestCase_FrameHandling {
	
public static WebDriver driver ;
	
	@BeforeSuite
	public void browserIntialise() throws MalformedURLException {
	driver = 	BrowserFactory.startApplication(driver, "Chrome", "http://demo.guru99.com/test/guru99home/");
		
	
	
	}
	
	
	@Test
	public void TestCase_FrameHandle() throws InterruptedException {
		FrameHandling WW =	PageFactory.initElements(driver, FrameHandling.class);
		WW.HandleFramez();
	}
	

}