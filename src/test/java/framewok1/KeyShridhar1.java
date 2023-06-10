package framewok1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyShridhar1
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
    WebElement scroll = d.findElement(By.xpath("//html[@lang='en-in']"));
    
    Actions a = new Actions(d);
   // a.keyDown(scroll,Keys.CONTROL).sendKeys(Keys.END).keyUp(scroll,Keys.CONTROL).build().perform();
    a.sendKeys(Keys.END).perform();
}
}
