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

public class Annotations {// EVERY TIME ASKED IN INTERVIEW
	
	// IT IS THE FUNTIONALITY AVAILABLE IN TESTNG TO EXECUTE PRE AND POST CONDITIONS FOR A TEST CASE
	
	@BeforeSuite //WILL BE EXECUTED BEFORE THE SUITE TAG MENTION IN  XML FILE
	public void beforeSuite()
	{
	System.out.println("Before suit method");	
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After suite method");
	}
	
	@BeforeTest // will be executed before the classes(to be executed) mention in xml  file // will be executed any how irrrspective in which classs it is written // can be written in any classes it will get executed
	public void beforeTest() ////i.e will be executed b4 the test tag mentioned 9n the xml file
	{
		System.out.println("before test annotation from class 1");
	}
	
	
	@BeforeClass // will be executed before the execution of anything available in the existing class
	public void beforeClass()
	{
	System.out.println("Before class annottion 1");	
	}
	
	@BeforeMethod //TO EXECUTE before EVERY TESTCASE
	public void beforeMethod() // THIS WONT BE CONSIDERED IN THE TEST REPORT NOR IN THE CONSOLE SINCE IT IS NOT THE TEST CASE IT THE PRE CONDITION FOR THE PARTICULAR TEST CASE
	{
		System.out.println("Before Method 1");
	}
	
   @Test  //---> this is a annotation AND IT IS THE TEST CASE
	public void testCase1()
	{
	System.out.println(" TESTCASE 1");
	}
	
   @Test  //---> this is a annotation AND IT IS THE TEST CASE AND IT WILL BE CONSIDERED IN THE TEST REPORT
  	public void testCase2()
  	{
  	System.out.println("TESTCASE 2");
  	}
   
   
	
    @AfterMethod //TO EXECUTE after EVERY TESTCASE
	public void afterMethod()  // THIS WONT BE CONSIDERED IN THE TEST REPORT NOR IN THE CONSOLE SINCE IT IS NOT THE TEST CASE IT THE POST CONDITION FOR THE PARTICULAR TEST CASE
	{
		System.out.println("After Method  1");
	}
	
	
    @AfterClass // will be executed after the execution of anything available in the existing class
	public void afterClass()
	{
	System.out.println("After class annottion  1");	
	}
    
    
    @AfterTest // // will be executed after the classes mention in xml  file //i.e will be executed after the test tag mentioned 9n the xml file
   	public void afterTest() 
   	{
   		System.out.println("after test annotation from class 1");
   	}
       
    
    
  // interview question --> what are the sequene of annotationd  
   // interview question ---> after class and after test  difference
    // after class --> when the activiy of the  entire class is completed at such time  after class is executed
    //after test ---> when the  activity of the test tag(i.e. after the execution of all the classes) is completed at such time after test is executed
    
    
//NOTE---> ANNOTATIONS DEFINED IN ANY ORDER WILL EXECUTE ACCORDING TO THE NAKE ORDER IS NOT NECESSARY    
    
//NOTE ---> BEFOREMETHOD AND AFTERMETHOD PLAYS A ROLE OF THE SANDWHICH FOR EACH TESTCASE	

}
