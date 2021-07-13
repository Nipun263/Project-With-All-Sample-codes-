package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;



public class BrowserSetup {
	
	public static WebDriver driver;

	@BeforeSuite
	public static WebDriver StartApplication(WebDriver driver , String BrowserName) {
		String path = System.getProperty("user.dir");
		
		
		if (BrowserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", path + "/Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println("Firefox driver used");
		}
		
		else if(BrowserName.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver", path + "/Drivers/chromedriver.exe");
		driver=new ChromeDriver();  
		System.out.println("Chrome driver used");
			
		}
		
		else if(BrowserName.equalsIgnoreCase("Opera")) {
			System.setProperty("webdriver.opera.driver", path + "/Drivers/operadriver.exe");
			driver = new  OperaDriver();
			System.out.println("Opera driver used");	
				
			}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		return driver ;
		
		
	}
	
	@AfterSuite
	public static  WebDriver tearDown(WebDriver driver ) {
		driver.quit();
		
		return driver ;
	}
	
}