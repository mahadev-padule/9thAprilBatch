package kiteUsingExcelSheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClassUsingExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://kite.zerodha.com/");

		driver.manage().window().maximize();
		
		File myFile = new File("D:\\\\setup//excelWork.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet4");
		
		String UIN = mySheet.getRow(0).getCell(0).getStringCellValue();
		
		String PSW = mySheet.getRow(0).getCell(1).getStringCellValue();
		
		KiteLoginPage login = new KiteLoginPage (driver);
		
		login.SendUserId(UIN);
		login.SendPassword(PSW);
		login.clickOnLoginButton();
		
		Thread.sleep(1000);
		KitePinPage pin = new KitePinPage (driver);
		pin.sendPinId(mySheet.getRow(0).getCell(2).getStringCellValue());
		pin.ClickOnContinue();
		
		Thread.sleep(1000);
		
		KiteHomePage home = new KiteHomePage(driver);
		
		home.clickOnLogout();
		
		driver.close();
	}


}
