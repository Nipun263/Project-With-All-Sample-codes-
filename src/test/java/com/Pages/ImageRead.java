package com.Pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class ImageRead {

	
	//Note this code works fine on debugging ad on running as test it is failing 
	
	
	public static WebDriver driver;

	public ImageRead(WebDriver driver) {
		this.driver = driver;
	}

	public void readImageTest() throws TesseractException, IOException {
		try {
			WebElement OkBtn = driver.findElement(By.cssSelector("div.text-center.col-xs-12 > button[type='submit']"));
			OkBtn.click();

			WebElement optionBar = driver.findElement(
					By.xpath("//div[@class='h_menu_drop_button hidden-xs']//i[@class='fa fa-align-justify']"));
			optionBar.click();

			WebElement loginBtn = driver.findElement(By.xpath("//button[@class='search_btn']"));
			loginBtn.click();

			WebElement Img = driver.findElement(By.xpath("//input[@id='nlpAnswer']//preceding::img[1]"));

			File src = Img.getScreenshotAs(OutputType.FILE);

			String pathToCollectSS = System.getProperty("user.dir");
			
			

			File dest = new File(pathToCollectSS + "/ImageCaptured/" + "Image_Cap" + ".png");
			
			
			FileUtils.copyFile(src, dest);
			
			
			
			ITesseract image = new Tesseract();
			
			
			String SS =  image.doOCR(dest);
			
			Thread.sleep(2000);

			System.out.println(SS);
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
