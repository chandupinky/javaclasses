package nucotautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatersSwag 
{
	public WebDriver d;
	public WebDriver launch(String browser)
	{
		if (browser.equals("chrome"))
		{
		  WebDriverManager.chromedriver().setup();
		  d=new ChromeDriver();
		}
		else if(browser.equals("firefox")) 
		{
			WebDriverManager.firefoxdriver().setup();
			  d=new FirefoxDriver();
		}
		else
		{
			System.out.println("plz enter correct browser");
		}
	
		return d;
		
	}
	public WebDriver enterurl(String url)
	{
		d.get(url);
		return d;
	}
	public WebDriver Findelement1(String lcusername,String username)
	{
		d.findElement(By.id(lcusername)).sendKeys(username);
		return d;
	}
	public WebDriver Findelement2(String lcpwd,String pwd)
	{
		d.findElement(By.id(lcpwd)).sendKeys(pwd);
		return d;
	}
	public WebDriver Findelement3(String button)
	{
		d.findElement(By.id(button)).click();
		return d;
	}
	public void gettitle() 
	{
		String t= d.getTitle();
	    System.out.println(t);	
	}
	public void close()
	{
		d.close();
	}
	

	public static void main(String[] args) throws InterruptedException 
	{
		LocatersSwag ls = new LocatersSwag();
		ls.launch("firefox");
		Thread.sleep(1000);
		ls.enterurl("https://www.saucedemo.com");
		Thread.sleep(1000);
		ls.Findelement1("user-name", "standard_user");
		Thread.sleep(1000);
		ls.Findelement2("password", "secret_sauce");
		Thread.sleep(1000);
		ls.Findelement3("login-button");
		Thread.sleep(1000);
		ls.gettitle();
		ls.close();
		
	}

}
