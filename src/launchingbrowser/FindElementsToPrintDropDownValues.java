package launchingbrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindElementsToPrintDropDownValues {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "E:\\MY JOB\\automation testing\\CHROME DRIVER\\chromedriver.exe"); 
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
//1. TO print THE DROPDOWN vaue USING SELECT TAGNAME(3 DIFFERENT SELECT class)  (PARTICULAR ELEMENT SHOULD HAVE SELECT AS TAGNAME THEN WE Can  USE THE FOLLOWING METHODS TO HANDLE THE DROPDOWN)
		
//		 List<WebElement> day = driver.findElements(By.xpath("//*[@id='day']//option"));
//		
//		 for(WebElement date:day)
//		 {
//			 String actualdate = date.getText(); // get text method returns the text written on web elemrnt OR IN THE DROPDOWN
//			 System.out.println(actualdate);
//		 }
		
		
		
//2. TO PRINT THE VALUES OF DROPDOWN WITHOUT USING FOR EACH LOOP
		
		
		
	
	WebElement	daydropdown =driver.findElement(By.xpath("//*[@id='day']")); 
		 
		 Select sel = new Select(daydropdown);
		 
		List<WebElement> dayvalue = sel.getOptions();// "getOptions()" method will access all the elements/values present in the dropdown
		 
	          int numberofdayvalues=	 dayvalue.size(); // "size()" method will return the  number of component
		 
		 System.out.println("number of days available in the dropdown "+ numberofdayvalues);
		 
	for(int i=0; i<numberofdayvalues;i++)
	{
String	actualdate = dayvalue.get(i).getText();	// here get(i) will return the index value of the element and getText() will return the text on the web element   SO get(i).getText() TOGETHER WILL RETURN THE text of the particular index value
	
System.out.println(actualdate);
	}	 
		 
	// X-PATH HAS 2 TYPES-->(XPATH ARE ALSO LOCATERS)	 
	// 1.ABSOLUTE X-PATH = THROUGH ABSOLUTE X-PATH WE CAN DIRECTLY JUMP TO THE DESIRED WEB ELEMENT FOR THIS WE USE "//"  DOUBLE FORWARD SLASH  . "THIS IS PREFERED"
	// 2.RELATIVE X-PATH = THROUGH RELATIVE X-PATH WE HAVE TO GO STEP BY STEP(BY PARENT CHILD RELATION SHIP) TO THE DESIRED ELEMENT  FOR THIS WE USE "/" SINGLE FORWARD SLASH
		 
		 
		 
		 
		 
		 
		 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// we use for each loop when we have to validate more than one element on the web page
	// List<WebElement>  ----> THIS SYNTAX IS FOR COLLECTION THIS IS KNOWN AS GENREX
	// LIST KA TYPE BATATA HAI K KONSE  TYPE K ELEMNTS HAI
	
	
	
	

}
