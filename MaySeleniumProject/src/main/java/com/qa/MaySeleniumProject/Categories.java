package com.qa.MaySeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Categories
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		
		//Classname obj = new classname();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement Acclist = driver.findElement(By.id("nav-link-accountList"));
		
		//driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		
		act.moveToElement(Acclist).build().perform();
		
		WebElement YourAccount = driver.findElement(By.xpath("//span[text()='Your Account']"));
		
		YourAccount.click();
		
		//span[text()='Your Account']
		
		//span[contains(text(),'Your Account')]
				
		Thread.sleep(20);
	
		Select sk = new Select(driver.findElement(By.id("searchDropdownBox")));
		
		//sk.selectByVisibleText("Car & Motorbike");
		
		//sk.selectByIndex(10);

		sk.selectByValue("search-alias=automotive");
		
	}

}
