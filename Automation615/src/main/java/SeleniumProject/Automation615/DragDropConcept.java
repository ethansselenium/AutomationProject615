package SeleniumProject.Automation615;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDropConcept {

	public static void main(String[] args) 
	{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		String url = "https://demoqa.com/droppable";
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		WebElement Drag = driver.findElement(By.id("draggable"));
		
		WebElement Drop =driver.findElement(By.id("droppable"));
		
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(Drag, Drop).build().perform();
		
		
		String textTo = Drop.getText();
		
		if(textTo.equals("Dropped!"))
		{
			System.out.println("Source element is dropped in the destination");
			
		}
		else
		{
			
			System.out.println("Source element is not dropped in the destination");
		}
		
		driver.close();
		
		
	}
	

}
