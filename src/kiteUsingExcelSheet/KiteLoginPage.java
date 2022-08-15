package kiteUsingExcelSheet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {
	
	

	// declaration

	@FindBy(id = "userid") private WebElement userId;

	@FindBy(id = "password") private WebElement password;

	@FindBy(xpath = "//button[@type='submit']")private WebElement logineButton;
	
	// initialization
	
	
	public KiteLoginPage (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	// methods
	
	
	public void SendUserId (String UIN) {
		
		userId.sendKeys(UIN);
	}
	
	public void SendPassword (String PSW) {
		
		password.sendKeys(PSW);
		
	}

	public void clickOnLoginButton() {
		
		logineButton.click();
	}
	

}
