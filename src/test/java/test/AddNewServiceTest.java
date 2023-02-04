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
import pom.AddNewService;
import pom.TransportLogInPage;
import utitlity.ExcelSheetForAddNewService;
import utitlity.ExcelSheetForSignIn;
import utitlity.Reports;
@Listeners(Listener.class)
public class AddNewServiceTest extends BaseClass{
	ExtentReports extent;
	ExtentTest test;
	
	@BeforeTest
	public void generateReports()
	{
		extent = Reports.configureReport("System Testing", "Add New Service", "Swapnil Ramteke");
	}
	@Test
	public void addNewServiceOnChrome() throws EncryptedDocumentException, IOException
	{
		driver = ChromeBrowser.launchBrowser();
		
		TransportLogInPage transportLogInPage = new TransportLogInPage(driver);
		String userName = ExcelSheetForSignIn.fetchData(1, 0);
		String password = ExcelSheetForSignIn.fetchData(1, 1);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Login - Transport Management");
		transportLogInPage.logIn(driver, userName, password);
		
		test = extent.createTest("addNewServiceOnChrome");
		AddNewService addNewService = new AddNewService(driver);
		addNewService.openAddNewServiceForm(driver);
		
		String nameOfService = ExcelSheetForAddNewService.fetchServiceData(1, 0);
		String dateOfService = ExcelSheetForAddNewService.fetchServiceData(1, 1);
		String odometerReading = ExcelSheetForAddNewService.fetchServiceData(1, 2);
		String remarks = ExcelSheetForAddNewService.fetchServiceData(1, 3);
		String nameOfAssignee = ExcelSheetForAddNewService.fetchServiceData(1, 4);
		String labourAmount = ExcelSheetForAddNewService.fetchServiceData(1, 5);
		String numberOfParts = ExcelSheetForAddNewService.fetchServiceData(1, 6);
		String taxAmount = ExcelSheetForAddNewService.fetchServiceData(1, 7);
		String totalAmount = ExcelSheetForAddNewService.fetchServiceData(1, 8);
		String invoiceNumber = ExcelSheetForAddNewService.fetchServiceData(1, 9);
		String pathOfPhoto = "E:\\Dummy Images\\Service.png";
		
		addNewService.addNewServiceData(driver, nameOfService, "TATA MOTORS", dateOfService, odometerReading, "Vendor11", remarks, nameOfAssignee, labourAmount, numberOfParts, taxAmount, totalAmount, invoiceNumber, pathOfPhoto);
	}
	@Test(priority = 1)
	public void addNewServiceOnFirefox() throws EncryptedDocumentException, IOException
	{
		driver = FirefoxBrowser.openFirefox();
		
		TransportLogInPage transportLogInPage = new TransportLogInPage(driver);
		String userName = ExcelSheetForSignIn.fetchData(1, 0);
		String password = ExcelSheetForSignIn.fetchData(1, 1);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Login - Transport Management");
		transportLogInPage.logIn(driver, userName, password);
		
		test = extent.createTest("addNewServiceOnFirefox");
		AddNewService addNewService = new AddNewService(driver);
		addNewService.openAddNewServiceForm(driver);
		
		String nameOfService = ExcelSheetForAddNewService.fetchServiceData(1, 0);
		String dateOfService = ExcelSheetForAddNewService.fetchServiceData(1, 1);
		String odometerReading = ExcelSheetForAddNewService.fetchServiceData(1, 2);
		String remarks = ExcelSheetForAddNewService.fetchServiceData(1, 3);
		String nameOfAssignee = ExcelSheetForAddNewService.fetchServiceData(1, 4);
		String labourAmount = ExcelSheetForAddNewService.fetchServiceData(1, 5);
		String numberOfParts = ExcelSheetForAddNewService.fetchServiceData(1, 6);
		String taxAmount = ExcelSheetForAddNewService.fetchServiceData(1, 7);
		String totalAmount = ExcelSheetForAddNewService.fetchServiceData(1, 8);
		String invoiceNumber = ExcelSheetForAddNewService.fetchServiceData(1, 9);
		String pathOfPhoto = "E:\\Dummy Images\\Service.png";
		
		addNewService.addNewServiceData(driver, nameOfService, "TATA MOTORS", dateOfService, odometerReading, "Vendor11", remarks, nameOfAssignee, labourAmount, numberOfParts, taxAmount, totalAmount, invoiceNumber, pathOfPhoto);
	}
	@Test(priority = 2)
	public void addNewServiceOnEdge() throws EncryptedDocumentException, IOException
	{
		driver = MicrosoftEdgeBrowser.microsoftEdge();
		
		TransportLogInPage transportLogInPage = new TransportLogInPage(driver);
		String userName = ExcelSheetForSignIn.fetchData(1, 0);
		String password = ExcelSheetForSignIn.fetchData(1, 1);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Login - Transport Management");
		transportLogInPage.logIn(driver, userName, password);
		
		test = extent.createTest("addNewServiceOnEdge");
		AddNewService addNewService = new AddNewService(driver);
		addNewService.openAddNewServiceForm(driver);
		
		String nameOfService = ExcelSheetForAddNewService.fetchServiceData(1, 0);
		String dateOfService = ExcelSheetForAddNewService.fetchServiceData(1, 1);
		String odometerReading = ExcelSheetForAddNewService.fetchServiceData(1, 2);
		String remarks = ExcelSheetForAddNewService.fetchServiceData(1, 3);
		String nameOfAssignee = ExcelSheetForAddNewService.fetchServiceData(1, 4);
		String labourAmount = ExcelSheetForAddNewService.fetchServiceData(1, 5);
		String numberOfParts = ExcelSheetForAddNewService.fetchServiceData(1, 6);
		String taxAmount = ExcelSheetForAddNewService.fetchServiceData(1, 7);
		String totalAmount = ExcelSheetForAddNewService.fetchServiceData(1, 8);
		String invoiceNumber = ExcelSheetForAddNewService.fetchServiceData(1, 9);
		String pathOfPhoto = "E:\\Dummy Images\\Service.png";
		
		addNewService.addNewServiceData(driver, nameOfService, "TATA MOTORS", dateOfService, odometerReading, "Vendor11", remarks, nameOfAssignee, labourAmount, numberOfParts, taxAmount, totalAmount, invoiceNumber, pathOfPhoto);
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
