package utitlity;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetForSignIn {
	
	public static String fetchData(int row, int cell) throws EncryptedDocumentException, IOException {
		
			FileInputStream file = new FileInputStream("E:\\Callisto Internship\\TransportManagementSystem\\src\\test\\resources\\Data for Sign In.xlsx");
		    String value = WorkbookFactory.create(file).getSheet("Sign In").getRow(row).getCell(cell).getStringCellValue();
		    return value;

	}

}
