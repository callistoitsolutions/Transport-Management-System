package utitlity;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShots {
	
	public static String dateAndTime() {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy_MMM_dd HH_mm_ss");
		LocalDateTime date = LocalDateTime.now();
		String currentDate = date.format(format);
		return currentDate;
	}
	
	public static void screenshot(WebDriver driver, String nameOfFile) throws IOException
	{
		String date = ScreenShots.dateAndTime();
		TakesScreenshot tss =(TakesScreenshot)driver ;
		File source = tss.getScreenshotAs(OutputType.FILE);
		
		File destination = new File ("E:\\Callisto Internship\\TransportManagementSystem\\Screenshot\\" + nameOfFile + " " + date + ".png");
		
		FileHandler.copy(source, destination);
	}

}
