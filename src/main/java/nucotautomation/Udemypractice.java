package nucotautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Udemypractice 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver d = new FirefoxDriver();
		d.get("https://www.rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("chandu");
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("chandu@123");
		Thread.sleep(2000);
		d.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		Thread.sleep(2000);
		String g = d.findElement(By.xpath("//p[@class='error']")).getText();
		System.out.println(g);
		Thread.sleep(2000);
		d.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("chandu");
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("chandu@gmail.com");
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9982562669");
		Thread.sleep(2000);
		d.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		Thread.sleep(2000);
		System.out.println(d.findElement(By.xpath("//p[@class='infoMsg']")).getText());
		Thread.sleep(2000);
		d.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("chandu");
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("rahulshettyacademy");
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@id='chkboxTwo']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		Thread.sleep(2000);
		System.out.println(d.getTitle());
		d.close();



	}

}
