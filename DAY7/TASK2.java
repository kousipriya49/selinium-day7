package DAY7;

import  org.testng.Assert;

import org.testng.annotations.Test;



public class TASK2 {
int a=1,b=2,c=0;
@Test(priority=1)
public void add()
{
	c=a+b;
	Assert.assertEquals(3, c);
	System.out.println("ADDITION"+c);
}
@Test(priority=2)
public void sub()
{
	c=a-b;
	Assert.assertEquals(-1, c);
	System.out.println("SUBT"+c);
}
@Test(priority=3)
public void mul()
{
	c=a*b;
	Assert.assertEquals(2, c);
	System.out.println("MUL"+c);
}
@Test(priority=4)
public void div()
{
	c=a/b;
	Assert.assertEquals(0, c);
	System.out.println("DIV"+c);
}
}
