package pompage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashBoardPage {
	
	WebDriver driver;
	
	WebDriverWait wait;
	
	@FindBy(xpath="//*[@class='button-blue']") WebElement getstarted;
	
	@FindBy(xpath="(//*[@type='text'])[2]") WebElement searchfield;

      public DashBoardPage(WebDriver driver)
    {
    	  this.driver=driver; 
    		
    	  wait= new WebDriverWait(driver, 50);

    	  PageFactory.initElements(driver, this); 	  
	
	}
	
      
      public void searchShare() 
      {
    	  wait.until(ExpectedConditions.elementToBeClickable(getstarted));
    	  
    	getstarted.click(); 
    	
    	searchfield.sendKeys("sbin");
    	
    	Actions act = new Actions(driver);
    	
    	
    	
    	act.sendKeys(getstarted, Keys.ENTER).build().perform();
    	
    	
    	
    	
    	
      }
      
      
      
      
      
      
      
      
      
}
