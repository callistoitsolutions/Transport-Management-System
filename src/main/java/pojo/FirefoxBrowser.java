package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {
	
	public static WebDriver openFirefox() {
		
		System.setProperty("webdriver.gecko.driver", "E:\\WebDriver\\GeckoDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://transxpress.nedient.in/index.php");
		driver.manage().window().maximize();
		return driver;
	}

}
