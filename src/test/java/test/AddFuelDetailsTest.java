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
import pom.AddFuelDetails;
import pom.TransportLogInPage;
import utitlity.ExcelSheetForAddFuelDetails;
import utitlity.ExcelSheetForSignIn;
import utitlity.Reports;

@Listeners(Listener.class)
public class AddFuelDetailsTest extends BaseClass {

	ExtentReports extent;
	ExtentTest test;
	
	@BeforeTest
	public void generateFuelDetailsReport()
	{
		extent = Reports.configureReport("System Testing", "Add Fuel Details", "Swapnil Ramteke");
	}
	@Test
	public void addFuelDetailsOnChrome() throws EncryptedDocumentException, IOException
	{
		driver = ChromeBrowser.launchBrowser();
		
		TransportLogInPage transport = new TransportLogInPage(driver);
		String userName = ExcelSheetForSignIn.fetchData(1, 0);
		String password = ExcelSheetForSignIn.fetchData(1, 1);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Login - Transport Management");
		transport.logIn(driver, userName, password);
		
		test = extent.createTest("addFuelDetailsOnChrome");
		
		AddFuelDetails addFuelDetails = new AddFuelDetails(driver);
		addFuelDetails.openAddFuelDetailsForm(driver);
		
		String typeOfFuel = ExcelSheetForAddFuelDetails.fetchFuelData(1, 0);
		String dateOfFueling = ExcelSheetForAddFuelDetails.fetchFuelData(1, 1);
		String odometerReading = ExcelSheetForAddFuelDetails.fetchFuelData(1, 2);
		String partialFuelup = ExcelSheetForAddFuelDetails.fetchFuelData(1, 3);
		String quantityOfFuel = ExcelSheetForAddFuelDetails.fetchFuelData(1, 4);
		String currentPriceOfFuelPerUnit = ExcelSheetForAddFuelDetails.fetchFuelData(1, 5);
		String invoiceNumber = ExcelSheetForAddFuelDetails.fetchFuelData(1, 6);
		String pathOfInvoice = "E:\\Dummy Images\\Invoice.png";
		String remarks = ExcelSheetForAddFuelDetails.fetchFuelData(1, 7);
		addFuelDetails.addNewFuelDetails(driver, typeOfFuel, dateOfFueling, "TATA MOTORS", odometerReading, partialFuelup, quantityOfFuel, currentPriceOfFuelPerUnit, "YAMINA", invoiceNumber, pathOfInvoice, remarks);
	}
	@Test(priority = 1)
	public void addFuelDetailsOnFirefox() throws EncryptedDocumentException, IOException
	{
		driver = FirefoxBrowser.openFirefox();
		
		TransportLogInPage transport = new TransportLogInPage(driver);
		String userName = ExcelSheetForSignIn.fetchData(1, 0);
		String password = ExcelSheetForSignIn.fetchData(1, 1);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Login - Transport Management");
		transport.logIn(driver, userName, password);
		
		test = extent.createTest("addFuelDetailsOnFirefox");
		
		AddFuelDetails addFuelDetails = new AddFuelDetails(driver);
		addFuelDetails.openAddFuelDetailsForm(driver);
		
		String typeOfFuel = ExcelSheetForAddFuelDetails.fetchFuelData(1, 0);
		String dateOfFueling = ExcelSheetForAddFuelDetails.fetchFuelData(1, 1);
		String odometerReading = ExcelSheetForAddFuelDetails.fetchFuelData(1, 2);
		String partialFuelup = ExcelSheetForAddFuelDetails.fetchFuelData(1, 3);
		String quantityOfFuel = ExcelSheetForAddFuelDetails.fetchFuelData(1, 4);
		String currentPriceOfFuelPerUnit = ExcelSheetForAddFuelDetails.fetchFuelData(1, 5);
		String invoiceNumber = ExcelSheetForAddFuelDetails.fetchFuelData(1, 6);
		String pathOfInvoice = "E:\\Dummy Images\\Invoice.png";
		String remarks = ExcelSheetForAddFuelDetails.fetchFuelData(1, 7);
		addFuelDetails.addNewFuelDetails(driver, typeOfFuel, dateOfFueling, "TATA MOTORS", odometerReading, partialFuelup, quantityOfFuel, currentPriceOfFuelPerUnit, "YAMINA", invoiceNumber, pathOfInvoice, remarks);
	}
	@Test(priority = 2)
	public void addFuelDetailsOnEdge() throws EncryptedDocumentException, IOException
	{
		driver = MicrosoftEdgeBrowser.microsoftEdge();
		
		TransportLogInPage transport = new TransportLogInPage(driver);
		String userName = ExcelSheetForSignIn.fetchData(1, 0);
		String password = ExcelSheetForSignIn.fetchData(1, 1);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Login - Transport Management");
		transport.logIn(driver, userName, password);
		
		test = extent.createTest("addFuelDetailsOnEdge");
		
		AddFuelDetails addFuelDetails = new AddFuelDetails(driver);
		addFuelDetails.openAddFuelDetailsForm(driver);
		
		String typeOfFuel = ExcelSheetForAddFuelDetails.fetchFuelData(1, 0);
		String dateOfFueling = ExcelSheetForAddFuelDetails.fetchFuelData(1, 1);
		String odometerReading = ExcelSheetForAddFuelDetails.fetchFuelData(1, 2);
		String partialFuelup = ExcelSheetForAddFuelDetails.fetchFuelData(1, 3);
		String quantityOfFuel = ExcelSheetForAddFuelDetails.fetchFuelData(1, 4);
		String currentPriceOfFuelPerUnit = ExcelSheetForAddFuelDetails.fetchFuelData(1, 5);
		String invoiceNumber = ExcelSheetForAddFuelDetails.fetchFuelData(1, 6);
		String pathOfInvoice = "E:\\Dummy Images\\Invoice.png";
		String remarks = ExcelSheetForAddFuelDetails.fetchFuelData(1, 7);
		addFuelDetails.addNewFuelDetails(driver, typeOfFuel, dateOfFueling, "TATA MOTORS", odometerReading, partialFuelup, quantityOfFuel, currentPriceOfFuelPerUnit, "YAMINA", invoiceNumber, pathOfInvoice, remarks);
	}
	@AfterMethod
	public void checkResult(ITestResult result)
	{
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
	public void flushReport()
	{
		extent.flush();
	}
}
