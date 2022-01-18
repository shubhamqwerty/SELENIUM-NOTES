package handlingPopUpUsingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleGrowwPopUp { // THIS IS A NORMAL POP-UP --> HERE WE Can find the x-path and canhandle the popup(here the screen is operable if did not hhandle the popup)
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\MY JOB\\automation testing\\CHROME DRIVER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://groww.in/");
		
		driver.findElement(By.xpath("(//*[@class='btn51Btn btn51RipplePrimary btn51Primary'])[1]")).click();
		
		Thread.sleep(2000);
		
    	driver.findElement(By.xpath("//*[@class='rodal-close']")).click();
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	

}
