package listnerStudy;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) 
	{
		Reporter.log("Test Case execution is start " +result.getName(),true);
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result)
	{
		
		Reporter.log("test case is skipped " +result.getName(),true);
		
	}
	
	@Override
	public void onTestFailure(ITestResult result) 
	{
		
		Reporter.log("test case is failled " +result.getName(),true);
	}
	
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("test case execution is succesfull " +result.getName(),true);
		
	}
	
}
