package page_Scroll_Up_Down;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendkeyUsingJavaScript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://vctcpune.com/selenium/practice.html");

		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		WebElement name = driver.findElement(By.name("enter-name"));
	    WebElement radio = driver.findElement(By.xpath("(//input[@type='radio'])[4]"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView;",name);
		
		name.sendKeys("Mahiya");
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView;",radio);
		radio.click();
		
		
		
		
		
		
	}

}
