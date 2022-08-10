package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilityHandle {
	
	static WebDriver driver ;
	
	
	
	public void Case_Without_DesiredCapability() {
		
		String driverPath = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";
		  System.setProperty("webdriver.chrome.driver", driverPath);
		 
		  driver=new ChromeDriver(); 
		  System.out.println("Chrome driver used"); 
		  
		  driver.get("https://www.cacert.com/");
		 
		  //Without using desired capability this site will ask you to accept certifications 
		  //Doing with automation canot be done without help of Desired Cap 
	
	}
		
	public void Case_With_DesiredCapability() {
		
		
		
		String driverPath = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";
		  System.setProperty("webdriver.chrome.driver", driverPath);
		  
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setAcceptInsecureCerts(true); // This will accept the certificates 
		
		  driver=new ChromeDriver(caps); 
		  System.out.println("Chrome driver used"); 
		  
		  driver.get("https://www.cacert.com/");
		  
		  //When Desired capabilty is used , your driver will automatically under what to handle 
		  //In above lines it will accept any insecure certification message 
		  //Desired cap is a class by selenium - whihc has inbuild functions/methods to handle such scanerios 
		  //Browsers like chrome/firefox /IE all have such capabalities like this 
		 
	}
	
		public static void main(String[] args) {
			DesiredCapabilityHandle DC = new DesiredCapabilityHandle();
			DC.Case_With_DesiredCapability();
		}
	
	
	
	
}

	
		
		
	


