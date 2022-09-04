package com.qa.MaySeleniumProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login 
{
	static WebDriver driver;
	
	public static void LaunchBrowser(WebDriver driver)
	{
		
		
		driver.get("http://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	public static void GlobalSearch(WebDriver driver) throws InterruptedException 
	{
		

		WebElement Textbox= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		Textbox.sendKeys("Books");
		
		Thread.sleep(1000);
		WebElement SearchIcon = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		
		SearchIcon.click();
		
		WebElement Firstbook = driver.findElement(By.xpath("//div[@cel_widget_id='MAIN-SEARCH_RESULTS-2']//parent::div//parent::div[@data-index='2']"));
		
		String booktxt = Firstbook.getText();
		
		System.out.println("Text of the book is " + booktxt);
	}
	
	public static void CarMotorbyke(WebDriver driver) throws InterruptedException
	{
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
		
		WebElement Textbox= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		Textbox.sendKeys("Tyres");
		
		Thread.sleep(1000);
		WebElement SearchIcon = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		
		SearchIcon.click();
		
	}

	
	public static void CloseBrowser(WebDriver driver)
	{
		driver.close();
		
	}
	
		//independent of any browser version
		//independent for any browser 

		//implicit wait - Hard wait - it is also applicable to only one element
		
		
		
		//Exlplicit wait -- it will wait for the element to be loaded
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(" ")));
		

	

}
