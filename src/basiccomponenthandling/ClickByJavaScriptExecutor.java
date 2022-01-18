package basiccomponenthandling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//interview question alternate for click is through java script executor 
public class ClickByJavaScriptExecutor {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "E:\\MY JOB\\automation testing\\CHROME DRIVER\\chromedriver.exe"); 
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://zoom.us/signup");
		
		driver.findElement(By.xpath("//*[@class='onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon']"));// this will close the pop up 
		
		driver.findElement(By.xpath("//*[@id='select-0']")).click();  //MONTH
		
		WebElement august = driver.findElement(By.xpath("//*[@id='select-item-select-0-8']")); //the values which are in front i.e visible are only selected rest which are hidden are not selected it gives  ElementNotInteractableExceptio
		
		
		//interview question //HANDLING THE WEB ELEMENTS WHICH ARE THERE IN THE DROPDOWN BUT  NOT INTERACTTABLE --> JAVA SCRIPT EXECUTOR
		
		//ALTERNATE TO CLICK() METHOD(the click which was not done on the basis of webdriver we achive it through the javascript)
		
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("argument[0].click();", august);  
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
