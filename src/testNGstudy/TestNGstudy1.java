package testNGstudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGstudy1 {
  @Test
  public void testngMethod() {
	  
	  
	  System.out.println("this written by in printting statment");
	  
	  Reporter.log("this is written by in reporter statment without boolen");
	  
	  Reporter.log("this is written by in repoter statment with boolen", true);
	  
	  
	  
  }
}
