package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;





public class DataProvidersImplementation {

	public WebDriver driver;

	

	public DataProvidersImplementation(WebDriver driver) {
		this.driver = driver;
	}
	
	

	@FindBy(xpath = "//*[@id='nav-link-accountList-nav-line-1']")
	public WebElement signInBtn;

	@FindBy(xpath = "//input[@type='email']")
	public WebElement emailTxtBox;

	@FindBy(xpath = "//input[@id='continue']")
	public WebElement continueBtn;

	@FindBy(xpath = "//input[@type='password']")
	public WebElement passwordTxtBox;
	
	
	////*[@id="nav-link-accountList-nav-line-1"]

	public void passUserCredentials(String EmailAddress, String PhoneNum) {

		String EE = EmailAddress;

		String PP = PhoneNum;

		System.out.println(EE);
		System.out.println(PP);

		signInBtn.click();

		emailTxtBox.sendKeys(EmailAddress);

		continueBtn.click();

		passwordTxtBox.sendKeys(PhoneNum);
		
		driver.get("www.amazon.in");

	}

	
	

}
