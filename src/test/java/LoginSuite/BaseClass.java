package LoginSuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
WebDriver driver;
	
	@BeforeClass
	public  void setUp() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\e5584133\\Downloads\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(900, TimeUnit.SECONDS);
		

	}

	
	

}
