package com.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.Utility.BrowserFactory;

public class TestCase_DataProvider_TestNG {
	
	WebDriver driver ;
	

	@BeforeTest
	public void browserIntialization() throws IOException, InterruptedException {
	driver = BrowserFactory.startApplication(driver, "chrome", "https://www.houseoffraser.co.uk/");
	
	}
	
	@DataProvider
	public Object[][] dataRepo() {

		Object[][] Obj = new Object[1][4];
		Obj[0][0] = "Miss";
		Obj[0][1] = "ABCD";
		Obj[0][2] = "CDFG";
		Obj[0][3] = "Test@test.com";
		return Obj;

	}
	
	
	
	@Test(dataProvider = "dataRepo")
	public void userDetails(String Gender , String FirstName , String LastName , String Email) {
		
		System.out.println("Method Started");
		
		WebElement signInBtn = driver.findElement(By.xpath("//*[@id='HeaderGroup']/div[1]/div/div/div[1]/div[5]/div[4]/a/span[2]"));
		signInBtn.click();
		
		WebElement continueSecurelyBtn =driver.findElement(By.xpath("//*[@id='main-content']//span[contains(text(),'Continue')]"));
		continueSecurelyBtn.click();
		
		WebElement titleDD = driver.findElement(By.name("Registration.Title"));

		WebElement firstNameTxtBox = driver.findElement(By.name("Registration.FirstName"));

		WebElement lastNameTxtBox = driver.findElement(By.name("Registration.LastName"));

		WebElement emailTxtbox = driver.findElement(By.name("Registration.EmailAddress"));

		WebElement dayDD = driver.findElement(By.name("Registration.DateOfBirthDay"));

		WebElement monthDD = driver.findElement(By.name("Registration.DateOfBirthMonth"));

		WebElement yearDD = driver.findElement(By.name("Registration.DateOfBirthYear"));
		

		Select select = new Select(titleDD);
		select.selectByValue(Gender);

		firstNameTxtBox.sendKeys(FirstName);

		lastNameTxtBox.sendKeys(LastName);

		emailTxtbox.sendKeys(Email);

		Select select1 = new Select(dayDD);
		select1.selectByValue("9");

		Select select2 = new Select(monthDD);
		select2.selectByVisibleText("May");

		Select select3 = new Select(yearDD);
		select3.selectByValue("2019");

	}
	

	
	

}
