N  package launchingbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAutomate {
	
	public static void main (String[] args)
	{	
		System.setProperty("webdriver.chrome.driver", "E:\\MY JOB\\automation testing\\CHROME DRIVER\\chromedriver.exe"); 
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	//redirecting to url
		driver.get("https://www.facebook.com/");
		
//		driver.findElement(By.id("email")).sendKeys("shubham.satpute1433@gmail.com");
//		
//		driver.findElement(By.id("pass")).sendKeys("zxcvbnm123");
//		
//		driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy")).click();
//		
		
		
		                                       //customizaton of x path 
		
		// 1. contains method--->tagname[contains(@attribute,'atrribute value')] 
		
	//	driver.findElement(By.xpath("//button[contains(@id,'u_0_d_')]")).click();
		
		
		// 2.text method (used when link is between 2 angular braces(>  <) and when we dont have any attribute)
		//tagname[text()='>value bettween 2 angular braces<']
		
	//	driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
		
		// 3. By indexing of xpath (used when we have multiple matches)
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
