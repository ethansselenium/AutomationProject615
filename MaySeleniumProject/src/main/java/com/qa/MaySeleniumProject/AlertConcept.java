package com.qa.MaySeleniumProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertConcept {

	public static void main(String[] args) 
	{
		//test
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String url = "https://demo.guru99.com/test/delete_customer.php";
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement Custid = driver.findElement(By.name("cusid"));
		Custid.sendKeys("323414");
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
		//Alert Class
		Alert al = driver.switchTo().alert();
		String alertmessage = al.getText();
		System.out.println("Asking for delete message is "+ " "+ alertmessage);
		al.accept();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String alertmessageafterdelete =al.getText();
		System.out.println("After deleting customer Id message is "+ " "+alertmessageafterdelete);
		al.accept();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.close();

	}

}
