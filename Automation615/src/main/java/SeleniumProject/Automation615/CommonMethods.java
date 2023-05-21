package SeleniumProject.Automation615;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CommonMethods 
{
	
	
	public static void Screenshot(WebDriver driver, String destination) throws IOException
	{
		TakesScreenshot tc = (TakesScreenshot)(driver); 
		
		//get screenshot method to take a screenshot
		File Srcfile = tc.getScreenshotAs(OutputType.FILE);
		
		File destfile = new File(destination);
		
		//copy file to destination
		
		FileUtils.copyFile(Srcfile, destfile);	
		
	}

	

}
