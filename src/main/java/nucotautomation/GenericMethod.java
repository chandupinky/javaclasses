package nucotautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericMethod 
{
	 static WebDriver d;
	 public static WebElement findElement(By locator)
	 {
		 return d.findElement(locator);
	 }
	 public static void passvalue(By locator,String value)
	 {
		 findElement( locator).sendKeys(value); 
	 }
	 public static void Loginbutton(By locator)
	 {
		 findElement( locator).click();
	 }

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
		d.get("https://www.saucedemo.com");
		By un=By.xpath("//input[@id='user-name']");
		By pwd=By.xpath("//input[@id='password']");
		By lb=By.xpath("//input[@id='login-button']");
		Thread.sleep(1000);
		GenericMethod.passvalue(un, "standard_user");
		Thread.sleep(1000);
		GenericMethod.passvalue(pwd, "secret_sauce");
		Thread.sleep(1000);
		GenericMethod.Loginbutton(lb);
		

	}

}
