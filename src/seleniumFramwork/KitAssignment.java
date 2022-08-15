package seleniumFramwork;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KitAssignment {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32//chromedriver.exe");

		
		File myFile = new File("D:\\setup//excelWork.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet4");
		
		String userId = mySheet.getRow(0).getCell(0).getStringCellValue();
		
		String password = mySheet.getRow(0).getCell(1).getStringCellValue();
		
		String logingButton = mySheet.getRow(0).getCell(2).getStringCellValue();
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://kite.zerodha.com/");

		driver.manage().window().maximize();

		WebElement userID = driver.findElement(By.id("userid"));
		WebElement passWord = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

		userID.sendKeys(userId);
		passWord.sendKeys(password);
		loginButton.click();

		Thread.sleep(2000);

		WebElement pinID = driver.findElement(By.id("pin"));
		WebElement continueBotton = driver.findElement(By.xpath("//button[@type='submit']"));

		pinID.sendKeys(logingButton);
		continueBotton.click();
		
		Thread.sleep(2000);
		
		WebElement Uid = driver.findElement(By.xpath("//span[@class='user-id']"));

		String ExpectedResult = "ELR321";
		String AutulResult = Uid.getText();

		if (ExpectedResult.equals(AutulResult)) {
			System.out.println("Test Case is pass");
		} else {
			System.out.println("Test Case is Fail ");
		}

		Uid.click();
		WebElement logOut = driver.findElement(By.xpath("//a[@target='_self']"));
		logOut.click();
		driver.close();
		
	}

	}


