package testngdisscussion;

import org.testng.annotations.Test;

public class GroupingOfTestCases2 {

	@Test(groups = "Regression",priority=1)
	public void editProfile()
	{
		System.out.println("Edit profile Test case");
    
	}
	
	@Test(groups = "Sanity",priority=2)
	public void viewProfile()
	{
		System.out.println("view profile Test case ");
	
	}
	
	@Test(groups = "Regression",priority=3)
	public void myInfo()
	{
		System.out.println("my info test case");
	}
	
	@Test(groups = "functional",priority=4)
	public void timeline()                                
	{
		System.out.println("time line test case");
	}
	
	@Test(groups = "funtional",priority=5)
	public void uploadImage()                                
	{
		System.out.println("uploadImage test case");
	}
	
	
	@Test(groups = "functional",priority=6)
	public void profile()                                
	{
		System.out.println("Profie Accessibility Test Case");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
