package basiccomponenthandling;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import utility.Screenshot;

public class ScreenShot {
	
	 public static void main(String[] args) throws IOException {
		 System.setProperty("webdriver.chrome.driver", "E:\\MY JOB\\automation testing\\CHROME DRIVER\\chromedriver.exe"); 
			
			
			WebDriver driver = new ChromeDriver(); // WebDriver is an interface of selenium which  perform operation define in ChromDriver
			                                     // BUT WE CANNOT CAPTURE THE SCREEN SHOT ON THE BASIS OF WebDriver INTERFACE
			                                    // TO CAPTURE THE SCREENSHOT WE HAVE TO USE "TAKE SCREENSHOT" INTERFACE AND CHROME DRIVER MUST IMPLEMENT "TAKE SCREENSHOT" INTERFACE
			
			
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/signup");
			
			
			TakesScreenshot scrshot =(TakesScreenshot)driver; // (TakeScreenshot)driver --> this means we are changing "driver" type from "WebDriver" to "TakeScreenshot" i.e. downcasting
			
		File	source = scrshot.getScreenshotAs(OutputType.FILE) ;   //getScreenshotAs(OutputType) it is a method  IN WHICH USER CAN DECIDE THE SCREENSHOT  FORMAT(FILE,ENCODED,ENCRYPTED)
			                                                         // and we defined source as a "file"
		
		//TO SAVE THE SCREENSHOT IN THE DEVICE WE HAVE TO MAKE THE OBJECT OF "FILE" CLASS and give the path in paranthesis where file is to be stored
		
		File destination = new File("E:\\MY JOB\\selenium\\CAPTUREDSCREENSHOT\\facebook.png");
			
		FileHandler.copy(source, destination); //file handles establishes the relation between file and its destination// FileHandler is a Class in which "copy" is a method which saves the particular file into the path(i.e "source" will be saved in the "destination")	
			
			
			
			Screenshot.captureScreenshot(driver,"secondscreenshot");
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	//NOTE --> PREPARE A METHOD WHICH CONTAINS THE SCREENSHOT CODE		
			
			
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
