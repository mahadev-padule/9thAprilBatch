package baseUtilityTestPomPackage;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {

	public static String getDataFromExcelSheet (int rowNum , int cellNum) throws EncryptedDocumentException, IOException 
	
	    {
        File myFile = new File("D:\\\\setup//excelWork.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet4");
		String Value = mySheet.getRow(rowNum).getCell(cellNum).getStringCellValue();
		return Value ;
		}
	
	    public static void captureSS(WebDriver driver , int TestCaseID) throws IOException 
	
	    {
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\admin\\Pictures\\seleniumSS//Screenshot"+TestCaseID+".png");
		FileHandler.copy(source, destination);
		}
	    }
