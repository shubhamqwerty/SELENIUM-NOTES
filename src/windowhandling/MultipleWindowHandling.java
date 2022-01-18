package windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {
	
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
		
Thread.sleep(2000);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
Thread.sleep(2000);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		
		Set<String> allwindowid = driver.getWindowHandles();
		
	int numberofid = allwindowid.size();// this will return the total number of id 
		
	System.out.println(numberofid);
	
	String [] winid = new String[numberofid];
	
	int i=0;
	
	for(String id : allwindowid) // this means all id's of allwindowid i.each id will be saved in id
	{
		winid[i]=id; //this means we have to save all the id's into the string "winid"
	      i++;
	}
	
	for(String ids : winid)
	{
		System.out.println(ids);
	}
	
	Thread.sleep(2000);
	
	driver.switchTo().window(winid[1]); // THIS WILL TAKE US TO THE 1ST TAB
	driver.get("https://www.google.co.in/?gws_rd=ssl"); //AND THIS LINE WILL OPEN GOOGLE ON THE 1ST TAB ITSELF SINCE THROUGH SWITCHTO WE HAVE DIRECTED TO OPERATE ON THE SPECIFIC WINDOW 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	

}
