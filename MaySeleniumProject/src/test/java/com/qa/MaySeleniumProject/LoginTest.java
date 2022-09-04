package com.qa.MaySeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest extends Login 
{
	
	
	WebDriver driver;
	
	@BeforeMethod
	public void launchURL()
	{
		System.out.println("launchURL");
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		LaunchBrowser(driver);
		
	}
	
	@Test(priority=0)
	public void Search() throws InterruptedException 
	{
		
		System.out.println("I am searching a books");
		GlobalSearch(driver);
		
	}
	
	
	@Test(priority=1)
	public void CarByke() throws InterruptedException
	{
		System.out.println("I am searching for car & Motor byke");
		CarMotorbyke(driver);
	}
	
	@AfterMethod
	public void logout()
	{
		
		System.out.println("logout from the application");
		CloseBrowser(driver);
	}

	
	
	
	
	
}
