package pomtest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	
	
	@Test(priority=1)     // priority=1 because this method should get executed 1st as per flow without prrority it execure according to alpjabetical order
	public void loginToApp()
	{
		lp.loginWithCredentials(); // THIS IS THE EXAMPLE OF ABSTRATION SINCE WE DON'T THE INTERNAL FUNCTIONALITY  BUT WE HAVE THE services ---> scenario of encapsulation
		lp.enterPin();
	}
	
	@Test(priority=2)
	public void validatePage()
	{
		boolean returnvalue = lp.verifyUrl();
		
		Assert.assertTrue(returnvalue); //assertion r applied on the basis return value to cross check it
	}
	
	//NOTE--> ASSERTION ARE ALWAYS APPLIED IN THE TEST CLASS ...FIRSTLY RETURNING THE VALUE FRON THE PAGE CLASS THEN APPLYING THE ASSERTION
}
