package com.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DownloadFileUsingRobotClass {
	
	
	public WebDriver driver ;
	
	public DownloadFileUsingRobotClass(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(xpath ="//textarea[@id='textbox']")
	WebElement EnterTxt_TextFile ;
	
	
	@FindBy(xpath ="//button[@id='createTxt']")
	WebElement GenerateFile_TxtFile ;
	
	
	
	@FindBy(xpath ="//*[@id='link-to-download']")
	WebElement DownloadFile_TxtFile ;
	
	

	@FindBy(xpath ="//textarea[@id='pdfbox']")
	WebElement EnterTxt_PDFFile ;
	
	
	@FindBy(xpath ="//button[@id='createPdf']")
	WebElement GenerateFile_PDFFile ;
	
	
	
	@FindBy(xpath ="//a[@id='pdf-link-to-download']")
	WebElement DownloadFile_PDFFile ;
	
	
	
	
	public void downloadFile_RobotClass() throws AWTException, InterruptedException {
		
		JavascriptExecutor JS = (JavascriptExecutor)driver;
		JS.executeScript("window.scrollBy(0,500)", "");
		
		EnterTxt_TextFile.sendKeys("AA");
		
		GenerateFile_TxtFile.click();
		
		DownloadFile_TxtFile.click();
		
		
		Robot robot = new Robot();
		

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
			
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		
		


		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(1000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		//Confirming if the file has been successfully downloaded 
	
		
		File file = new File("C:\\Users\\nipunverma\\Downloads");
		
		String[] filesPresent = file.list();
		
		int NumberOfFile = filesPresent.length;
		
		StringBuffer SF = new StringBuffer();
		
		for(int i =0;i<NumberOfFile;i++) {
			SF.append(filesPresent[i]);
		}
		String FileNameExtracted = SF.toString();
		
		System.out.println("Files Present in Folder ::" + FileNameExtracted);
		
		if(FileNameExtracted.contains("info")) {
			System.out.println("File is downloaded ");
		}
		
	}
	
	
}
