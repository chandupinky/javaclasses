package nucotautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Isenable 
{
	static WebDriver d;
	public static WebElement findElement(By Locator)
	 {
		 return d.findElement(Locator);
	 }
	public static void passvalue(By Locator,String value)
	 {
		 findElement(Locator).sendKeys(value);
	 }

	public static boolean isenable(By Locator)
	 {
		 return findElement(Locator).isEnabled();
	 }

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.get("https://eportal.incometax.gov.in/iec/foservices/#/login");
		Thread.sleep(2000);
		By enter=By.xpath("//input[@id='panAdhaarUserId']");
		Isenable.passvalue(enter, "bh");
//		By x=By.xpath("//button[@class='large-button-primary width marTop16']");
//		Thread.sleep(2000);
//		boolean b =Isenable.isenable(x);
//		if (b) 
//		{
//			System.out.println("is enabled");
//		} 
//		else 
//		{
//			System.out.println("is not enabled");
//		}

	}

}
