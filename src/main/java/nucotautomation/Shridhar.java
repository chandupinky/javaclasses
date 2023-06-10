package nucotautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Shridhar 
{

	public static void main(String[] args)
	{
		//to launch
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//to enter url
		driver.get("https://www.zomato.com/india");
		//to get current url
		String cu=driver.getCurrentUrl();
		System.out.println(cu);
		//validation of current url
		if (cu.equals("https://www.zomato.com/india"))
				{
			System.out.println("this is correct url");
		         }
		else
		{
			System.out.println("this is not correct url");
		}
		//to get title of the page
		String t = driver.getTitle();
		System.out.println(t);
		if (t.equals("Best Restaurants in India - Zomato")) 
		{
			System.out.println("this is correct title");
		}
		else
		{
			System.out.println("this is not correct title");
		}
		//to close//invalid session id
//		driver.close();
//		String to = driver.getTitle();
//		System.out.println(t);
		//to quit//Session ID is null
		driver.quit();
		String to = driver.getTitle();
		System.out.println(t);
		//driver.quit();
		
		

	}

}
