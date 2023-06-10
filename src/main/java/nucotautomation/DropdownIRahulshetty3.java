package nucotautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownIRahulshetty3 
{
static WebDriver d;
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		 d = new ChromeDriver();
		d.get("https://rahulshettyacademy.com/dropdownsPractise/");
		d.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//a[@value='IXG']")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		//d.findElement(By.xpath("(//input[@id='ctl00_mainContent_ddl_originStation1_CTXT'] //a[@value='BLR']) )")).click();


	}

}
