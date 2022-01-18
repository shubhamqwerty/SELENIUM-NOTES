package actionclassdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

                                  //WHEN WE HAVE IFRAME ON THE BROWSER

public class ClickAndHoldOperation {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\MY JOB\\automation testing\\CHROME DRIVER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/slider/");
		
		WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']")); // TO ENTER INTO THE SLIDER 1ST WE HAVE TO ENTER INTO THE IFRAME SO THIS IS THE XPATH OF IFRAME
		
		driver.switchTo().frame(iframe); // THROUGH THIS SYNTAX WE WILL ENTER INTO THE IFRAME --> THIS SYNTAX PROVIDE FUNCTIONALTY TO ENTER INTO THE IFRAME
		
	WebElement slider = driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']")); // this is the actual slider xpath but it accessible only when we successfully enter into the iframe
	
	Actions act = new Actions(driver); // Actions class called since now there is the use of mouse/keyboard
	
	act.clickAndHold(slider).moveByOffset(86, 0).moveByOffset(-56, 0).release().build().perform();
	
	
	// here "clickAndHold(slider)" --> it is method this will hold the slider which is mouse operation
	//   '"moveByOffset(86, 0)" ---> it is method this will move the slider horizontally/ veritically as provided in the bracket
	// release(); ---> this will release the hold position of the slider as we do manually  on the mouse
	
	
                                           //NOW TO MOVE OUT OF IFRAME to perform action on parent frame	
	
	driver.switchTo().parentFrame(); //this syntax will take us out from the iframe and will take us to parent frame
	
	driver.findElement(By.xpath("(//*[@class='menu-item'])[1]")).click();
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
