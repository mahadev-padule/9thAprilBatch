package popups;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildpopupsAssignment {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://vctcpune.com/");
		driver.manage().window().maximize();
	     Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]")).click();
		
		Set<String> allPage = driver.getWindowHandles();
		System.out.println(allPage);
		ArrayList<String> al= new ArrayList<String>(allPage);
		
		String MainPageid = al.get(0);
		String childPageId = al.get(1);
	    driver.switchTo().window(childPageId);
		
		driver.findElement(By.xpath("//input[@value='Radio2']")).click();
		 Thread.sleep(2000);
		 
		 driver.switchTo().window(MainPageid);
		 List<WebElement> link = driver.findElements(By.tagName("a"));
		 
		 System.out.println(link.size());
		 
		 for(WebElement l:link) {
			 System.out.println(l.getText());
			 Thread.sleep(2000);
		 }
		 System.out.println("========================");
		 List<WebElement> im= driver.findElements(By.name("img"));
		 
		 System.out.println(im.size());
			}

}
