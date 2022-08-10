package com.Pages;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.seleniumhq.jetty9.server.Authentication.User;

public class Selenium4Features {

	public static WebDriver driver;

//	public WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(90));

	public Selenium4Features(WebDriver driver) {
		this.driver = driver;
	}

	public void RelativeLocators() {

		//WebElement BookSeven = driver.findElement(RelativeLocator.withTagName("li").toLeftOf(By.id("pid8_thumb")).toRightOf(By.id("pid6_thumb")));
		//Boolean stat1e = BookSeven.isDisplayed();
	}

	
	
	public void SwitchTab() {

		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.google.com");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://www.amazon.in");
		
	}
	
	public void CaptureSSOfCompletePage() throws IOException {
		
		Random randomNum = new Random();
		
		double ranNumGen = randomNum.nextDouble();
		
		
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File(System.getProperty("user.dir") + "\\ScreenShotz\\" + "ScreenShot" + ranNumGen  + ".png"));		
	}
	
	
	
	public void CaptureSSOfElement() throws IOException {
		
		Random randomNum = new Random();
		
		double ranNumGen = randomNum.nextDouble();
		
		WebElement ForthElement = driver.findElement(By.id("pid4_thumb"));
		
		File file = ForthElement.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File(System.getProperty("user.dir") + "\\ScreenShotz\\" + "ScreenShot" + ranNumGen  + ".png"));		
	
		
		
	}
	
}
