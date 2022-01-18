package testngdisscussion;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledKeyword {
	
	
	//EnabledKeyword --> used when we don't have to execute the particular test case
	
	@Test   (priority = 1 , enabled = false)    // this testcase wont be executed(will not be considered in execution) since we added the enabled keyword
	public void loginTest()                                          //syntax for enabled is "enabled= false"  this will not consider the test case for execution
	{                                                                //"enabled=true" this will always consider the test case for execution
		//System.out.println("LOGIN Test Case");
		
		Reporter.log("LOGIN test case", true);  //TO PRONT MESSAGE INSIDE THE REPORT and in the console // booleann condition if kept "false" then it wont print in the report
	}
	
	@Test (priority = 2 , enabled = true) 
	public void home()
	{
	//	System.out.println("HOME test case");
		
		Reporter.log("HOME test case", true);
	}
	
	
    @Test (priority = 3) 
	public void dashBoard() 
	{
	//	System.out.println("DASHBOARD test case");
		
		Reporter.log("DASHBOARD test case", true);
	}
	
   
    
    @Test (priority = -200)  /// NOT NECESSARY TO HAVE THE INTERMIDIARE NUMBERS IT WILL EXECUTE ACCORDINGLY (NOT NECESARRY TO BE I SERIES)
   	public void logOut() 
   	{
   //		System.out.println("LOGOUT test case");
   		
   		Reporter.log("LOGUT test case", true);
   	}
	
	
     @Test 
 	public void profile() 
 	{
 		//System.out.println("PROFILE test case");
 		
 	Reporter.log("profile test case", true);     //TO PRONT MESSAGE INSIDE THE REPORT and in the console // booleann condition if kept "false" then it wont print in the report
 	}
    
                                    
     //TO PRONT MESSAGE INSIDE THE REPORT and in the console--> through this we use "Reporer.log"
  
	
	
	
	
	

}
