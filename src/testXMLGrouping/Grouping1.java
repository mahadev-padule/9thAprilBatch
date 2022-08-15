package testXMLGrouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping1 {
	@Test(groups = {"Sanity"})
	  public void a() {
		  
		  Reporter.log("Sanity method is running",true);
	  }
	  @Test (groups = {"Regression"})
	  public void b() {
		  
		  Reporter.log("Regression method is running",true);
	  }
	  @Test (groups = {"Sanity"})
	  public void c() {
		  
		  Reporter.log("Sanity method is running",true);
	  }
	  @Test (groups = {"Regression"})
	  public void d() {
		  
		  Reporter.log("Regression method is running",true);
	  }
	  @Test (groups = {"Sanity"})
	  public void e() {
		  
		  Reporter.log("Sanity method is running",true);
	  }
}
