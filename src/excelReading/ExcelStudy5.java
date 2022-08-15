package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelStudy5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		File myFile = new File("D:\\setup//excelWork.xlsx");
		Workbook name = WorkbookFactory.create(myFile);
		Sheet cr = name.getSheet("Sheet2");

		for (int i = 0; i <= 1; i++) {

			for (int j = 0; j <= 2; j++) {

				String value = cr.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value +"  || ");
			}
			System.out.println();

		}

	}

}
