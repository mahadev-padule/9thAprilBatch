package kitUsingPOM2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	
	
	@FindBy(xpath = "//span[@class='user-id']") private WebElement UserId ;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logout ;
	
	
	
	public  KiteHomePage (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
public void SendUserID (String expectedUserID) {
		
		String ActualUserID = UserId.getText();
		
		
		if(ActualUserID.equals(expectedUserID)) {
			
			System.out.println("Actual and Expected are matching test case passed");
			
			
		}
		
		else {
			System.out.println("Actual and Expected are not matching test case failed");
			
		}
		UserId.click();
}
	
	public void clickOnLoginButton() {
		
		logout.click();
		
		
	}

}
