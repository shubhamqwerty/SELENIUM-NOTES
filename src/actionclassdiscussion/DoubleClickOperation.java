package actionclassdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickOperation { //DOUBLE CLICK OPERATION
	
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "E:\\MY JOB\\automation testing\\CHROME DRIVER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		WebElement doubleclickbutton = driver.findElement(By.xpath("//*[@id='double-click']"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(doubleclickbutton).perform(); // this will perform double click
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
