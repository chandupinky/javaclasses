package testng.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

public class Datap 
{ 
	WebDriver d;
	@BeforeMethod
	public void launch()
	{
		d = new ChromeDriver();
		d.manage().deleteAllCookies();
		 d.manage().window().maximize();
		 d.get("https://www.saucedemo.com/");
	}
	
	@Test(dataProvider="data")
	   		public void login(String uname,String pwd) throws InterruptedException
		{
			d.findElement(By.id("user-name")).sendKeys(uname);
			Thread.sleep(1000);
			d.findElement(By.id("password")).sendKeys(pwd);
			Thread.sleep(1000);
			d.findElement(By.id("login-button")).click();
			Thread.sleep(2000);
		}
		//chandu, 123---->1
		//sridhar, 456---->2
		//swaguser,swagpwd--->3
		
		
		@DataProvider
		public Object[][] data()
		{
			Object[][]obj=new Object[3][2];
			obj[0][0]="chandu";
			obj[0][1]="123";
			obj[1][0]="sridhar";
			obj[1][1]="456";
			obj[2][0]="standard_user";
			obj[2][1]="secret_sauce";
			return obj;
			
		}
		@AfterMethod
		public void close() throws InterruptedException
		{
			d.close();
			Thread.sleep(2000);
		}
}
