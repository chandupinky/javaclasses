package nucotautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownListof 
{
static WebDriver d;
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
        d = new ChromeDriver();
        d.get("https://www.save70.com/flights");
        Thread.sleep(2000);
       WebElement dd= d.findElement(By.id("flights_departure_time"));
       dd.click();
       Select s = new Select(dd);
       List<WebElement> lw = s.getOptions();
       for (WebElement all : lw) 
       {
		System.out.println(all.getText());
	   }
        s.selectByIndex(3);
        Thread.sleep(2000);
        s.selectByValue("10");
        Thread.sleep(2000);
        s.selectByVisibleText("12:00 PM");
        Thread.sleep(2000);
        String ss =s.getFirstSelectedOption().getText();
        System.out.println("selected timings = "+ss);
       d.close();
       
       
       
       
      

	}

}
