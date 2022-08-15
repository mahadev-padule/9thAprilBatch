package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Practice2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myFile = new File("D:\\setup//excelWork.xlsx");

		Workbook wbf = WorkbookFactory.create(myFile);

		Sheet gs = wbf.getSheet("Sheet2");

		int totalrows = gs.getLastRowNum();
		int totalcells = gs.getRow(totalrows).getLastCellNum() - 1;

		for (int i = 0; i <= totalrows; i++) {

			for (int j = 0; j <= totalcells; j++) {

				Cell type = gs.getRow(i).getCell(j);
				CellType info = type.getCellType();

				if (info == CellType.STRING) {

					String c1 = type.getStringCellValue();
					System.out.print(c1 + "  || ");
				}

				else if (info == CellType.NUMERIC) {

					double c2 = type.getNumericCellValue();
					System.out.println(c2);
				} else if (info == CellType.BLANK) {

				} else if (info == CellType.BOOLEAN) {
					boolean c4 = type.getBooleanCellValue();

					System.out.println(c4);
				}
			}

		}

	}

}



