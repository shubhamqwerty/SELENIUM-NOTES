package testngdisscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionUsage {
	
	@Test
	public void validateErrorMessage()
	{
		
System.setProperty("webdriver.chrome.driver", "E:\\MY JOB\\automation testing\\CHROME DRIVER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("asfbgfn");
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		

		
		
		WebElement message = driver.findElement(By.xpath("//*[contains(@id,'spanMessage')]"));
		
		// TO GET THE THE TEXT FROM THE WEBPAGE WE MAKE USE OF "GETTEXT" METHOD
		
	String messageString = message.getText();

		
		System.out.println("get text from the webpage :"+messageString);
		
//		if(messageString.equals("Invalid credentials"))
//		{
//			System.out.println("Test Case Passed");
//		}
//		else
//		{
//			System.out.println("Test Case failed please find issue");
//		}
		
		
//NOTE - REPLACING THE IF ELSE WITH ASSERT	alternate to if else	
		
		String excpectedmessage = "Invalid credentials";
		
		
	Assert.assertEquals(messageString, excpectedmessage);	//here if the message in  "messageString" matches with the  "excpectedmessage" then test case will be passed if not then fail 
		
//NOTE --> THROUGH Assert.assertEqual we can validat any data type		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
