package testng.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderNucot 
{
	WebDriver d;
public boolean logindetails(String uname,String pwd) throws InterruptedException
{
	d.findElement(By.id("user-name")).sendKeys(uname);
	Thread.sleep(1000);
	d.findElement(By.id("password")).sendKeys(pwd);
	Thread.sleep(1000);
	d.findElement(By.id("login-button")).click();
	return true;
}
@BeforeMethod
public void setup()
{
	d = new ChromeDriver();
	d.get("https://www.saucedemo.com");
}

@Test(dataProvider="details")
public void loginpage(String uname,String pwd) throws InterruptedException 
{
	boolean b=logindetails( uname,pwd);
	Assert.assertTrue(b);
}
@DataProvider
public Object[][] details()
{
	return new Object[][]
			{
		{"chandu","123"},
		{"ram","456"},
		{"standard_user","secret_sauce"},
			};
}
@AfterMethod
public void quit()
{
	d.close();
}
}
