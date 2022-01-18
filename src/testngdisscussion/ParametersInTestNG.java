package testngdisscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersInTestNG //if we need to provide data in xml and that provided data want to be used in test case at such times we use parameters annotations
{
           static WebDriver driver;
           
    @Parameters("urltobelaunch")  //this name is from the xml file     
    @Test
     public void launchFacebook(String url) //dATA WILL COME FROM XML
      {
    	
    	 System.setProperty("webdriver.chrome.driver", "E:\\MY JOB\\automation testing\\CHROME DRIVER\\chromedriver.exe");
    		
         driver = new ChromeDriver();

         driver.manage().window().maximize();
            
    	
    	
    	  if(url.contains("facebook"))
              {	
	              	 
                 driver.get(url);	 
              }
                else
                {
                	driver.get("https://www.google.com/");
                }
      }

    @Parameters({"enviroment","buildversion"})
    @Test
    public void builfInfo(String env , String version)
    {
    
    	System.out.println("the enviroment is :"+ env);
    	System.out.println("the version is : "+ version);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
