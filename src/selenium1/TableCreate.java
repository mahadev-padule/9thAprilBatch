package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableCreate {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "D:\\setup\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
	Thread.sleep(2000);
		// find table 
	
	driver.findElement(By.id("product"));
	
	
	
	
//	List<WebElement> nosOfColumn = driver.findElements(By.xpath("//table[@id='product']//tr[1]/th"));
	
	//System.out.println("total no of column in table is "+ nosOfColumn.size());
	
 //  for(WebElement c:nosOfColumn) {
    	
  //	System.out.print(c.getText()+ "  ||  ");
    	
	//}
	

	List<WebElement> nosOfRow= driver.findElements(By.xpath("//table[@id='product']//tr"));
	
	System.out.println("total no of row in table is"+nosOfRow.size());
	List<WebElement> noOfColumn= driver.findElements(By.xpath("//table[@id='product']//tr[1]"));
	System.out.println(noOfColumn.size());
	for(WebElement r:nosOfRow) 
	{
	List<WebElement> col = r.findElements(By.tagName("td"));	
		
	//	System.out.println(col.size());
	
		 for(WebElement c:col) {
			 
			 System.out.print(c.getText()+  " || ");
		 }
		System.out.println();
		
	//	System.out.println(r.getText()+  " || ");
	}
	
	
	
	}
	
	

}
