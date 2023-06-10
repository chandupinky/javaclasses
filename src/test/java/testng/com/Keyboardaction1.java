package testng.com;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Keyboardaction1 
{
WebDriver d;
@Test
public void scroll() throws InterruptedException
{
	d = new ChromeDriver();
	d.manage().deleteAllCookies();
	d.manage().window().maximize();
	d.get("https://www.amazon.com/");
	Thread.sleep(1000);
	Actions a = new Actions(d);
	a.sendKeys(Keys.PAGE_DOWN).build().perform();
	
	
}
}
