package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframe2 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("frame1");
		Thread.sleep(2000);
		
	driver.findElement(By.tagName("input")).sendKeys("selenium");
	
	driver.switchTo().frame("frame3");
	
	driver.findElement(By.id("a")).click();
	
	Thread.sleep(2000);
	
	driver.switchTo().defaultContent();
	
	driver.switchTo().frame("frame2");
	Thread.sleep(2000);
	WebElement click = driver.findElement(By.id("animals"));
	
	Select s= new Select(click);
	
	s.selectByValue("big baby cat");
	
	}

}
