package findElementsStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicElements {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	Thread.sleep(2000);
	
		driver.findElement(By.name("q")).sendKeys("Samsung M30");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	Thread.sleep(5000);
		WebElement review = driver.findElement(By.xpath("((//div[@class='col col-7-12'])[1]//span)[6]"));
		System.out.println(review.getText());
		
		
	}

}
