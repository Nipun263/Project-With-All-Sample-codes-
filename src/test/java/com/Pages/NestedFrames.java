package com.Pages;

import java.awt.Frame;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NestedFrames {
	
	public WebDriver driver ;
	
	
	public NestedFrames(WebDriver driver) {
		this.driver = driver ;
	}
	
	
	public void handleNestedFrames() {
		
		List<WebElement> framz = driver.findElements(By.xpath("//iframe"));
		
		
		int sizeOfFrame = framz.size();
		
		driver.switchTo().frame("frame1");
		
		driver.switchTo().frame("frame3");
		
		WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		
		
		checkBox.click();
		
		
		
		
	}
	

}
