package kitUsingPOM2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {
	
	// declaration 
	
		@FindBy(id = "userid") private WebElement UserId;
		
		@FindBy(id = "password") private WebElement password ;
		
		@FindBy(xpath = "//button[@type='submit']") private WebElement login ;
		
    // initialization
		
		public KiteLoginPage(WebDriver driver) {
			
			PageFactory.initElements(driver, this);
			
		}
		
	// utilize
		
		public void sendUserId(String UID) {
			
			UserId.sendKeys(UID);
			
			
		}
	public void sendPassword(String PWD) {
		
		
		password.sendKeys(PWD);
		
	}

	public void ClickOnLoginButton() {
		
		login.click();
		
	}
}
