package testngKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethod {
  @Test (dependsOnMethods = {"R"})
  public void M () {
	  
	  Reporter.log("M is running " , true);
  }
  @Test 
  
  public void R() {
	  
	  Reporter.log("R is running ", true);
  }
  
}
