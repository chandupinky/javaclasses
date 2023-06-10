package nucotautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StandardwayScript 
{
	public WebDriver driver;
	/**
	 * this method is used to launch browser
	 * 
	 *To launch browser
	 * @param browser
	 */
	public WebDriver launch(String browser)
	{
		if (browser.equals("Chrome")) 
		{
			WebDriverManager.chromedriver().setup();  
			driver=new ChromeDriver();
		}
		else if (browser.equals("Firefox")) 
		{
			WebDriverManager.firefoxdriver().setup(); 
			driver=new FirefoxDriver();
		}
		else if (browser.equals("Edge")) 
		{
			driver=new EdgeDriver();

		}
		else
		{
			System.out.println("please enter correct browser");
		}
		return driver;

	}
	public WebDriver Geturl(String url)
	{
		driver.get(url);
		return driver;
	}
	public WebDriver Geturlvalidation(String cuurl)
	{
		driver.get(cuurl);
		if (cuurl.equals("https://www.flipkart.com")) 
		{
			System.out.println("this is correct url");
		}
		else
		{
			System.out.println("this is not a correct url");
		}
		
		return driver;
		
	}
	


	public static void main(String[] args) 
	{
		StandardwayScript sw = new StandardwayScript();
		sw.launch("Firefox");
		sw.Geturl("https://www.flipkart.com");
		sw.Geturlvalidation("https://www.flipkart.com");

	}
}
