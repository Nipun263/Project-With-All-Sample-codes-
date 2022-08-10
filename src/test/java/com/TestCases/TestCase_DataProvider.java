package com.TestCases;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Pages.DataProvidersImplementation;
import com.Utility.BrowserFactory;

public class TestCase_DataProvider {
	
	public static WebDriver driver ;
	
	

	@FindBy(xpath ="//*[@id='nav-signin-tooltip']/a/span")
	public WebElement signInBtn;
	
	@FindBy(xpath ="//input[@type='email']")
	public WebElement emailTxtBox;
	
	@FindBy(xpath ="//input[@id='continue']")
	public WebElement continueBtn;
	
	@FindBy(xpath ="//input[@type='password']")
	public WebElement passwordTxtBox;
	

	
	@BeforeTest
	public void browserIntialization() throws MalformedURLException {
	driver = BrowserFactory.startApplication(driver,"chrome","https://www.amazon.in");
	
	}
	
	
	
	@Test(dataProvider = "PassData")
	public void UserCredentials(String Email , String Pass) {
		DataProvidersImplementation DP = PageFactory.initElements(driver, DataProvidersImplementation.class);
		DP.passUserCredentials(Email, Pass);
	}
	
	@DataProvider
	public Object[][] PassData() {
		Object[][] OBJJ = new Object[2][2];

		OBJJ[0][0] = "ABCD@test.com";
		OBJJ[0][1] = "Verma";

		OBJJ[1][0] = "ABCDE@test.com";
		OBJJ[1][1] = "Gupta";

		return OBJJ;

	}

	
}
