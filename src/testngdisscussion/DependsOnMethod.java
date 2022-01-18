package testngdisscussion;


import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {

@Test(priority =1)
public void login()
{
	System.out.println("Login Test case");
	//Assert.fail();//used to deliberately fail the test case
	// will be  
	
}
	
	
//@Test(priority =2, dependsOnMethods = "login") // "dependsOnMethod" specify that the this method execution depends on another method that means  depending on the status of previous test case, the execution of current test case will be decided
//public void dashBoardTest() // dashBoardTest depends on login(i.e login one k bad hi dashboard aayega) 
//{
//	System.out.println("Dashboard Test ");
//	Assert.fail();
//	
//	
//}
//
//
//@Test(priority=3, dependsOnMethods = "dashBoardTest")
//public void checkBox()
//{
//	System.out.println("checkbox test");
//}


@Test(priority =4,dependsOnMethods = "login") //dependsOnMethods = "dashBoardTest" --->means agar "dashBoardTest" chaleha to hi ye method chalegi //  dependsOnMethods = {"dashBoardTest", "login"}  iska matlab k this test case depends on  "dashBoardTest", "login" TEST CASE, this test case will execute if and only if both the test cases i.e dashboardTest,login gets passed otherwise if any of them fails then the current test case will be skipped
public void logoff()                                // THESE METHOD WILL BE SKIPPED SINCE THEY ARE DEPENDENT ON OTHER METHOD AND THST METHOD IS FAILED SO IT WILL BE CONSIDERED AS SKIPPED TEST CASES
{
	System.out.println("Logoff from application");
}




	
//@Test(priority =4,dependsOnMethods = {"dashBoardTest", "login"}) //dependsOnMethods = "dashBoardTest" --->means agar "dashBoardTest" chaleha to hi ye method chalegi //  dependsOnMethods = {"dashBoardTest", "login"}  iska matlab k this test case depends on  "dashBoardTest", "login" TEST CASE, this test case will execute if and only if both the test cases i.e dashboardTest,login gets passed otherwise if any of them fails then the current test case will be skipped
//public void logoff()                                // THESE METHOD WILL BE SKIPPED SINCE THEY ARE DEPENDENT ON OTHER METHOD AND THST METHOD IS FAILED SO IT WILL BE CONSIDERED AS SKIPPED TEST CASES
//{
//	System.out.println("Logoff from application");
//}
		
//DIFFERENCE BETWEEN ENABLED=FAIL, ASSERT.FAIL
//ENABLED=FAIL --> TEST CASE WITH THIS TAG WILL NOT BE CONSIDDERED FOR EXECUTION(I.E. WILL BE CONSIDERED AS COMMENTED) AND THERE WILL NOT BE ANY TRACES OF THE TEST CASE LIKE SKIPPED, FAIL IN THE CONSOLE
// ASSERT.FAIL --> THIS TAG IN THE TEST CASE WILL DELIBERATELY FAIL THE TEST CASE AND THERE WILL BE THE REFRENCE OF THE FAILED TEST CASE IN THE CONSOLE	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
