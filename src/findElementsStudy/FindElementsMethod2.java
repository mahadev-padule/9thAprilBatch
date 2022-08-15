package findElementsStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com//");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Narendra Modi");
		Thread.sleep(2000);
		List<WebElement> name = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		name.size();
		Thread.sleep(2000);
		for(WebElement n:name) {
			System.out.println(n.getText());
			}
		for(WebElement n:name) {
		
			 String Expectedresult="narendra modi news";
			 
			 String actualText = n.getText();
			 
			 if  (actualText.equals(Expectedresult)) {
				 n.click();
				 
				 break ;
			 }
				 
				 driver.findElement(By.linkText("Images")).click();
				 
			 
			 
			
			}
		
		
			
			
		
		
		
		
		
		
		
	}

}
