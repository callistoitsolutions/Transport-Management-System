package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

import utitlity.ScreenShots;

public class Listener extends BaseClass implements ITestListener {
	
	public void onTestStart(ITestResult result)
	{
		System.out.println(result.getName() + " has started");
	}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println(result.getName() + " has passed");
	}
	public void onTestFailure(ITestResult result)
	{
		try {
			ScreenShots.screenshot(driver, result.getName());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		System.out.println(result.getName() + " has failed");
	}
	
	public void OnTestSkipped(ITestResult result) {
		System.out.println(result.getName() + " has skipped");
	}
	
	
	
	
	

}
