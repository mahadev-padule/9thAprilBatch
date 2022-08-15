package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSyudy {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
		// close method
		
	driver.close();
		
		// quit method
		
		driver.quit();
		
		//maximize / minimize method
		
		 driver.manage().window().maximize();
		
	    Thread.sleep(3000);
	    
		 driver.manage().window().minimize();
		 
		 // navigate method 
		
	driver.navigate().to("https://www.amazon.in/");
		
     Thread.sleep(3000);
      
      driver.navigate().back();
      
     Thread.sleep(3000);
      
       driver.navigate().forward();
       
       Thread.sleep(3000);
       
       driver.navigate().refresh(); 
		
		//getTitle method
		
		driver.get("https://www.amazon.in/");
		
		String Title = driver.getTitle();
		
		System.out.println(Title);
		
		// getcurrenturl
		
		driver.get("https://www.amazon.in/");
		
		String Url = driver.getCurrentUrl();
		
		System.out.println(Url);
		
		
		
		

	}

}
