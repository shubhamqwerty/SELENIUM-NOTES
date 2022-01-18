package extentListeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
 

// to make the report we make use of "ExtentHtmlReporter" we call this class inthe report to generate the fullflede report containg the test report and the extra information




public class ExtentReportGen {
	
	
	static ExtentReports extent; // made at class evel so that it should get accessible in other classes as well 
	
	
	public static ExtentReports extentReportGenerator() // this method is of return type with "ExtentReports"  since the method is creating the report and savinf the info in it
	{
		String path = System.getProperty("user.dir")+"//reports//zerodhareport.html";// this is path and the name of a folder(zerodhareport.html) in which report will gwt saved//NP NEED TO CREATE THE FOLDER MANUALY EXTENT REPORTER WILL CREATE THE FOLDER BY ITSELF
	
	ExtentHtmlReporter reporter = new ExtentHtmlReporter(path); //on the basis of this reference variable we will decide contents in the reports
	
	reporter.config().setReportName("ZerodhaTestReport"); // setting the name of report
	
	reporter.config().setTheme(Theme.DARK); //setting the theme of the report
	
	 extent = new ExtentReports(); // on the basis of "extent" ref variable we will attach the above setting in the report and will pass some info
	
	extent.attachReporter(reporter); // "atachReporter" method will attch all the configuration to the report
	
	extent.setSystemInfo("Browser name", "Chrome"); // to add information we use "setSysteminfo" method
	
	extent.setSystemInfo("Executed By", "Sept Batch");
	
	extent.setSystemInfo("OS", "Windows 10 ");
	
	return extent; // this will return all the data of "extent" variable data
	
	
	}

}
