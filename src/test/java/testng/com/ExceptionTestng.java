package testng.com;

import org.testng.annotations.Test;

public class ExceptionTestng 
{
@Test(expectedExceptions= {Exception.class})
public void shridhar()
{
System.out.println("hi shirdhar");
int a=10/0;
System.out.println("how r u shridhar");
}
//@Test
//public void ram()
//{
//	System.out.println("hi ram");
//	System.out.println("how r u ram");
//}
}
