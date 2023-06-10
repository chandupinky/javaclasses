package testng.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseOver4 
{
WebDriver d;
@Test
public void rightclick() throws InterruptedException
{
	d=new ChromeDriver();
    d.manage().deleteAllCookies();
    d.manage().window().maximize();
    d.get("https://www.collegesearch.in/bsc-in-india");
    Thread.sleep(3000);
   String s = d.getWindowHandle();
   d.switchTo().window(s);
   WebElement ole1=d.findElement(By.xpath("(//span[@aria-hidden='true'])[1]"));
   ole1.click();
    
//   WebElement ole2 =d.findElement(By.xpath("//img[@title='Menu']"));
//    Actions a = new Actions(d);
//   a.contextClick().perform();
}
}
