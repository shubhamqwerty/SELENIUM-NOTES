package basiccomponenthandling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
                                                         //ALTERNATIVE TO THE SENDKEYS
public class SendKeysUsingJavaScriptExecutor {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\MY JOB\\automation testing\\CHROME DRIVER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
		
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		jse.executeScript("arguments[0].value='Admin';", username);
		
		
//syntax -- variablename.executeScript("arguments[0].value='text which we want to write';",WebElement);		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
