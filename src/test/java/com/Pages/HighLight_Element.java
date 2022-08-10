package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HighLight_Element {
	
	public WebDriver driver ;
	
	public HighLight_Element(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	public void Verify_HighLight_Element() {
		
		WebElement signIn = driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
		signIn.click();
		
		WebElement emailTxtBox = driver.findElement(By.id("ap_email"));
		String color_Before_Highlight = emailTxtBox.getCssValue("background-color");
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
		jsExecutor.executeScript("arguments[0].style.background='green'", emailTxtBox);  
		
		String color_After_Highlight = emailTxtBox.getCssValue("background-color");
		
		//Verfuing actually colour has changed or not 
		
		if(color_Before_Highlight.equals(color_After_Highlight)) {
			driver.quit();
		}
		else 
		{
			System.out.println("Text Box Highlighted");
		}
		
	}

}
