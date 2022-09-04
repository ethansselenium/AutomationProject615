package com.qa.MaySeleniumProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		//Classname obj = new classname();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		Actions act1 = new Actions(driver);
		
		WebElement From = driver.findElement(By.id("src"));
		
		From.sendKeys("Pune");
		
		Thread.sleep(3000);
		
		/*WebElement ul = driver.findElement(By.className("autoFill homeSearch"));
		act1.moveToElement(ul).build().perform();*/
		
		WebElement source= driver.findElement(By.xpath("//li[@data-id='66920'] [@select-id='results[0].BpList[1]']"));
		act1.moveToElement(source).click().build().perform();
		
		
		WebElement to = driver.findElement(By.id("dest"));
		
		to.sendKeys("Mumbai");
		
        Thread.sleep(3000);
		
        WebElement ul1 = driver.findElement(By.xpath("//li[@data-no='4']"));
		
		act1.moveToElement(ul1).click().build().perform();
		
		WebElement Calendar = driver.findElement(By.id("onward_cal"));
		Calendar.click();
		
		WebElement NxtBtn = driver.findElement(By.xpath("//td[@class='next']"));
		NxtBtn.click();
		
		Thread.sleep(3000);
		WebElement Month = driver.findElement(By.className("monthTitle"));
		
		String actualmonth = Month.getText();
		System.out.println("Actual Month " + actualmonth);
		//String expectedmonth = "Aug 2021";
		
		SoftAssert sa = new SoftAssert();
		//sa.assertEquals("Aug 2021", actualmonth,"Incorrect");
		sa.assertAll();
		
		//Assert.assertEquals(expectedmonth, actualmonth); 
		String selectdate = "6";
		//String selectmonth = "Aug 2022";
		
		WebElement Date = driver.findElement(By.xpath("//td[text()='" +selectdate+"']"));
		
		Date.click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		WebElement SearchBuses =driver.findElement(By.xpath("//button[@id ='search_btn' and @class='fl button']"));
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		SearchBuses.click();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.close();
		
	}

}
