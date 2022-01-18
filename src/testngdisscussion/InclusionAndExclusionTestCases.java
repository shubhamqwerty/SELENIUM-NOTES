package testngdisscussion;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class InclusionAndExclusionTestCases {
	
	@BeforeSuite	// this will be executed irrspective whether included or excluded since these are annotation and not the test cases
	public void beforeSuite() //1st operation
	{
		System.out.println("Before suite Annotation");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class annotation");
	}
	
	
	
	
	@Test(priority =1)
	public void login()
	{
		System.out.println("Login Test case");
		
	}
	
	
	@Test(priority =2) 
	public void logoff()                               
	{
		System.out.println("Logoff test case");
	}

	@Test(priority =3) 
	public void home()                               
	{
		System.out.println("home test case");
	}

	@Test(priority =4) 
	public void profile()                               
	{
		System.out.println("profile test case");
	}

	
	//NOTE-->include and exclude will only consider the test cases and not the annotations
	// WHEN WE WRITE THE INCLUDE IN THE XML FILE AT SUCH TIME ONLY THAT PARTICULAR TEST CASE WILL GET EXECUTED AND ALONG WITH IT ANNOTATION WILL ALSO BE EXECUTED
	// WHEN WE WRITE THE EXCLUDE INTHE XML FILE AT SUCH TIME THAT PARTICULAR METHOD WILL NOT BE EXECUTED REST WILL BE EXECUTED AND ANNOTATION WILL BE EXECUTED 
	//NOTE--> WHEN WE WRITE THE INCLUDE AND EXCLUDE BOTH AT ONCE AT SUCH TIMES THE COMMON METHOD BETWEEN THE 2 WILL BE EXECUTED BUT WE DON'T WRITE INCLUDE EXCLUDE AT ONCE IT WILL BE ILLOGICAL 
	

	//NOTE--> INCLUDE AND EXCLUDE ARE TAGS IN THE XML THROUGH WE GET THE SPECIAL FUNCTIONALITY INSIDE THE CLASS  

// NOTE--> XML PROVIDES THE CONTROLLING BEHAVIOUR TO THE TESTNG(HOW AND WHEN TO EXECUTE THE FILE)
	
	// CHECKPOINT--> WHEN THE PARTICULAR CONDITION DOES NOT MATCH DUE TO WHICH THE TEST CASE  GETS FAILED  SUCH POINTS ARE CALLED AS CHECK POINTS
	// ASSERTION --> THIS IS NOTHING BUT   A CHECK POINT WHICH WE INCLUDE IN THE TEST CASE TO CHECK WHETHER THE   ACTUAL  AND THE EXPECTED OUTPUT ARE SAME OR NOT




















}