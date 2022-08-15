package findElementsStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FindElementsMethod {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); //parent p=new child   (WebDriver is parent and ChromeDriver is child)
		
		driver.get("https://www.google.com//");
		
		driver.manage().window().maximize();
		
      driver.findElement(By.name("q")).sendKeys("Rashmika");
      
      Thread.sleep(2000);
     List<WebElement> rush = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
    Thread.sleep(2000);
   System.out.println(rush.size());
   
   for(WebElement r:rush) {
	   
	   System.out.println(r.getText());
   }
   for(WebElement r:rush) {
	   
	   String Expectedresult = "rashmika mandanna hd images";
	   String actualText = r.getText();
	   
	   if(actualText.equals(Expectedresult)) {
		   
		   r.click();
		   
		   break;
	   }
	   
	    }
   
   driver.findElement(By.linkText("Images")).click();
   
   
 }

}
