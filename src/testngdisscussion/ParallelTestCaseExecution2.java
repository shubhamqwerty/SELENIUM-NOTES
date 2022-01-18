package testngdisscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.Test;

public class ParallelTestCaseExecution2 //to execute the rest case parallely i.e 3 at a time
{
	//<!--   by writing parallel="methods" in the xml then  methods  in the class will be executed parallely -->

	//we can check in the report in the reports start time of three of them is same i.e epoch time i.e they r executes parallely
	
	
	@Test 
	public void navToOrangeHRM()
	{

		System.setProperty("webdriver.chrome.driver", "E:\\MY JOB\\automation testing\\CHROME DRIVER\\chromedriver.exe");
		
		WebDriver	 driver = new ChromeDriver();
		
driver.get("https://www.orangehrm.com/");
	}
	
	
	@Test 
	public void navToLinkedIn ()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\MY JOB\\automation testing\\CHROME DRIVER\\chromedriver.exe");
		
		WebDriver	 driver = new ChromeDriver();
		 
driver.get("https://www.linkedin.com/");
	}
   

}
