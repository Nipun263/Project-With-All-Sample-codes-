package com.TestCases;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Pages.DataBaseConnectivity;

public class TestCase_DataBaseConnection {
	
	
	public static WebDriver driver ;

	@Test
	public void TestCase_ConnectDB() throws ClassNotFoundException, SQLException {
		DataBaseConnectivity DB = 	PageFactory.initElements(driver, DataBaseConnectivity.class);
		DB.ConnectDB();
	}

}
