package testing.seleniumassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.TestCase;

public class AppTestCase7 extends TestCase {

// ViewCustomer	
	
	public void testMain() 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:3000");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/ul/li[3]/a")).click();
	}

}
