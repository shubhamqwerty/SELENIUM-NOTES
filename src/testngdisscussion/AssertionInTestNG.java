package testngdisscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
                                                     //HARD ASSERT
public class AssertionInTestNG {
	
	// CHECKPOINT--> WHEN THE PARTICULAR CONDITION DOES NOT MATCH DUE TO WHICH THE TEST CASE  GETS FAILED  SUCH POINTS ARE CALLED AS CHECK POINTS
		// ASSERTION --> THIS IS NOTHING BUT   A CHECK POINT ON THE BASIS OF IT  WE COMPARE THE    ACTUAL  AND THE EXPECTED OUTPUT ARE SAME OR NOT if same then test case passed if not test case failed

@Test
public void urlTest()
{

		
		System.setProperty("webdriver.chrome.driver", "E:\\MY JOB\\automation testing\\CHROME DRIVER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
	
		String url=driver.getCurrentUrl();
		
		boolean ispresent = url.contains("dashboards");// will return true or false if the element is there then true otherwise false // BASED ON THIS WE WILL DECIDE THE TEST CASE IS PASSSED OR FAIL

//first assert method
		
		// to check at this point whether the test case is passed or fail we will apply Assertion
		
		Assert.assertTrue(ispresent, "Test Case is failed please file  bug"); //"ispresent" signifies the boolean condition(i.e dashboard is present or not)  // in return it will  retun whether the test case is pass or fail
		                                                                      //Asert.assertTrue this method will only expect true condition IF NOT TRUE THEN TEST CASE WILL FAIL
		                                                                     //Assert.assertTrue --> this is Hard Assert because if this assertion gets fail then next line won't be executes  it will terminate there itself
		
		System.out.println("ASFHLKDF");// IF ABOVE TEST FAILS THEN THIS LINE WONT BE EXECUTED
		
		
	//INTERVIEW QUESTION--> WHEN THE TEST CASE FAILS WHICH EXCEPTION YOU GET
		//ANS-->  WHEN THE TEST CASE FAILS WE DONT GET ANY EXCEPTION WE GET ASSERTION ERROR
		
		
	}
	
	
	@Test
	public void testCase2()
	{
		String s ="abc";
		
		boolean isequals = s.equals("ABC"); //passes since not equal(assert.false)
		
		Assert.assertFalse(isequals, "Assertion failed please check ! ! !"); //assertfalse will only expect false value if true then test case gets fail
		                                                                    //Assert.assertTrue --> this is Hard Assert because if this assertion gets fail then next line won't be executes  it will terminate there itself
	
		
	System.out.println("last line");// thse line will execute if the above assertion is satisfed
	
	}
	
	@Test
	public void testCase3()
	{
		String s = "abc";
		
		Assert.assertEquals(s, "abc");//passed
	}
	
	
	//Assert.assertEqual is applicable for any data type we can check the expected and the actual output through Assert.assertEqual
	
	//NOTE--> EVERY TEST CASE EXECUTE INDEPENDENTLY IT IS NOT LIKE IF UPPER TRST CASE FAIL THEN BELOW TEST CASE WONT GET EXECUTE AS IN JAVA HERE EVERY TEST CASE IS A INDEPENDENT ENTITY
	
	
	
	
	
	
	
	
	
	

}
