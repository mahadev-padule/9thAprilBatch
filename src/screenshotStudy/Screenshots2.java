package screenshotStudy;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshots2 {

	public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32//chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.get("https://www.amazon.in/");

driver.manage().window().maximize();

File sourc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

String mine = RandomString.make(3);

File destination=new File("C:\\Users\\admin\\Pictures\\Screenshots"+mine+".png");

FileHandler.copy(sourc, destination);

		
		
	}

}
