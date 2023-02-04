package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddVehicleExpenses {
	
	@FindBy (xpath = "/html/body/div[1]/header/nav/div/div[2]/ul/li[9]/a") private WebElement expenses;
	@FindBy (xpath = "/html/body/div[1]/header/nav/div/div[2]/ul/li[9]/ul/li/div/ul/li[1]/a") private WebElement vehicleExpenses;
	@FindBy (xpath = "/html/body/div[1]/div/div/section[1]/h1/a[2]") private WebElement plus;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[1]/div/input[2]") private WebElement expenseName;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[2]/div/input") private WebElement date;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[3]/div/select") private WebElement vehicle;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[4]/div/select") private WebElement driverName;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[5]/div/select") private WebElement vendor;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[6]/div/input") private WebElement expenseType;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[7]/div/input") private WebElement cleaner;
    @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[8]/div/input") private WebElement price;
    @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[9]/div/input") private WebElement city;
    @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[10]/div/textarea") private WebElement remark;
    @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[11]/div/input") private WebElement uploadInvoice;
    @FindBy (xpath = "/html/body/div[2]/div/div/div[3]/button[1]") private WebElement saveChanges;
    @FindBy (xpath = "/html/body/div[2]/div/div/div[3]/button[2]") private WebElement close;
    
    public AddVehicleExpenses(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void openAddVehicleExpensesForm(WebDriver driver)
    {
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	
    	expenses.click();
    	vehicleExpenses.click();
    	plus.click();
    }
    public void addVehicleExpensesDatails(WebDriver driver, String nameOfExpense, String dateOnInvoice, String nameOfVehicle, String nameOfDriver, String nameOfVendor, String typeOfExpense, String nameOfCleaner, String priceOfExpense, String expenseCity, String remarks, String pathOfInvoice)
    {
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	
    	expenseName.sendKeys(nameOfExpense);
    	date.sendKeys(dateOnInvoice);
    	
    	Select sel = new Select(vehicle);
    	sel.selectByVisibleText(nameOfVehicle);
    	
    	Select sel1 = new Select(driverName);
    	sel1.selectByVisibleText(nameOfDriver);
    	
    	Select sel2 = new Select(vendor);
    	sel2.selectByVisibleText(nameOfVendor);
    	
    	expenseType.sendKeys(typeOfExpense);
    	cleaner.sendKeys(nameOfCleaner);
    	
    	price.sendKeys(priceOfExpense);
    	city.sendKeys(expenseCity);
    	
    	remark.sendKeys(remarks);
    	uploadInvoice.sendKeys(pathOfInvoice);
    	
 //   	saveChanges.click();
    }
}
