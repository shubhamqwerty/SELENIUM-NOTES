package testclasses;

import org.testng.annotations.Test;

import extentListeners.Listeners;

public class DashBoardTest extends Listeners {

	@Test(priority=3)
	public void selectShare()
	{
		test.info("searchshare"); 
		
	  db.searchShare();	
	}
	
	@Test(priority=4)
	public void buyShare()
    {
    	db.buyShare();
    }
	
	
	
	
	
}
