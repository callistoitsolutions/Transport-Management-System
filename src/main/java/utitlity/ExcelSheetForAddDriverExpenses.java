package utitlity;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelSheetForAddDriverExpenses{
	
	public static String fetchDriverExpenseData(int row, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("E:\\Callisto Internship\\TransportManagementSystem\\src\\test\\resources\\Add Driver Expenses.xlsx");
	    String value = WorkbookFactory.create(file).getSheet("Driver Expenses").getRow(row).getCell(cell).getStringCellValue();
	    return value;
	}
	

}
