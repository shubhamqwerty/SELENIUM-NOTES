package testngdisscussion;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass1 {   // TO EXECUTE MULTIPLE CLASSES ONE BY ONE  FOE THIS WE MAKE THE XML FILE IN WHICH WE DECIDE THE ORDER OF EXECUTION OF THE CLASSES THEN WE CAN EXECUTE THAT XML WHICH WILL EXECUTE ALL THE TEST CLASSES
	
	@Test      
	public void loginWithCorrectCredentials()                                         
	{                                                                
		//System.out.println("LOGIN Test Case");
		
		Reporter.log("login With Correct Credentials test case", false);  
	}
	
	@Test 
	public void  loginWithIncorrectCredentials()
	{
	//	System.out.println("HOME test case");
		
		Reporter.log("login With Incorrect Credentials test case", true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
