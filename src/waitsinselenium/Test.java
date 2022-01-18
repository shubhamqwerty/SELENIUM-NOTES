package waitsinselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "E:\\MY JOB\\automation testing\\CHROME DRIVER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);// ek bar lagaya toh applicable on each and every wweb element since it is called as global wait no need to add implicit wait again n again
	
		driver.findElement(By.xpath("//*[@id='disable']")).click() ; // this will not be click sice the button is not enable(AND IMPLICIT WAITS DOES NOT WAIT SO THAT BUTTON GETS ENABLED) so the code wont break here because we have applied implicit wait and it checks k agar element present hai toh action perform karo irrespectibe whether the previous lines executable or not so it will EXECUTE THE  next line
		
		driver.findElement(By.xpath("//*[@id='display-other-button']")).click() ; // this will be click 
		
	}
	
	
	
	
	
	
}
