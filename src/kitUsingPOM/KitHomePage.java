package kitUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitHomePage {

	@FindBy(xpath = "//span[@class='user-id']")
	private WebElement PinIdButton;

	@FindBy(xpath = "//a[@target='_self']")
	private WebElement logoutButton;

	public KitHomePage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void pinIDButton() {

		String expectedPinID = "ELR321";
		String actualPinID = PinIdButton.getText();

		if (expectedPinID.equals(actualPinID)) {

			System.out.println("uaser is valid test case is pass");
		} else {

			System.out.println("user is not valid test case is fail");

		}

		PinIdButton.click();

	}

	public void logout() throws InterruptedException {

		Thread.sleep(1000);

		logoutButton.click();

	}

}
