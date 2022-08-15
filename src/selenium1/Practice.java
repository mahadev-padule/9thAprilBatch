package selenium1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import actionClass.ActionClassStudy;

public class Practice {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

		WebElement click = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		click.click();

		WebElement click1 = driver.findElement(By.xpath("(//div[@class='eFQ30H'])[5]"));

		Actions act = new Actions(driver);
		act.moveToElement(click1).perform();

		Thread.sleep(1000);

		WebElement click2 = driver.findElement(By.xpath("(//a[@class='_6WOcW9'])[3]"));
		Actions act1 = new Actions(driver);
		act1.moveToElement(click2).perform();
		act1.click().perform();
		Thread.sleep(2000);

		WebElement click3 = driver.findElement(By.xpath("(//a[contains(text(),'Redgear A-10')])[1]"));
		//WebElement click3 = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
		click3.click();
		Thread.sleep(5000);
		
		

		//WebElement click4 = driver.findElement(By.xpath("//*[contains(text(),'GO TO CART')]"));
		//WebElement click4 = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
// click4.click();
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("argument[0].SrollIntoView();",click4);

String mainPageID = driver.getWindowHandle();

Set<String> allPageID = driver.getWindowHandles();

ArrayList<String> al = new ArrayList<String>(allPageID);

String newAllPageID = al.get(1);

driver.switchTo().window(newAllPageID);

driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

WebElement click4 = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
click4.click();

	}

}
