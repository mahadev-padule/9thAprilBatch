package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32//chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.get("https://www.facebook.com/");

// using different locator 1.ID locator 
Thread.sleep(5000);
//driver.findElement(By.className("inputtext _58mg _5dba _2ph-")).sendKeys("mahadevpadule801@gmail.com");

//Thread.sleep(5000);

//driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("Mahadev1996");

//driver.findElement(By.name("email")).sendKeys("mahadevpadule801@gmail.com");

// linktext

driver.findElement(By.linkText("Forgotten password?")).click();
		
		
	}

}
