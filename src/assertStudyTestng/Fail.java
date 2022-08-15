package assertStudyTestng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Fail {
  @Test
  public void testcase4() {
	  
	  Assert.fail();
	  Reporter.log("testcase4 is running",true);
  }
}
