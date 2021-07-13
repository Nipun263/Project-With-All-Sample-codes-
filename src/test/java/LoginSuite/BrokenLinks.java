package LoginSuite;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Utility.BrowserSetup;

public class BrokenLinks {
	WebDriver driver;
	

	@BeforeMethod
	public void browserIntialization() {
	driver = 	BrowserSetup.StartApplication(driver, "Chrome");
	}
	
	
	
	@Test
	public void brokenLinkTest() throws MalformedURLException, IOException {
		String URL ="https://www.olx.in";
		driver.get(URL);
		
		List<WebElement> TotallinksPresent  = driver.findElements(By.tagName("a"));
		//TotallinksPresent.addAll(driver.findElements(By.tagName("img")));
		int sizeOfList = TotallinksPresent.size();
		System.out.println("Total Links present is" + sizeOfList);
		
		
		
		  List<WebElement> activeLinksOnly = new LinkedList<WebElement>();
		  
		  for(int i =0 ; i<TotallinksPresent.size() ; i++) {
		  
		  if(TotallinksPresent.get(i).getAttribute("href") !=null) {
		  activeLinksOnly.add(TotallinksPresent.get(i));
		  
		  }
		  
		  } System.out.println("Active Links present is" + activeLinksOnly.size());
		 
		
		for(int i=0;i<activeLinksOnly.size();i++) {	
			
		HttpURLConnection HTC = (HttpURLConnection) new URL(activeLinksOnly.get(i).getAttribute("href")).openConnection();
			
		HTC.connect();
		
		String Response  = HTC.getResponseMessage();
		int ResponseCode = HTC.getResponseCode();
	
		
		if(!(ResponseCode==200)) { 
			System.out.println("Link Breaks"); } 
		else {
				System.out.println("Link Working fine !!!!!");
				}
		 
		HTC.disconnect();
		
		}
		
		
		
		
		
		
		
	}
	
	

}
