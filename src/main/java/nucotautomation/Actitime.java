package nucotautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actitime 
{
	public WebDriver d;
	public void launch()
	{
		String s = "firefox";
		if (s.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			 d = new ChromeDriver();
		}
		else if (s.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			 d = new FirefoxDriver();
		}
		
	}
	public void enterurl(String url)
	{
		d.get(url);
	}
	public void enterusername()
	{
		d.findElement(By.id("username")).sendKeys("admin");
	}
	public void enterpwd()
	{
		d.findElement(By.name("pwd")).sendKeys("manager");
	}
	public void click()
	{
		d.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
	}
	public void close()
	{
		d.close();
	}

	public static void main(String[] args) throws InterruptedException 
	{
		//id,name,class name,linked text, partial linked text,css selector,x-path.
		Actitime a = new Actitime();
		a.launch();
		a.enterurl("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		a.enterusername();
		Thread.sleep(2000);
		a.enterpwd();
		Thread.sleep(2000);
		a.click();
		a.close();
		
	}

}
