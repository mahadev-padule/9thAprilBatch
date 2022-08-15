package crossBrowserStudy;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirefoxLaunch {
  @Test
  public void testcase() {
	  
	  System.setProperty("webdriver.gecko.driver", "D:\\setup\\geckodriver-v0.31.0-win64//geckodriver.exe");
	  
	  WebDriver driver = new FirefoxDriver();
	  
	  driver.manage().window().minimize();
	  
	  driver.get("https://kite.zerodha.com/");
	  
	 
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	  
	  
  }
}
