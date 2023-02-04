package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewBattery {
	
	@FindBy (xpath = "/html/body/div/header/nav/div/div[2]/ul/li[8]/a") private WebElement vehicle;
	@FindBy (xpath = "/html/body/div/header/nav/div/div[2]/ul/li[8]/ul/li/div/ul/li[4]/a") private WebElement batteryRecord;
	@FindBy (xpath = "/html/body/div/div/div/section[2]/div/div[2]/div/div[2]/form/div[1]/div/input") private WebElement serialNumber;
    @FindBy (xpath = "/html/body/div/div/div/section[2]/div/div[2]/div/div[2]/form/div[2]/div/input") private WebElement volts;
    @FindBy (xpath = "/html/body/div/div/div/section[2]/div/div[2]/div/div[2]/form/div[3]/div/input") private WebElement validFromDate;
    @FindBy (xpath = "/html/body/div/div/div/section[2]/div/div[2]/div/div[2]/form/div[4]/div/input") private WebElement validTillDate;
    @FindBy (xpath = "/html/body/div/div/div/section[2]/div/div[2]/div/div[2]/form/div[5]/div/input") private WebElement brand;
    @FindBy (xpath = "/html/body/div/div/div/section[2]/div/div[2]/div/div[2]/form/div[6]/div/input") private WebElement price;
    @FindBy (xpath = "/html/body/div/div/div/section[2]/div/div[2]/div/div[2]/form/div[7]/div/input") private WebElement type;
    @FindBy (xpath = "/html/body/div/div/div/section[2]/div/div[2]/div/div[2]/form/div[8]/textarea") private WebElement remark;
    @FindBy (xpath = "/html/body/div/div/div/section[2]/div/div[2]/div/div[3]/div/button") private WebElement submit;
    
    public AddNewBattery(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    public void openBatteryRecord (WebDriver driver) {
    	
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	
    	vehicle.click();
    	batteryRecord.click();
    }
    public void addPurchaseItemsDetails(WebDriver driver, String serialnumber, String batteryVolts, String validityFrom, String validityTill, String nameOfBrand, String priceOfBattery, String typeOfBattery, String remarks)
    {
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	
    	serialNumber.sendKeys(serialnumber);
    	volts.sendKeys(batteryVolts);
    	
    	validFromDate.sendKeys(validityFrom);
    	validTillDate.sendKeys(validityTill);
    
        brand.sendKeys(nameOfBrand);
        price.sendKeys(priceOfBattery);
        
        type.sendKeys(typeOfBattery);
        remark.sendKeys(remarks);
        
//      submit.click();
    
    }
    
    
}
