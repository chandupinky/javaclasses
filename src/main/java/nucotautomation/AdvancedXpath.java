package nucotautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdvancedXpath 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.get("https://app.hubspot.com/login");
		d.findElement(RelativeLocator.with(By.xpath("//input[@id='username']")).above(By.xpath("//input[@id='password']"))).sendKeys("Hello@gmail.com");
		Thread.sleep(2000);
		d.findElement(RelativeLocator.with(By.xpath("//input[@id='password']")).below(By.xpath("//input[@id='username']"))).sendKeys("chandu@123");
        Thread.sleep(2000);
        d.findElement(RelativeLocator.with(By.xpath("//span[contains(@class,'UICheckbox__PrivateCheckboxIcon-sc-1gc7bcx-4 hEvUSD private-checkbox__dash')]")).above(By.xpath("//button[@id='loginBtn']"))).click();
        Thread.sleep(2000);
        //d.findElement(RelativeLocator.with(By.xpath("//i18n-string[@data-key='login.signupLink.cta']")).toRightOf(By.xpath("//i18n-string[@data-key='login.signupLink.text']"))).click();
        System.out.println(d.findElement(RelativeLocator.with(By.xpath("//i18n-string[@data-key='login.signupLink.text']")).toLeftOf(By.xpath("//i18n-string[@data-key='login.signupLink.cta']"))).getText());
	}

}
