package nucotautomation;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonAutomation 
{
 static WebDriver d;
 public static WebElement findelement(By locator)
 {
	 return d.findElement(locator);
 }
 public static void passvalues(By locator,String value)
 {
	 findelement(locator).sendKeys(value);
 }
  public static void clickit(By locator)
 {
	 findelement(locator).click();
 }
 public static void mouseover(By locator)
 {
	 Actions act = new Actions(d);
	 act.moveToElement(findelement(locator)).perform();
	 	 
 }
 public static void dropdown(By locator)
 {
	 Select s = new Select(findelement(locator));
	 List<WebElement>dd=s.getOptions();
 }
 public static void scroll(By locator)
 {
	 Actions act = new Actions(d);
	 act.moveToElement(findelement(locator)).scrollByAmount(0, 700).perform();
	 
 }
 public static void windo() throws InterruptedException
 {
	 String sw=d.getWindowHandle();
	 Set<String>se=d.getWindowHandles();
	 for (String wind : se)
	 {
		d.switchTo().window(wind);
		Thread.sleep(2000);
		WebElement ele=d.findElement(By.id("add-to-cart-button"));
		ele.click();
		Thread.sleep(2000);
	
	 }
 }
 public static String title()
 {
	 return d.getTitle();
	 
 }
	public static void main(String[] args) throws InterruptedException
	{
	WebDriverManager.chromedriver().setup();
	d=new ChromeDriver();
	d.manage().deleteAllCookies();
	d.manage().window().maximize();
	d.get("https://www.amazon.in/");
     Thread.sleep(1000);
	By mouse=By.xpath("//div[@class='nav-line-1-container']");
	By signin=By.xpath("//span[.='Sign in']");
	By email=By.id("ap_email");
	By continu=By.id("continue");
	By password=By.id("ap_password");
	By submit = By.id("signInSubmit");
	By drop = By.xpath("//span[@class='nav-icon nav-arrow']");
	By searchbar=By.id("twotabsearchtextbox");
	By searchbutton=By.id("nav-search-submit-button");
	By kurtha = By.xpath("(//span[contains(@class,'a-size-base-plus a-color-base a-text-normal')])[2]");
//	By scrolling = By.xpath("//html[@lang='en-in']");
	By addtocart = By.id("add-to-cart-button");
//	By scrolling1=By.xpath("//html[@lang='en-in'][1]");
	Thread.sleep(1000);
	AmazonAutomation.mouseover(mouse);
	Thread.sleep(1000);
	AmazonAutomation.clickit(signin);
	Thread.sleep(1000);
	AmazonAutomation.passvalues(email, "chandandh646@gmail.com");
	Thread.sleep(1000);
	AmazonAutomation.clickit(continu);
	Thread.sleep(1000);
	AmazonAutomation.passvalues(password, "99chandu99");
	Thread.sleep(1000);
	AmazonAutomation.clickit(submit);
	Thread.sleep(2000);
//	AmazonAutomation.clickit(drop);
	Thread.sleep(3000);
	AmazonAutomation.passvalues(searchbar, "mens kurthas");
	Thread.sleep(1000);
	AmazonAutomation.clickit(searchbutton);
	Thread.sleep(2000);
//	AmazonAutomation.scroll(scrolling);
	Thread.sleep(1000);
	AmazonAutomation.clickit(kurtha);
	Thread.sleep(2000);
	AmazonAutomation.windo();
	
//	AmazonAutomation.scroll(scrolling1);
//	Thread.sleep(2000);

	

	}
	
}
