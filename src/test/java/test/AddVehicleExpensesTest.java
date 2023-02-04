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
import pom.AddVehicleExpenses;
import pom.TransportLogInPage;
import utitlity.ExcelSheetForAddVehicleExpenses;
import utitlity.ExcelSheetForSignIn;
import utitlity.Reports;
@Listeners(Listener.class)
public class AddVehicleExpensesTest extends BaseClass{
	
	ExtentReports extent;
	ExtentTest test;
	
	@BeforeTest
	public void generateVehicleExpenseReport()
	{
		extent = Reports.configureReport("System Testing", "Add Vehicle Expenses", "Swapnil Ramteke");
	}
	@Test
	public void addVehicleExpensesOnChrome() throws EncryptedDocumentException, IOException
	{
		driver = ChromeBrowser.launchBrowser();
		
		TransportLogInPage transportLogInPage = new TransportLogInPage(driver);
		String userName = ExcelSheetForSignIn.fetchData(1, 0);
		String password = ExcelSheetForSignIn.fetchData(1, 1);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Login - Transport Management");
		transportLogInPage.logIn(driver, userName, password);
		
		test = extent.createTest("addVehicleExpensesOnChrome");
		AddVehicleExpenses addVehicleExpenses = new AddVehicleExpenses(driver);
		addVehicleExpenses.openAddVehicleExpensesForm(driver);
		
		String nameOfExpense = ExcelSheetForAddVehicleExpenses.fetchVehicleExpenseData(1, 0);
		String dateOnInvoice = ExcelSheetForAddVehicleExpenses.fetchVehicleExpenseData(1, 1);
		String typeOfExpense = ExcelSheetForAddVehicleExpenses.fetchVehicleExpenseData(1, 2);
		String nameOfCleaner = ExcelSheetForAddVehicleExpenses.fetchVehicleExpenseData(1, 3);
		String priceOfExpense = ExcelSheetForAddVehicleExpenses.fetchVehicleExpenseData(1, 4);
		String expenseCity = ExcelSheetForAddVehicleExpenses.fetchVehicleExpenseData(1, 5);
		String remarks = ExcelSheetForAddVehicleExpenses.fetchVehicleExpenseData(1, 6);
		String pathOfInvoice = "E:\\Dummy Images\\Expenses.png";
		addVehicleExpenses.addVehicleExpensesDatails(driver, nameOfExpense, dateOnInvoice, "TATA MOTORS", "YASHVANT BHANDEKAR", "YAMINA", typeOfExpense, nameOfCleaner, priceOfExpense, expenseCity, remarks, pathOfInvoice);
	}
	@Test(priority = 1)
	public void addVehicleExpensesOnFirefox() throws EncryptedDocumentException, IOException
	{
		driver = FirefoxBrowser.openFirefox();
		
		TransportLogInPage transportLogInPage = new TransportLogInPage(driver);
		String userName = ExcelSheetForSignIn.fetchData(1, 0);
		String password = ExcelSheetForSignIn.fetchData(1, 1);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Login - Transport Management");
		transportLogInPage.logIn(driver, userName, password);
		
		test = extent.createTest("addVehicleExpensesOnFirefox");
		AddVehicleExpenses addVehicleExpenses = new AddVehicleExpenses(driver);
		addVehicleExpenses.openAddVehicleExpensesForm(driver);
		
		String nameOfExpense = ExcelSheetForAddVehicleExpenses.fetchVehicleExpenseData(1, 0);
		String dateOnInvoice = ExcelSheetForAddVehicleExpenses.fetchVehicleExpenseData(1, 1);
		String typeOfExpense = ExcelSheetForAddVehicleExpenses.fetchVehicleExpenseData(1, 2);
		String nameOfCleaner = ExcelSheetForAddVehicleExpenses.fetchVehicleExpenseData(1, 3);
		String priceOfExpense = ExcelSheetForAddVehicleExpenses.fetchVehicleExpenseData(1, 4);
		String expenseCity = ExcelSheetForAddVehicleExpenses.fetchVehicleExpenseData(1, 5);
		String remarks = ExcelSheetForAddVehicleExpenses.fetchVehicleExpenseData(1, 6);
		String pathOfInvoice = "E:\\Dummy Images\\Expenses.png";
		addVehicleExpenses.addVehicleExpensesDatails(driver, nameOfExpense, dateOnInvoice, "TATA MOTORS", "YASHVANT BHANDEKAR", "YAMINA", typeOfExpense, nameOfCleaner, priceOfExpense, expenseCity, remarks, pathOfInvoice);
	}
	@Test(priority = 2)
	public void addVehicleExpensesOnEdge() throws EncryptedDocumentException, IOException
	{
		driver = MicrosoftEdgeBrowser.microsoftEdge();
		
		TransportLogInPage transportLogInPage = new TransportLogInPage(driver);
		String userName = ExcelSheetForSignIn.fetchData(1, 0);
		String password = ExcelSheetForSignIn.fetchData(1, 1);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Login - Transport Management");
		transportLogInPage.logIn(driver, userName, password);
		
		test = extent.createTest("addVehicleExpensesOnEdge");
		AddVehicleExpenses addVehicleExpenses = new AddVehicleExpenses(driver);
		addVehicleExpenses.openAddVehicleExpensesForm(driver);
		
		String nameOfExpense = ExcelSheetForAddVehicleExpenses.fetchVehicleExpenseData(1, 0);
		String dateOnInvoice = ExcelSheetForAddVehicleExpenses.fetchVehicleExpenseData(1, 1);
		String typeOfExpense = ExcelSheetForAddVehicleExpenses.fetchVehicleExpenseData(1, 2);
		String nameOfCleaner = ExcelSheetForAddVehicleExpenses.fetchVehicleExpenseData(1, 3);
		String priceOfExpense = ExcelSheetForAddVehicleExpenses.fetchVehicleExpenseData(1, 4);
		String expenseCity = ExcelSheetForAddVehicleExpenses.fetchVehicleExpenseData(1, 5);
		String remarks = ExcelSheetForAddVehicleExpenses.fetchVehicleExpenseData(1, 6);
		String pathOfInvoice = "E:\\Dummy Images\\Expenses.png";
		addVehicleExpenses.addVehicleExpensesDatails(driver, nameOfExpense, dateOnInvoice, "TATA MOTORS", "YASHVANT BHANDEKAR", "YAMINA", typeOfExpense, nameOfCleaner, priceOfExpense, expenseCity, remarks, pathOfInvoice);
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
