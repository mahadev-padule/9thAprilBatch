package serialParallelStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo2 {
	@Test
	  public void flipkartLaunch() {
		  System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32//chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();

			driver.get("https://www.flipkart.com/");

			driver.manage().window().maximize();
}
	@Test
	  public void policyBajarLaunch() {
		  System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32//chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();

			driver.get("https://www.acko.com/");

			driver.manage().window().maximize();
	}
}
