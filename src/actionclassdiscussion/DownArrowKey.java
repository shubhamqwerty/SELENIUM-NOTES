package actionclassdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DownArrowKey {
	
	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "E:\\MY JOB\\automation testing\\CHROME DRIVER\\chromedriver.exe"); 
			
			
			WebDriver driver = new ChromeDriver(); 
			
			driver.manage().window().maximize();
			
			driver.get("https://www.google.com/");
		
		WebElement searchbox = driver.findElement(By.xpath("//*[@name='q']"));
		
		Actions act =new Actions(driver);
		
		act.click(searchbox).sendKeys("Selenium").build().perform();
		
		Thread.sleep(2000);
		
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		
		
		
		
		
		
		
	}
	
	

}
