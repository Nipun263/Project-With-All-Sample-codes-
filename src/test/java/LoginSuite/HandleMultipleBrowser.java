package LoginSuite;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Utility.BrowserSetup;

public class HandleMultipleBrowser {
	
	public static WebDriver driver ;
	
	
	@BeforeMethod
	public void browserIntialization() {
	driver = 	BrowserSetup.StartApplication(driver, "Chrome");
	}
	
	@Test
	public void handleBrowserPopUps() {
		driver.get("https://the-internet.herokuapp.com/windows");
		
		String handle = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		System.out.println("Handle is" + handle);
		
		
		System.out.println("Handles are " + handles);
		System.out.println("Size of Handles are " + handles.size());
		
		
		
		for(String STR : handles) {
			if(!STR.equals(handle)) {
				driver.switchTo().window(STR);
			}
			
		}
		WebElement newWindowElement = driver.findElement(By.xpath("//h3[contains(text(),'New Window')]"));
		Boolean State = newWindowElement.isDisplayed();
		
		driver.switchTo().window(handle);
		
	
	
		WebElement parentWindowElement = driver.findElement(By.xpath("//a[contains(text(),'Elemental Selenium')]"));
		Boolean flag = parentWindowElement.isDisplayed();
		
		System.out.println("Swiched back to parent window");
	
	
	}
	
	
	@AfterTest
	public void tearDown() {
		BrowserSetup.tearDown(driver);
		
	}

}
