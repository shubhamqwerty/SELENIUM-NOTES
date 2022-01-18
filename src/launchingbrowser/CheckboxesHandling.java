package launchingbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxesHandling {
	
	
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "E:\\MY JOB\\automation testing\\CHROME DRIVER\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
	
	driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	
	driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
	
driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();
	
	WebElement checkbox = driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_39']"));
	
	// to check whether the check box is selected or not we make use of "isSelected method"
	
	boolean ischecked = checkbox.isSelected(); // this will check whether the check box is selected  state or not
	
	System.out.println("checkbox is selected :"+ischecked);
	
	boolean isoperable=checkbox.isEnabled(); // this will check whether the check box is enabled condition or not
	
	System.out.println("checkbox is operable :"+isoperable);
	
	
	checkbox.click();
	
	boolean afterclick = checkbox.isSelected();
	
System.out.println("checkbox afterclick :"+afterclick);
	
	
	// to check whether the particular web element is present on the web page or not
// for this we use 'isDisplayed' method

WebElement resetbtn = driver.findElement(By.xpath("//*[@id='resetBtn']"));
	
	boolean isdisplayed = resetbtn.isDisplayed(); //'isDisplay' method will check whether the element is present on the web page or not (return the true or false) 
	
System.out.println("reset button DISPLAYED : "+isdisplayed);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
