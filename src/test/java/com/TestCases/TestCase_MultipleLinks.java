package com.TestCases;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Pages.MultipleLinks;
import com.Utility.BrowserFactory;

public class TestCase_MultipleLinks {
	

	public static WebDriver driver ;
	
	
	@BeforeTest
	public void BrowserIntilisaton() throws MalformedURLException {
	driver = BrowserFactory.startApplication(driver, "Chrome", "https://www.openallurls.com/");
		
	}
	
	@Test
	public void CallMultipleLinks() throws InterruptedException {
		MultipleLinks MLL = PageFactory.initElements(driver,MultipleLinks.class);
		MLL.HandleMultipleLinks();
		
	}

}
