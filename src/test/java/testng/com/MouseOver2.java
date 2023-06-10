package testng.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseOver2 
{
WebDriver d;
@Test
public void scroll() throws InterruptedException
{
	d=new ChromeDriver();
    d.manage().deleteAllCookies();
    d.manage().window().maximize();
    d.get("https://www.amazon.in/");
    Thread.sleep(3000);
    WebElement ole=d.findElement(By.xpath("//html[@lang='en-in']"));
    Actions a = new Actions(d);
    a.scrollByAmount(3000, 5000).perform();
    
}
}
