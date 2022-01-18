package testclasses;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.DashBoardPage;
import pages.LoginPage;

public class BaseTest {
	
	public static WebDriver driver; //it is made static because "webDriver driver" is used throughout the execution so it should be avaiable everytime and "public" so that it is accessible outside the package
	
	public LoginPage lp; // this nothing but making the object at global level so that it should get access in other classes as well
	
	public DashBoardPage db;
	
	@BeforeSuite //because this should grt executed before the stsrt of test
	public void initDRiver() throws IOException
	{
         WebDriverManager.chromedriver().setup();// this is the replacement of System.setproperty method since we have added te dependecies of webdriver manager	// this will automatically run the chrome driver  o need to dowmload and give path	
		
		
		
		 ChromeOptions options = new ChromeOptions(); //to handle the "chrome specific notifications" and any operation which is browser specific we make the obj of "ChromeOptions" class
		 
		 options.addArguments("--disable-notifications"); // this will disable the notification/popup which are browser specific (not alert since alert is of application n not of browser)
		 
		 options.addArguments("--start-maximized");  // this will launch  the chrome browser as maximized browser

	// options.addArguments("--incognito"); // this will launch the browser in incognito mode
		 
		 //"add arguments method" will provide the finctionalitlity to handle the browser related funtionality
		 
		 //options.addArguments("--headless"); // headless mode--> there is no ui/gui to the browser.  so there is no need to maximize or handle popup at such time we use "headless" in "headless mode " we cant see the execution(we cannot see the chrome browser in actual) but execution will be performed
		 
		 driver = new ChromeDriver(options); // wwe compulsorily hve to write the "options" in the chromedrivr obj to run according to the above code
		
		//to access the config.properties file we make the object of properties
	
		Properties prop = new Properties();
		
		String filepath = System.getProperty("user.dir") +"\\config.properties";
		
		FileInputStream fis = new FileInputStream(filepath);
		
		prop.load(fis);
		
		driver.get(prop.getProperty("testsiteurl"));
		
		
		
	}
	
	@BeforeClass // because before running the particular class obect should get created since we are using the nonstatic method
	public void createObject() throws IOException
	{
		 lp = new LoginPage(driver);  //this "driver will come from base test" and this driver will go to login page constructor
		 db= new DashBoardPage(driver);
	}
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}
	
	//user.dir --->C:\Users\Hp\eclipse-workspace\selenium\SeptVimanKiteZerodhaMavenProject ---> user.dir will get the file path upto this
	
	
	
	
	
	

}
