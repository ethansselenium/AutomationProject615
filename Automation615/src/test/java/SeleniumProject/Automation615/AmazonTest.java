package SeleniumProject.Automation615;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AmazonTest 
{

	@BeforeSuite
	public void OpenBrowser()
	{
		System.out.println("Opening a browser");
		
	}
	
	@BeforeMethod
	public void AppLogin()
	{
		System.out.println("Entering Username & Password");
	}

	@Test(priority=0)
	public void SearchItem()
	{
		System.out.println("User is searching an item");
	}
	
	@Test(priority=1)
	public void Addtocart()
	{
		System.out.println("Adding an item to a cart");
	}
	
	@Test(priority=2)
	public void PaymentOrder()
	{
		System.out.println("User is doing payment and order");
	}
	
	@AfterMethod
	public void AppLogout()
	{
		System.out.println("logging out from applicaiton");
		
	}
	
	@AfterSuite
	public void CloseBrowser()
	{
		System.out.println("Closing a browser");
		
	}
	
	
	@AfterSuite
	public void CloseServer()
	{
		System.out.println("Closing a browser");
		
	}
	
}
