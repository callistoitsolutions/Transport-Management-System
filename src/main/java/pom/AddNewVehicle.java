package pom;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddNewVehicle {
	
	@FindBy (xpath = "/html/body/div[1]/header/nav/div/div[2]/ul/li[8]/a") private WebElement vehicle ;
	@FindBy (xpath = "/html/body/div[1]/header/nav/div/div[2]/ul/li[8]/ul/li/div/ul/li[1]/a") private WebElement addNewVehicle;
	@FindBy (xpath = "/html/body/div[1]/div/div/section[1]/h1/a[2]") private WebElement plusSign ;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[1]/div/input[2]") private WebElement vehicleName;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[2]/div/select") private WebElement vehicleType;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[3]/div/input") private WebElement makeModel;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[4]/div/input") private WebElement yearOfManufacture ;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[5]/div/input") private WebElement colour;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[6]/div/select") private WebElement vehicleGroup;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[7]/div/input") private WebElement registrationNo ;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[8]/div/input") private WebElement photoRC;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[9]/div/input") private WebElement engineNo;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[10]/div/input") private WebElement chassisNo;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[11]/div/select") private WebElement fuelType;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[12]/div/input") private WebElement bodyType;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[13]/div/input") private WebElement fuelMeasurementIn ;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[14]/div/input") private WebElement trackUsageAs ;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[3]/button[1]") private WebElement saveChanges ;
	@FindBy (xpath ="/html/body/div[2]/div/div/div[3]/button[2]") private WebElement close ; 
	
	public AddNewVehicle (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void openAddNewVehicleForm(WebDriver driver) throws InterruptedException 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		vehicle.click();
	
		addNewVehicle.click();
		
		plusSign.click();
		
		
	}
	
	public void addNewVehicleDetails (WebDriver driver, String vehiclename, String typeOfVehicle, String makemodel, String yearofmanufacture, String nameOfColour, String vehiclegroup, String registrationno, String pathOfPhoto, String engineno, String chassisno, String typeOfFuel, String typeOfBody, String fuelmeasurement, String usages)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(vehicleName));
		
		vehicleName.sendKeys(vehiclename);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Select sel1 = new Select(vehicleType);
		sel1.selectByVisibleText(typeOfVehicle);
		
		makeModel.sendKeys(makemodel);
        yearOfManufacture.sendKeys(yearofmanufacture);
        colour.sendKeys(nameOfColour);
        
        Select sel2 = new Select(vehicleGroup);
        sel2.selectByVisibleText(vehiclegroup);
        
        registrationNo.sendKeys(registrationno);
        
        photoRC.sendKeys(pathOfPhoto);
        engineNo.sendKeys(engineno);
        chassisNo.sendKeys(chassisno);
        
        Select sel3 = new Select(fuelType);
        sel3.selectByVisibleText(typeOfFuel);
        
        bodyType.sendKeys(typeOfBody);
        fuelMeasurementIn.sendKeys(fuelmeasurement);
        trackUsageAs.sendKeys(usages);
 //     saveChanges.click();
        
        
    }
		
		
		
	
	}
	
	


