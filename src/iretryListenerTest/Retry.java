package iretryListenerTest;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer{

	private int count =0;
	private static int maxTry = 2;
	
	@Override
	public boolean retry(ITestResult TestResult) {
		if(!TestResult.isSuccess()) {
			if(count<maxTry) {
				count++;
				TestResult.setStatus(ITestResult.FAILURE);
				return true;
			}else {
				TestResult.setStatus(ITestResult.FAILURE);
			}
		}else {
			TestResult.setStatus(ITestResult.SUCCESS);
			}
		
		return false;
	}
	}


