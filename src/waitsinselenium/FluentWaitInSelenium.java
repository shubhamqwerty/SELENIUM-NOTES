package waitsinselenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitInSelenium {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\MY JOB\\automation testing\\CHROME DRIVER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30)) // maximaum duration to wait
				.pollingEvery(Duration.ofSeconds(9));//polling time
		// here 30 sec is thhe total time and 2 sec is the pollling time means every after evry 2 sec polling is performed so jvm will check 4 times whether the button is eneble or not and at 5th time it will click since button gets enable after 10 sec
		                                    
		                                                           //fluent wait is applicable on webdriver type class
		                                                             // any string written in <> called as "genrix" 
		                                           // in fluent wait we can  define the   timeout duration along with polling time hence fluent wait is more customizable and provides better synchronization through polling between the code speed and the webpage speed
		
		driver.findElement(By.xpath("//*[@id='enable-button']")).click();//10 sec to get enable
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='disable']")));
		
		driver.findElement(By.xpath("//*[@id='enable-button']")).click();
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
