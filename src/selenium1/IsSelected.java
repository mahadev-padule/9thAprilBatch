package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32//chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
	driver.get("https://www.facebook.com/");
	
	
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	WebElement CreateButton = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	
	CreateButton.click();
	
	Thread.sleep(5000);
	
	}

}
