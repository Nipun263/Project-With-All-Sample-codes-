package com.TestCases;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.Pages.PaginationVerify;
import com.Utility.BrowserFactory;
import com.Utility.CustomListners;



@Listeners(CustomListners.class)
public class TestCase_Pagination {

	public static WebDriver driver;
	
	
	@BeforeSuite
	public void intializeBrowser() throws IOException, InterruptedException {
		driver = BrowserFactory.startApplication(driver, "Chrome", "https://www.google.com");
				
		
	}
	
	
	
	@Test
	public void testCase_VerifyPagination() {
		PaginationVerify PV = PageFactory.initElements(driver, PaginationVerify.class);
		PV.verifyPagination();
		
	}


	
	
	@AfterTest
	public void close_Browser() {
		driver = BrowserFactory.closeApplication(driver);
		
		
	}

	
	
}
