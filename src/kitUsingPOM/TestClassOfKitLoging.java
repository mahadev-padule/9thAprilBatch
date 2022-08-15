package kitUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClassOfKitLoging {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://kite.zerodha.com/");

		driver.manage().window().maximize();
		
		KitLoginPOM login =new KitLoginPOM (driver);
		
		login.UID();
		login.PWD();
		login.LoginB();
		
		Thread.sleep(1000);
		
		KitLoginPinPage pin = new KitLoginPinPage(driver);
		
		pin.PID();
		pin.cButton();
		
		Thread.sleep(2000);
		
		KitHomePage home = new KitHomePage(driver);
		
		home.pinIDButton();
		home.logout();
		
		driver.close();
		
	}

}
