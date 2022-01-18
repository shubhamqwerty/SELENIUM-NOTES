package actionclassdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\MY JOB\\automation testing\\CHROME DRIVER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
	WebElement admintab = driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']"));
		
	Actions act = new Actions(driver);
	
	Thread.sleep(2000); 
	
	act.moveToElement(admintab).perform(); //this is hover on admin tan
	
	WebElement usrmgnt = driver.findElement(By.xpath("//*[@id='menu_admin_UserManagement']"));
	
	Thread.sleep(1000);
	
	act.moveToElement(usrmgnt).perform(); // this is hover on usermagmnt 
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//*[@id='menu_admin_viewSystemUsers']")).click(); // this is click in user
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	

}
