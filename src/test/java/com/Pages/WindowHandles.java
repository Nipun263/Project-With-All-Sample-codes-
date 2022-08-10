package com.Pages;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class WindowHandles {
	
	public static WebDriver driver ;
	
	public WindowHandles(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void HandleMultipleWindows_Switching_To_Particular_Window() {
		
		
		WebElement Companies = driver.findElement(By.xpath("//div[normalize-space()='Companies']"));
		
		WebElement Services = driver.findElement(By.xpath("//div[normalize-space()='Services']"));
		
		WebElement Jobs = driver.findElement(By.xpath("//div[normalize-space()='Jobs']"));
		
		WebElement Employer  = driver.findElement(By.xpath("//div[normalize-space()='For employers']"));
		
		WebElement Register  = driver.findElement(By.xpath("//div[normalize-space()='Register']"));
		
		Companies.click();
		Services.click();
		Jobs.click();
		Employer.click();
		Register.click();
		
		Set<String> SS = driver.getWindowHandles();
		
		for(String e : SS) {
		String Title =	driver.switchTo().window(e).getTitle();
		
		if(Title.equalsIgnoreCase("")) {
			driver.switchTo().window(e);
		}
		}
		
		
	
		}


				
		
		public void HandleMultipleWindows() {
			
			WebElement Companies = driver.findElement(By.xpath("//div[normalize-space()='Companies']"));
			
			WebElement Services = driver.findElement(By.xpath("//div[normalize-space()='Services']"));
			
			WebElement Jobs = driver.findElement(By.xpath("//div[normalize-space()='Jobs']"));
			
			WebElement Employer  = driver.findElement(By.xpath("//div[normalize-space()='For employers']"));
			
			WebElement Register  = driver.findElement(By.xpath("//div[normalize-space()='Register']"));
			
			String handle = driver.getWindowHandle();
			
			String Title = driver.getTitle();
			
			System.out.println("Title - Window 1 =====>" + Title);
			
			Companies.click();
			
			Set<String> handles = driver.getWindowHandles();
			
			for(String STR : handles) {
				
				if(!handle.equals(STR)) {
					driver.switchTo().window(STR);
					
				}
				
			}
			
			WebElement AllJobs = driver.findElement(By.xpath("//a[@target='_blank'][normalize-space()='All Jobs']"));
			Boolean State = AllJobs.isDisplayed();
				
			String Title1 = driver.getTitle();
				
			System.out.println("Title - Window 2 =====>" + Title1);
				
			WebElement Service = driver.findElement(By.xpath("//div[normalize-space()='Services']"));
			
			Service.click();
			
			Set<String> SS = driver.getWindowHandles();
			
			for(String ST : SS) {
				if(!handle.equals(ST)) {
					driver.switchTo().window(ST);
				}
			}
			
			
			
			
		WebElement MonthlySubscrption = driver.findElement(By.xpath("//span[normalize-space()='MONTHLY SUBSCRIPTION']"));	
		Boolean Flg = MonthlySubscrption.isDisplayed();
		
		String TitleN = driver.getTitle();
		
		System.out.println("Title - Window 3 =====>" + TitleN);
		
		driver.switchTo().window(handle);
		
		
		
	}

		public void ImageRead() throws IOException, TesseractException {
			
			WebElement FIS_Img = driver.findElement(By.xpath("//img[@alt='Biz2Credit']"));
			
			File file = FIS_Img.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(file, new File(("C:\\Users\\nipunverma\\Downloads\\Selenium Project_Dnt Delete\\ALLSampleCodes\\test-output\\SS.png")));
		
			ITesseract tess = new Tesseract();
			
			tess.setDatapath(System.getProperty("user.dir"));
			
			String ImageContent = tess.doOCR(file);
			
			System.out.println(ImageContent);
		
		}
	
	
	
}		
		
