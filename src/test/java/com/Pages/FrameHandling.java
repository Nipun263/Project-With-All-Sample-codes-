package com.Pages;

import java.util.List;
import java.util.Set;

import org.mozilla.javascript.JavaScriptException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class FrameHandling {
	
public WebDriver driver ;



	public FrameHandling(WebDriver driver) {
		this.driver=driver;
	}
	
	
	@FindBy(xpath="/html/body/a/img")
	public WebElement Image;
	
	
	@FindBy(xpath="//*[@id='main-header']//img[@alt='Guru99']")
	public WebElement EE;
	
	
	@FindBy(xpath="//*[@id='menu-item-3180']/a")
	public WebElement Blog;
	
	
	public void HandleFramez() {
		
		List<WebElement> frmzz = driver.findElements(By.xpath("//iframe"));
		int size_Frames  = frmzz.size();
		
		System.out.println(size_Frames);
		
		for(WebElement WB : frmzz) {
			String FrameName = WB.getAttribute("name").toString();
			System.out.println(FrameName);
		}
		
		JavascriptExecutor JS = (JavascriptExecutor)driver;
		JS.executeScript("window.scrollBy(0,2200)");
		
		driver.switchTo().frame("a077aa5e");
		
		Image.click();
		
		
		
		
	}
}