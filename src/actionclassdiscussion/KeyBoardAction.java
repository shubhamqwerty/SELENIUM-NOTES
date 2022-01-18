package actionclassdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
                                                //Action Class in Selenium
//Actions Class is a class in selenium which represents the mouse and keyboard action
// here we will learn how to automate the actions performed on keyboard

public class KeyBoardAction {
	
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "E:\\MY JOB\\automation testing\\CHROME DRIVER\\chromedriver.exe"); 
			
			
			WebDriver driver = new ChromeDriver(); // WebDriver is an interface of selenium which  perform operation define in ChromDriver
			                                     // BUT WE CANNOT CAPTURE THE SCREEN SHOT ON THE BASIS OF WebDriver INTERFACE
			                                    // TO CAPTURE THE SCREENSHOT WE HAVE TO USE "TAKE SCREENSHOT" INTERFACE AND CHROME DRIVER MUST IMPLEMENT "TAKE SCREENSHOT" INTERFACE
			
			
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/signup");
			
	WebElement firstname = driver.findElement(By.xpath("//*[@name='firstname']"));
	
	Actions act = new Actions(driver);
	
//1. first we will click on the  first name tab and will give input
	
	act.click(firstname).sendKeys("shubham").build().perform(); // when we perform more than one action  atonce we use "build().perform()"
	                                                            //but when we have a single action we directly write "perform();"
	//alternative to above
	
//	act.click(firstname).perform(); // this will click on the web element
//	act.sendKeys(firstname, "shubham").perform();  // this will give input in the webelement
	
	     //act.click(); ---> this will click anywhere on the page
	     //act.click(firstname); ----> this will click on the xpath provided but cannot perform the action
	     //act.click(firstname).perform();---> "perform" is method will which make the  action on the input provided
	
	
//2. To go on the surname webElement with the help of Tab key
	
	act.sendKeys(Keys.TAB).sendKeys("satpute").sendKeys(Keys.TAB).sendKeys("7020030551").build().perform();
	
	
	
	
	
	
	
	
	
	
	
	
	
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
