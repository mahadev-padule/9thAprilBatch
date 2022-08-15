package baseUtilityTestPomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id = "userid") private  WebElement UserID;
	@FindBy(id = "password") private WebElement PassWord;
	@FindBy(xpath = "//button[@type='submit']") private WebElement LogingButton ;
	
	
	
	   public  LoginPage (WebDriver driver)
	    {
		PageFactory.initElements(driver,this);
		}
	  
	   public void sendUserID(String UID) 
	   {
		UserID.sendKeys(UID);
	   }
	
	   public void sendPassword(String PWD) 
	   {
		PassWord.sendKeys(PWD);
	   }
	
	   public void clickOnLoginButton() 
	   {
		LogingButton.click();
	   }
	
}
