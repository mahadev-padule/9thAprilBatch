package screnshotForFailTestCase;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener extends BaseNew implements ITestListener {
	
	BaseNew b = new BaseNew();
	
	
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
		String TestCaseID=result.getName();
		
		
	try {
		BaseNew.captureSS(TestCaseID);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	Reporter.log("test case is failled " +result.getName(),true);
	}
	
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("test case execution is succesfull " +result.getName(),true);
		
	}
	
	
	

}
