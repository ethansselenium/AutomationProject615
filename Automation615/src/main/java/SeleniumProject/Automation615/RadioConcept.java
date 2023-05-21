package SeleniumProject.Automation615;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioConcept {

	public static void main(String[] args)
	{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.amazon.in");
		
		driver.manage().window().maximize();
		
		
		WebElement Flag1 = driver.findElement(By.xpath("//a[@id='icp-nav-flyout']"));
		Flag1.click();
		
		
		WebElement HI = driver.findElement(By.xpath("//input[@name='lop' and @value='hi_IN']//following-sibling::i[@class='a-icon a-icon-radio']"));
		
		if(HI.isSelected())
		{
			System.out.println("HI RAIDO BUTTON IS SELECTED");			
			
		}
		else
		{
			
			System.out.println("HI RADIO BUTTON IS NOT SELECTED, I AM SELECTING NOW...PLEASE WAIT...");
			HI.click();
		}
		
		driver.close();
	}

}
