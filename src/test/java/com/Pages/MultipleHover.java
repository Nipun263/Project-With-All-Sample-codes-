package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MultipleHover {
	
	public static WebDriver driver ;
	
	
	public MultipleHover(WebDriver driver) {
		this.driver=driver;
	}
	
	public void TackleMultipleHover() throws InterruptedException {
		
		WebElement Sample = driver.findElement(By.xpath("//*[@id='dm0m0i2tdT']"));
		
		
		
		
		Actions action = new Actions(driver);
		
		action.moveToElement(Sample).build().perform();
		
		Thread.sleep(1000);
		WebElement Template = driver.findElement(By.xpath("//*[@id='dm0m4i1tdT']"));
		
		

		action.moveToElement(Template).build().perform();
		
		Thread.sleep(1000);
		WebElement VisaStyleP3 = driver.findElement(By.xpath("//*[@id='dm0m6i3tdT']"));
		
		action.moveToElement(VisaStyleP3).build().perform();
		Thread.sleep(2000);
		
		WebElement Visa3 = driver.findElement(By.xpath("//*[@id='dm0m10i2tdT']"));
		
		action.moveToElement(Visa3).click().build().perform();
		
		Thread.sleep(1000);
		
	}
	
	
	
	

}
