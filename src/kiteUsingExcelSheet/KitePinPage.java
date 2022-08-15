package kiteUsingExcelSheet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage {
	
	@FindBy(id = "pin") private WebElement PinId;
	
	@FindBy(xpath = "//button[@type='submit']") private WebElement ContinueButton;
	
	
	
	public KitePinPage (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void sendPinId (String PIN) {
		
		PinId.sendKeys(PIN);
		
	}
	
public void ClickOnContinue() {
	
	
	ContinueButton.click();
}
}
