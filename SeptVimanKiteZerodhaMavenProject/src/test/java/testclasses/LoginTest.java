package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import extentListeners.Listeners;

public class LoginTest extends Listeners //sice listeners extends basetest so login will also have acces of base test // here base test will will be out of package class since login extends listenrs and listenrs extends basetest

{
	
	
	@Test(priority=1)     // priority=1 because this method should get executed 1st as per flow without prrority it execure according to alpjabetical order
	public void loginToApp()
	{
		test.info("entering credentials");// these logs are entered on the basis of extent report //this logs will be visible in the report //"info" method is used to generate log in the report
		
		lp.loginWithCredentials(); // THIS IS THE EXAMPLE OF ABSTRATION SINCE WE DON'T THE INTERNAL FUNCTIONALITY  BUT WE HAVE THE services ---> scenario of encapsulation
	
		test.info("credentials entered");// these logs are entered on the basis of extent report
		
		lp.enterPin();
		
		test.info("pin entered");  // these logs are entered on the basis of extent report
	}
	
	@Test(priority=2)
	public void validatePage()
	{
		boolean returnvalue = lp.verifyUrl();
		
		Assert.assertTrue(returnvalue); //assertion r applied on the basis return value to cross check it
	}
	
	//NOTE--> ASSERTION ARE ALWAYS APPLIED IN THE TEST CLASS ...FIRSTLY RETURNING THE VALUE FRON THE PAGE CLASS THEN APPLYING THE ASSERTION
}


//INTERVIEW QUESTION --> WHERE YOU HAVE USED MULTILEVEL INHERITANCE -->TEST CLASS EXTENDS THE LISTENERS AND LISTENER EXTNDS THE BASETEST CLASS(OBJECT REPOSITORY)