package utitlity;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetForAddStaffExpenses {
	
	public static String fetchStaffExpenses(int row, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("E:\\Callisto Internship\\TransportManagementSystem\\src\\test\\resources\\Add Staff Expenses.xlsx");
	    String value = WorkbookFactory.create(file).getSheet("Staff Expenses").getRow(row).getCell(cell).getStringCellValue();
	    return value;
	}

}
