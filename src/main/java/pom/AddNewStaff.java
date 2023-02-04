package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewStaff {

	@FindBy (xpath = "/html/body/div[1]/header/nav/div/div[2]/ul/li[7]/a") private WebElement staff;
	@FindBy (xpath = "/html/body/div[1]/div/div/section[1]/h1/a[2]") private WebElement plus;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[1]/div/input[2]") private WebElement name;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[2]/div/input") private WebElement phoneNo;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[3]/div/input") private WebElement emergencyPhone;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[4]/div/input") private WebElement age;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[5]/div/input") private WebElement typeOfEmployment;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[6]/div/input") private WebElement typeOfSalary;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[7]/div/input") private WebElement address;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[8]/div/input") private WebElement city;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[9]/div/input") private WebElement aadharCardNo;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[10]/div/input") private WebElement licenceNo;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[11]/div/input") private WebElement panNo;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[12]/div/input") private WebElement licenceValidTill;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[13]/div/input") private WebElement bankAccNo;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[14]/div/textarea") private WebElement bankDetails;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[15]/div/input") private WebElement salaryAmount;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[16]/div/input") private WebElement dailyWages;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[17]/div/textarea") private WebElement remark;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[18]/div/input") private WebElement imageUpload;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[3]/button[1]") private WebElement saveChanges;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[3]/button[2]") private WebElement close;
	
	public AddNewStaff(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void openAddNewStaffForm(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		staff.click();
		plus.click();
	}
	public void addNewStaffDetails(WebDriver driver, String nameOfStaff, String numberOfStaff, String emergencyNumberOfStaff, String ageOfStaff, String employmentType, String salaryType, String addressOfStaff, String cityOfStaff, String aadharNoOfStaff, String licenceNoOfStaff, String PANnumber, String licenceValidityOfStaff, String BankAccountNumber, String detailsOfBank, String salaryOfStaff, String dailyWagesGiven, String remarks, String pathOfImage)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		name.sendKeys(nameOfStaff);
		phoneNo.sendKeys(numberOfStaff);
		
		emergencyPhone.sendKeys(emergencyNumberOfStaff);
		age.sendKeys(ageOfStaff);
		
		typeOfEmployment.sendKeys(employmentType);
		typeOfSalary.sendKeys(salaryType);
		
		address.sendKeys(addressOfStaff);
		city.sendKeys(cityOfStaff);
		
		aadharCardNo.sendKeys(aadharNoOfStaff);
		licenceNo.sendKeys(licenceNoOfStaff);
		
		panNo.sendKeys(PANnumber);
		licenceValidTill.sendKeys(licenceValidityOfStaff);
		
		bankAccNo.sendKeys(BankAccountNumber);
		bankDetails.sendKeys(detailsOfBank);
		
		salaryAmount.sendKeys(salaryOfStaff);
		dailyWages.sendKeys(dailyWagesGiven);
		
		remark.sendKeys(remarks);
		imageUpload.sendKeys(pathOfImage);
		
//		saveChanges.click();
		
		
	}
}
