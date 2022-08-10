package com.Pages;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.java.en_old.Ac;


public class ListComparision {
	
	public WebDriver driver ;
	
	
	public ListComparision(WebDriver driver ) {
		this.driver=driver;
	}
	
	
	@FindBy(xpath="//select[@name='origin']")
	WebElement option ;
	
	
	
	public void compareTheTwoListElementsAndVerifyDDOptionsIsSorted() {
		
		Select select = new Select(option);
		List<WebElement> DropdownOptions = select.getOptions();
		
		for(WebElement WB : DropdownOptions) {
			String DataExtracted = WB.getText();
			
			System.out.println(DataExtracted);
			
			
		List<String> ActualList = new LinkedList<String>();
		ActualList.add(DataExtracted);
		
		Collections.sort(ActualList);
		
		
		List<String> NewList = new LinkedList<String>();
		NewList.add(DataExtracted);
		
		Boolean flag = ActualList.equals(NewList);
		
		Assert.assertTrue(flag);
			
		}
		
		System.out.println("Hello");
		
	}
	
	
	public void verifiyTwoListAreSame() {

		List<String> DesiredList = new LinkedList<String>();
		DesiredList.add("African-American");
		DesiredList.add("Aboriginal");
		DesiredList.add("Abaluhya");
		DesiredList.add("American");
		DesiredList.add("Anang");
		DesiredList.add("Afghan");
		DesiredList.add("Akan");
		DesiredList.add("Albanian");
		DesiredList.add("African");
		DesiredList.add("Amharic");
		
		
		
		List<String> DesiredList1 = new LinkedList<String>();
		DesiredList1.add("Abaluhya");
		DesiredList1.add("Aboriginal");
		DesiredList1.add("Afghan");
		DesiredList1.add("African-American");
		DesiredList1.add("Akan");
		DesiredList1.add("Albanian");
		DesiredList1.add("African");
		DesiredList1.add("Amharic");
		DesiredList1.add("American");
		DesiredList1.add("Anang");
		
		
		
		//Code to compare 2 list (DesiredList & OriginList)
		
		Collections.sort(DesiredList);
		Collections.sort(DesiredList1);
		
		Boolean flag = DesiredList.equals(DesiredList1);
		
}
}

