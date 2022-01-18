package waitsinselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitGroww {
	
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "E:\\MY JOB\\automation testing\\CHROME DRIVER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://groww.in/");
		
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);// ek bar lagaya toh applicable on each and every wweb element since it is called as global wait no need to add implicit wait again n again
		
		
		driver.findElement(By.xpath("(//*[@class='btn51Btn btn51RipplePrimary btn51Primary'])[1]")).click();
		
		driver.findElement(By.xpath("//*[@id='login_email1']")).sendKeys("ssatpute962@gmail.com");
		
	driver.findElement(By.xpath("//*[@class='absolute-center btn51ParentDimension']//span[text()='Continue']")).click();
	
	driver.findElement(By.xpath("//*[@id='login_password1']")).sendKeys("251377@ytl");
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
