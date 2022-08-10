package com.Pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HashMapImplementation {
	
	public static WebDriver driver ;
	
	public HashMapImplementation(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void PassUserCredentials() {
		
		WebElement UserName = driver.findElement(By.name("username"));
		
		WebElement Password = driver.findElement(By.name("password"));
		
		UserName.sendKeys(UserNameToPass());
		
		Password.sendKeys(Password());
		
	}
	
	
	public HashMap<String, String> HashMapImplementation() {
		
		HashMap<String,String> HSS = new LinkedHashMap<String,String>();
		
		HSS.put("UserName1", "Nipun:Pass1");
		HSS.put("UserName2", "Nipun11:Pass9");
		HSS.put("UserName3", "Nipun12:Pass8");
		HSS.put("UserName4", "Nipun15:Pass4");
		
		return HSS;
	}
	
	public String UserNameToPass() {
		
		String UserNameExtracted = HashMapImplementation().get("UserName4").toString().split(":")[0];
		
		return UserNameExtracted;
	}
	
	
	public String Password() {
		
		String PasswordExtracted = HashMapImplementation().get("UserName4").toString().split(":")[1];
		
		return PasswordExtracted;
	}
	
	
	
}
