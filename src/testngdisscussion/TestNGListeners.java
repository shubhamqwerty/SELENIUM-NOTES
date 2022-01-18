package testngdisscussion;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener; //this is an interface whose implementation will be provided in this class
import org.testng.ITestResult;

import pomtest.BaseTest;
import utility.Screenshot;


//listener will watch all the activity which is being executed(whether test case is passed fail or skipped )and will provide action according to the implementation which are provided(example == take scrnshot when fail etc


public class TestNGListeners extends BaseTest implements ITestListener // listenrtest2 extended to access the properties rom it (espesially for variable)
{

	@Override
	public void onTestStart(ITestResult result)//will execute when test case will start
	{
		System.out.println("Test case started :"+ result.getName());  // result.getName() --> this will give the name of the test case which is being executed
	}

	@Override
	public void onTestSuccess(ITestResult result)//will execute when test case pass 
	{
		System.out.println("Test case passed :"+ result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result)//will execute when test case fail
	{
		System.out.println("Test case fail :"+ result.getName());
		
		try {
			Screenshot.captureScreenshot(driver, result.getName() ); //trycatch was a auto suggestion here since if file not found program should not be stopped abnormally
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result)//will execute when test case skip
	{
		System.out.println("Test case skipped :"+ result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context)//will be executed before the execution of test case // //will be executed b4 the test tag
	{
		System.out.println("Execution started :"+ context.getName()); // will give the name of particular section
	}

	@Override
	public void onFinish(ITestContext context)//will be executed after the execution of test case //will be executed after the test tag
	{
		System.out.println("Execution finished :"+ context.getName());
	
	
	}
	
	
	
// this method will be applicable to the every test case to which "listeners" is applied in the xml file
}
