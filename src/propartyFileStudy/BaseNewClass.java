package propartyFileStudy;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseNewClass
{
	  WebDriver driver ;
	public void openBrowser () throws IOException 
	
	{
		System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(UtilityClass.readDataFromPropertyFile("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
	}

}
