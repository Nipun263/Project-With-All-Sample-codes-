package com.TestCases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Pages.ImageRead;
import com.Utility.BrowserFactory;

import net.sourceforge.tess4j.TesseractException;

public class TestCase_ImageReader {
	
	
	public static WebDriver driver ;
	
	@BeforeSuite
	public void IntialiseBrowser() throws MalformedURLException {
	driver =	BrowserFactory.startApplication(driver,"Chrome", "https://www.irctc.co.in/nget/train-search");
	}
	
	
	@Test
	public void TestCase_Handle_Image_Reading() throws TesseractException, IOException {
		ImageRead IR = PageFactory.initElements(driver, ImageRead.class);
		IR.readImageTest();
	}
	
	
	

}
