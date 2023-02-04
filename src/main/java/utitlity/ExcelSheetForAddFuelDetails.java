package utitlity;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetForAddFuelDetails {
	
	public static String fetchFuelData(int row, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("E:\\Callisto Internship\\TransportManagementSystem\\src\\test\\resources\\Add Fuel Details.xlsx");
	    String value = WorkbookFactory.create(file).getSheet("Fuel Details").getRow(row).getCell(cell).getStringCellValue();
	    return value;
	}

}
