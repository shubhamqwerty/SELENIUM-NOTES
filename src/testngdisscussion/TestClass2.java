package testngdisscussion;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass2 { // TO EXECUTE MULTIPLE CLASSES ONE BY ONE  FOE THIS WE MAKE THE XML FILE IN WHICH WE DECIDE THE ORDER OF EXECUTION OF THE CLASSES
	
	
    @Test
	public void urlValidation()
	{
	//	System.out.println("HOME test case");
		
		Reporter.log("url  Validation of home page", true);
	}
	@Test
	public void profileSection()
	{
	//	System.out.println("HOME test case");
		
		Reporter.log("profile Section of home page", true);
	}
	
	
	
	
	
	
	
}
