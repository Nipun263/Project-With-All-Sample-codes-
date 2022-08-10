package com.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RobotClass {

	public static WebDriver driver;

	public RobotClass(WebDriver driver) {
		
		this.driver = driver;
	}
	

	public void handleRobotClassActions() throws AWTException, InterruptedException  {
		
		JavascriptExecutor JS = (JavascriptExecutor)driver;
		JS.executeScript("window.scrollBy(0,500)", "");
		
		WebElement fileToDownload = driver.findElement(By.xpath("//a[contains(text(),'datavallatestitemstop.zip')]"));
		fileToDownload.click();
		
		Thread.sleep(2000);
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
