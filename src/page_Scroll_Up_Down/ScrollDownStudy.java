package page_Scroll_Up_Down;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownStudy {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		Thread.sleep(2000);		
		
		js.executeScript("window.scrollBy(10,3000)");
		
		Thread.sleep(2000);		
		
		js.executeScript("window.scrollBy(00,-1000)");
		
		
		
		
		
		
	}

}
