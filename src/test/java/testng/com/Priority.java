package testng.com;

import org.testng.annotations.Test;

public class Priority 
{
	@Test(priority = 5)
public void a()
{
	System.err.println("this is a method");
}
	@Test(priority = 3)
public void b()
{
	System.err.println("this is b method");
}
	@Test(priority = 1)
public void c()
{
	System.err.println("this is c method");
}
	@Test(priority = 2)
public void d()
{
	System.err.println("this is d method");
}
	@Test(priority = 4)
public void e()
{
	System.err.println("this is e method");
}
}
