package testng.com;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertHandling2 
{
	WebDriver d;
	@Test
	public void demo() 
	{
		d = new ChromeDriver();
		d.manage().deleteAllCookies();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		d.get("https://the-internet.herokuapp.com/javascript_alerts");
		d.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Alert a=d.switchTo().alert();
		//a.dismiss();
		//a.accept();
		String s = a.getText();
		System.out.println(s);
		a.sendKeys("hello");
		a.accept();
		
//		d.close();
		
		
	}
}
