package utitlity;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetForAddNewVehicle {
	
	public static String fetchVehicleData(int row, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("E:\\Callisto Internship\\TransportManagementSystem\\src\\test\\resources\\Vehicle Information.xlsx");
	    String value = WorkbookFactory.create(file).getSheet("Vehicle Details").getRow(row).getCell(cell).getStringCellValue();
	    return value;
	}

}
