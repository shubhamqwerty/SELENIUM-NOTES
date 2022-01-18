package extentListeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import testclasses.BaseTest;
import utility.Screenshot;

public class Listeners extends BaseTest implements ITestListener {
	
	
	public static ExtentTest test;
	
	
	ExtentReports extent = ExtentReportGen.extentReportGenerator();// this method will be accessible in the class
	
	@Override
	public void onTestStart(ITestResult result)//will execute when test case will start
	{
		System.out.println("Test case started :"+ result.getName());// result.getName() --> this will give the name of the test case which is being executed
	
	     test = extent.createTest(result.getName());//to generate the entry in the extent report that the tst is started
	
	}

	@Override
	public void onTestSuccess(ITestResult result)//will execute when test case pass 
	{
		System.out.println("Test case passed :"+ result.getName());
		
		test.log(Status.PASS, "TEst case is passed"); //will generate the entry in extent report when test is passed
	}

	@Override
	public void onTestFailure(ITestResult result)//will execute when test case fail
	{
		System.out.println("Test case fail :"+ result.getName());
		
		test.fail(result.getThrowable());     //getThrowable() it is the the super class of exception which will gives us any exception when test case fails
		
		
		try
		{
			test.addScreenCaptureFromPath(Screenshot.captureScreenshot1(driver, result.getName())); //foe every test along with extent we use screenshot method this way
		}
		catch (IOException e) 
		{
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
	
	extent.flush();//to generate report we use flush method
	}
	

}
