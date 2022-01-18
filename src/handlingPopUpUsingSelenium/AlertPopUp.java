package handlingPopUpUsingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertPopUp {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\MY JOB\\automation testing\\CHROME DRIVER\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
				
				WebElement doubleclickbutton = driver.findElement(By.xpath("//*[@id='double-click']"));
				
				Actions act = new Actions(driver);
				
				act.doubleClick(doubleclickbutton).perform(); // this will perform double click
				
	//now handling pop up -->ALERT POP UP ---> such pop up due to which we cannot oprate thr screen unless(compulsarily) we  handle the popup
				
				Thread.sleep(2000);
				
			String textonalert = driver.switchTo().alert().getText(); // through this we will get the text written in the pop up
				
			System.out.println(textonalert);
			
				driver.switchTo().alert().accept(); // through this syntax we handle ALERT pop up
	                                                //accept(); this will click on the ok button
				
	//=== when the poop up HAS 2 OPTIONS OK AND CANCEL===
	
	driver.findElement(By.xpath("//*[@name='confirmation']")).click();
	
	Thread.sleep(2000);
	
	driver.switchTo().alert().dismiss(); // this will click on cancel
	                                    //dismiss(); will click on cancel button
	
	
	                                 // TO UPLOAD THE FILE using sendkeys
	
	
	driver.findElement(By.xpath("//*[@name='upload']")).sendKeys("C:\\Users\\Hp\\eclipse-workspace\\selenium\\Screenshots\\secondscreenshot.png");
	// within sendkeys we have to give the path  of the file
	
	
	
	
	
	
	
	}
			
			
// NOTE--> WE USE SWITCH TO WHEN THERE IS ALERT POPUP AND NOT THE NORMAL ONE			
	
	
	
	
	
	
	
	
	
	
	
	
	

}
