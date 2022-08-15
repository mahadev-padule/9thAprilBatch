package dynamicWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");

		WebElement button = driver.findElement(By.name("enter-name"));
		
		button.sendKeys("Mahiya");
		
	
		
		WebDriverWait wd = new WebDriverWait(driver,Duration.ofMillis(1000));
		
		
		wd.until(ExpectedConditions.invisibilityOf(button));
		
		
	}

}
