package com.surya.automation.base;


import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections.map.HashedMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.surya.automation.customisedexceptions.FrameworkExceptions;
import com.surya.automation.utilities.DriverPaths;
import com.surya.automation.utilities.ScreenshotUtility;

public class Base_Test {
	
  private static WebDriver webDriver;
  private static String curDir;
  private static String tcName;
  private static ExtentReports extentReports;
  private static ExtentTest extentTest;
  /*
   *This method opens the browser based on the parameter
   */
    
	@Parameters({"browser"})
    @BeforeSuite
	public void openBrowser(@Optional("chrome") String browser) {
		curDir=System.getProperty("user.dir");
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty(DriverPaths.chromekey, DriverPaths.chromevalue);
		    webDriver = new ChromeDriver();
		    init();
	
		}
		else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty(DriverPaths.edgekey, DriverPaths.edgevalue);
		    webDriver = new EdgeDriver();
			init();
			
		}
	}
	
	/*
	 * This method closes the browser if driver is not null 
	 */
	@AfterSuite
    public void closeBrowser() {
		
    	if(webDriver != null) {
    		webDriver.close();		
    	}
    	else {
    		System.out.println("DRIVER IS POINTING TO NULL");
    	}
	}
	/*
	 * Tracking which TC is going to be executes
	 */
	@BeforeMethod
	public void beforeTCExecution(Method method) {
		tcName=method.getName();
		System.out.println("Current TC Execution is: "+tcName);
        extentTest = extentReports.startTest(tcName);
        extentTest.log(LogStatus.PASS, "Current execution TC name is "+tcName);
	}
	/*
	 * After executing TC
	 */
	@AfterMethod
	public void afterTCExecution(ITestResult result) throws IOException {
		String tcName = result.getName();
		
		if (result.getStatus() == ITestResult.SUCCESS) {
			System.out.println("TC IS PASSED: "+tcName);
			extentTest.log(LogStatus.PASS, "TC is passed: "+tcName);
			
		}
		else if (result.getStatus() == ITestResult.FAILURE) {
			System.out.println("TC IS FAILED: "+tcName);
			//ScreenshotUtility.takeScreenShot(tcName);
			String imgPath = ScreenshotUtility.takeScreenShot();
			extentTest.addScreenCapture(imgPath);
			System.out.println("SCREENSHOT PATH IS: "+imgPath);
			System.out.println("TC ID FAILED SO TAKING SCREENSHOT FOR: "+tcName);
			extentTest.log(LogStatus.FAIL, "TC is failed: "+tcName);
			extentTest.log(LogStatus.FAIL, result.getThrowable());
		}
		else if (result.getStatus() == ITestResult.SKIP) {
			System.out.println("TC IS SKIPPED: "+tcName);
			//ScreenshotUtility.takeScreenShot(tcName);
			String imgPath = ScreenshotUtility.takeScreenShot();
			extentTest.addScreenCapture(imgPath);
			System.out.println("SCREENSHOT PATH IS: "+imgPath);
			System.out.println("TC ID SKIPPED SO TAKING SCREENSHOT FOR: "+tcName);
			extentTest.log(LogStatus.SKIP, "TC is skipped: "+tcName);
		}
		extentReports.endTest(extentTest);
		extentReports.flush();
	}
	
	
	private void init() {
		webDriver.manage().window().maximize();
		webDriver.manage().deleteAllCookies();
		webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@BeforeTest
	 public void initReports() {
		extentReports =new ExtentReports(curDir+"\\Reports\\report.html");
		Map<String, String> map =new HashedMap();
		map.put("User", "Surya");
		map.put("Ph_NO", "8885547576");
		extentReports.addSystemInfo(map);

	}
	  
	  @AfterTest
      public void generateReports() throws FrameworkExceptions {
		if (extentReports != null) {
			extentReports.close();
		}
		else {
			FrameworkExceptions fwe =new FrameworkExceptions("Extent reports is pointing to null...");
		    throw fwe;
		}

	}
		
		
		
		
	

	
	/*
	 * This is a getter() method to access webdriver outside of the class
	 */
	
    public static WebDriver getWebDriver() {
		return webDriver;
	}
    /*
	 * This is a getter() method to access Current Directory outside of the class
	 */
    public static String getCurDir() {
		return curDir;
	}
    /*
   	 * This is a getter() method to access Test Case outside of the class
   	 */
    public static String getTcName() {
		return tcName;
	}
    /*
   	 * This is a getter() method to access ExtentTest object outside of the class
   	 */
    public static ExtentTest getExtentTest() {
		return extentTest;
	}
    
}
