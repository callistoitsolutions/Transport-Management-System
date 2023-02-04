package utitlity;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {
	
	public static ExtentReports configureReport (String typeOfTesting,String moduleName, String nameOfTester)
	{
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter("Transport.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Name Of Project", "Transport Management System");
		extent.setSystemInfo("Type Of Testing", typeOfTesting );
		extent.setSystemInfo("Name Of Module", moduleName);
		extent.setSystemInfo("Name Of Tester", nameOfTester);
		return extent ;
		
	}

}
