package testngdisscussion;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//TO LAINCH BROWSER THROUGH PARAMETER


public class ParametersInTestNG2 //if we need to provide data in xml and that provided data want to be used in test case at such times we use parameters annotations
{
           static WebDriver driver;
           
    @Parameters("browser")  //this name is from the xml file     
    @Test
     public void launchFacebook(String browsername) //dATA WILL COME FROM XML
      {
    	
    	 
    	 if(browsername.equalsIgnoreCase("chrome"))
    	 {
    		 System.setProperty("webdriver.chrome.driver", "E:\\MY JOB\\automation testing\\CHROME DRIVER\\chromedriver.exe");
     		
    		  driver = new ChromeDriver();

    	         driver.manage().window().maximize();
    	 }
    	 else if(browsername.equalsIgnoreCase("firefox")) 
    	 {
    		 System.setProperty("webdriver.gecho.driver", "E:\\MY JOB\\automation testing\\CHROME DRIVER\\gechodriver.exe");
      		
   		  driver = new FirefoxDriver();

   	         driver.manage().window().maximize(); 
    	 }
    	 
    	 
    	 
    	 
         driver = new ChromeDriver();

         driver.manage().window().maximize();
            
    	
    	
    	 
      }

  
    
    
    
    
    
    
    
    
    
    
    
}
