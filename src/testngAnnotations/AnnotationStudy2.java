package testngAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationStudy2 {
  @Test
  public void validateUser() {
	  
	 Reporter.log("user is validate", true);
	  
  }
  
  @BeforeClass
  
  public void launchBrowser () {
	  
	  Reporter.log("browser is launch", true);
	  
  }
  
  @BeforeMethod
  
  public void login() {
	  
	  Reporter.log("userid and password is correct login succesfully",true);
  }
  
  @AfterMethod
  
  public void logout() {
	  
	  Reporter.log("user logout accont successful ", true);
	  
  }
  
  @AfterClass
  
  public void closeBrowser() {
	  
	  Reporter.log("browser clossed succesfully", false);
	  
  }
  
}
