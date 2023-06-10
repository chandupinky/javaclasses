package nucotautomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewXpath
{

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriverManager.chromedriver().setup();
	WebDriver d = new ChromeDriver();
//	d.get("https://app.hubspot.com/login");
//	Thread.sleep(2000);
//	d.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("chandu@gmail.com");
//	Thread.sleep(2000);
//	d.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("chandu123");
//	Thread.sleep(2000);
//	d.findElement(By.xpath("//span[contains(@class,'UICheckbox__PrivateCheckboxIcon-sc-1gc7bcx-4 hEvUSD private-checkbox__dash')]")).click();
//	Thread.sleep(2000);
//	d.findElement(By.xpath("//button[contains(@id,'loginBtn')]")).click();
//	WebDriverWait  w = new WebDriverWait(d, Duration.ofSeconds(3));
//	w.until(ExpectedConditions.elementToBeClickable(By.xpath("//h5[contains(@class,'private-alert')]")));
//	System.out.println(d.findElement(By.xpath("//h5[contains(@class,'private-alert')]")).getText());



	}

}
