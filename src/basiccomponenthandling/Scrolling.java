package basiccomponenthandling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//SCROLLING CANNOT BE DONE WITH THE HELP OF WEBDRIVER THEREFORE WE WILL HAVE TO CAST "DRIVER"(VARAIB INTO JAVASCRIPTEXECUTER
public class Scrolling {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "E:\\MY JOB\\automation testing\\CHROME DRIVER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
	driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();
	
	

	WebElement checkbox = driver.findElement(By.xpath("(//*[contains(@id,'ohrmList_chkSelectRecord_')])[49]"));

	
                          	// to scroll by pixel value forward and reverse direction  we use the following method	
	JavascriptExecutor	js =(JavascriptExecutor)driver;// here we have cast the webdriver into javascript
	
	//js.executeScript("window.scrollBy(0,800)"); // "window.scrollBy()" standard syntax(command define in javascript) to automate scroll
	
	Thread.sleep(1000);
	
	//js.executeScript("window.scrollBy(0,-400)");
	
	
	                        //to scroll upto a particular webElement	
	
	js.executeScript("arguments[0].scrollIntoView();",checkbox); // this scrolldown upto the particular checkbox
                                                                 //arguments[0].scrollIntoView();  this is a command define in javascript to scroll upto the specific webelement 	

	checkbox.click();
	
	
	}
	
	

}
