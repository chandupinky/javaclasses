package nucotautomation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		String id =d.getWindowHandle();
		System.out.println(id);
		d.switchTo().window(id);
		d.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9986651399");
		d.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	

	}

}
