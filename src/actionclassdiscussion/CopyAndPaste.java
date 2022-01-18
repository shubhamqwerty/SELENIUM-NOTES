package actionclassdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;

public class CopyAndPaste {
	
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "E:\\MY JOB\\automation testing\\CHROME DRIVER\\chromedriver.exe"); 
			
			
			WebDriver driver = new ChromeDriver(); 
			
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/signup");
			
	WebElement firstname = driver.findElement(By.xpath("//*[@name='firstname']"));
	
	Actions act = new Actions(driver);
	
//1. first we will click on the  first name tab and will give input
	
	act.click(firstname).sendKeys("shubham").keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();  //THIS IS THE FUNCTION OF CNTRL+A // through this we will select the word which is to be pasted in other field

	act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();  // this is the function of CNTRL+C
	
	act.sendKeys(Keys.TAB).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform(); //this is the function of CNTRL+V
	                       
	}

}
