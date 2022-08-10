package com.TestCases;

import java.awt.AWTException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Pages.DownloadFileUsingRobotClass;
import com.Utility.BrowserFactory;

public class TestCase_DownloadFile {
	
	
	public WebDriver driver ;
	
	
	@BeforeTest
	public void browser_Intialization() throws MalformedURLException {
	driver =  BrowserFactory.startApplication(driver, "Firefox","http://demo.automationtesting.in/FileDownload.html");
	}
	
	
	
	
	@Test
	public void DownloadFileAndConfirm() throws AWTException, InterruptedException {
		DownloadFileUsingRobotClass DF = PageFactory.initElements(driver, DownloadFileUsingRobotClass.class);
		DF.downloadFile_RobotClass();
	}
	
	
	
	
	
	@AfterTest
	public void close_Browser() {
		driver = BrowserFactory.closeApplication(driver);
		
		
	}

}
