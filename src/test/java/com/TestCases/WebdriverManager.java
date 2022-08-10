package com.TestCases;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class WebdriverManager {
	
	public  WebDriver driver ;
	
	
	public void WebdriverSetUp() {
		
	driver = WebDriverManager.firefoxdriver().create();
		
		driver.get("https://www.google.com");
	}
	
	
	
	public static void main(String[] args) {
		WebdriverManager WM = new WebdriverManager();
		WM.WebdriverSetUp();
	}

}
