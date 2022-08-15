package screnshotForFailTestCase;

import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseUtilityTestPomPackage.HomePage;
import baseUtilityTestPomPackage.LoginPage;
import baseUtilityTestPomPackage.PinPage;

@Listeners(screnshotForFailTestCase.Listener.class)
public class TestClass extends BaseNew {

	public static LoginPage login;
	PinPage pin;
	HomePage home;

	@BeforeClass

	public void browserInitilize() throws EncryptedDocumentException, IOException

	{
		browserLaunch();
		login = new LoginPage(driver);
		pin = new PinPage(driver);
		home = new HomePage(driver);

	}

	@BeforeMethod
	private void loginApplication() throws EncryptedDocumentException, IOException {

		login.sendUserID(UtilityNew.getDataFromExcelSheet(1, 0));
		login.sendPassword(UtilityNew.getDataFromExcelSheet(1, 1));
		login.clickOnLoginButton();
		Reporter.log("userid and password valid", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		pin.sendPinID(UtilityNew.getDataFromExcelSheet(1, 2));
		pin.clickOnContinue();
		Reporter.log("pin is valid ", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

	}

	@Test
	public void validateUser() throws EncryptedDocumentException, IOException {

		String TestCaseID = "7777";
		String ActualUserID = home.getActualUserID();
		String expectedUserID = UtilityNew.getDataFromExcelSheet(0, 0);
		Assert.assertEquals(ActualUserID, expectedUserID,
				"test case is failed due to actualUserID and expectedUserId not Maching");
		Reporter.log("validate user", true);
     // UtilityNew.captureSS(driver, TestCaseID);
		BaseNew.captureSS(TestCaseID);

	}

	@AfterMethod
	public void LogOutApp() throws InterruptedException {

		home.getActualUserID();
		Thread.sleep(2000);
		home.logout();
		Reporter.log("Application logout", true);

	}

	@AfterClass
	public void browserClose() {
		driver.close();
		Reporter.log("Application close", true);

	}

}
