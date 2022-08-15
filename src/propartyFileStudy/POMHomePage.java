package propartyFileStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMHomePage 
{

	@FindBy(xpath = "//span[@class='user-id']") private WebElement uid;
    @FindBy(xpath = "//a[@target='_self']") private WebElement logoutButton;

  public POMHomePage (WebDriver driver)
	{
     PageFactory.initElements(driver, this);
    }

  public String getActualUserID() 
    {
	 String actualUserID = uid.getText();
	 return actualUserID;
    }

  public void logout() throws InterruptedException 
    {
      uid.click();
	  logoutButton.click();
	}

}
