package LoginSuite;

import java.util.List;
import Utility.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class AudioCaptcha {

	public WebDriver driver;


	

	@Test(priority = 1)
	public void browserIntialization() {
		driver = BrowserSetup.StartApplication(driver, "Opera");
		
	}

	
	
	
	//@Test(priority = 2)
	public void registerNewUser() {

		driver.get("https://phptravels.org/register.php");

		WebElement FF = driver.findElement(By.xpath("//*[@name='firstname']"));
		WebElement lastname = driver.findElement(By.xpath("//*[@name='lastname']"));
		WebElement email = driver.findElement(By.xpath("//*[@name='email']"));
		WebElement phonenumber = driver.findElement(By.xpath("//*[@name='phonenumber']"));
		WebElement Password = driver.findElement(By.xpath("//*[@name='password']"));
		WebElement ConfirmPassword = driver.findElement(By.xpath("//*[@name='password2']"));
		
		
		Actions action = new Actions(driver);

		FF.sendKeys("ABCD");

		lastname.sendKeys("CDFG");

		email.sendKeys("test@test.com");

		phonenumber.sendKeys("9999999");

		double rNumber = Math.random();
		String PasswordToPass = "Dummy" + rNumber;

		Password.sendKeys(PasswordToPass);

		ConfirmPassword.sendKeys(PasswordToPass);

		JavascriptExecutor JS = (JavascriptExecutor) driver;
		JS.executeScript("window.scrollBy(0,400)");

		List<WebElement> framz = driver.findElements(By.tagName("iframe"));
		int size = driver.findElements(By.tagName("iframe")).size();

		for (int i = 0; i < framz.size(); i++) {

			String TT = framz.get(i).getAttribute("name");

			if (driver.switchTo().frame(TT) != null) {
				System.out.println("Frame Switched");

				JS.executeScript("document.getElementById('recaptcha-anchor').click();");
				
				break;
				
				
			}
			
		}
			driver.switchTo().defaultContent();

			driver.switchTo().frame(driver.findElement(By.xpath("//*[@title='recaptcha challenge']")));
			System.out.println("Frame Switched");

			//Manually clicking on play button on the pop up and then clicking on download- As running it through script it is throwing error
			//Reason : Office security , however you can uncomment below code and run on personal computer it will work
			

			//WebElement playBtn = driver.findElement(By.xpath("//*[@class='button-holder audio-button-holder']"));
			//playBtn.click();

			//WebElement play = driver.findElement(By.xpath("//button[contains(text(),'PLAY')]"));
			//play.click();
			
			//After clicking on dowload button the audio filw will get save in download folder of the machine 
			
			
		}
			
			
		@Test(priority=2)
		public void listenToAudio() {
			driver.get("https://www.google.com/recaptcha/api2/payload/audio.mp3?p=06AGdBq25H0GlvGHSwFIfMgMkgKachT9bBcBFISa7uHzUb9QzpPKvMxYPctkYWSMYDfFrTBtey_OwCiyUTqE23t7Ev1krwmpi_0MVfG2ywWyY6QxpLdQqh_2HKwWQGjF2biPLDwUt1h-Js6-EyWUMr7o4YiYCE9T5bmECONxv69ZeNKLqPRC6JW3fon7lqzIM4IULjU3qlXwVa&k=6LdJtY8UAAAAADTgIWYnG_VKkfNqqB-w8CdQFL7Y");
			
			
		}
	
	
		// registerUser.click();

	}


