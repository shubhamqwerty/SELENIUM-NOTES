package windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	
	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver", "E:\\MY JOB\\automation testing\\CHROME DRIVER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String parentid = driver.getWindowHandle(); // getWindowHandle() ---> this method will return the Parent windowID 
		                                            //getWindowHandle()  IT WILL ONLY RETURN THE PARENT WINDOW id AND NOT THE CHILD WINDOW id
		System.out.println("Parent window id is : "+ parentid );
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
//		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
//		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
//		
		
		
		//TO GET THE ID OF ALL WINDOW WE USE getWindowHandles(); method
		
		Set<String> allwindowid = driver.getWindowHandles(); // getWindowHandles()--> this method will access all the id of the windows which are running on the screen
	                                                     	//  getWindowHandles(); ---> thhsi method will access the parent as well as child window id and all the child window id
                                                          	//SET DOES NOT MAIN THE ORDER
		
		for(String winid:allwindowid)
		{
			if(!(winid.equalsIgnoreCase(parentid))) // if loop -->if there are parent and child window both are open and we have to operatte on child window at such time we use the if loop i.e when the both id are not equal (when this condition is true) then enter into the if loop
			{
			     driver.switchTo().window(winid); // this line will take us to the child-id
			     
			     driver.findElement(By.xpath("//*[@class='btn-orange contact-ohrm ']")).click();
			}
			
			System.out.println(winid);// this will print the all window id open	
		}
		
		
		driver.close(); // this will close the current window.IE. CHILD WINDOW
		
		 
		
		
		// NOW IF WE HAVE TO MOVE FROM CHILD WINDOW TO PARENT WINDOW
		
		driver.switchTo().window(parentid); //this will take us to the parent window
		
driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
		
	
	}
	
	
	//NOTE--> LIST AND SET ARE THE CHILD INTERFACES OF THE COLLECTION INTERFACE IN list INTERFACE DUPLICATES ARE ALLOWED BUT NOT IN THE set INTERFACE BECAUSE set INTERFACE HOLDS THE UNIQUE ID OF THE VARIOUS WINDOWS
	//NOTE---> CLOSE(); IT WILL CLOSE THE CURRENT WINDOW
	//NOTE--->QUIT();   IT WIL CLOSE THE COMPLETE BROWSER
	
	//equalignorecase this doesnot compare the upper and lowercase it just compare the character(content)	
		// "==" double equal is used when refrence variable are pointing to same object	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
