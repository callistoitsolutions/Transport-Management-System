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
import pom.AddNewDriver;
import pom.TransportLogInPage;
import utitlity.ExcelSheetForAddNewDriver;
import utitlity.ExcelSheetForSignIn;
import utitlity.Reports;
@Listeners(Listener.class)
public class AddNewDriverTest extends BaseClass {
	
	ExtentReports extent;
	ExtentTest test;
	
	@BeforeTest
	public void generateReport()
	{
		extent = Reports.configureReport("System Testing","Add New Driver", "Swapnil Ramteke");
	}
	@Test
	public void addNewDriverDetailsOnChrome() throws EncryptedDocumentException, IOException
	{
		driver = ChromeBrowser.launchBrowser();
		
		TransportLogInPage transportLogInPage = new TransportLogInPage(driver);
		String userName = ExcelSheetForSignIn.fetchData(1, 0);
		String password = ExcelSheetForSignIn.fetchData(1, 1);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Login - Transport Management");
		transportLogInPage.logIn(driver, userName, password);
		
		test = extent.createTest("addNewDriverDetailsOnChrome");
		
		AddNewDriver addNewDriver = new AddNewDriver(driver);
		addNewDriver.openAddNewDriverForm(driver);
		
		String nameOfDriver = ExcelSheetForAddNewDriver.fetchDriverData(1, 0);
		String address = ExcelSheetForAddNewDriver.fetchDriverData(1, 1);
		String city = ExcelSheetForAddNewDriver.fetchDriverData(1, 2);
		String phone = ExcelSheetForAddNewDriver.fetchDriverData(1, 3);
		String aadharNo = ExcelSheetForAddNewDriver.fetchDriverData(1, 4);
		String licenceNo = ExcelSheetForAddNewDriver.fetchDriverData(1, 5);
		String pathOfPhoto = "E:\\Dummy Images\\Driving Licence.jpg";
		String remark = ExcelSheetForAddNewDriver.fetchDriverData(1, 6);
		String PANnumber = ExcelSheetForAddNewDriver.fetchDriverData(1, 7);
		String bankAccountNoOfDriver = ExcelSheetForAddNewDriver.fetchDriverData(1, 8);
		String bankDetailsOfDriver = ExcelSheetForAddNewDriver.fetchDriverData(1, 9);
		String emergencyNoOfDriver = ExcelSheetForAddNewDriver.fetchDriverData(1, 10);
		String currentAgeOfDriver = ExcelSheetForAddNewDriver.fetchDriverData(1, 11);
		String typeOfEmploymentOfDriver = ExcelSheetForAddNewDriver.fetchDriverData(1, 12);
		String typeOfSalaryOfDriver = ExcelSheetForAddNewDriver.fetchDriverData(1, 13);
		String salaryAmountOfDriver = ExcelSheetForAddNewDriver.fetchDriverData(1, 14);
		String wagesPerDayGivenToDriver = ExcelSheetForAddNewDriver.fetchDriverData(1, 15);
		String licenceValidity = ExcelSheetForAddNewDriver.fetchDriverData(1, 16);
		addNewDriver.addNewDriverDetails(driver, nameOfDriver, address, city, phone, aadharNo, licenceNo, pathOfPhoto, remark, PANnumber, bankAccountNoOfDriver, bankDetailsOfDriver, emergencyNoOfDriver, currentAgeOfDriver, typeOfEmploymentOfDriver, typeOfSalaryOfDriver, salaryAmountOfDriver, wagesPerDayGivenToDriver, licenceValidity);
		
	}
	@Test(priority = 1)
	public void addNewDriverDetailsOnFirefox() throws EncryptedDocumentException, IOException
	{
		driver = FirefoxBrowser.openFirefox();
		
		TransportLogInPage transportLogInPage = new TransportLogInPage(driver);
		String userName = ExcelSheetForSignIn.fetchData(1, 0);
		String password = ExcelSheetForSignIn.fetchData(1, 1);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Login - Transport Management");
		transportLogInPage.logIn(driver, userName, password);
		
		test = extent.createTest("addNewDriverDetailsOnFirefox");
		
		AddNewDriver addNewDriver = new AddNewDriver(driver);
		addNewDriver.openAddNewDriverForm(driver);
		
		String nameOfDriver = ExcelSheetForAddNewDriver.fetchDriverData(1, 0);
		String address = ExcelSheetForAddNewDriver.fetchDriverData(1, 1);
		String city = ExcelSheetForAddNewDriver.fetchDriverData(1, 2);
		String phone = ExcelSheetForAddNewDriver.fetchDriverData(1, 3);
		String aadharNo = ExcelSheetForAddNewDriver.fetchDriverData(1, 4);
		String licenceNo = ExcelSheetForAddNewDriver.fetchDriverData(1, 5);
		String pathOfPhoto = "E:\\Dummy Images\\Driving Licence.jpg";
		String remark = ExcelSheetForAddNewDriver.fetchDriverData(1, 6);
		String PANnumber = ExcelSheetForAddNewDriver.fetchDriverData(1, 7);
		String bankAccountNoOfDriver = ExcelSheetForAddNewDriver.fetchDriverData(1, 8);
		String bankDetailsOfDriver = ExcelSheetForAddNewDriver.fetchDriverData(1, 9);
		String emergencyNoOfDriver = ExcelSheetForAddNewDriver.fetchDriverData(1, 10);
		String currentAgeOfDriver = ExcelSheetForAddNewDriver.fetchDriverData(1, 11);
		String typeOfEmploymentOfDriver = ExcelSheetForAddNewDriver.fetchDriverData(1, 12);
		String typeOfSalaryOfDriver = ExcelSheetForAddNewDriver.fetchDriverData(1, 13);
		String salaryAmountOfDriver = ExcelSheetForAddNewDriver.fetchDriverData(1, 14);
		String wagesPerDayGivenToDriver = ExcelSheetForAddNewDriver.fetchDriverData(1, 15);
		String licenceValidity = ExcelSheetForAddNewDriver.fetchDriverData(1, 16);
		addNewDriver.addNewDriverDetails(driver, nameOfDriver, address, city, phone, aadharNo, licenceNo, pathOfPhoto, remark, PANnumber, bankAccountNoOfDriver, bankDetailsOfDriver, emergencyNoOfDriver, currentAgeOfDriver, typeOfEmploymentOfDriver, typeOfSalaryOfDriver, salaryAmountOfDriver, wagesPerDayGivenToDriver, licenceValidity);
		
	}
	@Test(priority = 2)
	public void addNewDriverDetailsOnEdge() throws EncryptedDocumentException, IOException
	{
		driver = MicrosoftEdgeBrowser.microsoftEdge();
		
		TransportLogInPage transportLogInPage = new TransportLogInPage(driver);
		String userName = ExcelSheetForSignIn.fetchData(1, 0);
		String password = ExcelSheetForSignIn.fetchData(1, 1);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Login - Transport Management");
		transportLogInPage.logIn(driver, userName, password);
		
		test = extent.createTest("addNewDriverDetailsOnEdge");
		
		AddNewDriver addNewDriver = new AddNewDriver(driver);
		addNewDriver.openAddNewDriverForm(driver);
		
		String nameOfDriver = ExcelSheetForAddNewDriver.fetchDriverData(1, 0);
		String address = ExcelSheetForAddNewDriver.fetchDriverData(1, 1);
		String city = ExcelSheetForAddNewDriver.fetchDriverData(1, 2);
		String phone = ExcelSheetForAddNewDriver.fetchDriverData(1, 3);
		String aadharNo = ExcelSheetForAddNewDriver.fetchDriverData(1, 4);
		String licenceNo = ExcelSheetForAddNewDriver.fetchDriverData(1, 5);
		String pathOfPhoto = "E:\\Dummy Images\\Driving Licence.jpg";
		String remark = ExcelSheetForAddNewDriver.fetchDriverData(1, 6);
		String PANnumber = ExcelSheetForAddNewDriver.fetchDriverData(1, 7);
		String bankAccountNoOfDriver = ExcelSheetForAddNewDriver.fetchDriverData(1, 8);
		String bankDetailsOfDriver = ExcelSheetForAddNewDriver.fetchDriverData(1, 9);
		String emergencyNoOfDriver = ExcelSheetForAddNewDriver.fetchDriverData(1, 10);
		String currentAgeOfDriver = ExcelSheetForAddNewDriver.fetchDriverData(1, 11);
		String typeOfEmploymentOfDriver = ExcelSheetForAddNewDriver.fetchDriverData(1, 12);
		String typeOfSalaryOfDriver = ExcelSheetForAddNewDriver.fetchDriverData(1, 13);
		String salaryAmountOfDriver = ExcelSheetForAddNewDriver.fetchDriverData(1, 14);
		String wagesPerDayGivenToDriver = ExcelSheetForAddNewDriver.fetchDriverData(1, 15);
		String licenceValidity = ExcelSheetForAddNewDriver.fetchDriverData(1, 16);
		addNewDriver.addNewDriverDetails(driver, nameOfDriver, address, city, phone, aadharNo, licenceNo, pathOfPhoto, remark, PANnumber, bankAccountNoOfDriver, bankDetailsOfDriver, emergencyNoOfDriver, currentAgeOfDriver, typeOfEmploymentOfDriver, typeOfSalaryOfDriver, salaryAmountOfDriver, wagesPerDayGivenToDriver, licenceValidity);
		
	}
	@AfterMethod
	public void postExecution(ITestResult result) 
	{
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
	public void flushReport()
	{
		extent.flush();
	}
	
	

}
