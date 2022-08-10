package com.Pages;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropdownDependent {
	
	
	
	public void HandleDependent() {
		
		String driverPath1 = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath1);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.willmaster.com/library/web-development/dropdown-updates-another-dropdown.php");
		
		JavascriptExecutor JS = (JavascriptExecutor)driver;
		JS.executeScript("window.scrollBy(0,600)", "Scroll Page down");
		
		List<WebElement>  ArivalTime = driver.findElements(By.xpath("//select[@id='arrival-time-list']/option"));
		
		List<WebElement>  ServingTime = driver.findElements(By.xpath("//select[@id='dynamic-list']/option"));
		
		
		
		int size = ArivalTime.size();
		
		
		for(WebElement WW : ArivalTime) {
			
			String HH =WW.getText();
					if(HH.contains("9:30am")) {
							WW.click();
					}
			
					
			
		}
		for(WebElement WT : ServingTime) {
			String TT = WT.getText();
					if(TT.contains("10:00am")) {
						WT.click();
					}
	}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		DropdownDependent DD = new DropdownDependent();
		DD.HandleDependent();
	}

}
