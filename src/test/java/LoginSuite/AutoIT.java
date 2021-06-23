package LoginSuite;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AutoIT {
	
	WebDriver driver;
	File folder;

	@Test
	public void setUp() throws IOException, InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\e5584133\\Downloads\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(900, TimeUnit.SECONDS);
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		WebElement browseButton = driver.findElement(By.xpath("//*[@name='upfile']"));
		Actions action = new Actions(driver);
		
		action.moveToElement(browseButton).click().build().perform();
		
		
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("C:\\Users\\e5584133\\Desktop\\AutoItScript.exe");
		
		
		
	}
	
	
	
	public void firstMethod() throws InterruptedException {
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	//InetGet-("URL", "filename" [, options = 0 [, background = 0]])------Auto It to download file
	//URL - Working URL
	//Filename - what file name you want to givetttttttttttttt
	//options-$INET_FORCERELOAD 
	//Background- $INET_DOWNLOADBACKGROUND (1) = return immediately and download in the background (see remarks).
			
}
