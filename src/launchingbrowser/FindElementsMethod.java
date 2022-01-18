package launchingbrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {
	
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\MY JOB\\automation testing\\CHROME DRIVER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
	driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();
	
	
	// findElements (used when we have multiple matches and we have to perform action on all of them)
	
	
	List<WebElement> checkboxes = driver.findElements(By.xpath("//*[contains(@id,'ohrmList_chkSelectRecord_')]")); // by using findElements we are getting multiple xpath atonce
	
	// to know the size of checkboxes(how many check boxes are there)
	
int numberofcheckboxes	=checkboxes.size();

System.out.println(numberofcheckboxes);

for(WebElement checkbox:checkboxes)//THIS IS FOR EACH LOOP// same as dynamic locator but in another way
{
	checkbox.click();
}








	
// NOTE--difference between findElement and findElement
	// findElement--> returns single web element  i.e. we are creating multiple xpath for every web element (single check boxe)
	// findElements---> returns multiple web elements at once i.e we are creating single xpath for multiple web elements(check boxes)
	
//FOR EACH LOOP IIS ALSO CALLED ADVANCED FOR  LOOP	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	

}
