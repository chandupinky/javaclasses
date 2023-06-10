package framewok1;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Swaglabs extends BaseCommonTestrun
{   @Parameters({"uname","pwd"})
	@Test(priority=1)
	public void login(String uname,String pwd) throws InterruptedException
	{
		d.findElement(By.id("user-name")).sendKeys(uname);
		Thread.sleep(1000);
		d.findElement(By.id("password")).sendKeys(pwd);
		Thread.sleep(1000);
		d.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
	}
@Test(priority=2)
public void gettitle()
{
	String s=d.getTitle();
	System.out.println(s);
}

	
}
