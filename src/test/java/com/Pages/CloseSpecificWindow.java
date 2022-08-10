package com.Pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CloseSpecificWindow {

	public static WebDriver driver;

	
	public CloseSpecificWindow(WebDriver driver) {
		this.driver = driver;
	}

	public void closeDesiredWindow() {
		
		
	
		
		
		
		String handle = driver.getWindowHandle();
		String SS =  driver.getTitle();
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		
		JS.executeScript("window.scrollBy(0,400)", "");
		
		
		
		WebElement googleLogin = driver.findElement(By.xpath("//*[@id='login-google-button']"));
		
		googleLogin.click();
		
		Set<String> handles = driver.getWindowHandles();
		
		
		for ( String STR : handles ) {
				
			driver.switchTo().window(STR);
			
			String currentWindowTitle =  driver.getTitle();
			
			if(currentWindowTitle.equalsIgnoreCase("Sign in – Google accounts")) {
				driver.close();
			}
		
		}
		
		driver.switchTo().window(handle);
		
		Boolean flag = googleLogin.isDisplayed();
		Boolean flagg = googleLogin.isDisplayed();
		
	}

}
