package nucotautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShridharStandard 
{
	public WebDriver driver;
	public void launch()
	{
		String browser="firefox";
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
		
	}
	public void enterurl()
	{
		driver.get("https://www.zomato.com/india");
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
		ShridharStandard ss = new ShridharStandard();
		ss.launch();
		ss.enterurl();
		ss.gettitle();
		ss.close();

	}

}
