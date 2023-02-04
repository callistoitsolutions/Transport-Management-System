package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddNewIssue {
	
	@FindBy (xpath = "/html/body/div[1]/header/nav/div/div[2]/ul/li[3]/a") private WebElement issue;
	@FindBy (xpath = "/html/body/div[1]/div/div/section[1]/h1/a[2]") private WebElement plus;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[1]/div/input[2]") private WebElement issueTitle;
    @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[2]/div/select") private WebElement vehicle;
    @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[3]/div/input") private WebElement description;
    @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[4]/div/input") private WebElement priority;
    @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[5]/div/input") private WebElement dueDate;
    @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[6]/div/input") private WebElement assignee;
    @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[7]/div/input") private WebElement photo;
    @FindBy (xpath = "/html/body/div[2]/div/div/div[3]/button[1]") private WebElement saveChanges;
    @FindBy (xpath = "/html/body/div[2]/div/div/div[3]/button[2]") private WebElement close;
    
    public AddNewIssue (WebDriver driver)
    {
    	PageFactory.initElements(driver , this);
    }
    
    public void openAddNewIssueForm(WebDriver driver)
    {
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	issue.click();
    	plus.click();
    }
    
    public void addNewIssueDetails(WebDriver driver, String titleOfIssue, String typeOfVehicle, String descriptionOfIssue, String priorityOfIssue, String dueDateOfIssue, String nameOfAssignee, String pathOfPhoto)
    {
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	issueTitle.sendKeys(titleOfIssue);
    	
    	Select sel = new Select(vehicle);
    	sel.selectByVisibleText(typeOfVehicle);
    	
    	description.sendKeys(descriptionOfIssue);
    	priority.sendKeys(priorityOfIssue);
    	
    	dueDate.sendKeys(dueDateOfIssue);
    	assignee.sendKeys(nameOfAssignee);
    	
    	photo.sendKeys(pathOfPhoto);
//      saveChanges.click();    	
    }
}
