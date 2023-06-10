package framewok1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseCommonTestrun 
{
	WebDriver d;
 @Parameters({"url","browser"})
 @BeforeMethod
 public void setup(String url,String browser) throws InterruptedException
 {
	 if (browser.equalsIgnoreCase("chrome")) 
	 {
	   d = new ChromeDriver();	
	 }
	 else if (browser.equalsIgnoreCase("firefox")) 
	 {
	   d = new FirefoxDriver();
	 }
	 else if (browser.equalsIgnoreCase("edge")) 
	 {
		 d = new EdgeDriver();
	 }
	 else 
	 {
		System.out.println("please enter valid browser name");
	 }
	 
	 d.manage().deleteAllCookies();
	 d.manage().window().maximize();
	 d.get(url);
	 Thread.sleep(2000);
 }
 @AfterMethod
 public void close()
 {
	 d.close();
 }
}
