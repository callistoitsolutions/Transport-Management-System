package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddDriverExpenses {
	
	@FindBy (xpath = "/html/body/div[1]/header/nav/div/div[2]/ul/li[9]/a") private WebElement expenses;
	@FindBy (xpath = "/html/body/div[1]/header/nav/div/div[2]/ul/li[9]/ul/li/div/ul/li[2]/a") private WebElement driverExpenses;
	@FindBy (xpath = "/html/body/div[1]/div/div/section[1]/h1/a[2]") private WebElement plus;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[1]/div/input[2]") private WebElement expenseName;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[2]/div/input") private WebElement date;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[3]/div/select") private WebElement driverName;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[4]/div/input") private WebElement city;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[5]/div/input") private WebElement advance;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[6]/div/input") private WebElement price;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[7]/div/textarea") private WebElement remark;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[8]/div/input") private WebElement uploadInvoice;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[3]/button[1]") private WebElement saveChanges;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[3]/button[2]") private WebElement close;
	
	public AddDriverExpenses(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void openAddDriverExpensesForm(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		expenses.click();
		driverExpenses.click();
		plus.click();
	}
	public void addDriverExpensesDetails(WebDriver driver, String nameOfExpense, String expenseDate, String nameOfDriver, String expenseCity, String advanceAmount, String priceAmount, String remarks, String pathOfInvoice)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		expenseName.sendKeys(nameOfExpense);
		date.sendKeys(expenseDate);
		
		Select sel = new Select(driverName);
		sel.selectByVisibleText(nameOfDriver);
		
		city.sendKeys(expenseCity);
		advance.sendKeys(advanceAmount);
		
		price.sendKeys(priceAmount);
		remark.sendKeys(remarks);
		
		uploadInvoice.sendKeys(pathOfInvoice);
//		saveChanges.click();
	}
	

}
