package testng.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseOver1 
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
    WebElement Source=d.findElement(By.xpath(" //a[contains(.,'BANK')] "));
    WebElement Desc=d.findElement(By.xpath("//li[@class='placeholder']"));
    
    Actions oaction=new Actions(d);
    oaction.clickAndHold(Source).moveToElement(Desc).release().build().perform();
    Thread.sleep(3000);
    //oaction.dragAndDrop(Source, Desc).perform();
    
}
}
