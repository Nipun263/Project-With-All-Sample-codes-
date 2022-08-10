package com.TestCases;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Pages.ToolTip;
import com.Utility.BrowserFactory;

public class TestCase_ToolTip {
	
	public WebDriver driver ;
	
	@BeforeTest
	public void BrowserIntialization() throws MalformedURLException {
		
	driver = BrowserFactory.startApplication(driver, "Chrome", "https://demoqa.com/tool-tips/");
		
	}
	
	@Test
	public void TestCase_Tool_Tip_Func() {
		
		ToolTip TT =	PageFactory.initElements(driver, ToolTip.class);
		TT.ToolTip();
		
		
	}
	
	@AfterTest
	public void TearDown_App() {
		BrowserFactory.closeApplication(driver);
	}

}
