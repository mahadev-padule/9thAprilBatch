package dynamicWait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://vctcpune.com/selenium/practice.html");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}

}
