package screenshotStudy;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot1 {

	public static void main(String[] args) throws InterruptedException, IOException {
System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1000);
		
		File mine = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String random = RandomString.make(4);
		

		File destination=new File("C:\\Users\\admin\\Pictures\\seleniumSS//Screenshot"+random+".png");
		
		
		
		
		FileHandler.copy(mine, destination);
	}

}
