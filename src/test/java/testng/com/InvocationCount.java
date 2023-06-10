package testng.com;

import org.testng.annotations.Test;

public class InvocationCount  
{
	@Test(invocationCount=5,priority=1)
 public void sridhar()
 {
System.out.println("Hi shridhar");	 
 }
	@Test(invocationCount=3,priority=3)
 public void chandu()
 {
	 System.out.println("Hi chandu");
 }
	@Test(invocationCount=2,priority=2)
 public void shivu()
 {
	 System.out.println("Hi shivu");
 }
}
