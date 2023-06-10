package nucotautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownIRahulshetty1
{
static WebDriver d;
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		 d = new ChromeDriver();
		d.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(2000);
		WebElement drop=d.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		Select s = new Select(drop);
		Thread.sleep(2000);
        s.selectByIndex(1);
        System.out.println(s.getFirstSelectedOption().getText());
        s.selectByValue("AED");
        System.out.println(s.getFirstSelectedOption().getText());
        s.selectByVisibleText("USD");
        System.out.println(s.getFirstSelectedOption().getText());
        
        
	}

}
