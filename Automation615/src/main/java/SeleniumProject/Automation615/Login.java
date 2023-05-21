package SeleniumProject.Automation615;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login  {
	
	static CommonMethods cm;
	static WebDriver driver;

	public static void Mobile(WebDriver driver) {
		WebElement mobile1 = driver.findElement(By.xpath("//a[contains(text(),'Mob')]"));
		String textamazon = mobile1.getText();
		System.out.println("textamazon is :" + textamazon);
		WebElement mobile = driver.findElement(By.xpath("//a[contains(text(),'Mob')]")); // taking the element property
																							// & passing to variable
		mobile.click();

	}

	public static void HelloSignin(WebDriver driver) {
		WebElement HelloSignin = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Actions act = new Actions(driver);

		act.moveToElement(HelloSignin).build().perform();

		WebElement YourAccount = driver.findElement(By.xpath("//span[text()='Your Account']"));

		YourAccount.click();
	}

	public static void QuitBrowser(WebDriver driver) {
		driver.close(); // closing browser
	}

}
