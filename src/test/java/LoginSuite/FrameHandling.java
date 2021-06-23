package LoginSuite;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameHandling {
	WebDriver driver;

	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\e5584133\\Downloads\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(900, TimeUnit.SECONDS);

	}

	public void handleFrames() {
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		JavascriptExecutor JS = (JavascriptExecutor)driver;
		JS.executeScript("window.scrollBy(0,1000)");
		
		driver.switchTo().frame("a077aa5e");
		
		WebElement img = driver.findElement(By.xpath("/html/body/img"));
		img.click();

	}

	public static void main(String[] args) {
		FrameHandling FHH = new FrameHandling();
		FHH.setUp();
		FHH.handleFrames();

	}

}
