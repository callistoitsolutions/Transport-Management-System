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
import pom.AddEMIExpenses;
import pom.TransportLogInPage;
import utitlity.ExcelSheetForAddEMIExpenses;
import utitlity.ExcelSheetForSignIn;
import utitlity.Reports;

@Listeners(Listener.class)
public class AddEMIExpensesTest extends BaseClass {
	
	ExtentReports extent;
	ExtentTest test;
	
	@BeforeTest
	public void generateEMIExpensesReports()
	{
		extent = Reports.configureReport("System Testing", "Add EMI Expenses", "Swapnil Ramteke");
	}
	@Test
	public void addEMIExpensesOnChrome() throws EncryptedDocumentException, IOException
	{
		driver = ChromeBrowser.launchBrowser();
		
		TransportLogInPage transportLogInPage = new TransportLogInPage(driver);
		String userName = ExcelSheetForSignIn.fetchData(1, 0);
		String password = ExcelSheetForSignIn.fetchData(1, 1);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Login - Transport Management");
		transportLogInPage.logIn(driver, userName, password);
	
		test = extent.createTest("addEMIExpensesOnChrome");
	    AddEMIExpenses addEMIExpenses= new AddEMIExpenses(driver);
	    addEMIExpenses.openAddEMIExpensesForm(driver);
	    
	    String numberOfVehicle = ExcelSheetForAddEMIExpenses.fetchEMIExpensesData(1, 0);
	    String typeOfVehicle = ExcelSheetForAddEMIExpenses.fetchEMIExpensesData(1, 1);
	    String modelOfVehicle = ExcelSheetForAddEMIExpenses.fetchEMIExpensesData(1, 2);
	    String yearOfManufacture = ExcelSheetForAddEMIExpenses.fetchEMIExpensesData(1, 3);
	    String nameOfOwner = ExcelSheetForAddEMIExpenses.fetchEMIExpensesData(1, 4);
	    String nameOfFinance = ExcelSheetForAddEMIExpenses.fetchEMIExpensesData(1, 5);
	    String numberOfEMI = ExcelSheetForAddEMIExpenses.fetchEMIExpensesData(1, 6);
	    String startDateOfEMI = ExcelSheetForAddEMIExpenses.fetchEMIExpensesData(1, 7);
	    String endDateOfEMI = ExcelSheetForAddEMIExpenses.fetchEMIExpensesData(1, 8);
	    String amountOfEMI = ExcelSheetForAddEMIExpenses.fetchEMIExpensesData(1, 9);
	    String remarks = ExcelSheetForAddEMIExpenses.fetchEMIExpensesData(1, 10);
	    addEMIExpenses.addEMIExpensesData(driver, numberOfVehicle, typeOfVehicle, modelOfVehicle, yearOfManufacture, nameOfOwner, nameOfFinance, numberOfEMI, startDateOfEMI, endDateOfEMI, amountOfEMI, remarks);
	}
	@Test(priority = 1)
	public void addEMIExpensesOnFirefox() throws EncryptedDocumentException, IOException
	{
		driver = FirefoxBrowser.openFirefox();
		
		TransportLogInPage transportLogInPage = new TransportLogInPage(driver);
		String userName = ExcelSheetForSignIn.fetchData(1, 0);
		String password = ExcelSheetForSignIn.fetchData(1, 1);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Login - Transport Management");
		transportLogInPage.logIn(driver, userName, password);
	
		test = extent.createTest("addEMIExpensesOnFirefox");
	    AddEMIExpenses addEMIExpenses= new AddEMIExpenses(driver);
	    addEMIExpenses.openAddEMIExpensesForm(driver);
	    
	    String numberOfVehicle = ExcelSheetForAddEMIExpenses.fetchEMIExpensesData(1, 0);
	    String typeOfVehicle = ExcelSheetForAddEMIExpenses.fetchEMIExpensesData(1, 1);
	    String modelOfVehicle = ExcelSheetForAddEMIExpenses.fetchEMIExpensesData(1, 2);
	    String yearOfManufacture = ExcelSheetForAddEMIExpenses.fetchEMIExpensesData(1, 3);
	    String nameOfOwner = ExcelSheetForAddEMIExpenses.fetchEMIExpensesData(1, 4);
	    String nameOfFinance = ExcelSheetForAddEMIExpenses.fetchEMIExpensesData(1, 5);
	    String numberOfEMI = ExcelSheetForAddEMIExpenses.fetchEMIExpensesData(1, 6);
	    String startDateOfEMI = ExcelSheetForAddEMIExpenses.fetchEMIExpensesData(1, 7);
	    String endDateOfEMI = ExcelSheetForAddEMIExpenses.fetchEMIExpensesData(1, 8);
	    String amountOfEMI = ExcelSheetForAddEMIExpenses.fetchEMIExpensesData(1, 9);
	    String remarks = ExcelSheetForAddEMIExpenses.fetchEMIExpensesData(1, 10);
	    addEMIExpenses.addEMIExpensesData(driver, numberOfVehicle, typeOfVehicle, modelOfVehicle, yearOfManufacture, nameOfOwner, nameOfFinance, numberOfEMI, startDateOfEMI, endDateOfEMI, amountOfEMI, remarks);
	}
	@Test(priority = 2)
	public void addEMIExpensesOnEdge() throws EncryptedDocumentException, IOException
	{
		driver = MicrosoftEdgeBrowser.microsoftEdge();
		
		TransportLogInPage transportLogInPage = new TransportLogInPage(driver);
		String userName = ExcelSheetForSignIn.fetchData(1, 0);
		String password = ExcelSheetForSignIn.fetchData(1, 1);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Login - Transport Management");
		transportLogInPage.logIn(driver, userName, password);
	
		test = extent.createTest("addEMIExpensesOnEdge");
	    AddEMIExpenses addEMIExpenses= new AddEMIExpenses(driver);
	    addEMIExpenses.openAddEMIExpensesForm(driver);
	    
	    String numberOfVehicle = ExcelSheetForAddEMIExpenses.fetchEMIExpensesData(1, 0);
	    String typeOfVehicle = ExcelSheetForAddEMIExpenses.fetchEMIExpensesData(1, 1);
	    String modelOfVehicle = ExcelSheetForAddEMIExpenses.fetchEMIExpensesData(1, 2);
	    String yearOfManufacture = ExcelSheetForAddEMIExpenses.fetchEMIExpensesData(1, 3);
	    String nameOfOwner = ExcelSheetForAddEMIExpenses.fetchEMIExpensesData(1, 4);
	    String nameOfFinance = ExcelSheetForAddEMIExpenses.fetchEMIExpensesData(1, 5);
	    String numberOfEMI = ExcelSheetForAddEMIExpenses.fetchEMIExpensesData(1, 6);
	    String startDateOfEMI = ExcelSheetForAddEMIExpenses.fetchEMIExpensesData(1, 7);
	    String endDateOfEMI = ExcelSheetForAddEMIExpenses.fetchEMIExpensesData(1, 8);
	    String amountOfEMI = ExcelSheetForAddEMIExpenses.fetchEMIExpensesData(1, 9);
	    String remarks = ExcelSheetForAddEMIExpenses.fetchEMIExpensesData(1, 10);
	    addEMIExpenses.addEMIExpensesData(driver, numberOfVehicle, typeOfVehicle, modelOfVehicle, yearOfManufacture, nameOfOwner, nameOfFinance, numberOfEMI, startDateOfEMI, endDateOfEMI, amountOfEMI, remarks);
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
