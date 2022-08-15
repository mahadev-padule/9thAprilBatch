package testNGstudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NormalClass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://kite.zerodha.com/");

		driver.manage().window().maximize();
		
		
		
	}

}
