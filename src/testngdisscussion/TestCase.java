package testngdisscussion;

import org.testng.annotations.Test;

public class TestCase {
	
	
	@Test // to assume it as a test case while execution we will have to write "@Test"      
	public void loginTest()
	{
		System.out.println("Login Test Case");
	}
	
	@Test
	public void home()
	{
		System.out.println("home test case");
	}
    @Test
	public void a() 
	{
		System.out.println("A test case");
	}
	
}
