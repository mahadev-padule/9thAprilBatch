package kitUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitLoginPOM {

	// declaration

	@FindBy(id = "userid")
	private WebElement userId;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement logineButton;

	// initialize

	public KitLoginPOM(WebDriver driver) {

		PageFactory.initElements(driver, this);

		// utilize

	}

	public void UID() {

		userId.sendKeys("ELR321");

	}

	public void PWD() {

		password.sendKeys("Dhana1111");
	}

	public void LoginB() {

		logineButton.click();

	}

}
