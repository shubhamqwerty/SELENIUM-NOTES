package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BaseClass {
	
WebDriver driver; // the value of the driver wll come from " base test class" through the constructor(it will access the driver value through base class) since we are making the object of class and that driver value will used in the current class
	
WebDriverWait wait;


public LoginPage(WebDriver driver) //
{
	this.driver=driver; // HERE WE R SAVING THE LOCAL VARIABLE VALUE INTO THE GLOBAL VARIABLE 

wait= new WebDriverWait(driver, 50);
}




	public void loginWithCredentials()
	{
	WebElement username = driver.findElement(By.xpath("//*[@id='userid']"));
	
	username.sendKeys("DAA677");
	
	WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
	
	password.sendKeys("Velocity@123");
	
   WebElement loginbutton = driver.findElement(By.xpath("//*[@type='submit']"));
	
	loginbutton.click();
	}
	
	
	public void enterPin()
	{
		
		 
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS); // waits applied sice without wait it shows nosuchelement exeption due to improper synchronisation so to appear the web element we have use implicit wait
		
		driver.findElement(By.xpath("//*[@id='pin']")).sendKeys("866918");
		
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		
	}
	
	
	public boolean verifyUrl()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='button-blue']"))); //delibately applied since witouht waits it was not able to fetch the url
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
	
	if(url.contains("dashboardd")) ///delibrately made "dashboardd"to check the screenshot capture 
	{
		return true; 
	}
	else
	{
		return false;
	}
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
//NOTE --> IF WE R  NOT ASSINGING THE VALUE TO THE REFRENCE VARIABLE AT SUCH TIME WE WILL GET "NULL POINTER EXCEPTION" SINCE THE DEFAULT VALUE OF OBJ S NULL	
	
//NOTE --> WE DO NOT APLY ASSERTIN IN THE PAGE CLASS ASSERTION ARE APPLIED ONLY IN THE TEST CLASS (AS PER IDEAL AUTOMATION ENGG)	
	
	
	
	
	
	

}
