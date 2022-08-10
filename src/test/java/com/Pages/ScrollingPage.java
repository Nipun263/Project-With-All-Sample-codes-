package com.Pages;

import java.util.ArrayList;

import org.mozilla.javascript.JavaScriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ScrollingPage {
	
	public WebDriver driver ;
	
	public ScrollingPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void scrollPageToRight() {

		JavascriptExecutor JS = (JavascriptExecutor)driver;
		JS.executeScript("window.scrollBy(2000,0)", "Scroll Page to the right");
		System.out.println("");
		
	}
	
	
	public void scrollToLeft() {
		JavascriptExecutor JS = (JavascriptExecutor)driver;
		JS.executeScript("window.scrollBy(-1000,0)");
	}
	
	
	
	
	
	
	
	

}






