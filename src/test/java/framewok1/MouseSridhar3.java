package framewok1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseSridhar3 
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
    WebElement dclick =d.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
    
    Actions a = new Actions(d);
    a.doubleClick(dclick).perform();
}
}
