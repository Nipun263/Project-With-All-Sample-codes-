package LoginSuite;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AlertHandling {

	WebDriver driver;

	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\e5584133\\Downloads\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(900, TimeUnit.SECONDS);

	}

	@Test
	public void handleAlert() {
		driver.get("http://demo.automationtesting.in/Alerts.html");
		List<WebElement> LL = driver.findElements(By.tagName("a"));

		WebElement alertClick = driver.findElement(By.xpath("//*[@onClick='alertbox()']"));

		alertClick.click();

		Alert alert = driver.switchTo().alert();
		// alert.accept();
		String SS = alert.getText();
		System.out.print("Alert handled +      " + SS);

	}

}
