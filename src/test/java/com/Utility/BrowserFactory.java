package com.Utility;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserFactory {

	public static WebDriver driver;

	public static WebDriver startApplication(WebDriver driver, String browserName, String applicationURL) throws MalformedURLException {
		
		
		if (browserName.equalsIgnoreCase("Firefox")) {
			String driverPath = System.getProperty("user.dir") + "\\Drivers\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", driverPath);
			
			driver = new FirefoxDriver();
			System.out.println("Firefox driver used");
		}

		else if (browserName.equalsIgnoreCase("Chrome")) {
			DesiredCapabilities dcap = new DesiredCapabilities();

			String driverPath1 = System.getProperty("user.dir") + "\\Drivers\\chromedriver11.exe";
			System.setProperty("webdriver.chrome.driver", driverPath1);
			dcap.setAcceptInsecureCerts(true);
			
			//Create a instance of ChromeOptions class
			ChromeOptions options = new ChromeOptions();

			//Add chrome switch to disable notification - "**--disable-notifications**"
			options.addArguments("--disable-notifications");

			driver = new ChromeDriver(options);
			System.out.println("Chrome driver used");
		}

		//This is done for selenium grid 
		
		else if (browserName.equalsIgnoreCase("Remote")) {
			String nodeURL = "http://192.168.29.127:5555/wd/hub";
			
			DesiredCapabilities dcap = new DesiredCapabilities();
			
			ChromeOptions options = new ChromeOptions();
			dcap.setCapability(ChromeOptions.CAPABILITY, options);
			dcap.setBrowserName("chrome");
			dcap.setPlatform(Platform.WIN10);
			
			
			String driverPath1 = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", driverPath1);
		
			driver = new RemoteWebDriver(new URL(nodeURL),dcap);
			System.out.println("Remote WebDriver used#");
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(43));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(90));

		
		driver.get(applicationURL);

		return driver;

	}

	public static WebDriver takeScreenShot(WebDriver driver) throws IOException {

		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			String pathToCollectSS = System.getProperty("user.dir") + "//ScreenShots//";

			File dest = new File(pathToCollectSS + timestamp() + "_TCFail_" + ".png");

			FileUtils.copyFile(scr, dest);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return driver;

	}

	public static String timestamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}

	public static WebDriver closeApplication(WebDriver driver) {
		driver.quit();
		return driver;
	}
	

}
