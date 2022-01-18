package testngdisscussion;


import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod2 {

// if the test case depends on the test case of another class at such time we have to give entire adreess like "packagename.classname.methodname"
	
	
@Test(priority =100, dependsOnMethods = "testngdisscussion.DependsOnMethod.login") 
public void dashBoardTest() 
{	 

	System.out.println("Dashboard Test ");
	Assert.fail();
	
}


@Test(priority=200, dependsOnMethods = "dashBoardTest")
public void checkBox()
{
	System.out.println("checkbox test");
}


	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
