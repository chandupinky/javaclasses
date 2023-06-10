package nucotautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Monstercom 
{
	static WebDriver d;
	public static WebElement findelement(By Locator)
	{
		return d.findElement(Locator);
	}
    public static void passvalues(By Locator,String value)
    {
    	 findelement(Locator).sendKeys(value);
    }
    public static void button(By Locator)
    {
    	findelement(Locator).click();
    }
    public static String gettext(By Locator)
    {
    	return findelement(Locator).getText();
    }
    public static boolean displayed(By Locator)
    {
    	return findelement(Locator).isDisplayed();
    }
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		 d = new ChromeDriver();
		d.get("https://www.foundit.in/#");
		By lgbutt=By.xpath("//span[text()='Login']");
		By email=By.xpath("//input[@id='signInName']");
		By pwd=By.xpath("//input[@id='password']");
		By sigbut=By.xpath("//input[@id='signInbtn']");
		By error=By.xpath("//div[@class='alertError']");
		By isdidplay=By.xpath("//p[@class='mobileAppText']");
		
		Monstercom.button(lgbutt);
		Monstercom.passvalues(email, "chandu@gmail.com");
		Monstercom.passvalues(pwd, "chandu@123");
		Monstercom.button(sigbut);
		Thread.sleep(2000);
		String t=Monstercom.gettext(error);
		System.out.println(t);
		boolean b=Monstercom.displayed(isdidplay);
		System.out.println(b);
		
	}
	
}
