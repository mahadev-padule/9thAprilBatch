package assertStudyTestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueAndFalse {
  @Test
  public void testCase2() {
	  
	  boolean m = true;
	  boolean p = false;
	  
	 // Assert.assertTrue(p,"p is true then test case is pass");
	  
	  Assert.assertFalse(p, "p is false then test case is pass");
  }
}
