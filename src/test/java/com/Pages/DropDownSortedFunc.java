package com.Pages;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownSortedFunc {
	
	public static WebDriver driver ;
	
	
	public DropDownSortedFunc(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void SortFuncVerify() {
		
		JavascriptExecutor JS = (JavascriptExecutor)driver;
		JS.executeScript("window.scrollBy(0,500)", "Scroll Page down");
		
		WebElement fileDD = driver.findElement(By.xpath("//*[@id='files']"));
		
		List<WebElement> WW = driver.findElements(By.xpath("//*[@id='files']/option"));
		List<String> L1 = new LinkedList<String>();

		List<String> L2 = new LinkedList<String>();
		
		
		for(WebElement WB : WW) {
			//System.out.println(WB.getText());
			L1.add(WB.getText());
		}
		
		for(WebElement WB : WW) {
			//System.out.println(WB.getText());
			L2.add(WB.getText());
		}
		
		//Since we have added the elements in the List (L1) .Now lets sort it and then compare
		//with List L2 ,which is not sorted 
		
		Collections.sort(L1);
		
		Boolean flag = L1.equals(L2);
		
	}
	

}
