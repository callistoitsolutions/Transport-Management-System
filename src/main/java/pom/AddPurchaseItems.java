package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddPurchaseItems {
	
	@FindBy (xpath = "/html/body/div[1]/header/nav/div/div[2]/ul/li[8]/a") private WebElement vehicle;
	@FindBy (xpath = "/html/body/div[1]/header/nav/div/div[2]/ul/li[8]/ul/li/div/ul/li[3]/a") private WebElement purchaseItems ;
	@FindBy (xpath = "/html/body/div[1]/div/div/section[1]/h1/a[2]") private WebElement plus ;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[1]/div/input[2]") private WebElement partName;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[2]/div/input") private WebElement date;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[3]/div/select") private WebElement vehicleType;
	@FindBy (xpath = "//input[@placeholder='Invoice No.']") private WebElement invoiceNo;
	@FindBy (xpath = "//input[@placeholder='Size']") private WebElement size;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[6]/div/input") private WebElement quantity;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[7]/div/input") private WebElement price;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[8]/div/input") private WebElement gst;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[9]/div/input") private WebElement sgst;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[10]/div/input") private WebElement cgst;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[11]/div/input") private WebElement igst;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[12]/div/select") private WebElement vendor;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[13]/div/input") private WebElement totalAmount;
	@FindBy (xpath = "/html/body/div[2]/div/div/div[2]/form/div[14]/div/input") private WebElement paymentMode;
	@FindBy (xpath = "(//button[text()='Save changes'])[3]") private WebElement saveChanges;
	@FindBy (xpath = "(//button[text()='Close'])[3]") private WebElement close;
	
	public AddPurchaseItems(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void openPurchaseItemsForm (WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		vehicle.click();
		purchaseItems.click();
		plus.click();
	}

	public void addPurchaseItemsData(WebDriver driver, String nameOfPart, String dateOfPurchase, String typeOfVehicle, String invoiceNumber, String sizeOfItems, String quantityOfItems, String priceOfItems, String gstAmount, String sgstAmount, String cgstAmount, String igstAmount, String nameOfVendor, String totalAmountOfPurchase, String modeOfPayment)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		partName.sendKeys(nameOfPart);
		date.sendKeys(dateOfPurchase);
		
		Select sel1 = new Select(vehicleType);
		sel1.selectByVisibleText(typeOfVehicle);
		
		invoiceNo.sendKeys(invoiceNumber);
		size.sendKeys(sizeOfItems);
		
		quantity.sendKeys(quantityOfItems);
		price.sendKeys(priceOfItems);
		
		gst.sendKeys(gstAmount);
		sgst.sendKeys(sgstAmount);
		
		cgst.sendKeys(cgstAmount);
		igst.sendKeys(igstAmount);
		
		Select sel2 = new Select(vendor);
		sel2.selectByVisibleText(nameOfVendor);
		
		totalAmount.sendKeys(totalAmountOfPurchase);
		paymentMode.sendKeys(modeOfPayment);
		
//		saveChanges.click();
	}
}
