package testngAnnotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class AnnotationStudy3 {
  @Test
  public void myMethod() {
	  
	  Reporter.log("validate userid from myMethod",true);
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  Reporter.log("userid and password match loggin done", true);
  }

  @AfterMethod
  public void afterMethod() {
	  
	  Reporter.log("user logout sucessfuly",true);
  }

  @BeforeClass
  public void beforeClass() {
	  
	  Reporter.log("launch brouser",true);
  }

  @AfterClass
  public void afterClass() {
	  
	  Reporter.log("browser close",true);
  }
  
  @Test
  
  public void myMethod1() {
	  
	  Reporter.log("another validate user",true);
	  
  }

}
