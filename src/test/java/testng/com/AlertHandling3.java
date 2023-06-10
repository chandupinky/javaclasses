package testng.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertHandling3 
{
	WebDriver d;
	@Test
	public void demo() 
	{
		d = new ChromeDriver();
		d.manage().deleteAllCookies();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		d.get("https://the-internet.herokuapp.com/upload");
	d.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\user\\Desktop");
		
//		d.close();
		
		
	}
}
