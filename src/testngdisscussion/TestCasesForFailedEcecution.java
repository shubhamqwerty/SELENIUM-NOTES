 package testngdisscussion;

import org.testng.annotations.Test;

public class TestCasesForFailedEcecution {
	
	
	@Test (dependsOnMethods = "testngdisscussion.SoftAssertDisc.testCase1")
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
//INTER VIEW QUESTION --> HOW WIL U EXECUTE THE SKIP TEST CASES
// ANS--> TO EXECUTE THE SKIPPED TEST CASESS WE WILL EXCEUTE THE testng-failed.xml file