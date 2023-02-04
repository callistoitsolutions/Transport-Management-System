package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddFitnessDetails {
	
	@FindBy (xpath = "/html/body/div[1]/header/nav/div/div[2]/ul/li[8]/a") private WebElement vehicle;
	@FindBy (xpath = "/html/body/div[1]/header/nav/div/div[2]/ul/li[8]/ul/li/div/ul/li[2]/a") private WebElement fitness ;
	@FindBy (xpath = "/html/body/div[1]/div/div/section[1]/h1/a[2]") private WebElement plus ;
	@FindBy (xpath = "//input[@placeholder='Vehicle Regis.No']") private WebElement vehicleRegNo ;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[2]/div/select") private WebElement vehicleType;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[3]/div/select") private WebElement category;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[4]/div/input") private WebElement engineNo ;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[5]/div/input") private WebElement model ;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[6]/div/input") private WebElement chassisNo ;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[7]/div/input") private WebElement yearOfManufacture ;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[8]/div/input") private WebElement fuelType ;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[9]/div/input") private WebElement colour;
    @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[10]/div/input") private WebElement reminderDate;
    @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[11]/div/input") private WebElement certificateValidTill ;
    @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[12]/div/textarea") private WebElement remark;
    @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[13]/div/input") private WebElement uploadCertificate ;
    @FindBy (xpath = "/html/body/div[2]/div/div/div[3]/button[1]") private WebElement saveChanges ;
    @FindBy (xpath = "/html/body/div[2]/div/div/div[3]/button[2]") private WebElement close;
    
    
    public AddFitnessDetails(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
    
    public void openFitnessForm(WebDriver driver)
    {
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	vehicle.click();
     	fitness.click();
     	plus.click();
    }
    public void addFitnessData(WebDriver driver, String vehicleregno, String typeOfVehicle, String categoryOfVehicle, String engineno, String makeModel, String chassisno, String yearofmanufacture, String fueltype, String colourOfVehicle, String reminderdate, String certificateValidity, String remarks, String pathOfCertificate)
    {
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	
    	vehicleRegNo.sendKeys(vehicleregno);
    	
    	Select sel1 = new Select(vehicleType);
    	sel1.selectByVisibleText(typeOfVehicle);
    	
    	Select sel2 = new Select(category);
    	sel2.selectByVisibleText(categoryOfVehicle);
    	
    	engineNo.sendKeys(engineno);
    	model.sendKeys(makeModel);
    	
    	chassisNo.sendKeys(chassisno);
    	yearOfManufacture.sendKeys(yearofmanufacture);
    	
    	fuelType.sendKeys(fueltype);
    	colour.sendKeys(colourOfVehicle);
    	
    	reminderDate.sendKeys(reminderdate);
    	certificateValidTill.sendKeys(certificateValidity);
    	
    	remark.sendKeys(remarks);
    	uploadCertificate.sendKeys(pathOfCertificate);
    	
//    	saveChanges.click();
    	
    }
    
    
    
}
