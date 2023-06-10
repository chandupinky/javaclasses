package nucotautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Options 
{

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions c = new ChromeOptions();
		//c.addArguments("--incognito");
		c.addArguments("--headless");
		WebDriver d = new ChromeDriver(c);
		d.get("https://www.zomato.com/india");
		System.out.println(d.getTitle());

	}

}
