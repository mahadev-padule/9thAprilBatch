package assertStudyTestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNullAndNotNuall {
  @Test
  public void testCase3() {
	  
	  String m = null ;
	  String p = "Mahi";
	  
	 // Assert.assertNull(p, "p is null then test case is passed");
	  Assert.assertNotNull(p, "p is not null then test case is passed");
	  
  }
}
