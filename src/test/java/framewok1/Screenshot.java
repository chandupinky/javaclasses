package framewok1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshot 
{
WebDriver d;
@Test
public void screenshot() throws IOException
{
	d = new ChromeDriver();
	d.manage().deleteAllCookies();
	d.manage().window().maximize();
	d.get("https://www.facebook.com/");
   TakesScreenshot ts = (TakesScreenshot)d;
  File f= ts.getScreenshotAs(OutputType.FILE);
  FileUtils.copyFile(f, new File("./screenshots/image1.png"));
  d.close();
}
}
