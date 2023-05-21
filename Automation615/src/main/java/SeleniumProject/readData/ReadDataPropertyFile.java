package SeleniumProject.readData;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadDataPropertyFile {

	
	//SOFT CODE 
	public static void main(String[] args) 
	{
		
		File file = new File("../Automation615/src/main/java/SeleniumProject/readData/Datafile.properties");
		
		FileInputStream fis = null;
		
		try
		{
			
			fis = new FileInputStream(file);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		Properties prop = new Properties();
		
		
		try
		{
			
			prop.load(fis);
		}
		
		catch(Exception e)
		{
			
			e.printStackTrace();
		}
		
		
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(prop.getProperty("url"));
		
		
		WebElement globaltext = driver.findElement(By.id("twotabsearchtextbox"));
		
		globaltext.sendKeys(prop.getProperty("globaltext"));
		
		
		System.out.println("url" +prop.getProperty("url"));
	}
	

}
