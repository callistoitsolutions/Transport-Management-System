package test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\WebDriver\\new Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://transxpress.nedient.in/index.php");
	
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("abc");	
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("abc123");
	    driver.findElement(By.xpath("//button[text()='Sign In']")).click(); 
	    
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/ul/li[8]/a")).click();
	    driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[2]/ul/li[8]/ul/li/div/ul/li[1]/a")).click();
	    driver.findElement(By.xpath("/html/body/div[1]/div/div/section[1]/h1/a[2]")).click();
	    
	    Set<String> addresses = driver.getWindowHandles();
	   
	    System.out.println(addresses);
	    
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div[1]/div/input[2]")).sendKeys("Atul");
	}

}
