package windowhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class OpenNewTab {

public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver", "E:\\MY JOB\\automation testing\\CHROME DRIVER\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.google.co.in/?gws_rd=ssl");
	
	WebElement gmail = driver.findElement(By.xpath("//*[text()='Gmail']"));
	
	Actions act = new Actions(driver);
	
	act.keyDown(Keys.CONTROL).click(gmail).build().perform();// this will open the new gmail tab 
	                                                          // we use CONTROL BECAUSE WHHEN WE PRESS CONTROL TAB GETS OPENED IN NEW TAB
                                                             // IF DONT PRESS CONTROL THEN THE TAB GETS OPEN IN THE SAME TAB
	// NOTE --->CNTRL+T --->TO OPEN THE NEW TAB FROM THE KEBBOARD
	//NOTE --> WHEN WE PRESS ANY LINK BY PESSING CNTRL IT GETS OPRN IN NEW TAB AND NOT IN THE SAME TAB
	
//	act.keyDown(Keys.CONTROL).sendKeys("t").build().perform();// this will open the new tab but it is not working
	
	
	((RemoteWebDriver) driver.switchTo()).get("https://www.instagram.com/direct/t/340282366841710300949128217307274744518"); //how to open the new tab in the same browser
	
	
	
	
}	
	
}
