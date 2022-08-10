package com.TestCases;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Utility.BrowserFactory;

public class TestCase_ParallelTst {

	public static WebDriver driver;

	@Parameters("BrowserNamePassed")
	@BeforeTest
	public void BrowserIntialization(String BrowserNamePassed) throws MalformedURLException {
		System.out.println("BrowserName Passed ===========>" + BrowserNamePassed);
		driver = BrowserFactory.startApplication(driver, BrowserNamePassed, "https://www.google.com");
	}

	@Test
	public void TestCase_1() {
		System.out.println("TestCase_1");
	}

	@Test
	public void TestCase_2() {
		System.out.println("TestCase_2");
	}

	@Test
	public void TestCase_3() {
		System.out.println("TestCase_3");
	}

	@Test
	public void TestCase_4() {
		System.out.println("TestCase_4");
	}

	@Test
	public void TestCase_5() {
		System.out.println("TestCase_5");
	}

	/*
	 * @AfterTest public void CloseApplication() { driver =
	 * BrowserFactory.closeApplication(driver); }
	 */

}
