package testng.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization
{
	WebDriver d;
	@Parameters({"browser"})
	@Test
public void launch(String browser) throws InterruptedException
{
	if (browser.equalsIgnoreCase("CHROME")) 
	{
	    d= new ChromeDriver();  	
	}
	else if (browser.equalsIgnoreCase("firefox")) 
	{
		 d= new FirefoxDriver(); 
	}
	else if (browser.equalsIgnoreCase("edge")) 
	{
	  d = new EdgeDriver();	
	}
	else
	{
	System.out.println("please enter correct browser name");	
	}
	
	d.get("https://www.facebook.com/login/");
	Thread.sleep(2000);
}
	@Parameters({"email","pwd"})
	@Test
	public void operate(String email,String pwd) throws InterruptedException 
	{
		Thread.sleep(2000);
		d.findElement(By.id("email")).sendKeys(email);
		Thread.sleep(2000);
		d.findElement(By.id("pass")).sendKeys(pwd);
		Thread.sleep(2000);
		d.findElement(By.id("loginbutton")).click();
	}
	
}
