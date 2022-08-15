package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickStudu {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().window().maximize();
	Thread.sleep(1000);
	
	Actions at = new Actions(driver);
	
	WebElement click = driver.findElement(By.xpath("//span[text()='right click me']"));
	at.moveToElement(click).contextClick(click).build().perform();
	
	
	
	
	
	}

}
