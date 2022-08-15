package testngKeyWords;

import org.testng.Reporter;

import org.testng.annotations.Test;

public class InnvocationCountStudy {
	@Test(invocationCount = 3)
	  public void myMethod() {
		  
		  Reporter.log("validate userid from myMethod",true);
	
	  }

}
