package testngdisscussion;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDisc {
	
	
	@Test
	public void testCase1()
	{
		Reporter.log("First Line", true);
		
		SoftAssert sa = new SoftAssert ();
		
		sa.assertEquals(true, false); //false
		
		Reporter.log("First line", true); // this line will also  get executed since we have use the soft assert
		
		sa.assertAll(); // assert.All--> this method will decide the  actual status of the  test case whether the  test case is fail or passed if not written the ststus of test cae will not be mark and it becomes pass
		
	}
	
	
	
	@Test
	public void testCase2()
	{
		Reporter.log("First Line", true);
		
		SoftAssert sa = new SoftAssert ();
		
		sa.assertTrue(true, "Test case failed"); //true
		
		Reporter.log("2nd line", true); 
		
	sa.assertEquals("abc", "abc");// not equal so testcase will fail
	
	Reporter.log("3rd Line", true);
		
		sa.assertAll(); //if not calles then it will show the status of tesr case as passed
		
	}
	
	
// interview question--  HOW WILL EXECUTE ONLY THOSE TEST CASES WHICH GOT FAILED	
	// WE HAVE TEST OUTPUT FOLDER IN THAT WE HAVE  testng-failed.xml file through thid we can excute failed test case
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
