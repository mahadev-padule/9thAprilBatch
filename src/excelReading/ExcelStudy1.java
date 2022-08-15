package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelStudy1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		File MyFile = new File("D:\\setup//excelWork.xlsx");

		String value = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();

		System.out.println(value);

		String value1 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();

		System.out.println(value1);

		String value2 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();

		System.out.println(value2);

	}

}
