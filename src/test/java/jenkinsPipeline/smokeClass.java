package jenkinsPipeline;

import org.testng.annotations.Test;

public class smokeClass {

	@Test(groups="smoke")
	public void test1()
	{
		System.out.println("test1 executed");
	}
	
	@Test(groups="smoke")
	public void test2()
	{
		System.out.println("test2 executed");
	}
	
	@Test(groups="smoke")
	public void test3()
	{
		System.out.println("test3 executed");
	}
}
