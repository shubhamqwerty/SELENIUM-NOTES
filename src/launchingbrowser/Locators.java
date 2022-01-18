package launchingbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	// locators are nothing but the address of the web elements in the browser
// to detect a webelement  we should have a locator through we can identify that webElement uniquely	
	
	
                                   //TYPES OF LOCATOR
	
	                   //1.  ID LOCATOR
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\MY JOB\\automation testing\\CHROME DRIVER\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
Thread.sleep(2000);
		//TO MAXIMIZE WINDOW

		driver.manage().window().maximize();
		
Thread.sleep(2000);

// TO GO TO SPECIFIC WEBSITE
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		 String url	= driver.getCurrentUrl();// to get thr current url 
	   
	   System.out.println(url);
	   
Thread.sleep(2000);
		
	   // to find the element
	   
		WebElement username =driver.findElement(By.id("txtUsername")); // this will locate "username" element in the browser
		
Thread.sleep(2000);
		
		// to pass value in  the element
		
		username.sendKeys("Admin"); // "sendkeys" method is used to write something in the element  this will pass "Admin" in username
		
Thread.sleep(2000);
		
WebElement	password = driver.findElement(By.id("txtPassword")); // this will locate the password element in the browser
		
Thread.sleep(2000);

		password.sendKeys("admin123"); // send keys will enter password into passsword element
		
		
		                                 // 2.  CLASSNAME LOCATOR
		
		//TO LOCATE LOGINBUTTON
		
//WebElement	loginbutton = driver.findElement(By.className("button")); // this will locate the login button (if classname does not work we can also use the id)

WebElement	loginbutton = driver.findElement(By.id("btnLogin"));

	loginbutton.click();	 // this method will click on the login button
	
Thread.sleep(2000);	 

	                                      //3. LINK TEXT LOCATOR
	// TO ACCES THE "FORGOT PASSWORD" LINK
	 
	WebElement  link = driver.findElement(By.linkText("Forgot your password?")); // this method will access the links in the browser
	 
	// link.click();
	 
	   WebElement link2=driver.findElement(By.linkText("OrangeHRM, Inc"));
	 
	//link2.click(); 
	 
	                                    //4. PARTIAL LINK TEXT locator
	   
	 // used when we know only some part of link i.e partial text is known
	 
	// WebElement forget= driver.findElement(By.partialLinkText("word?"));
	 
	// forget.click();
	 
	                                 //5.NAME LOCATOR
	 
	 //FOR LOGIN BUTTON
	 
	 driver.findElement(By.name("Submit")).click();
	 
	 
	                              //6.TAG NAME
	 //but not used since tag name are repeated
	 
	 driver.findElement(By.tagName("input")).click();
	 
	                          //7.X-PATH(MOSTLY USED)
	 
	 //FORMAULA FOR XPATH-->tagname[@attribute = 'attributevalue'] OR *[@attribute = 'attributevalue']
	 
//NOTE-- WE CAN HAVE * INTHE PLACE OF TAGNAME IN THE XPATH EXPRESSION 
	 
	 
	 
	 
	 
	                                                      //...CUSTOMIZATION OF X-PATH...
	 
	 //1. contains method ---->tagname[contains(@attribute,'atrribute value')]    attribute will have such value which does not change
	 
	 
	 //2.
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	}
	
	
	
	

}
