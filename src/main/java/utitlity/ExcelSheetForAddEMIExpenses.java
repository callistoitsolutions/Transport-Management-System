package utitlity;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetForAddEMIExpenses {
	
	public static String fetchEMIExpensesData(int row, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("E:\\Callisto Internship\\TransportManagementSystem\\src\\test\\resources\\Add EMI Expenses.xlsx");
	    String value = WorkbookFactory.create(file).getSheet("EMI Expenses").getRow(row).getCell(cell).getStringCellValue();
	    return value;
	
	}

}
