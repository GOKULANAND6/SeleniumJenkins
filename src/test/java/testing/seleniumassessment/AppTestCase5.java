package testing.seleniumassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.TestCase;

public class AppTestCase5 extends TestCase {

// InsertBooking	
	
	public void testMain() 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:3000");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("insertservice")).click();
		driver.findElement(By.xpath("//*[@id=\"in2\"]/form/input[1]")).sendKeys("Hair Style");
		driver.findElement(By.xpath("//*[@id=\"in2\"]/form/input[2]")).sendKeys("10000");
		driver.findElement(By.xpath("//*[@id=\"in2\"]/form/input[3]")).sendKeys("2% Discount");
		driver.findElement(By.xpath("//*[@id=\"in2\"]/form/button")).click();
	}

}
