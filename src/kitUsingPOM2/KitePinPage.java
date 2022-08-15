package kitUsingPOM2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage {
	
@FindBy(id = "pin") private WebElement PinID ;
	
	@FindBy(xpath = "//button[@type='submit']") private WebElement ContinueButton;
	
	public KitePinPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public void sendPinID(String PIN) {
		
		PinID.sendKeys(PIN);
		
		
	}
	
	public void sendOnContinueButton() {
		
		ContinueButton.click();
	}
}
