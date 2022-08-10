package com.Pages;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class CsvFileReader {

	WebDriver driver ;
	
	public CsvFileReader(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	public void readCSVFileCode() throws CsvValidationException, IOException {
		
		
		String path = System.getProperty("user.dir") + "\\CSVFILE.csv";
		
		File file = new File(path);
		
		FileReader FR = new FileReader(file);
		
		CSVReader CR = new CSVReader(FR);
		
		String[] data;
		
		while((data=CR.readNext())!=null) {
			for ( int i = 0 ; i < data.length ; i ++) {
					System.out.print(data[i]);
			}
		}
		
	}
	
		
		public void textFileRead() throws IOException {
			
			String path = System.getProperty("user.dir") + "\\SalesforceTraining.txt";
			
			File file = new File(path);
			
			FileReader FR = new FileReader(file);
			
			BufferedReader BR = new BufferedReader(FR);

			String data;
			
			while((data=BR.readLine())!=null) {
				for ( int i = 0 ; i < data.length() ; i ++) {
					System.out.println(data);
					break;
			}
				
			}
			
			
			
			
	}
		
		
	}
		


	