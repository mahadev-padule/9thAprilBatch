package iframe;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class IframeEx {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("frame1");//focus change main page to  frame1
		
		Thread.sleep(2000);
		
		driver.findElement(By.tagName("input")).sendKeys("selenium");
		
		Thread.sleep(2000);
		
		driver.switchTo().frame("frame3"); // focus change to frame1 to frame3 
		
		driver.findElement(By.id("a")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent(); // focus change to frame3 to main page 
		
		driver.switchTo().frame("frame2"); //  focus change to main page to frame2
		
		WebElement animal = driver.findElement(By.id("animals"));
		
		Select s = new Select(animal);
		
		s.selectByIndex(3);
		

	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destination=new File("C:\\Users\\admin\\Pictures\\seleniumSS//Screenshot.png");
		
	org.openqa.selenium.io.FileHandler.copy(source, destination);
		
		
	}

}
