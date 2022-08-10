package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ColorChange {

	public WebDriver driver;
	public WebDriverWait wait;
	
	public ColorChange(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	public void VerifyColorChange() {

	WebElement course = driver.findElement(By.xpath("//*[@class='tp-banner-links']//span[contains(text(),'Courses')]"));
		
	String Color_Before =	course.getCssValue("color");
	
	Actions actions = new Actions(driver);
	actions.moveToElement(course).build().perform();
	
	String Color_After =	course.getCssValue("color");
	
	if(!Color_After.equals(Color_Before)){
		System.out.println("Color changes !!!!");
	}
	
	
	
	}

	public void google() {
		WebElement gg = driver.findElement(By.xpath("//*[@class='gLFyf gsfi']"));

		gg.sendKeys("ABC");

		// WebElement elementPrsnce =
		// wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul")));

		// Boolean flag = elementPrsnce.isDisplayed();

	}

}