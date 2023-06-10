package testng.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookScript 
{
	WebDriver d;
	@BeforeMethod
void launch()
{
	WebDriverManager.chromedriver().setup();
	 d = new ChromeDriver();
	 d.manage().window().maximize();
}
	@Test
void loginpage() throws InterruptedException
{
		Thread.sleep(2000);
	d.get("https://www.facebook.com/login/");
	Thread.sleep(2000);
	d.findElement(By.id("email")).sendKeys("chandandh646@gmail.com");
	Thread.sleep(2000);
	d.findElement(By.id("pass")).sendKeys("abc");
	Thread.sleep(2000);
	d.findElement(By.id("loginbutton")).click();
	Thread.sleep(2000);
	System.out.println("hi hello");
	
}
	@Test
void gettitle() throws InterruptedException
{
		Thread.sleep(2000);
	String s=d.getTitle();
	Thread.sleep(2000);
	System.out.println(s);
}
@AfterMethod
void closeit() throws InterruptedException
{
	Thread.sleep(2000);
	d.close();
}
}
