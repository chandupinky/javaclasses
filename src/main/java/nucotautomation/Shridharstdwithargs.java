package nucotautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Shridharstdwithargs 
{
	public WebDriver driver;
	public WebDriver launch(String browser)
	{
		if (browser.equals("chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		}
		else if (browser.equals("firefox")) 
		{
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		} 
		else if (browser.equals("edge")) 
		{
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
		} 
		else 
		{
           System.out.println("plz launch correct browser");
		}
		return driver;
		
	}
	public void enterurl(String url)
	{
		driver.get(url);
	}
	
	public void gettitle()
	{
		String t = driver.getTitle();
		System.out.println(t);
	}
	public void close()
	{
		driver.close();
	}
	public static void main(String[] args) 
	{
		Shridharstdwithargs ss = new Shridharstdwithargs();
		ss.launch("firefox");
		ss.enterurl("https://www.zomato.com/india");
		ss.gettitle();
		ss.close();

	}

}
