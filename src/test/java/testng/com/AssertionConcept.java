package testng.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertionConcept 
{
	WebDriver d;
	@BeforeMethod
void launch()
{
	d = new ChromeDriver();
	d.get("https://www.facebook.com/login/");
	
}
	@Test
	void loginpage() throws InterruptedException
	{
		d.findElement(By.id("email")).sendKeys("chandandh646@gmail.com");
		Thread.sleep(2000);
		d.findElement(By.id("pass")).sendKeys("abc");
	}
	@Test
	void test()
	{
		String expected=d.getTitle();
		System.out.println(expected);
		String actual="Log in to Facebook";
		Assert.assertEquals(actual, expected);
		
	}
	@AfterMethod
	void closeit() throws InterruptedException
	{
		Thread.sleep(1000);
		d.close();
	}
}
