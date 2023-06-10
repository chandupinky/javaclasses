package framewok1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyShridhar2 
{
WebDriver d;
@Test
public void Shift() throws InterruptedException
{
	d=new ChromeDriver();
    d.manage().deleteAllCookies();
    d.manage().window().maximize();
    d.get("https://www.google.com/");
    Thread.sleep(3000);
    WebElement searchbar = d.findElement(By.xpath("//textarea[@class='gLFyf']"));
    
    Actions a = new Actions(d);
    a.keyDown(searchbar,Keys.SHIFT).sendKeys("hosur").keyUp(searchbar,Keys.SHIFT).build().perform();
   
}
}
