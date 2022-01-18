package testngdisscussion;

import org.testng.annotations.Test;

public class GroupingOfTestCases {

	@Test(groups = "Sanity", priority=1)
	public void login()
	{
		System.out.println("Login Test case");
    
	}
	
	@Test(groups = "Regression",priority=2)
	public void dashBoardTest()
	{
		System.out.println("Dashboard Test ");
	
	}
	
	@Test(groups = "Regression",priority=3)
	public void checkBox()
	{
		System.out.println("checkbox test");
	}
	
	@Test(groups = "Sanity",priority=4,dependsOnMethods = "checkBox") // this is logically invalid since when we mention the particular test cases to get execute but that case depends on another type of testcase this is invalid logic  and it will have unpredictable output
	public void logoff()                                
	{
		System.out.println("Logoff from application");
	}
	
	@Test(groups = "Sanity",priority=5)
	public void home()                                
	{
		System.out.println("home test case");
	}
	
	
	@Test(groups = "functional",priority=6)
	public void profile()                                
	{
		System.out.println("Profie Accessibility Test Case");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
