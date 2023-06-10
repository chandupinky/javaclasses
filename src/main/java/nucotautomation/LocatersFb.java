package nucotautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatersFb 
{
	public WebDriver d;
	public void launch(String browser)
	{
		if (browser.equals("chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			d=new ChromeDriver();
		}
		if (browser.equals("firefox")) 
		{
			WebDriverManager.firefoxdriver().setup();
			d=new FirefoxDriver();
		} 
		if (browser.equals("edge")) 
		{
			WebDriverManager.edgedriver().setup();
			d=new EdgeDriver();
		} 

		else
		{
			System.out.println("enter correct browser");
		}

	}
	public void enterurl(String url)
	{
		d.get(url);
	}
	public void findelement1(String lcemail,String email)
	{
		d.findElement(By.id(lcemail)).sendKeys(email);
	}
	public void findelement2(String lcpwd,String pwd)
	{
		d.findElement(By.id(lcpwd)).sendKeys(pwd);
	}
	public void findelement3(String button)
	{
		d.findElement(By.name(button)).click();
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
		LocatersFb l = new LocatersFb();
		l.launch("edge");
		Thread.sleep(2000);
		l.enterurl("https://www.facebook.com");
		Thread.sleep(2000);
		l.findelement1("email", "chandandh@gmail.com");
		Thread.sleep(2000);
		l.findelement2("pass", "21www");
		Thread.sleep(2000);
		l.findelement3("login");
		Thread.sleep(2000);
		l.gettitle();
		
	}

}
