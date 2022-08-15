package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.discoveryplus.in/");

		driver.manage().window().maximize();

		Thread.sleep(10000);

		WebElement SingIn = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));

		SingIn.click();

		Thread.sleep(10000);

		WebElement GetOTP = driver.findElement(By.xpath("//button[text()='Get OTP']"));

		boolean GetOTP1 = GetOTP.isEnabled();

		System.out.println("GetOTP1 button enabal" + GetOTP1);

		Thread.sleep(2000);

		WebElement MONum = driver.findElement(By.id("mobileNumber"));

		MONum.sendKeys("7263955857");
		Thread.sleep(2000);
		boolean GetOTP2 = GetOTP.isEnabled();
		System.out.println(GetOTP2);

		if (GetOTP2) {

			GetOTP.click();

			System.out.println("Click on OTP button");

		} else {

			MONum.sendKeys("7263955857");
			System.out.println("Fail to click on otp button");

		}

	}
}
