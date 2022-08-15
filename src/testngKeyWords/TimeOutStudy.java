package testngKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutStudy {
  @Test(timeOut = 999)
  public void myMethod() throws InterruptedException {
	  
	  Thread.sleep(1000);
	  Reporter.log("valid user");
	  
  }
  @Test(timeOut = 1100)
public void myMethod1() throws InterruptedException {
	  
	  Thread.sleep(1000);
	  Reporter.log("valid user");
}
}
