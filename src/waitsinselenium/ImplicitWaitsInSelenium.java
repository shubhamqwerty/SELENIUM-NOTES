package waitsinselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
// IMPLICIT WAITS --> JAB TAK ELEMENT MIL NAHI JATA TAB TAK WAIT HOTA HAIagar us time me nhi milta tab it show no such element found exception deta hai and if within the time element mil gaya toh operation perform hta hai
public class ImplicitWaitsInSelenium {
	
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "E:\\MY JOB\\automation testing\\CHROME DRIVER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);// it is the strikeout statement which tell us that due to this there can be delay in your program
	                                                                   	// so the program will  wait for 30 seconds and if within 30 seconds if the elements are detected then it will perform operation if not then it will show NOSUCHELEMENT EXCEPTION
		// imlicit waits are GLOBAL WAITS
		driver.get("https://www.google.com/");
	
		WebElement searchfield = driver.findElement(By.xpath("//*[@name='q']")); //search field
		
         Actions act = new Actions(driver);
         
         act.sendKeys(searchfield, "india").perform(); //1ST PAGE 
         
         act.sendKeys(Keys.ENTER).perform();
		
		driver.findElement(By.xpath("(//*[@class='LC20lb MBeuO DKV0Md'])[9]")).click();//2nd page//after entering india on 1st page then programme will (central bank of india)search on the 1st page itself and will break the code(since not present on the 1st page) we wil manually have to go to 2nd page 
		
	}
	
	//NOT RUNNING

}
