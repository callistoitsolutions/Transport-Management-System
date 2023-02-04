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
import pom.AddNewStaff;
import pom.TransportLogInPage;
import utitlity.ExcelSheetForAddNewStaff;
import utitlity.ExcelSheetForSignIn;
import utitlity.Reports;

@Listeners(Listener.class)
public class AddNewStaffTest extends BaseClass {
	
	ExtentReports extent;
	ExtentTest test;
	
	@BeforeTest
	public void generateNewStaffReports()
	{
		extent = Reports.configureReport("System Testing", "Add New Staff", "Swapnil Ramteke");
	}
	@Test
	public void addNewStaffOnChrome() throws EncryptedDocumentException, IOException
	{
		driver = ChromeBrowser.launchBrowser();
		
		TransportLogInPage transportLogInPage = new TransportLogInPage(driver);
		String userName = ExcelSheetForSignIn.fetchData(1, 0);
		String password = ExcelSheetForSignIn.fetchData(1, 1);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Login - Transport Management");
		transportLogInPage.logIn(driver, userName, password);
		
		test = extent.createTest("addNewStaffOnChrome");
		
		AddNewStaff addNewStaff = new AddNewStaff(driver);
		addNewStaff.openAddNewStaffForm(driver);
		
		String nameOfStaff = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 0);
		String numberOfStaff = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 1);
		String emergencyNumberOfStaff = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 2);
		String ageOfStaff = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 3);
		String employmentType = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 4);
		String salaryType = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 5);
		String addressOfStaff = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 6);
		String cityOfStaff = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 7);
		String aadharNoOfStaff = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 8);
		String licenceNoOfStaff = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 9);
		String PANnumber = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 10);
		String licenceValidityOfStaff = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 11);
		String BankAccountNumber = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 12);
		String detailsOfBank = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 13);
		String salaryOfStaff = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 14);
		String dailyWagesGiven = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 15);
		String remarks = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 16);
		String pathOfImage = "E:\\Dummy Images\\Driving Licence.jpg";
		addNewStaff.addNewStaffDetails(driver, nameOfStaff, numberOfStaff, emergencyNumberOfStaff, ageOfStaff, employmentType, salaryType, addressOfStaff, cityOfStaff, aadharNoOfStaff, licenceNoOfStaff, PANnumber, licenceValidityOfStaff, BankAccountNumber, detailsOfBank, salaryOfStaff, dailyWagesGiven, remarks, pathOfImage);
	}
	@Test(priority = 1)
	public void addNewStaffOnFirefox() throws EncryptedDocumentException, IOException
	{
		driver = FirefoxBrowser.openFirefox();
		
		TransportLogInPage transportLogInPage = new TransportLogInPage(driver);
		String userName = ExcelSheetForSignIn.fetchData(1, 0);
		String password = ExcelSheetForSignIn.fetchData(1, 1);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Login - Transport Management");
		transportLogInPage.logIn(driver, userName, password);
		
		test = extent.createTest("addNewStaffOnFirefox");
		
		AddNewStaff addNewStaff = new AddNewStaff(driver);
		addNewStaff.openAddNewStaffForm(driver);
		
		String nameOfStaff = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 0);
		String numberOfStaff = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 1);
		String emergencyNumberOfStaff = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 2);
		String ageOfStaff = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 3);
		String employmentType = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 4);
		String salaryType = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 5);
		String addressOfStaff = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 6);
		String cityOfStaff = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 7);
		String aadharNoOfStaff = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 8);
		String licenceNoOfStaff = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 9);
		String PANnumber = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 10);
		String licenceValidityOfStaff = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 11);
		String BankAccountNumber = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 12);
		String detailsOfBank = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 13);
		String salaryOfStaff = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 14);
		String dailyWagesGiven = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 15);
		String remarks = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 16);
		String pathOfImage = "E:\\Dummy Images\\Driving Licence.jpg";
		addNewStaff.addNewStaffDetails(driver, nameOfStaff, numberOfStaff, emergencyNumberOfStaff, ageOfStaff, employmentType, salaryType, addressOfStaff, cityOfStaff, aadharNoOfStaff, licenceNoOfStaff, PANnumber, licenceValidityOfStaff, BankAccountNumber, detailsOfBank, salaryOfStaff, dailyWagesGiven, remarks, pathOfImage);
	}
	@Test(priority = 2)
	public void addNewStaffOnEdge() throws EncryptedDocumentException, IOException
	{
		driver = MicrosoftEdgeBrowser.microsoftEdge();
		
		TransportLogInPage transportLogInPage = new TransportLogInPage(driver);
		String userName = ExcelSheetForSignIn.fetchData(1, 0);
		String password = ExcelSheetForSignIn.fetchData(1, 1);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Login - Transport Management");
		transportLogInPage.logIn(driver, userName, password);
		
		test = extent.createTest("addNewStaffOnEdge");
		
		AddNewStaff addNewStaff = new AddNewStaff(driver);
		addNewStaff.openAddNewStaffForm(driver);
		
		String nameOfStaff = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 0);
		String numberOfStaff = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 1);
		String emergencyNumberOfStaff = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 2);
		String ageOfStaff = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 3);
		String employmentType = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 4);
		String salaryType = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 5);
		String addressOfStaff = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 6);
		String cityOfStaff = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 7);
		String aadharNoOfStaff = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 8);
		String licenceNoOfStaff = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 9);
		String PANnumber = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 10);
		String licenceValidityOfStaff = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 11);
		String BankAccountNumber = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 12);
		String detailsOfBank = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 13);
		String salaryOfStaff = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 14);
		String dailyWagesGiven = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 15);
		String remarks = ExcelSheetForAddNewStaff.fetchAddNewStaffData(1, 16);
		String pathOfImage = "E:\\Dummy Images\\Driving Licence.jpg";
		addNewStaff.addNewStaffDetails(driver, nameOfStaff, numberOfStaff, emergencyNumberOfStaff, ageOfStaff, employmentType, salaryType, addressOfStaff, cityOfStaff, aadharNoOfStaff, licenceNoOfStaff, PANnumber, licenceValidityOfStaff, BankAccountNumber, detailsOfBank, salaryOfStaff, dailyWagesGiven, remarks, pathOfImage);
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
	public void flushReports()
	{
		extent.flush();
	}

}
