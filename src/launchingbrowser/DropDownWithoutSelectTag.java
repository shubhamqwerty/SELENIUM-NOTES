package launchingbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
                                              //also called boot strap dropdown (other than 'select tagname')
public class DropDownWithoutSelectTag {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "E:\\MY JOB\\automation testing\\CHROME DRIVER\\chromedriver.exe"); 
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://zoom.us/signup");
		
		driver.findElement(By.xpath("//*[@class='onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon']"));// this will close the pop up 
		
		driver.findElement(By.xpath("//*[@id='select-0']")).click();
		
		
		//=====>*[@id='select-item-select-0-5']//span[@class='real-label-span'] ----> his is used to enter the child inside the parent
		
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='select-item-select-0-7']")).click(); //the values which are in front i.e visible are only selected rest which are hidden are not selected it gives  ElementNotInteractableExceptio
		
		
		
		
		
		
		
		
	}
	
	
// NOTE--> THERE ARE ONLY TWO TYPES OF DROPDOWN 
	//1. SELECT TAG
	//2. BOOT STRAP
	
	
	
	

}
