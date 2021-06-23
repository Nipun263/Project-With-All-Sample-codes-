package LoginSuite;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebTables {
	WebDriver driver;

	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\e5584133\\Downloads\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(900, TimeUnit.SECONDS);

	}

	@Test
	public void webtableHandle() {
		driver.get("http://demo.guru99.com/test/web-table-element.php");

		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='leftcontainer']//tbody//tr//a"));
		int size_row = rows.size();
		
		for(int i =0;i<size_row;i++) {
			String name	= 	driver.findElements(By.xpath("//*[@id='leftcontainer']//tbody//tr//a")).get(i).getText();
			System.out.print(" " + name);
		}

		List<WebElement> columns = driver.findElements(By.xpath("//*[@id='leftcontainer']//th"));
		int size_column = columns.size();

	}

}