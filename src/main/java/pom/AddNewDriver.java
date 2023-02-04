package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewDriver {
	
	@FindBy (xpath = "/html/body/div/header/nav/div/div[2]/ul/li[2]/a") private WebElement driverModule;
	@FindBy (xpath = "/html/body/div[1]/div/div/section[1]/h1/a[2]") private WebElement plus;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[1]/div/input[2]") private WebElement driverName;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[2]/div/textarea") private WebElement address;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[3]/div/input") private WebElement city;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[4]/div/input") private WebElement phone;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[5]/div/input") private WebElement aadharNo;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[6]/div/input") private WebElement licenceNo;
    @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[7]/div/input") private WebElement photo;
    @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[8]/div/textarea") private WebElement remarks;
    @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[9]/div/input") private WebElement panNo;
    @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[10]/div/input") private WebElement bankAccountNo ;
    @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[11]/div/textarea") private WebElement bankDetails;
    @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[12]/div/input") private WebElement emergencyPhone;
    @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[13]/div/input") private WebElement ageYears;
    @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[14]/div/input") private WebElement typeOfEmployment;
    @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[15]/div/input") private WebElement typeOfSalary;
    @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[16]/div/input") private WebElement salaryAmount;
    @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[17]/div/input") private WebElement wagesPerDay;
    @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[18]/div/input") private WebElement licenceValidTill;
    @FindBy (xpath = "/html/body/div[2]/div/div/div[3]/button[1]") private WebElement saveChanges;
    @FindBy (xpath = "/html/body/div[2]/div/div/div[3]/button[2]") private WebElement close;
    
    
    public AddNewDriver(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
    
    public void openAddNewDriverForm(WebDriver driver) {
    	
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	driverModule.click();
    	plus.click();
    }
    
    public void addNewDriverDetails(WebDriver driver, String nameOfDriver, String addressOfDriver, String cityOfDriver, String phoneOfDriver, String aadharNoOfDriver, String licenceNoOfDriver, String pathOfPhoto, String remark, String PANnumber, String bankAccountNoOfDriver, String bankDetailsOfDriver, String emergencyNoOfDriver, String currentAgeOfDriver, String typeOfEmploymentOfDriver, String typeOfSalaryOfDriver, String salaryAmountOfDriver, String wagesPerDayGivenToDriver, String licenceValidity) {
    	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	
    	driverName.sendKeys(nameOfDriver);
    	address.sendKeys(addressOfDriver);
    	
    	city.sendKeys(cityOfDriver);
    	phone.sendKeys(phoneOfDriver);
    	
    	aadharNo.sendKeys(aadharNoOfDriver);
    	licenceNo.sendKeys(licenceNoOfDriver);
    	
    	photo.sendKeys(pathOfPhoto);
    	remarks.sendKeys(remark);
    	
    	panNo.sendKeys(PANnumber);
    	bankAccountNo.sendKeys(bankAccountNoOfDriver);
    	
    	bankDetails.sendKeys(bankDetailsOfDriver);
    	emergencyPhone.sendKeys(emergencyNoOfDriver);
    	
    	ageYears.sendKeys(currentAgeOfDriver);
    	typeOfEmployment.sendKeys(typeOfEmploymentOfDriver);
    	
    	typeOfSalary.sendKeys(typeOfSalaryOfDriver);
    	salaryAmount.sendKeys(salaryAmountOfDriver);
    	
    	wagesPerDay.sendKeys(wagesPerDayGivenToDriver);
    	licenceValidTill.sendKeys(licenceValidity);
    	
//    	saveChanges.click();	
    	
    }
    
}
