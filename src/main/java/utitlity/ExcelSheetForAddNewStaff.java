package utitlity;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetForAddNewStaff {
	
	public static String fetchAddNewStaffData(int row, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("E:\\Callisto Internship\\TransportManagementSystem\\src\\test\\resources\\Add New Staff.xlsx");
	    String value = WorkbookFactory.create(file).getSheet("New Staff Details").getRow(row).getCell(cell).getStringCellValue();
	    return value;
	}

}
