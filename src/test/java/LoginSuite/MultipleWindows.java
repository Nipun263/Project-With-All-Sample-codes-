package LoginSuite;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class MultipleWindows {
	
WebDriver driver;
	
	@BeforeSuite
	public  void setUp() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\e5584133\\Downloads\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(900, TimeUnit.SECONDS);
		
	}
	
	
	@Test
	public void handleMultipleWindows() {
	driver.get("https://demoqa.com/browser-windows");
	
	String handle = driver.getWindowHandle();
	
	WebElement newWindow = driver.findElement(By.xpath("//*[@id='windowButton']"));
	newWindow.click();
	
	Set<String> handles = driver.getWindowHandles();
	
	for(String WB : handles) {
		if(!WB.equals(handle)) {
			driver.switchTo().window(WB);
			
	WebElement newWindowText = driver.findElement(By.xpath("//*[@id='sampleHeading']"));
	String textExtracted = newWindowText.getText();
				
	System.out.println("Text Extracted from new window is");
	System.out.print(textExtracted);
	

			
	driver.close();		
			
			
		}
		
	}
		
	WebElement mainPageImg = driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']"));
	Boolean state = mainPageImg.isDisplayed();
	System.out.print("Switched to Home page");
		
		
	}
	
	
	
	
	
	

	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
	
	
}
