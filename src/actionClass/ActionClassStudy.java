package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassStudy {

	public static void main(String[] args) throws InterruptedException {

		
System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
	Thread.sleep(2000);
	
	// create a action class 
	
	Actions act = new Actions(driver);
	
	WebElement click = driver.findElement(By.xpath("//a[text()='About Us']"));
	Thread.sleep(2000);
	 act.moveToElement(click).perform();
	act.click().perform();
	
	WebElement click1 = driver.findElement(By.xpath("//input[@value='Radio3']"));
	Thread.sleep(2000);
	act.moveToElement(click1).perform();
	act.click().perform();
	
	act.moveToElement(click1).click().build().perform();
	
	act.click().perform();
	
	act.doubleClick().perform();
	
	act.contextClick().perform();
	
		
	}

}
