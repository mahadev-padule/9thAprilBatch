package findElementsStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod3 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://www.google.com//");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		List<WebElement> link = driver.findElements(By.tagName("a"));
		
		Thread.sleep(2000);
		
		System.out.println(link.size());
		
		
		for(WebElement l:link) {
			System.out.println(l.getText());
			
			
		}
		

	}

}
