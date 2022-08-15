package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropStudy {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); 
		
		driver.get(" http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html\r\n");
		
		driver.manage().window().maximize();
	Thread.sleep(1000);
	
	
	Actions at = new Actions(driver);
	
	WebElement src = driver.findElement(By.xpath("(//div[text()='Madrid'])[2]"));
	
	WebElement dest = driver.findElement(By.xpath("div[text()='Spain']"));
	
	//at.dragAndDrop(src, dest).perform();
	at.clickAndHold(src).moveToElement(dest).release().build().perform();
	
	Thread.sleep(3000);
	}

}
//(//div[text()='Madrid'])[2]
//div[text()='Spain']