package testng.com;

import org.testng.annotations.Test;

public class Chainlink 
{
	@Test(priority=1)
public void google()
{
	System.out.println("hi google");
}
	@Test(priority=2)
public void login()
{
		google();
	System.out.println("loginpage opened");
}
	@Test(priority=3)
public void homepage()
{
		google();
		login();
	System.out.println("homepage opened");
}
	@Test(priority=4)
public void productlist()
{
		google();
		login();
		homepage();
		
	System.out.println("product list displayed");
}
	@Test(priority=5)
public void addtocartpage()
{
		google();
		login();
		homepage();
		productlist();
	System.out.println("click on addto cart button");
}
}
