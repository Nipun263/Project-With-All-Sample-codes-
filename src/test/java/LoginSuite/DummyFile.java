package LoginSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.BrowserSetup;

public class DummyFile {
	
	WebDriver driver ;
	
	WebElement d;
	
	public void M1() {
		String S1 = "Nipun        Verma ";
		String S2 = S1.replace(" ", "");
		
		String S3 = S2.replace("V", " V");
		
		
		System.out.println(S3);
		

		
	
	}
	
	
	
	@Test
	public void M2() {
		String S1 = "nipun.verma@tester.com";
		
		int length_Email = S1.length();
		
		System.out.println(length_Email);
	}
}
