package com.TestCases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Pages.DataProviderAndExcelIntegration;
import com.Utility.BrowserFactory;
import com.Utility.ExcelReadingUtility;

public class TestCase_Excel_DataProvider {
	
	
	public WebDriver driver ;
	

	
	
	@BeforeTest
	public void IntializeBrowser() throws MalformedURLException {
		driver = BrowserFactory.startApplication(driver, "Chrome", "https://the-internet.herokuapp.com/login");
	}
	
	
	
	@Test(priority=1)
	public void CallingDataProviderMethod() throws IOException {
		DataProviderAndExcelIntegration DP = PageFactory.initElements(driver, DataProviderAndExcelIntegration.class);
		DP.DataProviderMethod();
	
	}
	

	@Test(priority=2,dataProvider = "ABCD",dataProviderClass = DataProviderAndExcelIntegration.class)
	public void FetchDataFromExcelAndPassToDataProvider(String UserNameToPass , String PasswordToPass) throws IOException {
		DataProviderAndExcelIntegration DP = PageFactory.initElements(driver, DataProviderAndExcelIntegration.class);
		DP.DataPass(UserNameToPass,PasswordToPass);
		
	}
	
	@AfterTest
	public void CloseApplication() {
		driver = BrowserFactory.closeApplication(driver);
	}
	
	
	

}
