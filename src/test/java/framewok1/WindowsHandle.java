package framewok1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowsHandle 
{
WebDriver d;
@Test
public void handle() throws InterruptedException
{
	d=new ChromeDriver();
    d.manage().deleteAllCookies();
    d.manage().window().maximize();
    d.get("https://demoqa.com/browser-windows");
    Thread.sleep(2000);
    WebElement tab =d.findElement(By.id("tabButton"));  
    tab.click();
    Set<String>windows=d.getWindowHandles();
    Iterator<String>it=windows.iterator();
    String parentid=it.next();
    String childid=it.next();
    d.switchTo().window(childid);
    WebElement tab1=d.findElement(By.xpath("//h1[@id='sampleHeading']"));
    System.out.println(tab1.getText());
    Thread.sleep(3000);
    d.close();
    d.switchTo().window(parentid);
    WebElement win=d.findElement(By.id("windowButton"));
    win.click();
      
}
}
