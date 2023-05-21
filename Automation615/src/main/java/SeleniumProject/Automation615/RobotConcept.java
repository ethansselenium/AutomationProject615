package SeleniumProject.Automation615;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotConcept {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		Robot r1 = new Robot();
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		
		Thread.sleep(20);
		r1.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(20);
		r1.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(20);
		r1.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(20);
		r1.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(20);
		r1.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(20);
		
		r1.keyPress(KeyEvent.VK_CAPS_LOCK);
		Thread.sleep(20);
		r1.keyPress(KeyEvent.VK_A);
		r1.keyRelease(KeyEvent.VK_CAPS_LOCK);
		Thread.sleep(30);
		r1.keyPress(KeyEvent.VK_CAPS_LOCK);
		r1.keyRelease(KeyEvent.VK_CAPS_LOCK);
		r1.keyPress(KeyEvent.VK_I);
	
		Actions act = new Actions(driver);
		act.moveToElement(username).build().perform();
		act.contextClick(); // right click
		act.doubleClick(); // double click
		act.click(username).keyUp(Keys.SHIFT).sendKeys("a").build().perform();
		
		
		
		

	}

}
