package LoginSuite;

import java.util.concurrent.TimeUnit;

import org.mozilla.javascript.JavaScriptException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ToolTip {
	WebDriver driver;

	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\e5584133\\Downloads\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(900, TimeUnit.SECONDS);

	}

	
	@Test
	public void handleToolTip() throws InterruptedException {
		driver.get("https://demoqa.com/tool-tips/");
		
		WebElement hoverToSeeBtn = driver.findElement(By.xpath("//*[@class='btn btn-success']"));
		Actions action = new Actions(driver);
		action.clickAndHold(hoverToSeeBtn).build().perform();
		
		WebElement hoverMessage = driver.findElement(By.xpath("//*[@aria-describedby='buttonToolTip']"));
		Boolean state = hoverMessage.isDisplayed();
		System.out.println("Hover Message is present *********");
		System.out.println(state);
		
		String txtMsg = hoverMessage.getText();
		
		System.out.println("Hover Message is ");
		System.out.print(txtMsg);
		
		
	}
	
	
	

}
