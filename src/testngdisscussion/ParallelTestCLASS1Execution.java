package testngdisscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.Test;

public class ParallelTestCLASS1Execution
{
	//<!--   by writing parallel="class" in the xml at test tag level then the classes will be executed parallely -->

	//we can check in the report in the reports start time of three of them is same i.e epoch time i.e they r executes parallely
	
	
	@Test 
	public void navToGoogle()
	{

		System.setProperty("webdriver.chrome.driver", "E:\\MY JOB\\automation testing\\CHROME DRIVER\\chromedriver.exe");
		
		WebDriver	 driver = new ChromeDriver();
		
driver.get("https://www.google.com/");
	}
	
	
	@Test
	public void profile()
	{
		System.out.println("Profile Test Case");
	}
	
	
	
	//NOTE -->IN PARALLEL CLASS EXECUTION EPOCH TIME (UTC) OF 1ST TEST CASES OF BOTH THE CLASS ARE SAME REST TEST CSASE TIME WILL HAVE DIFFERENT TIME
	//NOTE --> THREAD COUNT WIL EASE OUT THE PARALLEL EXECUTION OG METHOD AND CLASSES
}
	