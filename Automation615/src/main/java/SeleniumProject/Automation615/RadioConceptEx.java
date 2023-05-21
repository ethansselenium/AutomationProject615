package SeleniumProject.Automation615;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioConceptEx 
{

	public static void main(String[] args) 
	{
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.spicejet.com/";
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		
		Assert.assertFalse(driver.findElement(By.xpath("//div[text()='Senior Citizen']//parent::div[@class='css-1dbjc4n']//parent::div")).isSelected());
		System.out.println("Status of the element is :" +  driver.findElement(By.xpath("//div[text()='Senior Citizen']//parent::div[@class='css-1dbjc4n']//parent::div")).isSelected());
			
	}

}
