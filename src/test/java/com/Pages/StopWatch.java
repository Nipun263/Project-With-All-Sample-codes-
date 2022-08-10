package com.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StopWatch {
	
	public static WebDriver driver;
	
	public StopWatch(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(xpath ="//input[@class='gLFyf gsfi']")
	public WebElement serachBox;
	
	
	@FindBy(xpath ="//span[contains(text(),'STOPWATCH')]")
	public WebElement StopWatch;
	
	
	@FindBy(xpath ="//span[contains(text(),'STOPWATCH')]//following::span[@class='act-tim-digit'][1]")
	public WebElement Minute;
	

	@FindBy(xpath ="//*[@id='act-stopwatch-section']/div/div[2]/span[1]/g-button[1]/span[2]")
	public WebElement Start;
	
	@FindBy(xpath ="//span[contains(text(),'STOPWATCH')]//following::span[@class='act-tim-digit'][1]")
	public WebElement MinuteNew;
	
	
	@FindBy(xpath ="//*[@id='act-stopwatch-section']/div/div[2]/span[1]/g-button[1]/span[1]")
	public WebElement Stop;
	
	public void StopWatch_Data() throws InterruptedException {
		
		serachBox.sendKeys("StopWatch");
		
		serachBox.sendKeys(Keys.ENTER);
		
		String text = Minute.getText();
		
		if(!(text.contains("9"))) {
			Start.click();	
		}
		
		
		for(int i =0;i<=100;i++) {
		String MinText = MinuteNew.getText();
		
		System.out.println(MinText);
		Thread.sleep(200);
		
		if((MinText.contains("9"))) {
			Stop.click();	
		break;
		}
		
		}
	
	}

}
