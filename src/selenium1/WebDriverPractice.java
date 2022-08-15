package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverPractice {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.discoveryplus.in/");
		
		Thread.sleep(2000);
		
		WebElement sign = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
		
		sign.click();
		
		
		
		
	}

}
