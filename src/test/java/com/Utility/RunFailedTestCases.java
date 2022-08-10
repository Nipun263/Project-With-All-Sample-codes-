package com.Utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RunFailedTestCases  implements IRetryAnalyzer {
	 
	  private int retryCount = 0;
	  private static final int maxRetryCount = 3;
	 
	  
	  public boolean retry(ITestResult result) {
	    if (retryCount < maxRetryCount) {
	      retryCount++;
	      return true;
	    }
	    return false;
	  }
	}
