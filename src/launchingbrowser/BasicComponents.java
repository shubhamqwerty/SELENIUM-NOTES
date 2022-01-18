package launchingbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicComponents {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\MY JOB\\automation testing\\CHROME DRIVER\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver(); // the name of ref variable "driver" is popular in india everyone uses the same name for refrence variable
		
//INTERVIEW QUESTION --> WHAT IS THE PRATICAL USE OF CONSTRUCTOR ==> ANS TO OPEN THE BROWSER WHEN WE CREATE THE OBJECT
		
		// TO  MANIPULATE THE CHROME WHEN LAUNCHED I.E OPENING THE WEBSIRE
		
//	driver.get("//www.facebook.com/"); //INTERVIEW QUESTION// but when we remove https then browser will get launch but it wont go to the facebook it will give "invalid arguments exception"	
		
	driver.get("https://www.facebook.com/"); // here it will successfully take us to a fb since we have used " https:// "
		
	Thread.sleep(2000); // if we dont use it then this code will take us to fb and then google and thhis execution is fast so this method will stop the fast execution for 2 sec so that user should understand what is hapeening
	
	driver.get("https://www.google.co.in/");
	     
// to go back to the previous url
	
	driver.navigate().back(); //this will take us to fb from google(since last code was of google) i.e one step back
	
	Thread.sleep(2000);
	
// 	 to go forward
	
	driver.navigate().forward(); ///this will take us to  google from the fb(due to last code) i.e one step forward
	
	Thread.sleep(2000);
	
// to refresh
	
	driver.navigate().refresh();
	
	Thread.sleep(2000);
	
// to maximize size of window
	
	driver.manage().window().maximize(); 
	
	Thread.sleep(2000);	
	
// to close the browser
	
	driver.quit();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
	
	
	
	
	
	
	

}
