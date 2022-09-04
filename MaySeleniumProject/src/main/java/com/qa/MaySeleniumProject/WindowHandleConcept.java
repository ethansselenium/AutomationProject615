package com.qa.MaySeleniumProject;

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
		String url = "https://demoqa.com/browser-windows";
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement newwindow= driver.findElement(By.id("windowButton"));
		newwindow.click();
		
		WebElement windowmessage = driver.findElement(By.id("messageWindowButton"));
		windowmessage.click();
		
		//it will return only one id 
		String MainWindow = driver.getWindowHandle();
		System.out.println("Main window id is " + "  "+ MainWindow);
		
		
		// it will return more the one id or open windows id 
		Set<String> ChildWindows =driver.getWindowHandles();
		System.out.println("Child Window id is " +"  "+ ChildWindows);
		
		
		Iterator <String > i = ChildWindows.iterator();
		
		while(i.hasNext())
		{
			
			String childwindow = i.next();
			
			if(!MainWindow.equalsIgnoreCase(childwindow))
			{
				
				driver.switchTo().window(childwindow);
				driver.close();
				System.out.println("I have closed all the child windows");
				
			}
			
		}
		//switching to parent window
		driver.switchTo().window(MainWindow);
		
		driver.close();
		
		
	}

}
