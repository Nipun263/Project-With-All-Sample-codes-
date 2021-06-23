package LoginSuite;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SelectClass {
	
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
	public void handleDropdown() {
		driver.get("https://demoqa.com/select-menu");
		
		Select select = new Select(driver.findElement(By.xpath("//*[@id='oldSelectMenu']")));
		
		List<WebElement> LL = select.getOptions();
		
		for(int i =0 ;i <LL.size() ;i++) {
			String ActualColour = LL.get(i).getText();
			System.out.println(ActualColour);	
			
			String expectedColour = "RRHHJJ";
			Boolean State = ActualColour.trim().equals(expectedColour);
			System.out.println(State);
			
		}
		
		
		
	}
	

	
	
	
	
	
	
	/*
	 * @Test public void selectFromDropDown() { Select select = new
	 * Select(driver.findElement(By.id("oldSelectMenu")));
	 * select.selectByVisibleText("Green"); }
	 */
	
	
	
	
	

}
