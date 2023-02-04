package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddStaffExpenses {
	
	@FindBy (xpath = "/html/body/div[1]/header/nav/div/div[2]/ul/li[9]/a") private WebElement expenses;
	@FindBy (xpath = "/html/body/div[1]/header/nav/div/div[2]/ul/li[9]/ul/li/div/ul/li[4]/a") private WebElement staffExpenses;
	@FindBy (xpath = "/html/body/div[1]/div/div/section[1]/h1/a[2]") private WebElement plus;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[1]/div/input[2]") private WebElement expenseName;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[2]/div/input") private WebElement date;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[3]/div/input") private WebElement price;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[4]/div/input") private WebElement advance;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[5]/div/textarea") private WebElement remark;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[6]/div/input") private WebElement uploadInvoice;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[3]/button[1]") private WebElement saveChanges;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[3]/button[2]") private WebElement close;
	
public AddStaffExpenses(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void openAddStaffExpensesForm(WebDriver driver)
{
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	expenses.click();
	staffExpenses.click();
	plus.click();
}
public void addStaffExpenses(WebDriver driver, String nameOfExpense, String dateOfExpense, String priceOfExpense, String advanceAmount, String remarks, String pathOfInvoice)
{
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	expenseName.sendKeys(nameOfExpense);
	date.sendKeys(dateOfExpense);
	
	price.sendKeys(priceOfExpense);
	advance.sendKeys(advanceAmount);
	
	remark.sendKeys(remarks);
	uploadInvoice.sendKeys(pathOfInvoice);
	
//	saveChanges.click();
}

}
