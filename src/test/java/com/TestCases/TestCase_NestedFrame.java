package com.TestCases;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Pages.NestedFrames;
import com.Utility.BrowserFactory;

public class TestCase_NestedFrame {

	public WebDriver driver;

	@BeforeSuite
	public void browserIntialization() throws MalformedURLException {

		driver = BrowserFactory.startApplication(driver, "chrome", "https://chercher.tech/practice/frames");

	}

	@Test
	public void TestCase_HandleNestedFrame() {

		NestedFrames NF = PageFactory.initElements(driver, NestedFrames.class);
		NF.handleNestedFrames();
	}

	@AfterSuite
	public void tearDown() {

		BrowserFactory.closeApplication(driver);

	}
	

}
