package Utility;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class CustomListener  implements ITestListener {

	public static WebDriver driver;
	
	// Not all the methods are abstarct and are from interface ITestListner -> Right
	// click on ItestListner and go to source and Override/implement
	
	

	public  void onTestStart(ITestResult result,WebDriver driver) {
		System.out.println("Pass Test Case!!!!");
		
		try {
			CaptureScreenShot.takeScreenShot(driver);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}

	public void  onTestSuccess(ITestResult result,WebDriver driver) {
		System.out.println("Pass Test Case!!!!");
		
		try {
			CaptureScreenShot.takeScreenShot(driver);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	

	public  void onTestFailure(ITestResult result,WebDriver driver) {
		System.out.println("Failed Test Case!!!!");
		
		try {
			CaptureScreenShot.takeScreenShot(driver);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	

}
