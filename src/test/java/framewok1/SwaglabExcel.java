package framewok1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwaglabExcel 
{
	WebDriver d;
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		d = new ChromeDriver();
		d.manage().deleteAllCookies();
		d.manage().window().maximize();
		d.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
	}

	@Test(dataProvider="excelconcept",dataProviderClass=ExcelDataprovider.class)
	public void login(String Username,String Password) throws InterruptedException
	{
		d.findElement(By.id("user-name")).sendKeys(Username);
		Thread.sleep(1000);
		d.findElement(By.id("password")).sendKeys(Password);
		Thread.sleep(1000);
		d.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
	}
	@AfterMethod
	public void close() throws InterruptedException
	{
		d.close();
		Thread.sleep(1000);
	}


}


