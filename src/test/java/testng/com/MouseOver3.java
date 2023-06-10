package testng.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseOver3 
{
	WebDriver d;
	@Test
	public void doubleclick() throws InterruptedException
	{
		d=new ChromeDriver();
	    d.manage().deleteAllCookies();
	    d.manage().window().maximize();
	    d.get("https://demo.guru99.com/test/simple_context_menu.html");
	    Thread.sleep(3000);
	    WebElement ole =d.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
	    Actions a = new Actions(d);
	    a.doubleClick(ole).perform();
	    Alert am=d.switchTo().alert();
	    String s=am.getText();
	    System.out.println(s);
	    if(s.equalsIgnoreCase("You double clicked me.. Thank You.."))
	    {
	    	System.out.println("test case pass");
	    }
	    else
	    {
	    	System.out.println("test case fail");
	    }
	    am.accept();
	    d.close();
	    	
	}
}
