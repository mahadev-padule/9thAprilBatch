package testngKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnbaledStudy {
	@Test(enabled = false)
	  public void a() {
		 
		  Reporter.log("a method is running",true);
	  }
	  @Test
	  public void f() {
		 
		  Reporter.log("f method is running",true);
	}
	  @Test (enabled = true)
	  public void c() {
		 
		  Reporter.log("c method is running",true);
	  }
	  @Test(enabled = false)
	  public void r() {
		 
		  Reporter.log("r method is running",true);
	}
	  
	  @Test
	  public void e() {
		 
		  Reporter.log("e method is running",true);
	  
	  }
}
