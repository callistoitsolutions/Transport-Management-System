package utitlity;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetForAddNewIssue {
	
	public static String fetchIssueData(int row, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("E:\\Callisto Internship\\TransportManagementSystem\\src\\test\\resources\\Add New Issue.xlsx");
	    String value = WorkbookFactory.create(file).getSheet("Issue Details").getRow(row).getCell(cell).getStringCellValue();
	    return value;
	    
	}

}
