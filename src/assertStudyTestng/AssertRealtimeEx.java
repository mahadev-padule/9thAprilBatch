package assertStudyTestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import dynamicWait.ExplicitWait;

public class AssertRealtimeEx {
  @Test
  public void facebookLaunch() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
	  
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	  WebElement email = driver.findElement(By.id("email"));
	  
	  email.click();
	  
	  boolean em = email.isDisplayed();
	 
	//  Assert.assertTrue(em, "textbox is not visible then test case is fail");
	  
	//  WebDriverWait wd = new WebDriverWait(driver, Duration.ofMillis(1000));
	 
	//  wd.until(ExpectedConditions.visibilityOf(email));
	  
	//  Assert.assertFalse(em,"testbox is not visible then test case is passed");
	  
	 
	  
	  
	  
	 
  }
}
