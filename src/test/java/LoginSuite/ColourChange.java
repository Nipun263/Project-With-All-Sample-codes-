package LoginSuite;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Utility.BrowserSetup;

public class ColourChange {
	
WebDriver driver;
	

@BeforeMethod
public void browserIntialization() {
driver = 	BrowserSetup.StartApplication(driver, "Chrome");
}

	
	@Test
	public void verifyColourChange() {
		driver.get("https://www.tutorialspoint.com/index.html");
		
		WebElement ITBtn = driver.findElement(By.xpath("//*[@title='tutorialspoint library'][contains(text(),'Latest')]/following::ul[1]//a[contains(text(),'IT')]"));
									
		Boolean State = ITBtn.isDisplayed();
		
		Assert.assertTrue(State);
		
		String colour = ITBtn.getCssValue("background-color");
		
		String backGrndcolour = ITBtn.getCssValue("color");
		
		System.out.println("Colour of the Button before hover is  " +  colour);
		
		System.out.println("Background Colour of the Button before hover is " +  backGrndcolour);
		
		//Hover Mouse on GATE and check the value of the GATE Option
		
		ITBtn.click();	
		
		
		String colourAfterChange = ITBtn.getCssValue("background-color");
		
		String backGrndcolourAfterChange = ITBtn.getCssValue("color");
		
		
		System.out.println("Colour of the Button after hover is  " +  colourAfterChange);
		
		System.out.println("Background Colour of the Button after hover is " +  backGrndcolourAfterChange);
		
		
		
	}
	
	
	
	
}
