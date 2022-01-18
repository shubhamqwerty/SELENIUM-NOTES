package pomtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pompage.DashBoardPage;
import pompage.LoginPage;

public class BaseTest {
	
	static WebDriver driver; //it is made static because "webDriver driver" is used throughout the execution so it should be avaiable everytime
	
	LoginPage lp; // this nothing but making the object at global level so that it should get access in other classes as well
	
	DashBoardPage db;
	
	@BeforeSuite //because this should grt executed before the stsrt of test
	public void initDRiver()
	{
System.setProperty("webdriver.chrome.driver", "E:\\MY JOB\\automation testing\\CHROME DRIVER\\chromedriver.exe"); 
		
		
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		
	}
	
	@BeforeClass // because before running the particular class obect should get created since we are using the nonstatic method
	public void createObject()
	{
		 lp = new LoginPage(driver);  //this "driver will come from base test" and this driver will go to login page constructor
		 db= new DashBoardPage(driver);
	}
	
	
	
	
	
	
	
	
	
	

}
