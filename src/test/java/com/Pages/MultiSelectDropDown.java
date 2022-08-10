package com.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {
	
	public static WebDriver driver ;
	
	
	
	public MultiSelectDropDown(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	public void SelectMultipleOptions() {
		
		JavascriptExecutor JS = (JavascriptExecutor)driver;
		JS.executeScript("window.scrollBy(0,750)");
		
		WebElement multipleSelectBox = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[4]/div/form/table/tbody/tr[10]/td[2]/select"));
		
		Select select = new Select(multipleSelectBox);
		
		List<WebElement> multipleSelectBoxOptions = driver.findElements(By.xpath("/html/body/div[1]/div/div[2]/div[4]/div/form/table/tbody/tr[10]/td[2]/select/option"));
		int size = multipleSelectBoxOptions.size();
		
		for(int i =0;i < multipleSelectBoxOptions.size() ;i++) {
			multipleSelectBoxOptions.get(i).click();
		
		}
		
		//Getting the Selected Options 
		
		List<WebElement> LL = select.getAllSelectedOptions();
		
		int size_LL = LL.size();
		
		for(WebElement WB : LL) {
			String Text = WB.getText();
			System.out.println(Text);
		}
		
		System.out.println();
	}
	
}
