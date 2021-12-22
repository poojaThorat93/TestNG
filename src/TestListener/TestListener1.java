package TestListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener1 implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("On Test Start Method");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("On Success Method");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("On Failure Method");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("On skipped Method");

		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("On TestFailedButWithinSuccessPercentage Method");
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("On Start Method");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("On Finish Method");
		
	}

}
