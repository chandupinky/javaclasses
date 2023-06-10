package testng.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing
{
	static WebDriver d;
@BeforeMethod
 void launch()
{
	WebDriverManager.chromedriver().setup();
	 d = new ChromeDriver();
}
@Test
void url()
{
	d.get("https://www.flipkart.com/");
}
	@Test(dependsOnMethods="url")
 void title()
	{

		String t=d.getTitle();
	    System.out.println(t);
	    System.out.println(d.getCurrentUrl());
		
	}
@AfterMethod
	void close()
	{
	d.close();	
	}
	
}
