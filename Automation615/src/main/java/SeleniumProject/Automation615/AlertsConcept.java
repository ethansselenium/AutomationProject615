package SeleniumProject.Automation615;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsConcept {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.manage().window().maximize();
		
		WebElement custid= driver.findElement(By.xpath("//input[@name='cusid']"));
		
		custid.sendKeys("11132233");

		
		WebElement submit= driver.findElement(By.xpath("//input[@name='submit']"));
		
		submit.click();
		
		
		Alert al = driver.switchTo().alert();
		
		Thread.sleep(10); //wait
		
		
		String Mainalert= al.getText();	// fetching the text from alert
		
		System.out.println("Main Alert message is : " + Mainalert);
		

		
		al.accept(); //yes or ok
		//al.dismiss(); //cancel or No
		
		Thread.sleep(10); //wait
		
		Alert al2 = driver.switchTo().alert();
	
		String Secondalert= al2.getText();	// fetching the text from alert	
		System.out.println("Second Alert message is : " + Secondalert);
		al2.accept();
		
		driver.close();
	}

}
