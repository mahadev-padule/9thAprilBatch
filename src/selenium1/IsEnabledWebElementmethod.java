package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledWebElementmethod {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.discoveryplus.in/");
		
	/*	Thread.sleep(10000);
		
		 WebElement sign = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
		 
		 sign.click();
		 
		  Thread.sleep(10000);
		
		WebElement OTPButton = driver.findElement(By.xpath("//input[@id='mobileNumber']"));
		
		boolean result = OTPButton.isEnabled();
		System.out.println("Otp button enabled is  "+result);
		
		WebElement monu = driver.findElement(By.xpath("//input[@id='mobileNumber']"));
		
		monu.sendKeys("7263955857");
		
		Thread.sleep(5000);
		
		
		boolean result1 = OTPButton.isEnabled();
		
		System.out.println("otp button is enable "+result1);
		
		if(result1) {
			OTPButton.isEnabled();
			System.out.println("click on otp button");
			
		}
		else {
			 
			monu.sendKeys("7263955857");
		}
		
	//	 WebElement sign1 = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		
		//sign1.click(); */
		
		
		
		Thread.sleep(10000);
		
		WebElement sign = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
		
		sign.click();
		
		
		
		
	}

}
