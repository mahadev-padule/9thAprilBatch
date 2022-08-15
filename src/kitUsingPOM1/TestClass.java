package kitUsingPOM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://kite.zerodha.com/");

		driver.manage().window().maximize();
	
		loginPage loginbutton = new loginPage (driver);
		loginbutton.UserID();
		loginbutton.UserPassword();
		loginbutton.loginButton();
		
		
		Thread.sleep(1000);
		
		PinPage pin = new PinPage(driver);
		pin.pin();
		pin.ContinueButtonClick();
		
		Thread.sleep(1000);
		
		HomePage home = new HomePage(driver);
		
		home.userid();
		home.logOut();
		
		
		
	}

}
