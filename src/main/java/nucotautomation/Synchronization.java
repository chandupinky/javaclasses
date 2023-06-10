package nucotautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Synchronization
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.get("https://www.saucedemo.com");
		d.findElement(By.xpath("//input[@id='user-name']")).sendKeys("hello");
		d.findElement(By.xpath("//input[@id='password']")).sendKeys("123");
		d.findElement(By.xpath("//input[@id='login-button']")).click();
		System.out.println(d.findElement(By.xpath("//h3[@data-test='error']")).getText());
		
		

	}

}
