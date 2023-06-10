package testng.com;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links 
{
	WebDriver d;
	@Test
void alllinks() throws InterruptedException
{
		WebDriverManager.chromedriver().setup();
	d= new ChromeDriver();
	d.manage().deleteAllCookies();
	d.manage().window().maximize();
	d.get("https://swaglabs.in/");
	Thread.sleep(3000);
	List<WebElement> tag =d.findElements(By.tagName("a"));
	int count =tag.size();
	System.out.println(count);
	for (WebElement print : tag) 
	{
	System.out.println(print.getText());	
	}
}
}
