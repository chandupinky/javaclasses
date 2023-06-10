package nucotautomation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles
{
static WebDriver d;
	public static void main(String[] args) throws InterruptedException 
	{
		//single window
//	WebDriverManager.chromedriver().setup();
//	d = new ChromeDriver();
//	d.manage().deleteAllCookies();
//	d.manage().window().maximize();
//	d.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
//	Thread.sleep(2000);
//	String parent=d.getWindowHandle();
//	System.out.println(parent);
//	Thread.sleep(2000);
//    d.findElement(By.id("newWindowBtn")).click(); 
//    Thread.sleep(2000);
//    Set<String> child=d.getWindowHandles();
//    for (String handle : child)
//    {
//	System.out.println(handle);	
//	 d.switchTo().window(handle);
//	 d.manage().window().maximize();
//	WebElement e= d.findElement(By.xpath("//h1[@class='post-title entry-title']"));
//	System.out.println(e.getText());
//	if (e.getText().equalsIgnoreCase("Basic Controls")) 
//	{
//	System.out.println("testcase pass");	
//	} else 
//	{
//    System.out.println("testcase fail");
//	}
//	}
//  Thread.sleep(2000);
//    d.close();
	//single tab
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
		d.manage().deleteAllCookies();
		d.manage().window().maximize();
		d.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(2000);
		String parent=d.getWindowHandle();
		System.out.println(parent);
		Thread.sleep(2000);
		d.findElement(By.id("newTabBtn")).click(); 
		Thread.sleep(2000);
		Set<String> child=d.getWindowHandles();
		for (String handle : child)
		{
			d.switchTo().window(handle);
			Thread.sleep(2000);
			WebElement ele =d.findElement(By.id("alertBox"));
			ele.click();
			Thread.sleep(2000);

		}

	}
}
