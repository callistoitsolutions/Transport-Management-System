package test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckingBrokenLinks {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\WebDriver\\new Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://transxpress.nedient.in/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/input")).sendKeys("abc");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/input")).sendKeys("abc123");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[4]/div[2]/button")).click();
		
		List<WebElement> anchor = driver.findElements(By.tagName("a"));
		int size = anchor.size();
	    System.out.println(size);
	    
	    for(int i = 0 ; i < size ; i++)
	    {
	    	WebElement link = anchor.get(i);
	    	String url = link.getAttribute("href");
	        System.out.println(url);
	        
	        if(url == null || url.isEmpty())
	        {
	        	System.out.println(url + " is empty");
                continue;	        
	        }
	        
	        try {
				HttpURLConnection huc = (HttpURLConnection)(new URL(url).openConnection());
				huc.setRequestMethod("HEAD");
				huc.connect();
				int response = huc.getResponseCode();
                
				if(response > 200)
				{
					System.out.println("It is a broken link");
				}
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	    
	    }
	    
	    
	
	}

}
