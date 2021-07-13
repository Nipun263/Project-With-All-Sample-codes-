package LoginSuite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.BrowserSetup;

public class MultipleCheckBox {
	public static WebDriver driver;

	@BeforeTest
	public void BrowserIntialization() {
		driver = BrowserSetup.StartApplication(driver, "Firefox");
		
	}

	@Test
	public void handleMultipleCheckBoxes() {
		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		

		WebElement singleCheckBox = driver.findElement(By.xpath("//*[@id='check1']/preceding-sibling::div//input"));

		List<WebElement> allcheckBoxes = driver
				.findElements(By.xpath("//*[@id='check1']/preceding-sibling::div//input"));

		

		for (WebElement WB : allcheckBoxes) {
			WB.click();
			if (WB.isSelected()) {
				Assert.assertTrue(true);
				System.out.println("CheckBox clicked!!!");
				
			}
		}

	}

	@AfterTest
	public void tearDown() {
		BrowserSetup.tearDown(driver);
	}

}
