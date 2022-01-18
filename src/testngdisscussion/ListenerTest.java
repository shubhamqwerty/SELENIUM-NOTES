package testngdisscussion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenerTest {
	
	
	@Test (priority=1)
	public void loginTest()
	{
		System.out.println("Login Test Case");
		
		Assert.assertEquals(true, false);
	}
	
	@Test(priority=2, dependsOnMethods = "loginTest")
	public void home()
	{
		System.out.println("home test case");
	}
    @Test(priority=3)
	public void a() 
	{
		System.out.println("A test case");
	}
	
	
	
	
	
	
	

}
