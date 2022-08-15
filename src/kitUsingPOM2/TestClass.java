package kitUsingPOM2;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestClass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32//chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--headless");
		
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://kite.zerodha.com/");

		driver.manage().window().maximize();
		
		File myFile = new File("D:\\\\setup//excelWork.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet4");
		
		String UID = mySheet.getRow(0).getCell(0).getStringCellValue();
		String PWD = mySheet.getRow(0).getCell(1).getStringCellValue();
		String PIN = mySheet.getRow(0).getCell(2).getStringCellValue();
		
		KiteLoginPage login = new KiteLoginPage(driver);
		login.sendUserId(UID);
		login.sendPassword(PWD);
		login.ClickOnLoginButton();
		
		Thread.sleep(2000);
		
		KitePinPage pin = new KitePinPage(driver);
		pin.sendPinID(PIN);
		pin.sendOnContinueButton();
		
		Thread.sleep(2000);
		
		KiteHomePage home = new KiteHomePage(driver);
		home.SendUserID (PIN);
		home.clickOnLoginButton();
		
		
		driver.close();
		
		
		
	}

}
