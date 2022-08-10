package com.TestCases;

import java.io.IOException;
import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Pages.WindowHandles;
import com.Utility.BrowserFactory;

import net.sourceforge.tess4j.TesseractException;

public class TestCase_MultipleWindowHandle {
	
	
	public static WebDriver driver ;
	
	@BeforeTest
	public void BrowserIntialization() throws MalformedURLException {
		driver = BrowserFactory.startApplication(driver, "Chrome", "https://www.naukri.com/");
		
	}
	
	
	@Test
	public void Handle_Window_Handles() throws IOException, TesseractException {
		
		WindowHandles WC =	PageFactory.initElements(driver, WindowHandles.class);
		WC.HandleMultipleWindows_Switching_To_Particular_Window();
		//WC.ImageRead();
		
	}

}
