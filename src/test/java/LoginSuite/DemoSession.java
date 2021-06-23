package LoginSuite;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utils.ExcelData;

public class DemoSession extends ExcelData {

	WebDriver driver;

	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\e5584133\\Downloads\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(900, TimeUnit.SECONDS);

	}

	@Test()
	public void scanerioTested(String ABCD) throws InterruptedException{
		
		driver.get("https://demoqa.com/tool-tips");
		
		Thread.sleep(3000);
		
		WebElement hoverToSee = driver.findElement(By.xpath("//button[contains(text(),'Hover me to see')]"));
		Actions action = new Actions(driver);
		action.moveToElement(hoverToSee).clickAndHold(hoverToSee).build().perform();
		
		
		WebElement tt = driver.findElement(By.xpath("//*[contains(@class,'tooltip')]"));
		String ttt = tt.getText();
		System.out.print("Text Extracted = " + ttt);
		Boolean abc = tt.isDisplayed();
	}
	
	
		
	


	@AfterSuite
	public void tearDown() {
		driver.quit();

	}

}
