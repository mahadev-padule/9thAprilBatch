package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Division {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		WebElement click = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		
		click.sendKeys("watches");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		
		
	}

}
