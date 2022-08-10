package com.Pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.mozilla.javascript.JavaScriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WindowHandler {

	public static WebDriver driver;

	public WindowHandler(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(id = "windowButton")
	WebElement newWindow;

	@FindBy(id = "sampleHeading")
	WebElement NewWindowText;
	
	@FindBy(id = "windowButton")
	WebElement NewWindowButton;
	
	
	@FindBy(id = "sampleHeading")
	WebElement WindowNewTxt;

	
	@FindBy(id = "getwebsitebtn")
	WebElement GetYourWebSiteBtn;
	
	@FindBy(xpath = "//a[@target='_blank'][contains(text(),'Read here')]")
	WebElement ReadHereText;
	

	public void HandleWindow() {
		
		String handle = driver.getWindowHandle();
		
		newWindow.click();

		Set<String> handles = driver.getWindowHandles();
		
		for(String STR : handles) {
			if(!STR.equals(handle)) {
				driver.switchTo().window(STR);
			}
			
		}
		
		String text = NewWindowText.getText();
	}
	
	
	public void HandleWindowz() throws InterruptedException {
		//Shift to each window one by one and get the title for each 
		
		String title1= driver.getTitle();
		System.out.println(title1);
		
		Thread.sleep(2000);
		
		GetYourWebSiteBtn.click();
		
		String title2= driver.getTitle();
		System.out.println(title2);
		
		
		
		Thread.sleep(2000);
		
		Set<String> handles = driver.getWindowHandles();
		String handle = driver.getWindowHandle();
	
		
		
		for(String STR : handles) {
			if(!handle.equals(STR)) {
				driver.switchTo().window(STR);
				break;
			}
		}
		
		JavascriptExecutor JS = (JavascriptExecutor)driver;
		JS.executeScript("window.scrollBy(0,2000)", "Scroll Page down");
		
		ReadHereText.click();
		
		String title3= driver.getTitle();
		System.out.println(title3);
		
		
	}

	
}
