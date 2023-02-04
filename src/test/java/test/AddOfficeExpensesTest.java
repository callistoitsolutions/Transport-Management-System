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
import pom.AddOfficeExpenses;
import pom.TransportLogInPage;
import utitlity.ExcelSheetForAddOfficeExpenses;
import utitlity.ExcelSheetForSignIn;
import utitlity.Reports;

@Listeners(Listener.class)
public class AddOfficeExpensesTest extends BaseClass {

	ExtentReports extent;
	ExtentTest test;
	
	@BeforeTest
	public void generateOfficeExpensesReports()
	{
		extent = Reports.configureReport("System Testing", "Add Office Expenses", "Swapnil Ramteke");
	}
	@Test
	public void addOfficeExpensesOnChrome() throws EncryptedDocumentException, IOException
	{
		driver = ChromeBrowser.launchBrowser();
		
		TransportLogInPage transportLogInPage = new TransportLogInPage(driver);
		String userName = ExcelSheetForSignIn.fetchData(1, 0);
		String password = ExcelSheetForSignIn.fetchData(1, 1);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Login - Transport Management");
	    transportLogInPage.logIn(driver, userName, password); 
	    
	    test = extent.createTest("addOfficeExpensesOnChrome");
	    
	    AddOfficeExpenses addOfficeExpenses = new AddOfficeExpenses(driver); 
	    addOfficeExpenses.openAddOfficeExpenses(driver);
	    
	    String nameOfExpense = ExcelSheetForAddOfficeExpenses.fetchOfficeExpensesData(1, 0);
	    String dateOfExpense = ExcelSheetForAddOfficeExpenses.fetchOfficeExpensesData(1, 1);
	    String priceOfExpenses = ExcelSheetForAddOfficeExpenses.fetchOfficeExpensesData(1, 2);
	    String advanceGiven = ExcelSheetForAddOfficeExpenses.fetchOfficeExpensesData(1, 3);
	    String remarks = ExcelSheetForAddOfficeExpenses.fetchOfficeExpensesData(1, 4);
	    String pathOfInvoice = "E:\\Dummy Images\\Expenses.png";
	    addOfficeExpenses.addOfficeExpensesData(driver, nameOfExpense, dateOfExpense, priceOfExpenses, advanceGiven, remarks, pathOfInvoice);
	}
	@Test(priority = 1)
	public void addOfficeExpensesOnFirefox() throws EncryptedDocumentException, IOException
	{
		driver = FirefoxBrowser.openFirefox();
		
		TransportLogInPage transportLogInPage = new TransportLogInPage(driver);
		String userName = ExcelSheetForSignIn.fetchData(1, 0);
		String password = ExcelSheetForSignIn.fetchData(1, 1);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Login - Transport Management");
	    transportLogInPage.logIn(driver, userName, password); 
	    
	    test = extent.createTest("addOfficeExpensesOnFirefox");
	    
	    AddOfficeExpenses addOfficeExpenses = new AddOfficeExpenses(driver); 
	    addOfficeExpenses.openAddOfficeExpenses(driver);
	    
	    String nameOfExpense = ExcelSheetForAddOfficeExpenses.fetchOfficeExpensesData(1, 0);
	    String dateOfExpense = ExcelSheetForAddOfficeExpenses.fetchOfficeExpensesData(1, 1);
	    String priceOfExpenses = ExcelSheetForAddOfficeExpenses.fetchOfficeExpensesData(1, 2);
	    String advanceGiven = ExcelSheetForAddOfficeExpenses.fetchOfficeExpensesData(1, 3);
	    String remarks = ExcelSheetForAddOfficeExpenses.fetchOfficeExpensesData(1, 4);
	    String pathOfInvoice = "E:\\Dummy Images\\Expenses.png";
	    addOfficeExpenses.addOfficeExpensesData(driver, nameOfExpense, dateOfExpense, priceOfExpenses, advanceGiven, remarks, pathOfInvoice);
	}
	@Test(priority = 2)
	public void addOfficeExpensesOnEdge() throws EncryptedDocumentException, IOException
	{
		driver = MicrosoftEdgeBrowser.microsoftEdge();
		
		TransportLogInPage transportLogInPage = new TransportLogInPage(driver);
		String userName = ExcelSheetForSignIn.fetchData(1, 0);
		String password = ExcelSheetForSignIn.fetchData(1, 1);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Login - Transport Management");
	    transportLogInPage.logIn(driver, userName, password); 
	    
	    test = extent.createTest("addOfficeExpensesOnEdge");
	    
	    AddOfficeExpenses addOfficeExpenses = new AddOfficeExpenses(driver); 
	    addOfficeExpenses.openAddOfficeExpenses(driver);
	    
	    String nameOfExpense = ExcelSheetForAddOfficeExpenses.fetchOfficeExpensesData(1, 0);
	    String dateOfExpense = ExcelSheetForAddOfficeExpenses.fetchOfficeExpensesData(1, 1);
	    String priceOfExpenses = ExcelSheetForAddOfficeExpenses.fetchOfficeExpensesData(1, 2);
	    String advanceGiven = ExcelSheetForAddOfficeExpenses.fetchOfficeExpensesData(1, 3);
	    String remarks = ExcelSheetForAddOfficeExpenses.fetchOfficeExpensesData(1, 4);
	    String pathOfInvoice = "E:\\Dummy Images\\Expenses.png";
	    addOfficeExpenses.addOfficeExpensesData(driver, nameOfExpense, dateOfExpense, priceOfExpenses, advanceGiven, remarks, pathOfInvoice);
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
