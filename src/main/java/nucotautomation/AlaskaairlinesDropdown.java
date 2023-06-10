package nucotautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlaskaairlinesDropdown 
{
static WebDriver d;

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		 d = new ChromeDriver();
		d.get("https://www.alaskaair.com/flightstatus");
		Thread.sleep(2000);
		WebElement drop=d.findElement(By.xpath("//select[@id='FlightDate']"));
	
		Select s =new Select(drop);
		Thread.sleep(2000);
		s.selectByIndex(2);
		System.out.println(d.findElement(By.xpath("//select[@id='FlightDate']")).getText());
		//s.selectByValue("Friday, 05/12/2023");
		System.out.println(d.findElement(By.xpath("//select[@id='FlightDate']")).getText());
		

	}

}
