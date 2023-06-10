package testng.com;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RealTime
{
	WebDriver d ;
	@Test
public void real() throws InterruptedException
{
	WebDriverManager.chromedriver().setup();
	WebDriver d = new ChromeDriver();
	d.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	String g =d.getWindowHandle();
	System.out.println(g);
    d.switchTo().window(g);
    WebElement x =d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
    x.click();
    d.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mobiles");
    Thread.sleep(2000);
    d.findElement(By.xpath("(//a[@class='_3izBDY'])[3]")).click();
    
}
}
