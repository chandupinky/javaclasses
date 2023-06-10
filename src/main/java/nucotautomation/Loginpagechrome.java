package nucotautomation;

import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginpagechrome 
{

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com");
//		ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--remote-allow-origins=*");
//        ChromeDriver driver = new ChromeDriver(chromeOptions);
//        driver.get("https://www.zomato.com/");
		String t=d.getTitle();
        System.out.println(t);
        System.out.println(d.getCurrentUrl());
        d.quit(); 
        if (t.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!")) 
        {
			System.out.println("correct title");
		}
        else
        {
        	System.out.println("incorrect title");
        }
        d.close();
        String it=d.getTitle();
        System.out.println(it);
        

	}

}
