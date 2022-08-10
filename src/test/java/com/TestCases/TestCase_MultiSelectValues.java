package com.TestCases;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Pages.MultiSelectDropDown;
import com.Utility.BrowserFactory;

public class TestCase_MultiSelectValues {
	
	public static WebDriver driver ;
	
	@BeforeTest
	public void BrowserIntiliazation() throws MalformedURLException {
	driver =	BrowserFactory.startApplication(driver, "chrome", "https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
	}
	
	
	@Test
	public void TestCase_HandleMultipleValueDD() {
		MultiSelectDropDown MS =	PageFactory.initElements(driver,MultiSelectDropDown.class);
		MS.SelectMultipleOptions();
	}

}
