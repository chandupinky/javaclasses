package testng.com;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Rahulshetty 
{
WebDriver d;
@BeforeMethod
public void setup() throws InterruptedException
{
	d = new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.rahulshettyacademy.com/");
	Thread.sleep(2000);
}
@Parameters({"name","email"})
@Test(priority=1)
public void loginpage(String name,String email) throws InterruptedException
{
	Thread.sleep(2000);
	WebElement p=d.findElement(By.xpath("(//a[contains(.,'Practice')])[1]"));
	p.click();
	Thread.sleep(2000);
	WebElement n=d.findElement(By.id("name"));
	n.sendKeys(name);
	Thread.sleep(2000);
	WebElement e=d.findElement(By.id("email"));
	e.sendKeys(email);
	Thread.sleep(2000);
	WebElement c=d.findElement(By.id("agreeTerms"));
	c.click();
	Thread.sleep(2000);
	WebElement b=d.findElement(By.id("form-submit"));
	b.click();
	
}
@Test(priority=2)
public void gettitle() throws InterruptedException
{
	Thread.sleep(2000);
	String expected=d.getTitle();
    System.out.println(expected);  
}
@Parameters({"name","email"})
@Test(priority=3)
public void homepage(String name,String email) throws InterruptedException
{
	loginpage(name, email);
	Thread.sleep(2000);
	WebElement a=d.findElement(By.xpath("//a[contains(.,'Automation Practise - 1')]"));
	a.click();
}
@Parameters({"name","email","product"})
@Test(priority=4)
public void productlist(String name,String email,String product)throws InterruptedException
{
	loginpage(name, email);
	Thread.sleep(2000);
	homepage(name, email);
	Thread.sleep(2000);
	WebElement p=d.findElement(By.xpath("//input[@class='search-keyword']"));
	Thread.sleep(2000);
	p.click();
	Thread.sleep(2000);
	p.sendKeys(product);
	
}
@AfterMethod
public void close() throws InterruptedException
{

	d.close();
	Thread.sleep(2000);
}
}
