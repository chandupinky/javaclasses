package nucotautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath 
{
	public WebDriver d;
	public WebDriver launch(String browser)
	{
		if (browser.equals("chrome")) 
		{
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
		}
		else if (browser.equals("firefox")) 
		{
			WebDriverManager.firefoxdriver().setup();
			d = new FirefoxDriver();
		}
		else {
			WebDriverManager.edgedriver().setup();
			d = new EdgeDriver();
		}
		return d;
	}
	public WebDriver enterurl(String url)
	{
		d.get(url);
		return d;
	}
	public WebDriver enterUN(String lun,String un) 
	{
		d.findElement(By.xpath(lun)).sendKeys(un);
		return d;
	}
	public WebDriver enterpwd(String lpwd,String pwd) 
	{
		d.findElement(By.xpath(lpwd)).sendKeys(pwd);
		return d;
	}
	public WebDriver Lbutton(String lbutton) 
	{
		d.findElement(By.xpath(lbutton)).click();
		return d;
	}
	public void gettitle()
	{
		String t =d.getTitle();
		System.out.println(t);
	}
	public void close()
	{
		d.close();
	}

	public static void main(String[] args) throws InterruptedException 
	{
		Xpath x = new Xpath();
		x.launch("hi");
		x.enterurl("https://www.saucedemo.com");
		Thread.sleep(2000);
		x.enterUN("//input[@id='user-name']", "standard_user");
		Thread.sleep(2000);
		x.enterpwd("//input[@id='password']", "secret_sauce");
		Thread.sleep(2000);
		x.Lbutton("//input[@id='login-button']");
		Thread.sleep(2000);
		x.gettitle();
		x.close();


	}

}
