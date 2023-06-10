package nucotautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownGeneric 
{
static WebDriver d;
public static WebElement findelement(By locator)
{
	return d.findElement(locator);
}
public static void selectit(By locator,int index)
{
	Select s = new Select(findelement(locator));
	s.selectByIndex(index);
}
public static void clickit(By locator)
{
	findelement(locator).click();
}
public static void printtext(By locator)
{
	Select s = new Select(findelement(locator));
	System.out.println(s.getFirstSelectedOption().getText());
}
	public static void main(String[] args) throws InterruptedException 
	{
	WebDriverManager.chromedriver().setup();
	d=new ChromeDriver();
	d.get("https://www.save70.com/flights/");
     By time=By.id("flights_departure_time");
     By journeyclass=By.name("flights_class");
     DropdownGeneric.findelement(time);
     DropdownGeneric.clickit(time);
     DropdownGeneric.selectit(time, 8);
     Thread.sleep(2000);
     DropdownGeneric.printtext(time);
     DropdownGeneric.findelement(journeyclass);
     DropdownGeneric.selectit(journeyclass, 1);
     Thread.sleep(2000);
     DropdownGeneric.printtext(journeyclass);
	}

}
