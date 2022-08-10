package com.Pages;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class VerifyDropdownSortFunc {
	
	public static WebDriver driver ;
	
	@FindBy(xpath = "//input[@id='autocomplete']//preceding::div[@class='jq-selectbox__dropdown']")
	WebElement Dropdown;
	
	@FindAll({
	@FindBy(xpath = "//input[@id='searchInput']//following::div[@class='jq-selectbox__dropdown'][1]//li"),
	@FindBy(xpath = "//input[@id='searchInput']//following::div[@class='jq-selectbox__dropdown'][1]//l")})
	List<WebElement> Dropdown_Options;
	
	@FindAll({
		@FindBy(xpath = "//input[@id='searchInput']//following::div[@class='jq-selectbox__dropdown'][1]//li"),
		@FindBy(xpath = "//input[@id='searchInput']//following::div[@class='jq-selectbox__dropdown'][1]//l")})
		List<WebElement> Dropdown_Options_New;
		
	
	@FindBy(xpath="//*[@name='category_id']")
	WebElement DD ;
	
	@FindAll({
		@FindBy(xpath = "//*[@name='category_id']/option[contains(text(),'')]"),
		@FindBy(xpath = "//input[@id='searchInput']//following::div[@class='jq-selectbox__dropdown'][1]//l")})
		List<WebElement> DD_Values;
	
	public void verifyDDSorting() {
		
	
	Select select = new Select(DD);
	
	List<WebElement> DropdownValues = select.getOptions();
	int size_List =	DropdownValues.size();
	
	for(WebElement WB :DD_Values ) {
		String Data_Extracted = WB.getText().toString();
		
		
		String STR[] = Data_Extracted.split(" ");
		
		HashMap<String,Integer> HSS = new LinkedHashMap<String,Integer>();
		
		for(int i=0;i<STR.length;i++) {
			
			
			if(HSS.containsKey(STR[i])) {
				HSS.put(STR[i], HSS.get(STR[i])+1);
			}
			else 
			{
				HSS.put(STR[i],1);
			}
			
			
			
		}
		
		
		
	for(Entry<String, Integer> entry : HSS.entrySet()) {
		//System.out.println(entry.getKey() + "    " + entry.getValue());
		
		int count = entry.getValue();
		
		if(count>1) {
			System.out.println(entry.getKey() + "    " + entry.getValue());
		}
	}
		
		
	}
	
	System.out.println("");
		
		
	}

}
