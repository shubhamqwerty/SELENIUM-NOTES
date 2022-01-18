package launchingbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingOfDropdown {
	
	//DROPDOWN OF CREATE ACCOUNT PAGE IN FB
	
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "E:\\MY JOB\\automation testing\\CHROME DRIVER\\chromedriver.exe"); 
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805499%7Ce%7Ccreate%20fb%20account%7C&placement=&creative=550525805499&keyword=create%20fb%20account&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221432%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-306029541998%26loc_physical_ms%3D1007786%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMI9MDsrMXW9AIVSUFgCh0eDgioEAAYASAAEgKgvfD_BwE");
		
//1. TO HANDLE THE DROPDOWN USING SELECT TAGNAME(3 DIFFERENT METHOD OF SELECT class)  (PARTICULAR ELEMENT SHOULD HAVE SELECT AS TAGNAME THEN WE Can  USE THE FOLLOWING METHODS TO HANDLE THE DROPDOWN)
		
		WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
		
		Select sel = new Select(day);  //making the object of 'select' class
		
		sel.selectByVisibleText("17"); //1ST// through selectByVisibleText we can  give input as appear in the dropdown
		// can also be done by selectbyvalue
		
		WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
		
		Select selmonth = new Select(month);
		
		selmonth.selectByValue("6");//2ND
		//can also be done by selectbyVisibletext
		
		
		WebElement year = driver.findElement(By.xpath("//*[@id='year']"));
		
		Select selyear = new Select(year);
		
		selyear.selectByIndex(25);//3RD // index value we manually have to count it
		
		
//NOTE---> WE CAN USE ANY OF THREE METHOD TO HANDLE DROPDOWN NOT COMPULSORY TO USE FIXED METHOD THESE THREE METHOD CAN BE USED FOR DAY,YEAR,MONTH		
		
//====================================================================================================================================================================}
	 }
	


}
