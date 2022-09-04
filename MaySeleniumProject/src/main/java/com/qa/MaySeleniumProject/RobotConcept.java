package com.qa.MaySeleniumProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.sun.glass.events.KeyEvent;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotConcept extends CommonMethod{

	public static void main(String[] args) throws AWTException, InterruptedException, IOException 
	{
	
		
		//Initialize a WebDriver
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		String url = "https://opensource-demo.orangehrmlive.com/";
				
		driver.get(url);

		driver.manage().window().maximize();
		
		Robot r1 = new Robot(); 
		
		r1.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r1.keyPress(KeyEvent.VK_TAB);		
		r1.keyPress(KeyEvent.VK_CAPS_LOCK);
		r1.keyRelease(KeyEvent.VK_CAPS_LOCK);
		r1.keyPress(KeyEvent.VK_A);
		Thread.sleep(1000);
		r1.keyPress(KeyEvent.VK_CAPS_LOCK);
		r1.keyRelease(KeyEvent.VK_CAPS_LOCK);
		Thread.sleep(1000);
		r1.keyPress(KeyEvent.VK_D);
		r1.keyPress(KeyEvent.VK_M);
		r1.keyPress(KeyEvent.VK_I);
		r1.keyPress(KeyEvent.VK_N);
		
		r1.keyPress(KeyEvent.VK_TAB);
		r1.keyPress(KeyEvent.VK_A);
		r1.keyPress(KeyEvent.VK_D);
		r1.keyPress(KeyEvent.VK_M);
		r1.keyPress(KeyEvent.VK_I);
		r1.keyPress(KeyEvent.VK_N);
		r1.keyPress(KeyEvent.VK_1);
		r1.keyPress(KeyEvent.VK_2);
		r1.keyPress(KeyEvent.VK_3);
		r1.keyPress(KeyEvent.VK_TAB);
		r1.delay(1000);
		r1.keyPress(KeyEvent.VK_ENTER);
		
		Screenshot(driver,"../MaySeleniumProject/Screenshots/login.png");
		
		WebElement Profile = driver.findElement(By.xpath("/html/body/div[1]/div[1]/a[2]"));
		
		String actualname = Profile.getText();
		System.out.println("Actual Name is displayed as "+ "  "+ actualname);
		String expectedname = "Welcome Paul";
		
		Assert.assertEquals(actualname, expectedname);
		
		driver.close();
		
		
		
		

	}

}
