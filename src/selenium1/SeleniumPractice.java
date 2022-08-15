package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice {

	public static void main(String[] args) {

	
		
		// set the path of executable browser drive
		
		System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); //parent p=new child   (WebDriver is parent and ChromeDriver is child)
		
		driver.get("https://www.google.com//");
		
		
		
		
	}

}
