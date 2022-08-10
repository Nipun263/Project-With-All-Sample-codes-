package com.Pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;

public class DataBaseConnectivity {
	
	public static WebDriver driver ;
	
	
	public DataBaseConnectivity(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void ConnectDB() throws ClassNotFoundException, SQLException {
		
	Class.forName("com.mysql.jdbc.Driver");
	
	System.out.println("Driver Loaded");
	
	Connection conn = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/nipuntestdb","nipuntestdb","Sanjeev43");
	
	System.out.println("Connection to MYSQL");
	
	Statement statmnt = conn.createStatement();
	
	ResultSet RS = statmnt.executeQuery("SELECT * FROM `SampleTableNipun`");
	
	while(RS.next()) {
		String FirstNameExtracted =  RS.getString("Name");
		
		System.out.println("FirstName from DB is " +  FirstNameExtracted);
	}
		
	}

}
