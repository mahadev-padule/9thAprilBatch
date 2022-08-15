package testXMLstudy;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailXmlStudy2 {
	 @Test
	  public void f() {
		  
		  Reporter.log("f method is running",true);
	  }
	  @Test 
	  public void g() {
	
		  Reporter.log("g method is running",true);
	  }
	  @Test
	  public void h() {
		  Assert.fail();
		  Reporter.log("h method is running",true);
	  }
}
