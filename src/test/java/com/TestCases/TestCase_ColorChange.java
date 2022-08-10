package com.TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Pages.ColorChange;
import com.Utility.BrowserFactory;

public class TestCase_ColorChange {

	public WebDriver driver;

	// @Parameters("BrowserName")
	@BeforeTest
	public void browserIntialization() throws IOException, InterruptedException {
		//driver = BrowserFactory.startApplication(driver, "Chrome", "https://www.tutorialspoint.com/index.htm");
		driver = BrowserFactory.startApplication(driver, "Remote", "https://www.tutorialspoint.com/index.htm");
		
	}

	@Test(priority = 1)
	public void TestCase_VerifyColorChange() {
		ColorChange CC = PageFactory.initElements(driver, ColorChange.class);
		CC.VerifyColorChange();

	}
	
	/*
	 * @Test public void Factory_M2() {
	 * System.out.print("Factory_Method_2 :: Class 2 "); }
	 */

	@AfterTest
	public void browserSetUpClosure() {
		BrowserFactory.closeApplication(driver);
	}

}
