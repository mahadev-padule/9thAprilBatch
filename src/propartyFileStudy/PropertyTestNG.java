package propartyFileStudy;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PropertyTestNG extends BaseNewClass{
 
	POMLoginPage login ;
	POMPinPage pin ; 
	POMHomePage home;
	
	@BeforeClass
	
	public void browserKiteLaunch () throws IOException 
	{
		openBrowser();
		
		login = new POMLoginPage(driver);
		pin = new POMPinPage(driver);
		home = new POMHomePage(driver);
		
	}
	
	@BeforeMethod
	
	public void loginKiteApp () throws IOException, InterruptedException 
	{
		
	    Reporter.log("UserId is validate",true);
		login.sendUserID(UtilityClass.readDataFromPropertyFile("UN"));
		Reporter.log("Password is validate",true);
		login.sendPassword(UtilityClass.readDataFromPropertyFile("PWD"));
		Reporter.log("login Success move to the pin page",true);
		login.clickOnLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		Reporter.log("pin is validate",true);
	    pin.sendPinID(UtilityClass.readDataFromPropertyFile("PIN"));
	    Reporter.log("Kite App launch",true);
        pin.clickOnContinue();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	
	@Test
	
	 public void ValidateKiteUser() throws IOException 
	{
		int TestCaseID =5857;
		Reporter.log("valid user",true);
		String actualUserId = home.getActualUserID();
		String expectedUserId = UtilityClass.readDataFromPropertyFile("UN");
		Assert.assertEquals(actualUserId, expectedUserId,  "Test Case failed actual and expected not matching");
		Reporter.log("ScreenShot taken",true);
		UtilityClass.captureScreenshot(driver, TestCaseID);
	}
	
	@AfterMethod
	  public void LogoutKiteApp () throws InterruptedException
	   {
		Reporter.log("Kite App logout",true);
		Thread.sleep(1000);
		home.logout();
		}

	@AfterClass
	
	public void closeKiteApp() throws InterruptedException 
	{
		Thread.sleep(1000);
		Reporter.log("Kite App Close",true);
		driver.close();
		
	}
	
}

