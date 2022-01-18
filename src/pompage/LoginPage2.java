package pompage;
                                                 ///PAGE FACTRY
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
//USING THE PAGE FACTORY class OF SELENIUM THROUGH WHICH WE CAN LOCATE THE ELEMENT AND PASS THE VALUE IN THE ELEMENT by searching it and both the action at different instance
// in page factory we have to create the variable at the class level and keep the type as " and this"WebElement"

public class LoginPage2 {
	
WebDriver driver; 

WebDriverWait wait;

@FindBy(xpath = "//*[@id='userid']")  private WebElement username; //this is nothing but the declaring the xpath at the global level
                                                           //here username is the variable of "web element" type

@FindBy(xpath = "//*[@id='password']")  private   WebElement password; //here we have declared the variable as private this is datat hididng .---> scenario of encapsulation

@FindBy(xpath = "//*[@type='submit']") private  WebElement loginbutton;

@FindBy(xpath="//*[@id='pin']")  private WebElement pin;

@FindBy(xpath="//*[@type='submit']") private  WebElement submit;


public LoginPage2(WebDriver driver) //
{
	this.driver=driver; 
	
wait= new WebDriverWait(driver, 50);

PageFactory.initElements(driver, this); // to provide the memory to "@FindBy(xpath = "//*[@id='userid']") WebElement username;"  we will have to write this method and with the help of "this" keyword non static variable at the class level will get initialize through the constructor

}




	public void loginWithCredentials()
	{
	
	username.sendKeys("DAA677");
	
	
	password.sendKeys("Velocity@123");
	
  
	
	loginbutton.click();
	}
	
	
	public void enterPin()
	{
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS); // waits applied sice without wait it shows nosuchelement exeption due to improper synchronisation so to appear the web element we have use implicit wait //WAITS APPLIED SINCE THIS IS THE 2ND PAGE AFTER LOGIN IT TAKES TIME TO LOAD THE PAGE SO TO POINT OUT THE ELEMENT AFETR LOADING WE APPLIED THEWAITS
		
		pin.sendKeys("866918");
		
		submit.click();
		
		
	}
	
	
	public boolean verifyUrl()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='button-blue']"))); //delibately applied since witouht waits it was not able to fetch the url
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
	
	if(url.contains("dashboard"))
	{
		return true;
	}
	else
	{
		return false;
	}
	
	
	
	//object repository-->  variable  of web element type  define at the clss level callled as object repository and it is inside the page class
	}
	
	
	
	
	
	
	
	
	
	
//NOTE --> IF WE R  NOT ASSINGING THE VALUE TO THE REFRENCE VARIABLE AT SUCH TIME WE WILL GET "NULL POINTER EXCEPTION" SINCE THE DEFAULT VALUE OF OBJ S NULL	
	
//NOTE --> WE DO NOT APLY ASSERTIN IN THE PAGE CLASS ASSERTION ARE APPLIED ONLY IN THE TEST CLASS (AS PER IDEAL AUTOMATION ENGG)	
	
//NOTE --> WAITS ARE APPILED BETWEEN THE TWO INTERMIDIATE ACTIONS	
	
	
	//INTERVIEW QUESTION---> WHERE U HAVE USED ENCAPSULATION
	//--> WE HAVE DECLARED THE WEBELEMENT PRIVATE AND THOSE WEB ELEMENT ARE USED IN PUBLIC METHOD AND PUBLIC METHOD ARE CALLED IN TEST CLASSES
	
	//INTERVIEW QUESTION -- > WHERE HAVEU USED INHSERITANCE
	//---> WE HAVE USED IT BETWEEN THE TEST CLASSES WHERE THE TEST CASE ARE DEFINED TO ACCESS THE DRIVER 
	
	//INTERVIEW QUESTION -- > WHERE HAVE U USED CONSTRUCTOR
	//--> WE HAVE USED CONSTRUCTOR TO INITIALIZE THE WEBDRIVER, INTIALIZE OF WAITS .ANND  TO INITIALIZE THE WEELEMENT
}
