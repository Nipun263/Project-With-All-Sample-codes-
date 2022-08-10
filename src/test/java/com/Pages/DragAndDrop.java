package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class DragAndDrop {
	
	WebDriver driver ;
	
	public DragAndDrop(WebDriver driver) {
		this.driver = driver ;
	}

	@FindBy(xpath = "//*[@id='credit2']/a[contains(text(),'BANK')]")
	public WebElement source;
	
	@FindBy(xpath = "//*[@id='bank']")
	public WebElement destination;
	
	
	public void HandleDragAndDropUsingActionClass() {
		
		source.click();
		
		Actions action = new Actions(driver);
		action.dragAndDrop(source, destination).perform();
		
		
		
	}
	
	
	
	
	
	
	
	
}
