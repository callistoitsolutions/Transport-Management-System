package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MicrosoftEdgeBrowser {
	
	public static WebDriver microsoftEdge()
	{
		System.setProperty("webdriver.edge.driver", "E:\\WebDriver\\Microsoft Edge\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://transxpress.nedient.in/index.php");
		driver.manage().window().maximize();
		return driver ;
	}

}
