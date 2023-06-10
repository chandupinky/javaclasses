package testng.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviding 
{
	WebDriver d;
	
	@Test(dataProvider="values")
    
	public void swag(String uname,String pwd) throws InterruptedException
{
		
	d = new ChromeDriver();
	d.get("https://www.google.com");
	d.navigate().to("https://www.saucedemo.com");
	Thread.sleep(2000);
	d.findElement(By.id("user-name")).sendKeys(uname);
	Thread.sleep(2000);
	d.findElement(By.id("password")).sendKeys(pwd);
	Thread.sleep(2000);
	d.findElement(By.id("login-button")).click();
}
	@DataProvider(name="values")
	public Object[][] excel()
	{
		Object[][] o = new Object[3][2];
		o[0][0]="chandu";
		o[0][1]="123";
		o[1][0]="shivu";
		o[1][1]="456";
		o[2][0]="standard_user";
		o[2][1]="secret_sauce";
		return o;
	}
}
