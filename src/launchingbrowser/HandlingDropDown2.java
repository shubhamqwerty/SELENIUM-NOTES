package launchingbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropDown2 {
	
	public static void main(String[] args) {
		
		// TO HANDLE DROPDOWN WTIHOUT USING SELECT class  BOOTSTRAP DRPDOWN
		
System.setProperty("webdriver.chrome.driver", "E:\\MY JOB\\automation testing\\CHROME DRIVER\\chromedriver.exe"); 
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805499%7Ce%7Ccreate%20fb%20account%7C&placement=&creative=550525805499&keyword=create%20fb%20account&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221432%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-306029541998%26loc_physical_ms%3D1007786%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMI9MDsrMXW9AIVSUFgCh0eDgioEAAYASAAEgKgvfD_BwE");
		
		//USING SENDKEYS
		
	 driver.findElement(By.xpath("//*[@id='day']")).sendKeys("17");
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
