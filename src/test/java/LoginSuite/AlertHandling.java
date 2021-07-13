package LoginSuite;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utility.BrowserSetup;
import Utility.CaptureScreenShot;

public class AlertHandling {
	public static WebDriver driver;

	public AlertHandling(WebDriver driver) {
		this.driver = driver;
	}


	public void callBrowser() {
		driver = BrowserSetup.StartApplication(driver, "Firefox");
	}

	
	
	public void   handleAlert() throws IOException, InterruptedException {
		driver.get("http://demo.automationtesting.in/Alerts.html");
		CaptureScreenShot.takeScreenShot(driver);
		List<WebElement> LL = driver.findElements(By.tagName("a"));

		WebElement alertClick = driver.findElement(By.xpath("//*[@onClick='alertbox()']"));

		alertClick.click();

		Alert alert = driver.switchTo().alert();
		// alert.accept();
		String SS = alert.getText();
		System.out.print("Alert handled +      " + SS);

		
	}
	
	public void quitBrowser() {
	driver = 	BrowserSetup.tearDown(driver);
	}

	
	  public static void main(String[] args) throws IOException,
	  InterruptedException { AlertHandling AL = new AlertHandling(driver);
	  AL.callBrowser(); 
	  AL.handleAlert();
	  AL.quitBrowser();
	  
	  }
	 
}
