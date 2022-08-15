package testXMLGrouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping2 {
	@Test(groups = {"Regression"})
	  public void f() {
		  
		  Reporter.log("Regression method is running",true);
	  }
	  @Test (groups = {"Sanity"})
	  public void g() {
		  
		  Reporter.log("Sanity method is running",true);
	  }
	  @Test (groups = {"Regression"})
	  public void h() {
		  
		  Reporter.log("Regression method is running",true);
	  }
	  @Test (groups = {"Regression"})
	  public void i() {
		  
		  Reporter.log("Regression method is running",true);
	  }
	  @Test (groups = {"Sanity"})
	  public void j() {
		  
		  Reporter.log("Sanity method is running",true);
	  }
}
