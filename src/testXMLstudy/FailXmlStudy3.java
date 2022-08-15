package testXMLstudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailXmlStudy3 {
  @Test
  public void testcase1() {
	  
	  Reporter.log("testcase1 is running",true);
  }
  @Test
  public void testcase2() {
	  Assert.fail();
	  Reporter.log("testcase2 is running",true);
}
  @Test
  public void testcase3() {
	  
	  Reporter.log("testcase3 is running",true);
} @Test
  public void testcase4() {
	  
	  Reporter.log("testcase4 is running",true);
}
@Test
public void testcase5() {
	  Assert.fail();
	  Reporter.log("testcase5 is running",true);
}
}
