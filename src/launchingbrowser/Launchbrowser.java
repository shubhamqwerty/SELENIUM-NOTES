   package launchingbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Launchbrowser {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\MY JOB\\automation testing\\CHROME DRIVER\\chromedriver.exe"); // we use this code to launch the browser
	// through setProperty we decide k hum kaha se chrome browser chalana chahate hai	
		
		String  b= "chrome";
		WebDriver driver; // THIS IS VALID(INTERVIEW QUESTION)// this is like memory management programe and here the WebDriver is the parent class which is a interface (refer the diagram)
		                 //WE PREFER THIS SINCE WITH THE HELP OF ONE REFRENCE VARIABLE WE CAN WORK ON MULTIPLE BROWSER
		
		
//		WebDriver driver = new ChromeDriver(); // thorough this browser is launch
//		driver.get("https:\\www.googleS.com");
		
		
		if(b.equals("chrome")) // THIS IS VALID(INTERVIEW QUESTION)// equals method to check the contents
		{
			driver =  new ChromeDriver(); // THIS IS VALID(INTERVIEW QUESTION)// here chroneDriver is the object which will open the chrome automatically
		}
		else
		{
			driver = new FirefoxDriver();
		}
		
		ChromeDriver d = new ChromeDriver(); // THIS IS VALID(INTERVIEW QUESTION)// this will also open the chrome driver automaticklly
		                                      //BUT WE DONT PREFER THIS
		RemoteWebDriver rw = new ChromeDriver(); // THIS IS VALID(INTERVIEW QUESTION) // this will also open the chrome driver automaticklly
		                                        //BUT WE DONT PREFER THIS
		
//NOTE -- n NUMBER OF OBJECTS OPEN n NUMBER OF BROWSER		
		
// ABOVE ALL ARE VALID BECAUSE THERE IS A RELATIONSHIP OF PARENT REFRENCE AND CHILD OBJECTS		
		
		
		
		
		
		
		
		
		
		}
	
	}
