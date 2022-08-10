package com.Pages;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class TextFileReader {

	WebDriver driver;

	public TextFileReader(WebDriver driver) {
		this.driver = driver;
	}

	public void readTextFile() throws IOException {

		String basePath = System.getProperty("user.dir");

		String fileToRead = basePath + "\\SalesforceTraining.txt";

		File file = new File(fileToRead);

		FileReader FR = new FileReader(fileToRead);

		BufferedReader BB = new BufferedReader(FR);

		String data;

		while ((data = BB.readLine()) != null) {

			int ii = data.length();

			for (int i = 0; i <= data.length(); i++) {
				System.out.println(data);
				break;
			}
		}

	}

	public void readCSVFile() throws CsvValidationException, IOException {

		String basePath = System.getProperty("user.dir");

		String fileToRead = basePath + "\\CSVFILE.csv";

		File file = new File(fileToRead);

		FileReader FR = new FileReader(fileToRead);

		CSVReader CR = new CSVReader(FR);

		String data[];

		while ((data = CR.readNext()) != null) {

			for (int i = 0; i < data.length; i++) {
				System.out.println(data[i]);
			}
		}
	}

	public void excelFileRead() throws IOException, InvalidFormatException {

		String basePath = System.getProperty("user.dir");

		String fileToRead = basePath + "\\Sample Excel.xlsx";

		File file = new File(fileToRead);

		FileReader FR = new FileReader(fileToRead);

		XSSFWorkbook WB = new XSSFWorkbook(file);

		XSSFSheet sheet = WB.getSheet("Data43");

		int rowCount = sheet.getLastRowNum();

		for (int i = 0; i <= rowCount; i++) {

			XSSFRow roww = sheet.getRow(i);

			int cellCount = roww.getPhysicalNumberOfCells();

			for (int j = 0; j < cellCount; j++) {

				XSSFCell cell = roww.getCell(j);
				
				String cellData = cell.toString();
				System.out.print(cellData + " ");
				
			}
			System.out.println();
		}

	}

	public void jsonFileRead() {

	}

}
