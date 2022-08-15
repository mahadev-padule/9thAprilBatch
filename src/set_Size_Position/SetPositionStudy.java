package set_Size_Position;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositionStudy {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();
		
		Point pt = new Point(10, 500);
		
		driver.manage().window().setPosition(pt);
		
		
	}

}
