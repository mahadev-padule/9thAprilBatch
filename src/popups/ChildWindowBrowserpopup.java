package popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowBrowserpopup {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
	     Thread.sleep(2000);
	     driver.findElement(By.name("NewWindow")).click();
	     Thread.sleep(2000);
	     String idOfMainPage = driver.getWindowHandle();
	     System.out.println(idOfMainPage);
	     
	     Set<String> idofAllPage = driver.getWindowHandles();
	     System.out.println(idofAllPage);
	     
	      ArrayList<String> al = new ArrayList<String>(idofAllPage);
	     String mainPageid = al.get(0);
	     
	     String childPageId = al.get(1);
	     
	     driver.switchTo().window(childPageId);
	     Thread.sleep(2000);
	     driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("(//input[@class='field searchform-s'])[4]")).sendKeys("selenium");
	     
	     Thread.sleep(2000);
	     driver.switchTo().window(mainPageid);
	     driver.findElement(By.name("NewTab")).click();
	     
	     String newMainPageId = driver.getWindowHandle();
	     System.out.println(newMainPageId );
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     

		
	}


}
