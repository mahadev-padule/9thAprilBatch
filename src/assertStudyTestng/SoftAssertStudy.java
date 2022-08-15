package assertStudyTestng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertStudy {
  @Test
  public void testcase() {
	  
	  String m = "mahi";
	  String p = "mahi";
	  String s="padule";
	  String a= null;
	  boolean r= true;
	  boolean n= false ;
	  
	  
	  SoftAssert sa = new SoftAssert();
	  
	  sa.assertEquals(m, p," if m&p is not eqaual  then testcase is fail");
	  
	  sa.assertNotEquals(p, s,"if p&s is equal then test case is failled");
	
	  sa.assertNull(a,"a is not null then test case is passed");
	  
	  sa.assertNotNull(s, "s is null then testcase is failed");
	  
	  sa.assertTrue(r, "r is false then test case is failed");
	  
	  sa.assertFalse(n, "n is true then test case is failed");
	  
	  
	  
	  sa.assertAll();
	 
	  
	  
	  
	  
	  
	  
	  
  }
}
