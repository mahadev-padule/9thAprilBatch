package set_Size_Position;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeStudy2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();
		
		Dimension ds = new Dimension(200, 800);
		
		driver.manage().window().setSize(ds);
		
		
	}

}
