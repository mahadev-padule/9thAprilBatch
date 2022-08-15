package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelStudy7 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		File myFile = new File("D:\\setup//excelWork.xlsx");
		Workbook name = WorkbookFactory.create(myFile);
		Sheet cr = name.getSheet("Sheet3");

		int totalRows = cr.getLastRowNum();
		int totalCells = cr.getRow(totalRows).getLastCellNum() - 1;

		for (int i = 0; i <= totalRows; i++) {

			for (int j = 0; j <= totalCells; j++) {

				Cell infotype = cr.getRow(i).getCell(j);

				CellType type = infotype.getCellType();

				if (type == CellType.STRING) {
					String type1 = infotype.getStringCellValue();
					System.out.print(type1 +"  ");
				}
			
				else if (type == CellType.NUMERIC) {

					double type2 = infotype.getNumericCellValue();

					System.out.println(type2);
				}

				else if (type == CellType.BOOLEAN) {

					boolean type3 = infotype.getBooleanCellValue();

					System.out.println(type3);

				}

				else if (type == CellType.BLANK) {

				}

			}

		}
	

	}
}
