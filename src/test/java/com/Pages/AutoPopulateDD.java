package com.Pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AutoPopulateDD {
	
	public WebDriver driver ;

	public AutoPopulateDD(WebDriver driver) {
		this.driver=driver;
	}
	

	@FindBy(xpath="//a[@data-cy='mmtLogo']")
	WebElement MMT_Image;
	
	
	@FindBy(xpath="//span[@data-cy='defaultFromValue']")
	WebElement from;
	

	@FindBy(xpath="//*[@class='langCard  fixedCard bounceAni']")
	WebElement Advertisement;
	
	@FindBy(xpath="//*[@class='langCardClose']")
	WebElement closeAdvertisement;
	
	
	
	public void sourceCity(String DesiredCity) {
	
	if(Advertisement.isDisplayed()) {
		closeAdvertisement.click();
	}
		
		
	JavascriptExecutor JS = (JavascriptExecutor)driver;
	JS.executeScript("arguments[0].click();", MMT_Image);
	
	JS.executeScript("arguments[0].click();", from);
	
	
		
	List<WebElement> LL = driver.findElements(By.xpath("//ul[@role='listbox']//p[1]"));
	WebElement DesiredCityToSelect = driver.findElement(By.xpath("//ul[@role='listbox']//p[1][contains(text(),'"+DesiredCity+"')]"));
	
	String SS = DesiredCityToSelect.getText();
	int size = LL.size();
	
	for(WebElement WB : LL) {
		String fromCity = WB.getText();
	System.out.println("From city ::" + fromCity);	
	
		
		if(fromCity.trim().contains(SS)) {
		Actions action = new Actions(driver);
		action.moveToElement(DesiredCityToSelect).doubleClick(DesiredCityToSelect).build().perform();
		break;
		}
	
	}
		
	}
	
	public void startSelectingValuesFromSecond() {
		
		List<WebElement> colors = driver.findElements(By.xpath("//*[@id='oldSelectMenu']/option"));
		int size = colors.size();
		
		WebElement colr =driver.findElement(By.xpath("//*[@id='oldSelectMenu']"));
		
		for(int i = 2;i<size;i++) {
			
		Select select = new Select(colr);
		
		select.selectByIndex(i);
		
		}
		
		
		
	}
	
	
}
