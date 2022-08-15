package kitUsingPOM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinPage {
	
	
	@FindBy(id = "pin") private WebElement PinID ;
	
	@FindBy(xpath = "//button[@type='submit']") private WebElement ContinueButton;
	
	
	public PinPage (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void pin () {
		
		PinID.sendKeys("982278");
	}

	public void ContinueButtonClick() {
		
		ContinueButton.click();
		
		
	}
}
