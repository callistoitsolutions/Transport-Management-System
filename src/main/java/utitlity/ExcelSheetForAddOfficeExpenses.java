package utitlity;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetForAddOfficeExpenses {

	public static String fetchOfficeExpensesData(int row, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("E:\\Callisto Internship\\TransportManagementSystem\\src\\test\\resources\\Add Office Expenses.xlsx");
	    String value = WorkbookFactory.create(file).getSheet("Office Expenses").getRow(row).getCell(cell).getStringCellValue();
	    return value;
	}
}
