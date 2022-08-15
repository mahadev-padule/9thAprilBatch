package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Practice1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		File myFile = new File("D:\\setup//excelWork.xlsx");

		Workbook wbf = WorkbookFactory.create(myFile);

		Sheet gs = wbf.getSheet("Sheet2");

		int totalrows = gs.getLastRowNum();
		int totalcells = gs.getRow(totalrows).getLastCellNum() - 1;

		for (int i = 0; i <= totalrows; i++) {

			for (int j = 0; j <= totalcells; j++) {

				String value = gs.getRow(i).getCell(j).getStringCellValue();

				System.out.print(value + " || ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		

	}

}
