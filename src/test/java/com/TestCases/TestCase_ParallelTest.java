package com.TestCases;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Pages.ScrollingPage;
import com.Utility.BrowserFactory;

public class TestCase_ParallelTest {


	public WebDriver driver;

	@Parameters("BrowserName")
	@BeforeTest()
	public void intialiseBrowser(String BrowserName) throws MalformedURLException {
		
		String BrowserNamePassed = BrowserName;
		System.out.println("**********BrowserName ::**************" + BrowserName);
		
	//driver = BrowserFactory.startApplication(driver, "Remote", "https://www.album.alexflueras.ro/index.php");
		driver = BrowserFactory.startApplication(driver, BrowserName, "https://www.album.alexflueras.ro/index.php");
	}
	
	
	@Test(priority = 1)
	public void verifyScrollFunc() {
		ScrollingPage SS = PageFactory.initElements(driver, ScrollingPage.class);
		SS.scrollPageToRight();
	}
	
	

	@Test(priority = 2)
	public void ScrollToLeft() {
		ScrollingPage SS = PageFactory.initElements(driver, ScrollingPage.class);
		SS.scrollToLeft();
	}
	
	
	@AfterTest
	public void tearDown() {
		BrowserFactory.closeApplication(driver);
	}

	
	

}
