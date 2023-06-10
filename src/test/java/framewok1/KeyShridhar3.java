package framewok1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyShridhar3 
{
WebDriver d;
@Test
public void copypaste() throws InterruptedException
{
	d=new ChromeDriver();
    d.manage().deleteAllCookies();
    d.manage().window().maximize();
    d.get("https://www.saucedemo.com/");
    Thread.sleep(3000);
   WebElement uname= d.findElement(By.id("user-name"));
   uname.click();
   uname.sendKeys("sridhar");
   WebElement pwd= d.findElement(By.id("password"));
   pwd.click();
   
   Actions a = new Actions(d);
   a.keyDown(uname,Keys.CONTROL).sendKeys("c").keyUp(uname,Keys.CONTROL).build().perform();
   Thread.sleep(2000);
   a.keyDown(pwd,Keys.CONTROL).sendKeys("v").keyUp(pwd,Keys.CONTROL).build().perform();
   
   
}
}
