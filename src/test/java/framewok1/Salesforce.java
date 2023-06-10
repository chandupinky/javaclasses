package framewok1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Salesforce extends BaseCommonTestrun
{
	@Parameters({"uname","pwd"})
	@Test(priority=1)
public void login(String uname,String pwd) throws InterruptedException
{
	d.findElement(By.id("username")).sendKeys(uname);
	Thread.sleep(1000);
	d.findElement(By.id("password")).sendKeys(pwd);
	Thread.sleep(1000);
	d.findElement(By.id("Login")).click();
	Thread.sleep(3000);
}
	@Test(priority=2)
	public void gettitle()
	{
		String expected=d.getTitle();
		String actual="Login | Salesforce";
		Assert.assertEquals(actual, expected);
	}
}
