package nucotautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginedge 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
//		WebDriver d = new EdgeDriver();
//		d.get("https://www.google.com");
//		d.navigate().to("https://www.zomato.com/india");
//		Thread.sleep(2000);
//		d.navigate().back();
//		d.navigate().forward();
//		Thread.sleep(2000);
//		d.navigate().refresh();
		EdgeOptions e = new EdgeOptions();
		e.addArguments("--headless");
		WebDriver d = new EdgeDriver(e);
		d.get("https://www.zomato.com/india");
		System.out.println(d.getTitle());
	}

}
