package LoginSuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class FileUpload {
	
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
	public void uploadFunctionality() {
		driver.get("http://demo.guru99.com/test/upload/");
		WebElement chooseFile = driver.findElement(By.xpath("//*[@id='uploadfile_0']"));
		chooseFile.sendKeys("C:\\Users\\e5584133\\Desktop\\Bala Ji.jpg");
		
		WebElement acceptnce = driver.findElement(By.xpath("//input[@type='checkbox']"));
		acceptnce.click();
		
		WebElement submitBtn = driver.findElement(By.id("submitbutton"));
		submitBtn.click();
		
	}
		

}
