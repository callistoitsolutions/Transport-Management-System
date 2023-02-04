package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddNewService {
	@FindBy (xpath = "/html/body/div[1]/header/nav/div/div[2]/ul/li[4]/a") private WebElement service;
	@FindBy (xpath = "/html/body/div[1]/div/div/section[1]/h1/a[2]") private WebElement plus;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[1]/div/input[2]") private WebElement completedServices;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[2]/div/select") private WebElement vehicle;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[3]/div/input") private WebElement servicedOn;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[4]/div/input") private WebElement odometer;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[5]/div/select") private WebElement vendor;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[6]/div/textarea") private WebElement remark;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[7]/div/input") private WebElement assignee;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[8]/div/input") private WebElement labour;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[9]/div/input") private WebElement parts;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[10]/div/input") private WebElement tax;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[11]/div/input") private WebElement total;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[12]/div/input") private WebElement invoiceNo;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[13]/div/input") private WebElement uploadInvoice;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[3]/button[1]") private WebElement saveChanges;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[3]/button[2]") private WebElement close;
	
	public AddNewService(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void openAddNewServiceForm(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		service.click();
		plus.click();
	}
	public void addNewServiceData(WebDriver driver, String nameOfService, String nameOfVehicle, String dateOfService, String odometerReading, String nameOfVendor, String remarks, String nameOfAssignee, String labourAmount, String numberOfParts, String taxAmount, String totalAmount, String invoiceNumber, String pathOfPhoto)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		completedServices.sendKeys(nameOfService);
		Select sel = new Select(vehicle);
		sel.selectByVisibleText(nameOfVehicle);
		
		servicedOn.sendKeys(dateOfService);
		odometer.sendKeys(odometerReading);
		
		Select sel1 = new Select(vendor);
		sel1.selectByVisibleText(nameOfVendor);
		
		remark.sendKeys(remarks);
	    assignee.sendKeys(nameOfAssignee);
	    
	    labour.sendKeys(labourAmount);
	    parts.sendKeys(numberOfParts);
	    
	    tax.sendKeys(taxAmount);
	    total.sendKeys(totalAmount);
	    
	    invoiceNo.sendKeys(invoiceNumber);
	    uploadInvoice.sendKeys(pathOfPhoto);
	    
//	    saveChanges.click();
	}

}
