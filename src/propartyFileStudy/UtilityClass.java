package propartyFileStudy;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class UtilityClass 
{
	
	public static String readDataFromPropertyFile(String key) throws IOException 
	{
		Properties proper = new Properties();
		
		FileInputStream myFile = new FileInputStream("C:\\Users\\admin\\Desktop\\java\\SeleniumStudy\\myPropertyFile.properties");
		
		proper.load(myFile);
		
		String value = proper.getProperty(key);
		
		return value ;
		
	}
	
	public static void captureScreenshot(WebDriver driver ,int testCaseID) throws IOException 
	{
        
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File distination = new File("C:\\Users\\admin\\Pictures\\seleniumSS//Screenshot"+testCaseID+".png");
		
		org.openqa.selenium.io.FileHandler.copy(source, distination);
		
		Reporter.log("Screenshot Taken",true);

		
	}
	

}
