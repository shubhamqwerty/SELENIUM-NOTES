package testngdisscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenerTest2 {
	
	
	static WebDriver driver; // declared static sothat it get destroyed at the time of class unloading
	                        // if declared non static garbage collcter will destroy it immediately after execution
	
	
	@Test (priority=1)
	public void loginTest()
	{
System.setProperty("webdriver.chrome.driver", "E:\\MY JOB\\automation testing\\CHROME DRIVER\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Addmin");
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
	
		
WebElement message = driver.findElement(By.xpath("//*[contains(@id,'spanMessage')]"));
		
		
		
	String messageString = message.getText();

		
		System.out.println(messageString);
		
		String expected ="Invalid Credentiials"; // delibrateely wrong so that we should get the screen shotof failed test cases hrough listeners
		
		Assert.assertEquals(messageString, expected);
		
		
	}
	
	@Test(priority=2, dependsOnMethods = "loginTest")
	public void home()
	{
		System.out.println("home test case");
	}
    @Test(priority=3)
	public void profile() 
	{
		System.out.println("profile test case");
	}
	
	
	
	
	
	
	

}
