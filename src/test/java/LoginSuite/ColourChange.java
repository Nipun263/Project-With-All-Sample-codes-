package LoginSuite;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ColourChange {
	
WebDriver driver;
	
	@BeforeSuite
	public  void setUp() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\e5584133\\Downloads\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(900, TimeUnit.SECONDS);
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
