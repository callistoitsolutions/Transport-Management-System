package utitlity;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetForAddNewDriver {
	
	public static String fetchDriverData(int row, int cell) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("E:\\Callisto Internship\\TransportManagementSystem\\src\\test\\resources\\Add New Driver.xlsx");
	    String value = WorkbookFactory.create(file).getSheet("Driver Details").getRow(row).getCell(cell).getStringCellValue();
	    return value;
	}

}
