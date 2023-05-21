package SeleniumProject.Automation615;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.nashorn.internal.runtime.regexp.joni.constants.internal.Arguments;

public class ScrollConcept {

	public static void main(String[] args) 
	{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.amazon.in";
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		WebElement ALL = driver.findElement(By.id("nav-hamburger-menu"));
		
		ALL.click();
		
		WebElement Account =driver.findElement(By.xpath("//a[text()='Your Account' and @class='hmenu-item']"));
		
		JavascriptExecutor ja = (JavascriptExecutor)(driver);
		
		ja.executeScript("arguments[0].scrollIntoView();",Account);	

		Account.click();
	}

}
