package actionclassdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperation { //FOR RIGHT CLICK
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\MY JOB\\automation testing\\CHROME DRIVER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
	WebElement admintab = driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']"));
		
	Actions act = new Actions(driver);
	
	                                     //FOR RIGHT CLICK
	
	
	act.contextClick(admintab).perform(); // this will be RIGHT CLICK  on the admin tab
	                                     //  act.contextClick() --> this will just perform right click anywhere on the screen
	                                     //act.contextClick(admintab)---> this will right click on the admin tab
	
	
	//ARROW DOWN THROUGH KEYBOARD WITH HELP OF ROBOT CLASS this is alternative to action class
	
	
	Robot rbt = new Robot();
	
	rbt.keyPress(KeyEvent.VK_DOWN);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
