package testngdisscussion;

import org.testng.annotations.Test;

public class Priority { //Priority--> to decide which test case should execute 1st
	
	//AUTOMATION TEST CASE PRIORITY IS DECIDED ON THE BASIS OF FLOW
	
	
	@Test   (priority = 1)   
	public void loginTest()
	{
		System.out.println("LOGIN Test Case");
	}
	
	@Test (priority = 2) 
	public void home()
	{
		System.out.println("HOME test case");
	}
    @Test (priority = 3) 
	public void dashBoard() 
	{
		System.out.println("DASHBOARD test case");
	}
	
    @Test (priority = 3) 
   	public void jammu() 
   	{
   		System.out.println("JAMMU test case");
   	}
    
    
    
    @Test (priority = -200)  /// NOT NECESSARY TO HAVE THE INTERMIDIARE NUMBERS IT WILL EXECUTE ACCORDINGLY (NOT NECESARRY TO BE I SERIES)
   	public void logOut() 
   	{
   		System.out.println("LOGOUT test case");
   	}
	
	
     @Test 
 	public void profile() 
 	{
 		System.out.println("PROFILE test case");
 	}
    
     
   //  @Test (priority= 1.3)// ERROR SINCE DECIMAL PRORITY IS NOT ALOWED
  	public void bad() 
  	{
  		System.out.println("BAD test case");
  	}
     
    
	//NOTE-->A TESTCASE CAN HAVE +VE , -VE ,0 AS A PRIORITY BUT WE CANNOT BE IN DECIMAL(SHOWS ERROR) 
    // DUPLICATE PRIORITY OF TEST CASE IS ALLOWED BUT THE EXECUTION IS DONE ON THE BASISS OF DICTIONARY ORDER FOR THOSE DUPLICATED PROIRITY CONTAINING TEST CASE 
    
	// NOTE--> IF WE DONT DEFINE THE PRIORITY THEN BY DEFAULT THE PRORITY WILL BE 0
	
  	
  	//INT QUESTION   CAN PRIORITY BE DUPLICATE--> YES WE CAN HAVE DUPLICATE PRIORITY
	
	
	

}
