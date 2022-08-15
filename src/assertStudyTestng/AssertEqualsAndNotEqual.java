package assertStudyTestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualsAndNotEqual {
  @Test
  public void TestCase() {
	  
	  String a = "Mahi";
	  String b = "Mahi";
	  String c ="Mahadev";
	  
	  Assert.assertEquals(a, b,"a is not eqaul to b then test case is failled");
	  
	  Assert.assertNotEquals(a, b,"a is equal to c then test case is passed");
	  
  }
}
