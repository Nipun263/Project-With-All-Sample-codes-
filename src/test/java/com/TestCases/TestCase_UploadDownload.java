package com.TestCases;

import java.awt.AWTException;
import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Pages.HighLight_Element;
import com.Pages.UploadAndDownloadFile;
import com.Utility.BrowserFactory;

public class TestCase_UploadDownload {
	
	public static WebDriver driver ;

	@BeforeSuite
	public void browserIntialization() throws MalformedURLException {
	driver = 	BrowserFactory.startApplication(driver, "Chrome", "http://demo.guru99.com/test/upload/");
	}
	
	
	@Test
	public void TestCase_Verify_Element_Highlighted() throws AWTException, IOException {
		UploadAndDownloadFile UPD = PageFactory.initElements(driver, UploadAndDownloadFile.class);
		UPD.uploadFile_Option2();
		
	}
	
	
	
	
	

}