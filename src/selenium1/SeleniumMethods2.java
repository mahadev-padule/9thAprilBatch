package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethods2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32//chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://accounts.google.com/");
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("//span[text()='Create account']"));
		
		button.click();
		
		Thread.sleep(2000);
		
		WebElement button1 = driver.findElement(By.xpath("//span[text()='For myself']"));
		button1.click();
		
		Thread.sleep(2000);
		WebElement button2 = driver.findElement(By.name("firstName"));
		button2.sendKeys("mahadev");
		
		Thread.sleep(2000);
		
		WebElement button3= driver.findElement(By.name("lastName"));
		button3.sendKeys("padule");
		
		Thread.sleep(2000);
		
		WebElement button4= driver.findElement(By.name("Username"));
		button4.sendKeys("mahadevpadule");
		
		Thread.sleep(2000);
		
		WebElement button5= driver.findElement(By.name("Passwd"));
		button5.sendKeys("Mahadev1996");
		
		Thread.sleep(2000);
		
		WebElement button6= driver.findElement(By.name("ConfirmPasswd"));
		button6.sendKeys("Mahadev1996");
		
		Thread.sleep(2000);
		
		WebElement button7 = driver.findElement(By.xpath("//input[@class='VfPpkd-muHVFf-bMcfAe']"));
		button7.click();
		
		
	}

}
