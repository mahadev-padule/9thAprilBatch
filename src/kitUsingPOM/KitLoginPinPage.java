package kitUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitLoginPinPage {

	// declaration

	@FindBy(id = "pin")
	private WebElement pinId;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement continueButton;

	// initialization

	public KitLoginPinPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	// utiliz

	public void PID() {

		pinId.sendKeys("982278");
	}

	public void cButton() {

		continueButton.click();

	}

}
