package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class StaleElementHandle {
	
	WebDriver driver;
	
	
	public StaleElementHandle(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void StaleElementWillBeThrown() throws InterruptedException {
		
		WebElement bmwCheckBox = driver.findElement(By.xpath("//legend[contains(text(),'Checkbox')]/following::input[@id='bmwcheck']"));
		
		bmwCheckBox.click();
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		Boolean flag = bmwCheckBox.isDisplayed();
		
		//Here after refreshing the page , no doubt bmwCheckBox will be there however the element 
		//identity has changed what we detected before refreshing the page 
		//bmwcheck is not fresh now - you have to find it again 
		
		//Jo bhe statement is causing stale element out that in try block . In Catch block -followed by identifying same 
		//element once again and again keeping same line in catch block
		
		
		bmwCheckBox.click();
	}
	
	
public void StaleElementHandled() throws InterruptedException {
		
		WebElement bmwCheckBox = driver.findElement(By.xpath("//legend[contains(text(),'Checkbox')]/following::input[@id='bmwcheck']"));
		bmwCheckBox.click();
		driver.navigate().refresh();
		
		//Jo bhe statement is causing stale element out that in try block . In Catch block -
		//followed by identifying same element once again and again keeping same line in catch block
		
		
		try {
			
		    bmwCheckBox.click();
		   
		}
		
		catch(Exception e) {
			bmwCheckBox = driver.findElement(By.xpath("//legend[contains(text(),'Checkbox')]/following::input[@id='bmwcheck']"));
			bmwCheckBox.click();
			System.out.println("Exception handled is " +  e.getMessage());
		}
	}
		
		
	

}
