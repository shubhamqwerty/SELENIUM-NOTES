package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
	public static void captureScreenshot(WebDriver driver , String filename) throws IOException // here "WebDriver driver" will call the corresponding driver  and will be used throughout the method
	{
		TakesScreenshot scrshot =(TakesScreenshot)driver; // (TakeScreenshot)driver --> this means we are changing "driver" type from "WebDriver" to "TakeScreenshot" i.e. downcasting
		
		File	source = scrshot.getScreenshotAs(OutputType.FILE) ;   //getScreenshotAs(OutputType) it is a method  IN WHICH USER CAN DECIDE THE SCREENSHOT  FORMAT(FILE,ENCODED,ENCRYPTED)
			                                                         // and we defined source as a "file"
		
		//TO SAVE THE SCREENSHOT IN THE DEVICE WE HAVE TO MAKE THE OBJECT OF "FILE" CLASS and give the path in paranthesis where file is to be stored
		
	//	File destination = new File("E:\\MY JOB\\selenium\\CAPTUREDSCREENSHOT\\"+filename+".png"); //"filename" will allow the user to give name for every new file
	
		
		
		//alternate method to save the screenshot
		
	String path =System.getProperty("user.dir")+"\\Screenshots\\"+filename+".png";// System is a class in which gtProperty is a method which returns the path(user.dir) of the project present in the system 	
		                                                                        // " \\Screenshots\\"  this is the folder(in project itself) in which screenshot will be saved
	                                                                          
	
		File destination = new File(path);
		
		
		FileHandler.copy(source, destination); //file handles establishes the relation between file and its destination// FileHandler is a Class in which "copy" is a method which saves the particular file into the path(i.e "source" will be saved in the "destination")	
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	

}
