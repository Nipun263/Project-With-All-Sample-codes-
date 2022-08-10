package com.TestCases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Pages.ParameterizationUsingExcel;
import com.Utility.BrowserFactory;

public class TestCase_Parameterization_Excel {
	
	public static WebDriver driver ;
	
	
	@FindBy(id ="Email")
	WebElement Email ;
	
	@FindBy(id ="Password")
	WebElement Password ;
	

	
	@BeforeTest
	public void Intialization() throws MalformedURLException {
		
	driver = 	BrowserFactory.startApplication(driver, "chrome","http://demowebshop.tricentis.com/login");
	}
	
	
	//@Test
	public void TestCase_PassCredentails() throws IOException {
		
		ParameterizationUsingExcel PPE =	PageFactory.initElements(driver, ParameterizationUsingExcel.class);
		PPE.readExcelPassCredentials("Sample Excel.xlsx", "UserCredentials");
		
	}
	

	@Test(dataProvider = "dataRepo")
	public void TestCase_PassCredentails_UsingDataProvider(String UserName ,String Password) throws IOException {
		
		ParameterizationUsingExcel PPE = PageFactory.initElements(driver, ParameterizationUsingExcel.class);
		
		
		PPE.PassCredentailsDataProvidr(UserName ,Password);
		
	}
	
	
	@DataProvider
	public Object[][] dataRepo(){
		
		Object[][] Obj = new Object[4][2];
		
		Obj[0][0] = "UserName1##";
		Obj[0][1] = "Password1##";
		
		Obj[1][0] = "UserName2##";
		Obj[1][1] = "Password2##";
		
		Obj[2][0] = "UserName3##";
		Obj[2][1] = "Password3##";
		
		Obj[3][0] = "UserName4##";
		Obj[3][1] = "Password4##";
		 
				 
		 return Obj;
		
		
	}
	
	
	@AfterTest
	public void tearDown() {
		
		driver.quit();
	}

}
