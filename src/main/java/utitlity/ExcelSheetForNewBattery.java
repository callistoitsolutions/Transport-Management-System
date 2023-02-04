package utitlity;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetForNewBattery {
	
	public static String fetchBatteryData(int row, int cell) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("E:\\Callisto Internship\\TransportManagementSystem\\src\\test\\resources\\Add New Battery.xlsx");
	    String value = WorkbookFactory.create(file).getSheet("Battery Details").getRow(row).getCell(cell).getStringCellValue();
	    return value;
	}

}
