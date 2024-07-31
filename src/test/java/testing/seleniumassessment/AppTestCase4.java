package testing.seleniumassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.TestCase;

public class AppTestCase4 extends TestCase {

// UpdateBooking	
	
	public void testMain() throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:3000");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("login")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[2]/form/div[1]/input")).sendKeys("ruthresh123@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[2]/form/div[2]/input")).sendKeys("ruthresh@123");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[2]/form/button")).submit();
	
		driver.findElement(By.xpath("//*[@id=\"updbutton\"]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"edit2\"]/div/form/div[4]/input")).clear();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"edit2\"]/div/form/div[4]/input")).sendKeys("15% Discount");
		driver.findElement(By.xpath("//*[@id=\"updbutton\"]")).submit();
	
	}

}
