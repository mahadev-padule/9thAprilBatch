package kiteLaunchUsingTestNG;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteLaunchValidateUser {

	WebDriver driver;
	File myFile;
	Sheet mySheet;
	KiteLogingPage login;
	KitePinPage pin;
	KiteHomePage home;

	@BeforeClass
	public void launchBrowser() throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		// Reporter.log("kite Browser launch",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		myFile = new File("D:\\\\setup//excelWork.xlsx");
		mySheet = WorkbookFactory.create(myFile).getSheet("Sheet4");
		login = new KiteLogingPage(driver);
		pin = new KitePinPage(driver);
		home = new KiteHomePage(driver);
	}

	@BeforeMethod
	public void logingKite() {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

		login.sendUserID(mySheet.getRow(1).getCell(0).getStringCellValue());

		Reporter.log("Entering userid", true);

		login.sendPassword(mySheet.getRow(1).getCell(1).getStringCellValue());

		Reporter.log("Entering password", true);

		login.clickOnLoginButton();

		Reporter.log("click on login button");
		pin.sendPinID(mySheet.getRow(1).getCell(2).getStringCellValue());

		Reporter.log("Entering pin", true);

		pin.clickOnContinue();

		Reporter.log("click on continue", true);

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

	}

	@Test
	public void validateUser() {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		String expectedId = mySheet.getRow(0).getCell(0).getStringCellValue();
		String actualId = home.getActualUserID();
		Assert.assertEquals(actualId, expectedId, "test case is failled expectedid and actualid is not machhing");
        Reporter.log("test case is pass actual and expected is maching", true);

	}

	@AfterMethod
	public void kiteLogout() throws InterruptedException {
		home.logout();
		Reporter.log("browser logout");
		Thread.sleep(1000);
	}

	@AfterClass
	public void KitePageClose() {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.close();
		Reporter.log("close the browser");

	}

}
