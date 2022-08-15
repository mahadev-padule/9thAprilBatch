package testXMLstudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailXmlStudy4 {
	 @Test
	  public void testcase6() {
		  
		  Reporter.log("testcase6 is running",true);
	  }
	  @Test
	  public void testcase7() {
		  
		  Reporter.log("testcase7 is running",true);
	}
	  @Test
	  public void testcase8() {
		  
		  Reporter.log("testcase8 is running",true);
	} @Test
	  public void testcase9() {
		  
		  Reporter.log("testcase9 is running",true);
	}
	@Test
	public void testcase10() {
		  Assert.fail();
		  Reporter.log("testcase10 is running",true);
	}
}
