package framewok1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseSridhar4 
{
WebDriver d;
@Test
public void rightclik() throws InterruptedException
{
	d=new ChromeDriver();
    d.manage().deleteAllCookies();
    d.manage().window().maximize();
    d.get("https://demo.guru99.com/test/simple_context_menu.html");
    Thread.sleep(3000);
    WebElement rightclick =d.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	
    Actions a = new Actions(d);
    a.contextClick(rightclick).perform();
	
}
}
