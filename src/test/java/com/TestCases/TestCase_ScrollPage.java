package com.TestCases;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Pages.ScrollingPage;
import com.Utility.BrowserFactory;

public class TestCase_ScrollPage {

	public WebDriver driver;


	@BeforeSuite
	public void intialiseBrowser() throws MalformedURLException {
		
		driver = BrowserFactory.startApplication(driver, "Remote", "https://www.album.alexflueras.ro/index.php");
	}
	
	
	@Test(priority = 1)
	public void verifyScrollFunc() {
		ScrollingPage SS = PageFactory.initElements(driver, ScrollingPage.class);
		SS.scrollPageToRight();
	}
	
	
	@AfterSuite
	public void tearDown() {
		BrowserFactory.closeApplication(driver);
	}

}
