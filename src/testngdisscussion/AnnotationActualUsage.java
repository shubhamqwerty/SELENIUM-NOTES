package testngdisscussion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationActualUsage {

@BeforeSuite	
public void openBrowser() //1st operation
{
	System.out.println("Browser get open");
}
	
	
@AfterSuite	
public void quitBrowser() //last operation
{
	System.out.println("Browser get shutdown");
}
	
@BeforeTest
public void navToUrl() //2nd operation
{
	System.out.println("Navigate to a particular Url");
}
	
@AfterTest
public void backToOriginalToUrl() //last 2nd opration
{
	System.out.println("Navigating back to a original Url");
}
	
	@BeforeClass
	public void loginToApp() //3rd operation
	{
		System.out.println("Logged into the application");
	}
	
	
	@AfterClass
	public void logoff() //last 3rd operation
	{
		System.out.println("Logging off from the application");
	}
	
	@BeforeMethod
	public void navigateToSpecificLocation() //4th operation
	{
	System.out.println("Nav to specific page");	
	}
	
	@AfterMethod
	public void backToOriginalPOsition() //last 4th
	{
	System.out.println("Nav back to original page");	
	}
	
	@Test
	public void testCase() // actual test case
	{
		System.out.println("Actual test case execution");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
