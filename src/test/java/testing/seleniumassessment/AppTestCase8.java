package testing.seleniumassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.TestCase;

public class AppTestCase8 extends TestCase {

// InsertCustomer
	
	public void testMain() 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:3000");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#addbutton > .btn")).click();
	    driver.findElement(By.name("cus_name")).click();
	    driver.findElement(By.name("cus_name")).sendKeys("Anand");
	    driver.findElement(By.name("cus_gender")).click();
	    driver.findElement(By.name("cus_gender")).sendKeys("Male");
	    driver.findElement(By.name("cus_mobile")).click();
	    driver.findElement(By.name("cus_mobile")).sendKeys("9876543210");
	    driver.findElement(By.name("cus_time")).click();
	    driver.findElement(By.name("cus_time")).sendKeys("3.00PM");
	    driver.findElement(By.name("cus_priority")).click();
	    driver.findElement(By.name("cus_priority")).sendKeys("HIGH");
	    driver.findElement(By.id("selectId")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("selectId"));
	      dropdown.findElement(By.xpath("//option[. = '5']")).click();
	    }
	    driver.findElement(By.cssSelector("button")).click();
	  }

}
