package com.Pages;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MultipleLinks {

	public static WebDriver driver;

	public MultipleLinks(WebDriver driver) {
		this.driver = driver;
	}

	public void HandleMultipleLinks() throws InterruptedException {

		String title = driver.getTitle();

		System.out.println(title);

		List<WebElement> total_Links = driver.findElements(By.xpath("//h5[contains(text(),'FEATURED')]/following::a"));

		int size = total_Links.size();
		
		String Handle = driver.getWindowHandle();
		
		aa:

		for(int i =0;i<size;i++) {
			
			total_Links.get(i).click();
			
		Set<String> Handles = driver.getWindowHandles();
		
		for(String STR : Handles) {
			if(!Handle.equals(STR)) {
				
				Thread.sleep(1000);
				
				driver.switchTo().window(STR);
				
				Thread.sleep(1000);
				
				String Title = driver.getTitle();
				System.out.println(Title);
				
				driver.close();
				
				driver.switchTo().window(Handle);
				
				
				if(Title.trim().contains("Image Compressor Online, Reduce Image File Size | ImageSmaller")) {
					driver.quit();
					break aa;
				}
			
				
		}
		
		
		}}
	}
	
}
