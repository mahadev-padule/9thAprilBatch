package testngKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityStudy {
  @Test(priority = 2)
  public void a() {
	 
	  Reporter.log("a method is running",true);
  }
  @Test (priority = 2)
  public void f() {
	 
	  Reporter.log("f method is running",true);
}
  @Test
  public void c() {
	 
	  Reporter.log("c method is running",true);
  }
  
  @Test(dependsOnMethods = {"e"}, invocationCount = 3 , priority = -2)
  public void r() {
	 
	  Reporter.log("r method is running",true);
}
  
  @Test
  public void e() {
	 
	  Reporter.log("e method is running",true);
  
  }
}