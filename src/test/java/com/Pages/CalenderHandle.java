package com.Pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import cucumber.api.java.it.Date;

public class CalenderHandle {
	
	public WebDriver driver;
	
	
	public CalenderHandle(WebDriver driver) {
		this.driver=driver;
	}
	
	
	@FindBy(xpath = "//*[@id='travel_date']")
	WebElement DateTravelPicker;
	
	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[1]/table[1]/thead[1]/tr[1]/th[2]")
	WebElement CurrentDisplayedDate;
	
	@FindBy(xpath = "/html/body/div[6]/div[1]/table/thead/tr[1]/th[2]/preceding-sibling::th")
	WebElement PreviousArrow;
	

	@FindBy(xpath = "/html/body/div[6]/div[1]/table/thead/tr[1]/th[2]/following-sibling::th")
	WebElement NextArrow;
	
	
	@FindBy(xpath = "//*[@id='wrapper']/section/section[1]/div[1]/div/div/div[2]/div/h1")
	WebElement Icon;
	
	public void SelectedDesiredDateAndMonth(String ExpectedDateAndYear) {
		
		/*DateTravelPicker.click();
		
		String DisplayedDateCaptured = CurrentDisplayedDate.getText();
		
		System.out.println(DisplayedDateCaptured);
		 
		while(!(DisplayedDateCaptured.equalsIgnoreCase(ExpectedDateAndYear))) {
			
			String NewDate = CurrentDisplayedDate.getText();
			
			if(!NewDate.equalsIgnoreCase(ExpectedDateAndYear)) {
				NextArrow.click();
			}
			else {
				System.out.println(NewDate);
				break;
			}*/
			
		
			
		
		
			
		}
	
	
	
	
	
}
