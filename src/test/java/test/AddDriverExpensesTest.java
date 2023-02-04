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
import pom.AddDriverExpenses;
import pom.TransportLogInPage;
import utitlity.ExcelSheetForAddDriverExpenses;
import utitlity.ExcelSheetForSignIn;
import utitlity.Reports;
@Listeners(Listener.class)
public class AddDriverExpensesTest extends BaseClass {

	ExtentReports extent;
	ExtentTest test;
	
	@BeforeTest
	public void generateDriverExpenseReport()
	{
		extent = Reports.configureReport("System Testing", "Add Driver expenses", "Swapnil Ramteke");
	}
	@Test
	public void addDriverExpensesOnChrome() throws EncryptedDocumentException, IOException
	{
		driver = ChromeBrowser.launchBrowser();
		
		TransportLogInPage transportLogInPage = new TransportLogInPage(driver);
		String userName = ExcelSheetForSignIn.fetchData(1, 0);
		String password = ExcelSheetForSignIn.fetchData(1, 1);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Login - Transport Management");
		transportLogInPage.logIn(driver, userName, password);
		
		test = extent.createTest("addDriverExpensesOnChrome");
		
		AddDriverExpenses addDriverExpenses = new AddDriverExpenses(driver);
		addDriverExpenses.openAddDriverExpensesForm(driver);
		
		String nameOfExpense = ExcelSheetForAddDriverExpenses.fetchDriverExpenseData(1, 0);
		String expenseDate = ExcelSheetForAddDriverExpenses.fetchDriverExpenseData(1, 1);
		String expenseCity = ExcelSheetForAddDriverExpenses.fetchDriverExpenseData(1, 2);
		String advanceAmount = ExcelSheetForAddDriverExpenses.fetchDriverExpenseData(1, 3);
		String priceAmount = ExcelSheetForAddDriverExpenses.fetchDriverExpenseData(1, 4);
		String remarks = ExcelSheetForAddDriverExpenses.fetchDriverExpenseData(1, 5);
		String pathOfInvoice = "E:\\Dummy Images\\Expenses.png";
		addDriverExpenses.addDriverExpensesDetails(driver, nameOfExpense, expenseDate, "Harvindersingh Bhatia1", expenseCity, advanceAmount, priceAmount, remarks, pathOfInvoice);
	}
	@Test(priority = 1)
	public void addDriverExpensesOnFirefox() throws EncryptedDocumentException, IOException
	{
		driver = FirefoxBrowser.openFirefox();
		
		TransportLogInPage transportLogInPage = new TransportLogInPage(driver);
		String userName = ExcelSheetForSignIn.fetchData(1, 0);
		String password = ExcelSheetForSignIn.fetchData(1, 1);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Login - Transport Management");
		transportLogInPage.logIn(driver, userName, password);
		
		test = extent.createTest("addDriverExpensesOnFirefox");
		
		AddDriverExpenses addDriverExpenses = new AddDriverExpenses(driver);
		addDriverExpenses.openAddDriverExpensesForm(driver);
		
		String nameOfExpense = ExcelSheetForAddDriverExpenses.fetchDriverExpenseData(1, 0);
		String expenseDate = ExcelSheetForAddDriverExpenses.fetchDriverExpenseData(1, 1);
		String expenseCity = ExcelSheetForAddDriverExpenses.fetchDriverExpenseData(1, 2);
		String advanceAmount = ExcelSheetForAddDriverExpenses.fetchDriverExpenseData(1, 3);
		String priceAmount = ExcelSheetForAddDriverExpenses.fetchDriverExpenseData(1, 4);
		String remarks = ExcelSheetForAddDriverExpenses.fetchDriverExpenseData(1, 5);
		String pathOfInvoice = "E:\\Dummy Images\\Expenses.png";
		addDriverExpenses.addDriverExpensesDetails(driver, nameOfExpense, expenseDate, "Harvindersingh Bhatia1", expenseCity, advanceAmount, priceAmount, remarks, pathOfInvoice);
	}
	@Test(priority = 2)
	public void addDriverExpensesOnEdge() throws EncryptedDocumentException, IOException
	{
		driver = MicrosoftEdgeBrowser.microsoftEdge();
		
		TransportLogInPage transportLogInPage = new TransportLogInPage(driver);
		String userName = ExcelSheetForSignIn.fetchData(1, 0);
		String password = ExcelSheetForSignIn.fetchData(1, 1);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Login - Transport Management");
		transportLogInPage.logIn(driver, userName, password);
		
		test = extent.createTest("addDriverExpensesOnEdge");
		
		AddDriverExpenses addDriverExpenses = new AddDriverExpenses(driver);
		addDriverExpenses.openAddDriverExpensesForm(driver);
		
		String nameOfExpense = ExcelSheetForAddDriverExpenses.fetchDriverExpenseData(1, 0);
		String expenseDate = ExcelSheetForAddDriverExpenses.fetchDriverExpenseData(1, 1);
		String expenseCity = ExcelSheetForAddDriverExpenses.fetchDriverExpenseData(1, 2);
		String advanceAmount = ExcelSheetForAddDriverExpenses.fetchDriverExpenseData(1, 3);
		String priceAmount = ExcelSheetForAddDriverExpenses.fetchDriverExpenseData(1, 4);
		String remarks = ExcelSheetForAddDriverExpenses.fetchDriverExpenseData(1, 5);
		String pathOfInvoice = "E:\\Dummy Images\\Expenses.png";
		addDriverExpenses.addDriverExpensesDetails(driver, nameOfExpense, expenseDate, "Harvindersingh Bhatia1", expenseCity, advanceAmount, priceAmount, remarks, pathOfInvoice);
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
