package crossBrowserStudy;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CompabilityTesting {
	
@Parameters("browserName")
@Test
public void testCase(String Browser) {
WebDriver driver=null;
if(Browser.equals("firefox")) {
System.setProperty("webdriver.gecko.driver", "D:\\setup\\geckodriver-v0.31.0-win64//geckodriver.exe");
driver = new FirefoxDriver();
}
else if (Browser.equals("chrome")) {
System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32//chromedriver.exe");
driver = new ChromeDriver();
}
driver.manage().window().maximize();
driver.get("https://kite.zerodha.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
}
}

