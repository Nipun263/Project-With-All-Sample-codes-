package LoginSuite;

import org.openqa.selenium.WebDriver;

import Utility.BrowserSetup;

public class DownloadFile {
	
	static WebDriver driver ;
	
	public DownloadFile(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void callBrowser() {
		BrowserSetup.StartApplication(driver, "Chrome");
	}
	
	
	public static void main(String[] args) {
		DownloadFile DL = new DownloadFile(driver);
		DL.callBrowser();
	}

}
