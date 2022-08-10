package com.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fitter {
	public static WebDriver driver;
	
	
	
	
	
	public void logicToRun() {
		
		String driverPath1 = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath1);
		driver=new ChromeDriver(); 
	
		
		driver.get("https://www.fittr.com/login");
		WebElement email = driver.findElement(By.name("email"));
		WebElement Password = driver.findElement(By.name("password"));
		WebElement signInBtn = driver.findElement(By.xpath("//*[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		email.sendKeys("sunitaverma26326@gmail.com");
		Password.sendKeys("Sanjeev43");
		signInBtn.click();
		
		
		
		//Changes 
		WebElement searchBox = driver.findElement(By.xpath("//*[@id='root']/div[3]/div[1]/nav/div[2]/div/ul/li/div/input"));
		searchBox.sendKeys("");
		
		
		
		
		WebElement packageRate = driver.findElement(By.xpath("//*[@id='root']/div[3]/div[2]/main/div[2]/div/div/div[2]/div[1]/div[5]/div[2]/div[2]/button"));
		packageRate.click();
		
		
	
		js.executeScript("window.scrollBy(0,500)", "");
		
		
		WebElement Address = driver.findElement(By.xpath("//button/span[contains(text(),'Make Payment')]//preceding::div[1]"));
		
		WebElement MakePayment = driver.findElement(By.xpath("//button/span[contains(text(),'Make Payment')]"));
		
		
		Address.click();
		MakePayment.click();
		
		
		
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		Fitter FTT = new Fitter();
		FTT.logicToRun();
	}
	
	

}
