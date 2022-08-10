package com.Pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CloseTabsOneByOne {

	public static WebDriver driver;

	public CloseTabsOneByOne(WebDriver driver) {
		this.driver = driver;
	}

	public void Handle_Tabs() {

		WebElement JoinMeeting = driver.findElement(By.id("btnJoinMeeting"));

		WebElement SignIN = driver.findElement(By.xpath("//*[@class='signin']/a"));

		WebElement SignUpForFree = driver.findElement(By.xpath("//a[@class='btn cta-bgyellow signupfree']"));

		WebElement Support = driver.findElement(By.xpath("//*[@id='black-topbar']/div/ul/li[3]/a"));

		String Handle = driver.getWindowHandle();

		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).build().perform();

		JoinMeeting.click();

		action.keyUp(Keys.CONTROL).build().perform();

		action.keyDown(Keys.CONTROL).build().perform();

		SignIN.click();

		action.keyUp(Keys.CONTROL).build().perform();
		
		action.keyDown(Keys.CONTROL).build().perform();

		SignUpForFree.click();

		action.keyUp(Keys.CONTROL).build().perform();

		action.keyDown(Keys.CONTROL).build().perform();

		Support.click();

		action.keyUp(Keys.CONTROL).build().perform();

		Set<String> Handles = driver.getWindowHandles();

		for (String STR : Handles) {
			if (!Handle.equals(STR)) {
				driver.switchTo().window(STR);
				driver.close();
			}
		}
		
		driver.switchTo().window(Handle);
		driver.close();
	}

}
