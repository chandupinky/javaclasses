package testng.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dependson 
{
	WebDriver d;
	@BeforeTest                              
public void setup()
{
	
	d = new ChromeDriver();
	d.manage().window().maximize();
	
}
	@Test
	public void enterurl() throws InterruptedException
	{
		d.get("https://www.amazon.in/");
		Thread.sleep(2000);
	}
	@Test(dependsOnMethods="enterurl")
public void gettitle()
{
	String s=d.getTitle();
	System.out.println(s);
}
	@AfterTest
	public void close() throws InterruptedException
	{
		Thread.sleep(2000);
		d.close();
	}


}
//beforemethod
//enterurl
//beforemethod
//gettitle
