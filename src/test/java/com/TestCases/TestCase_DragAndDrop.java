package com.TestCases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Pages.DragAndDrop;
import com.Utility.BrowserFactory;
import com.opencsv.exceptions.CsvValidationException;

public class TestCase_DragAndDrop {
	
	
WebDriver driver ;
	
	@BeforeTest
	public void browserIntialization() throws MalformedURLException {
	driver = 	BrowserFactory.startApplication(driver, "chrome", "http://demo.guru99.com/test/drag_drop.html");
	}
	
	
	@Test
	public void DragAndDropFunctionality() throws CsvValidationException, IOException {
		DragAndDrop DD =	PageFactory.initElements(driver, DragAndDrop.class);
		DD.HandleDragAndDropUsingActionClass();
	}
	
	
	

	

}

