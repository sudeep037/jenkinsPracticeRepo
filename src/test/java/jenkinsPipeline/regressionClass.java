package jenkinsPipeline;

import org.testng.annotations.Test;

public class regressionClass {

	@Test(groups="regression")
	public void test1()
	{
		System.out.println("test1 executed");
	}
	
	@Test(groups="regression")
	public void test2()
	{
		System.out.println("test2 executed");
	}
	
	@Test(groups="regression")
	public void test3()
	{
		System.out.println("test3 executed");
	}
}
