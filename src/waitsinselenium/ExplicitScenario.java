package waitsinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitScenario {// TO CHECKBOX CONDITION TO GET FALSE once the box get cheked

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\MY JOB\\automation testing\\CHROME DRIVER\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

driver.findElement(By.xpath("//*[@id='checkbox']")).click();
	
WebDriverWait wait = new WebDriverWait(driver, 40);


//	wait.until(ExpectedConditions.elementSelectionStateToBe(By.xpath("//*[@id='ch']"), true)); // here boolean codition will hold the program(within the specified time) until the condition(of xpath) get true  and if condition not occur within the given time then it will show "TIMEOUTEXCEPTION" 
//	
//	wait.until(ExpectedConditions.elementSelectionStateToBe(By.xpath("//*[@id='ch']"), false)); //  if this condition is not satisfaied(i.e uncheck the check box) within the specified time then it gives "time out exception"
//	
//	driver.get("https://www.google.com/");
	
	

                                    //TO WAIT UNTIL WE GWT ALERT POPUP
//	driver.findElement(By.xpath("//*[@id='alert']")).click();
//	
//	wait.until(ExpectedConditions.alertIsPresent());
//	
//	driver.switchTo().alert().accept();// to handle the allert popup sice due to alert pop uo we r not able to operate the screen unless the popup is handle 1st
	
	
	
	                                   //HOMEWORK
	
	driver.findElement(By.xpath("//*[@id='populate-text']")).click();
	
	wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id='h2']"), "Selenium Webdriver"));
	
	driver.get("https://www.google.com/");
	
	
	
	
	
	
}
	
}
