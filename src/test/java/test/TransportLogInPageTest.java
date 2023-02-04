package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
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
import pom.TransportLogInPage;
import utitlity.ExcelSheetForSignIn;
import utitlity.Reports;

@Listeners(Listener.class)
public class TransportLogInPageTest extends BaseClass{
	ExtentReports extent ;
	ExtentTest test ;
	
	@BeforeTest
	public void makeReport ()
	{
		extent = Reports.configureReport("Regression Testing","Transport Log In", "Swapnil Ramteke");
	}
	
	@Test
	public void logInToTransportWithChrome () throws EncryptedDocumentException, IOException
	{
		test = extent.createTest("logInToTransportWithChrome");
		driver = ChromeBrowser.launchBrowser();
		String title = driver.getTitle();
		Assert.assertEquals(title, "Login - Transport Management");
		
		TransportLogInPage tlp = new TransportLogInPage(driver);
		String userName = ExcelSheetForSignIn.fetchData(1, 0);
		String password = ExcelSheetForSignIn.fetchData(1, 1);
		tlp.logIn(driver,userName, password );
		String title1 = driver.getTitle();
		Assert.assertEquals(title1, "Home | Transport Management");
		
	}
	@Test(priority = 1)
	public void logInToTransportWithFirefox() throws EncryptedDocumentException, IOException {
		test = extent.createTest("logInToTransportWithFirefox");
		driver = FirefoxBrowser.openFirefox();
		String title = driver.getTitle();
		Assert.assertEquals(title, "Login - Transport Management");
		
		TransportLogInPage tlp = new TransportLogInPage(driver);
		String userName = ExcelSheetForSignIn.fetchData(1, 0);
		String password = ExcelSheetForSignIn.fetchData(1, 1);
		tlp.logIn(driver, userName, password);
		String title1 = driver.getTitle();
		Assert.assertEquals(title1, "Home | Transport Management");
		
	}
	@Test(priority = 2)
	 public void logInTOTransportWithEdge() throws EncryptedDocumentException, IOException {
				
			test = extent.createTest("logInTOTransportWithEdge");
			driver = MicrosoftEdgeBrowser.microsoftEdge();
			String title = driver.getTitle();
			Assert.assertEquals(title, "Login - Transport Management");
			
			TransportLogInPage tlp = new TransportLogInPage(driver);
			String userName = ExcelSheetForSignIn.fetchData(1, 0);
			String password = ExcelSheetForSignIn.fetchData(1, 1);
			tlp.logIn(driver, userName, password);
			String title1 = driver.getTitle();
			Assert.assertEquals(title1, "Home | Transport Management");
	}
	
	@AfterMethod
	public void postExecution (ITestResult result)
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
	public void flushReport ()
	{
		extent.flush();
	}
	

}
