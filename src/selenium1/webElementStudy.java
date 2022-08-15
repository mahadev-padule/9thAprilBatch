package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElementStudy {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/reg/?rs=7");
		
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("jhoom jhoom");
		
		//clear method 
		
		// driver.findElement(By.xpath("//input[@name='search_query']")).clear();
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
	}

}
