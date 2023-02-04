package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEMIExpenses {
	
	@FindBy (xpath = "/html/body/div[1]/header/nav/div/div[2]/ul/li[9]/a") private WebElement expenses;
	@FindBy (xpath = "/html/body/div[1]/header/nav/div/div[2]/ul/li[9]/ul/li/div/ul/li[6]/a") private WebElement emiExpenses;
	@FindBy (xpath = "/html/body/div[1]/div/div/section[1]/h1/a[2]") private WebElement plus;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[1]/div/input[2]") private WebElement vehicleNumber;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[2]/div/input") private WebElement vehicleType;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[3]/div/input") private WebElement model;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[4]/div/input") private WebElement year;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[5]/div/input") private WebElement ownerName;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[6]/div/input") private WebElement financeName;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[7]/div/input") private WebElement emiNumber;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[8]/div/input") private WebElement emiStartDate;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[9]/div/input") private WebElement emiEndDate;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[10]/div/input") private WebElement emiAmount;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[11]/div/textarea") private WebElement remark;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[3]/button[1]") private WebElement saveChanges;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[3]/button[2]") private WebElement close;
	
	public AddEMIExpenses(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void openAddEMIExpensesForm(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		expenses.click();
		emiExpenses.click();
		plus.click();
	}
	public void addEMIExpensesData(WebDriver driver, String numberOfVehicle, String typeOfVehicle, String modelOfVehicle, String yearOfManufacture, String nameOfOwner, String nameOfFinance, String numberOfEMI, String startDateOfEMI, String endDateOfEMI, String amountOfEMI, String remarks)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		vehicleNumber.sendKeys(numberOfVehicle);
		vehicleType.sendKeys(typeOfVehicle);
		
		model.sendKeys(modelOfVehicle);
		year.sendKeys(yearOfManufacture);
		
		ownerName.sendKeys(nameOfOwner);
		financeName.sendKeys(nameOfFinance);
		
		emiNumber.sendKeys(numberOfEMI);
		emiStartDate.sendKeys(startDateOfEMI);
		
		emiEndDate.sendKeys(endDateOfEMI);
		emiAmount.sendKeys(amountOfEMI);
		
		remark.sendKeys(remarks);
//		saveChanges.click();
	}

}
