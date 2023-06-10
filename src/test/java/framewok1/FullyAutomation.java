package framewok1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FullyAutomation 
{
	WebDriver d;
	@BeforeMethod
	public void launch() 
	{
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
		d.manage().deleteAllCookies();
		d.manage().window().maximize();
		d.get("https://rahulshettyacademy.com/AutomationPractice/");

	}
	@Test(priority=1)
	public void radio()
	{
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		WebElement Radio=d.findElement(By.className("radioButton"));
		Radio.click();
		if (Radio.isSelected()) 
		{
			System.out.println("Test case is pass");	
		} else 
		{
			System.out.println("test case is fail");
		}
	}
	@Test(priority=2)
	public void autosuggetiondrop()
	{
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		WebElement auto=d.findElement(By.id("autocomplete"));
		auto.sendKeys("nam");
		List<WebElement>aut=d.findElements(By.xpath("//div[@class='ui-menu-item-wrapper']"));
		for (WebElement list : aut) 
		{
		if (list.getText().equalsIgnoreCase("namibia")) 
		{
		list.click();
		break;
		}	
		}
		
	}
	@AfterMethod
	public void close() throws InterruptedException
	{
		Thread.sleep(4000);
		d.close();
	}
}
