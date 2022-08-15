package page_Scroll_Up_Down;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException {
		
		

		System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://vctcpune.com//");

		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement sign = driver.findElement(By.xpath("//a[contains(text(),'Click to')]"));
		
        JavascriptExecutor js = (JavascriptExecutor)driver;
		
         Thread.sleep(2000);
        
         js.executeScript("arguments[0].scrollIntoView();",sign);
		
	}

}
//