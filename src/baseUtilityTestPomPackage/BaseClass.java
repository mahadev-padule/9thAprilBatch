package baseUtilityTestPomPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	 
	WebDriver driver;

	public void browserLaunch(String BName) 
	
	{
		if(BName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
	
		}
		else if (BName.equals("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver","D:\\setup\\geckodriver-v0.31.0-win64//geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	} 

}
