package testing.seleniumassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.TestCase;

public class AppTestCase2 extends TestCase {

// Login
	
	public void testMain() 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:3000");
		driver.manage().window().maximize();
		driver.findElement(By.id("login")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[2]/form/div[1]/input")).sendKeys("anand123@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[2]/form/div[2]/input")).sendKeys("anand@123");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[2]/form/button")).submit();
	}

}
