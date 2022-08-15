package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelStudy2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		File myFile = new File("D:\\setup//excelWork.xlsx");

		Workbook name = WorkbookFactory.create(myFile);

		Sheet infoName = name.getSheet("Sheet1");

		Row rowNo = infoName.getRow(0);

		Cell cellNo = rowNo.getCell(2);

		String value = cellNo.getStringCellValue();

		System.out.println(value);

		System.out.println(infoName.getRow(0).getCell(0).getStringCellValue());

	}

}
