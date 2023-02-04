package utitlity;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetForPurchaseItems {
	
	public static String fetchPurchaseItemsData(int row, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("E:\\Callisto Internship\\TransportManagementSystem\\src\\test\\resources\\Purchase Item List.xlsx");
	    String value = WorkbookFactory.create(file).getSheet("Purchase Items").getRow(row).getCell(cell).getStringCellValue();
	    return value;
	}

}
