package utitlity;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetForFitnessOfVehicle {
	
	public static String fetchFitnessData(int row, int cell) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("E:\\Callisto Internship\\TransportManagementSystem\\src\\test\\resources\\Vehicle Fitness Data.xlsx");
		String value = WorkbookFactory.create(file).getSheet("Fitness Data").getRow(row).getCell(cell).getStringCellValue();
	    return value;
	}

}
