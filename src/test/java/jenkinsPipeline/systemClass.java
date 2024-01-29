package jenkinsPipeline;

import org.testng.annotations.Test;

public class systemClass {

	@Test(groups="system")
	public void test1()
	{
		System.out.println("test1 executed");
	}
	
	@Test(groups="system")
	public void test2()
	{
		System.out.println("test2 executed");
	}
	
	@Test(groups="system")
	public void test3()
	{
		System.out.println("test3 executed");
	}
}
