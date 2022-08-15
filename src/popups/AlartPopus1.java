package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlartPopus1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
	     Thread.sleep(2000);
		driver.findElement(By.id("alertBox")).click();
		Alert click = driver.switchTo().alert();
		 Thread.sleep(2000);
		click.accept();
		
		
		
		
	}

}
