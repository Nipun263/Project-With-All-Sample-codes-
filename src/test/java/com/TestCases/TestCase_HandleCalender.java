package com.TestCases;

import java.net.MalformedURLException;
import java.util.Calendar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Pages.CalenderHandle;
import com.Utility.BrowserFactory;

public class TestCase_HandleCalender {
	
	
	public WebDriver driver;
	
	
	@BeforeTest
	public void BrowserIntialization() throws MalformedURLException {
		//driver = BrowserFactory.startApplication(driver, "Chrome","http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver = BrowserFactory.startApplication(driver, "Chrome","https://www.path2usa.com/travel-companions");
		
	}
	
	
	@Test
	public void Handle_Calender_PopUp() {
		CalenderHandle CH =	PageFactory.initElements(driver, CalenderHandle.class);
		CH.SelectedDesiredDateAndMonth("");
		
	}
	
	@AfterTest
	public void CloseBrowser() {
		driver.quit();
		String title = driver.getTitle();
		System.out.println(title);
	}

}
