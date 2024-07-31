package testing.seleniumassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.TestCase;

public class AppTestCase6 extends TestCase {

// DeleteBooking
	
	public void testMain() 
	{	
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:3000");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("tr:nth-child(12) #delbutton")).click();
	    assertEquals(driver.switchTo().alert().getText(), ("Do you want to delete"));
	    driver.switchTo().alert().accept();
	    assertEquals(driver.switchTo().alert().getText(), ("Record has deleted"));
	}

}
