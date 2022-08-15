package dynamicWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitStudy {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

		WebElement button = driver.findElement(By.name("enter-name"));

		button.sendKeys("Mahira");

		FluentWait fw = new FluentWait(driver);
		
		fw.withTimeout(Duration.ofMillis(2000)).pollingEvery(Duration.ofMillis(500));
		
		fw.ignoring(NoSuchElementException.class);
		
	}

}
