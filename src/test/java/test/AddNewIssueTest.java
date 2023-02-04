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
import pom.AddNewIssue;
import pom.TransportLogInPage;
import utitlity.ExcelSheetForAddNewIssue;
import utitlity.ExcelSheetForSignIn;
import utitlity.Reports;
@Listeners(Listener.class)
public class AddNewIssueTest extends BaseClass {
	
	ExtentReports extent;
	ExtentTest test;
	
	@BeforeTest
	public void generateReports()
	{
		extent = Reports.configureReport("System Testing","Add New Issue", "Swapnil Ramteke");
	}
	
	@Test
	public void addNewIssueOnChrome() throws EncryptedDocumentException, IOException
	{
		driver = ChromeBrowser.launchBrowser();
		
		TransportLogInPage transportLogIn = new TransportLogInPage(driver);
		String userName = ExcelSheetForSignIn.fetchData(1, 0);
		String password = ExcelSheetForSignIn.fetchData(1, 1);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Login - Transport Management");
		transportLogIn.logIn(driver, userName, password);
		
		test = extent.createTest("addNewIssueOnChrome");
		
		AddNewIssue addNewIssue = new AddNewIssue(driver);
		addNewIssue.openAddNewIssueForm(driver);
		
		String titleOfIssue = ExcelSheetForAddNewIssue.fetchIssueData(1, 0);
		String descriptionOfIssue = ExcelSheetForAddNewIssue.fetchIssueData(1, 1);
		String priorityOfIssue = ExcelSheetForAddNewIssue.fetchIssueData(1, 2);
		String dueDateOfIssue = ExcelSheetForAddNewIssue.fetchIssueData(1, 3);
		String nameOfAssignee = ExcelSheetForAddNewIssue.fetchIssueData(1, 4);
		String pathOfPhoto = "E:\\Dummy Images\\Issue.jpg";
		addNewIssue.addNewIssueDetails(driver, titleOfIssue, "TATA MOTORS", descriptionOfIssue, priorityOfIssue, dueDateOfIssue, nameOfAssignee, pathOfPhoto);
	
	}
	@Test(priority = 1)
	public void addNewIssueOnFirefox() throws EncryptedDocumentException, IOException
	{
		driver = FirefoxBrowser.openFirefox();
		
		TransportLogInPage transportLogIn = new TransportLogInPage(driver);
		String userName = ExcelSheetForSignIn.fetchData(1, 0);
		String password = ExcelSheetForSignIn.fetchData(1, 1);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Login - Transport Management");
		transportLogIn.logIn(driver, userName, password);
		
		test = extent.createTest("addNewIssueOnFirefox");
		
		AddNewIssue addNewIssue = new AddNewIssue(driver);
		addNewIssue.openAddNewIssueForm(driver);
		
		String titleOfIssue = ExcelSheetForAddNewIssue.fetchIssueData(1, 0);
		String descriptionOfIssue = ExcelSheetForAddNewIssue.fetchIssueData(1, 1);
		String priorityOfIssue = ExcelSheetForAddNewIssue.fetchIssueData(1, 2);
		String dueDateOfIssue = ExcelSheetForAddNewIssue.fetchIssueData(1, 3);
		String nameOfAssignee = ExcelSheetForAddNewIssue.fetchIssueData(1, 4);
		String pathOfPhoto = "E:\\Dummy Images\\Issue.jpg";
		addNewIssue.addNewIssueDetails(driver, titleOfIssue, "TATA MOTORS", descriptionOfIssue, priorityOfIssue, dueDateOfIssue, nameOfAssignee, pathOfPhoto);
	
	}
	@Test(priority = 2)
	public void addNewIssueOnEdge() throws EncryptedDocumentException, IOException
	{
		driver = MicrosoftEdgeBrowser.microsoftEdge();
		
		TransportLogInPage transportLogIn = new TransportLogInPage(driver);
		String userName = ExcelSheetForSignIn.fetchData(1, 0);
		String password = ExcelSheetForSignIn.fetchData(1, 1);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Login - Transport Management");
		transportLogIn.logIn(driver, userName, password);
		
		test = extent.createTest("addNewIssueOnEdge");
		
		AddNewIssue addNewIssue = new AddNewIssue(driver);
		addNewIssue.openAddNewIssueForm(driver);
		
		String titleOfIssue = ExcelSheetForAddNewIssue.fetchIssueData(1, 0);
		String descriptionOfIssue = ExcelSheetForAddNewIssue.fetchIssueData(1, 1);
		String priorityOfIssue = ExcelSheetForAddNewIssue.fetchIssueData(1, 2);
		String dueDateOfIssue = ExcelSheetForAddNewIssue.fetchIssueData(1, 3);
		String nameOfAssignee = ExcelSheetForAddNewIssue.fetchIssueData(1, 4);
		String pathOfPhoto = "E:\\Dummy Images\\Issue.jpg";
		addNewIssue.addNewIssueDetails(driver, titleOfIssue, "TATA MOTORS", descriptionOfIssue, priorityOfIssue, dueDateOfIssue, nameOfAssignee, pathOfPhoto);
	
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
