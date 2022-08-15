package testNGstudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGtest {
  @Test
  public void launchKite() {
	  
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://kite.zerodha.com/");

		driver.manage().window().maximize();
	  
  }
}
