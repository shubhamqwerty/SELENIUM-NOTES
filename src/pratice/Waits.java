package pratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waits {
	
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "E:\\MY JOB\\automation testing\\CHROME DRIVER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		///driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);// it is the strikeout statement which tell us that due to this there can be delay in your program
	                                                                   	// so the program will  wait for 30 seconds and if within 30 seconds if the elements are detected then it will perform operation if not then it will show NOSUCHELEMENT EXCEPTION
		                                                               // imlicit waits are GLOBAL WAITS
driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
	
		 driver.findElement(By.xpath("//*[@id='welcome']")).click(); //search field
		
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.findElement(By.linkText("https://opensource-demo.orangehrmlive.com/index.php/auth/logout")).click();
		
	}

}
