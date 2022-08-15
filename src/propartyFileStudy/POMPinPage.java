package propartyFileStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMPinPage 

{
	@FindBy(id = "pin") private WebElement  SendPin;
	@FindBy(xpath = "//button[@type='submit']") private WebElement ContinueButton;
	
	public POMPinPage(WebDriver driver) 
	  {
		PageFactory.initElements(driver, this);
	  }
	
	public void sendPinID(String PIN) 
	  {
	    SendPin.sendKeys(PIN);
	  }
	
	public void clickOnContinue() 
	  {
	    ContinueButton.click();
	  }
	
	
	
}
