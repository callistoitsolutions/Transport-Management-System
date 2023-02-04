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
import pom.AddNewBattery;
import pom.TransportLogInPage;
import utitlity.ExcelSheetForNewBattery;
import utitlity.ExcelSheetForSignIn;
import utitlity.Reports;
@Listeners(Listener.class)
public class AddNewBatteryTest extends BaseClass {
	ExtentReports extent;
	ExtentTest test; 
	
	@BeforeTest
	public void generateReport()
	{
		extent = Reports.configureReport("System Testing","Add New Battery", "Swapnil Ramteke");
	}
	@Test
	public void addBatteryRecordsOnChrome () throws EncryptedDocumentException, IOException
	{
		driver = ChromeBrowser.launchBrowser();
		TransportLogInPage transportLogInPage = new TransportLogInPage(driver);
        String userName = ExcelSheetForSignIn.fetchData(1, 0);
		String password = ExcelSheetForSignIn.fetchData(1, 1);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Login - Transport Management");
		transportLogInPage.logIn(driver, userName, password);
		
		test = extent.createTest("addBatteryRecordsOnChrome");
		
		AddNewBattery addNewBattery = new AddNewBattery(driver);
		addNewBattery.openBatteryRecord(driver);
		
		String serialnumber = ExcelSheetForNewBattery.fetchBatteryData(1, 0);
		String batteryVolts = ExcelSheetForNewBattery.fetchBatteryData(1, 1);
		String validityFrom = ExcelSheetForNewBattery.fetchBatteryData(1, 2);
		String validityTill = ExcelSheetForNewBattery.fetchBatteryData(1, 3);
		String nameOfBrand = ExcelSheetForNewBattery.fetchBatteryData(1, 4);
		String priceOfBattery = ExcelSheetForNewBattery.fetchBatteryData(1, 5);
		String typeOfBattery = ExcelSheetForNewBattery.fetchBatteryData(1, 6);
		String remarks = ExcelSheetForNewBattery.fetchBatteryData(1, 7);
		
		addNewBattery.addPurchaseItemsDetails(driver, serialnumber, batteryVolts, validityFrom, validityTill, nameOfBrand, priceOfBattery, typeOfBattery, remarks);
	}
	@Test(priority = 1)
	public void addBatteryRecordsOnFirefox () throws EncryptedDocumentException, IOException
	{
		driver = FirefoxBrowser.openFirefox();
		TransportLogInPage transportLogInPage = new TransportLogInPage(driver);
        String userName = ExcelSheetForSignIn.fetchData(1, 0);
		String password = ExcelSheetForSignIn.fetchData(1, 1);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Login - Transport Management");
		transportLogInPage.logIn(driver, userName, password);
		
		test = extent.createTest("addBatteryRecordsOnFirefox");
		
		AddNewBattery addNewBattery = new AddNewBattery(driver);
		addNewBattery.openBatteryRecord(driver);
		
		String serialnumber = ExcelSheetForNewBattery.fetchBatteryData(1, 0);
		String batteryVolts = ExcelSheetForNewBattery.fetchBatteryData(1, 1);
		String validityFrom = ExcelSheetForNewBattery.fetchBatteryData(1, 2);
		String validityTill = ExcelSheetForNewBattery.fetchBatteryData(1, 3);
		String nameOfBrand = ExcelSheetForNewBattery.fetchBatteryData(1, 4);
		String priceOfBattery = ExcelSheetForNewBattery.fetchBatteryData(1, 5);
		String typeOfBattery = ExcelSheetForNewBattery.fetchBatteryData(1, 6);
		String remarks = ExcelSheetForNewBattery.fetchBatteryData(1, 7);
		
		addNewBattery.addPurchaseItemsDetails(driver, serialnumber, batteryVolts, validityFrom, validityTill, nameOfBrand, priceOfBattery, typeOfBattery, remarks);
	}
	@Test(priority = 2)
	public void addBatteryRecordsOnEdge () throws EncryptedDocumentException, IOException
	{
		driver = MicrosoftEdgeBrowser.microsoftEdge();
		TransportLogInPage transportLogInPage = new TransportLogInPage(driver);
        String userName = ExcelSheetForSignIn.fetchData(1, 0);
		String password = ExcelSheetForSignIn.fetchData(1, 1);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Login - Transport Management");
		transportLogInPage.logIn(driver, userName, password);
		
		test = extent.createTest("addBatteryRecordsOnEdge");
		
		AddNewBattery addNewBattery = new AddNewBattery(driver);
		addNewBattery.openBatteryRecord(driver);
		
		String serialnumber = ExcelSheetForNewBattery.fetchBatteryData(1, 0);
		String batteryVolts = ExcelSheetForNewBattery.fetchBatteryData(1, 1);
		String validityFrom = ExcelSheetForNewBattery.fetchBatteryData(1, 2);
		String validityTill = ExcelSheetForNewBattery.fetchBatteryData(1, 3);
		String nameOfBrand = ExcelSheetForNewBattery.fetchBatteryData(1, 4);
		String priceOfBattery = ExcelSheetForNewBattery.fetchBatteryData(1, 5);
		String typeOfBattery = ExcelSheetForNewBattery.fetchBatteryData(1, 6);
		String remarks = ExcelSheetForNewBattery.fetchBatteryData(1, 7);
		
		addNewBattery.addPurchaseItemsDetails(driver, serialnumber, batteryVolts, validityFrom, validityTill, nameOfBrand, priceOfBattery, typeOfBattery, remarks);
	}
	@AfterMethod
	public void postExecution(ITestResult result) {
		if(result.getStatus() == ITestResult.SUCCESS)
		{
			test.log(Status.PASS, result.getName());
		}
		else if (result.getStatus() == ITestResult.FAILURE)
		{
			test.log(Status.FAIL, result.getName());
		}
		else
		{
			test.log(Status.SKIP, result.getName());
		}
	}
	@AfterTest
	public void flushReport ()
	{
		extent.flush();
	}

}
