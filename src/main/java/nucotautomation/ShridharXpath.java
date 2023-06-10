package nucotautomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShridharXpath 
{

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.get("https://app.hubspot.com/login");

		d.findElement(By.xpath("//input[@id='username']")).sendKeys("shri");
		
		d.findElement(By.id("password")).sendKeys("shridhar@123");
		
		boolean b=d.findElement(By.xpath("//button[@id='loginBtn']")).isEnabled();
		if (b) 
		{
			System.out.println("is enabled");
		} 
		else 
		{
           System.out.println("is not enabled");
		}
		//explicit wait
//		WebDriverWait w = new WebDriverWait(d, Duration.ofSeconds(2));
//		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//h5[text()=\"That email address doesn't exist.\"]")));
//		
//		String t=d.findElement(By.xpath("//h5[text()=\"That email address doesn't exist.\"]")).getText();
//		System.out.println(t);
		
	}

}
