package SeleniumProject.Automation615;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleConcept 
{

	public static void main(String[] args) 
	{
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/popup.php");
		
		driver.manage().window().maximize();
		
		WebElement BUTTON = driver.findElement(By.xpath("//a[text()='Click Here']"));
		
		BUTTON.click();
		String parentwindow = driver.getWindowHandle(); //returns on id of the present tab
		System.out.println("Parent id is "+ parentwindow);
		
		Set<String> s1 = driver.getWindowHandles(); //returns multiple or more then one id of the present tabs 
		//System.out.println("child window id is "+ s1);
		Iterator i1 = s1.iterator();
		
		while(i1.hasNext())
		{
			
			String childwindwow = (String) i1.next();
			System.out.println("childwindwows ids are : " +childwindwow);
			if(!parentwindow.equals(childwindwow))
			{
				
				driver.switchTo().window(childwindwow);
				
				WebElement email = driver.findElement(By.name("emailid"));
				email.sendKeys("ethansselenium@gmail.com");
				WebElement submitb =driver.findElement(By.name("btnLogin"));
				submitb.click();
				
				driver.close();
				
			}
			
			
			driver.switchTo().window(parentwindow);
			driver.close();
			
			
		}
		
		
		
	}

}
