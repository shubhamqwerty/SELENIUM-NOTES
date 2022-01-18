package waitsinselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitsInSelenium {
	
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "E:\\MY JOB\\automation testing\\CHROME DRIVER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		driver.findElement(By.xpath("//*[@id='enable-button']")).click();
		
		//TO APPPY EXPLICIT WAIT WE HAVE TO MAKE THE OBJECT OF WAIT CLASS
		
		WebDriverWait wait = new WebDriverWait(driver, 40);// this is the object creation of WebdriverWait class(at the same time we calling the constructor defined into it) through which we can decide the wait time
	
		                  //==TO WAIT TILL THE ELEMENT IS CLICKABLE OVRT THE PAGE OR NOT ==//
		
//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='disable']")));//this is actual application of the explicit wait on a particular web element(though the wait is 40 sec button will be enavles in 10 sec as soon as button get enabled it will get executed)
	
	//here WAIT is the class in which unril is a method and "Expected conditions" is class in which element to be click is a method through whch we can apply the explicit wait on the particular web element 
	
	//driver.findElement(By.xpath("//*[@id='enable-button']")).click();
	
	

	                      //==TO WAIT TILL THE ELEMENT IS VISIBLE OVRT THE PAGE OR NOT ==//
	
//	driver.findElement(By.xpath("//*[@id='display-other-button']")).click();
//	
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='hidden']")));
//	
//	driver.findElement(By.xpath("//*[@id='display-other-button']")).click();
//	
	
	                                       //==to wait until checkbox got selected
	
//	driver.findElement(By.xpath("//*[@id='checkbox']")).click();
//	
//	wait.until(ExpectedConditions.elementSelectionStateToBe(By.xpath("//*[@id='ch']"), true)); // here boolean codition will hold the program(within the specified time) until the condition(of xpath) get true  and if condition not occur within the given time then it will show "TIMEOUTEXCEPTION" 
//	
//	driver.get("https://www.google.com/");
//	
//	
	
	
	
	//INTERVIEW QUESTION----> IF BOTH IMPLICIT AND EXPLICIT ARE APPLIED AT THE SAME TIME SO  WHAT WILL HAPPEN AT SUCH TIME	
		// ANS--> IMPLICIT WAIT  IS APPLICABE(BYDEFAULT) ON EVERY WEB ELEMENT AND IT WILL CHECK WHETHER THE WEB ELEMENT IS VISIBLE OR NOT BUT THE EXPLICIT WAIT WONT ALLOW TO PERFORM THE FURTHER OPERATION UNLESS CONDITION OF EXPLICIT WAIT IS SATISFIED ... SO THE OUTPUT WILL RUN ON THE BASIS OF EXPLICIT WAIT

	}
	
	//NOTE -- HAR 0.5 SEC K BAD JVM WILL CHECK WHETHER THE ELEMENT IS PRESENT ON THE WEB PAGE OR NOT FOR BOTH (IMPLICIT AND EXPLICIT) and this is called as po lling		

}
//NOTE DIFFERENCE BETWEEN EXPLICIT AND IMPLICIT WAITS
// IMPLICIT--> IMPLICITS WAITS IS BYDEFAULT APPLIED ON EVERY WEB ELEMENT ONCE DECLARED
//EXPLICIT---> EXPLICITS  WAITS ARE APPLICABLE ON A PARTICULAR CONDITION



