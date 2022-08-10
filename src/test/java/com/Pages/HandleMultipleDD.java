package com.Pages;

import java.util.List;import org.apache.commons.lang3.mutable.Mutable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HandleMultipleDD {

	public static WebDriver driver;
	

	public HandleMultipleDD(WebDriver driver) {
		this.driver = driver;
	}

	public void handleMultipleDDoptions(String dataToSelect , String dataToSelect1 , String dataToDeseelct) {
	
		
	JavascriptExecutor JS = (JavascriptExecutor)driver;
	JS.executeScript("window.scrollBy(0,1700)", "");

	//WebElement multiSelectBox = driver.findElement(By.xpath("//*[@name='multipleselect[]']"));
	
	//Option 1 : To select multiple records in the DD
	
	//Select select = new Select(multiSelectBox);
	
	//select.selectByValue("msmanual");
	
	//select.selectByValue("msselenium");
		
	
	
	//Option 2 : Using Keyboard opertaions 
	
	List<WebElement> WW = driver.findElements(By.xpath("//*[@name='multipleselect[]']/option"));
	
	int size_list = WW.size();
	
	for (WebElement WB : WW) {
		String data = WB.getText().trim();
		
		
	if(data.equalsIgnoreCase(dataToSelect)) {
	WebElement desiredElementToSelect = driver.findElement(By.xpath("//select[@class='spTextField'][@name='multipleselect[]']/option[contains(text(),'"+dataToSelect+"')]"));
	desiredElementToSelect.click();
	System.out.println("Desired Element selected!!!");
	}
	else if(data.equalsIgnoreCase(dataToSelect1)) {
		WebElement desiredElementToSelect = driver.findElement(By.xpath("//select[@class='spTextField'][@name='multipleselect[]']/option[contains(text(),'"+dataToSelect1+"')]"));
		desiredElementToSelect.click();
		System.out.println("Desired Element selected!!!");
		}
		
	}
	
	
	//Deselect Code (dataToDeseelct)
	
	for (WebElement WB : WW) {
		String data = WB.getText().trim();
		
		
	if(data.equalsIgnoreCase(dataToDeseelct)) {
	WebElement desiredElementToSelect = driver.findElement(By.xpath("//select[@class='spTextField'][@name='multipleselect[]']/option[contains(text(),'"+dataToSelect+"')]"));
	desiredElementToSelect.click();
	System.out.println("Desired Element Deselected !!!");
	}
	
		
	}
	
	}

}
