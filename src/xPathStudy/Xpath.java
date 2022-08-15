package xPathStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/login/");

		driver.manage().window().maximize();
		
		WebElement userid = driver.findElement(By.xpath("//*[@name='email' and @id='email']"));
		
		userid.sendKeys("mahadevpadule801@gmail.com");
		
		WebElement pass = driver.findElement(By.xpath("//*[@type='password' or @id='pass']"));
		
		pass.sendKeys("jgxjhgxjh");
		
		
	}

}
