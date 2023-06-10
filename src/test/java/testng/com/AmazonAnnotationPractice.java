package testng.com;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class AmazonAnnotationPractice 
{
WebDriver d;
@BeforeMethod
public void launch()
{
	d = new ChromeDriver();
	d.manage().deleteAllCookies();
	d.manage().window().maximize();
	d.get("https://www.amazon.in/");
}

@Test(priority=2)
public void title()
{
	String s=d.getTitle();
	System.out.println(s);
}
@Test(priority=1)
public void currenturl()
{
	String ss=d.getCurrentUrl();
	System.out.println(ss);
}

@AfterMethod
public void closeit() throws InterruptedException 
{
Thread.sleep(2000);
	d.close();
}


}
