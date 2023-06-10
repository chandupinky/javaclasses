package nucotautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsdisableEnableSelected 
{

	public static void main(String[] args) throws InterruptedException 
	{
//		WebDriverManager.chromedriver().setup();
//		WebDriver d = new ChromeDriver();
//		d.get("https://skillrary.com/user/login");
		//is selected
//		d.findElement(By.xpath("//input[@type='checkbox']"));
//		boolean b=d.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
//		if (b) 
//		{
//		System.out.println("pass");	
//		}
//		else
//		{
//			System.out.println("fail");
//		}
        //is displayed
//		WebDriverManager.chromedriver().setup();
//		WebDriver d = new ChromeDriver();
//		d.get("https://skillrary.com/user/login");
//		boolean display=d.findElement(By.xpath("//input[@id='email']")).isDisplayed();
//		if (display)
//		{
//		System.out.println("is displayed");	
//		} 
//		else 
//		{
//        System.out.println("is not displayed");
//		}
		//is enabled
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.get("https://eportal.incometax.gov.in/iec/foservices/#/login");
		d.findElement(By.id("panAdhaarUserId")).sendKeys("gfg");
		WebElement display=d.findElement(By.xpath("//button[@class='large-button-primary width marTop16']"));
		Thread.sleep(2000);
		boolean b=display.isEnabled();
		
		if (b)
		{
		System.out.println("is enabled");	
		} 
		else 
		{
        System.out.println("is not enabled");
		}
		
		
	}

}
