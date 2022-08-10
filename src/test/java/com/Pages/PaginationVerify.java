package com.Pages;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class PaginationVerify {

	public static WebDriver driver;
	
	 static Logger logger = LogManager.getLogger(PaginationVerify.class);


	public PaginationVerify(WebDriver driver) {
		this.driver = driver;
	}

	

	public void verifyPagination() {

		WebElement searchBox = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));

		searchBox.sendKeys("pagination");
		searchBox.sendKeys(Keys.ENTER);
		
		
		logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");
        logger.fatal("This is a fatal message");

		JavascriptExecutor JS = (JavascriptExecutor) driver;
		JS.executeScript("window.scrollBy(0,2000)");
		
		

		List<WebElement> pages = driver.findElements(By.xpath("//*[@id='xjs']/table//tr//a"));
		int size_Pages = pages.size();

		WebElement nextBtn = driver.findElement(By.xpath("//*[@jsname='TeSSVd']"));

		for (int i = 0; i <= size_Pages; i++) {

			if (nextBtn.isEnabled()) {
				JS.executeScript("window.scrollBy(0,2000)");
				pages.get(i).click();

				try {

					nextBtn.isEnabled();
					JS.executeScript("window.scrollBy(0,2000)");
					pages.get(i).click();

				}

				catch (Exception e) {
					nextBtn = driver.findElement(By.xpath("//*[@id='pnnext']/span[contains(text(),'Next')]"));
					pages = driver.findElements(By.xpath("//*[@id='xjs']/table//tr//a"));

				}

			}

		}

	}



}
