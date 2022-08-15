package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelStudy3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		File myFile = new File("D:\\setup//excelWork.xlsx");
		Workbook name = WorkbookFactory.create(myFile);
		Sheet infoType = name.getSheet("Sheet1");
		System.out.println("=========Numeric==============");
		Cell cellNo = infoType.getRow(1).getCell(1);
		System.out.println(cellNo.getNumericCellValue());
		System.out.println(cellNo.getCellType());
		System.out.println("=========string==============");
		Cell cellNo1 = infoType.getRow(0).getCell(0);
		System.out.println(cellNo1.getCellType());
		System.out.println(cellNo1.getStringCellValue());
		System.out.println("========boolen=================");
		Cell cellNo2 = infoType.getRow(1).getCell(2);
		System.out.println(cellNo2.getBooleanCellValue());
		System.out.println(cellNo2.getCellType());

	}

}
