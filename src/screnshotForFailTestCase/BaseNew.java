package screnshotForFailTestCase;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class BaseNew {
	 
   static WebDriver driver;

	public void browserLaunch() 
	
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
	
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	} 

    public static void captureSS(String TestCaseID) throws IOException 

    {
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File destination = new File("C:\\Users\\admin\\Pictures\\seleniumSS//Screenshot"+TestCaseID+".png");
	FileHandler.copy(source, destination);
	}

}
