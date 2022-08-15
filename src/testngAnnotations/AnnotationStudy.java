package testngAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationStudy {
  @Test
  public void testngMethod() {
	  
	  Reporter.log("user is valid",true);
  }
  
  @BeforeMethod
  
  public void login () {
	  
	  Reporter.log("succesful login done",true);
	  
  }
  
  @AfterMethod
  
  public void logout () {
	  
	  Reporter.log("logout done", true);
	  
  }
  
  @Test
  
  public void myTest() {
	  
	  Reporter.log("this is my 2nd tc", true);
	  
  }
  
  }
  

