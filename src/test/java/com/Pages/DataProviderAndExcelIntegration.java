package com.Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Utility.ExcelReadingUtility;

public class DataProviderAndExcelIntegration {
	
	
	public WebDriver driver ;
	

	@FindBy(xpath="//input[@id='username']")
		WebElement UserName;
	
	
	@FindBy(xpath="//input[@id='password']")
	WebElement Password;
	

	
	@DataProvider(name="ABCD")
	public static Object[][] DataProviderMethod() throws IOException{
		
		 Object[][] Obj = ExcelReadingUtility.readExcelSheet("Sample Excel.xlsx", "DummyData");
		
		 return Obj;
	}
	
	
	
	public void DataPass(String UserNameToPass , String PasswordToPass) throws IOException {
		
		UserName.sendKeys(UserNameToPass);
		Password.sendKeys(PasswordToPass);
	}
	
	
}
