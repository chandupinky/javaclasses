package nucotautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownIRahulshetty2 
{
	static WebDriver d;
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		 d = new ChromeDriver();
		d.get("https://rahulshettyacademy.com/dropdownsPractise/");
		d.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		for (int i = 1; i < 5; i++)
		{
			d.findElement(By.id("hrefIncAdt")).click();
		}
		Thread.sleep(2000);
		d.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(d.findElement(By.id("divpaxinfo")).getText());
		

	}

}
