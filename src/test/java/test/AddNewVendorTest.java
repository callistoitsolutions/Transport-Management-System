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
import pom.AddNewVendor;
import pom.TransportLogInPage;
import utitlity.ExcelSheetForAddNewVendor;
import utitlity.ExcelSheetForSignIn;
import utitlity.Reports;
@Listeners(Listener.class)
public class AddNewVendorTest extends BaseClass {
	
	ExtentReports extent;
	ExtentTest test;
	
	@BeforeTest
	public void generateReports()
	{
		extent = Reports.configureReport("System Testing", "Add New Vendor", "Swapnil Ramteke");
	}
	@Test
	public void addNewVendorsOnChrome() throws EncryptedDocumentException, IOException
	{
		driver = ChromeBrowser.launchBrowser();
		
		TransportLogInPage transportLogInPage = new TransportLogInPage(driver);
		String userName = ExcelSheetForSignIn.fetchData(1, 0);
		String password = ExcelSheetForSignIn.fetchData(1, 1);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Login - Transport Management");
		transportLogInPage.logIn(driver, userName, password);
		
		test = extent.createTest("addNewVendorsOnChrome");
		
		AddNewVendor addNewVendor = new AddNewVendor(driver);
		String nameOfVendor = ExcelSheetForAddNewVendor.fetchVendorData(1, 0);
		String nameOfService = ExcelSheetForAddNewVendor.fetchVendorData(1, 1);
		String addressOfVendor = ExcelSheetForAddNewVendor.fetchVendorData(1, 2);
		String phoneOfVendor = ExcelSheetForAddNewVendor.fetchVendorData(1, 3);
		String locationOfVendor = ExcelSheetForAddNewVendor.fetchVendorData(1, 4);
		String stateOfVendor = ExcelSheetForAddNewVendor.fetchVendorData(1, 5);
		String nameOfPerson = ExcelSheetForAddNewVendor.fetchVendorData(1, 6);
		String GSTnumber = ExcelSheetForAddNewVendor.fetchVendorData(1, 7);
		addNewVendor.addNewVendorData(driver, nameOfVendor, nameOfService, addressOfVendor, phoneOfVendor, locationOfVendor, stateOfVendor, nameOfPerson, GSTnumber);
	}
	@Test(priority = 1)
	public void addNewVendorsOnFirefox() throws EncryptedDocumentException, IOException
	{
		driver = FirefoxBrowser.openFirefox();
		
		TransportLogInPage transportLogInPage = new TransportLogInPage(driver);
		String userName = ExcelSheetForSignIn.fetchData(1, 0);
		String password = ExcelSheetForSignIn.fetchData(1, 1);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Login - Transport Management");
		transportLogInPage.logIn(driver, userName, password);
		
		test = extent.createTest("addNewVendorsOnFirefox");
		
		AddNewVendor addNewVendor = new AddNewVendor(driver);
		String nameOfVendor = ExcelSheetForAddNewVendor.fetchVendorData(1, 0);
		String nameOfService = ExcelSheetForAddNewVendor.fetchVendorData(1, 1);
		String addressOfVendor = ExcelSheetForAddNewVendor.fetchVendorData(1, 2);
		String phoneOfVendor = ExcelSheetForAddNewVendor.fetchVendorData(1, 3);
		String locationOfVendor = ExcelSheetForAddNewVendor.fetchVendorData(1, 4);
		String stateOfVendor = ExcelSheetForAddNewVendor.fetchVendorData(1, 5);
		String nameOfPerson = ExcelSheetForAddNewVendor.fetchVendorData(1, 6);
		String GSTnumber = ExcelSheetForAddNewVendor.fetchVendorData(1, 7);
		addNewVendor.addNewVendorData(driver, nameOfVendor, nameOfService, addressOfVendor, phoneOfVendor, locationOfVendor, stateOfVendor, nameOfPerson, GSTnumber);
	}
	@Test(priority = 2)
	public void addNewVendorsOnEdge() throws EncryptedDocumentException, IOException
	{
		driver = MicrosoftEdgeBrowser.microsoftEdge();
		
		TransportLogInPage transportLogInPage = new TransportLogInPage(driver);
		String userName = ExcelSheetForSignIn.fetchData(1, 0);
		String password = ExcelSheetForSignIn.fetchData(1, 1);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Login - Transport Management");
		transportLogInPage.logIn(driver, userName, password);
		
		test = extent.createTest("addNewVendorsOnEdge");
		
		AddNewVendor addNewVendor = new AddNewVendor(driver);
		String nameOfVendor = ExcelSheetForAddNewVendor.fetchVendorData(1, 0);
		String nameOfService = ExcelSheetForAddNewVendor.fetchVendorData(1, 1);
		String addressOfVendor = ExcelSheetForAddNewVendor.fetchVendorData(1, 2);
		String phoneOfVendor = ExcelSheetForAddNewVendor.fetchVendorData(1, 3);
		String locationOfVendor = ExcelSheetForAddNewVendor.fetchVendorData(1, 4);
		String stateOfVendor = ExcelSheetForAddNewVendor.fetchVendorData(1, 5);
		String nameOfPerson = ExcelSheetForAddNewVendor.fetchVendorData(1, 6);
		String GSTnumber = ExcelSheetForAddNewVendor.fetchVendorData(1, 7);
		addNewVendor.addNewVendorData(driver, nameOfVendor, nameOfService, addressOfVendor, phoneOfVendor, locationOfVendor, stateOfVendor, nameOfPerson, GSTnumber);
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
