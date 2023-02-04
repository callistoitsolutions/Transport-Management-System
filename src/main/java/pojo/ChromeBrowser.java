package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeBrowser {
	
	public static WebDriver launchBrowser ()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\WebDriver\\new Driver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("-disable--notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://transxpress.nedient.in/index.php");
		driver.manage().window().maximize();
		return driver ;
	
	}

}
