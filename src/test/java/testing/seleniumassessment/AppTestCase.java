package testing.seleniumassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.TestCase;

public class AppTestCase extends TestCase {

// Signup
	
	public void testMain()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("signup")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/form/div[1]/input")).sendKeys("Anand");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/form/div[2]/input")).sendKeys("anand123@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/form/div[3]/input")).sendKeys("anand@123");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/form/button")).submit();	
	}
	
}


