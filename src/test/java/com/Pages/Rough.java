package com.Pages;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;import java.security.AllPermission;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;import org.apache.logging.log4j.core.pattern.EqualsIgnoreCaseReplacementConverter;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.common.PDDestinationOrAction;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.tools.PDFText2HTML;
import org.apache.poi.hssf.record.chart.TextRecord;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.assertj.core.api.CharArrayAssert;
import org.ghost4j.document.PDFDocument;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.json.XML;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;import org.openqa.selenium.devtools.v100.page.model.BackForwardCacheNotRestoredExplanationTree;
import org.openqa.selenium.support.events.internal.EventFiringTouch;
import org.testng.annotations.DataProvider;

import com.lowagie.text.Cell;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.WebElementFacade;

public  class Rough {

	private static final String Continue = null;

	WebDriver driver;

	static int JJ = 10;
	final int b = 200;

	enum Mobile {

		APPLE, SAMSUNG;
	}

	
	
	public static final void main(String[] args) throws Exception {
		Rough RR = new Rough();
		RR.AllPrograms(1,100);
		
	}
	
	
	public void  AllPrograms(int aa , int bb) throws InvalidFormatException, IOException, CsvValidationException, InterruptedException  {
			
		String filePath = System.getProperty("user.dir") + "\\Sample Excel.xlsx";
		
		File file1 = new File(filePath);
		FileReader FR = new FileReader(file1);
		
		int cnt =0;
	
		XSSFWorkbook WB = new XSSFWorkbook(file1);
		
		XSSFSheet sheet = WB.getSheet("UserCredentials");
		
		int rowCount = sheet.getLastRowNum();
		
		int cellCount = sheet.getRow(1).getLastCellNum();
		
		for(int i =0;i<rowCount;i++) {
			XSSFRow roww = sheet.getRow(i);
			
				for(int j =0;j<cellCount;j++) {
					
						XSSFCell cell = roww.getCell(j);
						
							String cellData = cell.toString();
								
								System.out.print(cellData + "   ");
				}
				System.out.println();
		}
		
	}

}



















// *****************************System.out.println();*****************************
//String input = "I work in exilant"; and Output required is "I krow ni tnalixe".
//Write a java program to take a string and return the duplicate characters as a String
//Count of each string  String input = "My Name is Nipun Verma"; *****
//How do you verify that the given list of numbers on a web page is sorted in ascending order?
//Check whether the given string has vowels and count the total number of vowels 
//String input = "Nipun439Verma900Selenium" ----------------> //O/P required is nupiN439amreV900muineleS12
// WAP to find the larger of the two numbers without using if condition
// Validate the two strings are Anagram
// Write Into excel
// Int to String like 123 to one two three
// Duplicates from the given array
// Convert Array to string
//All zeros at the back 
//Print 1 to 100 w/o using for loop 
//Missing //miss num in array
// Count the integers in a array {2,3,6,2,8,3,9,10,8};
// Particular char in String
// Pdf Read
// HashMap and Iterator
// Fabonia
// Get Element from Set
// HashMap & excel Integration
// Excel and Data Provider
// CSV
//Find larger of two number without using if conditon
//How to find the size of small letters in the String
// Text
// Excel
// length of string w/o using length method
// Reverse a string both ways
// ValidateStringIsPalindrome -two ways 
// Pattern
// RemoveComma
// InfiniteLoopExample
// Repeated characters in String
// GetOnlyNumbersOutofString
// Swap two strings
// Swap two numbers
// Compare two lists
// Get particular element from string
// CombineMultipleStringsAndMakeACommonString
// Get a particular value from list and set
// Prime Numbers
// concat two matrics
// Factorial
// String is Anagram