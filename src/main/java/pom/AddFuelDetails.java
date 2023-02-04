package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddFuelDetails {
	
	@FindBy (xpath = "/html/body/div[1]/header/nav/div/div[2]/ul/li[6]/a") private WebElement fuel;
	@FindBy (xpath = "/html/body/div[1]/div/div/section[1]/h1/a[2]") private WebElement plus;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[1]/div/input[2]") private WebElement fuelName;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[2]/div/input") private WebElement date;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[3]/div/select") private WebElement vehicle;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[4]/div/input") private WebElement odometer;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[5]/div/input") private WebElement partialFuelUp;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[6]/div/input") private WebElement quantity;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[7]/div/input") private WebElement pricePerUnit;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[8]/div/select") private WebElement vendor;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[9]/div/input") private WebElement invoiceNo;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[10]/div/input") private WebElement invoiceUpload;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[11]/div/textarea") private WebElement remark;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[3]/button[1]") private WebElement saveChanges;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[3]/button[2]") private WebElement close;
	
public AddFuelDetails(WebDriver driver)	
{
	PageFactory.initElements(driver, this);
}

public void openAddFuelDetailsForm(WebDriver driver)
{
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	fuel.click();
	plus.click();
}
public void addNewFuelDetails(WebDriver driver, String typeOfFuel, String dateOfFueling, String nameOfManufacture, String odometerReading, String partialFuelup, String quantityOfFuel, String currentPriceOfFuelPerUnit, String nameOfVendor, String invoiceNumber, String pathOfInvoice, String remarks)
{
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	fuelName.sendKeys(typeOfFuel);
	date.sendKeys(dateOfFueling);
	
	Select sel = new Select(vehicle);
	sel.selectByVisibleText(nameOfManufacture);
	
	odometer.sendKeys(odometerReading);
	partialFuelUp.sendKeys(partialFuelup);
	
	quantity.sendKeys(quantityOfFuel);
	pricePerUnit.sendKeys(currentPriceOfFuelPerUnit);
	
	Select sel1 = new Select(vendor);
	sel1.selectByVisibleText(nameOfVendor);
	
	invoiceNo.sendKeys(invoiceNumber);
	invoiceUpload.sendKeys(pathOfInvoice);
	
	remark.sendKeys(remarks);
//	saveChanges.click();
}
	

}
