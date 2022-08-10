package com.TestCases;

import java.awt.AWTException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Pages.RobotClass;
import com.Pages.WindowHandler;
import com.Utility.BrowserFactory;

public class TestCase_HandleRobotClass {	
	
	public static WebDriver driver ;
	
	@BeforeSuite
	public void browserIntialise() throws MalformedURLException {
	driver = 	BrowserFactory.startApplication(driver, "firefox", "https://www.contextures.com/excelfiles.html");
		
	}
	
	
	@Test
	public void TestCase_WindowHandle() throws AWTException, InterruptedException {
		RobotClass RC =	PageFactory.initElements(driver, RobotClass.class);
		RC.handleRobotClassActions();
	}
	

}
