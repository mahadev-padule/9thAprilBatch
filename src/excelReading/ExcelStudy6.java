package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelStudy6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		File myFile = new File("D:\\setup//excelWork.xlsx");
		Workbook name = WorkbookFactory.create(myFile);
		Sheet cr = name.getSheet("Sheet5");
		int totalRows = cr.getLastRowNum();
		System.out.println("=========totalRows==============");
		System.out.println("Total no of rows are=" + totalRows);
		System.out.println("============totalcells=============");
		int totalCell = cr.getRow(totalRows).getLastCellNum() - 1;
		System.out.println("total no of Cells are=" + totalCell);
		System.out.println("=========================");
		for (int i = 0; i <= totalRows; i++) {

			for (int j = 0; j <= totalCell; j++) {

				String value = cr.getRow(i).getCell(j).getStringCellValue();

				System.out.print(value + "  || ");
			}
			System.out.println();

		}

	}

}
