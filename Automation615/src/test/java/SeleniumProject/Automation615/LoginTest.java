package SeleniumProject.Automation615;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest 

{
	 static WebDriver driver;
	 Login lg;
	 
	 
	 @BeforeSuite
	 public void ServerUp()
	 {
		 System.out.println("server is up & running");
		 
	 }
	 
	 
	@BeforeMethod
	public void LanchingApplicaiton() throws IOException
	{
		WebDriverManager.chromedriver().setup(); // setting up browser properties
		 driver = new ChromeDriver(); 
		System.out.println("Launching an applicaiton");
		String url = "https://www.amazon.in/";
		driver.get(url);
		driver.manage().window().maximize(); // maximizing the browser window
		CommonMethods.Screenshot(driver, "../Automation615/Screenshots/amazon.png");
	}
	

	@Test (priority=0)
	public void LaunchingMobile()
	{
		Login.Mobile(driver);
		System.out.println("Entering Username & Password");
		
	}
	
	@Test (priority=1)
	public void Account()
	{
		Login.HelloSignin(driver);
		System.out.println("Entering Username & Password");
		
	}
	
	
	
	@AfterMethod
	public void ClosingApplicaiton()
	{
		Login.QuitBrowser(driver);
		System.out.println("closing an applicaiton");
		
	}
	
	
	 @AfterSuite
	 public void ServerDown()
	 {
		 System.out.println("server is down now");
		 
	 }

}
