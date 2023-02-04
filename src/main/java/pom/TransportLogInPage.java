package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utitlity.ExcelSheetForSignIn;

public class TransportLogInPage {
	
	@FindBy (xpath = "//input[@type='text']") private WebElement userName;
	@FindBy (xpath = "//input[@type='password']") private WebElement pass ;
	@FindBy (xpath = "//select[@class='form-control select2']") private WebElement transportList;
	@FindBy (xpath = "//button[text()='Sign In']") private WebElement signIn ;
	@FindBy (xpath = "//button[text()='Clear']") private WebElement clear ;
	
	public TransportLogInPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void logIn (WebDriver driver, String userName1, String password)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		userName.sendKeys(userName1);
		pass.sendKeys(password);
		
		Select sel =new Select (transportList);
		sel.selectByIndex(0);
		
		signIn.click();
		
		
		
	}
	

}
