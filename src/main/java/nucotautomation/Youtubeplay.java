package nucotautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Youtubeplay 
{
	static WebDriver d;
	public static WebElement findelement(By Locator)
	{
		return d.findElement(Locator);
	}
    public static void passvalue(By Locator,String value)
    {
    	findelement(Locator).sendKeys(value);
    }
    public static void button(By Locator)
    {
    	findelement(Locator).click();
    }
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		 d = new ChromeDriver();
		d.get("https://www.youtube.com/");
		By searchbar=By.xpath("//input[@id='search']");
        By searchbutton=By.xpath("//button[@id='search-icon-legacy']");
        By link=By.xpath("//yt-formatted-string[text()='Bharatha Bhushira Mandira Sundari-1| Upasane | Aarathi | Shivaram | Kannada Video Song']");
        Youtubeplay.passvalue(searchbar, "bharatha bhooshira mandira");
        Youtubeplay.button(searchbutton);
        Thread.sleep(2000);
        Youtubeplay.button(link);
	}

}
