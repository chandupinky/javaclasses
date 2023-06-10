package framewok1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseSridhar1 
{
WebDriver d;
@Test
public void dragdrop() throws InterruptedException
{
	d=new ChromeDriver();
    d.manage().deleteAllCookies();
    d.manage().window().maximize();
    d.get("https://demo.guru99.com/test/drag_drop.html");
    Thread.sleep(3000);
    WebElement drag =d.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
    WebElement drop=d.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
    Actions a = new Actions(d);
    //a.dragAndDrop(drag, drop).perform();
    a.clickAndHold(drag).moveToElement(drop).release().build().perform();
  
}
}
