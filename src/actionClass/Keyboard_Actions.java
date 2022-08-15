package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import graphql.language.AstSorter;

public class Keyboard_Actions {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		driver.manage().window().maximize();
	Thread.sleep(2000);
	
		Actions at = new Actions(driver);
		
		WebElement day = driver.findElement(By.name("birthday_day"));
		
		at.click(day).perform();
		at.sendKeys(Keys.ARROW_UP).perform();
		at.sendKeys(Keys.ARROW_UP).perform();
		at.sendKeys(Keys.ARROW_UP).perform();
		at.sendKeys(Keys.ARROW_UP).perform();
		at.sendKeys(Keys.ARROW_UP).perform();
		at.sendKeys(Keys.ENTER).perform();
		
		System.out.println("=====================");
		
		WebElement month = driver.findElement(By.id("month"));
		
		at.click(month).perform();
		at.sendKeys(Keys.ARROW_UP).perform();
		at.sendKeys(Keys.ENTER).perform();
		System.out.println("==================");
		
		
	/*	at.sendKeys(Keys.ARROW_DOWN).perform();
		at.sendKeys(Keys.ARROW_DOWN).perform();
		at.sendKeys(Keys.ARROW_DOWN).perform();
		at.sendKeys(Keys.ARROW_DOWN).perform();
		at.sendKeys(Keys.ARROW_DOWN).perform();
		at.sendKeys(Keys.ARROW_DOWN).perform();
		at.sendKeys(Keys.ARROW_DOWN).perform();
		at.sendKeys(Keys.ARROW_DOWN).perform();
		at.sendKeys(Keys.ARROW_DOWN).perform();
		at.sendKeys(Keys.ARROW_DOWN).perform();
		at.sendKeys(Keys.ARROW_DOWN).perform();
		at.sendKeys(Keys.ARROW_DOWN).perform();
		at.sendKeys(Keys.ARROW_DOWN).perform();
		at.sendKeys(Keys.ARROW_DOWN).perform();
		at.sendKeys(Keys.ARROW_DOWN).perform();
		at.sendKeys(Keys.ARROW_DOWN).perform();
		at.sendKeys(Keys.ARROW_DOWN).perform();
		at.sendKeys(Keys.ARROW_DOWN).perform();
		at.sendKeys(Keys.ARROW_DOWN).perform();
		at.sendKeys(Keys.ARROW_DOWN).perform();
		at.sendKeys(Keys.ARROW_DOWN).perform();
		at.sendKeys(Keys.ARROW_DOWN).perform();
		at.sendKeys(Keys.ARROW_DOWN).perform();
		at.sendKeys(Keys.ARROW_DOWN).perform();
		at.sendKeys(Keys.ENTER).perform();*/
		
		
		WebElement year = driver.findElement(By.id("year"));
		at.click(year).perform();
		
		for(int i=24;i>=0;i--) {
			
			at.sendKeys(Keys.ARROW_DOWN).perform();
			
			Thread.sleep(1000);
			
		}
		
		at.sendKeys(Keys.ENTER).perform();
		
		
		
		
		
		
		
		
		
	}

}
