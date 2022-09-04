package com.qa.MaySeleniumProject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CommonMethod {

	
	
	public static void  Screenshot(WebDriver driver, String dest ) throws IOException
	{

		
		TakesScreenshot tc1 = ((TakesScreenshot) driver);
		
		File source = tc1.getScreenshotAs(OutputType.FILE);
		
		File destination = new File(dest);
		
		FileUtils.copyFile(source, destination);
		
	}

}
