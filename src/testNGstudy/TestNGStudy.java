package testNGstudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class TestNGStudy {
  @Test
  public void KiteLaunch() {
	  System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://kite.zerodha.com/");

		driver.manage().window().maximize();
	  
  }
  @Test
  public void amazon() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();
  }
}
