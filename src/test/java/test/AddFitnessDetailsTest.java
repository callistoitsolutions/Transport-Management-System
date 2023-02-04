package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pojo.ChromeBrowser;
import pojo.FirefoxBrowser;
import pojo.MicrosoftEdgeBrowser;
import pom.AddFitnessDetails;
import pom.TransportLogInPage;
import utitlity.ExcelSheetForFitnessOfVehicle;
import utitlity.ExcelSheetForSignIn;
import utitlity.Reports;
@Listeners(Listener.class)
public class AddFitnessDetailsTest extends BaseClass {
	ExtentReports extent;
	ExtentTest test; 
	
	@BeforeTest
	public void addToReport()
	{
		extent = Reports.configureReport("System Testing","Add Vehicle Fitness", "Swapnil Ramteke");
	}
	@Test
	public void addFitnessDetailsOnChrome() throws EncryptedDocumentException, IOException
	{
		 driver = ChromeBrowser.launchBrowser();
		 TransportLogInPage transportLogInPage = new TransportLogInPage(driver);
		 String userName = ExcelSheetForSignIn.fetchData(1, 0);
		 String password = ExcelSheetForSignIn.fetchData(1, 1);
		 String title = driver.getTitle();
	     Assert.assertEquals(title, "Login - Transport Management");
		 transportLogInPage.logIn(driver, userName, password);
		 
		 test = extent.createTest("addFitnessDetailsOnChrome");
		 
		AddFitnessDetails addFitnessDetails = new AddFitnessDetails(driver);
		addFitnessDetails.openFitnessForm(driver);
		String vehicleregno = ExcelSheetForFitnessOfVehicle.fetchFitnessData(1, 0);
		String engineno = ExcelSheetForFitnessOfVehicle.fetchFitnessData(1, 1);
		String makeModel = ExcelSheetForFitnessOfVehicle.fetchFitnessData(1, 2);
		String chassisno = ExcelSheetForFitnessOfVehicle.fetchFitnessData(1, 3);
		String yearofmanufacture = ExcelSheetForFitnessOfVehicle.fetchFitnessData(1, 4);
		String fueltype = ExcelSheetForFitnessOfVehicle.fetchFitnessData(1, 5);
		String colourOfVehicle = ExcelSheetForFitnessOfVehicle.fetchFitnessData(1, 6);
		String reminderdate = ExcelSheetForFitnessOfVehicle.fetchFitnessData(1, 7);
		String certificateValidity = ExcelSheetForFitnessOfVehicle.fetchFitnessData(1, 8);
		String remarks = ExcelSheetForFitnessOfVehicle.fetchFitnessData(1, 9);
		String pathOfCertificate = "E:\\Dummy Images\\Fitness Certificate.jpg";
		addFitnessDetails.addFitnessData(driver, vehicleregno, "TATA MOTORS", "goods carrier", engineno, makeModel, chassisno, yearofmanufacture, fueltype, colourOfVehicle, reminderdate, certificateValidity, remarks, pathOfCertificate);
		
	}
	@Test(priority = 1)
	public void addFitnessDetailsOnFirefox() throws EncryptedDocumentException, IOException
	{
		 driver = FirefoxBrowser.openFirefox();
		 TransportLogInPage transportLogInPage = new TransportLogInPage(driver);
		 String userName = ExcelSheetForSignIn.fetchData(1, 0);
		 String password = ExcelSheetForSignIn.fetchData(1, 1);
		 String title = driver.getTitle();
		 Assert.assertEquals(title, "Login - Transport Management");
		 transportLogInPage.logIn(driver, userName, password);
		 
		 test = extent.createTest("addFitnessDetailsOnFirefox");
		 
		AddFitnessDetails addFitnessDetails = new AddFitnessDetails(driver);
		addFitnessDetails.openFitnessForm(driver);
		String vehicleregno = ExcelSheetForFitnessOfVehicle.fetchFitnessData(1, 0);
		String engineno = ExcelSheetForFitnessOfVehicle.fetchFitnessData(1, 1);
		String makeModel = ExcelSheetForFitnessOfVehicle.fetchFitnessData(1, 2);
		String chassisno = ExcelSheetForFitnessOfVehicle.fetchFitnessData(1, 3);
		String yearofmanufacture = ExcelSheetForFitnessOfVehicle.fetchFitnessData(1, 4);
		String fueltype = ExcelSheetForFitnessOfVehicle.fetchFitnessData(1, 5);
		String colourOfVehicle = ExcelSheetForFitnessOfVehicle.fetchFitnessData(1, 6);
		String reminderdate = ExcelSheetForFitnessOfVehicle.fetchFitnessData(1, 7);
		String certificateValidity = ExcelSheetForFitnessOfVehicle.fetchFitnessData(1, 8);
		String remarks = ExcelSheetForFitnessOfVehicle.fetchFitnessData(1, 9);
		String pathOfCertificate = "E:\\Dummy Images\\Fitness Certificate.jpg";
		addFitnessDetails.addFitnessData(driver, vehicleregno, "TATA MOTORS", "goods carrier", engineno, makeModel, chassisno, yearofmanufacture, fueltype, colourOfVehicle, reminderdate, certificateValidity, remarks, pathOfCertificate);
		
	}
	@Test(priority = 2)
	public void addFitnessDetailsOnMicrosoftEdge() throws EncryptedDocumentException, IOException
	{
		 driver = MicrosoftEdgeBrowser.microsoftEdge();
		 TransportLogInPage transportLogInPage = new TransportLogInPage(driver);
		 String userName = ExcelSheetForSignIn.fetchData(1, 0);
		 String password = ExcelSheetForSignIn.fetchData(1, 1);
		 String title = driver.getTitle();
		 Assert.assertEquals(title, "Login - Transport Management");
		 transportLogInPage.logIn(driver, userName, password);
		 
		 test = extent.createTest("addFitnessDetailsOnMicrosoftEdge");
		 
		AddFitnessDetails addFitnessDetails = new AddFitnessDetails(driver);
		addFitnessDetails.openFitnessForm(driver);
		String vehicleregno = ExcelSheetForFitnessOfVehicle.fetchFitnessData(1, 0);
		String engineno = ExcelSheetForFitnessOfVehicle.fetchFitnessData(1, 1);
		String makeModel = ExcelSheetForFitnessOfVehicle.fetchFitnessData(1, 2);
		String chassisno = ExcelSheetForFitnessOfVehicle.fetchFitnessData(1, 3);
		String yearofmanufacture = ExcelSheetForFitnessOfVehicle.fetchFitnessData(1, 4);
		String fueltype = ExcelSheetForFitnessOfVehicle.fetchFitnessData(1, 5);
		String colourOfVehicle = ExcelSheetForFitnessOfVehicle.fetchFitnessData(1, 6);
		String reminderdate = ExcelSheetForFitnessOfVehicle.fetchFitnessData(1, 7);
		String certificateValidity = ExcelSheetForFitnessOfVehicle.fetchFitnessData(1, 8);
		String remarks = ExcelSheetForFitnessOfVehicle.fetchFitnessData(1, 9);
		String pathOfCertificate = "E:\\Dummy Images\\Fitness Certificate.jpg";
		addFitnessDetails.addFitnessData(driver, vehicleregno, "TATA MOTORS", "goods carrier", engineno, makeModel, chassisno, yearofmanufacture, fueltype, colourOfVehicle, reminderdate, certificateValidity, remarks, pathOfCertificate);
		
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
	public void flushReport()
	{
		extent.flush();
	}

}
