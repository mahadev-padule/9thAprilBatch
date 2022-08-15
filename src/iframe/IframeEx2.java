package iframe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeEx2 {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/nestedframes");
		
	//driver.switchTo().frame("iframe");
		
		
	}

}
