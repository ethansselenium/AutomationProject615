package SeleniumProject.Automation615;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownConcept {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		
		driver.manage().window().maximize();
		
		Thread.sleep(10);
		
		Select s1 = new Select (driver.findElement(By.xpath("//select[@id='searchDropdownBox' and @title='Search in']")));
		
		 s1.selectByIndex(10);
		//s1.selectByValue(value);
		//s1.selectByVisibleText(text);
		
		
		WebElement Globalsearch = driver.findElement(By.id("twotabsearchtextbox"));
		
		Globalsearch.sendKeys("Ravinder Singh");
		
		WebElement magnifyyingglass = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		magnifyyingglass.click();
			
		
		/*WebElement Results = driver.findElement(By.xpath("//div[@class='s-main-slot s-result-list s-search-results sg-row']"));
		System.out.println("=========================Results===============================");
		System.out.println(Results.getText());*/
			
		List<WebElement> Results1 = driver.findElements(By.xpath("//div[@class='s-main-slot s-result-list s-search-results sg-row']"));
		System.out.println("=========================Results===============================");
		
		for(WebElement i : Results1)
		{
			System.out.println(i.getSize());
			System.out.println("=========================Results===============================");
			System.out.println(i.getText());
			
		}
		
		
		

		driver.close();
	}

}
