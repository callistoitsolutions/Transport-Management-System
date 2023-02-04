package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pojo.ChromeBrowser;
import pojo.FirefoxBrowser;
import pojo.MicrosoftEdgeBrowser;
import pom.AddPurchaseItems;
import pom.TransportLogInPage;
import utitlity.ExcelSheetForPurchaseItems;
import utitlity.ExcelSheetForSignIn;
import utitlity.Reports;
@Listeners(Listener.class)
public class AddPurchaseItemsTest extends BaseClass {
	ExtentReports extent;
	ExtentTest test; 
	
	@BeforeTest
	public void generateReport()
	{
		extent = Reports.configureReport("System Testing", "Add Purchase Items", "Swapnil Ramteke");
	}
	@Test
	public void addDetailsInPurchaseItemsOnChrome () throws EncryptedDocumentException, IOException {
		
		driver = ChromeBrowser.launchBrowser();
		
		TransportLogInPage transportLogInPage = new TransportLogInPage(driver);
		String userName = ExcelSheetForSignIn.fetchData(1, 0);
		String password = ExcelSheetForSignIn.fetchData(1,1);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Login - Transport Management");
		transportLogInPage.logIn(driver, userName, password);
		
		test = extent.createTest("addDetailsInPurchaseItemsOnChrome");
        AddPurchaseItems addPurchaseItems = new AddPurchaseItems(driver);	
        addPurchaseItems.openPurchaseItemsForm(driver);
        
        String nameOfPart = ExcelSheetForPurchaseItems.fetchPurchaseItemsData(1, 0);
        String dateOfPurchase = ExcelSheetForPurchaseItems.fetchPurchaseItemsData(1, 1);
        String invoiceNumber = ExcelSheetForPurchaseItems.fetchPurchaseItemsData(1, 2);
        String sizeOfItem = ExcelSheetForPurchaseItems.fetchPurchaseItemsData(1, 3);
        String quantityOfItems = ExcelSheetForPurchaseItems.fetchPurchaseItemsData(1, 4);
        String priceOfItems = ExcelSheetForPurchaseItems.fetchPurchaseItemsData(1, 5);
        String gstAmount = ExcelSheetForPurchaseItems.fetchPurchaseItemsData(1, 6);
        String sgstAmount = ExcelSheetForPurchaseItems.fetchPurchaseItemsData(1, 7);
        String cgstAmount = ExcelSheetForPurchaseItems.fetchPurchaseItemsData(1, 8);
        String igstAmount = ExcelSheetForPurchaseItems.fetchPurchaseItemsData(1, 9);
        String totalAmountOfPurchase = ExcelSheetForPurchaseItems.fetchPurchaseItemsData(1, 10);
        String modeOfPayment = ExcelSheetForPurchaseItems.fetchPurchaseItemsData(1, 11);
        
        addPurchaseItems.addPurchaseItemsData(driver, nameOfPart, dateOfPurchase, "TATA MOTORS", invoiceNumber, sizeOfItem, quantityOfItems, priceOfItems, gstAmount, sgstAmount, cgstAmount, igstAmount, "demo", totalAmountOfPurchase, modeOfPayment);
	}
	@Test(priority = 1)
	public void addDetailsInPurchaseItemsOnFirefox () throws EncryptedDocumentException, IOException {
		
		driver = FirefoxBrowser.openFirefox();
		
		TransportLogInPage transportLogInPage = new TransportLogInPage(driver);
		String userName = ExcelSheetForSignIn.fetchData(1, 0);
		String password = ExcelSheetForSignIn.fetchData(1,1);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Login - Transport Management");
		transportLogInPage.logIn(driver, userName, password);
		
		test = extent.createTest("addDetailsInPurchaseItemsOnFirefox");
        AddPurchaseItems addPurchaseItems = new AddPurchaseItems(driver);	
        addPurchaseItems.openPurchaseItemsForm(driver);
        
        String nameOfPart = ExcelSheetForPurchaseItems.fetchPurchaseItemsData(1, 0);
        String dateOfPurchase = ExcelSheetForPurchaseItems.fetchPurchaseItemsData(1, 1);
        String invoiceNumber = ExcelSheetForPurchaseItems.fetchPurchaseItemsData(1, 2);
        String sizeOfItem = ExcelSheetForPurchaseItems.fetchPurchaseItemsData(1, 3);
        String quantityOfItems = ExcelSheetForPurchaseItems.fetchPurchaseItemsData(1, 4);
        String priceOfItems = ExcelSheetForPurchaseItems.fetchPurchaseItemsData(1, 5);
        String gstAmount = ExcelSheetForPurchaseItems.fetchPurchaseItemsData(1, 6);
        String sgstAmount = ExcelSheetForPurchaseItems.fetchPurchaseItemsData(1, 7);
        String cgstAmount = ExcelSheetForPurchaseItems.fetchPurchaseItemsData(1, 8);
        String igstAmount = ExcelSheetForPurchaseItems.fetchPurchaseItemsData(1, 9);
        String totalAmountOfPurchase = ExcelSheetForPurchaseItems.fetchPurchaseItemsData(1, 10);
        String modeOfPayment = ExcelSheetForPurchaseItems.fetchPurchaseItemsData(1, 11);
        
        addPurchaseItems.addPurchaseItemsData(driver, nameOfPart, dateOfPurchase, "TATA MOTORS", invoiceNumber, sizeOfItem, quantityOfItems, priceOfItems, gstAmount, sgstAmount, cgstAmount, igstAmount, "demo", totalAmountOfPurchase, modeOfPayment);
	}
	@Test(priority = 2)
	public void addDetailsInPurchaseItemsOnEdge () throws EncryptedDocumentException, IOException {
		
		driver = MicrosoftEdgeBrowser.microsoftEdge();
		
		TransportLogInPage transportLogInPage = new TransportLogInPage(driver);
		String userName = ExcelSheetForSignIn.fetchData(1, 0);
		String password = ExcelSheetForSignIn.fetchData(1,1);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Login - Transport Management");
		transportLogInPage.logIn(driver, userName, password);
		
		test = extent.createTest("addDetailsInPurchaseItemsOnEdge");
        AddPurchaseItems addPurchaseItems = new AddPurchaseItems(driver);	
        addPurchaseItems.openPurchaseItemsForm(driver);
        
        String nameOfPart = ExcelSheetForPurchaseItems.fetchPurchaseItemsData(1, 0);
        String dateOfPurchase = ExcelSheetForPurchaseItems.fetchPurchaseItemsData(1, 1);
        String invoiceNumber = ExcelSheetForPurchaseItems.fetchPurchaseItemsData(1, 2);
        String sizeOfItem = ExcelSheetForPurchaseItems.fetchPurchaseItemsData(1, 3);
        String quantityOfItems = ExcelSheetForPurchaseItems.fetchPurchaseItemsData(1, 4);
        String priceOfItems = ExcelSheetForPurchaseItems.fetchPurchaseItemsData(1, 5);
        String gstAmount = ExcelSheetForPurchaseItems.fetchPurchaseItemsData(1, 6);
        String sgstAmount = ExcelSheetForPurchaseItems.fetchPurchaseItemsData(1, 7);
        String cgstAmount = ExcelSheetForPurchaseItems.fetchPurchaseItemsData(1, 8);
        String igstAmount = ExcelSheetForPurchaseItems.fetchPurchaseItemsData(1, 9);
        String totalAmountOfPurchase = ExcelSheetForPurchaseItems.fetchPurchaseItemsData(1, 10);
        String modeOfPayment = ExcelSheetForPurchaseItems.fetchPurchaseItemsData(1, 11);
        
        addPurchaseItems.addPurchaseItemsData(driver, nameOfPart, dateOfPurchase, "TATA MOTORS", invoiceNumber, sizeOfItem, quantityOfItems, priceOfItems, gstAmount, sgstAmount, cgstAmount, igstAmount, "demo", totalAmountOfPurchase, modeOfPayment);
	}
	
	@AfterMethod
	public void postExecution(ITestResult result) {
		
		if(result.getStatus() == ITestResult.SUCCESS)
		{
			test.log(Status.PASS, result.getName());
		}
		else if(result.getStatus() == ITestResult.FAILURE)
		{
			test.log(Status.FAIL, result.getName());
		}
		else
		{
			test.log(Status.SKIP, result.getName());
		}
	}
	@AfterTest
	public void fulshReport()
	{
		extent.flush();
	}
	

}
