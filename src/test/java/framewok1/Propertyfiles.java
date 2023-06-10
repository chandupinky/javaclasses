package framewok1;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Propertyfiles 
{
public static WebDriver d;
public static Properties prop;
public WebDriver launch(Properties prop)
{
	String browse=prop.getProperty("browser");
	if (browse.equalsIgnoreCase("chrome"))
	{
	 d = new ChromeDriver();	
	}
	else if (browse.equalsIgnoreCase("firefox")) 
	{
	d = new FirefoxDriver();	
	}
	WebDriverManager.chromedriver().setup();
	d.manage().deleteAllCookies();
	d.manage().window().maximize();
	String u = prop.getProperty("url");
	d.get(u);
	return d;
}
//public void credentials()
//{
//	d.findElement(By.id("email")).sendKeys(username);
//	d.findElement(By.id("pass")).sendKeys(pwd);
//	d.findElement(By.name("login")).click();
//}

public Properties property() throws IOException
{
	prop = new Properties();
	
		FileInputStream f = new FileInputStream("./src/test/java/framewok1/propertydata.properties");
			prop.load(f);
	    

	return prop;
	
}
public static void main(String[] args) throws IOException 
{
	Propertyfiles pf = new Propertyfiles();
	pf.launch(prop);
	pf.property();
}
}
//