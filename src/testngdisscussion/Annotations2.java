package testngdisscussion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 {// EVERY TIME ASKED IN INTERVIEW
	
	// IT IS THE FUNTIONALITY AVAILABLE IN TESTNG TO EXECUTE PRE AND POST CONDITIONS FOR A TEST CASE
	
	@BeforeTest // will be executed before the classes(to be executed) mention in xml  file // will be executed any how irrrspective in which classs it is written // can be written in any classes it will get executed
	public void beforeTest() 
	{
		System.out.println("before test annotation from class 2");
	}
	
	
	
	
	
	
	@BeforeClass // will be executed before the execution of anything available in the existing class
	public void beforeClass()
	{
	System.out.println("Before class annottion CLASS 2");	
	}
	
	@BeforeMethod //TO EXECUTE before EVERY TESTCASE
	public void beforeMethod() // THIS WONT BE CONSIDERED IN THE TEST REPORT NOR IN THE CONSOLE SINCE IT IS NOT THE TEST CASE IT THE PRE CONDITION FOR THE PARTICULAR TEST CASE
	{
		System.out.println("Before Method CLASS 2");
	}
	
   @Test  //---> this is a annotation AND IT IS THE TEST CASE
	public void testCase3()
	{
	System.out.println(" TESTCASE 3");
	}
	
   @Test  //---> this is a annotation AND IT IS THE TEST CASE AND IT WILL BE CONSIDERED IN THE TEST REPORT
  	public void testCase4()
  	{
  	System.out.println("TESTCASE 4");
  	}
   
   
	
    @AfterMethod //TO EXECUTE after EVERY TESTCASE
	public void afterMethod()  // THIS WONT BE CONSIDERED IN THE TEST REPORT NOR IN THE CONSOLE SINCE IT IS NOT THE TEST CASE IT THE POST CONDITION FOR THE PARTICULAR TEST CASE
	{
		System.out.println("After Method CLASS 2");
	}
	
	
    @AfterClass // will be executed after the execution of anything available in the existing class
	public void afterClass()
	{
	System.out.println("After class annottion CLASS 2 ");	
	}
    
    
    @AfterTest // // will be executed after the classes mention in xml  file
	public void afterTest() 
	{
		System.out.println("after test annotation from class 2");
	}
    
    
    
 //    
    
    
    
//NOTE---> ANNOTATIONS DEFINED IN ANY ORDER WILL EXECUTE ACCORDING TO THE NAKE ORDER IS NOT NECESSARY    
    
//NOTE ---> BEFOREMETHOD AND AFTERMETHOD PLAYS A ROLE OF THE SANDWHICH FOR EACH TESTCASE	

}
