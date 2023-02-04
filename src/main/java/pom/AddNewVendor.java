package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewVendor {
	
	@FindBy (xpath = "/html/body/div/header/nav/div/div[2]/ul/li[5]/a") private WebElement vendor;
	@FindBy (xpath = "/html/body/div/div/div/section[2]/div/div[2]/div/div[2]/form/div[1]/div/input") private WebElement vendorName;
	@FindBy (xpath = "/html/body/div/div/div/section[2]/div/div[2]/div/div[2]/form/div[2]/div[1]/div/span/span[1]/span/span[1]") private WebElement typeOfService;
	@FindBy (xpath = "/html/body/span/span/span[1]/input") private WebElement serviceInput;
	@FindBy (xpath = "/html/body/div/div/div/section[2]/div/div[2]/div/div[2]/form/div[2]/div[2]/textarea") private WebElement vendorAddress;
	@FindBy (xpath = "/html/body/div/div/div/section[2]/div/div[2]/div/div[2]/form/div[3]/div/input") private WebElement phone;
	@FindBy (xpath = "/html/body/div/div/div/section[2]/div/div[2]/div/div[2]/form/div[4]/div/input") private WebElement city;
	@FindBy (xpath = "/html/body/div/div/div/section[2]/div/div[2]/div/div[2]/form/div[5]/div/input") private WebElement state;
	@FindBy (xpath = "/html/body/div/div/div/section[2]/div/div[2]/div/div[2]/form/div[6]/div/input") private WebElement contactPerson;
	@FindBy (xpath = "/html/body/div/div/div/section[2]/div/div[2]/div/div[2]/form/div[7]/div/input") private WebElement gstNo;
	@FindBy (xpath = "/html/body/div/div/div/section[2]/div/div[2]/div/div[2]/form/div[8]/div/button") private WebElement save;
	
	public AddNewVendor(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void addNewVendorData(WebDriver driver,String nameOfVendor, String nameOfService, String addressOfVendor, String phoneOfVendor, String locationOfVendor, String stateOfVendor, String nameOfPerson, String GSTnumber)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		vendor.click();
		vendorName.sendKeys(nameOfVendor);
		
		typeOfService.click();
		serviceInput.sendKeys(nameOfService);
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER);
		action.perform();
		
		vendorAddress.sendKeys(addressOfVendor);
		phone.sendKeys(phoneOfVendor);
		
		city.sendKeys(locationOfVendor);
		state.sendKeys(stateOfVendor);
		
		contactPerson.sendKeys(nameOfPerson);
		gstNo.sendKeys(GSTnumber);

//      save.click();		
	}

}
