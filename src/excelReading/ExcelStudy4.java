package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelStudy4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		File myFile = new File("D:\\setup//excelWork.xlsx");
		Workbook name = WorkbookFactory.create(myFile);
		Sheet cr = name.getSheet("Sheet1");

		System.out.println("=============TotalRow====================");

		for (int i = 0; i <= 1; i++) {
			String value = cr.getRow(i).getCell(0).getStringCellValue();
			System.out.println(value);
		}

		System.out.println("============Totalcolumn==================");

		for (int j = 0; j <= 2; j++) {
			String value = cr.getRow(0).getCell(j).getStringCellValue();
			System.out.println(value);

		}

	}

}
