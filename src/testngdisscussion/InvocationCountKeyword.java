package testngdisscussion;

import org.testng.annotations.Test;

public class InvocationCountKeyword {
	
	//InvocationCountKeyword--> USED WHE WE HAVE TO EXECUTE THE PARTICULAR TeSTCASE MULTIPLE TIMES
	
	@Test(priority = 1, invocationCount=5)// two keyword can be written atonce by passing comma between them
	public void testCase1()
	{
		System.out.println("Test Case one");
	}
	
//interview question --> I HAVE 100 TEST CASES IN THAT I HAVE TO EXECUTE 96 AND 29 10 TIMES WHAT WILL BE YOUR APPROACH	
	//ANS --> IN FRONT OF TEST CASE NO 96 AND 29 I  WILL WRITE INVOCATIONCOUNT = 10
	
	
//NOTE--> DEFAULT invocationCount is 1	
	
	
	
	
	
	

}
