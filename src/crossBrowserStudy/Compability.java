package crossBrowserStudy;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Compability {
  @Test
  public void testCase1(String BrowserType) {
	  
	  WebDriver driver = null;
	  
	  if(BrowserType.equals("firefox")) {
		  
		  System.setProperty("webdriver.gecko.driver", "D:\\setup\\geckodriver-v0.31.0-win64//geckodriver.exe");
		  
		   driver = new FirefoxDriver();
		   driver.get("https://www.google.com/");
	  }
	  else if (BrowserType.equals("chrome")) {
		  
		  System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32//chromedriver.exe");
		  
			 driver = new ChromeDriver();
		
	}
	  
	  driver.manage().window().maximize();
	  driver.get("https://www.youtube.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	  
	  
  }
}
