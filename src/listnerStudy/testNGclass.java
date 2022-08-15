package listnerStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import testngKeyWords.DependsOnMethod;

@Listeners(listnerStudy.Listener.class)

public class testNGclass {
  @Test
  public void TestCase1() 
  {
	  
	  Reporter.log("TestCase1 TC is start",true);
  }
  @Test
  public void TestCase2() 
  {
	  Assert.fail();
	  Reporter.log("TestCase2 TC is start",true);
  
}
  @Test (dependsOnMethods = {"TestCase2"})
  public void TestCase3() 
  {
	  
	  Reporter.log("TestCase3 TC is start",true);
  
}
  
}