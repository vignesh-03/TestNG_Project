package org.TestNG.features;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Class implements IRetryAnalyzer{
	
	
	int start = 1;
	int end = 3;
	
//over ridden method from IRetryAnalyzer Interface
	public boolean retry(ITestResult result) {
		
		if(start<=end) {
			start ++;
			return true;
		}

		return false;
	}

	
	
}
