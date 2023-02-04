package test;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pojo.ChromeBrowser;
import pojo.FirefoxBrowser;
import pojo.MicrosoftEdgeBrowser;
import pom.AddNewVehicle;
import pom.TransportLogInPage;
import utitlity.ExcelSheetForAddNewVehicle;
import utitlity.ExcelSheetForSignIn;
import utitlity.Reports;
@Listeners(Listener.class)
public class AddNewVehicleTest extends BaseClass {
	
	ExtentReports extent;
	ExtentTest test ;
	
	@BeforeTest
	public void generateReport ()
	{
		extent = Reports.configureReport("System Testing", "Add New Vehicle", "Swapnil Ramteke");
	}
	
	@Test
	public void addVehicleDetailsOnChrome () throws EncryptedDocumentException, IOException, InterruptedException
	{

		driver = ChromeBrowser.launchBrowser();
		TransportLogInPage transportLogInPage = new TransportLogInPage (driver);
        String userName = ExcelSheetForSignIn.fetchData( 1, 0);
        String password = ExcelSheetForSignIn.fetchData( 1, 1);
        String title = driver.getTitle();
		Assert.assertEquals(title, "Login - Transport Management");
		transportLogInPage.logIn(driver, userName, password);
		
		test = extent.createTest("addVehicleDetailsOnChrome");
		
		AddNewVehicle addNewVehicle = new AddNewVehicle(driver);
		addNewVehicle.openAddNewVehicleForm(driver);
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String vehiclename = ExcelSheetForAddNewVehicle.fetchVehicleData(1, 0);
		String makemodel = ExcelSheetForAddNewVehicle.fetchVehicleData(1, 1);
		String yearofmanufacture =ExcelSheetForAddNewVehicle.fetchVehicleData(1, 2);
		String nameOfColour = ExcelSheetForAddNewVehicle.fetchVehicleData(1, 3);
		String registrationno = ExcelSheetForAddNewVehicle.fetchVehicleData(1, 4);
		String pathOfPhoto = "E:\\Dummy Images\\rc1.jpg";
		String engineno = ExcelSheetForAddNewVehicle.fetchVehicleData(1, 5);
		String chassisno = ExcelSheetForAddNewVehicle.fetchVehicleData(1, 6);
		String typeOfBody = ExcelSheetForAddNewVehicle.fetchVehicleData(1, 7);
		String fuelmeasurement = ExcelSheetForAddNewVehicle.fetchVehicleData(1, 8);
		String usages = ExcelSheetForAddNewVehicle.fetchVehicleData(1, 9);
		
		addNewVehicle.addNewVehicleDetails(driver, vehiclename,"goods carrier", makemodel, yearofmanufacture, nameOfColour, "BS-III", registrationno, pathOfPhoto, engineno, chassisno, "Diesel", typeOfBody, fuelmeasurement, usages);
	
	}
	
	@Test(priority = 1)
	public void addVehicleDetailsOnFireFox () throws EncryptedDocumentException, IOException, InterruptedException
	{

		driver = FirefoxBrowser.openFirefox();
		TransportLogInPage transportLogInPage = new TransportLogInPage (driver);
        String userName = ExcelSheetForSignIn.fetchData( 1, 0);
        String password = ExcelSheetForSignIn.fetchData( 1, 1);
        String title = driver.getTitle();
		Assert.assertEquals(title, "Login - Transport Management");
		transportLogInPage.logIn(driver, userName, password);
		
		test = extent.createTest("addVehicleDetailsOnFireFox");
		
		AddNewVehicle addNewVehicle = new AddNewVehicle(driver);
		addNewVehicle.openAddNewVehicleForm(driver);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String vehiclename = ExcelSheetForAddNewVehicle.fetchVehicleData(1, 0);
		String makemodel = ExcelSheetForAddNewVehicle.fetchVehicleData(1, 1);
		String yearofmanufacture =ExcelSheetForAddNewVehicle.fetchVehicleData(1, 2);
		String nameOfColour = ExcelSheetForAddNewVehicle.fetchVehicleData(1, 3);
		String registrationno = ExcelSheetForAddNewVehicle.fetchVehicleData(1, 4);
		String pathOfPhoto = "E:\\Dummy Images\\rc1.jpg";
		String engineno = ExcelSheetForAddNewVehicle.fetchVehicleData(1, 5);
		String chassisno = ExcelSheetForAddNewVehicle.fetchVehicleData(1, 6);
		String typeOfBody = ExcelSheetForAddNewVehicle.fetchVehicleData(1, 7);
		String fuelmeasurement = ExcelSheetForAddNewVehicle.fetchVehicleData(1, 8);
		String usages = ExcelSheetForAddNewVehicle.fetchVehicleData(1, 9);
		
		addNewVehicle.addNewVehicleDetails(driver, vehiclename, "goods carrier", makemodel, yearofmanufacture, nameOfColour, "BS-III", registrationno, pathOfPhoto, engineno, chassisno, "Diesel", typeOfBody, fuelmeasurement, usages);
	
	}
	
	@Test(priority = 2)
	public void addVehicleDetailsOnMicrosoftEdge () throws EncryptedDocumentException, IOException, InterruptedException
	{

		driver = MicrosoftEdgeBrowser.microsoftEdge();
		TransportLogInPage transportLogInPage = new TransportLogInPage (driver);
        String userName = ExcelSheetForSignIn.fetchData( 1, 0);
        String password = ExcelSheetForSignIn.fetchData( 1, 1);
        String title = driver.getTitle();
		Assert.assertEquals(title, "Login - Transport Management");
		transportLogInPage.logIn(driver, userName, password);
		
		test = extent.createTest("addVehicleDetailsOnMicrosoftEdge");
		
		AddNewVehicle addNewVehicle = new AddNewVehicle(driver);
		addNewVehicle.openAddNewVehicleForm(driver);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String vehiclename = ExcelSheetForAddNewVehicle.fetchVehicleData(1, 0);
		String makemodel = ExcelSheetForAddNewVehicle.fetchVehicleData(1, 1);
		String yearofmanufacture =ExcelSheetForAddNewVehicle.fetchVehicleData(1, 2);
		String nameOfColour = ExcelSheetForAddNewVehicle.fetchVehicleData(1, 3);
		String registrationno = ExcelSheetForAddNewVehicle.fetchVehicleData(1, 4);
		String pathOfPhoto = "E:\\Dummy Images\\rc1.jpg";
		String engineno = ExcelSheetForAddNewVehicle.fetchVehicleData(1, 5);
		String chassisno = ExcelSheetForAddNewVehicle.fetchVehicleData(1, 6);
		String typeOfBody = ExcelSheetForAddNewVehicle.fetchVehicleData(1, 7);
		String fuelmeasurement = ExcelSheetForAddNewVehicle.fetchVehicleData(1, 8);
		String usages = ExcelSheetForAddNewVehicle.fetchVehicleData(1, 9);
		
		addNewVehicle.addNewVehicleDetails(driver, vehiclename, "goods carrier", makemodel, yearofmanufacture, nameOfColour, "BS-III", registrationno, pathOfPhoto, engineno, chassisno, "Diesel", typeOfBody, fuelmeasurement, usages);
	
	}
	@AfterMethod
	public void postExecution(ITestResult result)
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
	public void fushReport()
	{
		extent.flush();
	}
	
	

}
