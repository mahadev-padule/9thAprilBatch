package kitUsingPOM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	
	// declaration 
	
	@FindBy(id = "userid") private WebElement UserId;
	
	@FindBy(id = "password") private WebElement password ;
	
	@FindBy(xpath = "//button[@type='submit']") private WebElement login ;
	
	
	// initialization
	
	
	public loginPage (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	// utilize
	
	public void UserID () {
		
		UserId.sendKeys("ELR321");
	}
	
	
	public void UserPassword() {
		
		password.sendKeys("Dhana1111");
		
	}
	
	public void loginButton () {
		
		login.click();
	}

}
