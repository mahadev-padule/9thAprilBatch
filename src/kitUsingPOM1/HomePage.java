package kitUsingPOM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath = "//span[@class='user-id']") private WebElement UserId ;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logout ;
	
	
	
	public  HomePage (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void userid() {
		
		String expectedUserid = "ELR321";
		 String actualUserid = UserId.getText();
		 
		 if(expectedUserid.equals(actualUserid)) {
			 
			 System.out.println("userid is valid test case is pass ");
			 
		 }
		 else {
			 
			 System.out.println("userid is not valid test case is fail");
		 }
		 
		 UserId.click();
	} 
	
	public void logOut() {
		
		logout.click();
	
		
	
	}
	
	

}
