package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ToolTip {

	public WebDriver driver ;
	
	public ToolTip(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void ToolTip() {
		
		WebElement HoverButton = driver.findElement(By.xpath("//button[@id='toolTipButton']"));
		
		WebElement HoverTextField  = driver.findElement(By.xpath("//input[@id='toolTipTextField']"));
		
		
		Actions action = new Actions(driver);
		
		action.clickAndHold(HoverButton).build().perform();
		
		WebElement OnHover_HoverButton = driver.findElement(By.xpath("//div[@class='tooltip-inner'][contains(text(),'You hovered over the Button')]"));
		
		Boolean State = OnHover_HoverButton.isDisplayed();
		
		String TextOnHover = OnHover_HoverButton.getText();
		
		System.out.println(State);
		
		System.out.println(TextOnHover);
		
		
		
	}

}
