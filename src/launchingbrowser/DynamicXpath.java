package launchingbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\MY JOB\\automation testing\\CHROME DRIVER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
	driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();
		
		// driver.findElement(By.xpath("//input[@value='67']")).click(); 
		
		                            // customixzation of xpath
	
	//3. indexing  (//*[@attribute='attribute value'])[checkbox number]
	// to go for a particulae check box
	
	driver.findElement(By.xpath("(//*[@type='checkbox'])[4]")).click();
	
	//4. dynamic xpath	(to click multiple check box at once) 
	// xpath which gets change dynamically or at runtime 
		
	for(int i=2;   i<47;  i++) {
		
		driver.findElement(By.xpath("(//*[@type='checkbox'])["+i+"]")).click(); // by using findElement we are finding the new xpath every time
	}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
	
	
	
	
	
	
	
	
	
	


