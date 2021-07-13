package LoginSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.List;

import org.openqa.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Utility.BrowserSetup;
import Utility.CaptureScreenShot;
import Utility.CustomListener;



@Listeners(CustomListener.class)
public class FileUpload {
	
WebDriver driver;
	
	@BeforeTest
	public  void setUp() {
		driver= BrowserSetup.StartApplication(driver, "Firefox");
	}
	
	
	
	@Test	
	public void uploadFunctionality() throws IOException, InterruptedException {
		driver.get("http://demo.guru99.com/test/upload/");
		WebElement chooseFile = driver.findElement(By.xpath("//*[@id='uploadfile_0']"));
		
		//CaptureScreenShot.takeScreenShot(driver);
		chooseFile.sendKeys("C:\\Users\\e5584133\\Desktop\\Bala Ji.jpg");
		
		WebElement acceptnce = driver.findElement(By.xpath("//input[@type='checkbox']"));
		
				
		acceptnce.click();
		
		WebElement submitBtn = driver.findElement(By.id("submitbutton"));
		submitBtn.click();
		
		
		
		
	}
		
	
	@AfterTest
	public void tearDownApplication() {
		driver = BrowserSetup.tearDown(driver);
				
	}

	
	
	
}
