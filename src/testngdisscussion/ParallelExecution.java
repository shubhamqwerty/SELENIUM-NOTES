package testngdisscussion;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParallelExecution {
	@Parameters("browser")
	@Test
	public void validateUrl(String param)
	{
		
		if(param.equalsIgnoreCase("chrome"))
		{
System.setProperty("webdriver.chrome.driver", "E:\\MY JOB\\automation testing\\CHROME DRIVER\\chromedriver.exe");
		
		WebDriver	 driver = new ChromeDriver();
		
        driver.get("https://www.facebook.com/");
	  }
		else if(param.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", "E:\\MY JOB\\automation testing\\CHROME DRIVER\\msedgedriver.exe");
			
			WebDriver	 driver = new EdgeDriver();
			
	        driver.get("https://www.google.com/");
		}
		
	
	
	
	
	
	
	
	}
	

}
