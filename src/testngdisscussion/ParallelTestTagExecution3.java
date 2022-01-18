package testngdisscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.Test;

public class ParallelTestTagExecution3
{
	//<!--   by writing parallel="class" in the xml then the classes will be executed parallely -->

	//we can check in the report in the reports start time of three of them is same i.e epoch time i.e they r executes parallely
	
	
	@Test 
	public void navToFlipkart()
	{

		System.out.println("navigating to Flipkart");
	}
	
	
	@Test
	public void dashboard()
	{
		System.out.println("dashboard Test Case");
	}
	
	
	
	//NOTE -->IN PARALLEL CLASS EXECUTION EPOCH TIME (UTC) OF 1ST TEST CASES OF BOTH THE CLASS ARE SAME REST TEST CSASE TIME WILL HAVE DIFFERENT TIME
	//NOTE --> THREAD COUNT WIL EASE OUT THE PARALLEL EXECUTION OG METHOD AND CLASSES
}
	